package com.iab.omid.library.vungle.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f54130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f54131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f54132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.a f54133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f54134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f54135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f54136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f54137h;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.vungle.devicevolume.d$a$a, reason: collision with other inner class name */
        public class RunnableC0535a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f54139a;

            public RunnableC0535a(float f10) {
                this.f54139a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f54134e.a(this.f54139a);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f54136g.set(false);
            if (((Float) d.this.f54135f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f54130a.post(new RunnableC0535a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.vungle.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f54135f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f54136g = new AtomicBoolean(false);
        this.f54137h = Executors.newSingleThreadExecutor();
        this.f54130a = handler;
        this.f54131b = context;
        this.f54132c = (AudioManager) context.getSystemService("audio");
        this.f54133d = aVar;
        this.f54134e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f54133d.a(this.f54132c.getStreamVolume(3), this.f54132c.getStreamMaxVolume(3));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f54136g.getAndSet(true)) {
            return;
        }
        d();
    }

    private void d() {
        this.f54137h.submit(new a());
    }

    public void b() {
        d();
        this.f54131b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f54131b.getContentResolver().unregisterContentObserver(this);
    }
}
