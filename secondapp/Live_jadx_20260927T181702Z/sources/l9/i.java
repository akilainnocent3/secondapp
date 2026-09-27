package l9;

import java.util.List;
import k.e0;
import kotlin.jvm.internal.s1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nSQLiteStatement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SQLiteStatement.kt\nandroidx/sqlite/SQLiteStatement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
public interface i extends AutoCloseable {
    int C0(@e0(from = 0) int i10);

    void H1(@e0(from = 1) int i10, boolean z10);

    @l
    String I1(@e0(from = 0) int i10);

    void N0(@e0(from = 1) int i10, @l String str);

    void S0(@e0(from = 1) int i10, int i11);

    @Override // java.lang.AutoCloseable
    void close();

    void e(@e0(from = 1) int i10, long j10);

    void f(@e0(from = 1) int i10, @l byte[] bArr);

    void g(@e0(from = 1) int i10);

    @l
    byte[] getBlob(@e0(from = 0) int i10);

    boolean getBoolean(@e0(from = 0) int i10);

    int getColumnCount();

    @l
    String getColumnName(@e0(from = 0) int i10);

    @l
    List<String> getColumnNames();

    double getDouble(@e0(from = 0) int i10);

    float getFloat(@e0(from = 0) int i10);

    int getInt(@e0(from = 0) int i10);

    long getLong(@e0(from = 0) int i10);

    boolean isNull(@e0(from = 0) int i10);

    void j(@e0(from = 1) int i10, double d10);

    void k1(@e0(from = 1) int i10, float f10);

    void reset();

    boolean step();

    void x();
}
