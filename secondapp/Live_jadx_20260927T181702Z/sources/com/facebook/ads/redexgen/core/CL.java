package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class CL implements InterfaceC2894gc {
    public final C1878Cb A00;
    public final EnumC2899gh A01;

    public CL(C1878Cb c1878Cb, EnumC2899gh enumC2899gh) {
        this.A00 = c1878Cb;
        this.A01 = enumC2899gh;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2894gc
    public void A4D(Map<InterfaceC2876gK, EnumC2899gh> map, Map<SyncModifiableBundle, EnumC2886gU> map2) {
        map.put(this.A00, this.A01);
    }
}
