package com.bytedance.sdk.openadsdk.ed;

import android.content.Context;
import android.media.AudioManager;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class rs {
    private final AudioManager hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private int f37186tq = -1;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f37185sd = false;

    public rs(Context context) {
        this.hww = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public int hww() {
        return this.f37186tq;
    }

    public void hww(boolean z10) {
        hww(z10, false);
    }

    public void hww(boolean z10, boolean z11) {
        if (this.hww == null) {
            return;
        }
        int i10 = 0;
        if (z10) {
            int iVgm = DeviceUtils.vgm();
            if (iVgm != 0) {
                this.f37186tq = iVgm;
            } else if (!z11) {
                return;
            }
            hww(3, 0, 0);
            this.f37185sd = true;
            return;
        }
        int iRs = this.f37186tq;
        if (iRs == 0) {
            iRs = DeviceUtils.rs() / 15;
        } else {
            if (iRs == -1) {
                if (!z11) {
                    return;
                } else {
                    iRs = DeviceUtils.rs() / 15;
                }
            }
            this.f37186tq = -1;
            hww(3, iRs, i10);
            this.f37185sd = true;
        }
        i10 = 1;
        this.f37186tq = -1;
        hww(3, iRs, i10);
        this.f37185sd = true;
    }

    private void hww(int i10, int i11, int i12) {
        try {
            this.hww.setStreamVolume(i10, i11, i12);
        } catch (Throwable unused) {
        }
    }
}
