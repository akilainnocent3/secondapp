package defpackage;

import android.text.TextUtils;
import androidx.fragment.app.e;
import com.google.android.material.tabs.TabLayout;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.activities.JackpotMainActivity;
import com.sportybet.plugin.jackpot.data.JackpotData;
import com.sportybet.plugin.jackpot.widget.LoadingView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class g7p implements gv5<BaseResponse<JackpotData>> {
    public final /* synthetic */ c7p a;

    public g7p(c7p c7pVar) {
        this.a = c7pVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<JackpotData>> su5Var, Throwable th) {
        c7p c7pVar;
        e activity;
        if (su5Var.isCanceled() || (activity = (c7pVar = this.a).getActivity()) == null || activity.isFinishing() || c7pVar.isDetached()) {
            return;
        }
        c7pVar.v.setVisibility(8);
        c7pVar.f.c();
        c7pVar.f.e();
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<JackpotData>> su5Var, bi50<BaseResponse<JackpotData>> bi50Var) {
        c7p c7pVar;
        e activity;
        if (su5Var.isCanceled() || (activity = (c7pVar = this.a).getActivity()) == null || activity.isFinishing() || c7pVar.isDetached()) {
            return;
        }
        c7pVar.f.a();
        if (!bi50Var.a.getIsSuccessful()) {
            onFailure(su5Var, null);
            return;
        }
        BaseResponse<JackpotData> baseResponse = bi50Var.b;
        if (baseResponse != null) {
            if (baseResponse.bizCode != 10000) {
                c7pVar.v.setVisibility(8);
                boolean zIsEmpty = TextUtils.isEmpty(baseResponse.message);
                LoadingView loadingView = c7pVar.f;
                if (zIsEmpty) {
                    loadingView.c();
                } else {
                    String str = baseResponse.message;
                    loadingView.setVisibility(0);
                    loadingView.b.setVisibility(8);
                    loadingView.a.setVisibility(0);
                    loadingView.a.a(str, null, "");
                    loadingView.c.setVisibility(8);
                }
                c7pVar.f.e();
                return;
            }
            JackpotData jackpotData = baseResponse.data;
            if (jackpotData != null) {
                JackpotData jackpotData2 = jackpotData;
                if (jackpotData2.elements != null) {
                    ArrayList arrayList = c7pVar.z;
                    c7pVar.A = jackpotData2.periodNumber;
                    JackpotMainActivity jackpotMainActivity = (JackpotMainActivity) c7pVar.getActivity();
                    String str2 = baseResponse.data.betType;
                    TabLayout.g gVarK = jackpotMainActivity.i.k(0);
                    if (!TextUtils.isEmpty(str2) && gVarK != null) {
                        gVarK.e(jackpotMainActivity.getCMSString(R.string.jackpot__sporty_games, str2));
                    }
                    arrayList.clear();
                    arrayList.addAll(baseResponse.data.elements);
                    c7pVar.v.setVisibility(0);
                    i6p i6pVar = c7pVar.w;
                    if (i6pVar == null) {
                        i6p i6pVar2 = new i6p();
                        i6pVar2.a = arrayList;
                        c7pVar.w = i6pVar2;
                        i6pVar2.b = c7pVar;
                        c7pVar.v.setAdapter(i6pVar2);
                    } else {
                        i6pVar.a = arrayList;
                        i6pVar.notifyDataSetChanged();
                    }
                    c7pVar.G.setVisibility(arrayList.isEmpty() ? 0 : 8);
                    c7pVar.B.setText(sn5.d(c7pVar, R.string.jackpot__round_no_prefix, baseResponse.data.periodNumber));
                    if (baseResponse.data.status != 1) {
                        c7pVar.t0(2);
                        c7pVar.V = false;
                        c7pVar.U.setEnabled(false);
                        c7pVar.F.setEnabled(false);
                        c7pVar.Z.setEnabled(false);
                        c7pVar.X.setVisibility(0);
                        return;
                    }
                    c7pVar.V = true;
                    c7pVar.U.setEnabled(true);
                    c7pVar.F.setEnabled(true);
                    c7pVar.Z.setEnabled(true);
                    c7pVar.X.setVisibility(8);
                    c7pVar.C0();
                    return;
                }
            }
            onFailure(su5Var, null);
        }
    }
}
