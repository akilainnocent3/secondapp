package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2413Xf implements ViewpointAction<C2357Uw, V1> {
    public XM A00;

    public C2413Xf(XM xm2) {
        this.A00 = xm2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.core.ViewpointAction
    public final void A6R(C3509rN<C2357Uw, V1> c3509rN, InterfaceC3500rD interfaceC3500rD) {
        switch (interfaceC3500rD.A9U(c3509rN)) {
            case A02:
            case A04:
                this.A00.A02(c3509rN, interfaceC3500rD);
                break;
        }
    }
}
