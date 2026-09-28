package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class fod {
    public final rdd0 a;

    public fod(rdd0 rdd0Var) {
        rdd0Var.getClass();
        this.a = rdd0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(z000 z000Var, String str, vtw vtwVar, x1b x1bVar) throws Throwable {
        eod eodVar;
        Object objB;
        z000 z000Var2;
        if (x1bVar instanceof eod) {
            eodVar = (eod) x1bVar;
            int i = eodVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eodVar.d = i - Integer.MIN_VALUE;
            } else {
                eodVar = new eod(this, x1bVar);
            }
        } else {
            eodVar = new eod(this, x1bVar);
        }
        eod eodVar2 = eodVar;
        Object obj = eodVar2.b;
        y5b y5bVar = y5b.a;
        int i2 = eodVar2.d;
        rdd0 rdd0Var = this.a;
        if (i2 == 0) {
            uj50.b(obj);
            rdd0Var.a(new knd("low_success_rate"), k00.d);
            StringUiText stringUiText = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__provider_drop_alert_dialog_content, ay0.S(new Object[]{str}));
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.page_payment__provider_drop_alert_dialog_title);
            ResourceUiText resourceUiText3 = new ResourceUiText(R.string.page_payment__paybill);
            ResourceUiText resourceUiText4 = new ResourceUiText(R.string.common_functions__proceed_anyway);
            kyf0.b bVar = kyf0.b.b;
            eodVar2.a = z000Var;
            eodVar2.d = 1;
            objB = f8e.b(vtwVar, resourceUiText2, resourceUiText, resourceUiText3, resourceUiText4, bVar, null, eodVar2, 96);
            if (objB == y5bVar) {
                return y5bVar;
            }
            z000Var2 = z000Var;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z000 z000Var3 = eodVar2.a;
            uj50.b(obj);
            objB = obj;
            z000Var2 = z000Var3;
        }
        int iOrdinal = ((l600) objB).ordinal();
        if (iOrdinal == 0) {
            rdd0Var.a(new jnd("low_success_rate", "primary", "page_payment__paybill"), k00.d);
            return z000Var2;
        }
        if (iOrdinal == 1) {
            rdd0Var.a(new jnd("low_success_rate", "secondary", "common_functions__proceed_anyway"), k00.d);
            return z000.e.a;
        }
        if (iOrdinal == 2) {
            return z000.b.a;
        }
        uhc.a();
        return null;
    }
}
