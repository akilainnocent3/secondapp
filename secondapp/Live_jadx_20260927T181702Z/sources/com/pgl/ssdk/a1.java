package com.pgl.ssdk;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a1 extends a4 implements a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f71952b;

    public a1(HandlerThread handlerThread, a4.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.f71952b = handlerThread;
    }

    public void a(a4.a aVar) {
        this.f71955a = new WeakReference<>(aVar);
    }

    public void a(String str) {
        HandlerThread handlerThread = this.f71952b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
