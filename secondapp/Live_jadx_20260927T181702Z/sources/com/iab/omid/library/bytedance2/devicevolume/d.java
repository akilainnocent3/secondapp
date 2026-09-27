package com.iab.omid.library.bytedance2.devicevolume;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f52873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AudioManager f52874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f52875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f52876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f52877e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f52873a = context;
        this.f52874b = (AudioManager) context.getSystemService("audio");
        this.f52875c = aVar;
        this.f52876d = cVar;
    }

    private float a() {
        return this.f52875c.a(this.f52874b.getStreamVolume(3), this.f52874b.getStreamMaxVolume(3));
    }

    private void b() {
        this.f52876d.a(this.f52877e);
    }

    public void c() {
        this.f52877e = a();
        b();
        this.f52873a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void d() {
        this.f52873a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        float fA = a();
        if (a(fA)) {
            this.f52877e = fA;
            b();
        }
    }

    private boolean a(float f10) {
        return f10 != this.f52877e;
    }
}
