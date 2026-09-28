package defpackage;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crashInitiated.model.response.DetailResponse;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l5a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l5a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        String str = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ytw ytwVar = (ytw) obj2;
                tl2 tl2Var = (tl2) obj;
                try {
                    String string = ((String) ytwVar.getValue()).toString();
                    ytw<HashMap<Integer, Double>> ytwVar2 = tl2Var.a;
                    String str2 = "0.00";
                    if (((HashMap) ((x5a0) ytwVar2).getValue()).containsValue(Double.valueOf(Double.parseDouble(string)))) {
                        Map map = (Map) ((x5a0) ytwVar2).getValue();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (((Number) entry.getValue()).doubleValue() == Double.parseDouble(string)) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Double d = (Double) ((HashMap) ((x5a0) ytwVar2).getValue()).get(Integer.valueOf(((Number) CollectionsKt.S(linkedHashMap.keySet())).intValue() - 1));
                        if (d != null) {
                            try {
                                String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d.doubleValue());
                                str3.getClass();
                                str = str3;
                            } catch (Exception unused) {
                                str = "0.00";
                            }
                        }
                        ytwVar.setValue(String.valueOf(str));
                    } else {
                        Map map2 = (Map) ((x5a0) ytwVar2).getValue();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry entry2 : map2.entrySet()) {
                            if (((Number) entry2.getValue()).doubleValue() < Double.parseDouble(string)) {
                                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        Double d2 = (Double) CollectionsKt.c0(linkedHashMap2.values());
                        try {
                            String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d2 != null ? d2.doubleValue() : ((DetailResponse) ((x5a0) tl2Var.d0).getValue()).getDefaultAmount());
                            str4.getClass();
                            str2 = str4;
                        } catch (Exception unused2) {
                        }
                        ytwVar.setValue(str2);
                    }
                } catch (Exception unused3) {
                }
                break;
            default:
                AppCompatImageView appCompatImageView = (AppCompatImageView) obj2;
                djh djhVar = ((u6j) obj).b;
                ConstraintLayout constraintLayout = djhVar != null ? djhVar.w.v : null;
                if (constraintLayout != null) {
                    try {
                        constraintLayout.removeView(appCompatImageView);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                appCompatImageView.setScaleX(0.0f);
                appCompatImageView.setScaleY(0.0f);
                appCompatImageView.setVisibility(0);
                if (constraintLayout != null) {
                    constraintLayout.addView(appCompatImageView);
                }
                appCompatImageView.animate().scaleX(1.0f).setDuration(250L).setListener(null);
                appCompatImageView.animate().scaleY(1.0f).setDuration(250L).setListener(null);
                break;
        }
        return Unit.a;
    }
}
