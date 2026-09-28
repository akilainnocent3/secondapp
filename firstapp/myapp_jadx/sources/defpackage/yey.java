package defpackage;

import com.sportybet.feature.luckynumber.featurematch.domain.data.LNLastMinuteCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLuckyNumberFeatureMatchCardsUseCase$observeTabSession$1", f = "ObserveLuckyNumberFeatureMatchCardsUseCase.kt", l = {187, 190}, m = "invokeSuspend", v = 2)
public final class yey extends tje0 implements Function2<ez20<? super b8q>, v1b<? super Unit>, Object> {
    public g8q a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ afy d;
    public final /* synthetic */ wwd0 e;

    @c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLuckyNumberFeatureMatchCardsUseCase$observeTabSession$1$1", f = "ObserveLuckyNumberFeatureMatchCardsUseCase.kt", l = {129}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ v340 b;
        public final /* synthetic */ b77 c;
        public final /* synthetic */ b77 d;
        public final /* synthetic */ ez20<b8q> e;

        /* JADX INFO: renamed from: yey$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLuckyNumberFeatureMatchCardsUseCase$observeTabSession$1$1$1", f = "ObserveLuckyNumberFeatureMatchCardsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1342a extends tje0 implements iaj<p8q, y7q, y7q, v1b<? super b8q>, Object> {
            public /* synthetic */ p8q a;
            public /* synthetic */ y7q b;
            public /* synthetic */ y7q c;

