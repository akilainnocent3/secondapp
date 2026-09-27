package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.jvm.internal.o0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidMediationRepository$mediationProvider$1 extends o0 implements ds.a<ClientInfoOuterClass.MediationProvider> {
    final /* synthetic */ AndroidMediationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMediationRepository$mediationProvider$1(AndroidMediationRepository androidMediationRepository) {
        super(0);
        this.this$0 = androidMediationRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ds.a
    @l
    public final ClientInfoOuterClass.MediationProvider invoke() {
        return this.this$0.mediationProviderParser.invoke(this.this$0.getName());
    }
}
