package com.bytedance.sdk.component.hu.hww;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {

    /* JADX INFO: renamed from: ed, reason: collision with root package name */
    private long f34514ed;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private com.bytedance.sdk.component.hu.hww.vy.tq.hww f34515hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private com.bytedance.sdk.component.hu.hww.vy.tq.hww f34516hv;
    private com.bytedance.sdk.component.hu.hww.hww.hv hww;
    private boolean nod;

    /* JADX INFO: renamed from: ny, reason: collision with root package name */
    private int f34517ny;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private boolean f34518ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private hv f34519rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private com.bytedance.sdk.component.hu.hww.vy.tq.hww f34520sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private com.bytedance.sdk.component.hu.hww.tq.sd f34521tq;
    private com.bytedance.sdk.component.hu.hww.vy.tq.hww vgm;
    private int vhb;
    private com.bytedance.sdk.component.hu.hww.vy.tq.hww vy;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.hu.hww.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0321hww {

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private boolean f34522hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private com.bytedance.sdk.component.hu.hww.vy.tq.hww f34523hv;
        private com.bytedance.sdk.component.hu.hww.tq.sd hww;

        /* JADX INFO: renamed from: ny, reason: collision with root package name */
        private long f34524ny;

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        private com.bytedance.sdk.component.hu.hww.hww.hv f34525ok;

        /* JADX INFO: renamed from: rs, reason: collision with root package name */
        private boolean f34526rs;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private com.bytedance.sdk.component.hu.hww.vy.tq.hww f34527sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private com.bytedance.sdk.component.hu.hww.vy.tq.hww f34528tq;
        private hv vgm;
        private com.bytedance.sdk.component.hu.hww.vy.tq.hww vy;
        private int nod = 5000;
        private int vhb = 10;

        public C0321hww hww(long j10) {
            this.f34524ny = j10;
            return this;
        }

        public C0321hww sd(com.bytedance.sdk.component.hu.hww.vy.tq.hww hwwVar) {
            this.vy = hwwVar;
            return this;
        }

        public C0321hww tq(com.bytedance.sdk.component.hu.hww.vy.tq.hww hwwVar) {
            this.f34527sd = hwwVar;
            return this;
        }

        public C0321hww hww(com.bytedance.sdk.component.hu.hww.hww.hv hvVar) {
            this.f34525ok = hvVar;
            return this;
        }

        public C0321hww tq(int i10) {
            this.vhb = i10;
            return this;
        }

        public C0321hww hww(hv hvVar) {
            this.vgm = hvVar;
            return this;
        }

        public C0321hww hww(boolean z10) {
            this.f34522hu = z10;
            return this;
        }

        public C0321hww hww(com.bytedance.sdk.component.hu.hww.vy.tq.hww hwwVar) {
            this.f34528tq = hwwVar;
            return this;
        }

        public C0321hww hww(com.bytedance.sdk.component.hu.hww.tq.sd sdVar) {
            this.hww = sdVar;
            return this;
        }

        public C0321hww hww(int i10) {
            this.nod = i10;
            return this;
        }

        public hww hww() {
            hww hwwVar = new hww();
            hwwVar.f34521tq = this.hww;
            hwwVar.f34520sd = this.f34528tq;
            hwwVar.vy = this.f34527sd;
            hwwVar.f34516hv = this.vy;
            hwwVar.f34515hu = this.f34523hv;
            hwwVar.f34518ok = this.f34522hu;
            hwwVar.f34519rs = this.vgm;
            hwwVar.hww = this.f34525ok;
            hwwVar.nod = this.f34526rs;
            hwwVar.f34517ny = this.vhb;
            hwwVar.vhb = this.nod;
            hwwVar.f34514ed = this.f34524ny;
            return hwwVar;
        }
    }

    public int ed() {
        return this.f34517ny;
    }

    public com.bytedance.sdk.component.hu.hww.vy.tq.hww hu() {
        return this.vgm;
    }

    public long hv() {
        return this.f34514ed;
    }

    public com.bytedance.sdk.component.hu.hww.tq.sd nod() {
        return this.f34521tq;
    }

    public int ny() {
        return this.vhb;
    }

    public com.bytedance.sdk.component.hu.hww.vy.tq.hww ok() {
        return this.vy;
    }

    public com.bytedance.sdk.component.hu.hww.vy.tq.hww rs() {
        return this.f34516hv;
    }

    public com.bytedance.sdk.component.hu.hww.vy.tq.hww vgm() {
        return this.f34520sd;
    }

    public boolean vhb() {
        return this.f34518ok;
    }

    private hww() {
        this.vhb = 200;
        this.f34517ny = 10;
    }

    public boolean sd() {
        return this.nod;
    }

    public hv vy() {
        return this.f34519rs;
    }

    public com.bytedance.sdk.component.hu.hww.vy.tq.hww tq() {
        return this.f34515hu;
    }

    public com.bytedance.sdk.component.hu.hww.hww.hv hww() {
        return this.hww;
    }
}
