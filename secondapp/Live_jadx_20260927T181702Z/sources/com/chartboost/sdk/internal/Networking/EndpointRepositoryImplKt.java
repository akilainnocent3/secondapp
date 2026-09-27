package com.chartboost.sdk.internal.Networking;

import android.content.Context;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class EndpointRepositoryImplKt {
    @l
    public static final EndpointRepository endpointRepository(@m Context context) {
        throw new IllegalStateException("Function is not available");
    }

    public static /* synthetic */ EndpointRepository endpointRepository$default(Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = null;
        }
        return endpointRepository(context);
    }
}
