package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y
public interface h5 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        ASCENDING,
        DESCENDING
    }

    void a(int fieldNumber, u value) throws IOException;

    void b(int fieldNumber, Object value, w3 schema) throws IOException;

    <K, V> void c(int fieldNumber, o2.b<K, V> metadata, Map<K, V> map) throws IOException;

    @Deprecated
    void d(int fieldNumber, List<?> value, w3 schema) throws IOException;

    @Deprecated
    void e(int fieldNumber, Object value, w3 schema) throws IOException;

    void f(int fieldNumber, List<?> value, w3 schema) throws IOException;

    a fieldOrder();

    void writeBool(int fieldNumber, boolean value) throws IOException;

    void writeBoolList(int fieldNumber, List<Boolean> value, boolean packed) throws IOException;

    void writeBytesList(int fieldNumber, List<u> value) throws IOException;

    void writeDouble(int fieldNumber, double value) throws IOException;

    void writeDoubleList(int fieldNumber, List<Double> value, boolean packed) throws IOException;

    @Deprecated
    void writeEndGroup(int fieldNumber) throws IOException;

    void writeEnum(int fieldNumber, int value) throws IOException;

    void writeEnumList(int fieldNumber, List<Integer> value, boolean packed) throws IOException;

    void writeFixed32(int fieldNumber, int value) throws IOException;

    void writeFixed32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException;

    void writeFixed64(int fieldNumber, long value) throws IOException;

    void writeFixed64List(int fieldNumber, List<Long> value, boolean packed) throws IOException;

    void writeFloat(int fieldNumber, float value) throws IOException;

    void writeFloatList(int fieldNumber, List<Float> value, boolean packed) throws IOException;

    @Deprecated
    void writeGroup(int fieldNumber, Object value) throws IOException;

    @Deprecated
    void writeGroupList(int fieldNumber, List<?> value) throws IOException;

    void writeInt32(int fieldNumber, int value) throws IOException;

    void writeInt32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException;

    void writeInt64(int fieldNumber, long value) throws IOException;

    void writeInt64List(int fieldNumber, List<Long> value, boolean packed) throws IOException;

    void writeMessage(int fieldNumber, Object value) throws IOException;

    void writeMessageList(int fieldNumber, List<?> value) throws IOException;

    void writeMessageSetItem(int fieldNumber, Object value) throws IOException;

    void writeSFixed32(int fieldNumber, int value) throws IOException;

    void writeSFixed32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException;

    void writeSFixed64(int fieldNumber, long value) throws IOException;

    void writeSFixed64List(int fieldNumber, List<Long> value, boolean packed) throws IOException;

    void writeSInt32(int fieldNumber, int value) throws IOException;

    void writeSInt32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException;

    void writeSInt64(int fieldNumber, long value) throws IOException;

    void writeSInt64List(int fieldNumber, List<Long> value, boolean packed) throws IOException;

    @Deprecated
    void writeStartGroup(int fieldNumber) throws IOException;

    void writeString(int fieldNumber, String value) throws IOException;

    void writeStringList(int fieldNumber, List<String> value) throws IOException;

    void writeUInt32(int fieldNumber, int value) throws IOException;

    void writeUInt32List(int fieldNumber, List<Integer> value, boolean packed) throws IOException;

    void writeUInt64(int fieldNumber, long value) throws IOException;

    void writeUInt64List(int fieldNumber, List<Long> value, boolean packed) throws IOException;
}
