package com.fyber.inneractive.sdk.player;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f45568a;

    static {
        int[] iArr = new int[com.fyber.inneractive.sdk.player.enums.b.values().length];
        f45568a = iArr;
        try {
            iArr[com.fyber.inneractive.sdk.player.enums.b.Prepared.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f45568a[com.fyber.inneractive.sdk.player.enums.b.Buffering.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f45568a[com.fyber.inneractive.sdk.player.enums.b.Playing.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f45568a[com.fyber.inneractive.sdk.player.enums.b.Paused.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f45568a[com.fyber.inneractive.sdk.player.enums.b.Completed.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
