package com.bytedance.sdk.openadsdk.api.reward;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class PAGRewardItem {
    private final int hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final String f35498tq;

    public PAGRewardItem(int i10, String str) {
        this.hww = i10;
        this.f35498tq = str;
    }

    public int getRewardAmount() {
        return this.hww;
    }

    public String getRewardName() {
        return this.f35498tq;
    }
}
