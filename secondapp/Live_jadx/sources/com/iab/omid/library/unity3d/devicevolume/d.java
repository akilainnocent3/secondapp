package com.iab.omid.library.unity3d.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f54003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f54004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f54005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f54006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f54007e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f54003a = context;
        this.f54004b = (AudioManager) context.getSystemService("audio");
        this.f54005c = aVar;
        this.f54006d = cVar;
    }

    private float a() {
        return this.f54005c.a(this.f54004b.getStreamVolume(3), this.f54004b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f54006d.a(this.f54007e);
    }

    public void c() {
        this.f54007e = a();
        b();
        this.f54003a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f54003a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f54007e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f54007e;
    }
}
