package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.i3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3732i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3806l3 f56637a;

    public C3732i3(InterfaceC3806l3 mEventHandler) {
        kotlin.jvm.internal.m0.p(mEventHandler, "mEventHandler");
        this.f56637a = mEventHandler;
    }

    public static final dr.w2 b(S2 s10) {
        C4080w3 c4080w3 = C4080w3.f57979a;
        kotlin.jvm.internal.m0.o("w3", "access$getTAG$p(...)");
        String str = s10.f55462b;
        return dr.w2.f79517a;
    }

    public final void a(final S2 click) {
        kotlin.jvm.internal.m0.p(click, "click");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.hy
            @Override // java.lang.Runnable
            public final void run() {
                C3732i3.a(click, this);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, com.inmobi.media.mo] */
    public static final void a(final S2 s10, C3732i3 c3732i3) {
        String str = s10.f55462b;
        C4080w3 c4080w3 = C4080w3.f57979a;
        Je je2 = new Je(str, C4080w3.a(s10), null, null, null, false, 60);
        int pingTimeout = C4080w3.c().getPingTimeout();
        kotlin.jvm.internal.l1.h hVar = new kotlin.jvm.internal.l1.h();
        ?? moVar = new mo(je2, new C3707h3(new AtomicBoolean(false), hVar, c3732i3, s10), pingTimeout * 1000, new ds.a() { // from class: com.inmobi.media.iy
            @Override // ds.a
            public final Object invoke() {
                return C3732i3.b(s10);
            }
        });
        hVar.f102749b = moVar;
        moVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AtomicBoolean atomicBoolean, kotlin.jvm.internal.l1.h hVar, C3732i3 c3732i3, S2 s10, boolean z10) {
        if (atomicBoolean.compareAndSet(false, true)) {
            mo moVar = (mo) hVar.f102749b;
            if (moVar != null) {
                moVar.a();
            }
            if (z10) {
                c3732i3.f56637a.a(s10);
            } else {
                c3732i3.f56637a.a(s10, EnumC3530a6.f55935d);
            }
        }
    }
}
