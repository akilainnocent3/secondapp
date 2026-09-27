package com.bytedance.adsdk.tq.hu;

import android.view.Choreographer;
import com.bytedance.adsdk.tq.vgm;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class sd extends hww implements Choreographer.FrameCallback {
    private vgm nod;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private float f31965tq = 1.0f;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private boolean f31964sd = false;
    private long vy = 0;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private float f31961hv = 0.0f;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private float f31960hu = 0.0f;
    private int vgm = 0;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private float f31962ok = -2.1474836E9f;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private float f31963rs = 2.1474836E9f;
    protected boolean hww = false;
    private boolean vhb = false;

    private void hnv() {
        if (this.nod == null) {
            return;
        }
        float f10 = this.f31960hu;
        if (f10 < this.f31962ok || f10 > this.f31963rs) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f31962ok), Float.valueOf(this.f31963rs), Float.valueOf(this.f31960hu)));
        }
    }

    private float mrs() {
        vgm vgmVar = this.nod;
        if (vgmVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / vgmVar.ny()) / Math.abs(this.f31965tq);
    }

    private boolean omn() {
        return nod() < 0.0f;
    }

    public void bs() {
        if (isRunning()) {
            vy(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        tq();
        jpb();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        bs();
        if (this.nod == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.tq.hv.hww("LottieValueAnimator#doFrame");
        long j11 = this.vy;
        float fMrs = (j11 != 0 ? j10 - j11 : 0L) / mrs();
        float f10 = this.f31961hv;
        if (omn()) {
            fMrs = -fMrs;
        }
        float f11 = f10 + fMrs;
        boolean zSd = hv.sd(f11, weu(), wgt());
        float f12 = this.f31961hv;
        float fTq = hv.tq(f11, weu(), wgt());
        this.f31961hv = fTq;
        if (this.vhb) {
            fTq = (float) Math.floor(fTq);
        }
        this.f31960hu = fTq;
        this.vy = j10;
        if (!this.vhb || this.f31961hv != f12) {
            sd();
        }
        if (!zSd) {
            if (getRepeatCount() == -1 || this.vgm < getRepeatCount()) {
                hww();
                this.vgm++;
                if (getRepeatMode() == 2) {
                    this.f31964sd = !this.f31964sd;
                    rs();
                } else {
                    float fWgt = omn() ? wgt() : weu();
                    this.f31961hv = fWgt;
                    this.f31960hu = fWgt;
                }
                this.vy = j10;
            } else {
                float fWeu = this.f31965tq < 0.0f ? weu() : wgt();
                this.f31961hv = fWeu;
                this.f31960hu = fWeu;
                jpb();
                tq(omn());
            }
        }
        hnv();
        com.bytedance.adsdk.tq.hv.tq("LottieValueAnimator#doFrame");
    }

    public void ed() {
        jpb();
        vy();
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fWeu;
        float fWgt;
        float fWeu2;
        if (this.nod == null) {
            return 0.0f;
        }
        if (omn()) {
            fWeu = wgt() - this.f31960hu;
            fWgt = wgt();
            fWeu2 = weu();
        } else {
            fWeu = this.f31960hu - weu();
            fWgt = wgt();
            fWeu2 = weu();
        }
        return fWeu / (fWgt - fWeu2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(hu());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        vgm vgmVar = this.nod;
        if (vgmVar == null) {
            return 0L;
        }
        return (long) vgmVar.hv();
    }

    public float hu() {
        vgm vgmVar = this.nod;
        if (vgmVar == null) {
            return 0.0f;
        }
        return (this.f31960hu - vgmVar.hu()) / (this.nod.vgm() - this.nod.hu());
    }

    public void hww(vgm vgmVar) {
        boolean z10 = this.nod == null;
        this.nod = vgmVar;
        if (z10) {
            hww(Math.max(this.f31962ok, vgmVar.hu()), Math.min(this.f31963rs, vgmVar.vgm()));
        } else {
            hww((int) vgmVar.hu(), (int) vgmVar.vgm());
        }
        float f10 = this.f31960hu;
        this.f31960hu = 0.0f;
        this.f31961hv = 0.0f;
        hww((int) f10);
        sd();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.hww;
    }

    public void jpb() {
        vy(true);
    }

    public void khx() {
        this.hww = true;
        bs();
        this.vy = 0L;
        if (omn() && vgm() == weu()) {
            hww(wgt());
        } else if (!omn() && vgm() == wgt()) {
            hww(weu());
        }
        hv();
    }

    public float nod() {
        return this.f31965tq;
    }

    public void ny() {
        jpb();
        tq(omn());
    }

    public void ok() {
        this.nod = null;
        this.f31962ok = -2.1474836E9f;
        this.f31963rs = 2.1474836E9f;
    }

    public void rs() {
        sd(-nod());
    }

    public void sd(boolean z10) {
        this.vhb = z10;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f31964sd) {
            return;
        }
        this.f31964sd = false;
        rs();
    }

    public void tq(float f10) {
        hww(this.f31962ok, f10);
    }

    public float vgm() {
        return this.f31960hu;
    }

    public void vhb() {
        this.hww = true;
        hww(omn());
        hww((int) (omn() ? wgt() : weu()));
        this.vy = 0L;
        this.vgm = 0;
        bs();
    }

    public void vy(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.hww = false;
        }
    }

    public float weu() {
        vgm vgmVar = this.nod;
        if (vgmVar == null) {
            return 0.0f;
        }
        float f10 = this.f31962ok;
        return f10 == -2.1474836E9f ? vgmVar.hu() : f10;
    }

    public float wgt() {
        vgm vgmVar = this.nod;
        if (vgmVar == null) {
            return 0.0f;
        }
        float f10 = this.f31963rs;
        return f10 == 2.1474836E9f ? vgmVar.vgm() : f10;
    }

    public void sd(float f10) {
        this.f31965tq = f10;
    }

    @Override // com.bytedance.adsdk.tq.hu.hww
    public void tq() {
        super.tq();
        tq(omn());
    }

    public void hww(float f10) {
        if (this.f31961hv == f10) {
            return;
        }
        float fTq = hv.tq(f10, weu(), wgt());
        this.f31961hv = fTq;
        if (this.vhb) {
            fTq = (float) Math.floor(fTq);
        }
        this.f31960hu = fTq;
        this.vy = 0L;
        sd();
    }

    public void hww(int i10) {
        hww(i10, (int) this.f31963rs);
    }

    public void hww(float f10, float f11) {
        if (f10 <= f11) {
            vgm vgmVar = this.nod;
            float fHu = vgmVar == null ? -3.4028235E38f : vgmVar.hu();
            vgm vgmVar2 = this.nod;
            float fVgm = vgmVar2 == null ? Float.MAX_VALUE : vgmVar2.vgm();
            float fTq = hv.tq(f10, fHu, fVgm);
            float fTq2 = hv.tq(f11, fHu, fVgm);
            if (fTq == this.f31962ok && fTq2 == this.f31963rs) {
                return;
            }
            this.f31962ok = fTq;
            this.f31963rs = fTq2;
            hww((int) hv.tq(this.f31960hu, fTq, fTq2));
            return;
        }
        throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
    }
}
