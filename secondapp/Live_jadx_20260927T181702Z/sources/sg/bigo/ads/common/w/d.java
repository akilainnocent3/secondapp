package sg.bigo.ads.common.w;

/* JADX INFO: loaded from: classes7.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final d f133714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final float[] f133715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float[] f133716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float[] f133717d = {0.24f, 0.52f, 0.24f};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f133718e = true;

    static {
        d dVar = new d();
        f133714a = dVar;
        float[] fArr = dVar.f133716c;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
        float[] fArr2 = dVar.f133715b;
        fArr2[0] = 0.35f;
        fArr2[1] = 1.0f;
    }

    public d() {
        float[] fArr = new float[3];
        this.f133715b = fArr;
        float[] fArr2 = new float[3];
        this.f133716c = fArr2;
        a(fArr);
        a(fArr2);
    }

    private static void a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }
}
