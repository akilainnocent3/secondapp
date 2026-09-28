package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.core.injection.opentelemetry.PageMeta;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class hgm implements pdd0 {
    public final String a;
    public final String b;
    public final PageMeta c;

    public hgm(String str, PageMeta pageMeta) {
        str.getClass();
        this.a = "home__live_tab__view";
        this.b = str;
        this.c = pageMeta;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.SPORT_TYPE, this.b));
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.pdd0
    public final PageMeta getPageMeta() {
        return this.c;
    }
}
