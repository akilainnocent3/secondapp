package n0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f115578g = "VelocityMatrix";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f115579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f115580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f115581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f115582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f115583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f115584f;

    public void a(float f10, float f11, int i10, int i11, float[] fArr) {
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = (f10 - 0.5f) * 2.0f;
        float f15 = (f11 - 0.5f) * 2.0f;
        float f16 = f12 + this.f115581c;
        float f17 = f13 + this.f115582d;
        float f18 = f16 + (this.f115579a * f14);
        float f19 = f17 + (this.f115580b * f15);
        float radians = (float) Math.toRadians(this.f115584f);
        float radians2 = (float) Math.toRadians(this.f115583e);
        double d10 = radians;
        double d11 = i11 * f15;
        float fSin = f18 + (((float) ((((double) ((-i10) * f14)) * Math.sin(d10)) - (Math.cos(d10) * d11))) * radians2);
        float fCos = f19 + (radians2 * ((float) ((((double) (i10 * f14)) * Math.cos(d10)) - (d11 * Math.sin(d10)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void b() {
        this.f115583e = 0.0f;
        this.f115582d = 0.0f;
        this.f115581c = 0.0f;
        this.f115580b = 0.0f;
        this.f115579a = 0.0f;
    }

    public void c(h hVar, float f10) {
        if (hVar != null) {
            this.f115583e = hVar.c(f10);
        }
    }

    public void d(o oVar, float f10) {
        if (oVar != null) {
            this.f115583e = oVar.c(f10);
            this.f115584f = oVar.a(f10);
        }
    }

    public void e(h hVar, h hVar2, float f10) {
        if (hVar != null) {
            this.f115579a = hVar.c(f10);
        }
        if (hVar2 != null) {
            this.f115580b = hVar2.c(f10);
        }
    }

    public void f(o oVar, o oVar2, float f10) {
        if (oVar != null) {
            this.f115579a = oVar.c(f10);
        }
        if (oVar2 != null) {
            this.f115580b = oVar2.c(f10);
        }
    }

    public void g(h hVar, h hVar2, float f10) {
        if (hVar != null) {
            this.f115581c = hVar.c(f10);
        }
        if (hVar2 != null) {
            this.f115582d = hVar2.c(f10);
        }
    }

    public void h(o oVar, o oVar2, float f10) {
        if (oVar != null) {
            this.f115581c = oVar.c(f10);
        }
        if (oVar2 != null) {
            this.f115582d = oVar2.c(f10);
        }
    }
}
