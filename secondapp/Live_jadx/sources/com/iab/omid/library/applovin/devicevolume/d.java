package com.iab.omid.library.applovin.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f52617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f52618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f52619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f52620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f52621e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f52617a = context;
        this.f52618b = (AudioManager) context.getSystemService("audio");
        this.f52619c = aVar;
        this.f52620d = cVar;
    }

    private float a() {
        return this.f52619c.a(this.f52618b.getStreamVolume(3), this.f52618b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f52620d.a(this.f52621e);
    }

    public void c() {
        this.f52621e = a();
        b();
        this.f52617a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f52617a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f52621e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f52621e;
    }
}
