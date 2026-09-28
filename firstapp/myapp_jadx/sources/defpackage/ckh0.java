package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase$updateLottery$2", f = "UpdateLotteryUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ckh0 extends tje0 implements Function2<v5b, v1b<? super c9p>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ xjh0 b;
    public final /* synthetic */ a390<Unit> c;

    @c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase$updateLottery$2$1", f = "UpdateLotteryUseCase.kt", l = {146}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ xjh0 b;
        public final /* synthetic */ tuw c;
        public final /* synthetic */ LinkedHashMap d;
        public final /* synthetic */ v5b e;

        /* JADX INFO: renamed from: ckh0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase$updateLottery$2$1$1", f = "UpdateLotteryUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0172a extends tje0 implements gaj<Long, qcn<? extends erq>, v1b<? super qcn<? extends erq>>, Object> {
            public /* synthetic */ qcn a;

            @Override // defpackage.gaj
            public final Object invoke(Long l, qcn<? extends erq> qcnVar, v1b<? super qcn<? extends erq>> v1bVar) {
                l.longValue();
                C0172a c0172a = new C0172a(3, v1bVar);
                c0172a.a = qcnVar;
                return c0172a.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                qcn qcnVar = this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return qcnVar;
            }
        }

        @c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase$updateLottery$2$1$2", f = "UpdateLotteryUseCase.kt", l = {150, 151}, m = "invokeSuspend", v = 2)
        public static final class b extends tje0 implements Function2<qcn<? extends erq>, v1b<? super Unit>, Object> {
            public long a;
            public long b;
            public int c;
            public /* synthetic */ Object d;
            public final /* synthetic */ tuw e;
            public final /* synthetic */ LinkedHashMap f;
            public final /* synthetic */ v5b i;
            public final /* synthetic */ xjh0 v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(v1b v1bVar, v5b v5bVar, tuw tuwVar, xjh0 xjh0Var, LinkedHashMap linkedHashMap) {
                super(2, v1bVar);
                this.e = tuwVar;
                this.f = linkedHashMap;
                this.i = v5bVar;
                this.v = xjh0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                b bVar = new b(v1bVar, this.i, this.e, this.v, this.f);
                bVar.d = obj;
                return bVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qcn<? extends erq> qcnVar, v1b<? super Unit> v1bVar) {
                return ((b) create(qcnVar, v1bVar)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
            
                if (defpackage.ckh0.k(r12.e, r12.f, r12.i, r12.v, r5, r12) == r0) goto L28;
             */
            @Override // defpackage.pz1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Object r0 = r12.d
                    r5 = r0
                    qcn r5 = (defpackage.qcn) r5
                    y5b r0 = defpackage.y5b.a
                    int r1 = r12.c
                    r2 = 0
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L25
                    if (r1 == r4) goto L1d
                    if (r1 != r3) goto L17
                    defpackage.uj50.b(r13)
                    goto L96
                L17:
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.ib5.a(r12)
                    return r2
                L1d:
                    long r6 = r12.b
                    long r8 = r12.a
                    defpackage.uj50.b(r13)
                    goto L7e
                L25:
                    defpackage.uj50.b(r13)
                    java.util.Iterator r13 = r5.iterator()
                    boolean r1 = r13.hasNext()
                    if (r1 != 0) goto L34
                    r1 = r2
                    goto L5c
                L34:
                    java.lang.Object r1 = r13.next()
                    erq r1 = (defpackage.erq) r1
                    long r6 = r1.l
                    java.lang.Long r1 = new java.lang.Long
                    r1.<init>(r6)
                L41:
                    boolean r6 = r13.hasNext()
                    if (r6 == 0) goto L5c
                    java.lang.Object r6 = r13.next()
                    erq r6 = (defpackage.erq) r6
                    long r6 = r6.l
                    java.lang.Long r8 = new java.lang.Long
                    r8.<init>(r6)
                    int r6 = r1.compareTo(r8)
                    if (r6 <= 0) goto L41
                    r1 = r8
                    goto L41
                L5c:
                    if (r1 == 0) goto L99
                    long r8 = r1.longValue()
                    long r6 = android.os.SystemClock.elapsedRealtime()
                    long r6 = r8 - r6
                    r10 = 0
                    int r13 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                    if (r13 >= 0) goto L6f
                    r6 = r10
                L6f:
                    r12.d = r5
                    r12.a = r8
                    r12.b = r6
                    r12.c = r4
                    java.lang.Object r13 = defpackage.hkd.b(r6, r12)
                    if (r13 != r0) goto L7e
                    goto L95
                L7e:
                    r12.d = r2
                    r12.a = r8
                    r12.b = r6
                    r12.c = r3
                    tuw r1 = r12.e
                    java.util.LinkedHashMap r2 = r12.f
                    v5b r3 = r12.i
                    xjh0 r4 = r12.v
                    r6 = r12
                    java.lang.Object r12 = defpackage.ckh0.k(r1, r2, r3, r4, r5, r6)
                    if (r12 != r0) goto L96
                L95:
                    return r0
                L96:
                    kotlin.Unit r12 = kotlin.Unit.a
                    return r12
                L99:
                    kotlin.Unit r12 = kotlin.Unit.a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: ckh0.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, v5b v5bVar, tuw tuwVar, xjh0 xjh0Var, LinkedHashMap linkedHashMap) {
            super(2, v1bVar);
            this.b = xjh0Var;
            this.c = tuwVar;
            this.d = linkedHashMap;
            this.e = v5bVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.e, this.c, this.b, this.d);
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
                xjh0 xjh0Var = this.b;
                n1i n1iVar = new n1i(xjh0Var.c, xjh0Var.b.a(), new C0172a(3, null));
                b bVar = new b(null, this.e, this.c, xjh0Var, this.d);
                this.a = 1;
                if (kzh.b(n1iVar, bVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase$updateLottery$2$2", f = "UpdateLotteryUseCase.kt", l = {206}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ xjh0 c;
        public final /* synthetic */ a390<Unit> d;
        public final /* synthetic */ tuw e;
        public final /* synthetic */ LinkedHashMap f;

        @c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase$updateLottery$2$2$1$1$2$1", f = "UpdateLotteryUseCase.kt", l = {167}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ erq b;
            public final /* synthetic */ xjh0 c;
            public final /* synthetic */ tuw d;
            public final /* synthetic */ LinkedHashMap e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(erq erqVar, xjh0 xjh0Var, tuw tuwVar, LinkedHashMap linkedHashMap, v1b v1bVar) {
                super(2, v1bVar);
                this.b = erqVar;
                this.c = xjh0Var;
                this.d = tuwVar;
                this.e = linkedHashMap;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, this.c, this.d, this.e, v1bVar);
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
                    lyh<lk50<a5q>> lyhVarM = ckh0.m(this.c, this.d, this.e, this.b);
                    this.a = 1;
                    if (kzh.a(lyhVarM, this) == y5bVar) {
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

        /* JADX INFO: renamed from: ckh0$b$b, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase$updateLottery$2$2$invokeSuspend$$inlined$collectDropWhileBusy$1", f = "UpdateLotteryUseCase.kt", l = {179}, m = "invokeSuspend", v = 2)
        public static final class C0173b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ tuw d;
            public final /* synthetic */ LinkedHashMap e;
            public final /* synthetic */ v5b f;
            public final /* synthetic */ xjh0 i;

            /* JADX INFO: renamed from: ckh0$b$b$a */
            public static final class a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ tuw b;
                public final /* synthetic */ tuw c;
                public final /* synthetic */ LinkedHashMap d;
                public final /* synthetic */ v5b e;
                public final /* synthetic */ xjh0 f;

                /* JADX INFO: renamed from: ckh0$b$b$a$a, reason: collision with other inner class name */
                @c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase$updateLottery$2$2$invokeSuspend$$inlined$collectDropWhileBusy$1$1$2", f = "UpdateLotteryUseCase.kt", l = {194}, m = "invokeSuspend", v = 2)
                public static final class C0174a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                    public int a;
                    public final /* synthetic */ Object b;
                    public final /* synthetic */ tuw c;
                    public final /* synthetic */ tuw d;
                    public final /* synthetic */ LinkedHashMap e;
                    public final /* synthetic */ v5b f;
                    public final /* synthetic */ xjh0 i;
                    public tuw v;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0174a(Object obj, tuw tuwVar, v1b v1bVar, tuw tuwVar2, LinkedHashMap linkedHashMap, v5b v5bVar, xjh0 xjh0Var) {
                        super(2, v1bVar);
                        this.b = obj;
                        this.c = tuwVar;
                        this.d = tuwVar2;
                        this.e = linkedHashMap;
                        this.f = v5bVar;
                        this.i = xjh0Var;
                    }

                    @Override // defpackage.pz1
                    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                        return new C0174a(this.b, this.c, v1bVar, this.d, this.e, this.f, this.i);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                        return ((C0174a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        tuw tuwVar;
                        erq erqVar;
                        LinkedHashMap linkedHashMap = this.e;
                        y5b y5bVar = y5b.a;
                        int i = this.a;
                        tuw tuwVar2 = this.d;
                        tuw tuwVar3 = this.c;
                        try {
                            if (i == 0) {
                                uj50.b(obj);
                                this.v = tuwVar2;
                                this.a = 1;
                                if (tuwVar2.d(this) == y5bVar) {
                                    return y5bVar;
                                }
                                tuwVar = tuwVar2;
                            } else {
                                if (i != 1) {
                                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                tuw tuwVar4 = this.v;
                                uj50.b(obj);
                                tuwVar = tuwVar4;
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                Iterator it = linkedHashMap.entrySet().iterator();
                                while (it.hasNext()) {
                                    xjh0.a aVar = (xjh0.a) ((Map.Entry) it.next()).getValue();
                                    if (aVar instanceof xjh0.a.C1292a) {
                                        erqVar = ((xjh0.a.C1292a) aVar).a;
                                    } else {
                                        if (!Intrinsics.g(aVar, xjh0.a.b.a) && !(aVar instanceof xjh0.a.c)) {
                                            throw new uwx();
                                        }
                                        erqVar = null;
                                    }
                                    if (erqVar != null) {
                                        arrayList.add(erqVar);
                                    }
                                }
                                int size = arrayList.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    erq erqVar2 = (erq) arrayList.get(i2);
                                    linkedHashMap.put(erqVar2.a, xjh0.a.b.a);
                                    v5b v5bVar = this.f;
                                    xjh0 xjh0Var = this.i;
                                    ej5.c(v5bVar, xjh0Var.d, null, new a(erqVar2, xjh0Var, tuwVar2, linkedHashMap, null), 2);
                                }
                                Unit unit = Unit.a;
                                tuwVar.f(null);
                                tuwVar3.f(null);
                                return Unit.a;
                            } catch (Throwable th) {
                                tuwVar.f(null);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            tuwVar3.f(null);
                            throw th2;
                        }
                    }
                }

                public a(tuw tuwVar, v5b v5bVar, tuw tuwVar2, LinkedHashMap linkedHashMap, v5b v5bVar2, xjh0 xjh0Var) {
                    this.b = tuwVar;
                    this.c = tuwVar2;
                    this.d = linkedHashMap;
                    this.e = v5bVar2;
                    this.f = xjh0Var;
                    this.a = v5bVar;
                }

                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    tuw tuwVar = this.b;
                    if (tuwVar.g()) {
                        ej5.c(this.a, null, null, new C0174a(t, tuwVar, null, this.c, this.d, this.e, this.f), 3);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0173b(lyh lyhVar, v1b v1bVar, tuw tuwVar, LinkedHashMap linkedHashMap, v5b v5bVar, xjh0 xjh0Var) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = tuwVar;
                this.e = linkedHashMap;
                this.f = v5bVar;
                this.i = xjh0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0173b c0173b = new C0173b(this.c, v1bVar, this.d, this.e, this.f, this.i);
                c0173b.b = obj;
                return c0173b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0173b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    a aVar = new a(uuw.a(), v5bVar, this.d, this.e, this.f, this.i);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(aVar, this) == y5bVar) {
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
        public b(xjh0 xjh0Var, a390 a390Var, tuw tuwVar, LinkedHashMap linkedHashMap, v1b v1bVar) {
            super(2, v1bVar);
            this.c = xjh0Var;
            this.d = a390Var;
            this.e = tuwVar;
            this.f = linkedHashMap;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.c, this.d, this.e, this.f, v1bVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0173b c0173b = new C0173b(this.d, null, this.e, this.f, v5bVar, this.c);
                this.b = null;
                this.a = 1;
                if (w5b.d(c0173b, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase$updateLottery$2$getUpdateFlow$1", f = "UpdateLotteryUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<a5q, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ erq b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(erq erqVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = erqVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = new c(this.b, v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(a5q a5qVar, v1b<? super Unit> v1bVar) {
            return ((c) create(a5qVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws IOException {
            a5q a5qVar = (a5q) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (!Intrinsics.g(a5qVar.a, this.b.j)) {
                return Unit.a;
            }
            i08.a("Draw time not updated yet");
            return null;
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase$updateLottery$2$getUpdateFlow$2", f = "UpdateLotteryUseCase.kt", l = {107}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super a5q>, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ erq b;
        public final /* synthetic */ xjh0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(erq erqVar, xjh0 xjh0Var, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = erqVar;
            this.c = xjh0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super a5q> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                long jLongValue = (((Number) this.c.a.e.a.getValue()).longValue() + this.b.l) - SystemClock.elapsedRealtime();
                if (jLongValue < 0) {
                    jLongValue = 0;
                }
                this.a = 1;
                if (hkd.b(jLongValue, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase$updateLottery$2$getUpdateFlow$3", f = "UpdateLotteryUseCase.kt", l = {211}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<lk50<? extends a5q>, v1b<? super Unit>, Object> {
        public quw a;
        public Map b;
        public erq c;
        public xjh0 d;
        public int e;
        public /* synthetic */ Object f;
        public final /* synthetic */ quw i;
        public final /* synthetic */ Map<String, xjh0.a> v;
        public final /* synthetic */ erq w;
        public final /* synthetic */ xjh0 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v1b v1bVar, erq erqVar, quw quwVar, xjh0 xjh0Var, Map map) {
            super(2, v1bVar);
            this.i = quwVar;
            this.v = map;
            this.w = erqVar;
            this.y = xjh0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            e eVar = new e(v1bVar, this.w, this.i, this.y, this.v);
            eVar.f = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends a5q> lk50Var, v1b<? super Unit> v1bVar) {
            return ((e) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            quw quwVar;
            Map<String, xjh0.a> map;
            erq erqVar;
            xjh0 xjh0Var;
            xjh0.a cVar;
            lk50 lk50Var = (lk50) this.f;
            y5b y5bVar = y5b.a;
            int i = this.e;
            if (i == 0) {
                uj50.b(obj);
                this.f = lk50Var;
                quw quwVar2 = this.i;
                this.a = quwVar2;
                Map<String, xjh0.a> map2 = this.v;
                this.b = map2;
                erq erqVar2 = this.w;
                this.c = erqVar2;
                xjh0 xjh0Var2 = this.y;
                this.d = xjh0Var2;
                this.e = 1;
                if (quwVar2.d(this) == y5bVar) {
                    return y5bVar;
                }
                quwVar = quwVar2;
                map = map2;
                erqVar = erqVar2;
                xjh0Var = xjh0Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xjh0Var = this.d;
                erqVar = this.c;
                map = this.b;
                quwVar = this.a;
                uj50.b(obj);
            }
            try {
                String str = erqVar.a;
                xjh0Var.getClass();
                if (lk50Var instanceof lk50.a) {
                    cVar = new xjh0.a.C1292a(erqVar);
                } else if (Intrinsics.g(lk50Var, lk50.b.a)) {
                    cVar = xjh0.a.b.a;
                } else if (lk50Var instanceof lk50.c) {
                    cVar = new xjh0.a.c(((a5q) ((lk50.c) lk50Var).a).b);
                } else {
                    uhc.a();
                    cVar = null;
                }
                map.put(str, cVar);
                Unit unit = Unit.a;
                return Unit.a;
            } finally {
                quwVar.f(null);
            }
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.lobby.domain.usecase.UpdateLotteryUseCase$updateLottery$2$update$1", f = "UpdateLotteryUseCase.kt", l = {128}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ erq b;
        public final /* synthetic */ xjh0 c;
        public final /* synthetic */ quw d;
        public final /* synthetic */ Map<String, xjh0.a> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(v1b v1bVar, erq erqVar, quw quwVar, xjh0 xjh0Var, Map map) {
            super(2, v1bVar);
            this.b = erqVar;
            this.c = xjh0Var;
            this.d = quwVar;
            this.e = map;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new f(v1bVar, this.b, this.d, this.c, this.e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                lyh<lk50<a5q>> lyhVarM = ckh0.m(this.c, this.d, this.e, this.b);
                this.a = 1;
                if (kzh.a(lyhVarM, this) == y5bVar) {
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
    public ckh0(xjh0 xjh0Var, a390<Unit> a390Var, v1b<? super ckh0> v1bVar) {
        super(2, v1bVar);
        this.b = xjh0Var;
        this.c = a390Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(tuw tuwVar, LinkedHashMap linkedHashMap, v5b v5bVar, xjh0 xjh0Var, qcn qcnVar, x1b x1bVar) {
        dkh0 dkh0Var;
        tuw tuwVar2;
        if (x1bVar instanceof dkh0) {
            dkh0Var = (dkh0) x1bVar;
            int i = dkh0Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                dkh0Var.v = i - Integer.MIN_VALUE;
            } else {
                dkh0Var = new dkh0(x1bVar);
            }
        } else {
            dkh0Var = new dkh0(x1bVar);
        }
        Object obj = dkh0Var.i;
        y5b y5bVar = y5b.a;
        int i2 = dkh0Var.v;
        if (i2 == 0) {
            uj50.b(obj);
            dkh0Var.a = tuwVar;
            dkh0Var.b = linkedHashMap;
            dkh0Var.c = v5bVar;
            dkh0Var.d = xjh0Var;
            dkh0Var.e = qcnVar;
            dkh0Var.f = tuwVar;
            dkh0Var.v = 1;
            if (tuwVar.d(dkh0Var) == y5bVar) {
                return y5bVar;
            }
            tuwVar2 = tuwVar;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuwVar = dkh0Var.f;
            qcnVar = dkh0Var.e;
            xjh0Var = dkh0Var.d;
            v5bVar = dkh0Var.c;
            linkedHashMap = dkh0Var.b;
            tuwVar2 = dkh0Var.a;
            uj50.b(obj);
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : qcnVar) {
                if (((erq) obj2).l - jElapsedRealtime <= 0) {
                    arrayList.add(obj2);
                }
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj3 = arrayList.get(i3);
                i3++;
                n(linkedHashMap, v5bVar, xjh0Var, tuwVar2, (erq) obj3);
            }
            return Unit.a;
        } finally {
            tuwVar.f(null);
        }
    }

    public static final lyh<lk50<a5q>> m(xjh0 xjh0Var, quw quwVar, Map<String, xjh0.a> map, erq erqVar) {
        i6u i6uVar = xjh0Var.a;
        String str = erqVar.a;
        i6uVar.getClass();
        str.getClass();
        return ozh.c(new g1i(bm50.a(new xzh(new g1i(i6uVar.c(new n6u(i6uVar, str, null)), new c(erqVar, null)), new d(erqVar, xjh0Var, null))), new e(null, erqVar, quwVar, xjh0Var, map)), xjh0Var.d);
    }

    public static final void n(Map<String, xjh0.a> map, v5b v5bVar, xjh0 xjh0Var, quw quwVar, erq erqVar) {
        xjh0.a aVar = map.get(erqVar.a);
        if (aVar != null) {
            if ((aVar instanceof xjh0.a.C1292a) || aVar.equals(xjh0.a.b.a)) {
                return;
            }
            if (!(aVar instanceof xjh0.a.c)) {
                uhc.a();
                return;
            } else if (((xjh0.a.c) aVar).a > erqVar.k) {
                return;
            }
        }
        map.put(erqVar.a, xjh0.a.b.a);
        ej5.c(v5bVar, xjh0Var.d, null, new f(null, erqVar, quwVar, xjh0Var, map), 2);
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ckh0 ckh0Var = new ckh0(this.b, this.c, v1bVar);
        ckh0Var.a = obj;
        return ckh0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super c9p> v1bVar) {
        return ((ckh0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        tuw tuwVarA = uuw.a();
        xjh0 xjh0Var = this.b;
        ej5.c(v5bVar, null, null, new a(null, v5bVar, tuwVarA, xjh0Var, linkedHashMap), 3);
        return ej5.c(v5bVar, null, null, new b(xjh0Var, this.c, tuwVarA, linkedHashMap, null), 3);
    }
}
