package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.antest.InstantFootballBetslipRecommendationAnTestHelper$processAddRecommendationToBetslipConversion$1", f = "InstantFootballBetslipRecommendationAnTestHelper.kt", l = {91}, m = "invokeSuspend", v = 2)
public final class wpn extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ypn b;

    @c0d(c = "com.sportybet.android.instantwin.antest.InstantFootballBetslipRecommendationAnTestHelper$processAddRecommendationToBetslipConversion$1$1", f = "InstantFootballBetslipRecommendationAnTestHelper.kt", l = {92}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ypn b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, ypn ypnVar) {
            super(2, v1bVar);
            this.b = ypnVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b);
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
                yqm yqmVar = this.b.a;
                x66<etm> x66Var = z76.t;
                String str = x66Var.a;
                String str2 = (String) CollectionsKt.b0(x66Var.b);
                this.a = 1;
                if (yqmVar.c(str, str2, "1", this) == y5bVar) {
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
    public wpn(v1b v1bVar, ypn ypnVar) {
        super(2, v1bVar);
        this.b = ypnVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wpn(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wpn) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                b.a aVar = b.b;
                long jH = c.h(10, rgf.SECONDS);
                a aVar2 = new a(null, this.b);
                this.a = 1;
                obj = vxf0.d(jH, aVar2, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
        } catch (Throwable unused) {
        }
        return Unit.a;
    }
}
