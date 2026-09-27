package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.data.manager.ScarManager;
import dr.w2;
import kotlin.jvm.internal.m0;
import or.f;
import oy.l;
import oy.m;
import qr.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LoadScarAd {

    @l
    private final ScarManager scarManager;

    public LoadScarAd(@l ScarManager scarManager) {
        m0.p(scarManager, "scarManager");
        this.scarManager = scarManager;
    }

    @m
    public final Object invoke(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, int i10, @l f<? super w2> fVar) {
        if (m0.g(str, "banner")) {
            return w2.f79517a;
        }
        Object objLoadAd = this.scarManager.loadAd(str, str2, str4, str3, str5, i10, fVar);
        return objLoadAd == d.l() ? objLoadAd : w2.f79517a;
    }
}
