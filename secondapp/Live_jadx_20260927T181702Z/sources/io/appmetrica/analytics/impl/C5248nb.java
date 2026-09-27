package io.appmetrica.analytics.impl;

import android.os.Process;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5248nb implements InterfaceC4950bl {
    @Override // io.appmetrica.analytics.impl.InterfaceC4950bl
    public final boolean a(@oy.l C5172kb c5172kb) {
        Integer num = c5172kb.f97716f;
        return num == null || num.intValue() != Process.myPid();
    }
}
