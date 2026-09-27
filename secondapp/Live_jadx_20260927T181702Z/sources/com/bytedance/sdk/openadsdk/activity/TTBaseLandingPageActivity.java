package com.bytedance.sdk.openadsdk.activity;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {
    private long hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private long f35201tq;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        long j10 = this.hww;
        if (j10 > 0) {
            com.bytedance.sdk.openadsdk.utils.hv.hww(j10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f35201tq > 0) {
            this.hww += SystemClock.elapsedRealtime() - this.f35201tq;
            this.f35201tq = 0L;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.bytedance.sdk.openadsdk.utils.hv.sd()) {
            this.f35201tq = SystemClock.elapsedRealtime();
        }
    }
}
