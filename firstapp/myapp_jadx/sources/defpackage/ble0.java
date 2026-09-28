package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.data.SwipeBetOddsFilter;
import com.sportybet.plugin.realsports.data.SwipeBetOddsFilterRequest;
import com.sportybet.plugin.realsports.data.SwipeBetOptions;
import com.sportybet.plugin.realsports.data.SwipeBetPreferenceRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class ble0 extends j8i0 {
    public final mo0 a = l840.a();
    public final ssw<hqc> b;
    public final ssw<hqc> c;
    public final ArrayList d;
    public final ArrayList e;
    public SwipeBetOddsFilter f;
    public final uqm i;
    public final hle0 v;

    public ble0(uqm uqmVar, hle0 hle0Var) {
        ssw<hqc> sswVar = new ssw<>();
        this.b = sswVar;
        this.c = new ssw<>();
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.e = arrayList2;
        this.i = uqmVar;
        this.v = hle0Var;
        arrayList.clear();
        arrayList2.clear();
        this.f = null;
        sswVar.m(new lqc());
        ((u840) ap0.h.getValue()).a().G(new zke0(this));
    }

    public final String x1() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(((SwipeBetOptions) obj).id);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.e;
        int size2 = arrayList4.size();
        while (i < size2) {
            Object obj2 = arrayList4.get(i);
            i++;
            arrayList3.add(((SwipeBetOptions) obj2).id);
        }
        if (arrayList.size() == 0 && arrayList3.size() == 0 && this.f == null) {
            return "";
        }
        SwipeBetOddsFilterRequest swipeBetOddsFilterRequestBuild = this.f != null ? new SwipeBetOddsFilterRequest.Builder().setMin(this.f.minOdds).setMax(this.f.maxOdds).setIsMax(this.f.isMax).build() : null;
        SwipeBetPreferenceRequest.Builder markets = new SwipeBetPreferenceRequest.Builder().setLeagues(arrayList).setMarkets(arrayList3);
        if (swipeBetOddsFilterRequestBuild != null) {
            markets.setOddsFilter(swipeBetOddsFilterRequestBuild);
        }
        String json = sh8.b().toJson(markets.build());
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SWIPE_BET);
        aVar.a("SettingViewModel - generateRequestBody = %s", json);
        return json;
    }
}
