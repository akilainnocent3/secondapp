package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nk2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f153065i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f153066j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float[] f153067k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f153068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mk2 f153069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public rz0 f153070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f153071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f153072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f153073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f153074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f153075h;

    public static boolean a(kk2 kk2Var) {
        ik2 ik2Var = kk2Var.f151569a;
        ik2 ik2Var2 = kk2Var.f151570b;
        jk2[] jk2VarArr = ik2Var.f150665a;
        if (jk2VarArr.length == 1 && jk2VarArr[0].f151138a == 0) {
            jk2[] jk2VarArr2 = ik2Var2.f150665a;
            if (jk2VarArr2.length == 1 && jk2VarArr2[0].f151138a == 0) {
                return true;
            }
        }
        return false;
    }
}
