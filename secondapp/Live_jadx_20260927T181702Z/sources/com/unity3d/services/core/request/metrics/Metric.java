package com.unity3d.services.core.request.metrics;

import cs.k;
import fr.m1;
import fr.n1;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class Metric {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final String METRIC_NAME = "n";

    @l
    private static final String METRIC_TAGS = "t";

    @l
    private static final String METRIC_VALUE = "v";

    @m
    private final String name;

    @l
    private final Map<String, String> tags;

    @m
    private final Object value;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    @k
    public Metric(@m String str) {
        this(str, null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Metric copy$default(Metric metric, String str, Object obj, Map map, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = metric.name;
        }
        if ((i10 & 2) != 0) {
            obj = metric.value;
        }
        if ((i10 & 4) != 0) {
            map = metric.tags;
        }
        return metric.copy(str, obj, map);
    }

    @m
    public final String component1() {
        return this.name;
    }

    @m
    public final Object component2() {
        return this.value;
    }

    @l
    public final Map<String, String> component3() {
        return this.tags;
    }

    @l
    public final Metric copy(@m String str, @m Object obj, @l Map<String, String> tags) {
        m0.p(tags, "tags");
        return new Metric(str, obj, tags);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metric)) {
            return false;
        }
        Metric metric = (Metric) obj;
        return m0.g(this.name, metric.name) && m0.g(this.value, metric.value) && m0.g(this.tags, metric.tags);
    }

    @m
    public final String getName() {
        return this.name;
    }

    @l
    public final Map<String, String> getTags() {
        return this.tags;
    }

    @m
    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.value;
        return ((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31) + this.tags.hashCode();
    }

    @l
    public final Map<String, Object> toMap() {
        Map mapG = m1.g();
        String str = this.name;
        if (str != null) {
            mapG.put("n", str);
        }
        Object obj = this.value;
        if (obj != null) {
            mapG.put("v", obj);
        }
        if (!this.tags.isEmpty()) {
            mapG.put("t", this.tags);
        }
        return m1.d(mapG);
    }

    @l
    public String toString() {
        return "Metric(name=" + this.name + ", value=" + this.value + ", tags=" + this.tags + ')';
    }

    @k
    public Metric(@m String str, @m Object obj) {
        this(str, obj, null, 4, null);
    }

    @k
    public Metric(@m String str, @m Object obj, @l Map<String, String> tags) {
        m0.p(tags, "tags");
        this.name = str;
        this.value = obj;
        this.tags = tags;
    }

    public /* synthetic */ Metric(String str, Object obj, Map map, int i10, x xVar) {
        this(str, (i10 & 2) != 0 ? null : obj, (i10 & 4) != 0 ? n1.z() : map);
    }
}
