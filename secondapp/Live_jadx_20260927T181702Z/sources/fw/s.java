package fw;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    @cs.g
    public final e0 f85512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f85513b;

    public s(@oy.l e0 writer) {
        kotlin.jvm.internal.m0.p(writer, "writer");
        this.f85512a = writer;
        this.f85513b = true;
    }

    public final boolean a() {
        return this.f85513b;
    }

    public void b() {
        this.f85513b = true;
    }

    public void c() {
        this.f85513b = false;
    }

    public void d() {
        this.f85513b = false;
    }

    public void e(byte b10) {
        this.f85512a.writeLong(b10);
    }

    public final void f(char c10) {
        this.f85512a.a(c10);
    }

    public void g(double d10) {
        this.f85512a.c(String.valueOf(d10));
    }

    public void h(float f10) {
        this.f85512a.c(String.valueOf(f10));
    }

    public void i(int i10) {
        this.f85512a.writeLong(i10);
    }

    public void j(long j10) {
        this.f85512a.writeLong(j10);
    }

    public final void k(@oy.l String v10) {
        kotlin.jvm.internal.m0.p(v10, "v");
        this.f85512a.c(v10);
    }

    public void l(short s10) {
        this.f85512a.writeLong(s10);
    }

    public void m(boolean z10) {
        this.f85512a.c(String.valueOf(z10));
    }

    public void n(@oy.l String value) {
        kotlin.jvm.internal.m0.p(value, "value");
        this.f85512a.b(value);
    }

    public final void o(boolean z10) {
        this.f85513b = z10;
    }

    public void p() {
    }

    public void q() {
    }
}
