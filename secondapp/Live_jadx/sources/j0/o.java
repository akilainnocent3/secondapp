package j0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f99398a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f99401d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f99399b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f99400c = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f99402e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f99403f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f99404g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f99405h = null;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public o(int i10, String... strArr) {
        this.f99401d = null;
        this.f99398a = strArr;
        int[] iArr = new int[i10];
        this.f99401d = iArr;
        float length = 100.0f / (iArr.length + 1);
        int i11 = 0;
        while (true) {
            int[] iArr2 = this.f99401d;
            if (i11 >= iArr2.length) {
                return;
            }
            iArr2[i11] = (int) ((i11 * length) + length);
            i11++;
        }
    }

    public int[] g() {
        return this.f99401d;
    }

    public float[] h() {
        return this.f99403f;
    }

    public float[] i() {
        return this.f99402e;
    }

    public float[] j() {
        return this.f99404g;
    }

    public float[] k() {
        return this.f99405h;
    }

    public a l() {
        return this.f99400c;
    }

    public String[] m() {
        return this.f99398a;
    }

    public String n() {
        return this.f99399b;
    }

    public void o(int... iArr) {
        this.f99401d = iArr;
    }

    public void p(float... fArr) {
        this.f99403f = fArr;
    }

    public void q(float... fArr) {
        this.f99402e = fArr;
    }

    public void r(float... fArr) {
        this.f99404g = fArr;
    }

    public void s(float... fArr) {
        this.f99405h = fArr;
    }

    public void t(a aVar) {
        this.f99400c = aVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPositions:{\n");
        e(sb2, "target", this.f99398a);
        sb2.append("frame:");
        sb2.append(Arrays.toString(this.f99401d));
        sb2.append(",\n");
        if (this.f99400c != null) {
            sb2.append("type:'");
            sb2.append(this.f99400c);
            sb2.append("',\n");
        }
        c(sb2, "easing", this.f99399b);
        d(sb2, "percentX", this.f99404g);
        d(sb2, "percentX", this.f99405h);
        d(sb2, "percentWidth", this.f99402e);
        d(sb2, "percentHeight", this.f99403f);
        sb2.append("},\n");
        return sb2.toString();
    }

    public void u(String str) {
        this.f99399b = str;
    }
}
