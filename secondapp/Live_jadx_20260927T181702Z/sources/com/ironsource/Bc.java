package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Bc implements Ac {
    @Override // com.ironsource.Ac
    public void a(@oy.l Activity activity, @oy.l O9 adInstance, @oy.l Map<String, String> showParams) throws Exception {
        kotlin.jvm.internal.m0.p(activity, "activity");
        kotlin.jvm.internal.m0.p(adInstance, "adInstance");
        kotlin.jvm.internal.m0.p(showParams, "showParams");
        IronSourceNetwork.showAd(activity, adInstance, showParams);
    }

    @Override // com.ironsource.Ac
    public boolean a(@oy.l O9 adInstance) {
        kotlin.jvm.internal.m0.p(adInstance, "adInstance");
        return IronSourceNetwork.isAdAvailableForInstance(adInstance);
    }
}
