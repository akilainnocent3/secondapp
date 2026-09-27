package com.iab.omid.library.bigosg.a;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f52729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f52730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f52731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f52732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f52733e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f52729a = context;
        this.f52730b = (AudioManager) context.getSystemService("audio");
        this.f52731c = aVar;
        this.f52732d = cVar;
    }

    private float c() {
        return this.f52731c.a(this.f52730b.getStreamVolume(3), this.f52730b.getStreamMaxVolume(3));
    }

    private void d() {
        this.f52732d.a(this.f52733e);
    }

    public final void a() {
        this.f52733e = c();
        d();
        this.f52729a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void b() {
        this.f52729a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        super.onChange(z10);
        float fC = c();
        if (a(fC)) {
            this.f52733e = fC;
            d();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f52733e;
    }
}
