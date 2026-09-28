package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vtb implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(AnalyticsEvent.BI_TRACKING_KIND_EVENT);
    }
}
