package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.data.BoostInfo;
import com.sportybet.plugin.realsports.event.PreMatchEventAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class fd20 implements gv5<BaseResponse<BoostInfo>> {
    public final /* synthetic */ PreMatchEventActivity a;

    public fd20(PreMatchEventActivity preMatchEventActivity) {
        this.a = preMatchEventActivity;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<BoostInfo>> su5Var, Throwable th) {
        th.getClass();
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<BoostInfo>> su5Var, bi50<BaseResponse<BoostInfo>> bi50Var) {
        PreMatchEventActivity preMatchEventActivity = this.a;
        ArrayList arrayList = preMatchEventActivity.O;
        if (preMatchEventActivity.isFinishing()) {
            return;
        }
        BaseResponse<BoostInfo> baseResponse = bi50Var.b;
        BoostInfo boostInfo = baseResponse != null ? baseResponse.data : null;
        if (!bi50Var.a.getIsSuccessful() || baseResponse == null || !baseResponse.isSuccessful() || boostInfo == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        PreMatchEventAdapter preMatchEventAdapter = preMatchEventActivity.A0;
        if (preMatchEventAdapter != null) {
            preMatchEventAdapter.showUseBoost(jCurrentTimeMillis > boostInfo.usableTime && jCurrentTimeMillis < boostInfo.expireTime);
        }
        arrayList.clear();
        Iterator<tcp> it = boostInfo.details.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            tcp next = it.next();
            HashMap map = new HashMap();
            xdp xdpVarD = next.d();
            map.put("tournamentId", xdpVarD.j("tournamentId").f());
            map.put("marketId", xdpVarD.j("marketId").f());
            if (xdpVarD.j("productId").b() == 0) {
                map.put("productId", "");
            } else {
                map.put("productId", String.valueOf(xdpVarD.j("productId").b()));
            }
            map.put("specifier", xdpVarD.j("specifier").f());
            arrayList.add(map);
        }
        PreMatchEventAdapter preMatchEventAdapter2 = preMatchEventActivity.A0;
        if (preMatchEventAdapter2 != null) {
            preMatchEventAdapter2.setBoostMatch(arrayList);
        }
    }
}
