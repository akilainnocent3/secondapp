package defpackage;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class hp8 implements ao8, go8 {
    public static final cp8 h = new cp8();
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashSet d;
    public final clg e;
    public final AtomicReference<Boolean> f;
    public final lo8 g;

    public hp8(ArrayList arrayList, ArrayList arrayList2, lo8 lo8Var) {
        ich0 ich0Var = ich0.a;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.f = new AtomicReference<>();
        clg clgVar = new clg();
        this.e = clgVar;
        this.g = lo8Var;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(kn8.c(clgVar, clg.class, aee0.class, n830.class));
        int i = 0;
        arrayList3.add(kn8.c(this, go8.class, new Class[0]));
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            kn8 kn8Var = (kn8) obj;
            if (kn8Var != null) {
                arrayList3.add(kn8Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((n730) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.g.a(componentRegistrar));
                        it.remove();
                    }
                } catch (g0p e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                for (Object obj3 : ((kn8) it2.next()).b.toArray()) {
                    if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.d.contains(obj3.toString())) {
                            it2.remove();
                            break;
                        }
                        this.d.add(obj3.toString());
                    }
                }
            }
            if (this.a.isEmpty()) {
                jlc.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.a.keySet());
                arrayList6.addAll(arrayList3);
                jlc.a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj4 = arrayList3.get(i4);
                i4++;
                final kn8 kn8Var2 = (kn8) obj4;
                this.a.put(kn8Var2, new utr(new n730() { // from class: dp8
                    @Override // defpackage.n730
                    public final Object get() {
                        kn8 kn8Var3 = kn8Var2;
                        return kn8Var3.f.a(new hi50(kn8Var3, this.a));
                    }
                }));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        int size4 = arrayList5.size();
        while (i < size4) {
            Object obj5 = arrayList5.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = this.f.get();
        if (bool != null) {
            h(this.a, bool.booleanValue());
        }
    }

    @Override // defpackage.ao8
    public final synchronized <T> n730<Set<T>> b(bb30<T> bb30Var) {
        u0s u0sVar = (u0s) this.c.get(bb30Var);
        if (u0sVar != null) {
            return u0sVar;
        }
        return h;
    }

    @Override // defpackage.ao8
    public final synchronized <T> n730<T> c(bb30<T> bb30Var) {
        tmy.a(bb30Var, "Null interface requested.");
        return (n730) this.b.get(bb30Var);
    }

    @Override // defpackage.ao8
    public final <T> njd<T> g(bb30<T> bb30Var) {
        n730<T> n730VarC = c(bb30Var);
        if (n730VarC == null) {
            return new q2z(q2z.c, q2z.d);
        }
        return n730VarC instanceof q2z ? (q2z) n730VarC : new q2z(null, n730VarC);
    }

    public final void h(HashMap map, boolean z) {
        ArrayDeque<thg> arrayDeque;
        Set<Map.Entry> setEntrySet;
        for (Map.Entry entry : map.entrySet()) {
            kn8 kn8Var = (kn8) entry.getKey();
            n730 n730Var = (n730) entry.getValue();
            int i = kn8Var.d;
            if (i == 1 || (i == 2 && z)) {
                n730Var.get();
            }
        }
        clg clgVar = this.e;
        synchronized (clgVar) {
            try {
                arrayDeque = clgVar.b;
                if (arrayDeque != null) {
                    clgVar.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            for (final thg thgVar : arrayDeque) {
                thgVar.getClass();
                synchronized (clgVar) {
                    try {
                        ArrayDeque arrayDeque2 = clgVar.b;
                        if (arrayDeque2 != null) {
                            arrayDeque2.add(thgVar);
                        } else {
                            synchronized (clgVar) {
                                try {
                                    Map map2 = (Map) clgVar.a.get(null);
                                    setEntrySet = map2 == null ? Collections.EMPTY_SET : map2.entrySet();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            for (final Map.Entry entry2 : setEntrySet) {
                                ((Executor) entry2.getValue()).execute(new Runnable() { // from class: blg
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ((gpg) entry2.getKey()).a(thgVar);
                                    }
                                });
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void i() {
        HashMap map = this.b;
        HashMap map2 = this.c;
        for (kn8 kn8Var : this.a.keySet()) {
            for (rmd rmdVar : kn8Var.c) {
                boolean z = rmdVar.b == 2;
                bb30<?> bb30Var = rmdVar.a;
                if (z && !map2.containsKey(bb30Var)) {
                    Set set = Collections.EMPTY_SET;
                    u0s u0sVar = new u0s();
                    u0sVar.b = null;
                    u0sVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    u0sVar.a.addAll(set);
                    map2.put(bb30Var, u0sVar);
                } else if (map.containsKey(bb30Var)) {
                    continue;
                } else {
                    int i = rmdVar.b;
                    if (i == 1) {
                        throw new tqv("Unsatisfied dependency for component " + kn8Var + ": " + bb30Var);
                    }
                    if (i != 2) {
                        map.put(bb30Var, new q2z(q2z.c, q2z.d));
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            kn8 kn8Var = (kn8) obj;
            if (kn8Var.e == 0) {
                n730 n730Var = (n730) this.a.get(kn8Var);
                Iterator it = kn8Var.b.iterator();
                while (it.hasNext()) {
                    bb30 bb30Var = (bb30) it.next();
                    HashMap map = this.b;
                    if (map.containsKey(bb30Var)) {
                        arrayList2.add(new ep8(0, (q2z) ((n730) map.get(bb30Var)), n730Var));
                    } else {
                        map.put(bb30Var, n730Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final ArrayList k() {
        HashMap map = this.c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            kn8 kn8Var = (kn8) entry.getKey();
            if (kn8Var.e != 0) {
                n730 n730Var = (n730) entry.getValue();
                Iterator it = kn8Var.b.iterator();
                while (it.hasNext()) {
                    bb30 bb30Var = (bb30) it.next();
                    if (!map2.containsKey(bb30Var)) {
                        map2.put(bb30Var, new HashSet());
                    }
                    ((Set) map2.get(bb30Var)).add(n730Var);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                u0s u0sVar = (u0s) map.get(entry2.getKey());
                Iterator it2 = ((Set) entry2.getValue()).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new fp8(0, u0sVar, (n730) it2.next()));
                }
            } else {
                bb30 bb30Var2 = (bb30) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                u0s u0sVar2 = new u0s();
                u0sVar2.b = null;
                u0sVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                u0sVar2.a.addAll(set);
                map.put(bb30Var2, u0sVar2);
            }
        }
        return arrayList;
    }
}
