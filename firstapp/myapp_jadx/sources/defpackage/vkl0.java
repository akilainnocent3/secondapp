package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class vkl0 implements ill0 {
    public final lkl0 a;
    public final kml0 b;
    public final boolean c;

    public vkl0(kml0 kml0Var, lkl0 lkl0Var) {
        hgl0 hgl0Var = jgl0.a;
        this.b = kml0Var;
        this.c = lkl0Var instanceof nhl0;
        this.a = lkl0Var;
    }

    @Override // defpackage.ill0
    public final int a(thl0 thl0Var) {
        int iHashCode = thl0Var.zzc.hashCode();
        if (!this.c) {
            return iHashCode;
        }
        return ((nhl0) thl0Var).zzb.a.hashCode() + (iHashCode * 53);
    }

    @Override // defpackage.ill0
    public final boolean b(thl0 thl0Var, thl0 thl0Var2) {
        if (!thl0Var.zzc.equals(thl0Var2.zzc)) {
            return false;
        }
        if (this.c) {
            return ((nhl0) thl0Var).zzb.equals(((nhl0) thl0Var2).zzb);
        }
        return true;
    }

    @Override // defpackage.ill0
    public final void c(Object obj, cnl0 cnl0Var) throws sfl0 {
        Iterator itB = ((nhl0) obj).zzb.b();
        if (itB.hasNext()) {
            ((lgl0) ((Map.Entry) itB.next()).getKey()).zzc();
            throw null;
        }
        iml0 iml0Var = ((thl0) obj).zzc;
        for (int i = 0; i < iml0Var.a; i++) {
            int i2 = iml0Var.b[i] >>> 3;
            Object obj2 = iml0Var.c[i];
            boolean z = obj2 instanceof lfl0;
            qfl0 qfl0Var = ((wfl0) cnl0Var).a;
            if (z) {
                qfl0Var.t(11);
                qfl0Var.i(2, i2);
                qfl0Var.o(3, (lfl0) obj2);
                qfl0Var.t(12);
            } else {
                qfl0Var.t(11);
                qfl0Var.i(2, i2);
                qfl0Var.t(26);
                qfl0Var.q((lkl0) obj2);
                qfl0Var.t(12);
            }
        }
    }

    @Override // defpackage.ill0
    public final void d(Object obj, Object obj2) {
        lll0.b(obj, obj2);
        if (this.c) {
            hgl0 hgl0Var = jgl0.a;
            if (((nhl0) obj2).zzb.a.isEmpty()) {
                return;
            }
            throw null;
        }
    }

    @Override // defpackage.ill0
    public final boolean e(Object obj) {
        ((nhl0) obj).zzb.c();
        return true;
    }

    @Override // defpackage.ill0
    public final void f(Object obj) {
        this.b.getClass();
        iml0 iml0Var = ((thl0) obj).zzc;
        if (iml0Var.e) {
            iml0Var.e = false;
        }
        hgl0 hgl0Var = jgl0.a;
        ((nhl0) obj).zzb.a();
    }

    @Override // defpackage.ill0
    public final void g(Object obj, byte[] bArr, int i, int i2, iel0 iel0Var) {
        thl0 thl0Var = (thl0) obj;
        if (thl0Var.zzc == iml0.f) {
            thl0Var.zzc = iml0.a();
        }
        throw null;
    }

    @Override // defpackage.ill0
    public final int h(thl0 thl0Var) {
        iml0 iml0Var = thl0Var.zzc;
        int iA = iml0Var.d;
        if (iA == -1) {
            iA = 0;
            for (int i = 0; i < iml0Var.a; i++) {
                int i2 = iml0Var.b[i] >>> 3;
                lfl0 lfl0Var = (lfl0) iml0Var.c[i];
                int iF = ufl0.f(8);
                int iF2 = ufl0.f(i2) + ufl0.f(16);
                int iF3 = ufl0.f(24);
                int iC = lfl0Var.c();
                iA += iF + iF + iF2 + qkl0.a(iC, iC, iF3);
            }
            iml0Var.d = iA;
        }
        if (this.c) {
            tll0 tll0Var = ((nhl0) thl0Var).zzb.a;
            if (tll0Var.b > 0) {
                ngl0.g(tll0Var.c(0));
                throw null;
            }
            Iterator it = tll0Var.d().iterator();
            if (it.hasNext()) {
                ngl0.g((Map.Entry) it.next());
                throw null;
            }
        }
        return iA;
    }

    @Override // defpackage.ill0
    public final thl0 zza() {
        lkl0 lkl0Var = this.a;
        if (lkl0Var instanceof thl0) {
            return (thl0) ((thl0) lkl0Var).p(4);
        }
        lhl0 lhl0Var = (lhl0) lkl0Var.b();
        boolean zG = lhl0Var.b.g();
        thl0 thl0Var = lhl0Var.b;
        if (!zG) {
            return thl0Var;
        }
        thl0Var.i();
        return lhl0Var.b;
    }
}
