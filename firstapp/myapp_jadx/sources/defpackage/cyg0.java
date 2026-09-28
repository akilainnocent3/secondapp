package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
public final class cyg0 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public iff0 r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(cyg0 cyg0Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (cyg0Var != null) {
            if (!this.c && cyg0Var.c) {
                this.b = cyg0Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = cyg0Var.h;
            }
            if (this.i == -1) {
                this.i = cyg0Var.i;
            }
            if (this.a == null && (str = cyg0Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = cyg0Var.f;
            }
            if (this.g == -1) {
                this.g = cyg0Var.g;
            }
            if (this.n == -1) {
                this.n = cyg0Var.n;
            }
            if (this.o == null && (alignment2 = cyg0Var.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = cyg0Var.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = cyg0Var.q;
            }
            if (this.j == -1) {
                this.j = cyg0Var.j;
                this.k = cyg0Var.k;
            }
            if (this.r == null) {
                this.r = cyg0Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = cyg0Var.s;
            }
            if (this.t == null) {
                this.t = cyg0Var.t;
            }
            if (this.u == null) {
                this.u = cyg0Var.u;
            }
            if (!this.e && cyg0Var.e) {
                this.d = cyg0Var.d;
                this.e = true;
            }
            if (this.m != -1 || (i = cyg0Var.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
