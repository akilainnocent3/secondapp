package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class CM implements InterfaceC2894gc {
    public final EnumC2886gU A00;
    public final AbstractC16412d A01;

    public CM(AbstractC16412d abstractC16412d, EnumC2886gU enumC2886gU) {
        this.A01 = abstractC16412d;
        this.A00 = enumC2886gU;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2894gc
    public void A4D(Map<InterfaceC2876gK, EnumC2899gh> map, Map<SyncModifiableBundle, EnumC2886gU> map2) {
        map2.put(null, this.A00);
    }
}
