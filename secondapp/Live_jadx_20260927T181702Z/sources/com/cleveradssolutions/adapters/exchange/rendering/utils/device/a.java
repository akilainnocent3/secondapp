package com.cleveradssolutions.adapters.exchange.rendering.utils.device;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager f42513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0428a f42514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f42515d;

    /* JADX INFO: renamed from: com.cleveradssolutions.adapters.exchange.rendering.utils.device.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0428a {
        void a(Float f10);
    }

    public a(Context context, Handler handler, InterfaceC0428a interfaceC0428a) {
        super(handler);
        this.f42512a = context;
        this.f42513b = (AudioManager) context.getSystemService("audio");
        this.f42514c = interfaceC0428a;
    }

    public final void a() {
        this.f42514c.a(this.f42515d);
    }

    public void b() {
        this.f42515d = d();
        a();
        this.f42512a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void c() {
        this.f42512a.getContentResolver().unregisterContentObserver(this);
    }

    public final Float d() {
        return e(this.f42513b.getStreamVolume(3), this.f42513b.getStreamMaxVolume(3));
    }

    public Float e(int i10, int i11) {
        if (i11 < 0 || i10 < 0) {
            return null;
        }
        float f10 = i10 / i11;
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return Float.valueOf(f10 * 100.0f);
    }

    public final boolean f(Float f10) {
        return f10 == null || !f10.equals(this.f42515d);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        super.onChange(z10);
        Float fD = d();
        if (f(fD)) {
            this.f42515d = fD;
            a();
        }
    }
}
