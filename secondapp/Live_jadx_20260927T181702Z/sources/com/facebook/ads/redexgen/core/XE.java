package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class XE {
    public static AdError A00(C2372Vm c2372Vm) {
        if (c2372Vm.A03().isPublicError()) {
            return new AdError(c2372Vm.A03().getErrorCode(), c2372Vm.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
