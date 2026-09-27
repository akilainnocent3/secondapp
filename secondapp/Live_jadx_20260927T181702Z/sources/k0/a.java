package k0;

import f2.z1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f101469i = "TransitionLayout";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f101470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f101471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC0958a f101472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f101473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f101474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f101475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f101476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f101477h;

    /* JADX INFO: renamed from: k0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum EnumC0958a {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public a(String str, EnumC0958a enumC0958a) {
        this.f101470a = false;
        this.f101471b = str;
        this.f101472c = enumC0958a;
    }

    public static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static int f(float f10, float f11, float f12) {
        float f13 = f10 * 6.0f;
        int i10 = (int) f13;
        float f14 = f13 - i10;
        float f15 = f12 * 255.0f;
        int i11 = (int) (((1.0f - f11) * f15) + 0.5f);
        int i12 = (int) (((1.0f - (f14 * f11)) * f15) + 0.5f);
        int i13 = (int) (((1.0f - ((1.0f - f14) * f11)) * f15) + 0.5f);
        int i14 = (int) (f15 + 0.5f);
        if (i10 == 0) {
            return ((i14 << 16) + (i13 << 8) + i11) | (-16777216);
        }
        if (i10 == 1) {
            return ((i12 << 16) + (i14 << 8) + i11) | (-16777216);
        }
        if (i10 == 2) {
            return ((i11 << 16) + (i14 << 8) + i13) | (-16777216);
        }
        if (i10 == 3) {
            return ((i11 << 16) + (i12 << 8) + i14) | (-16777216);
        }
        if (i10 == 4) {
            return ((i13 << 16) + (i11 << 8) + i14) | (-16777216);
        }
        if (i10 != 5) {
            return 0;
        }
        return ((i14 << 16) + (i11 << 8) + i12) | (-16777216);
    }

    public boolean b(a aVar) {
        EnumC0958a enumC0958a;
        if (aVar != null && (enumC0958a = this.f101472c) == aVar.f101472c) {
            switch (enumC0958a) {
                case INT_TYPE:
                case REFERENCE_TYPE:
                    if (this.f101473d == aVar.f101473d) {
                        return true;
                    }
                    break;
                case FLOAT_TYPE:
                    return this.f101474e == aVar.f101474e;
                case COLOR_TYPE:
                case COLOR_DRAWABLE_TYPE:
                    return this.f101477h == aVar.f101477h;
                case STRING_TYPE:
                    return this.f101473d == aVar.f101473d;
                case BOOLEAN_TYPE:
                    return this.f101476g == aVar.f101476g;
                case DIMENSION_TYPE:
                    return this.f101474e == aVar.f101474e;
                default:
                    return false;
            }
        }
        return false;
    }

    public EnumC0958a c() {
        return this.f101472c;
    }

    public float d() {
        switch (this.f101472c) {
            case INT_TYPE:
                return this.f101473d;
            case FLOAT_TYPE:
                return this.f101474e;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case STRING_TYPE:
                throw new RuntimeException("Cannot interpolate String");
            case BOOLEAN_TYPE:
                return this.f101476g ? 1.0f : 0.0f;
            case DIMENSION_TYPE:
                return this.f101474e;
            default:
                return Float.NaN;
        }
    }

    public void e(float[] fArr) {
        switch (this.f101472c) {
            case INT_TYPE:
                fArr[0] = this.f101473d;
                return;
            case FLOAT_TYPE:
                fArr[0] = this.f101474e;
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int i10 = this.f101477h;
                int i11 = (i10 >> 24) & 255;
                float fPow = (float) Math.pow(((i10 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i10 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i10 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                fArr[0] = this.f101476g ? 1.0f : 0.0f;
                return;
            case DIMENSION_TYPE:
                fArr[0] = this.f101474e;
                return;
            default:
                return;
        }
    }

    public boolean g() {
        int iOrdinal = this.f101472c.ordinal();
        return (iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 7) ? false : true;
    }

    public int h() {
        int iOrdinal = this.f101472c.ordinal();
        return (iOrdinal == 2 || iOrdinal == 3) ? 4 : 1;
    }

    public void i(int i10) {
        this.f101477h = i10;
    }

    public void j(float f10) {
        this.f101474e = f10;
    }

    public void k(int i10) {
        this.f101473d = i10;
    }

    public void l(String str) {
        this.f101475f = str;
    }

    public void m(Object obj) {
        switch (this.f101472c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f101473d = ((Integer) obj).intValue();
                break;
            case FLOAT_TYPE:
                this.f101474e = ((Float) obj).floatValue();
                break;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                this.f101477h = ((Integer) obj).intValue();
                break;
            case STRING_TYPE:
                this.f101475f = (String) obj;
                break;
            case BOOLEAN_TYPE:
                this.f101476g = ((Boolean) obj).booleanValue();
                break;
            case DIMENSION_TYPE:
                this.f101474e = ((Float) obj).floatValue();
                break;
        }
    }

    public void n(float[] fArr) {
        switch (this.f101472c) {
            case INT_TYPE:
            case REFERENCE_TYPE:
                this.f101473d = (int) fArr[0];
                return;
            case FLOAT_TYPE:
                this.f101474e = fArr[0];
                return;
            case COLOR_TYPE:
            case COLOR_DRAWABLE_TYPE:
                int iF = f(fArr[0], fArr[1], fArr[2]);
                this.f101477h = iF;
                this.f101477h = (a((int) (fArr[3] * 255.0f)) << 24) | (iF & z1.f82662x);
                return;
            case STRING_TYPE:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case BOOLEAN_TYPE:
                this.f101476g = ((double) fArr[0]) > 0.5d;
                return;
            case DIMENSION_TYPE:
                this.f101474e = fArr[0];
                return;
            default:
                return;
        }
    }

    public a(String str, EnumC0958a enumC0958a, Object obj, boolean z10) {
        this.f101471b = str;
        this.f101472c = enumC0958a;
        this.f101470a = z10;
        m(obj);
    }

    public a(a aVar, Object obj) {
        this.f101470a = false;
        this.f101471b = aVar.f101471b;
        this.f101472c = aVar.f101472c;
        m(obj);
    }
}
