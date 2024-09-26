package org.apk.student_service_default_version;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: student_default_version.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StudentServiceDefaultVersionGrpc {

  private StudentServiceDefaultVersionGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.apk.student_service_default_version.StudentServiceDefaultVersion";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apk.student_service_default_version.StudentRequest,
      org.apk.student_service_default_version.StudentResponse> getGetStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudent",
      requestType = org.apk.student_service_default_version.StudentRequest.class,
      responseType = org.apk.student_service_default_version.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apk.student_service_default_version.StudentRequest,
      org.apk.student_service_default_version.StudentResponse> getGetStudentMethod() {
    io.grpc.MethodDescriptor<org.apk.student_service_default_version.StudentRequest, org.apk.student_service_default_version.StudentResponse> getGetStudentMethod;
    if ((getGetStudentMethod = StudentServiceDefaultVersionGrpc.getGetStudentMethod) == null) {
      synchronized (StudentServiceDefaultVersionGrpc.class) {
        if ((getGetStudentMethod = StudentServiceDefaultVersionGrpc.getGetStudentMethod) == null) {
          StudentServiceDefaultVersionGrpc.getGetStudentMethod = getGetStudentMethod =
              io.grpc.MethodDescriptor.<org.apk.student_service_default_version.StudentRequest, org.apk.student_service_default_version.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.student_service_default_version.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.student_service_default_version.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceDefaultVersionMethodDescriptorSupplier("GetStudent"))
              .build();
        }
      }
    }
    return getGetStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apk.student_service_default_version.StudentRequest,
      org.apk.student_service_default_version.StudentResponse> getGetStudentStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentStream",
      requestType = org.apk.student_service_default_version.StudentRequest.class,
      responseType = org.apk.student_service_default_version.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.apk.student_service_default_version.StudentRequest,
      org.apk.student_service_default_version.StudentResponse> getGetStudentStreamMethod() {
    io.grpc.MethodDescriptor<org.apk.student_service_default_version.StudentRequest, org.apk.student_service_default_version.StudentResponse> getGetStudentStreamMethod;
    if ((getGetStudentStreamMethod = StudentServiceDefaultVersionGrpc.getGetStudentStreamMethod) == null) {
      synchronized (StudentServiceDefaultVersionGrpc.class) {
        if ((getGetStudentStreamMethod = StudentServiceDefaultVersionGrpc.getGetStudentStreamMethod) == null) {
          StudentServiceDefaultVersionGrpc.getGetStudentStreamMethod = getGetStudentStreamMethod =
              io.grpc.MethodDescriptor.<org.apk.student_service_default_version.StudentRequest, org.apk.student_service_default_version.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStudentStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.student_service_default_version.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.student_service_default_version.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceDefaultVersionMethodDescriptorSupplier("GetStudentStream"))
              .build();
        }
      }
    }
    return getGetStudentStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apk.student_service_default_version.StudentRequest,
      org.apk.student_service_default_version.StudentResponse> getSendStudentStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendStudentStream",
      requestType = org.apk.student_service_default_version.StudentRequest.class,
      responseType = org.apk.student_service_default_version.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.apk.student_service_default_version.StudentRequest,
      org.apk.student_service_default_version.StudentResponse> getSendStudentStreamMethod() {
    io.grpc.MethodDescriptor<org.apk.student_service_default_version.StudentRequest, org.apk.student_service_default_version.StudentResponse> getSendStudentStreamMethod;
    if ((getSendStudentStreamMethod = StudentServiceDefaultVersionGrpc.getSendStudentStreamMethod) == null) {
      synchronized (StudentServiceDefaultVersionGrpc.class) {
        if ((getSendStudentStreamMethod = StudentServiceDefaultVersionGrpc.getSendStudentStreamMethod) == null) {
          StudentServiceDefaultVersionGrpc.getSendStudentStreamMethod = getSendStudentStreamMethod =
              io.grpc.MethodDescriptor.<org.apk.student_service_default_version.StudentRequest, org.apk.student_service_default_version.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendStudentStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.student_service_default_version.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.student_service_default_version.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceDefaultVersionMethodDescriptorSupplier("SendStudentStream"))
              .build();
        }
      }
    }
    return getSendStudentStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apk.student_service_default_version.StudentRequest,
      org.apk.student_service_default_version.StudentResponse> getSendAndGetStudentStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendAndGetStudentStream",
      requestType = org.apk.student_service_default_version.StudentRequest.class,
      responseType = org.apk.student_service_default_version.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<org.apk.student_service_default_version.StudentRequest,
      org.apk.student_service_default_version.StudentResponse> getSendAndGetStudentStreamMethod() {
    io.grpc.MethodDescriptor<org.apk.student_service_default_version.StudentRequest, org.apk.student_service_default_version.StudentResponse> getSendAndGetStudentStreamMethod;
    if ((getSendAndGetStudentStreamMethod = StudentServiceDefaultVersionGrpc.getSendAndGetStudentStreamMethod) == null) {
      synchronized (StudentServiceDefaultVersionGrpc.class) {
        if ((getSendAndGetStudentStreamMethod = StudentServiceDefaultVersionGrpc.getSendAndGetStudentStreamMethod) == null) {
          StudentServiceDefaultVersionGrpc.getSendAndGetStudentStreamMethod = getSendAndGetStudentStreamMethod =
              io.grpc.MethodDescriptor.<org.apk.student_service_default_version.StudentRequest, org.apk.student_service_default_version.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendAndGetStudentStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.student_service_default_version.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apk.student_service_default_version.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StudentServiceDefaultVersionMethodDescriptorSupplier("SendAndGetStudentStream"))
              .build();
        }
      }
    }
    return getSendAndGetStudentStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceDefaultVersionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceDefaultVersionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceDefaultVersionStub>() {
        @java.lang.Override
        public StudentServiceDefaultVersionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceDefaultVersionStub(channel, callOptions);
        }
      };
    return StudentServiceDefaultVersionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceDefaultVersionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceDefaultVersionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceDefaultVersionBlockingStub>() {
        @java.lang.Override
        public StudentServiceDefaultVersionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceDefaultVersionBlockingStub(channel, callOptions);
        }
      };
    return StudentServiceDefaultVersionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceDefaultVersionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StudentServiceDefaultVersionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StudentServiceDefaultVersionFutureStub>() {
        @java.lang.Override
        public StudentServiceDefaultVersionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StudentServiceDefaultVersionFutureStub(channel, callOptions);
        }
      };
    return StudentServiceDefaultVersionFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getStudent(org.apk.student_service_default_version.StudentRequest request,
        io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentMethod(), responseObserver);
    }

    /**
     */
    default void getStudentStream(org.apk.student_service_default_version.StudentRequest request,
        io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentStreamMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentRequest> sendStudentStream(
        io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendStudentStreamMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentRequest> sendAndGetStudentStream(
        io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSendAndGetStudentStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StudentServiceDefaultVersion.
   */
  public static abstract class StudentServiceDefaultVersionImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StudentServiceDefaultVersionGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StudentServiceDefaultVersion.
   */
  public static final class StudentServiceDefaultVersionStub
      extends io.grpc.stub.AbstractAsyncStub<StudentServiceDefaultVersionStub> {
    private StudentServiceDefaultVersionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceDefaultVersionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceDefaultVersionStub(channel, callOptions);
    }

    /**
     */
    public void getStudent(org.apk.student_service_default_version.StudentRequest request,
        io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudentStream(org.apk.student_service_default_version.StudentRequest request,
        io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetStudentStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentRequest> sendStudentStream(
        io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSendStudentStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentRequest> sendAndGetStudentStream(
        io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSendAndGetStudentStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StudentServiceDefaultVersion.
   */
  public static final class StudentServiceDefaultVersionBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StudentServiceDefaultVersionBlockingStub> {
    private StudentServiceDefaultVersionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceDefaultVersionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceDefaultVersionBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apk.student_service_default_version.StudentResponse getStudent(org.apk.student_service_default_version.StudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.apk.student_service_default_version.StudentResponse> getStudentStream(
        org.apk.student_service_default_version.StudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetStudentStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StudentServiceDefaultVersion.
   */
  public static final class StudentServiceDefaultVersionFutureStub
      extends io.grpc.stub.AbstractFutureStub<StudentServiceDefaultVersionFutureStub> {
    private StudentServiceDefaultVersionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceDefaultVersionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StudentServiceDefaultVersionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apk.student_service_default_version.StudentResponse> getStudent(
        org.apk.student_service_default_version.StudentRequest request) {
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
          serviceImpl.getStudent((org.apk.student_service_default_version.StudentRequest) request,
              (io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENT_STREAM:
          serviceImpl.getStudentStream((org.apk.student_service_default_version.StudentRequest) request,
              (io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentResponse>) responseObserver);
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
              (io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentResponse>) responseObserver);
        case METHODID_SEND_AND_GET_STUDENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendAndGetStudentStream(
              (io.grpc.stub.StreamObserver<org.apk.student_service_default_version.StudentResponse>) responseObserver);
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
              org.apk.student_service_default_version.StudentRequest,
              org.apk.student_service_default_version.StudentResponse>(
                service, METHODID_GET_STUDENT)))
        .addMethod(
          getGetStudentStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              org.apk.student_service_default_version.StudentRequest,
              org.apk.student_service_default_version.StudentResponse>(
                service, METHODID_GET_STUDENT_STREAM)))
        .addMethod(
          getSendStudentStreamMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              org.apk.student_service_default_version.StudentRequest,
              org.apk.student_service_default_version.StudentResponse>(
                service, METHODID_SEND_STUDENT_STREAM)))
        .addMethod(
          getSendAndGetStudentStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              org.apk.student_service_default_version.StudentRequest,
              org.apk.student_service_default_version.StudentResponse>(
                service, METHODID_SEND_AND_GET_STUDENT_STREAM)))
        .build();
  }

  private static abstract class StudentServiceDefaultVersionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceDefaultVersionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apk.student_service_default_version.StudentDefaultVersion.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentServiceDefaultVersion");
    }
  }

  private static final class StudentServiceDefaultVersionFileDescriptorSupplier
      extends StudentServiceDefaultVersionBaseDescriptorSupplier {
    StudentServiceDefaultVersionFileDescriptorSupplier() {}
  }

  private static final class StudentServiceDefaultVersionMethodDescriptorSupplier
      extends StudentServiceDefaultVersionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StudentServiceDefaultVersionMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (StudentServiceDefaultVersionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceDefaultVersionFileDescriptorSupplier())
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
