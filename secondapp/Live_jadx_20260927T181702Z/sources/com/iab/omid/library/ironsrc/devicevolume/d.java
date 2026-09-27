package com.iab.omid.library.ironsrc.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f53419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f53420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f53421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f53422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f53423e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f53419a = context;
        this.f53420b = (AudioManager) context.getSystemService("audio");
        this.f53421c = aVar;
        this.f53422d = cVar;
    }

    private float a() {
        return this.f53421c.a(this.f53420b.getStreamVolume(3), this.f53420b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f53422d.a(this.f53423e);
    }

    public void c() {
        this.f53423e = a();
        b();
        this.f53419a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f53419a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f53423e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f53423e;
    }
}
