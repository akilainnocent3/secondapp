package yads;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gc0 implements ew {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f149515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cw f149516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z30 f149517c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f149518d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lw f149519e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wb2 f149520f;

    public gc0(View view, cw cwVar, z30 z30Var, long j10, lw lwVar, wb2 wb2Var) {
        this.f149515a = view;
        this.f149516b = cwVar;
        this.f149517c = z30Var;
        this.f149518d = j10;
        this.f149519e = lwVar;
        this.f149520f = wb2Var;
        cwVar.a(d());
    }

    @Override // yads.ew
    public final void a() {
        ((zb2) this.f149520f).d();
    }

    @Override // yads.ew
    public final void b() {
        ((zb2) this.f149520f).b();
    }

    @Override // yads.ew
    public final void c() {
        fc0 fc0Var = new fc0(this.f149515a, this.f149516b, this.f149517c);
        long jMax = (long) Math.max(0.0d, this.f149518d - this.f149519e.f152173a);
        if (jMax == 0) {
            this.f149516b.b(this.f149515a);
            return;
        }
        zb2 zb2Var = (zb2) this.f149520f;
        zb2Var.f158721e = this.f149519e;
        zb2Var.a(jMax, fc0Var);
        this.f149517c.a(y30.f158112d);
    }

    public final View d() {
        return this.f149515a;
    }

    @Override // yads.ew
    public final void invalidate() {
        ((zb2) this.f149520f).a();
    }
}
