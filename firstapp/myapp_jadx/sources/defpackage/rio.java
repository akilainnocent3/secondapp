package defpackage;

import com.sporty.android.core.model.instantwin.InstantWinPromotionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.manager.promotion.InstantWinPromotionManagerImpl$promoConfig$2", f = "InstantWinPromotionManagerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rio extends tje0 implements Function2<lk50<? extends InstantWinPromotionData>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ pio b;

    @c0d(c = "com.sportybet.android.instantwin.manager.promotion.InstantWinPromotionManagerImpl$promoConfig$2$1", f = "InstantWinPromotionManagerImpl.kt", l = {61}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ pio b;
        public final /* synthetic */ InstantWinPromotionData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pio pioVar, InstantWinPromotionData instantWinPromotionData, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = pioVar;
            this.c = instantWinPromotionData;
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
                int i2 = pio.w;
                if (this.b.c(this.c, this) == y5bVar) {
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
    public rio(v1b v1bVar, pio pioVar) {
        super(2, v1bVar);
        this.b = pioVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rio rioVar = new rio(v1bVar, this.b);
        rioVar.a = obj;
        return rioVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends InstantWinPromotionData> lk50Var, v1b<? super Unit> v1bVar) {
        return ((rio) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        InstantWinPromotionData instantWinPromotionData;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar == null || (instantWinPromotionData = (InstantWinPromotionData) cVar.a) == null) {
            return Unit.a;
        }
        pio pioVar = this.b;
        ej5.c(pioVar.e, null, null, new a(pioVar, instantWinPromotionData, null), 3);
        return Unit.a;
    }
}
