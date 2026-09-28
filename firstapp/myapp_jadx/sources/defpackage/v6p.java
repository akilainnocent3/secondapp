package defpackage;

import android.text.TextUtils;
import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.data.JackpotData;
import com.sportybet.plugin.jackpot.data.PeriodNumber;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class v6p implements gv5<BaseResponse<JackpotData>> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ s6p b;

    public v6p(s6p s6pVar, boolean z) {
        this.b = s6pVar;
        this.a = z;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<JackpotData>> su5Var, Throwable th) {
        if (su5Var.isCanceled()) {
            return;
        }
        s6p s6pVar = this.b;
        e activity = s6pVar.getActivity();
        if (activity == null || activity.isFinishing() || s6pVar.isDetached()) {
            s6pVar.b.a();
            s6pVar.j0(false);
        } else {
            s6pVar.b.c();
            s6pVar.j0(true);
        }
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<JackpotData>> su5Var, bi50<BaseResponse<JackpotData>> bi50Var) {
        BaseResponse<JackpotData> baseResponse;
        s6p s6pVar = this.b;
        PeriodNumber periodNumber = s6pVar.H;
        if (su5Var.isCanceled()) {
            return;
        }
        e activity = s6pVar.getActivity();
        if (activity == null || activity.isFinishing() || s6pVar.isDetached()) {
            s6pVar.b.a();
            s6pVar.j0(false);
            return;
        }
        if (!bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null || baseResponse.data == null) {
            s6pVar.b.c();
            s6pVar.j0(true);
            return;
        }
        if (TextUtils.isEmpty(periodNumber.getPeriodNumber()) && !TextUtils.isEmpty(baseResponse.data.periodNumber)) {
            periodNumber.setPeriodNumber(baseResponse.data.periodNumber);
            periodNumber.setBetType(baseResponse.data.betType);
            periodNumber.setId(baseResponse.data.id);
            s6pVar.F.setText(sn5.d(s6pVar, R.string.jackpot__round_type, periodNumber.getPeriodNumber(), periodNumber.getBetType()));
            s6pVar.G.setText(sn5.d(s6pVar, R.string.jackpot__sporty_games, periodNumber.getBetType()));
            s6pVar.n0();
        }
        JackpotData jackpotData = baseResponse.data;
        s6pVar.y = jackpotData.status;
        s6pVar.A = jackpotData.winnings;
        s6pVar.z = jackpotData.elements;
        s6pVar.L = jackpotData.betType;
        if (!this.a) {
            s6pVar.o0();
            s6pVar.b.a();
            s6pVar.j0(false);
        } else {
            su5<BaseResponse<List<PeriodNumber>>> su5Var2 = s6pVar.J;
            if (su5Var2 != null) {
                su5Var2.cancel();
            }
            su5<BaseResponse<List<PeriodNumber>>> su5VarH = s6pVar.c.h();
            s6pVar.J = su5VarH;
            su5VarH.G(new t6p(s6pVar));
        }
    }
}
