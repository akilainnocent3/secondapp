package yads;

import android.text.Layout;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class v93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f156855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f156856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f156857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f156858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f156859e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f156865k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f156866l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f156869o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f156870p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v53 f156872r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f156860f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f156861g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f156862h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f156863i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f156864j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f156867m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f156868n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f156871q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f156873s = Float.MAX_VALUE;

    public final v93 a(v93 v93Var) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (v93Var != null) {
            if (!this.f156857c && v93Var.f156857c) {
                this.f156856b = v93Var.f156856b;
                this.f156857c = true;
            }
            if (this.f156862h == -1) {
                this.f156862h = v93Var.f156862h;
            }
            if (this.f156863i == -1) {
                this.f156863i = v93Var.f156863i;
            }
            if (this.f156855a == null && (str = v93Var.f156855a) != null) {
                this.f156855a = str;
            }
            if (this.f156860f == -1) {
                this.f156860f = v93Var.f156860f;
            }
            if (this.f156861g == -1) {
                this.f156861g = v93Var.f156861g;
            }
            if (this.f156868n == -1) {
                this.f156868n = v93Var.f156868n;
            }
            if (this.f156869o == null && (alignment2 = v93Var.f156869o) != null) {
                this.f156869o = alignment2;
            }
            if (this.f156870p == null && (alignment = v93Var.f156870p) != null) {
                this.f156870p = alignment;
            }
            if (this.f156871q == -1) {
                this.f156871q = v93Var.f156871q;
            }
            if (this.f156864j == -1) {
                this.f156864j = v93Var.f156864j;
                this.f156865k = v93Var.f156865k;
            }
            if (this.f156872r == null) {
                this.f156872r = v93Var.f156872r;
            }
            if (this.f156873s == Float.MAX_VALUE) {
                this.f156873s = v93Var.f156873s;
            }
            if (!this.f156859e && v93Var.f156859e) {
                this.f156858d = v93Var.f156858d;
                this.f156859e = true;
            }
            if (this.f156867m == -1 && (i10 = v93Var.f156867m) != -1) {
                this.f156867m = i10;
            }
        }
        return this;
    }
}
