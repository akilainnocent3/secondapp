package defpackage;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class ngl0 {
    public static final ngl0 d = new ngl0(0);
    public final tll0 a = new tll0();
    public boolean b;
    public boolean c;

    public ngl0(int i) {
        a();
        a();
    }

    public static void d(qfl0 qfl0Var, yml0 yml0Var, int i, Object obj) throws sfl0 {
        if (yml0Var == yml0.d) {
            lkl0 lkl0Var = (lkl0) obj;
            Charset charset = kil0.a;
            if (lkl0Var instanceof del0) {
                throw null;
            }
            qfl0Var.g(i, 3);
            lkl0Var.c(qfl0Var);
            qfl0Var.g(i, 4);
            return;
        }
        qfl0Var.g(i, yml0Var.b);
        anl0 anl0Var = anl0.a;
        switch (yml0Var.ordinal()) {
            case 0:
                qfl0Var.w(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                qfl0Var.u(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                qfl0Var.v(((Long) obj).longValue());
                return;
            case 3:
                qfl0Var.v(((Long) obj).longValue());
                return;
            case 4:
                qfl0Var.s(((Integer) obj).intValue());
                return;
            case 5:
                qfl0Var.w(((Long) obj).longValue());
                return;
            case 6:
                qfl0Var.u(((Integer) obj).intValue());
                return;
            case 7:
                qfl0Var.r(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof lfl0) {
                    qfl0Var.p((lfl0) obj);
                    return;
                } else {
                    qfl0Var.y((String) obj);
                    return;
                }
            case 9:
                ((lkl0) obj).c(qfl0Var);
                return;
            case 10:
                qfl0Var.q((lkl0) obj);
                return;
            case 11:
                if (obj instanceof lfl0) {
                    qfl0Var.p((lfl0) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                qfl0Var.t(length);
                qfl0Var.x(length, bArr);
                return;
            case 12:
                qfl0Var.t(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof zhl0) {
                    qfl0Var.s(((zhl0) obj).zza());
                    return;
                } else {
                    qfl0Var.s(((Integer) obj).intValue());
                    return;
                }
            case 14:
                qfl0Var.u(((Integer) obj).intValue());
                return;
            case 15:
                qfl0Var.w(((Long) obj).longValue());
                return;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                qfl0Var.t((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                qfl0Var.v((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return;
            default:
                return;
        }
    }

    public static int e(yml0 yml0Var, int i, Object obj) {
        int iC;
        int iF;
        int iF2 = ufl0.f(i << 3);
        if (yml0Var == yml0.d) {
            Charset charset = kil0.a;
            if (((lkl0) obj) instanceof del0) {
                throw null;
            }
            iF2 += iF2;
        }
        yml0 yml0Var2 = yml0.c;
        anl0 anl0Var = anl0.a;
        int iA = 4;
        switch (yml0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = ufl0.b;
                iA = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = ufl0.b;
                break;
            case 2:
                iA = ufl0.a(((Long) obj).longValue());
                break;
            case 3:
                iA = ufl0.a(((Long) obj).longValue());
                break;
            case 4:
                iA = ufl0.a(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = ufl0.b;
                iA = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = ufl0.b;
                break;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = ufl0.b;
                iA = 1;
                break;
            case 8:
                if (!(obj instanceof lfl0)) {
                    iA = ufl0.b((String) obj);
                } else {
                    Logger logger6 = ufl0.b;
                    iC = ((lfl0) obj).c();
                    iF = ufl0.f(iC);
                    iA = iF + iC;
                }
                break;
            case 9:
                iA = ((lkl0) obj).a();
                break;
            case 10:
                if (!(obj instanceof wil0)) {
                    iA = ufl0.c((lkl0) obj);
                } else {
                    Logger logger7 = ufl0.b;
                    iC = ((wil0) obj).a();
                    iF = ufl0.f(iC);
                    iA = iF + iC;
                }
                break;
            case 11:
                if (obj instanceof lfl0) {
                    Logger logger8 = ufl0.b;
                    iC = ((lfl0) obj).c();
                    iF = ufl0.f(iC);
                } else {
                    Logger logger9 = ufl0.b;
                    iC = ((byte[]) obj).length;
                    iF = ufl0.f(iC);
                }
                iA = iF + iC;
                break;
            case 12:
                iA = ufl0.f(((Integer) obj).intValue());
                break;
            case 13:
                iA = !(obj instanceof zhl0) ? ufl0.a(((Integer) obj).intValue()) : ufl0.a(((zhl0) obj).zza());
                break;
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = ufl0.b;
                break;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = ufl0.b;
                iA = 8;
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iA = ufl0.f((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iA = ufl0.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
            default:
                b9p.a("There is no way to get here, but the compiler thinks otherwise.");
                iA = 0;
                break;
        }
        return iA + iF2;
    }

    public static boolean f(Map.Entry entry) {
        ((lgl0) entry.getKey()).zzc();
        throw null;
    }

    public static final int g(Map.Entry entry) {
        lgl0 lgl0Var = (lgl0) entry.getKey();
        entry.getValue();
        lgl0Var.zzc();
        throw null;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        tll0 tll0Var = this.a;
        int i = tll0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = tll0Var.c(i2).b;
            if (obj instanceof thl0) {
                ((thl0) obj).i();
            }
        }
        Iterator it = tll0Var.d().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof thl0) {
                ((thl0) value).i();
            }
        }
        tll0Var.b();
        this.b = true;
    }

    public final Iterator b() {
        tll0 tll0Var = this.a;
        if (tll0Var.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.c ? new uil0(((zll0) tll0Var.entrySet()).iterator()) : ((zll0) tll0Var.entrySet()).iterator();
    }

    public final boolean c() {
        tll0 tll0Var = this.a;
        if (tll0Var.b > 0) {
            f(tll0Var.c(0));
            throw null;
        }
        Iterator it = tll0Var.d().iterator();
        if (!it.hasNext()) {
            return true;
        }
        f((Map.Entry) it.next());
        throw null;
    }

    public final Object clone() {
        ngl0 ngl0Var = new ngl0();
        tll0 tll0Var = this.a;
        if (tll0Var.b > 0) {
            ((lgl0) tll0Var.c(0).a).zzd();
            throw null;
        }
        Iterator it = tll0Var.d().iterator();
        if (!it.hasNext()) {
            ngl0Var.c = this.c;
            return ngl0Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        lgl0 lgl0Var = (lgl0) entry.getKey();
        entry.getValue();
        lgl0Var.zzd();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ngl0) {
            return this.a.equals(((ngl0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public ngl0() {
    }
}
