package com.mbridge.msdk.out;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface WebLoadListener {
    void onFailed(String str, int i10, int i11, int i12, String str2, String str3);

    void onProgress(String str, int i10, int i11, int i12, String str2, String str3);

    void onSucess(String str, int i10, int i11, int i12, String str2, String str3);
}
