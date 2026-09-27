package j0;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class j extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f99338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f99339c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f99341e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f99337a = "KeyAttributes";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f99340d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b[] f99342f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f99343g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float[] f99344h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f99345i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f99346j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f99347k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float[] f99348l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float[] f99349m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float[] f99350n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float[] f99351o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float[] f99352p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float[] f99353q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float[] f99354r = null;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        SPLINE,
        LINEAR
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b {
        VISIBLE,
        INVISIBLE,
        GONE
    }

    public j(int i10, String... strArr) {
        this.f99341e = null;
        this.f99338b = strArr;
        int[] iArr = new int[i10];
        this.f99341e = iArr;
        float length = 100.0f / (iArr.length + 1);
        int i11 = 0;
        while (true) {
            int[] iArr2 = this.f99341e;
            if (i11 >= iArr2.length) {
                return;
            }
            iArr2[i11] = (int) ((i11 * length) + length);
            i11++;
        }
    }

    public void A(float... fArr) {
        this.f99348l = fArr;
    }

    public void B(float... fArr) {
        this.f99344h = fArr;
    }

    public void C(float... fArr) {
        this.f99345i = fArr;
    }

    public void D(float... fArr) {
        this.f99346j = fArr;
    }

    public void E(float[] fArr) {
        this.f99350n = fArr;
    }

    public void F(float[] fArr) {
        this.f99351o = fArr;
    }

    public void G(String[] strArr) {
        this.f99338b = strArr;
    }

    public void H(String str) {
        this.f99339c = str;
    }

    public void I(float... fArr) {
        this.f99349m = fArr;
    }

    public void J(float[] fArr) {
        this.f99352p = fArr;
    }

    public void K(float[] fArr) {
        this.f99353q = fArr;
    }

    public void L(float[] fArr) {
        this.f99354r = fArr;
    }

    public void M(b... bVarArr) {
        this.f99342f = bVarArr;
    }

    public void g(StringBuilder sb2) {
        e(sb2, "target", this.f99338b);
        sb2.append("frame:");
        sb2.append(Arrays.toString(this.f99341e));
        sb2.append(",\n");
        c(sb2, "easing", this.f99339c);
        if (this.f99340d != null) {
            sb2.append("fit:'");
            sb2.append(this.f99340d);
            sb2.append("',\n");
        }
        if (this.f99342f != null) {
            sb2.append("visibility:'");
            sb2.append(Arrays.toString(this.f99342f));
            sb2.append("',\n");
        }
        d(sb2, "alpha", this.f99343g);
        d(sb2, "rotationX", this.f99345i);
        d(sb2, "rotationY", this.f99346j);
        d(sb2, "rotationZ", this.f99344h);
        d(sb2, "pivotX", this.f99347k);
        d(sb2, "pivotY", this.f99348l);
        d(sb2, "pathRotate", this.f99349m);
        d(sb2, "scaleX", this.f99350n);
        d(sb2, "scaleY", this.f99351o);
        d(sb2, "translationX", this.f99352p);
        d(sb2, "translationY", this.f99353q);
        d(sb2, "translationZ", this.f99354r);
    }

    public float[] h() {
        return this.f99343g;
    }

    public a i() {
        return this.f99340d;
    }

    public float[] j() {
        return this.f99347k;
    }

    public float[] k() {
        return this.f99348l;
    }

    public float[] l() {
        return this.f99344h;
    }

    public float[] m() {
        return this.f99345i;
    }

    public float[] n() {
        return this.f99346j;
    }

    public float[] o() {
        return this.f99350n;
    }

    public float[] p() {
        return this.f99351o;
    }

    public String[] q() {
        return this.f99338b;
    }

    public String r() {
        return this.f99339c;
    }

    public float[] s() {
        return this.f99349m;
    }

    public float[] t() {
        return this.f99352p;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f99337a);
        sb2.append(":{\n");
        g(sb2);
        sb2.append("},\n");
        return sb2.toString();
    }

    public float[] u() {
        return this.f99353q;
    }

    public float[] v() {
        return this.f99354r;
    }

    public b[] w() {
        return this.f99342f;
    }

    public void x(float... fArr) {
        this.f99343g = fArr;
    }

    public void y(a aVar) {
        this.f99340d = aVar;
    }

    public void z(float... fArr) {
        this.f99347k = fArr;
    }
}
