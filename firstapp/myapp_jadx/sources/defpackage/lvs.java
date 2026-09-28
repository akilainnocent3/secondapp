package defpackage;

import com.sporty.android.book.domain.entity.EventSource;
import com.sporty.android.book.domain.entity.EventSourceItem;
import com.sporty.android.book.domain.entity.SourceType;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class lvs {
    public final bnh0 a;

    public lvs(bnh0 bnh0Var) {
        bnh0Var.getClass();
        this.a = bnh0Var;
    }

    public static /* synthetic */ String c(lvs lvsVar, String str, String str2, EventSource eventSource, String str3, String str4, Integer num, String str5, int i) {
        dbl dblVar = dbl.V3;
        if ((i & 32) != 0) {
            num = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & 128) != 0) {
            dblVar = dbl.V1;
        }
        return lvsVar.b(str, str2, eventSource, str3, str4, num, str5, dblVar);
    }

    public final String a(String str, String str2, String str3, EventSource eventSource, String str4) {
        List<Pair<String, String>> listK;
        String sourceId;
        str.getClass();
        str3.getClass();
        str4.getClass();
        if (Intrinsics.g(str2, "sr:sport:202120001")) {
            listK = b.k(new Pair("matchId", str), new Pair("theme", "dark"));
        } else if (eventSource == null || eventSource.getSourceType(true) != SourceType.LSPORTS || (sourceId = eventSource.getSourceId(true)) == null || StringsKt.U(sourceId)) {
            listK = b.k(new Pair(AnalyticsParam.EVENT_PARAM_ID, str3), new Pair("locale", str4), new Pair("theme", "dark"));
        } else {
            EventSourceItem liveSource = eventSource.getLiveSource();
            listK = b.k(new Pair(AnalyticsParam.EVENT_PARAM_ID, liveSource != null ? liveSource.getSourceId() : null), new Pair("sourceType", "lsports"), new Pair("locale", str4), new Pair("theme", "dark"));
        }
        return d(Intrinsics.g(str2, "sr:sport:202120001") ? "live_virtual_mt" : "liveTracker", listK);
    }

    public final String b(String str, String str2, EventSource eventSource, String str3, String str4, Integer num, String str5, dbl dblVar) {
        ngs ngsVarA;
        String sourceId;
        str.getClass();
        str3.getClass();
        dblVar.getClass();
        if (eventSource == null || eventSource.getSourceType(false) != SourceType.LSPORTS || (sourceId = eventSource.getSourceId(false)) == null || StringsKt.U(sourceId)) {
            ngs ngsVarB = a.b();
            kvs.a(AnalyticsParam.EVENT_PARAM_ID, sa8.a(str), ngsVarB);
            kvs.a(dblVar.a, "1", ngsVarB);
            if (str2 != null) {
                kvs.a("sport", sa8.a(str2), ngsVarB);
            }
            if (num != null) {
                kvs.a("height", String.valueOf(num.intValue()), ngsVarB);
            }
            ngsVarB.add(new Pair("locale", str3));
            ngsVarB.add(new Pair("theme", str4));
            if (str5 != null) {
                kvs.a("customWidget", str5, ngsVarB);
            }
            ngsVarA = a.a(ngsVarB);
        } else {
            ngs ngsVarB2 = a.b();
            EventSourceItem preMatchSource = eventSource.getPreMatchSource();
            ngsVarB2.add(new Pair(AnalyticsParam.EVENT_PARAM_ID, preMatchSource != null ? preMatchSource.getSourceId() : null));
            ngsVarB2.add(new Pair("sourceType", "lsports"));
            ngsVarB2.add(new Pair("stats", "1"));
            ngsVarB2.add(new Pair("locale", str3));
            kvs.a("theme", str4, ngsVarB2);
            if (str5 != null) {
                kvs.a("customWidget", str5, ngsVarB2);
            }
            ngsVarA = a.a(ngsVarB2);
        }
        return d("liveTracker", ngsVarA);
    }

    public final String d(String str, List<Pair<String, String>> list) {
        return tug.a(bnh0.d(this.a, new String[]{str}, null, 6), "?", CollectionsKt.a0(list, "&", null, null, new jvs(), 30));
    }
}