            @Override // defpackage.iaj
            public final Object d(p8q p8qVar, y7q y7qVar, y7q y7qVar2, v1b<? super b8q> v1bVar) {
                C1342a c1342a = new C1342a(4, v1bVar);
                c1342a.a = p8qVar;
                c1342a.b = y7qVar;
                c1342a.c = y7qVar2;
                return c1342a.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                p8q p8qVar = this.a;
                y7q y7qVar = this.b;
                y7q y7qVar2 = this.c;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                if (Intrinsics.g(p8qVar, p8q.c.a)) {
                    return new b8q(null, false, null, 31);
                }
                if (Intrinsics.g(p8qVar, p8q.a.a)) {
                    return new b8q(null, false, null, 15);
                }
                if (!(p8qVar instanceof p8q.b)) {
                    uhc.a();
                    return null;
                }
                p8q.b bVar = (p8q.b) p8qVar;
                q7q.b bVar2 = bVar.a;
                boolean z = bVar.c;
                z7q z7qVar = bVar.b;
                if (z7qVar == null) {
                    return new b8q(z ? a8q.c.a : a8q.b.a, bVar2 != null, bVar2, 16);
                }
                long j = y7qVar.a;
                long j2 = bVar.d;
                if (j != j2) {
                    y7qVar = null;
                }
                if (y7qVar2.a != j2) {
                    y7qVar2 = null;
                }
                ph80 ph80Var = new ph80();
                if (z || (y7qVar != null && y7qVar.b)) {
                    ph80Var.add(x7q.a);
                }
                if (z || (y7qVar2 != null && y7qVar2.b)) {
                    ph80Var.add(x7q.b);
                }
                return new b8q(new a8q.a(z7qVar, wi80.a(ph80Var)), bVar2 != null, bVar2, 16);
            }
        }

        public static final /* synthetic */ class b implements myh, paj {
            public final /* synthetic */ ez20<b8q> a;

            /* JADX WARN: Multi-variable type inference failed */
            public b(ez20<? super b8q> ez20Var) {
                this.a = ez20Var;
            }

            @Override // defpackage.paj
            public final haj<?> c() {
                return new saj(2, this.a, ez20.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                return this.a.j(v1bVar, (b8q) obj);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof myh) && (obj instanceof paj)) {
                    return Intrinsics.g(c(), ((paj) obj).c());
                }
                return false;
            }

            public final int hashCode() {
                return c().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v340 v340Var, b77 b77Var, b77 b77Var2, ez20 ez20Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = v340Var;
            this.c = b77Var;
            this.d = b77Var2;
            this.e = ez20Var;
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
                k1i k1iVarA = r1i.a(this.b, this.c, this.d, new C1342a(4, null));
                b bVar = new b(this.e);
                this.a = 1;
                if (k1iVarA.collect(bVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLuckyNumberFeatureMatchCardsUseCase$observeTabSession$1$2", f = "ObserveLuckyNumberFeatureMatchCardsUseCase.kt", l = {141}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ b390 b;
        public final /* synthetic */ afy c;
        public final /* synthetic */ wwd0 d;
        public final /* synthetic */ g8q e;

        public static final class a<T> implements myh {
            public final /* synthetic */ wwd0 a;

            public a(wwd0 wwd0Var) {
                this.a = wwd0Var;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                this.a.setValue((p8q) obj);
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: yey$b$b, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLuckyNumberFeatureMatchCardsUseCase$observeTabSession$1$2$invokeSuspend$$inlined$flatMapLatest$1", f = "ObserveLuckyNumberFeatureMatchCardsUseCase.kt", l = {189}, m = "invokeSuspend", v = 2)
        public static final class C1343b extends tje0 implements gaj<myh<? super p8q>, q8q, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object c;
            public final /* synthetic */ afy d;
            public final /* synthetic */ wwd0 e;
            public final /* synthetic */ g8q f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1343b(v1b v1bVar, afy afyVar, wwd0 wwd0Var, g8q g8qVar) {
                super(3, v1bVar);
                this.d = afyVar;
                this.e = wwd0Var;
                this.f = g8qVar;
            }

            @Override // defpackage.gaj
            public final Object invoke(myh<? super p8q> myhVar, q8q q8qVar, v1b<? super Unit> v1bVar) {
                C1343b c1343b = new C1343b(v1bVar, this.d, this.e, this.f);
                c1343b.b = myhVar;
                c1343b.c = q8qVar;
                return c1343b.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    myh myhVar = this.b;
                    or60 or60Var = new or60(new zey(this.e, (q8q) this.c, this.f, this.d, null));
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    if (kzh.c(myhVar, or60Var, this) == y5bVar) {
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
        public b(b390 b390Var, afy afyVar, wwd0 wwd0Var, g8q g8qVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = b390Var;
            this.c = afyVar;
            this.d = wwd0Var;
            this.e = g8qVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, this.d, this.e, v1bVar);
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
                afy afyVar = this.c;
                wwd0 wwd0Var = this.d;
                b77 b77VarF = r0i.f(this.b, new C1343b(null, afyVar, wwd0Var, this.e));
                a aVar = new a(wwd0Var);
                this.a = 1;
                if (b77VarF.collect(aVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLuckyNumberFeatureMatchCardsUseCase$observeTabSession$1$3", f = "ObserveLuckyNumberFeatureMatchCardsUseCase.kt", l = {148}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wwd0 b;
        public final /* synthetic */ wwd0 c;
        public final /* synthetic */ b390 d;

        public static final class a<T> implements myh {
            public final /* synthetic */ wwd0 a;
            public final /* synthetic */ yp40 b;
            public final /* synthetic */ b390 c;

            public a(wwd0 wwd0Var, yp40 yp40Var, b390 b390Var) {
                this.a = wwd0Var;
                this.b = yp40Var;
                this.c = b390Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                Object value;
                q7q q7qVar = (q7q) obj;
                wwd0 wwd0Var = this.a;
                Object value2 = wwd0Var.getValue();
                p8q.c cVar = p8q.c.a;
                if (Intrinsics.g(value2, cVar) || Intrinsics.g(wwd0Var.getValue(), p8q.a.a)) {
                    return Unit.a;
                }
                boolean z = q7qVar instanceof q7q.b;
                b390 b390Var = this.c;
                yp40 yp40Var = this.b;
                if (z) {
                    if (yp40Var.a) {
                        q7q.b bVar = (q7q.b) q7qVar;
                        if (bVar.e == vaq.a) {
                            yp40Var.a = false;
                            return b390Var.emit(new q8q.b(bVar), v1bVar);
                        }
                    }
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, cfy.b((p8q) value, (q7q.b) q7qVar)));
                } else {
                    if (q7qVar instanceof q7q.d) {
                        q7q.b bVar2 = ((q7q.d) q7qVar).a;
                        vaq vaqVar = vaq.a;
                        yp40Var.a = true;
                        return b390Var.emit(new q8q.a(bVar2), v1bVar);
                    }
                    if (!Intrinsics.g(q7qVar, q7q.a.a) && !Intrinsics.g(q7qVar, q7q.c.a)) {
                        uhc.a();
                        return null;
                    }
                    wwd0Var.setValue(cVar);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wwd0 wwd0Var, wwd0 wwd0Var2, b390 b390Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = wwd0Var;
            this.c = wwd0Var2;
            this.d = b390Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            a aVar = new a(this.c, new yp40(), this.d);
            this.a = 1;
            this.b.collect(aVar, this);
            return y5bVar;
        }
    }

    public static final /* synthetic */ class d extends d630 {
        public static final d b = new d(0, z7q.class, "highestOddsCard", "getHighestOddsCard()Lcom/sportybet/feature/luckynumber/featurematch/domain/data/LNHighestOddsCard;");

        @Override // defpackage.d630, defpackage.mhp
        public final Object get(Object obj) {
            return ((z7q) obj).d;
        }
    }

    public static final /* synthetic */ class e extends d630 {
        public static final e b = new e(0, ogq.class, "refreshAtElapsedRealtime", "getRefreshAtElapsedRealtime()J");

        @Override // defpackage.d630, defpackage.mhp
        public final Object get(Object obj) {
            return Long.valueOf(((ogq) obj).f);
        }
    }

    public static final /* synthetic */ class f extends d630 {
        public static final f b = new f(0, z7q.class, "lastMinuteCard", "getLastMinuteCard()Lcom/sportybet/feature/luckynumber/featurematch/domain/data/LNLastMinuteCard;");

        @Override // defpackage.d630, defpackage.mhp
        public final Object get(Object obj) {
            return ((z7q) obj).c;
        }
    }

    public static final /* synthetic */ class g extends d630 {
        public static final g b = new g(0, LNLastMinuteCard.class, "refreshAtElapsedRealtime", "getRefreshAtElapsedRealtime()J");

        @Override // defpackage.d630, defpackage.mhp
        public final Object get(Object obj) {
            return Long.valueOf(((LNLastMinuteCard) obj).i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yey(v1b v1bVar, afy afyVar, wwd0 wwd0Var) {
        super(2, v1bVar);
        this.d = afyVar;
        this.e = wwd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yey yeyVar = new yey(v1bVar, this.d, this.e);
        yeyVar.c = obj;
        return yeyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super b8q> ez20Var, v1b<? super Unit> v1bVar) throws Throwable {
        ((yey) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        g8q g8qVar;
        g8q g8qVar2;
        g8q g8qVar3;
        ez20 ez20Var = (ez20) this.c;
        y5b y5bVar = y5b.a;
        int i = this.b;
        int i2 = 2;
        int i3 = 1;
        if (i != 0) {
            if (i == 1) {
                g8q g8qVar4 = this.a;
                uj50.b(obj);
                g8qVar2 = g8qVar4;
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g8qVar3 = this.a;
                try {
                    uj50.b(obj);
                    throw new zrp();
                } catch (Throwable th) {
                    th = th;
                }
            }
            g8qVar3.a.k(null);
            throw th;
        }
        uj50.b(obj);
        afy afyVar = this.d;
        g8qVar = new g8q(ez20Var, afyVar.b);
        final wwd0 wwd0VarA = xwd0.a(new p8q.b(null, null, true, 0L));
        b390 b390VarB = d390.b(1, 0, null, 6);
        v340 v340VarB = e1i.b(wwd0VarA);
        x7q x7qVar = x7q.a;
        f fVar = f.b;
        b77 b77VarF = r0i.f(uzh.b(new tey(v340VarB, fVar)), new sey(null, afyVar, x7qVar, fVar, g.b, g8qVar, new vey(wwd0VarA, 0), new wey(wwd0VarA, 0), new Function0() { // from class: xey
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                wwd0VarA.setValue(p8q.a.a);
                return Unit.a;
            }
        }, new ws1(wwd0VarA, 2)));
        x7q x7qVar2 = x7q.b;
        d dVar = d.b;
        ej5.c(ez20Var, null, null, new a(v340VarB, b77VarF, r0i.f(uzh.b(new tey(v340VarB, dVar)), new sey(null, afyVar, x7qVar2, dVar, e.b, g8qVar, new uw6(wwd0VarA, i3), new ugf(wwd0VarA, 1), new vw6(wwd0VarA, i2), new zut(wwd0VarA, i3))), ez20Var, null), 3);
        ej5.c(ez20Var, null, null, new b(b390VarB, afyVar, wwd0VarA, g8qVar2, null), 3);
        ej5.c(ez20Var, null, null, new c(this.e, wwd0VarA, b390VarB, null), 3);
        q8q.c cVar = q8q.c.a;
        this.c = null;
        this.a = g8qVar2;
        this.b = 1;
        if (b390VarB.emit(cVar, this) == y5bVar) {
            g8qVar2 = g8qVar;
            return y5bVar;
        }
        try {
            g8qVar2 = g8qVar;
            this.c = null;
            this.a = g8qVar2;
            this.b = 2;
            hkd.a(this);
            return y5bVar;
        } catch (Throwable th2) {
            th = th2;
            g8qVar3 = g8qVar2;
        }
    }
}
