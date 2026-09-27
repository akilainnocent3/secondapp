package com.mbridge.msdk.video.bt.module.orglistener;

import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class c extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.bt.module.listener.b f70673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f70674d;

    public c(com.mbridge.msdk.video.bt.module.listener.b bVar, String str) {
        this.f70673c = bVar;
        this.f70674d = str;
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f70673c != null) {
            q0.a("H5ShowRewardListener", "onAdShow");
            this.f70673c.a(this.f70674d);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        if (this.f70673c != null) {
            q0.a("H5ShowRewardListener", "onVideoComplete");
            this.f70673c.a(this.f70674d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        if (this.f70673c != null) {
            q0.a("H5ShowRewardListener", "onAdClose");
            this.f70673c.a(this.f70674d, z10, cVar2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        if (this.f70673c != null) {
            q0.a("H5ShowRewardListener", "onShowFail");
            this.f70673c.a(this.f70674d, str);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        if (this.f70673c != null) {
            q0.a("H5ShowRewardListener", "onVideoAdClicked");
            this.f70673c.b(this.f70674d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        if (this.f70673c != null) {
            q0.a("H5ShowRewardListener", "onEndcardShow");
            this.f70673c.c(this.f70674d, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(int i10, String str, String str2) {
        if (this.f70673c != null) {
            q0.a("H5ShowRewardListener", "onAutoLoad");
            this.f70673c.a(this.f70674d, i10, str, str2);
        }
    }
}
