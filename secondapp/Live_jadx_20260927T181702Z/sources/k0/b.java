package k0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f101487g = "TransitionLayout";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f101488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f101489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f101490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f101491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f101492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f101493f;

    public b(b bVar) {
        this.f101490c = Integer.MIN_VALUE;
        this.f101491d = Float.NaN;
        this.f101492e = null;
        this.f101488a = bVar.f101488a;
        this.f101489b = bVar.f101489b;
        this.f101490c = bVar.f101490c;
        this.f101491d = bVar.f101491d;
        this.f101492e = bVar.f101492e;
        this.f101493f = bVar.f101493f;
    }

    public static int b(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static String c(int i10) {
        String str = "00000000" + Integer.toHexString(i10);
        return "#" + str.substring(str.length() - 8);
    }

    public static int p(float f10, float f11, float f12) {
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

    public static int s(float f10, float f11, float f12, float f13) {
        int iB = b((int) (f10 * 255.0f));
        int iB2 = b((int) (f11 * 255.0f));
        return (iB << 16) | (b((int) (f13 * 255.0f)) << 24) | (iB2 << 8) | b((int) (f12 * 255.0f));
    }

    public void a(f fVar) {
        int i10 = this.f101489b;
        switch (i10) {
            case 900:
            case 902:
            case 906:
                fVar.J(this.f101488a, i10, this.f101490c);
                break;
            case 901:
            case 905:
                fVar.I(this.f101488a, i10, this.f101491d);
                break;
            case 903:
                fVar.K(this.f101488a, i10, this.f101492e);
                break;
            case 904:
                fVar.L(this.f101488a, i10, this.f101493f);
                break;
        }
    }

    public b d() {
        return new b(this);
    }

    public boolean e(b bVar) {
        int i10;
        if (bVar != null && (i10 = this.f101489b) == bVar.f101489b) {
            switch (i10) {
                case 900:
                case 906:
                    if (this.f101490c == bVar.f101490c) {
                        return true;
                    }
                    break;
                case 901:
                    return this.f101491d == bVar.f101491d;
                case 902:
                    return this.f101490c == bVar.f101490c;
                case 903:
                    return this.f101490c == bVar.f101490c;
                case 904:
                    return this.f101493f == bVar.f101493f;
                case 905:
                    return this.f101491d == bVar.f101491d;
                default:
                    return false;
            }
        }
        return false;
    }

    public boolean f() {
        return this.f101493f;
    }

    public int g() {
        return this.f101490c;
    }

    public float h() {
        return this.f101491d;
    }

    public int i() {
        return this.f101490c;
    }

    public int j(float[] fArr) {
        return (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public String k() {
        return this.f101488a;
    }

    public String l() {
        return this.f101492e;
    }

    public int m() {
        return this.f101489b;
    }

    public float n() {
        switch (this.f101489b) {
            case 900:
                return this.f101490c;
            case 901:
                return this.f101491d;
            case 902:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                return this.f101493f ? 1.0f : 0.0f;
            case 905:
                return this.f101491d;
            default:
                return Float.NaN;
        }
    }

    public void o(float[] fArr) {
        switch (this.f101489b) {
            case 900:
                fArr[0] = this.f101490c;
                return;
            case 901:
                fArr[0] = this.f101491d;
                return;
            case 902:
                int i10 = this.f101490c;
                int i11 = (i10 >> 24) & 255;
                float fPow = (float) Math.pow(((i10 >> 16) & 255) / 255.0f, 2.2d);
                float fPow2 = (float) Math.pow(((i10 >> 8) & 255) / 255.0f, 2.2d);
                float fPow3 = (float) Math.pow((i10 & 255) / 255.0f, 2.2d);
                fArr[0] = fPow;
                fArr[1] = fPow2;
                fArr[2] = fPow3;
                fArr[3] = i11 / 255.0f;
                return;
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                fArr[0] = this.f101493f ? 1.0f : 0.0f;
                return;
            case 905:
                fArr[0] = this.f101491d;
                return;
            default:
                return;
        }
    }

    public boolean q() {
        int i10 = this.f101489b;
        return (i10 == 903 || i10 == 904 || i10 == 906) ? false : true;
    }

    public int r() {
        return this.f101489b != 902 ? 1 : 4;
    }

    public void t(boolean z10) {
        this.f101493f = z10;
    }

    public String toString() {
        String str = this.f101488a + ':';
        switch (this.f101489b) {
            case 900:
                return str + this.f101490c;
            case 901:
                return str + this.f101491d;
            case 902:
                return str + c(this.f101490c);
            case 903:
                return str + this.f101492e;
            case 904:
                return str + Boolean.valueOf(this.f101493f);
            case 905:
                return str + this.f101491d;
            default:
                return str + "????";
        }
    }

    public void u(float f10) {
        this.f101491d = f10;
    }

    public void v(int i10) {
        this.f101490c = i10;
    }

    public void w(f fVar, float[] fArr) {
        int i10 = this.f101489b;
        switch (i10) {
            case 900:
                fVar.J(this.f101488a, i10, (int) fArr[0]);
                return;
            case 901:
            case 905:
                fVar.I(this.f101488a, i10, fArr[0]);
                return;
            case 902:
                fVar.J(this.f101488a, this.f101489b, (b((int) (fArr[3] * 255.0f)) << 24) | (b((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (b((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | b((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f)));
                return;
            case 903:
            case 906:
                throw new RuntimeException("unable to interpolate " + this.f101488a);
            case 904:
                fVar.L(this.f101488a, i10, fArr[0] > 0.5f);
                return;
            default:
                return;
        }
    }

    public void x(String str) {
        this.f101492e = str;
    }

    public void y(Object obj) {
        switch (this.f101489b) {
            case 900:
            case 906:
                this.f101490c = ((Integer) obj).intValue();
                break;
            case 901:
                this.f101491d = ((Float) obj).floatValue();
                break;
            case 902:
                this.f101490c = ((Integer) obj).intValue();
                break;
            case 903:
                this.f101492e = (String) obj;
                break;
            case 904:
                this.f101493f = ((Boolean) obj).booleanValue();
                break;
            case 905:
                this.f101491d = ((Float) obj).floatValue();
                break;
        }
    }

    public void z(float[] fArr) {
        switch (this.f101489b) {
            case 900:
            case 906:
                this.f101490c = (int) fArr[0];
                return;
            case 901:
            case 905:
                this.f101491d = fArr[0];
                return;
            case 902:
                this.f101490c = ((Math.round(fArr[3] * 255.0f) & 255) << 24) | ((Math.round(((float) Math.pow(fArr[0], 0.5d)) * 255.0f) & 255) << 16) | ((Math.round(((float) Math.pow(fArr[1], 0.5d)) * 255.0f) & 255) << 8) | (Math.round(((float) Math.pow(fArr[2], 0.5d)) * 255.0f) & 255);
                return;
            case 903:
                throw new RuntimeException("Cannot interpolate String");
            case 904:
                this.f101493f = ((double) fArr[0]) > 0.5d;
                return;
            default:
                return;
        }
    }

    public b(String str, int i10, String str2) {
        this.f101490c = Integer.MIN_VALUE;
        this.f101491d = Float.NaN;
        this.f101488a = str;
        this.f101489b = i10;
        this.f101492e = str2;
    }

    public b(String str, int i10, int i11) {
        this.f101490c = Integer.MIN_VALUE;
        this.f101491d = Float.NaN;
        this.f101492e = null;
        this.f101488a = str;
        this.f101489b = i10;
        if (i10 == 901) {
            this.f101491d = i11;
        } else {
            this.f101490c = i11;
        }
    }

    public b(String str, int i10, float f10) {
        this.f101490c = Integer.MIN_VALUE;
        this.f101492e = null;
        this.f101488a = str;
        this.f101489b = i10;
        this.f101491d = f10;
    }

    public b(String str, int i10, boolean z10) {
        this.f101490c = Integer.MIN_VALUE;
        this.f101491d = Float.NaN;
        this.f101492e = null;
        this.f101488a = str;
        this.f101489b = i10;
        this.f101493f = z10;
    }

    public b(String str, int i10) {
        this.f101490c = Integer.MIN_VALUE;
        this.f101491d = Float.NaN;
        this.f101492e = null;
        this.f101488a = str;
        this.f101489b = i10;
    }

    public b(String str, int i10, Object obj) {
        this.f101490c = Integer.MIN_VALUE;
        this.f101491d = Float.NaN;
        this.f101492e = null;
        this.f101488a = str;
        this.f101489b = i10;
        y(obj);
    }

    public b(b bVar, Object obj) {
        this.f101490c = Integer.MIN_VALUE;
        this.f101491d = Float.NaN;
        this.f101492e = null;
        this.f101488a = bVar.f101488a;
        this.f101489b = bVar.f101489b;
        y(obj);
    }
}
