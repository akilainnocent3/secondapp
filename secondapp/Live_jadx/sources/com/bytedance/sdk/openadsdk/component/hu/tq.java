package com.bytedance.sdk.openadsdk.component.hu;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq implements Handler.Callback {
    private long nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private boolean f35620ny;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private hww f35623sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.ok.hww f35624tq;
    private boolean vgm;
    private long vhb;
    private Handler hww = new Handler(Looper.myLooper(), this);
    private int vy = 0;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f35619hv = 5;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private int f35618hu = 0;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final int f35621ok = 1000;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private int f35622rs = 1000;

    public tq(com.bytedance.sdk.openadsdk.component.ok.hww hwwVar) {
        this.f35624tq = hwwVar;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 100 && this.hww != null) {
            int i10 = message.arg1;
            hww(i10);
            if (i10 > 0) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i10 - 1;
                this.hww.sendMessageDelayed(messageObtain, this.f35622rs);
            }
        }
        return true;
    }

    public void hv() {
        this.hww.removeCallbacksAndMessages(null);
        this.hww = null;
    }

    public void hww(int i10) {
        this.vy = i10;
        int i11 = this.f35619hv - i10;
        this.f35624tq.tq(i11);
        boolean z10 = true;
        if (i10 <= 0) {
            hww hwwVar = this.f35623sd;
            if (hwwVar != null && !this.vgm) {
                hwwVar.tq();
                this.vgm = true;
            }
            i10 = 0;
        }
        hww hwwVar2 = this.f35623sd;
        if (hwwVar2 != null) {
            int i12 = this.f35618hu;
            int i13 = i12 - i11;
            if (i10 != 0 && i11 < i12) {
                z10 = false;
            }
            hwwVar2.hww(i13, z10);
        }
    }

    public void sd() {
        if (this.hww != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = this.vy;
            this.hww.sendMessage(messageObtain);
        }
    }

    public void tq(int i10) {
        this.f35618hu = Math.min(i10, this.f35619hv);
    }

    public void vy() {
        Handler handler = this.hww;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void tq() {
        Handler handler = this.hww;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.f35619hv, 0));
        }
    }

    public void hww(float f10) {
        int i10 = (int) f10;
        this.f35619hv = i10;
        if (i10 <= 0) {
            this.f35619hv = 5;
        }
    }

    public void hww(hww hwwVar) {
        this.f35623sd = hwwVar;
    }

    public int hww() {
        return this.f35618hu;
    }

    public void hww(int i10, float f10, boolean z10) {
        com.bytedance.sdk.openadsdk.component.ok.hww hwwVar;
        if ((i10 == 1 || i10 == 2) && this.f35620ny != z10) {
            this.f35620ny = z10;
            if (i10 == 1 && (hwwVar = this.f35624tq) != null) {
                hwwVar.hww(z10);
            }
            if (z10) {
                try {
                    this.f35622rs = (int) (1000.0f / f10);
                    this.vhb = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long jCurrentTimeMillis = this.nod + (System.currentTimeMillis() - this.vhb);
                this.nod = jCurrentTimeMillis;
                com.bytedance.sdk.openadsdk.component.ok.hww hwwVar2 = this.f35624tq;
                if (hwwVar2 != null) {
                    hwwVar2.hww(jCurrentTimeMillis);
                }
            }
            this.f35622rs = 1000;
        }
    }
}
