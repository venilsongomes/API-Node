package com.example.grpc.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Define o serviço "Calculator"
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: calculadora.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalculatorGrpc {

  private CalculatorGrpc() {}

  public static final String SERVICE_NAME = "calculator.Calculator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.grpc.calculator.CalcRequest,
      com.example.grpc.calculator.CalcResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Add",
      requestType = com.example.grpc.calculator.CalcRequest.class,
      responseType = com.example.grpc.calculator.CalcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.calculator.CalcRequest,
      com.example.grpc.calculator.CalcResponse> getAddMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.calculator.CalcRequest, com.example.grpc.calculator.CalcResponse> getAddMethod;
    if ((getAddMethod = CalculatorGrpc.getAddMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getAddMethod = CalculatorGrpc.getAddMethod) == null) {
          CalculatorGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.calculator.CalcRequest, com.example.grpc.calculator.CalcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.calculator.CalcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.calculator.CalcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("Add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.calculator.CalcRequest,
      com.example.grpc.calculator.CalcResponse> getSubtractMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subtract",
      requestType = com.example.grpc.calculator.CalcRequest.class,
      responseType = com.example.grpc.calculator.CalcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.calculator.CalcRequest,
      com.example.grpc.calculator.CalcResponse> getSubtractMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.calculator.CalcRequest, com.example.grpc.calculator.CalcResponse> getSubtractMethod;
    if ((getSubtractMethod = CalculatorGrpc.getSubtractMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getSubtractMethod = CalculatorGrpc.getSubtractMethod) == null) {
          CalculatorGrpc.getSubtractMethod = getSubtractMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.calculator.CalcRequest, com.example.grpc.calculator.CalcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Subtract"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.calculator.CalcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.calculator.CalcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("Subtract"))
              .build();
        }
      }
    }
    return getSubtractMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.calculator.CalcRequest,
      com.example.grpc.calculator.CalcResponse> getMultiplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Multiply",
      requestType = com.example.grpc.calculator.CalcRequest.class,
      responseType = com.example.grpc.calculator.CalcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.calculator.CalcRequest,
      com.example.grpc.calculator.CalcResponse> getMultiplyMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.calculator.CalcRequest, com.example.grpc.calculator.CalcResponse> getMultiplyMethod;
    if ((getMultiplyMethod = CalculatorGrpc.getMultiplyMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getMultiplyMethod = CalculatorGrpc.getMultiplyMethod) == null) {
          CalculatorGrpc.getMultiplyMethod = getMultiplyMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.calculator.CalcRequest, com.example.grpc.calculator.CalcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Multiply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.calculator.CalcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.calculator.CalcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("Multiply"))
              .build();
        }
      }
    }
    return getMultiplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.calculator.CalcRequest,
      com.example.grpc.calculator.CalcResponse> getDivideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Divide",
      requestType = com.example.grpc.calculator.CalcRequest.class,
      responseType = com.example.grpc.calculator.CalcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.calculator.CalcRequest,
      com.example.grpc.calculator.CalcResponse> getDivideMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.calculator.CalcRequest, com.example.grpc.calculator.CalcResponse> getDivideMethod;
    if ((getDivideMethod = CalculatorGrpc.getDivideMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getDivideMethod = CalculatorGrpc.getDivideMethod) == null) {
          CalculatorGrpc.getDivideMethod = getDivideMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.calculator.CalcRequest, com.example.grpc.calculator.CalcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Divide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.calculator.CalcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.calculator.CalcResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("Divide"))
              .build();
        }
      }
    }
    return getDivideMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorStub>() {
        @java.lang.Override
        public CalculatorStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorStub(channel, callOptions);
        }
      };
    return CalculatorStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorBlockingStub>() {
        @java.lang.Override
        public CalculatorBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorBlockingStub(channel, callOptions);
        }
      };
    return CalculatorBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorFutureStub>() {
        @java.lang.Override
        public CalculatorFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorFutureStub(channel, callOptions);
        }
      };
    return CalculatorFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Define o serviço "Calculator"
   * </pre>
   */
  public static abstract class CalculatorImplBase implements io.grpc.BindableService {

    /**
     */
    public void add(com.example.grpc.calculator.CalcRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.calculator.CalcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    /**
     */
    public void subtract(com.example.grpc.calculator.CalcRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.calculator.CalcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubtractMethod(), responseObserver);
    }

    /**
     */
    public void multiply(com.example.grpc.calculator.CalcRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.calculator.CalcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiplyMethod(), responseObserver);
    }

    /**
     */
    public void divide(com.example.grpc.calculator.CalcRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.calculator.CalcResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDivideMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.calculator.CalcRequest,
                com.example.grpc.calculator.CalcResponse>(
                  this, METHODID_ADD)))
          .addMethod(
            getSubtractMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.calculator.CalcRequest,
                com.example.grpc.calculator.CalcResponse>(
                  this, METHODID_SUBTRACT)))
          .addMethod(
            getMultiplyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.calculator.CalcRequest,
                com.example.grpc.calculator.CalcResponse>(
                  this, METHODID_MULTIPLY)))
          .addMethod(
            getDivideMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.calculator.CalcRequest,
                com.example.grpc.calculator.CalcResponse>(
                  this, METHODID_DIVIDE)))
          .build();
    }
  }

  /**
   * <pre>
   * Define o serviço "Calculator"
   * </pre>
   */
  public static final class CalculatorStub extends io.grpc.stub.AbstractAsyncStub<CalculatorStub> {
    private CalculatorStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorStub(channel, callOptions);
    }

    /**
     */
    public void add(com.example.grpc.calculator.CalcRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.calculator.CalcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subtract(com.example.grpc.calculator.CalcRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.calculator.CalcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubtractMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multiply(com.example.grpc.calculator.CalcRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.calculator.CalcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void divide(com.example.grpc.calculator.CalcRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.calculator.CalcResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Define o serviço "Calculator"
   * </pre>
   */
  public static final class CalculatorBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculatorBlockingStub> {
    private CalculatorBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.calculator.CalcResponse add(com.example.grpc.calculator.CalcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.calculator.CalcResponse subtract(com.example.grpc.calculator.CalcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubtractMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.calculator.CalcResponse multiply(com.example.grpc.calculator.CalcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.calculator.CalcResponse divide(com.example.grpc.calculator.CalcRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDivideMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Define o serviço "Calculator"
   * </pre>
   */
  public static final class CalculatorFutureStub extends io.grpc.stub.AbstractFutureStub<CalculatorFutureStub> {
    private CalculatorFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.calculator.CalcResponse> add(
        com.example.grpc.calculator.CalcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.calculator.CalcResponse> subtract(
        com.example.grpc.calculator.CalcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubtractMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.calculator.CalcResponse> multiply(
        com.example.grpc.calculator.CalcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.calculator.CalcResponse> divide(
        com.example.grpc.calculator.CalcRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD = 0;
  private static final int METHODID_SUBTRACT = 1;
  private static final int METHODID_MULTIPLY = 2;
  private static final int METHODID_DIVIDE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD:
          serviceImpl.add((com.example.grpc.calculator.CalcRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.calculator.CalcResponse>) responseObserver);
          break;
        case METHODID_SUBTRACT:
          serviceImpl.subtract((com.example.grpc.calculator.CalcRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.calculator.CalcResponse>) responseObserver);
          break;
        case METHODID_MULTIPLY:
          serviceImpl.multiply((com.example.grpc.calculator.CalcRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.calculator.CalcResponse>) responseObserver);
          break;
        case METHODID_DIVIDE:
          serviceImpl.divide((com.example.grpc.calculator.CalcRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.calculator.CalcResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.calculator.CalculatorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Calculator");
    }
  }

  private static final class CalculatorFileDescriptorSupplier
      extends CalculatorBaseDescriptorSupplier {
    CalculatorFileDescriptorSupplier() {}
  }

  private static final class CalculatorMethodDescriptorSupplier
      extends CalculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorMethodDescriptorSupplier(String methodName) {
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
      synchronized (CalculatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorFileDescriptorSupplier())
              .addMethod(getAddMethod())
              .addMethod(getSubtractMethod())
              .addMethod(getMultiplyMethod())
              .addMethod(getDivideMethod())
              .build();
        }
      }
    }
    return result;
  }
}
