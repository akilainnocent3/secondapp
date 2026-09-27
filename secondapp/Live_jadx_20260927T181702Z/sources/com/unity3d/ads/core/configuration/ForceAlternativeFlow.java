package com.unity3d.ads.core.configuration;

import kotlin.jvm.internal.s1;
import nv.b1;
import nv.k0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nForceAlternativeFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForceAlternativeFlow.kt\ncom/unity3d/ads/core/configuration/ForceAlternativeFlow\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,15:1\n230#2,5:16\n*S KotlinDebug\n*F\n+ 1 ForceAlternativeFlow.kt\ncom/unity3d/ads/core/configuration/ForceAlternativeFlow\n*L\n13#1:16,5\n*E\n"})
public final class ForceAlternativeFlow {

    @l
    private final k0<Boolean> _forceAlternativeFlow = b1.a(Boolean.FALSE);

    public final boolean getForceAlternativeFlow() {
        return this._forceAlternativeFlow.getValue().booleanValue();
    }

    public final void invoke(boolean z10) {
        Boolean value;
        k0<Boolean> k0Var = this._forceAlternativeFlow;
        do {
            value = k0Var.getValue();
            value.getClass();
        } while (!k0Var.d(value, Boolean.valueOf(z10)));
    }
}
