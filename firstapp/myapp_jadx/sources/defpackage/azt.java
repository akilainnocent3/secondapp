package defpackage;

import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.spinmatch.components.BetConfig;
import com.sportygames.spinmatch.model.response.DetailResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class azt implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ azt(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Integer numValueOf;
        int payout;
        DetailResponse.BetConfigList betConfigList;
        DetailResponse.BetConfigList betConfigList2;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj2;
                String str = (String) obj;
                str.getClass();
                function1.invoke(new igm.f(str));
                function1.invoke(new igm.s(new cqt(0), k00.f));
                break;
            case 1:
                lk50 lk50Var = (lk50) obj;
                lk50Var.getClass();
                wwd0 wwd0Var = ((jk20) obj2).J;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, lk50Var));
                break;
            case 2:
                kab0 kab0Var = (kab0) obj2;
                double dDoubleValue = ((Double) obj).doubleValue();
                List<Double> list = kab0Var.f.get(Integer.valueOf(kab0Var.i));
                if ((list != null ? CollectionsKt.s0(list) : 0.0d) + dDoubleValue > kab0Var.v) {
                    fo80 fo80Var = kab0Var.c;
                    if (fo80Var != null) {
                        BetConfig betConfig = fo80Var.c;
                        int i2 = kab0Var.i;
                        vk2 vk2Var = betConfig.binding;
                        RecyclerView.f adapter = vk2Var != null ? vk2Var.b.getAdapter() : null;
                        adapter.getClass();
                        ArrayList<DetailResponse.BetConfigList> arrayList = ((tk2) adapter).a;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            int i3 = 0;
                            do {
                                if (i3 < size) {
                                    betConfigList = arrayList.get(i3);
                                    i3++;
                                } else {
                                    betConfigList = null;
                                }
                                betConfigList2 = betConfigList;
                                if (betConfigList2 != null) {
                                    payout = (int) betConfigList2.getPayout();
                                } else {
                                    payout = 0;
                                }
                            } while (betConfigList.getId() != i2);
                            betConfigList2 = betConfigList;
                            if (betConfigList2 != null) {
                                payout = (int) betConfigList2.getPayout();
                            } else {
                                payout = 0;
                            }
                        } else {
                            payout = 0;
                        }
                        numValueOf = Integer.valueOf(payout);
                    } else {
                        numValueOf = null;
                    }
                    double d = kab0Var.v;
                    String strValueOf = String.valueOf(numValueOf);
                    fo80 fo80Var2 = kab0Var.c;
                    if (fo80Var2 != null) {
                        fo80Var2.d0.setVisibility(0);
                    }
                    if (kab0Var.getContext() != null) {
                        String string = kab0Var.getString(R.string.max_bet_toast_error);
                        string.getClass();
                        HashMap map = new HashMap();
                        map.put(kab0Var.getString(R.string.payout_cms), strValueOf);
                        String string2 = kab0Var.getString(R.string.currency_cms);
                        op5 op5Var = op5.a;
                        String str2 = kab0Var.L;
                        op5Var.getClass();
                        map.put(string2, op5.i(str2));
                        String string3 = kab0Var.getString(R.string.maxAmount_cms);
                        TreeMap treeMap = pw.a;
                        String strA = pw.a(String.valueOf(d));
                        if (strA == null) {
                            strA = "";
                        }
                        map.put(string3, strA);
                        String strI = op5.i(kab0Var.L);
                        String strA2 = pw.a(String.valueOf(d));
                        String string4 = kab0Var.getString(R.string.max_bet_text, strValueOf, strI, strA2 != null ? strA2 : "");
                        string4.getClass();
                        op5.b(string, string4, map);
                        fo80 fo80Var3 = kab0Var.c;
                        if (fo80Var3 != null) {
                            fo80Var3.d0.setMessageandBG(R.color.sg_spin_match_max_toast_color, op5.b(string, string4, map));
                        }
                    }
                    ej5.c(ebs.a(kab0Var.getLifecycle()), null, null, new zab0(kab0Var, null), 3);
                } else {
                    String string5 = kab0Var.getString(R.string.chip_click);
                    string5.getClass();
                    kab0Var.F0(string5);
                    GameDetails gameDetails = kab0Var.b;
                    wz.a("ChipSelected", gameDetails != null ? gameDetails.getName() : null, String.valueOf(dDoubleValue));
                    kab0Var.j0(dDoubleValue);
                }
                break;
            default:
                WebView webView = (WebView) obj;
                webView.getClass();
                webView.loadDataWithBaseURL(null, (String) obj2, "text/html", "UTF-8", null);
                break;
        }
        return Unit.a;
    }
}
