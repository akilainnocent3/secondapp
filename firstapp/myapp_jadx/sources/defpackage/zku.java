package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.platform.features.captcha.model.CaptchaError;

/* JADX INFO: loaded from: classes5.dex */
public final class zku extends fte<Boolean> {
    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        String string;
        th.getClass();
        if (th instanceof CaptchaError) {
            hp0 hp0Var = hp0.A;
            hp0Var.getClass();
            string = ((CaptchaError) th).getErrorString(hp0Var);
        } else {
            string = th.toString();
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CAPTCHA);
        aVar.a("fetchCaptchaClient error: %s", string);
    }

    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        ((Boolean) obj).getClass();
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CAPTCHA);
        aVar.a("fetchCaptchaClient success captcha enable", new Object[0]);
    }
}
