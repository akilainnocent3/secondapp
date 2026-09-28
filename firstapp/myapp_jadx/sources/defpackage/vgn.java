package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.captcha.CaptchaData;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import com.sporty.android.core.model.patron.InitSmsVerificationResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class vgn {
    public final fe6 a;
    public final xxz b;
    public final psm c;

    public vgn(fe6 fe6Var, xxz xxzVar, psm psmVar) {
        fe6Var.getClass();
        xxzVar.getClass();
        psmVar.getClass();
        this.a = fe6Var;
        this.b = xxzVar;
        this.c = psmVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(final String str, final String str2, final String str3, x1b x1bVar) {
        ugn ugnVar;
        j6c j6cVar;
        if (x1bVar instanceof ugn) {
            ugnVar = (ugn) x1bVar;
            int i = ugnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugnVar.c = i - Integer.MIN_VALUE;
            } else {
                ugnVar = new ugn(this, x1bVar);
            }
        } else {
            ugnVar = new ugn(this, x1bVar);
        }
        Object objA = ugnVar.a;
        y5b y5bVar = y5b.a;
        int i2 = ugnVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                fe6 fe6Var = this.a;
                str2.getClass();
                int iHashCode = str2.hashCode();
                if (iHashCode != -1876399509) {
                    if (iHashCode != -1452371317) {
                        j6cVar = (iHashCode == 92413603 && str2.equals("REGISTER")) ? j6c.REGISTER : j6c.REGISTER;
                    } else if (str2.equals("PASSWORD_RESET")) {
                        j6cVar = j6c.RESET_PASSWORD;
                    }
                } else if (str2.equals("WITHDRAW_CONFIRM")) {
                    j6cVar = j6c.WITHDRAW;
                }
                ct90 ct90VarB = fe6Var.c(j6cVar, new CaptchaData.Phone(str, this.c.P()), new Function1() { // from class: tgn
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        CaptchaHeader captchaHeader = (CaptchaHeader) obj;
                        captchaHeader.getClass();
                        return this.a.b.B0(str, str2, str3, captchaHeader.getUuid(), captchaHeader.getToken());
                    }
                }).d(wm70.c).b(va0.a());
                ugnVar.c = 1;
                objA = i6b.a(ct90VarB, ugnVar);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objA);
            }
            BaseResponse baseResponse = (BaseResponse) objA;
            int i3 = baseResponse.bizCode;
            if (i3 == 10000) {
                InitSmsVerificationResponse initSmsVerificationResponse = (InitSmsVerificationResponse) baseResponse.data;
                String token = initSmsVerificationResponse != null ? initSmsVerificationResponse.getToken() : null;
                return token == null ? new sgn.a(null, null) : new sgn.b(token);
            }
            if (i3 != 11703) {
                return new sgn.a(new Integer(i3), baseResponse.message);
            }
            InitSmsVerificationResponse initSmsVerificationResponse2 = (InitSmsVerificationResponse) baseResponse.data;
            String token2 = initSmsVerificationResponse2 != null ? initSmsVerificationResponse2.getToken() : null;
            InitSmsVerificationResponse initSmsVerificationResponse3 = (InitSmsVerificationResponse) baseResponse.data;
            String msgContent = initSmsVerificationResponse3 != null ? initSmsVerificationResponse3.getMsgContent() : null;
            InitSmsVerificationResponse initSmsVerificationResponse4 = (InitSmsVerificationResponse) baseResponse.data;
            String smsNumber = initSmsVerificationResponse4 != null ? initSmsVerificationResponse4.getSmsNumber() : null;
            if (token2 != null && msgContent != null && smsNumber != null) {
                return new sgn.c(token2, smsNumber, msgContent);
            }
            return new sgn.a(null, null);
        } catch (Throwable th) {
            itf0.a.e(th);
            return new sgn.a(null, null);
        }
    }
}
