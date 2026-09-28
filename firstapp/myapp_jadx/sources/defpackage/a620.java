package defpackage;

import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class a620 implements rym {
    public static final Map<h620, Set<u420>> l;
    public final j1b a;
    public final xq00 b;
    public final b390 c;
    public final b390 d;
    public final ConcurrentHashMap<String, m420> e;
    public final ConcurrentHashMap<h620, m420> f;
    public volatile String g;
    public volatile u420 h;
    public volatile u420 i;
    public volatile boolean j;
    public jvd0 k;

    @c0d(c = "com.sportybet.android.popup.PopupQueueManager$debugForceEmit$1", f = "PopupQueueManager.kt", l = {176}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = a620.this.new a(v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                a620 a620Var = a620.this;
                Map<h620, Set<u420>> map = a620.l;
                ngs ngsVarB = kotlin.collections.a.b();
                Collection<m420> collectionValues = a620Var.e.values();
                collectionValues.getClass();
                ngsVarB.addAll(collectionValues);
                Collection<m420> collectionValues2 = a620Var.f.values();
                collectionValues2.getClass();
                ngsVarB.addAll(collectionValues2);
                ngs ngsVarA = kotlin.collections.a.a(ngsVarB);
                m420 m420Var = ngsVarA.isEmpty() ? null : (m420) CollectionsKt.firstOrNull(CollectionsKt.r0(ngsVarA, new e620(new d620())));
                if (m420Var == null) {
                    itf0.a aVar = itf0.a;
                    aVar.q("PopupQueueManager");
                    aVar.a("debugForceEmit — queue empty", new Object[0]);
                    return Unit.a;
                }
                a620.this.g = m420Var.b;
                itf0.a aVar2 = itf0.a;
                aVar2.q("PopupQueueManager");
                aVar2.a("debugForceEmit — emitting: %s", m420Var.a.name());
                b390 b390Var = a620.this.c;
                this.b = null;
                this.a = 1;
                if (b390Var.emit(m420Var, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.popup.PopupQueueManager$persistQueue$1", f = "PopupQueueManager.kt", l = {281}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return a620.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            a620 a620Var = a620.this;
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    JSONArray jSONArray = new JSONArray();
                    Collection<m420> collectionValues = a620Var.e.values();
                    collectionValues.getClass();
                    Iterator<T> it = collectionValues.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((m420) it.next()).a());
                    }
                    Collection<m420> collectionValues2 = a620Var.f.values();
                    collectionValues2.getClass();
                    Iterator<T> it2 = collectionValues2.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(((m420) it2.next()).a());
                    }
                    xq00 xq00Var = a620Var.b;
                    String string = jSONArray.toString();
                    this.a = 1;
                    if (xq00Var.a.putString("popup_queue", string, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q("PopupQueueManager");
                aVar.f(e, "Failed to persist popup queue to DataStore", new Object[0]);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.popup.PopupQueueManager$scheduleEmission$1", f = "PopupQueueManager.kt", l = {183, 184}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return a620.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x0117, code lost:
        
            if (r9 == r0) goto L46;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 285
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a620.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        h620 h620Var = h620.c;
        u420.d dVar = u420.d.a;
        u420.a aVar = u420.a.a;
        u420.b bVar = u420.b.a;
        u420.g gVar = u420.g.a;
        Pair pair = new Pair(h620Var, ay0.V(new u420[]{dVar, aVar, bVar, gVar}));
        Pair pair2 = new Pair(h620.d, ay0.V(new u420[]{dVar, aVar, bVar, gVar, new u420.j(jq40.a(u420.f.class))}));
        Pair pair3 = new Pair(h620.e, wi80.b(gVar));
        h620 h620Var2 = h620.f;
        u420.c cVar = u420.c.a;
        Pair pair4 = new Pair(h620Var2, ay0.V(new u420[]{dVar, aVar, gVar, cVar}));
        h620 h620Var3 = h620.i;
        u420.h hVar = u420.h.a;
        Pair pair5 = new Pair(h620Var3, ay0.V(new u420[]{dVar, aVar, bVar, hVar, gVar, cVar, new u420.j(jq40.a(u420.f.class))}));
        h620 h620Var4 = h620.v;
        u420.k kVar = u420.k.a;
        l = kpu.f(pair, pair2, pair3, pair4, pair5, new Pair(h620Var4, ay0.V(new u420[]{dVar, aVar, gVar, cVar, kVar})), new Pair(h620.w, wi80.b(dVar)), new Pair(h620.y, ay0.V(new u420[]{dVar, aVar, bVar, hVar, gVar, cVar})), new Pair(h620.z, ay0.V(new u420[]{dVar, aVar, gVar, cVar, kVar})), new Pair(h620.A, ay0.V(new u420[]{dVar, aVar, gVar, cVar, kVar, u420.l.a})), new Pair(h620.C, ay0.V(new u420[]{dVar, gVar, cVar})), new Pair(h620.B, ay0.V(new u420[]{dVar, gVar, cVar})), new Pair(h620.E, ay0.V(new u420[]{dVar, aVar, gVar, cVar, kVar})), new Pair(h620.F, ay0.V(new u420[]{dVar, aVar, gVar, cVar, kVar})), new Pair(h620.D, ay0.V(new u420[]{dVar, aVar, gVar, cVar, kVar})), new Pair(h620.G, ay0.V(new u420[]{dVar, aVar, bVar, hVar, gVar, cVar})), new Pair(h620.H, ay0.V(new u420[]{dVar, aVar, bVar, hVar, gVar})), new Pair(h620.I, ay0.V(new u420[]{dVar, aVar, bVar, hVar, gVar})), new Pair(h620.L, wi80.b(dVar)), new Pair(h620.K, ay0.V(new u420[]{dVar, aVar, bVar, hVar, gVar, kVar, u420.e.a})), new Pair(h620.J, ay0.V(new u420[]{dVar, aVar, bVar, hVar, gVar})));
    }

    public a620(j1b j1bVar, xq00 xq00Var) {
        this.a = j1bVar;
        this.b = xq00Var;
        b390 b390VarB = d390.b(0, 0, null, 6);
        this.c = b390VarB;
        this.d = b390VarB;
        this.e = new ConcurrentHashMap<>();
        this.f = new ConcurrentHashMap<>();
        u420.i iVar = u420.i.a;
        this.h = iVar;
        this.i = iVar;
        ej5.c(j1bVar, null, null, new z520(this, null), 3);
    }

    @Override // defpackage.rym
    public final u420 a() {
        return this.h;
    }

    @Override // defpackage.rym
    public final void b(String str) {
        str.getClass();
        itf0.a aVar = itf0.a;
        aVar.q("PopupQueueManager");
        aVar.a("Popup deferred: %s (waiting for next page)", str);
        if (Intrinsics.g(this.g, str)) {
            this.g = null;
        }
    }

    @Override // defpackage.rym
    public final void c(String str) {
        str.getClass();
        itf0.a aVar = itf0.a;
        aVar.q("PopupQueueManager");
        aVar.a("Popup dismissed: %s", str);
        if (Intrinsics.g(this.g, str)) {
            this.g = null;
        }
        this.e.remove(str);
        Collection<m420> collectionValues = this.f.values();
        final v520 v520Var = new v520(str);
        collectionValues.removeIf(new Predicate() { // from class: w520
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) v520Var.invoke(obj)).booleanValue();
            }
        });
        l();
    }

    @Override // defpackage.rym
    public final void d(u420 u420Var) {
        u420Var.getClass();
        itf0.a aVar = itf0.a;
        aVar.q("PopupQueueManager");
        aVar.a("Page changed: %s → %s", this.h.toString(), u420Var.toString());
        this.h = u420Var;
        if (u420Var.equals(u420.i.a)) {
            return;
        }
        boolean zEquals = u420Var.equals(this.i);
        this.i = u420Var;
        if (!zEquals) {
            this.j = false;
        }
        n();
    }

    @Override // defpackage.rym
    public final ngs e() {
        ngs ngsVarB = kotlin.collections.a.b();
        Collection<m420> collectionValues = this.e.values();
        collectionValues.getClass();
        ngsVarB.addAll(collectionValues);
        Collection<m420> collectionValues2 = this.f.values();
        collectionValues2.getClass();
        ngsVarB.addAll(collectionValues2);
        return kotlin.collections.a.a(ngsVarB);
    }

    @Override // defpackage.rym
    public final String f() {
        return this.g;
    }

    @Override // defpackage.rym
    public final b390 g() {
        return this.d;
    }

    @Override // defpackage.rym
    public final void h() {
        jvd0 jvd0Var = this.k;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.e.clear();
        this.f.clear();
        this.g = null;
        this.j = false;
        this.i = u420.i.a;
        l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        if (java.lang.Float.parseFloat(r5) > r4) goto L17;
     */
    @Override // defpackage.rym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.m420 r10) {
        /*
            r9 = this;
            h620 r0 = r10.a
            java.lang.String r1 = r10.b
            boolean r2 = r0.b
            java.lang.String r3 = "PopupQueueManager"
            if (r2 == 0) goto L10
            java.util.concurrent.ConcurrentHashMap<h620, m420> r2 = r9.f
            r2.put(r0, r10)
            goto L7f
        L10:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, m420> r2 = r9.e
            java.lang.Object r4 = r2.get(r1)
            m420 r4 = (defpackage.m420) r4
            if (r4 == 0) goto L7c
            java.lang.String r5 = "0"
            java.lang.String r6 = "totalWinnings"
            h620 r7 = defpackage.h620.c
            h620 r8 = defpackage.h620.d
            h620[] r7 = new defpackage.h620[]{r7, r8}
            java.util.List r7 = kotlin.collections.b.k(r7)
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L7c
            org.json.JSONObject r4 = r4.c     // Catch: java.lang.NumberFormatException -> L4f
            java.lang.String r4 = r4.optString(r6, r5)     // Catch: java.lang.NumberFormatException -> L4f
            r4.getClass()     // Catch: java.lang.NumberFormatException -> L4f
            float r4 = java.lang.Float.parseFloat(r4)     // Catch: java.lang.NumberFormatException -> L4f
            org.json.JSONObject r7 = r10.c     // Catch: java.lang.NumberFormatException -> L4f
            java.lang.String r5 = r7.optString(r6, r5)     // Catch: java.lang.NumberFormatException -> L4f
            r5.getClass()     // Catch: java.lang.NumberFormatException -> L4f
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L4f
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L69
            goto L7c
        L4f:
            r9 = move-exception
            itf0$a r10 = defpackage.itf0.a
            r10.q(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to parse totalWinnings for shouldReplace:"
            r2.<init>(r4)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r10.d(r9, r2)
        L69:
            itf0$a r9 = defpackage.itf0.a
            r9.q(r3)
            java.lang.String r10 = r0.name()
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r1}
            java.lang.String r0 = "Skip duplicate: %s (key=%s)"
            r9.a(r0, r10)
            return
        L7c:
            r2.put(r1, r10)
        L7f:
            itf0$a r10 = defpackage.itf0.a
            r10.q(r3)
            java.lang.String r0 = r0.name()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "Enqueued: %s (key=%s)"
            r10.a(r1, r0)
            r9.l()
            r9.n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a620.i(m420):void");
    }

    @Override // defpackage.rym
    public final void j() {
        jvd0 jvd0Var = this.k;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.g = null;
        this.j = false;
        ej5.c(this.a, null, null, new a(null), 3);
    }

    public final void l() {
        ej5.c(this.a, null, null, new b(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(x1b x1bVar) {
        f620 f620Var;
        if (x1bVar instanceof f620) {
            f620Var = (f620) x1bVar;
            int i = f620Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f620Var.c = i - Integer.MIN_VALUE;
            } else {
                f620Var = new f620(this, x1bVar);
            }
        } else {
            f620Var = new f620(this, x1bVar);
        }
        Object string = f620Var.a;
        y5b y5bVar = y5b.a;
        int i2 = f620Var.c;
        try {
            if (i2 == 0) {
                uj50.b(string);
                xq00 xq00Var = this.b;
                f620Var.c = 1;
                string = xq00Var.a.getString("popup_queue", f620Var);
                if (string == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(string);
            }
            String str = (String) string;
            if (str != null && str.length() != 0) {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i4);
                    jSONObject.getClass();
                    m420 m420VarA = m420.a.a(jSONObject);
                    if (m420VarA != null) {
                        h620 h620Var = m420VarA.a;
                        if (h620Var.b) {
                            this.f.put(h620Var, m420VarA);
                        } else {
                            this.e.put(m420VarA.b, m420VarA);
                        }
                        i3++;
                    }
                }
                itf0.a aVar = itf0.a;
                aVar.q("PopupQueueManager");
                aVar.a("Restored %d items from DataStore", new Integer(i3));
                if (i3 > 0) {
                    n();
                }
                return Unit.a;
            }
            return Unit.a;
        } catch (Exception e) {
            itf0.a aVar2 = itf0.a;
            aVar2.q("PopupQueueManager");
            aVar2.f(e, "Failed to restore popup queue from DataStore", new Object[0]);
        }
    }

    public final void n() {
        jvd0 jvd0Var = this.k;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.k = ej5.c(this.a, null, null, new c(null), 3);
    }

    @Override // defpackage.rym
    public final void k(String str) {
        str.getClass();
        itf0.a aVar = itf0.a;
        aVar.q(xOgHBQVl.gKmjTkicyIPn);
        aVar.a("Popup skipped: %s", str);
        if (Intrinsics.g(this.g, str)) {
            this.g = null;
        }
        this.e.remove(str);
        Collection<m420> collectionValues = this.f.values();
        final x520 x520Var = new x520(str, 0);
        collectionValues.removeIf(new Predicate() { // from class: y520
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((Boolean) x520Var.invoke(obj)).booleanValue();
            }
        });
        l();
        this.j = false;
        n();
    }
}
