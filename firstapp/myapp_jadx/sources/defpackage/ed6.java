package defpackage;

import com.sporty.android.core.model.captcha.InHoseCaptchaResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.captcha.inhouseCaptcha.CaptchaInHouseViewModel$verify$2", f = "CaptchaInHouseViewModel.kt", l = {115}, m = "invokeSuspend", v = 2)
public final class ed6 extends tje0 implements Function2<myh<? super lk50<? extends InHoseCaptchaResult>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ed6 ed6Var = new ed6(2, v1bVar);
        ed6Var.b = obj;
        return ed6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super lk50<? extends InHoseCaptchaResult>> myhVar, v1b<? super Unit> v1bVar) {
        return ((ed6) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            lk50.b bVar = lk50.b.a;
            this.b = null;
            this.a = 1;
            if (myhVar.emit(bVar, this) == y5bVar) {
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
