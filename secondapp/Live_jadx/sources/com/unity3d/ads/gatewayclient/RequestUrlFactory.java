package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface RequestUrlFactory {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DefaultImpls {
        public static /* synthetic */ String getRequestUrl$default(RequestUrlFactory requestUrlFactory, OperationType operationType, String str, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRequestUrl");
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            return requestUrlFactory.getRequestUrl(operationType, str);
        }
    }

    @l
    String getRequestUrl(@l OperationType operationType, @m String str);
}
