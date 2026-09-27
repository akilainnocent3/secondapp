package com.bytedance.sdk.openadsdk.api.open;

import com.bytedance.sdk.openadsdk.api.PAGRequest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class PAGAppOpenRequest extends PAGRequest {
    private int hww;

    public int getTimeout() {
        return this.hww;
    }

    public void setTimeout(int i10) {
        this.hww = i10;
    }
}
