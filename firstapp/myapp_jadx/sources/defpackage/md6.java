package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.captcha.CaptchaConfigInfo;
import com.sporty.android.platform.features.captcha.model.CaptchaError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class md6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ md6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws CaptchaError.CaptchaAPIError {
        jd6 jd6Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fe6 fe6Var = (fe6) obj2;
                bi50 bi50Var = (bi50) obj;
                bi50Var.getClass();
                T t = bi50Var.b;
                t.getClass();
                BaseResponse baseResponse = (BaseResponse) t;
                if (!baseResponse.isSuccessful()) {
                    String str = baseResponse.message;
                    str.getClass();
                    throw new CaptchaError.CaptchaAPIError(str);
                }
                int providerId = ((CaptchaConfigInfo) baseResponse.data).getProviderId();
                jd6[] jd6VarArr = fe6Var.a;
                int length = jd6VarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        jd6Var = jd6VarArr[i2];
                        if (providerId != jd6Var.d()) {
                            i2++;
                        }
                    } else {
                        jd6Var = null;
                    }
                }
                if (!((CaptchaConfigInfo) baseResponse.data).getEnable() || jd6Var == null) {
                    return new fe6.a.b(((CaptchaConfigInfo) baseResponse.data).getCaptchaUuid());
                }
                String siteKey = ((CaptchaConfigInfo) baseResponse.data).getSiteKey();
                siteKey.getClass();
                return new fe6.a.C0561a(jd6Var, siteKey, ((CaptchaConfigInfo) baseResponse.data).getCaptchaUuid());
            default:
                tcf tcfVar = (tcf) obj;
                tcfVar.getClass();
                float fC1 = tcfVar.C1(4.0f);
                float fFloatValue = ((Number) ((wd0) obj2).d()).floatValue() * Float.intBitsToFloat((int) (tcfVar.d() >> 32));
                tcf.m0(tcfVar, j58.f, (((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fC1) << 32), 0.0f, null, 0, 120);
                return Unit.a;
        }
    }
}
