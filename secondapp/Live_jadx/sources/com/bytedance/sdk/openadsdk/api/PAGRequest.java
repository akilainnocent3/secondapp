package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class PAGRequest {
    private String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private Bundle f35469sd = null;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private Map<String, Object> f35470tq;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.f35469sd == null) {
            this.f35469sd = new Bundle();
        }
        this.f35469sd.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.hww;
    }

    public Map<String, Object> getExtraInfo() {
        return this.f35470tq;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.f35469sd;
    }

    public void setAdString(String str) {
        this.hww = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.f35470tq = map;
    }
}
