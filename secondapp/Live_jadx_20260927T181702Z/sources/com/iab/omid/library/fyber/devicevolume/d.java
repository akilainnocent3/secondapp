package com.iab.omid.library.fyber.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f53143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f53144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f53145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f53146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f53147e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f53143a = context;
        this.f53144b = (AudioManager) context.getSystemService("audio");
        this.f53145c = aVar;
        this.f53146d = cVar;
    }

    private float a() {
        return this.f53145c.a(this.f53144b.getStreamVolume(3), this.f53144b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f53146d.a(this.f53147e);
    }

    public void c() {
        this.f53147e = a();
        b();
        this.f53143a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f53143a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f53147e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f53147e;
    }
}
