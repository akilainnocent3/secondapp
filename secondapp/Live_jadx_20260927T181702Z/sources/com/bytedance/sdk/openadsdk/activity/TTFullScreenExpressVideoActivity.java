package com.bytedance.sdk.openadsdk.activity;

import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.component.reward.view.nod;
import com.bytedance.sdk.openadsdk.core.model.kub;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean aeg() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public Map<String, Object> blh() {
        return this.f35210tq.hu();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void hww(long j10, long j11) {
        int i10 = (int) (j10 / 1000);
        nod nodVar = this.f35210tq.zvy;
        if (nodVar != null && nodVar.hww() != null) {
            this.f35210tq.zvy.hww().setTime(String.valueOf(this.f35204hu), i10, 0, false);
            this.f35210tq.zvy.hww().hww(j10, j11);
        }
        nod nodVar2 = this.f35210tq.zvy;
        if ((nodVar2 == null || !nodVar2.rs()) && !this.f35210tq.f35729tq.qhe()) {
            return;
        }
        sd(i10);
        if (this.f35204hu >= 0) {
            this.f35210tq.rpd.vy(true);
            this.f35210tq.rpd.hww(String.valueOf(this.f35204hu), null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean kub() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout mw() {
        com.bytedance.sdk.openadsdk.component.reward.tq.tq tqVar = this.f35209sd;
        return (tqVar == null || !(tqVar instanceof com.bytedance.sdk.openadsdk.component.reward.tq.ok) || this.f35210tq.fxi) ? this.f35210tq.zvy.tq() : ((com.bytedance.sdk.openadsdk.component.reward.tq.ok) tqVar).za();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        grv();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void za() {
        if (kub.hv(this.f35210tq.f35729tq)) {
            finish();
            return;
        }
        nod nodVar = this.f35210tq.zvy;
        if (nodVar == null || nodVar.hww() == null) {
            return;
        }
        this.f35210tq.zvy.hww().setTime("0", 0, 0, false);
        if (this.f35210tq.zvy.rs()) {
            this.f35210tq.rpd.hww("0", "X");
            this.f35210tq.rpd.hv(true);
            this.f35210tq.rpd.sd();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void ok() {
    }
}
