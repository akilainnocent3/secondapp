package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rvf {
    public final xsz a;
    public int b;
    public int c;
    public int d;
    public int e;

    public rvf(nk0 nk0Var, long j) {
        String str = nk0Var.b;
        xsz xszVar = new xsz();
        xszVar.a = str;
        xszVar.c = -1;
        xszVar.d = -1;
        this.a = xszVar;
        this.b = ulf0.f(j);
        this.c = ulf0.e(j);
        this.d = -1;
        this.e = -1;
        int iF = ulf0.f(j);
        int iE = ulf0.e(j);
        if (iF < 0 || iF > str.length()) {
            ks40.a(str.length(), efe0.a(iF, "start (", ") offset is outside of text region "));
            throw null;
        }
        if (iE < 0 || iE > str.length()) {
            ks40.a(str.length(), efe0.a(iE, "end (", ") offset is outside of text region "));
            throw null;
        }
        if (iF <= iE) {
            return;
        }
        hb5.a(whs.b(iF, iE, "Do not set reversed range: ", " > "));
        throw null;
    }

    public final void a(int i, int i2) {
        long jA = vlf0.a(i, i2);
        this.a.b(i, i2, "");
        long jA2 = svf.a(vlf0.a(this.b, this.c), jA);
        j(ulf0.f(jA2));
        i(ulf0.e(jA2));
        if (e()) {
            long jA3 = svf.a(vlf0.a(this.d, this.e), jA);
            if (ulf0.c(jA3)) {
                this.d = -1;
                this.e = -1;
            } else {
                this.d = ulf0.f(jA3);
                this.e = ulf0.e(jA3);
            }
        }
    }

    public final char b(int i) {
        xsz xszVar = this.a;
        gyj gyjVar = xszVar.b;
        if (gyjVar == null) {
            return xszVar.a.charAt(i);
        }
        if (i < xszVar.c) {
            return xszVar.a.charAt(i);
        }
        int iA = gyjVar.a - gyjVar.a();
        int i2 = xszVar.c;
        if (i >= iA + i2) {
            return xszVar.a.charAt(i - ((iA - xszVar.d) + i2));
        }
        int i3 = i - i2;
        int i4 = gyjVar.c;
        char[] cArr = gyjVar.b;
        return i3 < i4 ? cArr[i3] : cArr[(i3 - i4) + gyjVar.d];
    }

    public final ulf0 c() {
        if (e()) {
            return new ulf0(vlf0.a(this.d, this.e));
        }
        return null;
    }

    public final int d() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final boolean e() {
        return this.d != -1;
    }

    public final void f(int i, int i2, String str) {
        xsz xszVar = this.a;
        if (i < 0 || i > xszVar.a()) {
            ks40.a(xszVar.a(), efe0.a(i, "start (", ") offset is outside of text region "));
            return;
        }
        if (i2 < 0 || i2 > xszVar.a()) {
            ks40.a(xszVar.a(), efe0.a(i2, "end (", ") offset is outside of text region "));
        } else {
            if (i > i2) {
                hb5.a(whs.b(i, i2, "Do not set reversed range: ", " > "));
                return;
            }
            xszVar.b(i, i2, str);
            j(str.length() + i);
            i(str.length() + i);
            this.d = -1;
            this.e = -1;
        }
    }

    public final void g(int i, int i2) {
        xsz xszVar = this.a;
        if (i < 0 || i > xszVar.a()) {
            ks40.a(xszVar.a(), efe0.a(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > xszVar.a()) {
            ks40.a(xszVar.a(), efe0.a(i2, "end (", ") offset is outside of text region "));
        } else if (i >= i2) {
            hb5.a(whs.b(i, i2, "Do not set reversed or empty range: ", " > "));
        } else {
            this.d = i;
            this.e = i2;
        }
    }

    public final void h(int i, int i2) {
        xsz xszVar = this.a;
        if (i < 0 || i > xszVar.a()) {
            ks40.a(xszVar.a(), efe0.a(i, "start (", ") offset is outside of text region "));
        } else if (i2 < 0 || i2 > xszVar.a()) {
            ks40.a(xszVar.a(), efe0.a(i2, "end (", ") offset is outside of text region "));
        } else if (i > i2) {
            hb5.a(whs.b(i, i2, "Do not set reversed range: ", " > "));
        } else {
            j(i);
            i(i2);
        }
    }

    public final void i(int i) {
        if (!(i >= 0)) {
            xkn.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void j(int i) {
        if (!(i >= 0)) {
            xkn.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
