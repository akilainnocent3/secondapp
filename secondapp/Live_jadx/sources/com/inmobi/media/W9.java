package com.inmobi.media;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class W9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f55715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONArray f55716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3939qb f55717c;

    public W9(JSONObject vitals, JSONArray logs, C3939qb data) {
        kotlin.jvm.internal.m0.p(vitals, "vitals");
        kotlin.jvm.internal.m0.p(logs, "logs");
        kotlin.jvm.internal.m0.p(data, "data");
        this.f55715a = vitals;
        this.f55716b = logs;
        this.f55717c = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W9)) {
            return false;
        }
        W9 w10 = (W9) obj;
        return kotlin.jvm.internal.m0.g(this.f55715a, w10.f55715a) && kotlin.jvm.internal.m0.g(this.f55716b, w10.f55716b) && kotlin.jvm.internal.m0.g(this.f55717c, w10.f55717c);
    }

    public final int hashCode() {
        return this.f55717c.hashCode() + ((this.f55716b.hashCode() + (this.f55715a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "IncompleteLogData(vitals=" + this.f55715a + ", logs=" + this.f55716b + ", data=" + this.f55717c + gi.j.f86771d;
    }
}
