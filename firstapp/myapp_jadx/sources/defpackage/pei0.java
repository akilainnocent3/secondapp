package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class pei0 implements pnh0.b {
    public final zf50 A;
    public final HashSet a;
    public final tnh0 e;
    public final n26 f;
    public final n26 i;
    public final HashSet w;
    public final HashMap y;
    public final zf50 z;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final a v = new a(this);

    public static class a extends tz5 {
        public final WeakReference<pei0> a;

        public a(pei0 pei0Var) {
            this.a = new WeakReference<>(pei0Var);
        }

        @Override // defpackage.tz5
        public final void b(int i, e06 e06Var) {
            pei0 pei0Var = this.a.get();
            if (pei0Var != null) {
                Iterator it = pei0Var.a.iterator();
                while (it.hasNext()) {
                    wf80 wf80Var = ((pnh0) it.next()).p;
                    Iterator<tz5> it2 = wf80Var.g.e.iterator();
                    while (it2.hasNext()) {
                        it2.next().b(i, new qei0(e06Var, wf80Var.g.g, -1L));
                    }
                }
            }
        }
    }

    public pei0(n26 n26Var, n26 n26Var2, HashSet hashSet, tnh0 tnh0Var, e8e0 e8e0Var) {
        this.f = n26Var;
        this.i = n26Var2;
        this.e = tnh0Var;
        this.a = hashSet;
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            pnh0 pnh0Var = (pnh0) it.next();
            map.put(pnh0Var, pnh0Var.p(n26Var.h(), null, pnh0Var.f(true, tnh0Var)));
        }
        this.y = map;
        HashSet hashSet2 = new HashSet(map.values());
        this.w = hashSet2;
        this.z = new zf50(n26Var, hashSet2);
        if (this.i != null) {
            this.A = new zf50(this.i, hashSet2);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            pnh0 pnh0Var2 = (pnh0) it2.next();
            this.d.put(pnh0Var2, Boolean.FALSE);
            this.c.put(pnh0Var2, new oei0(n26Var, this, e8e0Var));
        }
    }

    public static void s(ehe0 ehe0Var, ijd ijdVar, wf80 wf80Var) {
        ehe0Var.d();
        try {
            kpf0.a();
            ehe0Var.a();
            ehe0.a aVar = ehe0Var.l;
            aVar.g(ijdVar, new xge0(aVar));
        } catch (ijd.a unused) {
            wf80.d dVar = wf80Var.f;
            if (dVar != null) {
                dVar.a(wf80Var);
            }
        }
    }

    public static ijd t(pnh0 pnh0Var) {
        List<ijd> listB = pnh0Var instanceof h8n ? pnh0Var.p.b() : Collections.unmodifiableList(pnh0Var.p.g.a);
        km20.g(null, listB.size() <= 1);
        if (listB.size() == 1) {
            return listB.get(0);
        }
        return null;
    }

    @Override // pnh0.b
    public final void d(pnh0 pnh0Var) {
        ijd ijdVarT;
        kpf0.a();
        ehe0 ehe0VarV = v(pnh0Var);
        if (w(pnh0Var) && (ijdVarT = t(pnh0Var)) != null) {
            s(ehe0VarV, ijdVarT, pnh0Var.p);
        }
    }

    @Override // pnh0.b
    public final void j(pnh0 pnh0Var) {
        kpf0.a();
        if (w(pnh0Var)) {
            return;
        }
        this.d.put(pnh0Var, Boolean.TRUE);
        ijd ijdVarT = t(pnh0Var);
        if (ijdVarT != null) {
            s(v(pnh0Var), ijdVarT, pnh0Var.p);
        }
    }

    @Override // pnh0.b
    public final void k(pnh0 pnh0Var) {
        kpf0.a();
        if (w(pnh0Var)) {
            ehe0 ehe0VarV = v(pnh0Var);
            ijd ijdVarT = t(pnh0Var);
            if (ijdVarT != null) {
                s(ehe0VarV, ijdVarT, pnh0Var.p);
                return;
            }
            kpf0.a();
            ehe0VarV.a();
            ehe0VarV.l.a();
        }
    }

    @Override // pnh0.b
    public final void q(pnh0 pnh0Var) {
        kpf0.a();
        if (w(pnh0Var)) {
            this.d.put(pnh0Var, Boolean.FALSE);
            ehe0 ehe0VarV = v(pnh0Var);
            kpf0.a();
            ehe0VarV.a();
            ehe0VarV.l.a();
        }
    }

    public final sj1 r(pnh0 pnh0Var, zf50 zf50Var, n26 n26Var, ehe0 ehe0Var, int i, boolean z) {
        int i2;
        int iO = n26Var.a().o(i);
        boolean zF = lsg0.f(ehe0Var.b);
        snh0<?> snh0Var = (snh0) this.y.get(pnh0Var);
        Objects.requireNonNull(snh0Var);
        io20 io20VarB = zf50Var.b(snh0Var, ehe0Var.d, lsg0.b(ehe0Var.b), z);
        Rect rect = io20VarB.a;
        Size size = io20VarB.b;
        int iJ = lsg0.j((ehe0Var.i + n26Var.a().o(((x9n) pnh0Var.h).E(0))) - iO);
        boolean zO = pnh0Var.o(n26Var) ^ zF;
        if (pnh0Var instanceof aq20) {
            i2 = 1;
        } else {
            i2 = pnh0Var instanceof h8n ? 4 : 2;
        }
        return new sj1(UUID.randomUUID(), i2, pnh0Var instanceof h8n ? 256 : 34, rect, lsg0.h(size, iJ), iJ, zO);
    }

    public final HashMap u(ehe0 ehe0Var, boolean z) {
        HashMap map = new HashMap();
        for (pnh0 pnh0Var : this.a) {
            snh0<?> snh0Var = (snh0) this.y.get(pnh0Var);
            Objects.requireNonNull(snh0Var);
            Size size = this.z.b(snh0Var, ehe0Var.d, lsg0.b(ehe0Var.b), z).c;
            map.put(pnh0Var, size);
            pgt.a("VirtualCameraAdapter", "Selected child size: " + size + ", useCase: " + pnh0Var);
        }
        return map;
    }

    public final ehe0 v(pnh0 pnh0Var) {
        ehe0 ehe0Var = (ehe0) this.b.get(pnh0Var);
        Objects.requireNonNull(ehe0Var);
        return ehe0Var;
    }

    public final boolean w(pnh0 pnh0Var) {
        Boolean bool = (Boolean) this.d.get(pnh0Var);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    public final void x(HashMap map, HashMap map2) {
        HashMap map3 = this.b;
        map3.clear();
        map3.putAll(map);
        for (Map.Entry entry : map3.entrySet()) {
            pnh0 pnh0Var = (pnh0) entry.getKey();
            ehe0 ehe0Var = (ehe0) entry.getValue();
            pnh0Var.C(ehe0Var.d);
            pnh0Var.B(ehe0Var.b);
            xk1.a aVarI = ehe0Var.g.i();
            Size size = (Size) map2.get(pnh0Var);
            if (size != null) {
                aVarI.b = size;
            }
            pnh0Var.i = pnh0Var.z(aVarI.a(), null);
            pnh0Var.s();
        }
    }
}
