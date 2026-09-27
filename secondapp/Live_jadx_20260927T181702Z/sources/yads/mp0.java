package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h73 f152596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f152597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f152598c;

    public mp0(int i10, h73 h73Var, int[] iArr) {
        if (iArr.length == 0) {
            ih1.a("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f152596a = h73Var;
        this.f152597b = iArr;
        this.f152598c = i10;
    }
}
