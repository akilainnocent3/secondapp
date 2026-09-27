package f6;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.y0({k.y0.a.LIBRARY_GROUP})
public final class c1 implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f83397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f83398c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends j0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w0 f83399b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w0 w0Var, w0 w0Var2) {
            super(w0Var);
            this.f83399b = w0Var2;
        }

        @Override // f6.j0, f6.w0
        public w0.a getSeekPoints(long j10) {
            w0.a seekPoints = this.f83399b.getSeekPoints(j10);
            x0 x0Var = seekPoints.f83658a;
            x0 x0Var2 = new x0(x0Var.f83663a, x0Var.f83664b + c1.this.f83397b);
            x0 x0Var3 = seekPoints.f83659b;
            return new w0.a(x0Var2, new x0(x0Var3.f83663a, x0Var3.f83664b + c1.this.f83397b));
        }
    }

    public c1(long j10, w wVar) {
        this.f83397b = j10;
        this.f83398c = wVar;
    }

    @Override // f6.w
    public void e(w0 w0Var) {
        this.f83398c.e(new a(w0Var, w0Var));
    }

    @Override // f6.w
    public void endTracks() {
        this.f83398c.endTracks();
    }

    @Override // f6.w
    public f1 track(int i10, int i11) {
        return this.f83398c.track(i10, i11);
    }
}
