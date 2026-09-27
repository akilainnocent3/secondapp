package com.mbridge.msdk.playercommon.exoplayer2.drm;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class DecryptionException extends Exception {
    public final int errorCode;

    public DecryptionException(int i10, String str) {
        super(str);
        this.errorCode = i10;
    }
}
