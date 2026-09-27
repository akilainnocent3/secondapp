package com.startapp.sdk.internal;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class wh extends d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ de f75794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f75795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yh f75796c;

    public wh(yh yhVar, de deVar, long j10) {
        this.f75796c = yhVar;
        this.f75794a = deVar;
        this.f75795b = j10;
    }

    @Override // com.startapp.sdk.internal.d3
    public final void a(za zaVar) {
        yh yhVar = this.f75796c;
        int iAbs = Math.abs(Arrays.hashCode(this.f75794a.f74692a));
        long j10 = this.f75795b;
        synchronized (yhVar) {
            yhVar.f75907b.put(Integer.valueOf(iAbs), yhVar.f75908c.scheduleAtFixedRate(zaVar, j10, j10, TimeUnit.MILLISECONDS));
        }
    }
}
