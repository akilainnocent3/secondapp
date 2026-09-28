package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface hq60 extends AutoCloseable {
    boolean D1();

    void L(int i, String str);

    default boolean T0() {
        return getLong(0) != 0;
    }

    int getColumnCount();

    String getColumnName(int i);

    default List<String> getColumnNames() {
        int columnCount = getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(getColumnName(i));
        }
        return arrayList;
    }

    double getDouble(int i);

    default float getFloat(int i) {
        return (float) getDouble(i);
    }

    default int getInt(int i) {
        return (int) getLong(i);
    }

    long getLong(int i);

    void i(int i, double d);

    boolean isNull(int i);

    String k1(int i);

    void q(int i, long j);

    void r(int i);

    void reset();
}
