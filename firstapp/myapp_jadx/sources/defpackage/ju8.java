package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ju8 {
    public static final op8 a = new op8(236624874, new eu8(), false);
    public static final op8 b = new op8(141820, new fu8(), false);
    public static final op8 c = new op8(1888427345, new gu8(), false);

    @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.components.ComposableSingletons$ChallengeCardDetailKt$lambda$1888427345$1$1$1$1$1", f = "ChallengeCardDetail.kt", l = {149}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ b1g0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b1g0 b1g0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = b1g0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
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
                this.a = 1;
                if (this.b.c(huw.a, this) == y5bVar) {
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
}
