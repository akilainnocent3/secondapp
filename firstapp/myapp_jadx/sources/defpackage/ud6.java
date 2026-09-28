package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.platform.features.captcha.model.CaptchaError;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ud6 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws CaptchaError.CaptchaNeedRetry {
        BaseResponse baseResponse = (BaseResponse) obj;
        baseResponse.getClass();
        if (baseResponse.bizCode != 12020) {
            return baseResponse;
        }
        throw new CaptchaError.CaptchaNeedRetry(baseResponse.message);
    }
}
