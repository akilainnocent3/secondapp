package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w {
    public static void a(String str) {
        if (z.f47158a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (z.f47158a >= 18) {
            Trace.endSection();
        }
    }
}
