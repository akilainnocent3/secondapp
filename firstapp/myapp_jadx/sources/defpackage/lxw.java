package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.data.SimpleResponseWrapper;
import com.sportybet.plugin.myfavorite.widget.MyFavoriteLivePanel;
import com.sportybet.plugin.realsports.data.BoostInfo;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class lxw extends SimpleResponseWrapper<BoostInfo> {
    public final /* synthetic */ djs a;
    public final /* synthetic */ MyFavoriteLivePanel b;

    public lxw(MyFavoriteLivePanel myFavoriteLivePanel, djs djsVar) {
        this.b = myFavoriteLivePanel;
        this.a = djsVar;
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponseComplete() {
        MyFavoriteLivePanel myFavoriteLivePanel = this.b;
        try {
            djs djsVar = this.a;
            int i = MyFavoriteLivePanel.p0;
            myFavoriteLivePanel.G(djsVar);
        } catch (Exception unused) {
            int i2 = MyFavoriteLivePanel.p0;
            myFavoriteLivePanel.setVisibility(8);
        }
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(BoostInfo boostInfo) {
        BoostInfo boostInfo2 = boostInfo;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        boolean z = jCurrentTimeMillis > boostInfo2.usableTime && jCurrentTimeMillis < boostInfo2.expireTime;
        djs djsVar = this.a;
        djsVar.z = z;
        ArrayList arrayList = this.b.Q;
        arrayList.clear();
        bcp bcpVar = boostInfo2.details;
        if (bcpVar != null) {
            ArrayList<tcp> arrayList2 = bcpVar.a;
            int size = arrayList2.size();
            while (i < size) {
                tcp tcpVar = arrayList2.get(i);
                i++;
                HashMap map = new HashMap();
                xdp xdpVarD = tcpVar.d();
                map.put("tournamentId", xdpVarD.j("tournamentId").f());
                map.put(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, xdpVarD.j(AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID).f());
                map.put("marketId", xdpVarD.j("marketId").f());
                if (xdpVarD.j("productId").b() == 0) {
                    map.put("productId", "");
                } else {
                    map.put("productId", String.valueOf(xdpVarD.j("productId").b()));
                }
                arrayList.add(map);
            }
        }
        ArrayList arrayList3 = djsVar.A;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
    }
}
