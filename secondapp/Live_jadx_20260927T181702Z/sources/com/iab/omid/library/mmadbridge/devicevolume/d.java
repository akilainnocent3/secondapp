package com.iab.omid.library.mmadbridge.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f53554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f53555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f53556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f53557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f53558e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f53554a = context;
        this.f53555b = (AudioManager) context.getSystemService("audio");
        this.f53556c = aVar;
        this.f53557d = cVar;
    }

    private float a() {
        return this.f53556c.a(this.f53555b.getStreamVolume(3), this.f53555b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f53557d.a(this.f53558e);
    }

    public void c() {
        this.f53558e = a();
        b();
        this.f53554a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f53554a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f53558e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f53558e;
    }
}
