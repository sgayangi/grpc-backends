package org.apk.v1.student_service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: student.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StudentServiceGrpc {

  private StudentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.apk.v1.student_service.StudentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apk.v1.student_service.StudentRequest,
      org.apk.v1.student_service.StudentResponse> getGetStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudent",
      requestType = org.apk.v1.student_service.StudentRequest.class,
      responseType = org.apk.v1.student_service.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apk.v1.student_service.StudentRequest,
      org.apk.v1.student_service.StudentResponse> getGetStudentMethod() {
    io.grpc.MethodDescriptor<org.apk.v1.student_service.StudentRequest, org.apk.v1.student_service.StudentResponse> getGetStudentMethod;
    if ((getGetStudentMethod = StudentServiceGrpc.getGetStudentMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentMethod = StudentServiceGrpc.getGetStudentMethod) == null) {
          StudentServiceGrpc.getGetStudentMethod = getGetStudentMethod =
              io.grpc.MethodDescriptor.<org.apk.v1.student_service.StudentRequest, org.apk.v1.student_service.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.v1.student_service.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.v1.student_service.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudent"))
              .build();
        }
      }
    }
    return getGetStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apk.v1.student_service.StudentRequest,
      org.apk.v1.student_service.StudentResponse> getGetStudentStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentStream",
      requestType = org.apk.v1.student_service.StudentRequest.class,
      responseType = org.apk.v1.student_service.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.apk.v1.student_service.StudentRequest,
      org.apk.v1.student_service.StudentResponse> getGetStudentStreamMethod() {
    io.grpc.MethodDescriptor<org.apk.v1.student_service.StudentRequest, org.apk.v1.student_service.StudentResponse> getGetStudentStreamMethod;
    if ((getGetStudentStreamMethod = StudentServiceGrpc.getGetStudentStreamMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentStreamMethod = StudentServiceGrpc.getGetStudentStreamMethod) == null) {
          StudentServiceGrpc.getGetStudentStreamMethod = getGetStudentStreamMethod =
              io.grpc.MethodDescriptor.<org.apk.v1.student_service.StudentRequest, org.apk.v1.student_service.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudentStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.v1.student_service.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.v1.student_service.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudentStream"))
              .build();
        }
      }
    }
    return getGetStudentStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apk.v1.student_service.StudentRequest,
      org.apk.v1.student_service.StudentResponse> getSendStudentStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendStudentStream",
      requestType = org.apk.v1.student_service.StudentRequest.class,
      responseType = org.apk.v1.student_service.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.apk.v1.student_service.StudentRequest,
      org.apk.v1.student_service.StudentResponse> getSendStudentStreamMethod() {
    io.grpc.MethodDescriptor<org.apk.v1.student_service.StudentRequest, org.apk.v1.student_service.StudentResponse> getSendStudentStreamMethod;
    if ((getSendStudentStreamMethod = StudentServiceGrpc.getSendStudentStreamMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getSendStudentStreamMethod = StudentServiceGrpc.getSendStudentStreamMethod) == null) {
          StudentServiceGrpc.getSendStudentStreamMethod = getSendStudentStreamMethod =
              io.grpc.MethodDescriptor.<org.apk.v1.student_service.StudentRequest, org.apk.v1.student_service.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendStudentStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.v1.student_service.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.v1.student_service.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("SendStudentStream"))
              .build();
        }
      }
    }
    return getSendStudentStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apk.v1.student_service.StudentRequest,
      org.apk.v1.student_service.StudentResponse> getSendAndGetStudentStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendAndGetStudentStream",
      requestType = org.apk.v1.student_service.StudentRequest.class,
      responseType = org.apk.v1.student_service.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.apk.v1.student_service.StudentRequest,
      org.apk.v1.student_service.StudentResponse> getSendAndGetStudentStreamMethod() {
    io.grpc.MethodDescriptor<org.apk.v1.student_service.StudentRequest, org.apk.v1.student_service.StudentResponse> getSendAndGetStudentStreamMethod;
    if ((getSendAndGetStudentStreamMethod = StudentServiceGrpc.getSendAndGetStudentStreamMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getSendAndGetStudentStreamMethod = StudentServiceGrpc.getSendAndGetStudentStreamMethod) == null) {
          StudentServiceGrpc.getSendAndGetStudentStreamMethod = getSendAndGetStudentStreamMethod =
              io.grpc.MethodDescriptor.<org.apk.v1.student_service.StudentRequest, org.apk.v1.student_service.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendAndGetStudentStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.v1.student_service.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.v1.student_service.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("SendAndGetStudentStream"))
              .build();
        }
      }
    }
    return getSendAndGetStudentStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceStub>() {
        @java.lang.Override
        public StudentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceStub(channel, callOptions);
        }
      };
    return StudentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceBlockingStub>() {
        @java.lang.Override
        public StudentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceBlockingStub(channel, callOptions);
        }
      };
    return StudentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceFutureStub>() {
        @java.lang.Override
        public StudentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceFutureStub(channel, callOptions);
        }
      };
    return StudentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getStudent(org.apk.v1.student_service.StudentRequest request,
        io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentMethod(), responseObserver);
    }

    /**
     */
    default void getStudentStream(org.apk.v1.student_service.StudentRequest request,
        io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentStreamMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentRequest> sendStudentStream(
        io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendStudentStreamMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentRequest> sendAndGetStudentStream(
        io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendAndGetStudentStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StudentService.
   */
  public static abstract class StudentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StudentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StudentService.
   */
  public static final class StudentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StudentServiceStub> {
    private StudentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStudent(org.apk.v1.student_service.StudentRequest request,
        io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentStream(org.apk.v1.student_service.StudentRequest request,
        io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetStudentStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentRequest> sendStudentStream(
        io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSendStudentStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentRequest> sendAndGetStudentStream(
        io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSendAndGetStudentStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StudentService.
   */
  public static final class StudentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apk.v1.student_service.StudentResponse getStudent(org.apk.v1.student_service.StudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.apk.v1.student_service.StudentResponse> getStudentStream(
        org.apk.v1.student_service.StudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetStudentStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StudentService.
   */
  public static final class StudentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apk.v1.student_service.StudentResponse> getStudent(
        org.apk.v1.student_service.StudentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STUDENT = 0;
  private static final int METHODID_GET_STUDENT_STREAM = 1;
  private static final int METHODID_SEND_STUDENT_STREAM = 2;
  private static final int METHODID_SEND_AND_GET_STUDENT_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STUDENT:
          serviceImpl.getStudent((org.apk.v1.student_service.StudentRequest) request,
              (io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENT_STREAM:
          serviceImpl.getStudentStream((org.apk.v1.student_service.StudentRequest) request,
              (io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_STUDENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendStudentStream(
              (io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentResponse>) responseObserver);
        case METHODID_SEND_AND_GET_STUDENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendAndGetStudentStream(
              (io.grpc.stub.StreamObserver<org.apk.v1.student_service.StudentResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetStudentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.apk.v1.student_service.StudentRequest,
              org.apk.v1.student_service.StudentResponse>(
                service, METHODID_GET_STUDENT)))
        .addMethod(
          getGetStudentStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.apk.v1.student_service.StudentRequest,
              org.apk.v1.student_service.StudentResponse>(
                service, METHODID_GET_STUDENT_STREAM)))
        .addMethod(
          getSendStudentStreamMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              org.apk.v1.student_service.StudentRequest,
              org.apk.v1.student_service.StudentResponse>(
                service, METHODID_SEND_STUDENT_STREAM)))
        .addMethod(
          getSendAndGetStudentStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.apk.v1.student_service.StudentRequest,
              org.apk.v1.student_service.StudentResponse>(
                service, METHODID_SEND_AND_GET_STUDENT_STREAM)))
        .build();
  }

  private static abstract class StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apk.v1.student_service.Student.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentService");
    }
  }

  private static final class StudentServiceFileDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier {
    StudentServiceFileDescriptorSupplier() {}
  }

  private static final class StudentServiceMethodDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StudentServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceFileDescriptorSupplier())
              .addMethod(getGetStudentMethod())
              .addMethod(getGetStudentStreamMethod())
              .addMethod(getSendStudentStreamMethod())
              .addMethod(getSendAndGetStudentStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
