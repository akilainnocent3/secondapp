package defpackage;

import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common.data.ErrorResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.spin2win.model.response.WalletInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class eb20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eb20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        ErrorResponse errorResponse;
        String currency;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                bi50 bi50Var = (bi50) obj;
                int i2 = PreMatchEventActivity.a2;
                if (bi50Var == null) {
                    zyf0.c(1, preMatchEventActivity.getCMSString(R.string.common_feedback__failed_to_send_please_try_again, new Object[0]));
                } else if (bi50Var.a.getIsSuccessful()) {
                    zyf0.c(1, preMatchEventActivity.getCMSString(R.string.common_feedback__sent_successfully, new Object[0]));
                    preMatchEventActivity.O1();
                    preMatchEventActivity.i();
                    preMatchEventActivity.e1 = null;
                    preMatchEventActivity.W0 = null;
                    AppCompatEditText appCompatEditText = preMatchEventActivity.X0;
                    if (appCompatEditText != null) {
                        appCompatEditText.setText("");
                    }
                    zy80 zy80Var = preMatchEventActivity.d1;
                    if (zy80Var != null) {
                        zy80Var.c();
                    }
                    ConstraintLayout constraintLayout = preMatchEventActivity.l1;
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(8);
                    }
                    preMatchEventActivity.o1 = -1;
                } else {
                    ResponseBody responseBody = bi50Var.c;
                    if (responseBody != null && (errorResponse = ErrorResponse.INSTANCE.getErrorResponse(responseBody)) != null) {
                        if (errorResponse.getErrorCode() == 50203) {
                            zyf0.d(preMatchEventActivity.getCMSString(R.string.component_wap_share_bet__try_later_to_share_code, new Object[0]));
                        } else {
                            zyf0.d(errorResponse.getCauseMsg());
                        }
                    }
                }
                break;
            case 1:
                ((isw) obj2).A((int) (((jxo) obj).a >> 32));
                break;
            default:
                a1b0 a1b0Var = (a1b0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    WalletInfoResponse walletInfoResponse = a1b0Var.P;
                    if (walletInfoResponse != null && (currency = walletInfoResponse.getCurrency()) != null && currency.length() > 0) {
                        a1b0Var.J0();
                        GameDetails gameDetails = a1b0Var.i;
                        wz.a("BetConfirmed", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                    }
                    a1b0Var.getParentFragmentManager().a0();
                } else {
                    GameDetails gameDetails2 = a1b0Var.i;
                    wz.a("BetCancelled", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                    a1b0Var.getParentFragmentManager().a0();
                }
                a1b0Var.B = null;
                break;
        }
        return Unit.a;
    }
}
