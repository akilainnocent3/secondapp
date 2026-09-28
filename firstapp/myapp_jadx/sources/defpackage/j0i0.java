package defpackage;

import com.sporty.android.platform.features.newotp.feature.verifyphoneforbonus.VerifyPhoneForBonusActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.feature.verifyphoneforbonus.VerifyPhoneForBonusActivity$showBonusUnlockedScreen$1", f = "VerifyPhoneForBonusActivity.kt", l = {59}, m = "invokeSuspend", v = 2)
public final class j0i0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ VerifyPhoneForBonusActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0i0(VerifyPhoneForBonusActivity verifyPhoneForBonusActivity, v1b<? super j0i0> v1bVar) {
        super(2, v1bVar);
        this.b = verifyPhoneForBonusActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j0i0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j0i0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(500L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        VerifyPhoneForBonusActivity verifyPhoneForBonusActivity = this.b;
        zn8.a(verifyPhoneForBonusActivity, new op8(-1168067115, new nwd(verifyPhoneForBonusActivity), true));
        return Unit.a;
    }
}
