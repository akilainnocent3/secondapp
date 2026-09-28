package com.sportybet.core.injection.opentelemetry;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/sportybet/core/injection/opentelemetry/PageMeta;", "", "", AnalyticsParam.EVENT_PARAM_ID, "", "attributes", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/util/Map;)Lcom/sportybet/core/injection/opentelemetry/PageMeta;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/Map;", "getAttributes", "Factory", "a", "injection"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PageMeta {

    /* JADX INFO: renamed from: Factory, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final Map<String, Object> attributes;
    private final String id;

    /* JADX INFO: renamed from: com.sportybet.core.injection.opentelemetry.PageMeta$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    public static final class Companion {
        public static PageMeta a() {
            return new PageMeta(AnalyticsEvent.BI_TRACKING_KIND_EVENT, null);
        }

        public static PageMeta b() {
            return new PageMeta("home", null);
        }
    }

    public PageMeta(String str, Map<String, ? extends Object> map) {
        str.getClass();
        this.id = str;
        this.attributes = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PageMeta copy$default(PageMeta pageMeta, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pageMeta.id;
        }
        if ((i & 2) != 0) {
            map = pageMeta.attributes;
        }
        return pageMeta.copy(str, map);
    }

    public static final PageMeta create(String str, Map<String, ? extends Object> map) {
        INSTANCE.getClass();
        str.getClass();
        map.getClass();
        return new PageMeta(str, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final Map<String, Object> component2() {
        return this.attributes;
    }

    public final PageMeta copy(String id, Map<String, ? extends Object> attributes) {
        id.getClass();
        return new PageMeta(id, attributes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageMeta)) {
            return false;
        }
        PageMeta pageMeta = (PageMeta) other;
        return Intrinsics.g(this.id, pageMeta.id) && Intrinsics.g(this.attributes, pageMeta.attributes);
    }

    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Map<String, Object> map = this.attributes;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "PageMeta(id=" + this.id + ", attributes=" + this.attributes + ")";
    }

    public static final PageMeta create(String str) {
        INSTANCE.getClass();
        str.getClass();
        return new PageMeta(str, null);
    }
}
