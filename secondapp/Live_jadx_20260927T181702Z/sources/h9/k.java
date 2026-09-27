package h9;

import fr.m1;
import java.util.List;
import java.util.Map;
import k.e0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nStatementUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatementUtil.kt\nandroidx/room/util/MappedColumnsSQLiteStatementWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n1#2:113\n13537#3,3:114\n*S KotlinDebug\n*F\n+ 1 StatementUtil.kt\nandroidx/room/util/MappedColumnsSQLiteStatementWrapper\n*L\n99#1:114,3\n*E\n"})
public final class k implements l9.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final l9.i f88021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final String[] f88022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public final int[] f88023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public final Map<String, Integer> f88024e;

    public k(@oy.l l9.i delegate, @oy.l String[] columnNames, @oy.l int[] mapping) {
        m0.p(delegate, "delegate");
        m0.p(columnNames, "columnNames");
        m0.p(mapping, "mapping");
        this.f88021b = delegate;
        this.f88022c = columnNames;
        this.f88023d = mapping;
        if (columnNames.length != mapping.length) {
            throw new IllegalArgumentException("Expected columnNames.size == mapping.size");
        }
        Map mapG = m1.g();
        int length = columnNames.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            mapG.put(columnNames[i10], Integer.valueOf(this.f88023d[i11]));
            i10++;
            i11++;
        }
        int columnCount = getColumnCount();
        for (int i12 = 0; i12 < columnCount; i12++) {
            if (!mapG.containsKey(getColumnName(i12))) {
                mapG.put(getColumnName(i12), Integer.valueOf(i12));
            }
        }
        this.f88024e = m1.d(mapG);
    }

    @Override // l9.i
    public int C0(@e0(from = 0) int i10) {
        return this.f88021b.C0(i10);
    }

    @Override // l9.i
    public void H1(@e0(from = 1) int i10, boolean z10) {
        this.f88021b.H1(i10, z10);
    }

    @Override // l9.i
    @oy.l
    public String I1(@e0(from = 0) int i10) {
        return this.f88021b.I1(i10);
    }

    @Override // l9.i
    public void N0(@e0(from = 1) int i10, @oy.l String value) {
        m0.p(value, "value");
        this.f88021b.N0(i10, value);
    }

    @Override // l9.i
    public void S0(@e0(from = 1) int i10, int i11) {
        this.f88021b.S0(i10, i11);
    }

    @Override // l9.i, java.lang.AutoCloseable
    public void close() {
        this.f88021b.close();
    }

    @Override // l9.i
    public void e(@e0(from = 1) int i10, long j10) {
        this.f88021b.e(i10, j10);
    }

    @Override // l9.i
    public void f(@e0(from = 1) int i10, @oy.l byte[] value) {
        m0.p(value, "value");
        this.f88021b.f(i10, value);
    }

    @Override // l9.i
    public void g(@e0(from = 1) int i10) {
        this.f88021b.g(i10);
    }

    @Override // l9.i
    @oy.l
    public byte[] getBlob(@e0(from = 0) int i10) {
        return this.f88021b.getBlob(i10);
    }

    @Override // l9.i
    public boolean getBoolean(@e0(from = 0) int i10) {
        return this.f88021b.getBoolean(i10);
    }

    @Override // l9.i
    public int getColumnCount() {
        return this.f88021b.getColumnCount();
    }

    public final int getColumnIndex(@oy.l String name) {
        m0.p(name, "name");
        Integer num = this.f88024e.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // l9.i
    @oy.l
    public String getColumnName(@e0(from = 0) int i10) {
        return this.f88021b.getColumnName(i10);
    }

    @Override // l9.i
    @oy.l
    public List<String> getColumnNames() {
        return this.f88021b.getColumnNames();
    }

    @Override // l9.i
    public double getDouble(@e0(from = 0) int i10) {
        return this.f88021b.getDouble(i10);
    }

    @Override // l9.i
    public float getFloat(@e0(from = 0) int i10) {
        return this.f88021b.getFloat(i10);
    }

    @Override // l9.i
    public int getInt(@e0(from = 0) int i10) {
        return this.f88021b.getInt(i10);
    }

    @Override // l9.i
    public long getLong(@e0(from = 0) int i10) {
        return this.f88021b.getLong(i10);
    }

    @Override // l9.i
    public boolean isNull(@e0(from = 0) int i10) {
        return this.f88021b.isNull(i10);
    }

    @Override // l9.i
    public void j(@e0(from = 1) int i10, double d10) {
        this.f88021b.j(i10, d10);
    }

    @Override // l9.i
    public void k1(@e0(from = 1) int i10, float f10) {
        this.f88021b.k1(i10, f10);
    }

    @Override // l9.i
    public void reset() {
        this.f88021b.reset();
    }

    @Override // l9.i
    public boolean step() {
        return this.f88021b.step();
    }

    @Override // l9.i
    public void x() {
        this.f88021b.x();
    }
}
