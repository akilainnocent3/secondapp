package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicBoolean f71644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f71645b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final j f71646a = new j();
    }

    public static j a() {
        return b.f71646a;
    }

    public boolean b(int i10) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i10 + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i10 != 94 && i10 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f71644a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f71644a = new AtomicBoolean(s0.a().a("r_v_r_f_l", false));
        } catch (Exception e10) {
            this.f71644a = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e10.getMessage());
            }
        }
        return this.f71644a.get();
    }

    private j() {
    }

    public boolean a(int i10) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i10 + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i10 != 94 && i10 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f71645b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f71645b = new AtomicBoolean(s0.a().a("r_v_r_f_c_r", false));
        } catch (Exception e10) {
            this.f71645b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardVideoRefactorManager", "isRewardVideoRefactor error: " + e10.getMessage());
            }
        }
        return this.f71645b.get();
    }
}
