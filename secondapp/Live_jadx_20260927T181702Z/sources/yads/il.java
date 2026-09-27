package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class il extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f150667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f150668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0 f150669d;

    public il(int i10, mx0 mx0Var, boolean z10) {
        super(mg2.a("AudioTrack write failed: ", i10));
        this.f150668c = z10;
        this.f150667b = i10;
        this.f150669d = mx0Var;
    }
}
