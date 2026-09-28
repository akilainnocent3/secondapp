package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.LeftMenuButton;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.pingpong.remote.models.RoundResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p4s implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p4s(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1<Boolean, Unit> onStateChange;
        RoundResponse roundResponse;
        RoundResponse.WaitingRound ongoingRound;
        RoundResponse roundResponse2;
        RoundResponse.WaitingRound waitingRound;
        Integer code;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                LeftMenuButton leftMenuButton = (LeftMenuButton) obj2;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                if (leftMenuButton != null && (onStateChange = leftMenuButton.getOnStateChange()) != null) {
                    onStateChange.invoke(bool);
                }
                return Unit.a;
            default:
                final m410 m410Var = (m410) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = m410.b.a[loadingState.getStatus().ordinal()];
                int i3 = 1;
                if (i2 != 1) {
                    int i4 = 2;
                    if (i2 != 2) {
                        if (i2 != 3) {
                            uhc.a();
                            return null;
                        }
                        ixi ixiVar = (ixi) m410Var.b;
                        if (ixiVar != null) {
                            ixiVar.U.O(100);
                        }
                        ResultWrapper.GenericError error = loadingState.getError();
                        if (error == null || (code = error.getCode()) == null || code.intValue() != 403 || m410Var.l0) {
                            Context context = m410Var.getContext();
                            if (context != null) {
                                vs80 vs80Var = vs80.b;
                                ResultWrapper.GenericError error2 = loadingState.getError();
                                q6d q6dVar = new q6d(m410Var, i4);
                                Function0 function0 = new Function0() { // from class: g110
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        m410Var.L0().x1();
                                        return Unit.a;
                                    }
                                };
                                h110 h110Var = new h110();
                                context.getColor(R.color.sh_error_btn_color);
                                vs80Var.c(context, error2, q6dVar, function0, h110Var, 0, (640 & 128) != 0 ? new mm60() : null, (640 & 512) != 0 ? new xvj(2) : new u6d(m410Var, i3));
                            }
                        } else {
                            m410Var.l0 = true;
                            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                        }
                    }
                } else {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    m410Var.J = (hTTPResponse == null || (roundResponse2 = (RoundResponse) hTTPResponse.getData()) == null || (waitingRound = roundResponse2.getWaitingRound()) == null) ? 0L : waitingRound.getId();
                    ixi ixiVar2 = (ixi) m410Var.b;
                    if (ixiVar2 != null) {
                        ixiVar2.U.P();
                    }
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    if (((hTTPResponse2 == null || (roundResponse = (RoundResponse) hTTPResponse2.getData()) == null || (ongoingRound = roundResponse.getOngoingRound()) == null) ? null : Long.valueOf(ongoingRound.getId())) != null) {
                        jn1 jn1VarL0 = m410Var.L0();
                        ej5.c(o8i0.d(jn1VarL0), null, null, new rm1(jn1VarL0, null), 3);
                    } else {
                        jn1 jn1VarL1 = m410Var.L0();
                        ej5.c(o8i0.d(jn1VarL1), null, null, new wn1(jn1VarL1, null), 3);
                    }
                }
                return Unit.a;
        }
    }
}
