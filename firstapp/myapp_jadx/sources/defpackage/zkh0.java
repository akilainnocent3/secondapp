package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.domain.UpdateStreamUseCase$invoke$2", f = "UpdateStreamUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zkh0 extends tje0 implements Function2<v5b, v1b<? super c9p>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ wkh0 b;
    public final /* synthetic */ a390<Unit> c;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.UpdateStreamUseCase$invoke$2$1", f = "UpdateStreamUseCase.kt", l = {163}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wkh0 b;
        public final /* synthetic */ tuw c;
        public final /* synthetic */ LinkedHashMap d;
        public final /* synthetic */ LinkedHashSet e;
        public final /* synthetic */ v5b f;

        /* JADX INFO: renamed from: zkh0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.UpdateStreamUseCase$invoke$2$1$1", f = "UpdateStreamUseCase.kt", l = {164}, m = "invokeSuspend", v = 2)
        public static final class C1398a extends tje0 implements Function2<qcn<? extends dsq>, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ tuw c;
            public final /* synthetic */ LinkedHashMap d;
            public final /* synthetic */ LinkedHashSet e;
            public final /* synthetic */ v5b f;
            public final /* synthetic */ wkh0 i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1398a(v1b v1bVar, v5b v5bVar, tuw tuwVar, wkh0 wkh0Var, LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet) {
                super(2, v1bVar);
                this.c = tuwVar;
                this.d = linkedHashMap;
                this.e = linkedHashSet;
                this.f = v5bVar;
                this.i = wkh0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1398a c1398a = new C1398a(v1bVar, this.f, this.c, this.i, this.d, this.e);
                c1398a.b = obj;
                return c1398a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qcn<? extends dsq> qcnVar, v1b<? super Unit> v1bVar) {
                return ((C1398a) create(qcnVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                qcn qcnVar = (qcn) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.b = null;
                    this.a = 1;
                    if (zkh0.k(this.c, this.d, this.e, this.f, this.i, qcnVar, this) == y5bVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, v5b v5bVar, tuw tuwVar, wkh0 wkh0Var, LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet) {
            super(2, v1bVar);
            this.b = wkh0Var;
            this.c = tuwVar;
            this.d = linkedHashMap;
            this.e = linkedHashSet;
            this.f = v5bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.f, this.c, this.b, this.d, this.e);
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
                wkh0 wkh0Var = this.b;
                or60 or60Var = wkh0Var.a.k.d;
                C1398a c1398a = new C1398a(null, this.f, this.c, wkh0Var, this.d, this.e);
                this.a = 1;
                if (kzh.b(or60Var, c1398a, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.UpdateStreamUseCase$invoke$2$2", f = "UpdateStreamUseCase.kt", l = {169}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ a390<Unit> b;
        public final /* synthetic */ tuw c;
        public final /* synthetic */ LinkedHashMap d;
        public final /* synthetic */ LinkedHashSet e;
        public final /* synthetic */ v5b f;
        public final /* synthetic */ wkh0 i;

        @c0d(c = "com.sportybet.feature.luckynumber.shared.domain.UpdateStreamUseCase$invoke$2$2$1", f = "UpdateStreamUseCase.kt", l = {213}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
            public tuw a;
            public LinkedHashMap b;
            public LinkedHashSet c;
            public int d;
            public final /* synthetic */ tuw e;
            public final /* synthetic */ LinkedHashMap f;
            public final /* synthetic */ LinkedHashSet i;
            public final /* synthetic */ v5b v;
            public final /* synthetic */ wkh0 w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v1b v1bVar, v5b v5bVar, tuw tuwVar, wkh0 wkh0Var, LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet) {
                super(2, v1bVar);
                this.e = tuwVar;
                this.f = linkedHashMap;
                this.i = linkedHashSet;
                this.v = v5bVar;
                this.w = wkh0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(v1bVar, this.v, this.e, this.w, this.f, this.i);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
                return ((a) create(unit, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                tuw tuwVar;
                LinkedHashSet linkedHashSet;
                LinkedHashMap linkedHashMap;
                y5b y5bVar = y5b.a;
                int i = this.d;
                LinkedHashSet linkedHashSet2 = this.i;
                LinkedHashMap linkedHashMap2 = this.f;
                tuw tuwVar2 = this.e;
                if (i == 0) {
                    uj50.b(obj);
                    this.a = tuwVar2;
                    this.b = linkedHashMap2;
                    this.c = linkedHashSet2;
                    this.d = 1;
                    if (tuwVar2.d(this) == y5bVar) {
                        return y5bVar;
                    }
                    tuwVar = tuwVar2;
                    linkedHashSet = linkedHashSet2;
                    linkedHashMap = linkedHashMap2;
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    linkedHashSet = this.c;
                    linkedHashMap = this.b;
                    tuwVar = this.a;
                    uj50.b(obj);
                }
                try {
                    ngs ngsVarB = kotlin.collections.a.b();
                    for (Map.Entry entry : CollectionsKt.A0(linkedHashMap.entrySet())) {
                        wkh0.b bVar = (wkh0.b) entry.getKey();
                        if (Intrinsics.g((wkh0.c) entry.getValue(), wkh0.c.a.a) && linkedHashSet.add(bVar.a)) {
                            linkedHashMap.put(bVar, wkh0.c.C1249c.a);
                            ngsVarB.add(bVar);
                        }
                    }
                    ngs ngsVarA = kotlin.collections.a.a(ngsVarB);
                    tuwVar.f(null);
                    ListIterator listIterator = ngsVarA.listIterator(0);
                    while (true) {
                        ngs.c cVar = (ngs.c) listIterator;
                        if (!cVar.hasNext()) {
                            return Unit.a;
                        }
                        ej5.c(this.v, null, null, new dlh0(this.w, (wkh0.b) cVar.next(), tuwVar2, linkedHashSet2, linkedHashMap2, null), 3);
                    }
                } catch (Throwable th) {
                    tuwVar.f(null);
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a390 a390Var, tuw tuwVar, LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet, v5b v5bVar, wkh0 wkh0Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = a390Var;
            this.c = tuwVar;
            this.d = linkedHashMap;
            this.e = linkedHashSet;
            this.f = v5bVar;
            this.i = wkh0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                a aVar = new a(null, this.f, this.c, this.i, this.d, this.e);
                this.a = 1;
                if (kzh.b(this.b, aVar, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zkh0(wkh0 wkh0Var, a390<Unit> a390Var, v1b<? super zkh0> v1bVar) {
        super(2, v1bVar);
        this.b = wkh0Var;
        this.c = a390Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x015f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0173  */
    /* JADX WARN: Code duplicated, block: B:42:0x0176  */
    /* JADX WARN: Code duplicated, block: B:45:0x017b  */
    /* JADX WARN: Code duplicated, block: B:48:0x019e A[PHI: r0 r2 r4 r7 r9 r11 r12 r13 r14
      0x019e: PHI (r0v5 wkh0$a) = (r0v10 wkh0$a), (r0v10 wkh0$a), (r0v13 wkh0$a) binds: [B:44:0x0179, B:46:0x019b, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r2v3 alh0) = (r2v6 alh0), (r2v6 alh0), (r2v2 alh0) binds: [B:44:0x0179, B:46:0x019b, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r4v9 java.util.Iterator) = (r4v10 java.util.Iterator), (r4v10 java.util.Iterator), (r4v14 java.util.Iterator) binds: [B:44:0x0179, B:46:0x019b, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r7v5 wkh0) = (r7v7 wkh0), (r7v7 wkh0), (r7v14 wkh0) binds: [B:44:0x0179, B:46:0x019b, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r9v7 long) = (r9v9 long), (r9v9 long), (r9v13 long) binds: [B:44:0x0179, B:46:0x019b, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r11v10 v5b) = (r11v12 v5b), (r11v12 v5b), (r11v16 v5b) binds: [B:44:0x0179, B:46:0x019b, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r12v4 java.util.Set) = (r12v6 java.util.Set), (r12v6 java.util.Set), (r12v10 java.util.Set) binds: [B:44:0x0179, B:46:0x019b, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r13v4 java.util.Map) = (r13v6 java.util.Map), (r13v6 java.util.Map), (r13v9 java.util.Map) binds: [B:44:0x0179, B:46:0x019b, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]
      0x019e: PHI (r14v2 quw) = (r14v9 quw), (r14v10 quw), (r14v11 quw) binds: [B:44:0x0179, B:46:0x019b, B:17:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01d2 -> B:14:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object k(defpackage.tuw r23, java.util.LinkedHashMap r24, java.util.LinkedHashSet r25, defpackage.v5b r26, defpackage.wkh0 r27, defpackage.qcn r28, defpackage.x1b r29) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zkh0.k(tuw, java.util.LinkedHashMap, java.util.LinkedHashSet, v5b, wkh0, qcn, x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object m(quw quwVar, Map map, Set set, v5b v5bVar, wkh0 wkh0Var, wkh0.a aVar, x1b x1bVar) {
        blh0 blh0Var;
        v5b v5bVar2;
        quw quwVar2;
        Map map2;
        Set set2;
        wkh0.a aVar2;
        wkh0 wkh0Var2;
        if (x1bVar instanceof blh0) {
            blh0Var = (blh0) x1bVar;
            int i = blh0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                blh0Var.w = i - Integer.MIN_VALUE;
            } else {
                blh0Var = new blh0(x1bVar);
            }
        } else {
            blh0Var = new blh0(x1bVar);
        }
        Object obj = blh0Var.v;
        y5b y5bVar = y5b.a;
        int i2 = blh0Var.w;
        boolean z = true;
        if (i2 == 0) {
            uj50.b(obj);
            blh0Var.a = quwVar;
            blh0Var.b = map;
            blh0Var.c = set;
            v5bVar2 = v5bVar;
            blh0Var.d = v5bVar2;
            blh0Var.e = wkh0Var;
            blh0Var.f = aVar;
            blh0Var.i = quwVar;
            blh0Var.w = 1;
            if (quwVar.d(blh0Var) == y5bVar) {
                return y5bVar;
            }
            quwVar2 = quwVar;
            map2 = map;
            set2 = set;
            aVar2 = aVar;
            wkh0Var2 = wkh0Var;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            quwVar = blh0Var.i;
            aVar2 = blh0Var.f;
            wkh0 wkh0Var3 = blh0Var.e;
            v5b v5bVar3 = blh0Var.d;
            Set set3 = blh0Var.c;
            Map map3 = blh0Var.b;
            quw quwVar3 = blh0Var.a;
            uj50.b(obj);
            quwVar2 = quwVar3;
            set2 = set3;
            map2 = map3;
            wkh0Var2 = wkh0Var3;
            v5bVar2 = v5bVar3;
        }
        try {
            wkh0.b bVar = aVar2.a;
            wkh0.c cVar = (wkh0.c) map2.get(bVar);
            if (Intrinsics.g(cVar, wkh0.c.a.a) || Intrinsics.g(cVar, wkh0.c.b.a)) {
                z = false;
            } else {
                wkh0.c.C1249c c1249c = wkh0.c.C1249c.a;
                if (Intrinsics.g(cVar, c1249c)) {
                    z = false;
                } else {
                    wkh0.c.d dVar = wkh0.c.d.a;
                    if (!Intrinsics.g(cVar, dVar)) {
                        if (cVar != null) {
                            throw new uwx();
                        }
                        if (set2.add(bVar.a)) {
                            map2.put(bVar, c1249c);
                        } else {
                            map2.put(bVar, dVar);
                        }
                    }
                    z = false;
                }
            }
            quwVar.f(null);
            if (z) {
                ej5.c(v5bVar2, null, null, new dlh0(wkh0Var2, aVar2.a, quwVar2, set2, map2, null), 3);
            }
            return Unit.a;
        } catch (Throwable th) {
            quwVar.f(null);
            throw th;
        }
    }

    public static final void n(String str, Map map) {
        int i;
        Set setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator it = setEntrySet.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Map.Entry entry = (Map.Entry) next;
            i = (Intrinsics.g(entry.getValue(), wkh0.c.C1249c.a) || Intrinsics.g(entry.getValue(), wkh0.c.d.a)) ? 1 : 0;
            if (Intrinsics.g(((wkh0.b) entry.getKey()).a, str) && i != 0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList2.add((wkh0.b) ((Map.Entry) obj).getKey());
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            map.put((wkh0.b) obj2, wkh0.c.a.a);
        }
    }

    public static final void o(Map<wkh0.b, wkh0.c> map, final String str, final Set<wkh0.b> set, Set<wkh0.b> set2) {
        Set<Map.Entry<wkh0.b, wkh0.c>> setEntrySet = map.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (Intrinsics.g(((wkh0.b) entry.getKey()).a, str) && !Intrinsics.g(entry.getValue(), wkh0.c.b.a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList2.add((wkh0.b) ((Map.Entry) obj2).getKey());
        }
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj3 = arrayList2.get(i);
            i++;
            wkh0.b bVar = (wkh0.b) obj3;
            if (set2.contains(bVar)) {
                map.remove(bVar);
            } else if (set.contains(bVar)) {
                map.put(bVar, wkh0.c.b.a);
                Unit unit = Unit.a;
            } else {
                map.remove(bVar);
            }
        }
        p48.z(map.entrySet(), new Function1() { // from class: ykh0
            /* JADX WARN: Code duplicated, block: B:7:0x0020  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                boolean z;
                Map.Entry entry2 = (Map.Entry) obj4;
                if (Intrinsics.g(((wkh0.b) entry2.getKey()).a, str)) {
                    if (set.contains(entry2.getKey())) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        });
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zkh0 zkh0Var = new zkh0(this.b, this.c, v1bVar);
        zkh0Var.a = obj;
        return zkh0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super c9p> v1bVar) {
        return ((zkh0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        tuw tuwVarA = uuw.a();
        wkh0 wkh0Var = this.b;
        ej5.c(v5bVar, null, null, new a(null, v5bVar, tuwVarA, wkh0Var, linkedHashMap, linkedHashSet), 3);
        return ej5.c(v5bVar, null, null, new b(this.c, tuwVarA, linkedHashMap, linkedHashSet, v5bVar, wkh0Var, null), 3);
    }
}
