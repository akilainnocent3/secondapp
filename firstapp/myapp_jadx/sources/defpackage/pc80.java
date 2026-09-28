package defpackage;

import com.sporty.android.core.model.captcha.CaptchaData;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import com.sporty.android.core.model.captcha.OTPCodeRequest;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class pc80 {
    public final fe6 a;
    public final v8w b;
    public final k5b c;

    public pc80(fe6 fe6Var, v8w v8wVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        fe6Var.getClass();
        v8wVar.getClass();
        this.a = fe6Var;
        this.b = v8wVar;
        this.c = k5bVar;
    }

    public final yzh a(OtpSelection otpSelection, String str, j6c j6cVar, String str2, String str3) {
        otpSelection.getClass();
        str.getClass();
        j6cVar.getClass();
        str2.getClass();
        str3.getClass();
        final OTPCodeRequest oTPCodeRequest = new OTPCodeRequest(str, str2, str3, otpSelection.b, null, 16, null);
        return bm50.a(new oc80(ozh.c(this.a.d(j6cVar, new CaptchaData.Phone(str2, str3), new Function1() { // from class: nc80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CaptchaHeader captchaHeader = (CaptchaHeader) obj;
                captchaHeader.getClass();
                return this.a.b.b(oTPCodeRequest, captchaHeader.getUuid(), captchaHeader.getToken());
            }
        }), this.c), otpSelection));
    }
}
