package yads;

import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f157027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f157028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f157029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Random f157030d;

    public vo() {
        this(new Random());
    }

    public static int a(uo uoVar, uo uoVar2) {
        int iCompare = Integer.compare(uoVar.f156523c, uoVar2.f156523c);
        return iCompare != 0 ? iCompare : uoVar.f156522b.compareTo(uoVar2.f156522b);
    }

    public final uo b(p51 p51Var) {
        uo uoVar;
        ArrayList arrayListA = a(p51Var);
        if (arrayListA.size() < 2) {
            Iterator it = arrayListA.iterator();
            return (uo) (it.hasNext() ? it.next() : null);
        }
        Collections.sort(arrayListA, new Comparator() { // from class: yads.wc4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return vo.a((uo) obj, (uo) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int i10 = ((uo) arrayListA.get(0)).f156523c;
        for (int i11 = 0; i11 < arrayListA.size(); i11++) {
            uo uoVar2 = (uo) arrayListA.get(i11);
            if (i10 != uoVar2.f156523c) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (uo) arrayListA.get(0);
            }
            arrayList.add(new Pair(uoVar2.f156522b, Integer.valueOf(uoVar2.f156524d)));
        }
        uo uoVar3 = (uo) this.f157029c.get(arrayList);
        if (uoVar3 != null) {
            return uoVar3;
        }
        List listSubList = arrayListA.subList(0, arrayList.size());
        int i12 = 0;
        for (int i13 = 0; i13 < listSubList.size(); i13++) {
            i12 += ((uo) listSubList.get(i13)).f156524d;
        }
        int iNextInt = this.f157030d.nextInt(i12);
        int i14 = 0;
        for (int i15 = 0; i15 < listSubList.size(); i15++) {
            uoVar = (uo) listSubList.get(i15);
            i14 += uoVar.f156524d;
            if (iNextInt < i14) {
                this.f157029c.put(arrayList, uoVar);
                return uoVar;
            }
        }
        uoVar = (uo) vd1.a(listSubList);
        this.f157029c.put(arrayList, uoVar);
        return uoVar;
    }

    public vo(Random random) {
        this.f157029c = new HashMap();
        this.f157030d = random;
        this.f157027a = new HashMap();
        this.f157028b = new HashMap();
    }

    public static void a(long j10, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j10) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            map.remove(arrayList.get(i10));
        }
    }

    public final ArrayList a(p51 p51Var) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        a(jElapsedRealtime, this.f157027a);
        a(jElapsedRealtime, this.f157028b);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < p51Var.size(); i10++) {
            uo uoVar = (uo) p51Var.get(i10);
            if (!this.f157027a.containsKey(uoVar.f156522b) && !this.f157028b.containsKey(Integer.valueOf(uoVar.f156523c))) {
                arrayList.add(uoVar);
            }
        }
        return arrayList;
    }
}
