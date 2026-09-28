package defpackage;

import com.sporty.android.core.model.ads.Ads;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.withdraw.momo.AdsViewModel$getBuyGiftWithdrawPageAd$1", f = "AdsViewModel.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class am extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ bm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(bm bmVar, v1b<? super am> v1bVar) {
        super(2, v1bVar);
        this.b = bmVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new am(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((am) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        bm bmVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            wl wlVar = bmVar.a;
            this.a = 1;
            obj = wlVar.a("buyGiftWithdrawPage", this);
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
        Ads ads = (Ads) obj;
        if (ads != null) {
            bmVar.b.m(ads);
        }
        return Unit.a;
    }
}
