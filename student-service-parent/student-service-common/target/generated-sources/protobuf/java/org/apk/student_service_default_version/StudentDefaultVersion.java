// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: student_default_version.proto

package org.apk.student_service_default_version;

public final class StudentDefaultVersion {
  private StudentDefaultVersion() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apk_student_service_default_version_StudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apk_student_service_default_version_StudentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_apk_student_service_default_version_StudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_apk_student_service_default_version_StudentResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035student_default_version.proto\022\'org.apk" +
      ".student_service_default_version\"\034\n\016Stud" +
      "entRequest\022\n\n\002id\030\003 \001(\005\",\n\017StudentRespons" +
      "e\022\014\n\004name\030\001 \001(\t\022\013\n\003age\030\002 \001(\0052\320\004\n\034Student" +
      "ServiceDefaultVersion\022\201\001\n\nGetStudent\0227.o" +
      "rg.apk.student_service_default_version.S" +
      "tudentRequest\0328.org.apk.student_service_" +
      "default_version.StudentResponse\"\000\022\211\001\n\020Ge" +
      "tStudentStream\0227.org.apk.student_service" +
      "_default_version.StudentRequest\0328.org.ap" +
      "k.student_service_default_version.Studen" +
      "tResponse\"\0000\001\022\212\001\n\021SendStudentStream\0227.or" +
      "g.apk.student_service_default_version.St" +
      "udentRequest\0328.org.apk.student_service_d" +
      "efault_version.StudentResponse\"\000(\001\022\222\001\n\027S" +
      "endAndGetStudentStream\0227.org.apk.student" +
      "_service_default_version.StudentRequest\032" +
      "8.org.apk.student_service_default_versio" +
      "n.StudentResponse\"\000(\0010\001B+\n\'org.apk.stude" +
      "nt_service_default_versionP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_apk_student_service_default_version_StudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_apk_student_service_default_version_StudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apk_student_service_default_version_StudentRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_org_apk_student_service_default_version_StudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_apk_student_service_default_version_StudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_apk_student_service_default_version_StudentResponse_descriptor,
        new java.lang.String[] { "Name", "Age", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
