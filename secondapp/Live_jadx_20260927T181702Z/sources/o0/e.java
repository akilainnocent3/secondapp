package o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class e extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f118584i;

    public e(char[] cArr) {
        super(cArr);
        this.f118584i = Float.NaN;
    }

    public static c A(char[] cArr) {
        return new e(cArr);
    }

    public boolean B() {
        float fL = l();
        return ((float) ((int) fL)) == fL;
    }

    public void C(float f10) {
        this.f118584i = f10;
    }

    @Override // o0.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            float fL = l();
            float fL2 = ((e) obj).l();
            if ((Float.isNaN(fL) && Float.isNaN(fL2)) || fL == fL2) {
                return true;
            }
        }
        return false;
    }

    @Override // o0.c
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f10 = this.f118584i;
        return iHashCode + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }

    @Override // o0.c
    public float l() {
        if (Float.isNaN(this.f118584i) && q()) {
            this.f118584i = Float.parseFloat(f());
        }
        return this.f118584i;
    }

    @Override // o0.c
    public int m() {
        if (Float.isNaN(this.f118584i) && q()) {
            this.f118584i = Integer.parseInt(f());
        }
        return (int) this.f118584i;
    }

    @Override // o0.c
    public String y(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        a(sb2, i10);
        float fL = l();
        int i12 = (int) fL;
        if (i12 == fL) {
            sb2.append(i12);
        } else {
            sb2.append(fL);
        }
        return sb2.toString();
    }

    @Override // o0.c
    public String z() {
        float fL = l();
        int i10 = (int) fL;
        if (i10 == fL) {
            return "" + i10;
        }
        return "" + fL;
    }

    public e(float f10) {
        super(null);
        this.f118584i = f10;
    }
}
