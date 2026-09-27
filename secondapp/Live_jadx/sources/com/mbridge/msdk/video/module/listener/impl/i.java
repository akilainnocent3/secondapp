package com.mbridge.msdk.video.module.listener.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class i extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.listener.a f71181a;

    public i(com.mbridge.msdk.video.module.listener.a aVar) {
        this.f71181a = aVar;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i10, Object obj) {
        super.a(i10, obj);
        com.mbridge.msdk.video.module.listener.a aVar = this.f71181a;
        if (aVar != null) {
            aVar.a(i10, obj);
        }
    }
}
