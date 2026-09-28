package defpackage;

import com.sporty.android.book.domain.entity.EventSource;
import com.sporty.android.book.domain.entity.EventSourceItem;
import com.sporty.android.book.domain.entity.SourceType;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class azd0 {
    public final bnh0 a;

    public azd0(bnh0 bnh0Var) {
        bnh0Var.getClass();
        this.a = bnh0Var;
    }

    public final String a(String str, EventSource eventSource, String str2, String str3) {
        List listK;
        String sourceId;
        str.getClass();
        str2.getClass();
        if (eventSource == null || eventSource.getSourceType(true) != SourceType.LSPORTS || (sourceId = eventSource.getSourceId(true)) == null || StringsKt.U(sourceId)) {
            listK = b.k(new Pair(AnalyticsParam.EVENT_PARAM_ID, sa8.a(str)), new Pair("locale", str2), new Pair("theme", str3));
        } else {
            EventSourceItem liveSource = eventSource.getLiveSource();
            listK = b.k(new Pair(AnalyticsParam.EVENT_PARAM_ID, liveSource != null ? liveSource.getSourceId() : null), new Pair("sourceType", "lsports"), new Pair("locale", str2), new Pair("theme", str3));
        }
        return tug.a(bnh0.d(this.a, new String[]{"statistics"}, null, 6), "?", CollectionsKt.a0(listK, "&", null, null, new zyd0(), 30));
    }
}
