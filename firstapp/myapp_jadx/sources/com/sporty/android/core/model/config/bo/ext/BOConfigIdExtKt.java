package com.sporty.android.core.model.config.bo.ext;

import com.sporty.android.core.model.config.bo.BOConfigId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0004"}, d2 = {"isMatch", "", "Lcom/sporty/android/core/model/config/bo/BOConfigId;", "other", "model"}, k = 2, mv = {2, 4, 0}, xi = 48)
public final class BOConfigIdExtKt {
    public static final boolean isMatch(BOConfigId bOConfigId, BOConfigId bOConfigId2) {
        return bOConfigId != null && bOConfigId2 != null && bOConfigId.getAppId() == bOConfigId2.getAppId() && bOConfigId.getNamespace() == bOConfigId2.getNamespace() && Intrinsics.g(bOConfigId.getConfigKey(), bOConfigId2.getConfigKey());
    }
}
