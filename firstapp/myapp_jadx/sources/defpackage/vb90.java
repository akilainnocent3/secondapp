package defpackage;

import com.appsflyer.internal.p;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"Lvb90;", "", "", "Lub90;", "a", "Ljava/util/List;", "()Ljava/util/List;", AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_NEWS, "injection"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class vb90 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("shut_down_list")
    private final List<ub90> list;

    public vb90(Object obj) {
        m2g m2gVar = m2g.a;
        m2gVar.getClass();
        this.list = m2gVar;
    }

    public final List<ub90> a() {
        return this.list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vb90) && Intrinsics.g(this.list, ((vb90) obj).list);
    }

    public final int hashCode() {
        return this.list.hashCode();
    }

    public final String toString() {
        return p.a("ShutDownCountryList(list=", ")", this.list);
    }

    public vb90() {
        this(null);
    }
}
