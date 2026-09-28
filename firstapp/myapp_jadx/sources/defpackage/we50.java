package defpackage;

import android.view.View;
import com.sporty.android.core.model.captcha.CaptchaData;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import com.sportybet.android.account.international.resetpwd.ResetPwdConfirmFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class we50 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ fxo b;
    public final /* synthetic */ ResetPwdConfirmFragment c;

    public we50(cq40 cq40Var, fxo fxoVar, ResetPwdConfirmFragment resetPwdConfirmFragment) {
        this.a = cq40Var;
        this.b = fxoVar;
        this.c = resetPwdConfirmFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 350) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        fxo fxoVar = this.b;
        fxoVar.f.setLoading(true);
        ohp<Object>[] ohpVarArr = ResetPwdConfirmFragment.z;
        ResetPwdConfirmFragment resetPwdConfirmFragment = this.c;
        final ef50 ef50Var = (ef50) resetPwdConfirmFragment.v.getValue();
        final String strA = auf.a(fxoVar.d);
        strA.getClass();
        r5b r5bVarC = i2i.c(new yzh(new xzh(new bf50(ef50Var.b.a(j6c.INT_RESET_PASSWORD, new CaptchaData.Email(strA), o8i0.d(ef50Var), new Function1() { // from class: af50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CaptchaHeader captchaHeader = (CaptchaHeader) obj;
                captchaHeader.getClass();
                return ef50Var.a.h(strA, captchaHeader);
            }
        })), new cf50(2, null)), new df50(3, null)), o8i0.d(ef50Var).a, 2);
        ibs viewLifecycleOwner = resetPwdConfirmFragment.getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        r5bVarC.f(viewLifecycleOwner, new ue50(new xe50(r5bVarC, viewLifecycleOwner, fxoVar, resetPwdConfirmFragment)));
    }
}
