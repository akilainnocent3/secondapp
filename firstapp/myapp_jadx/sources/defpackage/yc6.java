package defpackage;

import com.sporty.android.platform.features.captcha.inhouseCaptcha.CaptchaInHouseActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yc6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yc6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                CaptchaInHouseActivity captchaInHouseActivity = (CaptchaInHouseActivity) obj2;
                pdn.a aVar = (pdn.a) obj;
                int i2 = CaptchaInHouseActivity.b;
                pdn.a.C0968a c0968a = (pdn.a.C0968a) (aVar instanceof pdn.a.C0968a ? aVar : null);
                if (c0968a != null && c0968a.a == ((bd6) captchaInHouseActivity.a.getValue()).f && !captchaInHouseActivity.isFinishing()) {
                    captchaInHouseActivity.finish();
                }
                break;
            default:
                r320 r320Var = (r320) obj2;
                jox joxVar = (jox) obj;
                if (joxVar instanceof jox.c) {
                    lz1 lz1Var = r320Var.O;
                    if (lz1Var != null) {
                        lz1Var.c();
                    }
                    zyf0.c(1, ((jox.c) joxVar).a.getMessage());
                } else if (joxVar instanceof jox.a) {
                    ej5.c(ebs.a(r320Var.getLifecycle()), null, null, new u320(r320Var, joxVar, null), 3);
                }
                break;
        }
        return Unit.a;
    }
}
