package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.simulationsettlement.handler.SimulationSettlementHandlerImpl$runNonLeadingScoreSimulationIfNeeded$1", f = "SimulationSettlementHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class io90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ List<ys90> b;
    public final /* synthetic */ do90 c;
    public final /* synthetic */ zta0.a d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.simulationsettlement.handler.SimulationSettlementHandlerImpl$runNonLeadingScoreSimulationIfNeeded$1$2$1", f = "SimulationSettlementHandlerImpl.kt", l = {283}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ sn90 b;
        public final /* synthetic */ do90 c;

        /* JADX INFO: renamed from: io90$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.presentation.simulationsettlement.handler.SimulationSettlementHandlerImpl$runNonLeadingScoreSimulationIfNeeded$1$2$1$1", f = "SimulationSettlementHandlerImpl.kt", l = {268, 270}, m = "invokeSuspend", v = 2)
        public static final class C0687a extends tje0 implements Function2<myh<? super Long>, v1b<? super Unit>, Object> {
            public long a;
            public long b;
            public int c;
            public /* synthetic */ Object d;
            public final /* synthetic */ long e;
            public final /* synthetic */ long f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0687a(long j, long j2, v1b<? super C0687a> v1bVar) {
                super(2, v1bVar);
                this.e = j;
                this.f = j2;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0687a c0687a = new C0687a(this.e, this.f, v1bVar);
                c0687a.d = obj;
                return c0687a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(myh<? super Long> myhVar, v1b<? super Unit> v1bVar) {
                return ((C0687a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0025  */
            /* JADX WARN: Code duplicated, block: B:13:0x0031  */
            /* JADX WARN: Code duplicated, block: B:17:0x0046 A[PHI: r7 r9
              0x0046: PHI (r7v4 long) = (r7v2 long), (r7v6 long) binds: [B:15:0x0043, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
              0x0046: PHI (r9v1 long) = (r9v0 long), (r9v2 long) binds: [B:15:0x0043, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:19:0x004a  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:11:0x0025). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // defpackage.pz1
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = r11.d
                    myh r0 = (defpackage.myh) r0
                    y5b r1 = defpackage.y5b.a
                    int r2 = r11.c
                    long r3 = r11.f
                    r5 = 2
                    r6 = 1
                    if (r2 == 0) goto L22
                    if (r2 == r6) goto L1a
                    if (r2 != r5) goto L13
                    goto L22
                L13:
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r11)
                    r11 = 0
                    return r11
                L1a:
                    long r7 = r11.b
                    long r9 = r11.a
                    defpackage.uj50.b(r12)
                    goto L46
                L22:
                    defpackage.uj50.b(r12)
                L25:
                    long r9 = java.lang.System.currentTimeMillis()
                    long r7 = r11.e
                    long r7 = r9 - r7
                    int r12 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                    if (r12 <= 0) goto L32
                    r7 = r3
                L32:
                    java.lang.Long r12 = new java.lang.Long
                    r12.<init>(r7)
                    r11.d = r0
                    r11.a = r9
                    r11.b = r7
                    r11.c = r6
                    java.lang.Object r12 = r0.emit(r12, r11)
                    if (r12 != r1) goto L46
                    goto L5a
                L46:
                    int r12 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                    if (r12 >= 0) goto L5b
                    r11.d = r0
                    r11.a = r9
                    r11.b = r7
                    r11.c = r5
                    r7 = 200(0xc8, double:9.9E-322)
                    java.lang.Object r12 = defpackage.hkd.b(r7, r11)
                    if (r12 != r1) goto L25
                L5a:
                    return r1
                L5b:
                    kotlin.Unit r11 = kotlin.Unit.a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: io90.a.C0687a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ do90 a;

            /* JADX INFO: renamed from: io90$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.instantwin.presentation.simulationsettlement.handler.SimulationSettlementHandlerImpl$runNonLeadingScoreSimulationIfNeeded$1$2$1$3", f = "SimulationSettlementHandlerImpl.kt", l = {481}, m = "emit", v = 2)
            public static final class C0688a extends x1b {
                public zn90 a;
                public tuw b;
                public do90 c;
                public /* synthetic */ Object d;
                public final /* synthetic */ b<T> e;
                public int f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0688a(b<? super T> bVar, v1b<? super C0688a> v1bVar) {
                    super(v1bVar);
                    this.e = bVar;
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.f |= Integer.MIN_VALUE;
                    return this.e.emit(null, this);
                }
            }

            public b(do90 do90Var) {
                this.a = do90Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object emit(zn90 zn90Var, v1b<? super Unit> v1bVar) {
                C0688a c0688a;
                do90 do90Var;
                tuw tuwVar;
                Object value;
                ArrayList arrayList;
                if (v1bVar instanceof C0688a) {
                    c0688a = (C0688a) v1bVar;
                    int i = c0688a.f;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0688a.f = i - Integer.MIN_VALUE;
                    } else {
                        c0688a = new C0688a(this, v1bVar);
                    }
                } else {
                    c0688a = new C0688a(this, v1bVar);
                }
                Object obj = c0688a.d;
                y5b y5bVar = y5b.a;
                int i2 = c0688a.f;
                if (i2 == 0) {
                    uj50.b(obj);
                    do90Var = this.a;
                    tuwVar = do90Var.k;
                    c0688a.a = zn90Var;
                    c0688a.b = tuwVar;
                    c0688a.c = do90Var;
                    c0688a.f = 1;
                    if (tuwVar.d(c0688a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    do90Var = c0688a.c;
                    tuw tuwVar2 = c0688a.b;
                    zn90 zn90Var2 = c0688a.a;
                    uj50.b(obj);
                    tuwVar = tuwVar2;
                    zn90Var = zn90Var2;
                }
                try {
                    wwd0 wwd0Var = do90Var.i;
                    do {
                        value = wwd0Var.getValue();
                        arrayList = new ArrayList();
                        for (T t : (List) value) {
                            zn90 zn90Var3 = (zn90) t;
                            if (!zn90Var3.a.equals(zn90Var.a) || !zn90Var3.b.equals(zn90Var.b)) {
                                arrayList.add(t);
                            }
                        }
                    } while (!wwd0Var.g(value, CollectionsKt.j0(arrayList, zn90Var)));
                    Unit unit = Unit.a;
                    return Unit.a;
                } finally {
                    tuwVar.f(null);
                }
            }
        }

        public static final class c implements lyh<zn90> {
            public final /* synthetic */ or60 a;
            public final /* synthetic */ sn90 b;

            /* JADX INFO: renamed from: io90$a$c$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.instantwin.presentation.simulationsettlement.handler.SimulationSettlementHandlerImpl$runNonLeadingScoreSimulationIfNeeded$1$2$1$invokeSuspend$$inlined$map$1", f = "SimulationSettlementHandlerImpl.kt", l = {109}, m = "collect", v = 2)
            public static final class C0689a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0689a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return c.this.collect(null, this);
                }
            }

            public static final class b<T> implements myh {
                public final /* synthetic */ myh a;
                public final /* synthetic */ sn90 b;

                /* JADX INFO: renamed from: io90$a$c$b$a, reason: collision with other inner class name */
                @c0d(c = "com.sportybet.android.instantwin.presentation.simulationsettlement.handler.SimulationSettlementHandlerImpl$runNonLeadingScoreSimulationIfNeeded$1$2$1$invokeSuspend$$inlined$map$1$2", f = "SimulationSettlementHandlerImpl.kt", l = {50}, m = "emit", v = 2)
                public static final class C0690a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0690a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return b.this.emit(null, this);
                    }
                }

                public b(myh myhVar, sn90 sn90Var) {
                    this.a = myhVar;
                    this.b = sn90Var;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // defpackage.myh
                public final Object emit(Object obj, v1b v1bVar) {
                    C0690a c0690a;
                    int i;
                    if (v1bVar instanceof C0690a) {
                        c0690a = (C0690a) v1bVar;
                        int i2 = c0690a.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0690a.b = i2 - Integer.MIN_VALUE;
                        } else {
                            c0690a = new C0690a(v1bVar);
                        }
                    } else {
                        c0690a = new C0690a(v1bVar);
                    }
                    Object obj2 = c0690a.a;
                    y5b y5bVar = y5b.a;
                    int i3 = c0690a.b;
                    if (i3 == 0) {
                        uj50.b(obj2);
                        long jLongValue = ((Number) obj).longValue();
                        sn90 sn90Var = this.b;
                        ArrayList arrayList = sn90Var.d;
                        int i4 = 0;
                        if (arrayList.isEmpty()) {
                            i = 0;
                        } else {
                            int size = arrayList.size();
                            i = 0;
                            int i5 = 0;
                            while (i5 < size) {
                                Object obj3 = arrayList.get(i5);
                                i5++;
                                if (((Number) obj3).longValue() <= jLongValue && (i = i + 1) < 0) {
                                    kotlin.collections.b.p();
                                    throw null;
                                }
                            }
                        }
                        ArrayList arrayList2 = sn90Var.e;
                        if (!arrayList2.isEmpty()) {
                            int size2 = arrayList2.size();
                            int i6 = 0;
                            while (i6 < size2) {
                                Object obj4 = arrayList2.get(i6);
                                i6++;
                                if (((Number) obj4).longValue() <= jLongValue && (i4 = i4 + 1) < 0) {
                                    kotlin.collections.b.p();
                                    throw null;
                                }
                            }
                        }
                        zn90 zn90Var = new zn90(sn90Var.a, sn90Var.b, i, i4);
                        c0690a.b = 1;
                        if (this.a.emit(zn90Var, c0690a) == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i3 != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj2);
                    }
                    return Unit.a;
                }
            }

            public c(or60 or60Var, sn90 sn90Var) {
                this.a = or60Var;
                this.b = sn90Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.lyh
            public final Object collect(myh<? super zn90> myhVar, v1b v1bVar) {
                C0689a c0689a;
                if (v1bVar instanceof C0689a) {
                    c0689a = (C0689a) v1bVar;
                    int i = c0689a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0689a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0689a = new C0689a(v1bVar);
                    }
                } else {
                    c0689a = new C0689a(v1bVar);
                }
                Object obj = c0689a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0689a.b;
                if (i2 == 0) {
                    uj50.b(obj);
                    b bVar = new b(myhVar, this.b);
                    c0689a.b = 1;
                    if (this.a.collect(bVar, c0689a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sn90 sn90Var, do90 do90Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = sn90Var;
            this.c = do90Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
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
                sn90 sn90Var = this.b;
                lyh lyhVarB = uzh.b(new c(new or60(new C0687a(System.currentTimeMillis(), sn90Var.c, null)), sn90Var));
                b bVar = new b(this.c);
                this.a = 1;
                if (lyhVarB.collect(bVar, this) == y5bVar) {
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
    public io90(List<ys90> list, do90 do90Var, zta0.a aVar, v1b<? super io90> v1bVar) {
        super(2, v1bVar);
        this.b = list;
        this.c = do90Var;
        this.d = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        io90 io90Var = new io90(this.b, this.c, this.d, v1bVar);
        io90Var.a = obj;
        return io90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((io90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        float f;
        Iterator it;
        long j;
        sn90 sn90Var;
        v5b v5bVar = (v5b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.b.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            ys90 ys90Var = (ys90) next;
            int i3 = 1;
            boolean z = i == 0;
            zta0.a.C1422a c1422a = zta0.a.C1422a.a;
            zta0.a aVar = this.d;
            if (aVar.equals(c1422a)) {
                f = 1.0f;
            } else {
                if (!aVar.equals(zta0.a.b.a)) {
                    uhc.a();
                    return null;
                }
                f = 0.5f;
            }
            long j2 = (long) (12159.0f * f);
            long j3 = (2 * j2) + 5835;
            long j4 = (long) (1000.0f * f);
            List<vs90> list = ys90Var.h;
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            for (Object obj2 : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    b.q();
                    throw null;
                }
                vs90 vs90Var = (vs90) obj2;
                if (z && i4 == 0) {
                    it = it2;
                    j = j4;
                    sn90Var = null;
                } else {
                    String str = vs90Var.f;
                    it = it2;
                    char[] cArr = new char[i3];
                    cArr[0] = 'H';
                    List listF0 = StringsKt.f0(str, cArr);
                    if (listF0.size() != 2) {
                        sn90Var = null;
                        j = j4;
                    } else {
                        j = j4;
                        Pair pairA = do90.a(1945L, (1945 + j2) - j4, j, j6f0.a((String) listF0.get(0)));
                        Pair pairA2 = do90.a(3890 + j2, j3 - j, j, j6f0.a((String) listF0.get(1)));
                        sn90Var = new sn90(ys90Var.a, vs90Var.a, j3, CollectionsKt.i0((Iterable) pairA2.a, (Collection) pairA.a), CollectionsKt.i0((Iterable) pairA2.b, (Collection) pairA.b));
                    }
                }
                if (sn90Var != null) {
                    arrayList2.add(sn90Var);
                }
                j4 = j;
                i4 = i5;
                it2 = it;
                i3 = 1;
            }
            p48.w(arrayList2, arrayList);
            i = i2;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj3 = arrayList.get(i6);
            i6++;
            ej5.c(v5bVar, null, null, new a((sn90) obj3, this.c, null), 3);
        }
        return Unit.a;
    }
}
