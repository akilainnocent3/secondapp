package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Timer;

/* JADX INFO: renamed from: com.inmobi.media.ok, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3898ok {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC3804l1 f57237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f57238b;

    public C3898ok(AbstractC3804l1 timeOutInformer) {
        kotlin.jvm.internal.m0.p(timeOutInformer, "timeOutInformer");
        this.f57237a = timeOutInformer;
        this.f57238b = new HashMap();
    }

    public final boolean a(byte b10, long j10) {
        kotlin.jvm.internal.m0.o("ok", "TAG");
        if (this.f57238b.containsKey(Byte.valueOf(b10))) {
            a(b10);
        }
        try {
            Timer timer = new Timer("ok");
            this.f57238b.put(Byte.valueOf(b10), timer);
            timer.schedule(new C3873nk(this, b10), j10);
            return true;
        } catch (InternalError e10) {
            kotlin.jvm.internal.m0.o("ok", "TAG");
            e10.toString();
            return false;
        }
    }

    public final void b(final byte b10) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.inmobi.media.i00
            @Override // java.lang.Runnable
            public final void run() {
                C3898ok.a(this.f56623b, b10);
            }
        });
    }

    public static final void a(C3898ok c3898ok, byte b10) {
        c3898ok.f57237a.a(b10);
    }

    public final void a(byte b10) {
        kotlin.jvm.internal.m0.o("ok", "TAG");
        Timer timer = (Timer) this.f57238b.get(Byte.valueOf(b10));
        if (timer != null) {
            timer.cancel();
            this.f57238b.remove(Byte.valueOf(b10));
        }
    }
}
