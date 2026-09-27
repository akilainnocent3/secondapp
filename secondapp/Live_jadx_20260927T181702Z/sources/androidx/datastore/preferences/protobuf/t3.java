package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public interface t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f10235a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10236b = 0;

    @Deprecated
    <T> T a(w3<T> schema, v0 extensionRegistry) throws IOException;

    <T> T b(Class<T> clazz, v0 extensionRegistry) throws IOException;

    @Deprecated
    <T> void c(List<T> target, Class<T> targetType, v0 extensionRegistry) throws IOException;

    <T> T d(w3<T> schema, v0 extensionRegistry) throws IOException;

    <T> void e(T target, w3<T> schema, v0 extensionRegistry) throws IOException;

    <T> void f(List<T> target, w3<T> schema, v0 extensionRegistry) throws IOException;

    @Deprecated
    <T> T g(Class<T> clazz, v0 extensionRegistry) throws IOException;

    int getFieldNumber() throws IOException;

    int getTag();

    <T> void h(List<T> target, Class<T> targetType, v0 extensionRegistry) throws IOException;

    <K, V> void i(Map<K, V> target, o2.b<K, V> mapDefaultEntry, v0 extensionRegistry) throws IOException;

    <T> void j(T target, w3<T> schema, v0 extensionRegistry) throws IOException;

    @Deprecated
    <T> void k(List<T> target, w3<T> targetType, v0 extensionRegistry) throws IOException;

    boolean readBool() throws IOException;

    void readBoolList(List<Boolean> target) throws IOException;

    u readBytes() throws IOException;

    void readBytesList(List<u> target) throws IOException;

    double readDouble() throws IOException;

    void readDoubleList(List<Double> target) throws IOException;

    int readEnum() throws IOException;

    void readEnumList(List<Integer> target) throws IOException;

    int readFixed32() throws IOException;

    void readFixed32List(List<Integer> target) throws IOException;

    long readFixed64() throws IOException;

    void readFixed64List(List<Long> target) throws IOException;

    float readFloat() throws IOException;

    void readFloatList(List<Float> target) throws IOException;

    int readInt32() throws IOException;

    void readInt32List(List<Integer> target) throws IOException;

    long readInt64() throws IOException;

    void readInt64List(List<Long> target) throws IOException;

    int readSFixed32() throws IOException;

    void readSFixed32List(List<Integer> target) throws IOException;

    long readSFixed64() throws IOException;

    void readSFixed64List(List<Long> target) throws IOException;

    int readSInt32() throws IOException;

    void readSInt32List(List<Integer> target) throws IOException;

    long readSInt64() throws IOException;

    void readSInt64List(List<Long> target) throws IOException;

    String readString() throws IOException;

    void readStringList(List<String> target) throws IOException;

    void readStringListRequireUtf8(List<String> target) throws IOException;

    String readStringRequireUtf8() throws IOException;

    int readUInt32() throws IOException;

    void readUInt32List(List<Integer> target) throws IOException;

    long readUInt64() throws IOException;

    void readUInt64List(List<Long> target) throws IOException;

    boolean shouldDiscardUnknownFields();

    boolean skipField() throws IOException;
}
