package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.pocket.withdraw.WithdrawRequest;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class cj7 {
    public final sr10 a;
    public final mgb0 b;

    public cj7(sr10 sr10Var, mgb0 mgb0Var) {
        sr10Var.getClass();
        mgb0Var.getClass();
        this.a = sr10Var;
        this.b = mgb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(WithdrawRequest withdrawRequest, vtw vtwVar, vtw vtwVar2, x1b x1bVar) {
        bj7 bj7Var;
        if (x1bVar instanceof bj7) {
            bj7Var = (bj7) x1bVar;
            int i = bj7Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                bj7Var.e = i - Integer.MIN_VALUE;
            } else {
                bj7Var = new bj7(this, x1bVar);
            }
        } else {
            bj7Var = new bj7(this, x1bVar);
        }
        Object objY = bj7Var.c;
        y5b y5bVar = y5b.a;
        int i2 = bj7Var.e;
        if (i2 == 0) {
            uj50.b(objY);
            bj7Var.a = vtwVar;
            bj7Var.b = vtwVar2;
            bj7Var.e = 1;
            objY = this.a.Y(withdrawRequest, bj7Var);
            if (objY == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vtwVar2 = bj7Var.b;
            vtwVar = bj7Var.a;
            uj50.b(objY);
        }
        vtw vtwVar3 = vtwVar;
        BaseResponse baseResponse = (BaseResponse) objY;
        tcp tcpVar = (tcp) baseResponse.data;
        tcpVar.getClass();
        if (tcpVar instanceof cep) {
            if ((((tcp) baseResponse.data).e().a instanceof Boolean) && ((tcp) baseResponse.data).a()) {
                mgb0 mgb0Var = this.b;
                AccountInfo accountInfoLastAccountInfo = mgb0Var.lastAccountInfo();
                String firstName = accountInfoLastAccountInfo != null ? accountInfoLastAccountInfo.getFirstName() : null;
                AccountInfo accountInfoLastAccountInfo2 = mgb0Var.lastAccountInfo();
                String strA = oxc.a(firstName, " ", accountInfoLastAccountInfo2 != null ? accountInfoLastAccountInfo2.getLastName() : null);
                StringUiText stringUiText = vch0.a;
                vpg0.e(vtwVar3, new ResourceUiText(R.string.identity_verification__name_mismatch), new ResourceUiText(R.string.identity_verification__please_withdraw_to_account_aligned_vname_tip, ay0.S(new Object[]{strA})), new ResourceUiText(R.string.identity_verification__change_your_name), new aj7(vtwVar2, 0), 132);
                return Boolean.FALSE;
            }
        } else if (baseResponse.bizCode == 66207) {
            StringUiText stringUiText2 = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.page_withdraw__withdrawal_failed);
            String str = baseResponse.message;
            str.getClass();
            vpg0.e(vtwVar3, resourceUiText, new StringUiText(str), null, null, 444);
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
