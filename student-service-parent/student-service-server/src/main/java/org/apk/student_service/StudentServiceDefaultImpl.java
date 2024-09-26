package org.apk.student_service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.apk.student_service_default_version.StudentServiceDefaultVersionGrpc;
import org.apk.student_service_default_version.StudentRequest;
import org.apk.student_service_default_version.StudentResponse;

@GrpcService
public class StudentServiceDefaultImpl extends StudentServiceDefaultVersionGrpc.StudentServiceDefaultVersionImplBase {

    @Override
    public void getStudent(StudentRequest request, StreamObserver<StudentResponse> responseObserver) {
        System.out.println("Obtained student");
        int studentId = request.getId();
        System.out.println("Student ID Request of ID " + studentId);
        StudentResponse response = StudentResponse.newBuilder().setName("Student").setAge(10)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getStudentStream(StudentRequest request, StreamObserver<StudentResponse> responseObserver) {
        System.out.println("Obtained student stream");
        for (int i = 0; i < 1000000; i++) {
            StudentResponse response = StudentResponse.newBuilder().setName("Student").setAge(10)
                    .build();
            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<StudentRequest> sendStudentStream(StreamObserver<StudentResponse> responseObserver) {
        System.out.println("Sending student stream");
        var responseStream = new StreamObserver<StudentRequest>() {
            @Override
            public void onNext(StudentRequest studentRequest) {
                System.out.println("Received request to server");
                StudentResponse response = StudentResponse.newBuilder().setName("Student")
                        .setAge(10).build();
                responseObserver.onNext(response);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error occurred: " + throwable.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed call");
                responseObserver.onCompleted();
            }
        };
        System.out.println("Student stream response sent");
        return responseStream;
    }

    @Override
    public StreamObserver<StudentRequest> sendAndGetStudentStream(StreamObserver<StudentResponse> responseObserver) {
        return new StreamObserver<StudentRequest>() {
            @Override
            public void onNext(StudentRequest studentRequest) {
                System.out.println("Received request to server: " + studentRequest);

                int studentId = studentRequest.getId();

                StudentResponse response = StudentResponse.newBuilder().setName("Student")
                        .setAge(10).build();

                responseObserver.onNext(response);

                System.out.println("Response sent for student ID: " + studentId);
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error occurred: " + throwable.getMessage());
                responseObserver.onError(throwable);
            }

            @Override
            public void onCompleted() {
                System.out.println("Client completed sending requests.");
                responseObserver.onCompleted();
            }
        };
    }
}