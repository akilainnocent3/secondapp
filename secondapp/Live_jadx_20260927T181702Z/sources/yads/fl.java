package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fl extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f149147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f149148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mx0 f149149d;

    public fl(int i10, int i11, int i12, int i13, mx0 mx0Var, boolean z10, RuntimeException runtimeException) {
        StringBuilder sb2 = new StringBuilder("AudioTrack init failed ");
        sb2.append(i10);
        sb2.append(" Config(");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(i13);
        sb2.append(gi.j.f86771d);
        sb2.append(z10 ? " (recoverable)" : "");
        super(sb2.toString(), runtimeException);
        this.f149147b = i10;
        this.f149148c = z10;
        this.f149149d = mx0Var;
    }
}
