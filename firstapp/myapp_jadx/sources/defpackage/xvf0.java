package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class xvf0 extends g1f0 {
    public long d;
    public long e;

    public xvf0(xvf0 xvf0Var) {
        this.a = xvf0Var.a;
        this.d = xvf0Var.d;
        this.e = xvf0Var.e;
        this.b = xvf0Var.b;
        this.c = xvf0Var.c;
    }

    public static xvf0 a() {
        xvf0 xvf0Var = new xvf0("all");
        xvf0Var.d = 0L;
        xvf0Var.e = 0L;
        return xvf0Var;
    }

    public final boolean b() {
        return TextUtils.equals(this.a, "all");
    }

    public final boolean c() {
        return TextUtils.equals(this.a, "custom");
    }

    public final boolean d() {
        return TextUtils.equals(this.a, "date_range");
    }

    public xvf0(String str) {
        this.a = str;
    }

    public xvf0() {
    }
}
