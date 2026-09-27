package com.iab.omid.library.inmobi.devicevolume;

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
    private final Handler f53278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f53279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AudioManager f53280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.a f53281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f53282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Float> f53283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f53284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ExecutorService f53285h;

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.iab.omid.library.inmobi.devicevolume.d$a$a, reason: collision with other inner class name */
        public class RunnableC0508a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ float f53287a;

            public RunnableC0508a(float f10) {
                this.f53287a = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f53282e.a(this.f53287a);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            float fA = d.this.a();
            d.this.f53284g.set(false);
            if (((Float) d.this.f53283f.getAndSet(Float.valueOf(fA))).floatValue() != fA) {
                d.this.f53278a.post(new RunnableC0508a(fA));
            }
        }
    }

    public d(Handler handler, Context context, com.iab.omid.library.inmobi.devicevolume.a aVar, c cVar) {
        super(handler);
        this.f53283f = new AtomicReference<>(Float.valueOf(-1.0f));
        this.f53284g = new AtomicBoolean(false);
        this.f53285h = Executors.newSingleThreadExecutor();
        this.f53278a = handler;
        this.f53279b = context;
        this.f53280c = (AudioManager) context.getSystemService("audio");
        this.f53281d = aVar;
        this.f53282e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float a() {
        return this.f53281d.a(this.f53280c.getStreamVolume(3), this.f53280c.getStreamMaxVolume(3));
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        if (this.f53284g.getAndSet(true)) {
            return;
        }
        d();
    }

    private void d() {
        this.f53285h.submit(new a());
    }

    public void b() {
        d();
        this.f53279b.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f53279b.getContentResolver().unregisterContentObserver(this);
    }
}
