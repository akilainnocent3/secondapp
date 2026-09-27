package com.unity3d.ads.core.domain.offerwall;

import com.unity3d.ads.core.data.manager.OfferwallManager;
import dr.w2;
import kotlin.jvm.internal.m0;
import or.f;
import oy.l;
import oy.m;
import qr.d;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class LoadOfferwallAd {

    @l
    private final OfferwallManager offerwallManager;

    public LoadOfferwallAd(@l OfferwallManager offerwallManager) {
        m0.p(offerwallManager, "offerwallManager");
        this.offerwallManager = offerwallManager;
    }

    @m
    public final Object invoke(@l String str, @l f<? super w2> fVar) {
        Object objLoadAd = this.offerwallManager.loadAd(str, fVar);
        return objLoadAd == d.l() ? objLoadAd : w2.f79517a;
    }
}
