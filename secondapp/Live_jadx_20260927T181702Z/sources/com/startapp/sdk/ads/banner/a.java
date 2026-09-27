package com.startapp.sdk.ads.banner;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerBase f73986a;

    public a(BannerBase bannerBase) {
        this.f73986a = bannerBase;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1 || i10 == 2) {
            this.f73986a.loadBannerImpl((String) message.obj);
        }
        return true;
    }
}
