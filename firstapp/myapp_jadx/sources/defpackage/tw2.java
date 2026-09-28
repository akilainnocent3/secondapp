package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.domain.usecase.BetOddsUseCases$validateBetOdds$1", f = "BetOddsUseCases.kt", l = {50}, m = "invokeSuspend", v = 2)
public final class tw2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ s9s b;
    public final /* synthetic */ ww2 c;
    public final /* synthetic */ ef3 d;

    @c0d(c = "com.sportybet.plugin.realsports.betslip.domain.usecase.BetOddsUseCases$validateBetOdds$1$1", f = "BetOddsUseCases.kt", l = {53}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ww2 b;
        public final /* synthetic */ ef3 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ww2 ww2Var, ef3 ef3Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = ww2Var;
            this.c = ef3Var;
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
                this.a = 1;
                obj = this.b.d(this);
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
            this.c.invoke((x8z) obj);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw2(s9s s9sVar, ww2 ww2Var, ef3 ef3Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = s9sVar;
        this.c = ww2Var;
        this.d = ef3Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tw2(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tw2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s.b bVar = s9s.b.d;
            a aVar = new a(this.c, this.d, null);
            this.a = 1;
            if (m850.a(this.b, bVar, aVar, this) == y5bVar) {
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
