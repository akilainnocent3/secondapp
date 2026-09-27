package com.inmobi.media.core.config.models;

import androidx.annotation.Keep;
import com.inmobi.media.A8;
import com.inmobi.media.AbstractC3838ma;
import com.inmobi.media.T9;
import kotlin.jvm.internal.m0;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@Keep
public abstract class Config {

    @l
    private T9 includeIds = new T9(false, 1, null);

    @A8
    private long lastUpdateTimeStamp;

    public boolean equals(@m Object obj) {
        return (obj instanceof Config) && m0.g(getType(), ((Config) obj).getType());
    }

    @l
    public final T9 getIncludeIdParams() {
        return this.includeIds;
    }

    @l
    public final T9 getIncludeIds() {
        return this.includeIds;
    }

    public final long getLastUpdateTimeStamp() {
        return this.lastUpdateTimeStamp;
    }

    @l
    public abstract String getType();

    public int hashCode() {
        return getType().hashCode();
    }

    public abstract boolean isValid();

    public final void setIncludeIds(@l T9 t10) {
        m0.p(t10, "<set-?>");
        this.includeIds = t10;
    }

    public final void setLastUpdateTimeStamp(long j10) {
        this.lastUpdateTimeStamp = j10;
    }

    @l
    public final JSONObject toJson() {
        m0.p(this, "obj");
        JSONObject jSONObjectA = AbstractC3838ma.a(this, getClass());
        return jSONObjectA == null ? new JSONObject() : jSONObjectA;
    }
}
