package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Pa {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(InterfaceC4459pb<LevelPlayAdInfo> interfaceC4459pb) {
        if (interfaceC4459pb instanceof InterfaceC4459pb.b) {
            return "success";
        }
        if (interfaceC4459pb instanceof InterfaceC4459pb.a) {
            return "failure";
        }
        throw new dr.o0();
    }
}
