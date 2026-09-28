package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d36 {
    public final Executor a;
    public g26 c;
    public h36 d;
    public tcy<List<k26>> e;
    public final Object b = new Object();
    public final b f = new b();
    public volatile List<k26> g = m2g.a;
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final CopyOnWriteArrayList<pyo> i = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<a> j = new CopyOnWriteArrayList<>();
    public final LinkedHashMap k = new LinkedHashMap();

    public static final class a {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ListenerWrapper(listener=null, executor=null)";
        }
    }

    public final class b implements tcy.a<List<? extends k26>> {
        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0059 A[LOOP:1: B:17:0x0053->B:19:0x0059, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:23:0x0084  */
        /* JADX WARN: Code duplicated, block: B:25:0x00ae A[LOOP:2: B:24:0x00ac->B:25:0x00ae, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:29:0x00cb A[Catch: Exception -> 0x00d9, LOOP:3: B:27:0x00c5->B:29:0x00cb, LOOP_END, TryCatch #1 {Exception -> 0x00d9, blocks: (B:26:0x00be, B:27:0x00c5, B:29:0x00cb, B:32:0x00dc, B:34:0x00e0, B:35:0x00f0, B:37:0x00f8, B:38:0x011d, B:40:0x0123, B:41:0x0130, B:42:0x0139, B:44:0x013f, B:45:0x014d), top: B:74:0x00be }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00e0 A[Catch: Exception -> 0x00d9, TryCatch #1 {Exception -> 0x00d9, blocks: (B:26:0x00be, B:27:0x00c5, B:29:0x00cb, B:32:0x00dc, B:34:0x00e0, B:35:0x00f0, B:37:0x00f8, B:38:0x011d, B:40:0x0123, B:41:0x0130, B:42:0x0139, B:44:0x013f, B:45:0x014d), top: B:74:0x00be }] */
        /* JADX WARN: Code duplicated, block: B:37:0x00f8 A[Catch: Exception -> 0x00d9, TryCatch #1 {Exception -> 0x00d9, blocks: (B:26:0x00be, B:27:0x00c5, B:29:0x00cb, B:32:0x00dc, B:34:0x00e0, B:35:0x00f0, B:37:0x00f8, B:38:0x011d, B:40:0x0123, B:41:0x0130, B:42:0x0139, B:44:0x013f, B:45:0x014d), top: B:74:0x00be }] */
        /* JADX WARN: Code duplicated, block: B:40:0x0123 A[Catch: Exception -> 0x00d9, LOOP:4: B:38:0x011d->B:40:0x0123, LOOP_END, TryCatch #1 {Exception -> 0x00d9, blocks: (B:26:0x00be, B:27:0x00c5, B:29:0x00cb, B:32:0x00dc, B:34:0x00e0, B:35:0x00f0, B:37:0x00f8, B:38:0x011d, B:40:0x0123, B:41:0x0130, B:42:0x0139, B:44:0x013f, B:45:0x014d), top: B:74:0x00be }] */
        /* JADX WARN: Code duplicated, block: B:44:0x013f A[Catch: Exception -> 0x00d9, LOOP:5: B:42:0x0139->B:44:0x013f, LOOP_END, TryCatch #1 {Exception -> 0x00d9, blocks: (B:26:0x00be, B:27:0x00c5, B:29:0x00cb, B:32:0x00dc, B:34:0x00e0, B:35:0x00f0, B:37:0x00f8, B:38:0x011d, B:40:0x0123, B:41:0x0130, B:42:0x0139, B:44:0x013f, B:45:0x014d), top: B:74:0x00be }] */
        /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:37:0x00f8, please report this as an issue */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // tcy.a
        public final void a(List<? extends k26> list) {
            g26 g26Var;
            List<String> list2;
            ArrayList arrayList;
            d36 d36Var;
            List listA0;
            Set<k26> setD;
            Set<k26> setD2;
            ArrayList arrayList2;
            ArrayList arrayList3;
            int size;
            int i;
            Iterator<T> it;
            h36 h36Var;
            Iterator<T> it2;
            List<? extends k26> list3 = list;
            if (d36.this.h.get() && (g26Var = d36.this.c) != null) {
                try {
                    if (list3 != null) {
                        ArrayList arrayList4 = new ArrayList(l48.r(list3, 10));
                        Iterator<T> it3 = list3.iterator();
                        while (true) {
                            list2 = arrayList4;
                            if (!it3.hasNext()) {
                                break;
                            } else {
                                arrayList4.add(((k26) it3.next()).a());
                            }
                        }
                        g26Var.d(list2);
                        LinkedHashSet<String> linkedHashSetC = g26Var.c();
                        arrayList = new ArrayList(l48.r(linkedHashSetC, 10));
                        for (String str : linkedHashSetC) {
                            str.getClass();
                            arrayList.add(new k26(kotlin.collections.b.l(str), null));
                        }
                        d36Var = d36.this;
                        listA0 = CollectionsKt.A0(d36Var.g);
                        if (arrayList.equals(listA0)) {
                            return;
                        }
                        Set setE0 = CollectionsKt.E0(listA0);
                        Set setE1 = CollectionsKt.E0(arrayList);
                        setD = yi80.d(setE1, setE0);
                        setD2 = yi80.d(setE0, setE1);
                        arrayList2 = new ArrayList();
                        arrayList3 = new ArrayList(l48.r(arrayList, 10));
                        size = arrayList.size();
                        i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            arrayList3.add(((k26) obj).a());
                        }
                        try {
                            it = setD2.iterator();
                            while (it.hasNext()) {
                                d36Var.c(((k26) it.next()).a());
                            }
                            h36Var = d36Var.d;
                            if (h36Var != null) {
                                pgt.a("CameraPresencePrvdr", "Updating CameraRepository...");
                                h36Var.a(arrayList3);
                                arrayList2.add(h36Var);
                                pgt.a("CameraPresencePrvdr", "CameraRepository updated successfully.");
                            }
                            if (!d36Var.i.isEmpty()) {
                                pgt.a("CameraPresencePrvdr", "Updating " + d36Var.i.size() + " dependent listeners...");
                                for (pyo pyoVar : d36Var.i) {
                                    pyoVar.a(arrayList3);
                                    arrayList2.add(pyoVar);
                                }
                            }
                            d36Var.g = arrayList;
                            it2 = setD.iterator();
                            while (it2.hasNext()) {
                                d36Var.a(((k26) it2.next()).a());
                            }
                            d36Var.b(setD, setD2);
                        } catch (Exception e) {
                            pgt.d("CameraPresencePrvdr", "A core module failed to update. Rolling back changes.", e);
                            ArrayList arrayList5 = new ArrayList(l48.r(listA0, 10));
                            Iterator it4 = listA0.iterator();
                            while (it4.hasNext()) {
                                arrayList5.add(((k26) it4.next()).a());
                            }
                            Iterator it5 = new dp50(arrayList2).iterator();
                            while (true) {
                                dp50.a aVar = (dp50.a) it5;
                                if (!aVar.a.hasPrevious()) {
                                    break;
                                }
                                pyo pyoVar2 = (pyo) aVar.a.previous();
                                try {
                                    pyoVar2.a(arrayList5);
                                } catch (Exception e2) {
                                    pgt.d("CameraPresencePrvdr", "Failed to rollback listener: " + pyoVar2, e2);
                                }
                            }
                            Iterator<T> it6 = setD2.iterator();
                            while (it6.hasNext()) {
                                d36Var.a(((k26) it6.next()).a());
                            }
                            Iterator<T> it7 = setD.iterator();
                            while (it7.hasNext()) {
                                d36Var.c(((k26) it7.next()).a());
                            }
                            return;
                        }
                    }
                    list2 = m2g.a;
                    g26Var.d(list2);
                    LinkedHashSet<String> linkedHashSetC2 = g26Var.c();
                    arrayList = new ArrayList(l48.r(linkedHashSetC2, 10));
                    while (r11.hasNext()) {
                        str.getClass();
                        arrayList.add(new k26(kotlin.collections.b.l(str), null));
                    }
                    d36Var = d36.this;
                    listA0 = CollectionsKt.A0(d36Var.g);
                    if (arrayList.equals(listA0)) {
                        return;
                    }
                    Set setE2 = CollectionsKt.E0(listA0);
                    Set setE3 = CollectionsKt.E0(arrayList);
                    setD = yi80.d(setE3, setE2);
                    setD2 = yi80.d(setE2, setE3);
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList(l48.r(arrayList, 10));
                    size = arrayList.size();
                    i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        arrayList3.add(((k26) obj2).a());
                    }
                    it = setD2.iterator();
                    while (it.hasNext()) {
                        d36Var.c(((k26) it.next()).a());
                    }
                    h36Var = d36Var.d;
                    if (h36Var != null) {
                        pgt.a("CameraPresencePrvdr", "Updating CameraRepository...");
                        h36Var.a(arrayList3);
                        arrayList2.add(h36Var);
                        pgt.a("CameraPresencePrvdr", "CameraRepository updated successfully.");
                    }
                    if (!d36Var.i.isEmpty()) {
                        pgt.a("CameraPresencePrvdr", "Updating " + d36Var.i.size() + " dependent listeners...");
                        while (r7.hasNext()) {
                            pyoVar.a(arrayList3);
                            arrayList2.add(pyoVar);
                        }
                    }
                    d36Var.g = arrayList;
                    it2 = setD.iterator();
                    while (it2.hasNext()) {
                        d36Var.a(((k26) it2.next()).a());
                    }
                    d36Var.b(setD, setD2);
                } catch (Exception e3) {
                    pgt.d("CameraPresencePrvdr", "CameraFactory failed to update. Triggering refresh.", e3);
                    tcy<List<k26>> tcyVar = d36.this.e;
                    if (tcyVar != null) {
                        tcyVar.a();
                    }
                }
            }
        }

        @Override // tcy.a
        public final void onError(Throwable th) {
            th.getClass();
            d36 d36Var = d36.this;
            if (d36Var.h.get()) {
                pgt.d("CameraPresencePrvdr", "Error from source camera presence observable. Triggering refresh.", th);
                tcy<List<k26>> tcyVar = d36Var.e;
                if (tcyVar != null) {
                    tcyVar.a();
                }
            }
        }
    }

    public d36(Executor executor) {
        this.a = executor;
    }

    public final void a(String str) {
        h36 h36Var = this.d;
        if (h36Var == null) {
            return;
        }
        try {
            m26 m26VarH = h36Var.b(str).h();
            m26VarH.getClass();
            d(m26VarH);
        } catch (IllegalArgumentException unused) {
            pgt.i("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    public final void b(Set<k26> set, Set<k26> set2) {
        boolean zIsEmpty = set.isEmpty();
        CopyOnWriteArrayList<a> copyOnWriteArrayList = this.j;
        if (!zIsEmpty) {
            pgt.e("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            Iterator<a> it = copyOnWriteArrayList.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw null;
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        pgt.e("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
        Iterator<a> it2 = copyOnWriteArrayList.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw null;
        }
    }

    public final void c(String str) {
        synchronized (this.b) {
            final lfy lfyVar = (lfy) this.k.remove(str);
            h36 h36Var = this.d;
            if (lfyVar != null && h36Var != null) {
                try {
                    final n26 n26VarB = h36Var.b(str);
                    ((adl) mku.a()).execute(new Runnable() { // from class: z26
                        @Override // java.lang.Runnable
                        public final void run() {
                            n26VarB.h().b().k(lfyVar);
                        }
                    });
                    pgt.a("CameraPresencePrvdr", "Removed state observer for: " + str);
                } catch (IllegalArgumentException unused) {
                }
            }
            Unit unit = Unit.a;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [a36, java.lang.Object] */
    public final void d(final m26 m26Var) {
        final String strD = m26Var.d();
        strD.getClass();
        if (this.h.get()) {
            synchronized (this.b) {
                if (this.k.containsKey(strD)) {
                    return;
                }
                final ?? r3 = new lfy() { // from class: a36
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        l36 l36Var = (l36) obj;
                        d36 d36Var = this.a;
                        if (!d36Var.h.get()) {
                            pgt.a("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
                            return;
                        }
                        if ((l36Var != null ? l36Var.a() : null) == null) {
                            if ((l36Var != null ? l36Var.b() : null) != l36.b.e) {
                                return;
                            }
                        }
                        StringBuilder sbA = he.a("Camera ", strD, " state changed to ");
                        sbA.append(l36Var.b());
                        sbA.append(" with error: ");
                        l36.a aVarA = l36Var.a();
                        sbA.append(aVarA != null ? Integer.valueOf(aVarA.b()) : null);
                        sbA.append(". Triggering refresh.");
                        pgt.i("CameraPresencePrvdr", sbA.toString());
                        tcy<List<k26>> tcyVar = d36Var.e;
                        if (tcyVar != null) {
                            tcyVar.a();
                        }
                    }
                };
                ((adl) mku.a()).execute(new Runnable() { // from class: b36
                    @Override // java.lang.Runnable
                    public final void run() {
                        m26Var.b().g(r3);
                    }
                });
                this.k.put(strD, r3);
                pgt.a("CameraPresencePrvdr", "Registered state observer for camera: ".concat(strD));
                Unit unit = Unit.a;
            }
        }
    }

    public final void e() {
        if (!this.h.getAndSet(false)) {
            pgt.a("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        pgt.e("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        tcy<List<k26>> tcyVar = this.e;
        if (tcyVar != null) {
            tcyVar.b(this.f);
        }
        synchronized (this.b) {
            if (!this.k.isEmpty()) {
                Map mapL = kpu.l(this.k);
                this.k.clear();
                Unit unit = Unit.a;
                h36 h36Var = this.d;
                if (h36Var != null) {
                    LinkedHashSet<n26> linkedHashSetC = h36Var.c();
                    final ArrayList arrayList = new ArrayList(l48.r(linkedHashSetC, 10));
                    Iterator<T> it = linkedHashSetC.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((n26) it.next()).h());
                    }
                    pgt.a("CameraPresencePrvdr", "Clearing all " + mapL.size() + " state observers.");
                    ArrayList arrayList2 = new ArrayList(mapL.size());
                    for (Map.Entry entry : mapL.entrySet()) {
                        final String str = (String) entry.getKey();
                        final lfy lfyVar = (lfy) entry.getValue();
                        ((adl) mku.a()).execute(new Runnable() { // from class: c36
                            @Override // java.lang.Runnable
                            public final void run() {
                                Object obj;
                                njs<l36> njsVarB;
                                ArrayList arrayList3 = arrayList;
                                lfy<? super l36> lfyVar2 = lfyVar;
                                String str2 = str;
                                try {
                                    int size = arrayList3.size();
                                    int i = 0;
                                    do {
                                        if (i >= size) {
                                            obj = null;
                                            break;
                                        } else {
                                            obj = arrayList3.get(i);
                                            i++;
                                        }
                                    } while (!Intrinsics.g(((m26) obj).d(), str2));
                                    m26 m26Var = (m26) obj;
                                    if (m26Var == null || (njsVarB = m26Var.b()) == null) {
                                        return;
                                    }
                                    njsVarB.k(lfyVar2);
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                        });
                        arrayList2.add(Unit.a);
                    }
                }
            }
        }
        this.i.clear();
        this.j.clear();
        this.g = m2g.a;
        this.c = null;
        this.d = null;
    }

    public final void f(g26 g26Var, h36 h36Var) {
        g26Var.getClass();
        h36Var.getClass();
        if (this.h.compareAndSet(false, true)) {
            pgt.e("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            LinkedHashSet<String> linkedHashSetC = g26Var.c();
            ArrayList arrayList = new ArrayList(l48.r(linkedHashSetC, 10));
            for (String str : linkedHashSetC) {
                str.getClass();
                arrayList.add(new k26(kotlin.collections.b.l(str), null));
            }
            this.g = arrayList;
            this.c = g26Var;
            this.d = h36Var;
            mz5 mz5VarB = g26Var.b();
            this.e = mz5VarB;
            if (mz5VarB != null) {
                mz5VarB.c(this.a, this.f);
            }
        }
    }
}
