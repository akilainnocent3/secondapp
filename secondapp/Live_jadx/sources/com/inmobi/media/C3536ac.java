package com.inmobi.media;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.ac, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3536ac implements Zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Zb f55959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f55960b;

    public C3536ac(Zb mediaChangeReceiver) {
        kotlin.jvm.internal.m0.p(mediaChangeReceiver, "mediaChangeReceiver");
        this.f55959a = mediaChangeReceiver;
        this.f55960b = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.Zb
    public final void a() {
        if (this.f55960b.getAndSet(false)) {
            this.f55959a.a();
        }
    }

    @Override // com.inmobi.media.Zb
    public final void b() {
        if (this.f55960b.getAndSet(true)) {
            return;
        }
        this.f55959a.b();
    }
}
