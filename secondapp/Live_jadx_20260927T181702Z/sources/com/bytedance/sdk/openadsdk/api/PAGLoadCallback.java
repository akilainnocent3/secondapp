package com.bytedance.sdk.openadsdk.api;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import k.j0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface PAGLoadCallback<Ad> {
    @j0
    void onAdLoaded(Ad ad2);

    @j0
    void onError(@NonNull PAGErrorModel pAGErrorModel);
}
