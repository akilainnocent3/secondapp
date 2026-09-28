package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.core.injection.opentelemetry.PageMeta;

/* JADX INFO: loaded from: classes4.dex */
public final class xfw implements pdd0 {
    public static final xfw a = new xfw();
    public static final String b = AnalyticsEvent.MULTI_MAKER_VIEW;
    public static final PageMeta c;

    static {
        PageMeta.INSTANCE.getClass();
        c = new PageMeta("multimaker", null);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xfw);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return b;
    }

    @Override // defpackage.pdd0
    public final PageMeta getPageMeta() {
        return c;
    }

    public final int hashCode() {
        return 57149817;
    }

    public final String toString() {
        return "MultiMakerView";
    }
}
