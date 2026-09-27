package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f46927c = new AtomicReference(new c());

    public static boolean a(int i10, boolean z10) {
        int i11 = i10 & 3;
        if (i11 != 3) {
            return z10 && i11 == 2;
        }
        return true;
    }
}
