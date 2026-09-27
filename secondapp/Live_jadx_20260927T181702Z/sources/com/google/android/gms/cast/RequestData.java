package com.google.android.gms.cast;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface RequestData {
    @Nullable
    JSONObject getCustomData();

    @KeepForSdk
    long getRequestId();
}
