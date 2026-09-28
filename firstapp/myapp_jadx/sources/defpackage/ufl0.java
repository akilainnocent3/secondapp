package defpackage;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ufl0 {
    public static final Logger b = Logger.getLogger(ufl0.class.getName());
    public static final boolean c = rml0.e;
    public wfl0 a;

    public ufl0() {
        throw null;
    }

    public static int a(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int b(String str) {
        int length;
        try {
            length = wml0.b(str);
        } catch (uml0 unused) {
            length = str.getBytes(kil0.a).length;
        }
        return f(length) + length;
    }

    public static int c(lkl0 lkl0Var) {
        int iA = lkl0Var.a();
        return f(iA) + iA;
    }

    public static int f(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public final void d() {
        if (e() == 0) {
            return;
        }
        ib5.a("Did not write as much data as expected.");
    }

    public abstract int e();
}
