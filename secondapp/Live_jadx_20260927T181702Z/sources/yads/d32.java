package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d32 implements w63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f148040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e32 f148041b;

    public d32(e32 e32Var, long j10) {
        this.f148041b = e32Var;
        this.f148040a = j10;
    }

    @Override // yads.w63
    public final void a(long j10, long j11) {
        tj2 tj2Var = this.f148041b.f148483d;
        if (tj2Var != null) {
            long j12 = this.f148040a;
            tj2Var.a(j12, j12 - j10);
        }
    }
}
