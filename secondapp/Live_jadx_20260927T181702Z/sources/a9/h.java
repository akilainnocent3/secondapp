package a9;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements l9.i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f4131c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final String f4132d = "Only bind*() calls are allowed on the RoomRawQuery received statement.";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l9.i f4133b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public a() {
        }
    }

    public h(@oy.l l9.i delegate) {
        kotlin.jvm.internal.m0.p(delegate, "delegate");
        this.f4133b = delegate;
    }

    @Override // l9.i
    public int C0(int i10) {
        throw new IllegalStateException(f4132d);
    }

    @Override // l9.i
    public void H1(@k.e0(from = 1) int i10, boolean z10) {
        this.f4133b.H1(i10, z10);
    }

    @Override // l9.i
    @oy.l
    public String I1(int i10) {
        throw new IllegalStateException(f4132d);
    }

    @Override // l9.i
    public void N0(@k.e0(from = 1) int i10, @oy.l String value) {
        kotlin.jvm.internal.m0.p(value, "value");
        this.f4133b.N0(i10, value);
    }

    @Override // l9.i
    public void S0(@k.e0(from = 1) int i10, int i11) {
        this.f4133b.S0(i10, i11);
    }

    @Override // l9.i, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException(f4132d);
    }

    @Override // l9.i
    public void e(@k.e0(from = 1) int i10, long j10) {
        this.f4133b.e(i10, j10);
    }

    @Override // l9.i
    public void f(@k.e0(from = 1) int i10, @oy.l byte[] value) {
        kotlin.jvm.internal.m0.p(value, "value");
        this.f4133b.f(i10, value);
    }

    @Override // l9.i
    public void g(@k.e0(from = 1) int i10) {
        this.f4133b.g(i10);
    }

    @Override // l9.i
    @oy.l
    public byte[] getBlob(int i10) {
        throw new IllegalStateException(f4132d);
    }

    @Override // l9.i
    public boolean getBoolean(@k.e0(from = 0) int i10) {
        return this.f4133b.getBoolean(i10);
    }

    @Override // l9.i
    public int getColumnCount() {
        throw new IllegalStateException(f4132d);
    }

    @Override // l9.i
    @oy.l
    public String getColumnName(int i10) {
        throw new IllegalStateException(f4132d);
    }

    @Override // l9.i
    @oy.l
    public List<String> getColumnNames() {
        return this.f4133b.getColumnNames();
    }

    @Override // l9.i
    public double getDouble(int i10) {
        throw new IllegalStateException(f4132d);
    }

    @Override // l9.i
    public float getFloat(@k.e0(from = 0) int i10) {
        return this.f4133b.getFloat(i10);
    }

    @Override // l9.i
    public int getInt(@k.e0(from = 0) int i10) {
        return this.f4133b.getInt(i10);
    }

    @Override // l9.i
    public long getLong(int i10) {
        throw new IllegalStateException(f4132d);
    }

    @Override // l9.i
    public boolean isNull(int i10) {
        throw new IllegalStateException(f4132d);
    }

    @Override // l9.i
    public void j(@k.e0(from = 1) int i10, double d10) {
        this.f4133b.j(i10, d10);
    }

    @Override // l9.i
    public void k1(@k.e0(from = 1) int i10, float f10) {
        this.f4133b.k1(i10, f10);
    }

    @Override // l9.i
    public void reset() {
        throw new IllegalStateException(f4132d);
    }

    @Override // l9.i
    public boolean step() {
        throw new IllegalStateException(f4132d);
    }

    @Override // l9.i
    public void x() {
        this.f4133b.x();
    }
}
