package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes.dex */
public final class igx {
    public final b390 A;
    public final yfx a;
    public final vfx b;
    public fhx c;
    public Bundle d;
    public Bundle[] e;
    public final gx0<ifx> f = new gx0<>();
    public final wwd0 g;
    public final v340 h;
    public final wwd0 i;
    public final v340 j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public final LinkedHashMap n;
    public ibs o;
    public jgx p;
    public final ArrayList q;
    public s9s.b r;
    public final bgx s;
    public final wkx t;
    public final LinkedHashMap u;
    public Function1<? super ifx, Unit> v;
    public dgx w;
    public final LinkedHashMap x;
    public int y;
    public final ArrayList z;

    /* JADX WARN: Type inference failed for: r3v11, types: [bgx] */
    public igx(yfx yfxVar, vfx vfxVar) {
        this.a = yfxVar;
        this.b = vfxVar;
        m2g m2gVar = m2g.a;
        wwd0 wwd0VarA = xwd0.a(m2gVar);
        this.g = wwd0VarA;
        this.h = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(m2gVar);
        this.i = wwd0VarA2;
        this.j = e1i.b(wwd0VarA2);
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.n = new LinkedHashMap();
        this.q = new ArrayList();
        this.r = s9s.b.b;
        this.s = new cbs() { // from class: bgx
            @Override // defpackage.cbs
            public final void F0(ibs ibsVar, s9s.a aVar) {
                s9s.b bVarA = aVar.a();
                igx igxVar = this.a;
                igxVar.r = bVarA;
                if (igxVar.c != null) {
                    ArrayList arrayListC0 = CollectionsKt.C0(igxVar.f);
                    int size = arrayListC0.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayListC0.get(i);
                        i++;
                        ifx ifxVar = (ifx) obj;
                        ifxVar.getClass();
                        lfx lfxVar = ifxVar.v;
                        lfxVar.getClass();
                        lfxVar.a.d = aVar.a();
                        lfxVar.d = aVar.a();
                        lfxVar.b();
                    }
                }
            }
        };
        this.t = new wkx();
        this.u = new LinkedHashMap();
        this.x = new LinkedHashMap();
        this.z = new ArrayList();
        this.A = d390.b(1, 0, pb5.b, 2);
    }

    public static ygx e(int i, ygx ygxVar, ygx ygxVar2, boolean z) {
        if (ygxVar.b.e == i && (ygxVar2 == null || (ygxVar.equals(ygxVar2) && Intrinsics.g(ygxVar.c, ygxVar2.c)))) {
            return ygxVar;
        }
        fhx fhxVar = ygxVar instanceof fhx ? (fhx) ygxVar : null;
        if (fhxVar == null) {
            fhxVar = ygxVar.c;
            fhxVar.getClass();
        }
        return fhxVar.i.d(i, fhxVar, ygxVar2, z);
    }

    public static /* synthetic */ void t(igx igxVar, ifx ifxVar) {
        igxVar.s(ifxVar, false, new gx0<>());
    }

    public final void a(ygx ygxVar, Bundle bundle, ifx ifxVar, List<ifx> list) {
        ifx ifxVarPrevious;
        ifx ifxVarPrevious2;
        ufx ufxVar = this.a.c;
        ygx ygxVar2 = ifxVar.b;
        boolean z = ygxVar2 instanceof jyh;
        gx0<ifx> gx0Var = this.f;
        if (!z) {
            while (!gx0Var.isEmpty() && (gx0Var.last().b instanceof jyh) && q(gx0Var.last().b.b.e, true, false)) {
            }
        }
        gx0<ifx> gx0Var2 = new gx0();
        ifx ifxVar2 = null;
        if (ygxVar instanceof fhx) {
            ygx ygxVar3 = ygxVar2;
            do {
                ygxVar3.getClass();
                ygxVar3 = ygxVar3.c;
                if (ygxVar3 != null) {
                    ListIterator<ifx> listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            ifxVarPrevious2 = null;
                            break;
                        }
                        ifxVarPrevious2 = listIterator.previous();
                    } while (!Intrinsics.g(ifxVarPrevious2.b, ygxVar3));
                    ifx ifxVarA = ifxVarPrevious2;
                    if (ifxVarA == null) {
                        ifxVarA = ifx.a.a(ufxVar, ygxVar3, bundle, k(), this.p);
                    }
                    gx0Var2.addFirst(ifxVarA);
                    if (!gx0Var.isEmpty() && gx0Var.last().b == ygxVar3) {
                        t(this, gx0Var.last());
                    }
                }
                if (ygxVar3 == null) {
                    break;
                }
            } while (ygxVar3 != ygxVar);
        }
        ygx ygxVar4 = gx0Var2.isEmpty() ? ygxVar2 : ((ifx) gx0Var2.first()).b;
        while (ygxVar4 != null && d(ygxVar4.b.e, ygxVar4) != ygxVar4) {
            ygxVar4 = ygxVar4.c;
            if (ygxVar4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator<ifx> listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        ifxVarPrevious = null;
                        break;
                    }
                    ifxVarPrevious = listIterator2.previous();
                } while (!Intrinsics.g(ifxVarPrevious.b, ygxVar4));
                ifx ifxVarA2 = ifxVarPrevious;
                if (ifxVarA2 == null) {
                    ifxVarA2 = ifx.a.a(ufxVar, ygxVar4, ygxVar4.c(bundle2), k(), this.p);
                }
                gx0Var2.addFirst(ifxVarA2);
            }
        }
        if (!gx0Var2.isEmpty()) {
            ygxVar2 = ((ifx) gx0Var2.first()).b;
        }
        while (!gx0Var.isEmpty() && (gx0Var.last().b instanceof fhx)) {
            ygx ygxVar5 = gx0Var.last().b;
            ygxVar5.getClass();
            if (fsa0.a(((fhx) ygxVar5).i.b, ygxVar2.b.e) != null) {
                break;
            } else {
                t(this, gx0Var.last());
            }
        }
        ifx ifxVarF = gx0Var.f();
        if (ifxVarF == null) {
            ifxVarF = (ifx) gx0Var2.f();
        }
        if (!Intrinsics.g(ifxVarF != null ? ifxVarF.b : null, this.c)) {
            ListIterator<ifx> listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                ifx ifxVarPrevious3 = listIterator3.previous();
                ygx ygxVar6 = ifxVarPrevious3.b;
                fhx fhxVar = this.c;
                fhxVar.getClass();
                if (Intrinsics.g(ygxVar6, fhxVar)) {
                    ifxVar2 = ifxVarPrevious3;
                    break;
                }
            }
            ifx ifxVarA3 = ifxVar2;
            if (ifxVarA3 == null) {
                fhx fhxVar2 = this.c;
                fhxVar2.getClass();
                fhx fhxVar3 = this.c;
                fhxVar3.getClass();
                ifxVarA3 = ifx.a.a(ufxVar, fhxVar2, fhxVar3.c(bundle), k(), this.p);
            }
            gx0Var2.addFirst(ifxVarA3);
        }
        for (ifx ifxVar3 : gx0Var2) {
            Object obj = this.u.get(this.t.b(ifxVar3.b.a));
            if (obj == null) {
                q1b.a(uf80.a(new StringBuilder("NavigatorBackStack for "), ygxVar.a, " should already be created"));
                return;
            }
            ((yfx.a) obj).i(ifxVar3);
        }
        gx0Var.addAll(gx0Var2);
        gx0Var.addLast(ifxVar);
        ArrayList arrayListJ0 = CollectionsKt.j0(gx0Var2, ifxVar);
        int size = arrayListJ0.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayListJ0.get(i);
            i++;
            ifx ifxVar4 = (ifx) obj2;
            fhx fhxVar4 = ifxVar4.b.c;
            if (fhxVar4 != null) {
                m(ifxVar4, g(fhxVar4.b.e));
            }
        }
    }

    public final boolean b() {
        gx0<ifx> gx0Var;
        while (true) {
            gx0Var = this.f;
            if (gx0Var.isEmpty() || !(gx0Var.last().b instanceof fhx)) {
                break;
            }
            t(this, gx0Var.last());
        }
        ifx ifxVarI = gx0Var.i();
        ArrayList arrayList = this.z;
        if (ifxVarI != null) {
            arrayList.add(ifxVarI);
        }
        this.y++;
        y();
        int i = this.y - 1;
        this.y = i;
        if (i == 0) {
            ArrayList arrayListC0 = CollectionsKt.C0(arrayList);
            arrayList.clear();
            int size = arrayListC0.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListC0.get(i2);
                i2++;
                ifx ifxVar = (ifx) obj;
                Iterator it = CollectionsKt.A0(this.q).iterator();
                while (it.hasNext()) {
                    ((yfx.b) it.next()).a(this.a, ifxVar.b, ifxVar.v.a());
                }
                this.A.a(ifxVar);
            }
            ArrayList arrayList2 = new ArrayList(gx0Var);
            wwd0 wwd0Var = this.g;
            wwd0Var.getClass();
            wwd0Var.k(null, arrayList2);
            ArrayList arrayListU = u();
            wwd0 wwd0Var2 = this.i;
            wwd0Var2.getClass();
            wwd0Var2.k(null, arrayListU);
        }
        return ifxVarI != null;
    }

    public final boolean c(ArrayList arrayList, ygx ygxVar, boolean z, boolean z2) {
        final igx igxVar;
        boolean z3;
        yp40 yp40Var = new yp40();
        gx0 gx0Var = new gx0();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                igxVar = this;
                z3 = z2;
                break;
            }
            int i2 = i + 1;
            vkx vkxVar = (vkx) arrayList.get(i);
            yp40 yp40Var2 = new yp40();
            ifx ifxVarLast = this.f.last();
            igxVar = this;
            z3 = z2;
            dgx dgxVar = new dgx(yp40Var2, yp40Var, igxVar, z3, gx0Var);
            vkxVar.getClass();
            ifxVarLast.getClass();
            igxVar.w = dgxVar;
            vkxVar.i(ifxVarLast, z3);
            igxVar.w = null;
            if (!yp40Var2.a) {
                break;
            }
            this = igxVar;
            z2 = z3;
            i = i2;
        }
        if (z3) {
            LinkedHashMap linkedHashMap = igxVar.m;
            if (!z) {
                Sequence sequenceC = fd80.c(ygxVar, new egx());
                cce cceVar = new cce(igxVar, 1);
                sequenceC.getClass();
                t4f0.a aVar = new t4f0.a(new t4f0(sequenceC, cceVar));
                while (aVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((ygx) aVar.next()).b.e);
                    rfx rfxVar = (rfx) gx0Var.f();
                    linkedHashMap.put(numValueOf, rfxVar != null ? rfxVar.a.a : null);
                }
            }
            if (!gx0Var.isEmpty()) {
                sfx sfxVar = ((rfx) gx0Var.first()).a;
                String str = sfxVar.a;
                Sequence sequenceC2 = fd80.c(igxVar.d(sfxVar.b, null), new fgx());
                Function1 function1 = new Function1() { // from class: ggx
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ygx ygxVar2 = (ygx) obj;
                        ygxVar2.getClass();
                        return Boolean.valueOf(!this.a.m.containsKey(Integer.valueOf(ygxVar2.b.e)));
                    }
                };
                sequenceC2.getClass();
                t4f0.a aVar2 = new t4f0.a(new t4f0(sequenceC2, function1));
                while (aVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((ygx) aVar2.next()).b.e), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    igxVar.n.put(str, gx0Var);
                }
            }
        }
        igxVar.b.invoke();
        return yp40Var.a;
    }

    public final ygx d(int i, ygx ygxVar) {
        ygx ygxVar2;
        fhx fhxVar = this.c;
        if (fhxVar == null) {
            return null;
        }
        if (fhxVar.b.e == i) {
            if (ygxVar == null) {
                return fhxVar;
            }
            if (Intrinsics.g(fhxVar, ygxVar) && ygxVar.c == null) {
                return this.c;
            }
        }
        ifx ifxVarI = this.f.i();
        if (ifxVarI == null || (ygxVar2 = ifxVarI.b) == null) {
            ygxVar2 = this.c;
            ygxVar2.getClass();
        }
        return e(i, ygxVar2, ygxVar, false);
    }

    public final <T> String f(T t) {
        t.getClass();
        ygx ygxVarE = e(w060.b(ue80.b(jq40.a(t.getClass()))), j(), null, true);
        if (ygxVarE == null) {
            axz.a(jq40.a(t.getClass()).k(), "Destination with route ", " cannot be found in navigation graph ", this.c);
            return null;
        }
        Map<String, ffx> mapF = ygxVarE.f();
        LinkedHashMap linkedHashMap = new LinkedHashMap(jpu.a(mapF.size()));
        Iterator<T> it = mapF.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((ffx) entry.getValue()).a);
        }
        return w060.d(t, linkedHashMap);
    }

    public final ifx g(int i) {
        ifx ifxVarPrevious;
        gx0<ifx> gx0Var = this.f;
        ListIterator<ifx> listIterator = gx0Var.listIterator(gx0Var.size());
        do {
            if (!listIterator.hasPrevious()) {
                ifxVarPrevious = null;
                break;
            }
            ifxVarPrevious = listIterator.previous();
        } while (ifxVarPrevious.b.b.e != i);
        ifx ifxVar = ifxVarPrevious;
        if (ifxVar != null) {
            return ifxVar;
        }
        StringBuilder sbA = efe0.a(i, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbA.append(i());
        throw new IllegalArgumentException(sbA.toString().toString());
    }

    public final ifx h() {
        return this.f.i();
    }

    public final ygx i() {
        ifx ifxVarH = h();
        if (ifxVarH != null) {
            return ifxVarH.b;
        }
        return null;
    }

    public final fhx j() {
        fhx fhxVar = this.c;
        if (fhxVar != null) {
            fhxVar.getClass();
            return fhxVar;
        }
        ib5.a("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final s9s.b k() {
        return this.o == null ? s9s.b.c : this.r;
    }

    public final fhx l() {
        ygx ygxVar;
        ifx ifxVarI = this.f.i();
        if (ifxVarI == null || (ygxVar = ifxVarI.b) == null) {
            ygxVar = this.c;
            ygxVar.getClass();
        }
        fhx fhxVar = ygxVar instanceof fhx ? (fhx) ygxVar : null;
        if (fhxVar != null) {
            return fhxVar;
        }
        fhx fhxVar2 = ygxVar.c;
        fhxVar2.getClass();
        return fhxVar2;
    }

    public final void m(ifx ifxVar, ifx ifxVar2) {
        this.k.put(ifxVar, ifxVar2);
        LinkedHashMap linkedHashMap = this.l;
        if (linkedHashMap.get(ifxVar2) == null) {
            linkedHashMap.put(ifxVar2, new t11());
        }
        Object obj = linkedHashMap.get(ifxVar2);
        obj.getClass();
        ((t11) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:58:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x0134 A[LOOP:4: B:59:0x012d->B:61:0x0134, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x018c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0198  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b1 A[LOOP:6: B:70:0x01ab->B:72:0x01b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:99:0x01a3 A[SYNTHETIC] */
    public final void n(final ygx ygxVar, Bundle bundle, zix zixVar) {
        int i;
        boolean zQ;
        wkx wkxVar;
        LinkedHashMap linkedHashMap;
        boolean z;
        int iNextIndex;
        ygx ygxVar2;
        gx0<ifx> gx0Var;
        fhx fhxVar;
        ygxVar.getClass();
        LinkedHashMap linkedHashMap2 = this.u;
        Iterator it = linkedHashMap2.values().iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            } else {
                ((yfx.a) it.next()).d = true;
            }
        }
        final yp40 yp40Var = new yp40();
        if (zixVar != null) {
            boolean z2 = zixVar.e;
            boolean z3 = zixVar.d;
            String str = zixVar.j;
            if (str != null) {
                zQ = r(str, z3, z2);
            } else {
                ygp<?> ygpVar = zixVar.k;
                if (ygpVar != null) {
                    zQ = q(w060.b(ue80.b(ygpVar)), z3, z2);
                } else {
                    Object obj = zixVar.l;
                    if (obj != null) {
                        zQ = r(f(obj), z3, z2);
                    } else {
                        int i2 = zixVar.c;
                        if (i2 != -1) {
                            zQ = q(i2, z3, z2);
                        } else {
                            zQ = false;
                        }
                    }
                }
            }
        } else {
            zQ = false;
        }
        final Bundle bundleC = ygxVar.c(bundle);
        dhx dhxVar = ygxVar.b;
        if (zixVar == null || !zixVar.b) {
            wkxVar = this.t;
            if (zixVar == null && zixVar.a) {
                ifx ifxVarH = h();
                gx0<ifx> gx0Var2 = this.f;
                ListIterator<ifx> listIterator = gx0Var2.listIterator(gx0Var2.getB());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous().b == ygxVar) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    linkedHashMap = linkedHashMap2;
                    z = false;
                } else if (ygxVar instanceof fhx) {
                    int i3 = fhx.v;
                    List listK = ld80.k(ld80.i(fd80.c((fhx) ygxVar, new c5a(i)), new hgx()));
                    if (gx0Var2.c - iNextIndex == listK.size()) {
                        List<ifx> listSubList = gx0Var2.subList(iNextIndex, gx0Var2.c);
                        ArrayList arrayList = new ArrayList(l48.r(listSubList, 10));
                        Iterator<T> it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(Integer.valueOf(((ifx) it2.next()).b.b.e));
                        }
                        if (arrayList.equals(listK)) {
                            gx0Var = new gx0();
                            while (gx0Var2.size() - i >= iNextIndex) {
                                ifx ifxVar = (ifx) p48.C(gx0Var2);
                                x(ifxVar);
                                LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                ifx ifxVar2 = new ifx(ifxVar.a, ifxVar.b, ifxVar.b.c(bundle), ifxVar.d, ifxVar.e, ifxVar.f, ifxVar.i);
                                s9s.b bVar = ifxVar.d;
                                lfx lfxVar = ifxVar2.v;
                                lfxVar.getClass();
                                bVar.getClass();
                                lfxVar.d = bVar;
                                lfxVar.k = ifxVar.v.k;
                                lfxVar.b();
                                gx0Var.addFirst(ifxVar2);
                                linkedHashMap2 = linkedHashMap3;
                                i = 1;
                            }
                            linkedHashMap = linkedHashMap2;
                            for (ifx ifxVar3 : gx0Var) {
                                fhxVar = ifxVar3.b.c;
                                if (fhxVar != null) {
                                    m(ifxVar3, g(fhxVar.b.e));
                                }
                                gx0Var2.addLast(ifxVar3);
                            }
                            for (ifx ifxVar4 : gx0Var) {
                                wkxVar.b(ifxVar4.b.a).f(ifxVar4);
                            }
                            z = true;
                        }
                    }
                    linkedHashMap = linkedHashMap2;
                    z = false;
                } else if (ifxVarH == null || (ygxVar2 = ifxVarH.b) == null || dhxVar.e != ygxVar2.b.e) {
                    linkedHashMap = linkedHashMap2;
                    z = false;
                } else {
                    gx0Var = new gx0();
                    while (gx0Var2.size() - i >= iNextIndex) {
                        ifx ifxVar5 = (ifx) p48.C(gx0Var2);
                        x(ifxVar5);
                        LinkedHashMap linkedHashMap4 = linkedHashMap2;
                        ifx ifxVar6 = new ifx(ifxVar5.a, ifxVar5.b, ifxVar5.b.c(bundle), ifxVar5.d, ifxVar5.e, ifxVar5.f, ifxVar5.i);
                        s9s.b bVar2 = ifxVar5.d;
                        lfx lfxVar2 = ifxVar6.v;
                        lfxVar2.getClass();
                        bVar2.getClass();
                        lfxVar2.d = bVar2;
                        lfxVar2.k = ifxVar5.v.k;
                        lfxVar2.b();
                        gx0Var.addFirst(ifxVar6);
                        linkedHashMap2 = linkedHashMap4;
                        i = 1;
                    }
                    linkedHashMap = linkedHashMap2;
                    while (r3.hasNext()) {
                        fhxVar = ifxVar3.b.c;
                        if (fhxVar != null) {
                            m(ifxVar3, g(fhxVar.b.e));
                        }
                        gx0Var2.addLast(ifxVar3);
                    }
                    while (r3.hasNext()) {
                        wkxVar.b(ifxVar4.b.a).f(ifxVar4);
                    }
                    z = true;
                }
            } else {
                linkedHashMap = linkedHashMap2;
                z = false;
            }
            if (!z) {
                ifx ifxVarA = ifx.a.a(this.a.c, ygxVar, bundleC, k(), this.p);
                vkx vkxVarB = wkxVar.b(ygxVar.a);
                List listC = a.c(ifxVarA);
                Function1<? super ifx, Unit> function1 = new Function1() { // from class: zfx
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        ifx ifxVar7 = (ifx) obj2;
                        ifxVar7.getClass();
                        yp40Var.a = true;
                        this.a(ygxVar, bundleC, ifxVar7, m2g.a);
                        return Unit.a;
                    }
                };
                listC.getClass();
                this.v = function1;
                vkxVarB.d(listC, zixVar);
                this.v = null;
            }
        } else if (this.m.containsKey(Integer.valueOf(dhxVar.e))) {
            yp40Var.a = v(dhxVar.e, bundleC, zixVar);
            linkedHashMap = linkedHashMap2;
            z = false;
        } else {
            wkxVar = this.t;
            if (zixVar == null) {
                linkedHashMap = linkedHashMap2;
                z = false;
            } else {
                linkedHashMap = linkedHashMap2;
                z = false;
            }
            if (!z) {
                ifx ifxVarA2 = ifx.a.a(this.a.c, ygxVar, bundleC, k(), this.p);
                vkx vkxVarB2 = wkxVar.b(ygxVar.a);
                List listC2 = a.c(ifxVarA2);
                Function1<? super ifx, Unit> function2 = new Function1() { // from class: zfx
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        ifx ifxVar7 = (ifx) obj2;
                        ifxVar7.getClass();
                        yp40Var.a = true;
                        this.a(ygxVar, bundleC, ifxVar7, m2g.a);
                        return Unit.a;
                    }
                };
                listC2.getClass();
                this.v = function2;
                vkxVarB2.d(listC2, zixVar);
                this.v = null;
            }
        }
        this.b.invoke();
        Iterator it3 = linkedHashMap.values().iterator();
        while (it3.hasNext()) {
            ((yfx.a) it3.next()).d = false;
        }
        if (zQ || yp40Var.a || z) {
            b();
        } else {
            y();
        }
    }

    public final void o(String str, zix zixVar) {
        str.getClass();
        if (this.c == null) {
            zkv.a("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", this, 46);
            return;
        }
        fhx fhxVarL = l();
        ygx.b bVarP = fhxVarL.p(str, true, fhxVarL);
        if (bVarP == null) {
            f87.b(he.a("Navigation destination that matches route ", str, " cannot be found in the navigation graph "), this.c);
            return;
        }
        ygx ygxVar = bVarP.a;
        Bundle bundleC = ygxVar.c(bVarP.b);
        if (bundleC == null) {
            o2g.a.getClass();
            bundleC = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        }
        int i = ygx.f;
        String str2 = ygxVar.b.f;
        Uri uri = Uri.parse(str2 != null ? "android-app://androidx.navigation/".concat(str2) : "");
        uri.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleC.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        n(ygxVar, bundleC, zixVar);
    }

    public final boolean p(int i, boolean z) {
        return q(i, z, false) && b();
    }

    public final boolean q(int i, boolean z, boolean z2) {
        ygx ygxVar;
        dhx dhxVar;
        gx0<ifx> gx0Var = this.f;
        if (gx0Var.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.m0(gx0Var).iterator();
        do {
            if (!it.hasNext()) {
                ygxVar = null;
                break;
            }
            ygxVar = ((ifx) it.next()).b;
            String str = ygxVar.a;
            dhxVar = ygxVar.b;
            vkx vkxVarB = this.t.b(str);
            if (z || dhxVar.e != i) {
                arrayList.add(vkxVarB);
            }
        } while (dhxVar.e != i);
        if (ygxVar != null) {
            return c(arrayList, ygxVar, z, z2);
        }
        int i2 = ygx.f;
        Log.i("NavController", "Ignoring popBackStack to destination " + ygx.a.a(this.a.c, i) + " as it was not found on the current back stack");
        return false;
    }

    public final boolean r(String str, boolean z, boolean z2) {
        ifx ifxVarPrevious;
        boolean zI;
        str.getClass();
        gx0<ifx> gx0Var = this.f;
        if (gx0Var.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator<ifx> listIterator = gx0Var.listIterator(gx0Var.getB());
        do {
            if (!listIterator.hasPrevious()) {
                ifxVarPrevious = null;
                break;
            }
            ifxVarPrevious = listIterator.previous();
            ifx ifxVar = ifxVarPrevious;
            zI = ifxVar.b.i(str, ifxVar.v.a());
            if (z || !zI) {
                arrayList.add(this.t.b(ifxVar.b.a));
            }
        } while (!zI);
        ifx ifxVar2 = ifxVarPrevious;
        ygx ygxVar = ifxVar2 != null ? ifxVar2.b : null;
        if (ygxVar != null) {
            return c(arrayList, ygxVar, z, z2);
        }
        Log.i("NavController", "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
        return false;
    }

    public final void s(ifx ifxVar, boolean z, gx0<rfx> gx0Var) {
        jgx jgxVar;
        v340 v340Var;
        Set set;
        ifxVar.getClass();
        gx0<ifx> gx0Var2 = this.f;
        ifx ifxVarLast = gx0Var2.last();
        if (!Intrinsics.g(ifxVarLast, ifxVar)) {
            StringBuilder sb = new StringBuilder("Attempted to pop ");
            sb.append(ifxVar.b);
            ygx ygxVar = ifxVarLast.b;
            sb.append(", which is not the top of the back stack (");
            sb.append(ygxVar);
            sb.append(')');
            throw new IllegalStateException(sb.toString().toString());
        }
        p48.C(gx0Var2);
        ygx ygxVar2 = ifxVarLast.b;
        lfx lfxVar = ifxVarLast.v;
        yfx.a aVar = (yfx.a) this.u.get(this.t.b(ygxVar2.a));
        boolean z2 = true;
        if ((aVar == null || (v340Var = aVar.f) == null || (set = (Set) v340Var.a.getValue()) == null || !set.contains(ifxVarLast)) && !this.l.containsKey(ifxVarLast)) {
            z2 = false;
        }
        s9s.b bVar = lfxVar.j.d;
        s9s.b bVar2 = s9s.b.c;
        if (bVar.compareTo(bVar2) >= 0) {
            if (z) {
                lfxVar.k = bVar2;
                lfxVar.b();
                gx0Var.addFirst(new rfx(ifxVarLast));
            }
            if (z2) {
                lfxVar.k = bVar2;
                lfxVar.b();
            } else {
                lfxVar.k = s9s.b.a;
                lfxVar.b();
                x(ifxVarLast);
            }
        }
        if (z || z2 || (jgxVar = this.p) == null) {
            return;
        }
        v8i0 v8i0Var = (v8i0) jgxVar.a.remove(ifxVarLast.f);
        if (v8i0Var != null) {
            v8i0Var.a();
        }
    }

    public final ArrayList u() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.u.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((yfx.a) it.next()).f.a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                ifx ifxVar = (ifx) obj;
                if (!arrayList.contains(ifxVar) && ifxVar.v.k.compareTo(s9s.b.d) < 0) {
                    arrayList2.add(obj);
                }
            }
            p48.w(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (ifx ifxVar2 : this.f) {
            ifx ifxVar3 = ifxVar2;
            if (!arrayList.contains(ifxVar3) && ifxVar3.v.k.compareTo(s9s.b.d) >= 0) {
                arrayList3.add(ifxVar2);
            }
        }
        p48.w(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!(((ifx) obj2).b instanceof fhx)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean v(int i, final Bundle bundle, zix zixVar) {
        ygx ygxVarJ;
        ifx ifxVar;
        ygx ygxVar;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.m;
        int i2 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i));
        p48.z(linkedHashMap.values(), new gce(str, 2));
        gx0<rfx> gx0Var = (gx0) y8h0.c(this.n).remove(str);
        ufx ufxVar = this.a.c;
        final ArrayList arrayList = new ArrayList();
        ifx ifxVarI = this.f.i();
        if (ifxVarI == null || (ygxVarJ = ifxVarI.b) == null) {
            ygxVarJ = j();
        }
        if (gx0Var != null) {
            for (rfx rfxVar : gx0Var) {
                sfx sfxVar = rfxVar.a;
                sfx sfxVar2 = rfxVar.a;
                ygx ygxVarE = e(sfxVar.b, ygxVarJ, null, true);
                if (ygxVarE == null) {
                    int i3 = ygx.f;
                    tkx.a(ygx.a.a(ufxVar, sfxVar2.b), "Restore State failed: destination ", " cannot be found from the current destination ", ygxVarJ);
                    return false;
                }
                s9s.b bVarK = k();
                jgx jgxVar = this.p;
                ufxVar.getClass();
                bVarK.getClass();
                Bundle bundle3 = sfxVar2.c;
                if (bundle3 != null) {
                    Context context = ufxVar.a;
                    bundle3.setClassLoader(context != null ? context.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                arrayList.add(new ifx(ufxVar, ygxVarE, bundle2, bVarK, jgxVar, sfxVar2.a, sfxVar2.d));
                ygxVarJ = ygxVarE;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((ifx) obj).b instanceof fhx)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            ifx ifxVar2 = (ifx) obj2;
            List list = (List) CollectionsKt.d0(arrayList2);
            if (Intrinsics.g((list == null || (ifxVar = (ifx) CollectionsKt.b0(list)) == null || (ygxVar = ifxVar.b) == null) ? null : ygxVar.a, ifxVar2.b.a)) {
                list.add(ifxVar2);
            } else {
                arrayList2.add(b.l(ifxVar2));
            }
        }
        final yp40 yp40Var = new yp40();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj3;
            vkx vkxVarB = this.t.b(((ifx) CollectionsKt.T(list2)).b.a);
            final bq40 bq40Var = new bq40();
            this.v = new Function1() { // from class: agx
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    List<ifx> listSubList;
                    ifx ifxVar3 = (ifx) obj4;
                    ifxVar3.getClass();
                    yp40Var.a = true;
                    ArrayList arrayList4 = arrayList;
                    int iIndexOf = arrayList4.indexOf(ifxVar3);
                    if (iIndexOf != -1) {
                        bq40 bq40Var2 = bq40Var;
                        int i6 = iIndexOf + 1;
                        listSubList = arrayList4.subList(bq40Var2.a, i6);
                        bq40Var2.a = i6;
                    } else {
                        listSubList = m2g.a;
                    }
                    this.a(ifxVar3.b, bundle, ifxVar3, listSubList);
                    return Unit.a;
                }
            };
            vkxVarB.d(list2, zixVar);
            this.v = null;
        }
        return yp40Var.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r20v1, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r20v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v9, types: [fhx, ygx] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void w(fhx fhxVar, Bundle bundle) {
        wkx wkxVar;
        Intent intent;
        int[] intArray;
        ?? L;
        ygx.b bVarO;
        String strA;
        ygx ygxVarB;
        fhx fhxVar2;
        int i;
        Bundle bundle2;
        ygx ygxVarB2;
        fhx fhxVar3;
        fhxVar.getClass();
        lhx lhxVar = fhxVar.i;
        gx0<ifx> gx0Var = this.f;
        if (!gx0Var.isEmpty() && k() == s9s.b.a) {
            ib5.a("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
            return;
        }
        if (Intrinsics.g(this.c, fhxVar)) {
            int iE = lhxVar.b.e();
            for (int i2 = 0; i2 < iE; i2++) {
                ygx ygxVarF = lhxVar.b.f(i2);
                fhx fhxVar4 = this.c;
                fhxVar4.getClass();
                int iC = fhxVar4.i.b.c(i2);
                fhx fhxVar5 = this.c;
                fhxVar5.getClass();
                esa0<ygx> esa0Var = fhxVar5.i.b;
                if (esa0Var.a) {
                    fsa0.b(esa0Var);
                }
                int iA = bza.a(esa0Var.d, iC, esa0Var.b);
                if (iA >= 0) {
                    Object[] objArr = esa0Var.c;
                    Object obj = objArr[iA];
                    objArr[iA] = ygxVarF;
                }
            }
            for (ifx ifxVar : gx0Var) {
                int i3 = ygx.f;
                List listK = ld80.k(ygx.a.b(ifxVar.b));
                listK.getClass();
                ep50 ep50Var = new ep50(listK);
                ygx ygxVarB3 = this.c;
                ygxVarB3.getClass();
                Iterator it = ep50Var.iterator();
                while (true) {
                    ListIterator listIterator = ((ep50.a) it).a;
                    if (listIterator.hasPrevious()) {
                        ygx ygxVar = (ygx) listIterator.previous();
                        if (!Intrinsics.g(ygxVar, this.c) || !ygxVarB3.equals(fhxVar)) {
                            if (ygxVarB3 instanceof fhx) {
                                ygxVarB3 = ((fhx) ygxVarB3).i.b(ygxVar.b.e);
                                ygxVarB3.getClass();
                            }
                        }
                    }
                }
                ifxVar.b = ygxVarB3;
            }
            return;
        }
        fhx fhxVar6 = this.c;
        LinkedHashMap linkedHashMap = this.u;
        ygx ygxVar2 = null;
        boolean z = true;
        if (fhxVar6 != null) {
            ArrayList arrayList = new ArrayList(this.m.keySet());
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                Integer num = (Integer) obj2;
                num.getClass();
                int iIntValue = num.intValue();
                Iterator it2 = linkedHashMap.values().iterator();
                while (it2.hasNext()) {
                    ((yfx.a) it2.next()).d = true;
                }
                boolean zV = v(iIntValue, null, bjx.a(new cgx()));
                Iterator it3 = linkedHashMap.values().iterator();
                while (it3.hasNext()) {
                    ((yfx.a) it3.next()).d = false;
                }
                if (zV) {
                    q(iIntValue, true, false);
                }
            }
            q(fhxVar6.b.e, true, false);
        }
        this.c = fhxVar;
        final yfx yfxVar = this.a;
        igx igxVar = yfxVar.b;
        ufx ufxVar = yfxVar.c;
        Bundle bundle3 = this.d;
        wkx wkxVar2 = this.t;
        if (bundle3 != null && bundle3.containsKey("android-support-nav:controller:navigatorState:names")) {
            ArrayList<String> stringArrayList = bundle3.getStringArrayList("android-support-nav:controller:navigatorState:names");
            if (stringArrayList == null) {
                s5b.a("android-support-nav:controller:navigatorState:names");
                throw null;
            }
            int size2 = stringArrayList.size();
            int i5 = 0;
            while (i5 < size2) {
                String str = stringArrayList.get(i5);
                i5++;
                String str2 = str;
                vkx vkxVarB = wkxVar2.b(str2);
                if (bundle3.containsKey(str2)) {
                    boolean z2 = z;
                    Bundle bundle4 = bundle3.getBundle(str2);
                    if (bundle4 == null) {
                        s5b.a(str2);
                        throw null;
                    }
                    vkxVarB.g(bundle4);
                    z = z2;
                }
            }
        }
        boolean z3 = z;
        Bundle[] bundleArr = this.e;
        if (bundleArr != null) {
            int length = bundleArr.length;
            int i6 = 0;
            while (i6 < length) {
                Bundle bundle5 = bundleArr[i6];
                bundle5.getClass();
                bundle5.setClassLoader(rfx.class.getClassLoader());
                String strD = hv60.d("nav-entry-state:id", bundle5);
                int iB = hv60.b("nav-entry-state:destination-id", bundle5);
                int i7 = i6;
                ?? bundle6 = bundle5.getBundle("nav-entry-state:args");
                if (bundle6 == 0) {
                    ?? r20 = ygxVar2;
                    s5b.a("nav-entry-state:args");
                    throw r20;
                }
                Bundle bundle7 = bundle5.getBundle("nav-entry-state:saved-state");
                if (bundle7 == null) {
                    ?? r21 = ygxVar2;
                    s5b.a("nav-entry-state:saved-state");
                    throw r21;
                }
                int i8 = length;
                ygx ygxVarD = d(iB, ygxVar2);
                if (ygxVarD == null) {
                    int i9 = ygx.f;
                    lpd0.a(he.a("Restoring the Navigation back stack failed: destination ", ygx.a.a(ufxVar, iB), " cannot be found from the current destination "), i());
                    return;
                }
                s9s.b bVarK = k();
                jgx jgxVar = this.p;
                ufxVar.getClass();
                bVarK.getClass();
                ygx ygxVar3 = ygxVar2;
                Context context = ufxVar.a;
                bundle6.setClassLoader(context != null ? context.getClassLoader() : ygxVar3);
                wkx wkxVar3 = wkxVar2;
                ifx ifxVar2 = new ifx(ufxVar, ygxVarD, bundle6, bVarK, jgxVar, strD, bundle7);
                vkx vkxVarB2 = wkxVar3.b(ygxVarD.a);
                Object aVar = linkedHashMap.get(vkxVarB2);
                if (aVar == null) {
                    aVar = new yfx.a(yfxVar, vkxVarB2);
                    linkedHashMap.put(vkxVarB2, aVar);
                }
                gx0Var.addLast(ifxVar2);
                ((yfx.a) aVar).i(ifxVar2);
                fhx fhxVar7 = ifxVar2.b.c;
                if (fhxVar7 != null) {
                    m(ifxVar2, g(fhxVar7.b.e));
                }
                i6 = i7 + 1;
                wkxVar2 = wkxVar3;
                length = i8;
                ygxVar2 = ygxVar3;
            }
            ?? r22 = ygxVar2;
            wkxVar = wkxVar2;
            this.b.invoke();
            this.e = r22;
        } else {
            wkxVar = wkxVar2;
        }
        Collection collectionValues = kpu.l(wkxVar.a).values();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : collectionValues) {
            if (!((vkx) obj3).b) {
                arrayList2.add(obj3);
            }
        }
        int size3 = arrayList2.size();
        int i10 = 0;
        while (i10 < size3) {
            Object obj4 = arrayList2.get(i10);
            i10++;
            vkx vkxVar = (vkx) obj4;
            Object aVar2 = linkedHashMap.get(vkxVar);
            if (aVar2 == null) {
                vkxVar.getClass();
                aVar2 = new yfx.a(yfxVar, vkxVar);
                linkedHashMap.put(vkxVar, aVar2);
            }
            vkxVar.e((yfx.a) aVar2);
        }
        if (this.c == null || !gx0Var.isEmpty()) {
            b();
            return;
        }
        Activity activity = yfxVar.d;
        if (!yfxVar.e && activity != null && (intent = activity.getIntent()) != null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                } catch (Exception e) {
                    Log.e("NavController", "handleDeepLink() could not extract deepLink from " + intent, e);
                    intArray = null;
                }
            } else {
                intArray = null;
            }
            ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
            o2g.a.getClass();
            Bundle bundleA = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Bundle bundle8 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
            if (bundle8 != null) {
                bundleA.putAll(bundle8);
            }
            if ((intArray == null || intArray.length == 0) && (bVarO = (L = igxVar.l()).o(new ugx(intent.getData(), intent.getAction(), intent.getType()), L)) != null) {
                ygx ygxVar4 = bVarO.a;
                int[] iArrD = ygxVar4.d(null);
                Bundle bundleC = ygxVar4.c(bVarO.b);
                if (bundleC != null) {
                    bundleA.putAll(bundleC);
                }
                intArray = iArrD;
                parcelableArrayList = null;
            }
            if (intArray != null && intArray.length != 0) {
                igxVar.getClass();
                fhx fhxVar8 = igxVar.c;
                int length2 = intArray.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        strA = null;
                        break;
                    }
                    int i12 = intArray[i11];
                    if (i11 == 0) {
                        fhx fhxVar9 = igxVar.c;
                        fhxVar9.getClass();
                        ygxVarB2 = fhxVar9.b.e == i12 ? igxVar.c : null;
                    } else {
                        fhxVar8.getClass();
                        ygxVarB2 = fhxVar8.i.b(i12);
                    }
                    if (ygxVarB2 == null) {
                        int i13 = ygx.f;
                        strA = ygx.a.a(igxVar.a.c, i12);
                        break;
                    }
                    if (i11 != intArray.length - 1 && (ygxVarB2 instanceof fhx)) {
                        while (true) {
                            fhxVar3 = (fhx) ygxVarB2;
                            fhxVar3.getClass();
                            lhx lhxVar2 = fhxVar3.i;
                            if (!(lhxVar2.b(lhxVar2.c) instanceof fhx)) {
                                break;
                            } else {
                                ygxVarB2 = lhxVar2.b(lhxVar2.c);
                            }
                        }
                        fhxVar8 = fhxVar3;
                    }
                    i11++;
                }
                if (strA == null) {
                    bundleA.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                    int length3 = intArray.length;
                    Bundle[] bundleArr2 = new Bundle[length3];
                    for (int i14 = 0; i14 < length3; i14++) {
                        o2g.a.getClass();
                        Bundle bundleA2 = vj5.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
                        bundleA2.putAll(bundleA);
                        if (parcelableArrayList != null && (bundle2 = (Bundle) parcelableArrayList.get(i14)) != null) {
                            bundleA2.putAll(bundle2);
                        }
                        bundleArr2[i14] = bundleA2;
                    }
                    int flags = intent.getFlags();
                    int i15 = 268435456 & flags;
                    if (i15 != 0 && (flags & 32768) == 0) {
                        intent.addFlags(32768);
                        v5f0 v5f0Var = new v5f0(yfxVar.a);
                        ComponentName component = intent.getComponent();
                        if (component == null) {
                            component = intent.resolveActivity(v5f0Var.b.getPackageManager());
                        }
                        if (component != null) {
                            v5f0Var.a(component);
                        }
                        v5f0Var.a.add(intent);
                        v5f0Var.b();
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                        return;
                    }
                    if (i15 != 0 ? z3 : false) {
                        if (igxVar.f.isEmpty()) {
                            i = 0;
                        } else {
                            fhx fhxVar10 = igxVar.c;
                            fhxVar10.getClass();
                            i = 0;
                            igxVar.q(fhxVar10.b.e, z3, false);
                        }
                        while (i < intArray.length) {
                            int i16 = intArray[i];
                            int i17 = i + 1;
                            Bundle bundle9 = bundleArr2[i];
                            final ygx ygxVarD2 = igxVar.d(i16, null);
                            if (ygxVarD2 == null) {
                                int i18 = ygx.f;
                                lpd0.a(he.a("Deep Linking failed: destination ", ygx.a.a(ufxVar, i16), " cannot be found from the current destination "), igxVar.i());
                                return;
                            } else {
                                igxVar.n(ygxVarD2, bundle9, bjx.a(new Function1() { // from class: xfx
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        igx igxVar2 = yfxVar.b;
                                        ajx ajxVar = (ajx) obj5;
                                        ajxVar.getClass();
                                        td0 td0Var = new td0();
                                        Unit unit = Unit.a;
                                        zix.a aVar3 = ajxVar.a;
                                        aVar3.f = 0;
                                        aVar3.g = 0;
                                        aVar3.h = td0Var.a;
                                        aVar3.i = td0Var.b;
                                        ygx ygxVar5 = ygxVarD2;
                                        if (ygxVar5 instanceof fhx) {
                                            int i19 = ygx.f;
                                            for (ygx ygxVar6 : ygx.a.b(ygxVar5)) {
                                                ygx ygxVarI = igxVar2.i();
                                                if (Intrinsics.g(ygxVar6, ygxVarI != null ? ygxVarI.c : null)) {
                                                }
                                            }
                                            int i20 = fhx.v;
                                            ajxVar.a(fhx.a.a(igxVar2.j()).b.e);
                                            i220 i220Var = new i220();
                                            i220Var.b = true;
                                            Unit unit2 = Unit.a;
                                            ajxVar.f = i220Var.a;
                                            ajxVar.g = true;
                                        }
                                        return Unit.a;
                                    }
                                }));
                                i = i17;
                            }
                        }
                        yfxVar.e = true;
                        return;
                    }
                    fhx fhxVar11 = igxVar.c;
                    int length4 = intArray.length;
                    for (int i19 = 0; i19 < length4; i19++) {
                        int i20 = intArray[i19];
                        Bundle bundle10 = bundleArr2[i19];
                        if (i19 == 0) {
                            ygxVarB = igxVar.c;
                        } else {
                            fhxVar11.getClass();
                            ygxVarB = fhxVar11.i.b(i20);
                        }
                        if (ygxVarB == null) {
                            int i21 = ygx.f;
                            nke.a(ygx.a.a(ufxVar, i20), "Deep Linking failed: destination ", " cannot be found in graph ", fhxVar11);
                            return;
                        }
                        if (i19 == intArray.length - 1) {
                            fhx fhxVar12 = igxVar.c;
                            fhxVar12.getClass();
                            igxVar.n(ygxVarB, bundle10, new zix(false, false, fhxVar12.b.e, true, false, 0, 0, -1, -1));
                        } else if (ygxVarB instanceof fhx) {
                            while (true) {
                                fhxVar2 = (fhx) ygxVarB;
                                fhxVar2.getClass();
                                lhx lhxVar3 = fhxVar2.i;
                                if (!(lhxVar3.b(lhxVar3.c) instanceof fhx)) {
                                    break;
                                } else {
                                    ygxVarB = lhxVar3.b(lhxVar3.c);
                                }
                            }
                            fhxVar11 = fhxVar2;
                        }
                    }
                    yfxVar.e = true;
                    return;
                }
                Log.i("NavController", "Could not find destination " + strA + " in the navigation graph, ignoring the deep link from " + intent);
            }
        }
        fhx fhxVar13 = this.c;
        fhxVar13.getClass();
        n(fhxVar13, bundle, null);
    }

    public final void x(ifx ifxVar) {
        ifxVar.getClass();
        ifx ifxVar2 = (ifx) this.k.remove(ifxVar);
        if (ifxVar2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.l;
        t11 t11Var = (t11) linkedHashMap.get(ifxVar2);
        Integer numValueOf = t11Var != null ? Integer.valueOf(t11Var.a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            yfx.a aVar = (yfx.a) this.u.get(this.t.b(ifxVar2.b.a));
            if (aVar != null) {
                aVar.b(ifxVar2);
            }
            linkedHashMap.remove(ifxVar2);
        }
    }

    public final void y() {
        t11 t11Var;
        v340 v340Var;
        Set set;
        ArrayList arrayListC0 = CollectionsKt.C0(this.f);
        if (arrayListC0.isEmpty()) {
            return;
        }
        ArrayList arrayListL = b.l(((ifx) CollectionsKt.b0(arrayListC0)).b);
        ArrayList arrayList = new ArrayList();
        if (CollectionsKt.b0(arrayListL) instanceof jyh) {
            Iterator it = CollectionsKt.m0(arrayListC0).iterator();
            while (it.hasNext()) {
                ygx ygxVar = ((ifx) it.next()).b;
                arrayList.add(ygxVar);
                if (!(ygxVar instanceof jyh) && !(ygxVar instanceof fhx)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (ifx ifxVar : CollectionsKt.m0(arrayListC0)) {
            lfx lfxVar = ifxVar.v;
            s9s.b bVar = lfxVar.k;
            ygx ygxVar2 = ifxVar.b;
            ygx ygxVar3 = (ygx) CollectionsKt.firstOrNull(arrayListL);
            if (ygxVar3 != null && ygxVar3.b.e == ygxVar2.b.e) {
                s9s.b bVar2 = s9s.b.e;
                if (bVar != bVar2) {
                    yfx.a aVar = (yfx.a) this.u.get(this.t.b(ifxVar.b.a));
                    if (Intrinsics.g((aVar == null || (v340Var = aVar.f) == null || (set = (Set) v340Var.a.getValue()) == null) ? null : Boolean.valueOf(set.contains(ifxVar)), Boolean.TRUE) || ((t11Var = (t11) this.l.get(ifxVar)) != null && t11Var.a.get() == 0)) {
                        map.put(ifxVar, s9s.b.d);
                    } else {
                        map.put(ifxVar, bVar2);
                    }
                }
                ygx ygxVar4 = (ygx) CollectionsKt.firstOrNull(arrayList);
                if (ygxVar4 != null && ygxVar4.b.e == ygxVar2.b.e) {
                    p48.B(arrayList);
                }
                p48.B(arrayListL);
                fhx fhxVar = ygxVar2.c;
                if (fhxVar != null) {
                    arrayListL.add(fhxVar);
                }
            } else if (arrayList.isEmpty() || ygxVar2.b.e != ((ygx) CollectionsKt.T(arrayList)).b.e) {
                lfxVar.k = s9s.b.c;
                lfxVar.b();
            } else {
                ygx ygxVar5 = (ygx) p48.B(arrayList);
                if (bVar == s9s.b.e) {
                    lfxVar.k = s9s.b.d;
                    lfxVar.b();
                } else {
                    s9s.b bVar3 = s9s.b.d;
                    if (bVar != bVar3) {
                        map.put(ifxVar, bVar3);
                    }
                }
                fhx fhxVar2 = ygxVar5.c;
                if (fhxVar2 != null && !arrayList.contains(fhxVar2)) {
                    arrayList.add(fhxVar2);
                }
            }
        }
        int size = arrayListC0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListC0.get(i);
            i++;
            ifx ifxVar2 = (ifx) obj;
            s9s.b bVar4 = (s9s.b) map.get(ifxVar2);
            if (bVar4 != null) {
                ifxVar2.getClass();
                lfx lfxVar2 = ifxVar2.v;
                lfxVar2.k = bVar4;
                lfxVar2.b();
            } else {
                ifxVar2.v.b();
            }
        }
    }
}
