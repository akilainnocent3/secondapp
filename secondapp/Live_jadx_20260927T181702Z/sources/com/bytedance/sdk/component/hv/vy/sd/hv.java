package com.bytedance.sdk.component.hv.vy.sd;

import android.content.Context;
import com.bytedance.sdk.component.hv.bs;
import com.bytedance.sdk.component.hv.ed;
import com.bytedance.sdk.component.hv.hnv;
import com.bytedance.sdk.component.hv.jpb;
import com.bytedance.sdk.component.hv.ny;
import com.bytedance.sdk.component.hv.omn;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hv implements ed {

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private com.bytedance.sdk.component.hv.sd f34773hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private jpb f34774hv;
    private ny hww;
    private boolean nod;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private omn f34775ok;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private hnv f34776rs;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private com.bytedance.sdk.component.hv.vy f34777sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private ExecutorService f34778tq;
    private com.bytedance.sdk.component.hv.tq vgm;
    private bs vy;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class hww {

        /* JADX INFO: renamed from: hu, reason: collision with root package name */
        private com.bytedance.sdk.component.hv.sd f34779hu;

        /* JADX INFO: renamed from: hv, reason: collision with root package name */
        private jpb f34780hv;
        private ny hww;
        private boolean nod;

        /* JADX INFO: renamed from: ok, reason: collision with root package name */
        private omn f34781ok;

        /* JADX INFO: renamed from: rs, reason: collision with root package name */
        private hnv f34782rs;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private com.bytedance.sdk.component.hv.vy f34783sd;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private ExecutorService f34784tq;
        private com.bytedance.sdk.component.hv.tq vgm;
        private bs vy;

        public hww hww(com.bytedance.sdk.component.hv.tq tqVar) {
            this.vgm = tqVar;
            return this;
        }

        public hww hww(hnv hnvVar) {
            this.f34782rs = hnvVar;
            return this;
        }

        public hww hww(omn omnVar) {
            this.f34781ok = omnVar;
            return this;
        }

        public hww hww(com.bytedance.sdk.component.hv.vy vyVar) {
            this.f34783sd = vyVar;
            return this;
        }

        public hww hww(boolean z10) {
            this.nod = z10;
            return this;
        }

        public hv hww() {
            return new hv(this);
        }
    }

    @Override // com.bytedance.sdk.component.hv.ed
    public jpb hu() {
        return this.f34774hv;
    }

    @Override // com.bytedance.sdk.component.hv.ed
    public bs hv() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.component.hv.ed
    public ny hww() {
        return this.hww;
    }

    @Override // com.bytedance.sdk.component.hv.ed
    public boolean nod() {
        return this.nod;
    }

    @Override // com.bytedance.sdk.component.hv.ed
    public com.bytedance.sdk.component.hv.tq ok() {
        return this.vgm;
    }

    @Override // com.bytedance.sdk.component.hv.ed
    public hnv rs() {
        return this.f34776rs;
    }

    @Override // com.bytedance.sdk.component.hv.ed
    public omn sd() {
        return this.f34775ok;
    }

    @Override // com.bytedance.sdk.component.hv.ed
    public ExecutorService tq() {
        return this.f34778tq;
    }

    @Override // com.bytedance.sdk.component.hv.ed
    public com.bytedance.sdk.component.hv.sd vgm() {
        return this.f34773hu;
    }

    @Override // com.bytedance.sdk.component.hv.ed
    public com.bytedance.sdk.component.hv.vy vy() {
        return this.f34777sd;
    }

    private hv(hww hwwVar) {
        this.hww = hwwVar.hww;
        this.f34778tq = hwwVar.f34784tq;
        this.f34777sd = hwwVar.f34783sd;
        this.vy = hwwVar.vy;
        this.f34774hv = hwwVar.f34780hv;
        this.f34773hu = hwwVar.f34779hu;
        this.vgm = hwwVar.vgm;
        this.f34775ok = hwwVar.f34781ok;
        this.f34776rs = hwwVar.f34782rs;
        this.nod = hwwVar.nod;
    }

    public static hv hww(Context context) {
        return new hww().hww();
    }
}
