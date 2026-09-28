package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class nvs implements pdd0 {
    public final String a = "lv__live_tab__view";
    public final String b;

    public nvs(String str) {
        this.b = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.SPORT_TYPE, this.b));
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }
}
