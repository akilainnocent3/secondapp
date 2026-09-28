package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class pnh0 {
    public snh0<?> e;
    public snh0<?> f;
    public HashSet g;
    public snh0<?> h;
    public k8e0 i;
    public snh0<?> j;
    public Rect k;
    public n26 m;
    public n26 n;
    public c26 o;
    public boolean a = false;
    public final HashSet b = new HashSet();
    public final Object c = new Object();
    public a d = a.b;
    public Matrix l = new Matrix();
    public wf80 p = wf80.a();
    public wf80 q = wf80.a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final /* synthetic */ a[] c;

        static {
            a aVar = new a("ACTIVE", 0);
            a = aVar;
            a aVar2 = new a("INACTIVE", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public interface b {
        void d(pnh0 pnh0Var);

        void j(pnh0 pnh0Var);

        void k(pnh0 pnh0Var);

        void q(pnh0 pnh0Var);
    }

    public pnh0(snh0<?> snh0Var) {
        this.f = snh0Var;
        this.h = snh0Var;
    }

    public void B(Matrix matrix) {
        this.l = new Matrix(matrix);
    }

    public void C(Rect rect) {
        this.k = rect;
    }

    public final void D(n26 n26Var) {
        A();
        synchronized (this.c) {
            try {
                n26 n26Var2 = this.m;
                if (n26Var == n26Var2) {
                    this.b.remove(n26Var2);
                    this.m = null;
                }
                n26 n26Var3 = this.n;
                if (n26Var == n26Var3) {
                    this.b.remove(n26Var3);
                    this.n = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.i = null;
        this.k = null;
        this.h = this.f;
        this.e = null;
        this.j = null;
    }

    public final void E(List<wf80> list) {
        if (list.isEmpty()) {
            return;
        }
        this.p = list.get(0);
        if (list.size() > 1) {
            this.q = list.get(1);
        }
        Iterator<wf80> it = list.iterator();
        while (it.hasNext()) {
            for (ijd ijdVar : it.next().b()) {
                if (ijdVar.j == null) {
                    ijdVar.j = getClass();
                }
            }
        }
    }

    public final void a(wf80.b bVar, k8e0 k8e0Var) {
        if (!k8e0.a.equals(k8e0Var.c())) {
            bVar.b.b.Y(ue6.k, k8e0Var.c());
            return;
        }
        synchronized (this.c) {
            try {
                n26 n26Var = this.m;
                n26Var.getClass();
                ArrayList arrayListC = n26Var.h().i().c(AeFpsRangeQuirk.class);
                boolean z = true;
                if (arrayListC.size() > 1) {
                    z = false;
                }
                km20.a("There should not have more than one AeFpsRangeQuirk.", z);
                if (!arrayListC.isEmpty()) {
                    bVar.b.b.Y(ue6.k, ((AeFpsRangeQuirk) arrayListC.get(0)).a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(n26 n26Var, n26 n26Var2, snh0<?> snh0Var, snh0<?> snh0Var2) {
        synchronized (this.c) {
            this.m = n26Var;
            this.n = n26Var2;
            this.b.add(n26Var);
            if (n26Var2 != null) {
                this.b.add(n26Var2);
            }
        }
        this.e = snh0Var;
        this.j = snh0Var2;
        this.h = p(n26Var.h(), this.e, this.j);
        t();
    }

    public final n26 c() {
        n26 n26Var;
        synchronized (this.c) {
            n26Var = this.m;
        }
        return n26Var;
    }

    public final m16 d() {
        synchronized (this.c) {
            try {
                n26 n26Var = this.m;
                if (n26Var == null) {
                    return m16.a;
                }
                return n26Var.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String e() {
        n26 n26VarC = c();
        km20.f(n26VarC, "No camera attached to use case: " + this);
        return n26VarC.h().d();
    }

    public abstract snh0<?> f(boolean z, tnh0 tnh0Var);

    public final String g() {
        String strQ = this.h.q("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strQ);
        return strQ;
    }

    public final int h(n26 n26Var, boolean z) {
        int iO = n26Var.h().o(l());
        return (n26Var.o() || !z) ? iO : lsg0.j(-iO);
    }

    public final n26 i() {
        n26 n26Var;
        synchronized (this.c) {
            n26Var = this.n;
        }
        return n26Var;
    }

    public Set<dhf> j(m26 m26Var) {
        return null;
    }

    public Set<Integer> k() {
        return Collections.EMPTY_SET;
    }

    public final int l() {
        return ((x9n) this.h).E(0);
    }

    public abstract snh0.b<?, ?, ?> m(hoa hoaVar);

    public final boolean n(int i) {
        Iterator<Integer> it = k().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if ((i & iIntValue) == iIntValue) {
                return true;
            }
        }
        return false;
    }

    public final boolean o(n26 n26Var) {
        int iG = ((x9n) this.h).G();
        if (iG == -1 || iG == 0) {
            return false;
        }
        if (iG == 1) {
            return true;
        }
        if (iG == 2) {
            return n26Var.i();
        }
        jb5.a(hce0.a(iG, "Unknown mirrorMode: "));
        return false;
    }

    public final snh0<?> p(m26 m26Var, snh0<?> snh0Var, snh0<?> snh0Var2) {
        ftw ftwVarV;
        if (snh0Var2 != null) {
            ftwVarV = ftw.W(snh0Var2);
            ftwVarV.N.remove(h5f0.v);
        } else {
            ftwVarV = ftw.V();
        }
        TreeMap<hoa.a<?>, Map<hoa.b, Object>> treeMap = ftwVarV.N;
        if (this.f.e(x9n.k) || this.f.e(x9n.o)) {
            wg1 wg1Var = x9n.s;
            if (treeMap.containsKey(wg1Var)) {
                treeMap.remove(wg1Var);
            }
        }
        snh0<?> snh0Var3 = this.f;
        wg1 wg1Var2 = x9n.s;
        if (snh0Var3.e(wg1Var2)) {
            wg1 wg1Var3 = x9n.q;
            if (treeMap.containsKey(wg1Var3) && ((xf50) this.f.d(wg1Var2)).b != null) {
                treeMap.remove(wg1Var3);
            }
        }
        Iterator<hoa.a<?>> it = this.f.c().iterator();
        while (it.hasNext()) {
            hoa.s(ftwVarV, ftwVarV, this.f, it.next());
        }
        if (snh0Var != null) {
            for (hoa.a<?> aVar : snh0Var.c()) {
                if (!aVar.b().equals(h5f0.v.a)) {
                    hoa.s(ftwVarV, ftwVarV, snh0Var, aVar);
                }
            }
        }
        if (treeMap.containsKey(x9n.o)) {
            wg1 wg1Var4 = x9n.k;
            if (treeMap.containsKey(wg1Var4)) {
                treeMap.remove(wg1Var4);
            }
        }
        wg1 wg1Var5 = x9n.s;
        if (treeMap.containsKey(wg1Var5)) {
            ((xf50) ftwVarV.d(wg1Var5)).getClass();
        }
        pgt.a("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.g + ", this = " + this);
        HashSet<l8l> hashSet = this.g;
        if (hashSet != null) {
            int i = fhf.c;
            Range<Integer> range = k8e0.a;
            w5i0.a aVar2 = w5i0.c;
            dhf dhfVar = dhf.d;
            for (l8l l8lVar : hashSet) {
                if (l8lVar instanceof fhf) {
                    dhfVar = ((fhf) l8lVar).a;
                } else if (l8lVar instanceof nui) {
                    nui nuiVar = (nui) l8lVar;
                    range = new Range<>(Integer.valueOf(nuiVar.a), Integer.valueOf(nuiVar.b));
                } else if (l8lVar instanceof w5i0) {
                    aVar2 = ((w5i0) l8lVar).a;
                }
            }
            if ((this instanceof aq20) || v36.B(this)) {
                ftwVarV.Y(d9n.j, dhfVar);
            }
            ftwVarV.Y(snh0.E, range);
            int iOrdinal = aVar2.ordinal();
            if (iOrdinal == 0) {
                ftwVarV.Y(snh0.J, 1);
                ftwVarV.Y(snh0.K, 1);
            } else if (iOrdinal == 1) {
                ftwVarV.Y(snh0.J, 0);
                ftwVarV.Y(snh0.K, 2);
            } else if (iOrdinal == 2) {
                ftwVarV.Y(snh0.J, 2);
                ftwVarV.Y(snh0.K, 0);
            }
        }
        return v(m26Var, m(ftwVarV));
    }

    public final void q() {
        this.d = a.a;
        s();
    }

    public final void r() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).d(this);
        }
    }

    public final void s() {
        int iOrdinal = this.d.ordinal();
        HashSet hashSet = this.b;
        if (iOrdinal == 0) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((b) it.next()).j(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).q(this);
            }
        }
    }

    public snh0<?> v(m26 m26Var, snh0.b<?, ?, ?> bVar) {
        return bVar.d();
    }

    public void w() {
        this.a = true;
    }

    public void x() {
        this.a = false;
    }

    public xk1 y(hoa hoaVar) {
        k8e0 k8e0Var = this.i;
        if (k8e0Var == null) {
            zkh.a("Attempt to update the implementation options for a use case without attached stream specifications.");
            return null;
        }
        xk1.a aVarI = k8e0Var.i();
        aVarI.f = hoaVar;
        return aVarI.a();
    }

    public void A() {
    }

    public void t() {
    }

    public void u() {
    }

    public k8e0 z(k8e0 k8e0Var, k8e0 k8e0Var2) {
        return k8e0Var;
    }
}
