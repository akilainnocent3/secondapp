package defpackage;

import com.sporty.android.core.model.account.MyFavoriteStake;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.GetMyFavoriteStakeUseCase$remoteStakeFlow$1", f = "GetMyFavoriteStakeUseCase.kt", l = {57}, m = "invokeSuspend", v = 2)
public final class l9k extends tje0 implements Function2<ez20<? super MyFavoriteStake>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ m9k c;

    public static final /* synthetic */ class a extends saj implements Function0<Unit> {
        public final /* synthetic */ ez20<MyFavoriteStake> a;
        public final /* synthetic */ m9k b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ez20<? super MyFavoriteStake> ez20Var, m9k m9kVar) {
            super(0, Intrinsics.a.class, "sendData", "invokeSuspend$sendData(Lkotlinx/coroutines/channels/ProducerScope;Lcom/sportybet/feature/luckynumber/placebet/domain/GetMyFavoriteStakeUseCase;)V", 0);
            this.a = ez20Var;
            this.b = m9kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.a.c(this.b.b.getStake());
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9k(m9k m9kVar, v1b<? super l9k> v1bVar) {
        super(2, v1bVar);
        this.c = m9kVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        l9k l9kVar = new l9k(this.c, v1bVar);
        l9kVar.b = obj;
        return l9kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super MyFavoriteStake> ez20Var, v1b<? super Unit> v1bVar) {
        return ((l9k) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final m9k m9kVar = this.c;
        vxw vxwVar = m9kVar.b;
        ez20 ez20Var = (ez20) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final a aVar = new a(ez20Var, m9kVar);
            vxwVar.p(aVar);
            ez20Var.c(vxwVar.getStake());
            Function0 function0 = new Function0() { // from class: k9k
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    m9kVar.b.c(aVar);
                    return Unit.a;
                }
            };
            this.b = null;
            this.a = 1;
            if (az20.a(ez20Var, function0, this) == y5bVar) {
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
