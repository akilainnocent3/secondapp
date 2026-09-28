package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.captcha.CaptchaData;
import com.sporty.android.core.model.captcha.CaptchaHeader;
import com.sporty.android.core.model.patron.Get2FAInfoResponse;
import com.twilio.voice.EventKeys;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class lcu implements gcu {
    public final xxz a;
    public final psm b;
    public final ema c = new ema();

    public lcu(psm psmVar, xxz xxzVar) {
        this.a = xxzVar;
        this.b = psmVar;
    }

    @Override // defpackage.gcu
    public final void a() {
        this.c.d();
    }

    @Override // defpackage.gcu
    public final void b(String str, boolean z, String str2, pd7 pd7Var) {
        str.getClass();
        str2.getClass();
        xdp xdpVar = new xdp();
        if (z) {
            xdpVar.i("contact", str);
        } else {
            xdpVar.i("phone", str);
        }
        xdpVar.i(EventKeys.ERROR_CODE, str2);
        ct90<BaseResponse<Void>> ct90VarL = this.a.l(xdpVar.toString());
        qm70 qm70Var = wm70.c;
        ct90<BaseResponse<Void>> ct90VarB = ct90VarL.d(qm70Var).b(qm70Var);
        kcu kcuVar = new kcu(pd7Var);
        ct90VarB.a(kcuVar);
        this.c.b(kcuVar);
    }

    @Override // defpackage.gcu
    public final void c(fe6 fe6Var, String str, boolean z, mcu mcuVar) {
        fe6Var.getClass();
        str.getClass();
        final xdp xdpVar = new xdp();
        if (z) {
            xdpVar.i("contact", str);
        } else {
            xdpVar.i("phone", str);
        }
        cu90 cu90VarC = fe6Var.c(j6c.TWO_FA_LOGIN, new CaptchaData.Phone(str, this.b.P()), new Function1() { // from class: hcu
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CaptchaHeader captchaHeader = (CaptchaHeader) obj;
                captchaHeader.getClass();
                return this.a.a.j1(xdpVar.toString(), captchaHeader.getUuid(), captchaHeader.getToken());
            }
        });
        qm70 qm70Var = wm70.c;
        ct90 ct90VarB = cu90VarC.d(qm70Var).b(qm70Var);
        jcu jcuVar = new jcu(mcuVar);
        ct90VarB.a(jcuVar);
        this.c.b(jcuVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.gcu
    public final Object d(x1b x1bVar) {
        icu icuVar;
        Throwable th;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof icu) {
            icuVar = (icu) x1bVar;
            int i = icuVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                icuVar.d = i - Integer.MIN_VALUE;
            } else {
                icuVar = new icu(this, x1bVar);
            }
        } else {
            icuVar = new icu(this, x1bVar);
        }
        Object obj = icuVar.b;
        y5b y5bVar = y5b.a;
        int i2 = icuVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                xxz xxzVar = this.a;
                icuVar.a = resourceUiText;
                icuVar.d = 1;
                Object objE0 = xxzVar.E0(icuVar);
                if (objE0 == y5bVar) {
                    return y5bVar;
                }
                obj = objE0;
                uiText = resourceUiText;
            } catch (Throwable th2) {
                th = th2;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = icuVar.a;
            try {
                uj50.b(obj);
            } catch (Throwable th3) {
                th = th3;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        bVar = (Get2FAInfoResponse) n52.b((BaseResponse) obj);
        zi50.a aVar4 = zi50.b;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }
}
