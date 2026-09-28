package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.captcha.InHoseCaptchaResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.captcha.inhouseCaptcha.CaptchaInHouseViewModel$verify$3", f = "CaptchaInHouseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gd6 extends tje0 implements Function2<lk50<? extends InHoseCaptchaResult>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bd6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd6(bd6 bd6Var, v1b<? super gd6> v1bVar) {
        super(2, v1bVar);
        this.b = bd6Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gd6 gd6Var = new gd6(this.b, v1bVar);
        gd6Var.a = obj;
        return gd6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends InHoseCaptchaResult> lk50Var, v1b<? super Unit> v1bVar) {
        return ((gd6) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.b;
        final bd6 bd6Var = this.b;
        if (z) {
            ohp<Object>[] ohpVarArr = bd6.w;
            bd6Var.z1(udn.a(bd6Var.x1(), true, null, null, null, 14));
        } else if (lk50Var instanceof lk50.c) {
            bd6Var.a.a(new pdn.a.e(bd6Var.f, ((InHoseCaptchaResult) ((lk50.c) lk50Var).a).getToken()));
            bd6Var.a.a(new pdn.a.C0968a(bd6Var.f));
        } else {
            if (!(lk50Var instanceof lk50.a)) {
                uhc.a();
                return null;
            }
            Throwable th = ((lk50.a) lk50Var).a;
            Function1<? super UiText, Unit> function1 = new Function1() { // from class: fd6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    UiText uiText = (UiText) obj2;
                    ohp<Object>[] ohpVarArr2 = bd6.w;
                    bd6 bd6Var2 = bd6Var;
                    bd6Var2.z1(udn.a(bd6Var2.x1(), false, null, null, uiText, 7));
                    bd6Var2.A1(false);
                    return Unit.a;
                }
            };
            ohp<Object>[] ohpVarArr2 = bd6.w;
            bd6Var.y1(th, function1);
        }
        return Unit.a;
    }
}
