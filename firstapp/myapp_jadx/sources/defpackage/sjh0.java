package defpackage;

import com.sporty.android.core.model.patron.DefaultGift;
import com.sporty.android.core.model.patron.KYCBannerItem;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.usecase.UpdateDefaultGiftUseCase$invoke$2", f = "UpdateDefaultGiftUseCase.kt", l = {KYCBannerItem.STATUS_DEPRECATE}, m = "invokeSuspend", v = 2)
public final class sjh0 extends tje0 implements gaj<myh<? super Boolean>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tjh0 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjh0(tjh0 tjh0Var, boolean z, v1b<? super sjh0> v1bVar) {
        super(3, v1bVar);
        this.b = tjh0Var;
        this.c = z;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Boolean> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new sjh0(this.b, this.c, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            yzh yzhVarB = bm50.b(this.b.b.H(new DefaultGift(this.c)), vch0.b);
            this.a = 1;
            if (kzh.a(yzhVarB, this) == y5bVar) {
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
