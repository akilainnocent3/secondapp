package com.iab.omid.library.chartboost.devicevolume;

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
    private final Handler f53002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f53003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f53004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.chartboost.devicevolume.a f53005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f53006e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f53007f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f53008g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f53009h;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.chartboost.devicevolume.d$a$a, reason: collision with other inner class name */
        public class RunnableC0499a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f53011a;

            public RunnableC0499a(float f10) {
                this.f53011a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f53006e.a(this.f53011a);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f53008g.set(false);
            if (((Float) d.this.f53007f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f53002a.post(new RunnableC0499a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.chartboost.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f53007f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f53008g = new AtomicBoolean(false);
        this.f53009h = Executors.newSingleThreadExecutor();
        this.f53002a = handler;
        this.f53003b = context;
        this.f53004c = (AudioManager) context.getSystemService("audio");
        this.f53005d = aVar;
        this.f53006e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f53005d.a(this.f53004c.getStreamVolume(3), this.f53004c.getStreamMaxVolume(3));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f53008g.getAndSet(true)) {
            return;
        }
        d();
    }

    private void d() {
        this.f53009h.submit(new a());
    }

    public void b() {
        d();
        this.f53003b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f53003b.getContentResolver().unregisterContentObserver(this);
    }
}
