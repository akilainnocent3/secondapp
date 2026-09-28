package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class iuo {
    public final rdd0 a;
    public final juo b;

    public iuo(rdd0 rdd0Var, juo juoVar) {
        rdd0Var.getClass();
        this.a = rdd0Var;
        this.b = juoVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object a(kuo kuoVar, vtw vtwVar, x1b x1bVar) throws Throwable {
        huo huoVar;
        m67 m67Var;
        int i;
        Object objB;
        kuo kuoVar2 = kuoVar;
        if (x1bVar instanceof huo) {
            huoVar = (huo) x1bVar;
            int i2 = huoVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                huoVar.e = i2 - Integer.MIN_VALUE;
            } else {
                huoVar = new huo(this, x1bVar);
            }
        } else {
            huoVar = new huo(this, x1bVar);
        }
        huo huoVar2 = huoVar;
        Object obj = huoVar2.c;
        y5b y5bVar = y5b.a;
        int i3 = huoVar2.e;
        rdd0 rdd0Var = this.a;
        if (i3 == 0) {
            uj50.b(obj);
            rdd0Var.a(new knd("insufficient_fund"), k00.d);
            ConcatUiText concatUiTextA = this.b.a();
            kuoVar2.getClass();
            if (kuoVar2 instanceof kuo.a) {
                StringUiText stringUiText = vch0.a;
                m67Var = new m67(new ResourceUiText(R.string.common_functions__dial_ussd_to_top_up), n67.b.a, "common_functions__dial_ussd_to_top_up");
            } else if (kuoVar2 instanceof kuo.d) {
                StringUiText stringUiText2 = vch0.a;
                m67Var = new m67(new ResourceUiText(R.string.common_functions__check_balance_with_network), n67.a.a, "common_functions__check_balance_with_network");
            } else {
                StringUiText stringUiText3 = vch0.a;
                m67Var = new m67(new ResourceUiText(R.string.common_functions__check_balance_with_network), n67.a.a, "common_functions__check_balance_with_network");
            }
            ResourceUiText resourceUiText = new ResourceUiText(R.string.page_payment__last_deposit_failed);
            ResourceUiText resourceUiText2 = new ResourceUiText(R.string.common_functions__proceed_anyway);
            kyf0.b bVar = kyf0.b.b;
            huoVar2.a = kuoVar2;
            huoVar2.b = m67Var;
            huoVar2.e = 1;
            i = 1;
            objB = f8e.b(vtwVar, resourceUiText, concatUiTextA, m67Var.a, resourceUiText2, bVar, m67Var.b, huoVar2, 64);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m67Var = huoVar2.b;
            kuoVar2 = huoVar2.a;
            uj50.b(obj);
            objB = obj;
            i = 1;
        }
        int iOrdinal = ((l600) objB).ordinal();
        if (iOrdinal == 0) {
            rdd0Var.a(new jnd("insufficient_fund", "primary", m67Var.c), k00.d);
            return kuoVar2;
        }
        if (iOrdinal == i) {
            rdd0Var.a(new jnd("insufficient_fund", "secondary", "common_functions__proceed_anyway"), k00.d);
            return kuo.e.a;
        }
        if (iOrdinal == 2) {
            return kuo.b.a;
        }
        uhc.a();
        return null;
    }
}
