package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.realsports.data.BoostInfo;
import com.sportybet.plugin.realsports.event.EventLiveAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class gkg implements gv5<BaseResponse<BoostInfo>> {
    public final /* synthetic */ EventActivity a;

    public gkg(EventActivity eventActivity) {
        this.a = eventActivity;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<BoostInfo>> su5Var, Throwable th) {
        th.getClass();
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<BoostInfo>> su5Var, bi50<BaseResponse<BoostInfo>> bi50Var) {
        BoostInfo boostInfo;
        EventActivity eventActivity = this.a;
        ArrayList arrayList = eventActivity.c0;
        if (eventActivity.isFinishing()) {
            return;
        }
        BaseResponse<BoostInfo> baseResponse = bi50Var.b;
        if (!bi50Var.a.getIsSuccessful() || baseResponse == null || !baseResponse.isSuccessful() || (boostInfo = baseResponse.data) == null) {
            return;
        }
        BoostInfo boostInfo2 = boostInfo;
        long jCurrentTimeMillis = System.currentTimeMillis();
        EventLiveAdapter eventLiveAdapter = eventActivity.w0;
        if (eventLiveAdapter != null) {
            eventLiveAdapter.showUseBoost(jCurrentTimeMillis > boostInfo2.usableTime && jCurrentTimeMillis < boostInfo2.expireTime, boostInfo2.needClaim);
        }
        arrayList.clear();
        Iterator<tcp> it = boostInfo2.details.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            xdp xdpVarD = it.next().d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("tournamentId", xdpVarD.j("tournamentId").f());
            linkedHashMap.put("marketId", xdpVarD.j("marketId").f());
            linkedHashMap.put("productId", xdpVarD.j("productId").b() == 0 ? UccrWswQGaIj.FMOnUtKyezRcSEt : String.valueOf(xdpVarD.j("productId").b()));
            linkedHashMap.put("specifier", xdpVarD.j("specifier").f());
            arrayList.add(linkedHashMap);
        }
        EventLiveAdapter eventLiveAdapter2 = eventActivity.w0;
        if (eventLiveAdapter2 != null) {
            eventLiveAdapter2.setBoostMatch(arrayList);
        }
    }
}
