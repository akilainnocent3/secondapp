package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;
import r7.u2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static double f68191f = -1.0d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f68192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f68193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f68194c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f68195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f68196e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<d> f68197a;

        public a(d dVar) {
            this.f68197a = new WeakReference<>(dVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            d dVar;
            b bVarB;
            if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) || intent.getIntExtra(u2.e.b.f124195c, -1) != 3 || (dVar = this.f68197a.get()) == null || (bVarB = dVar.b()) == null) {
                return;
            }
            double dA = dVar.a();
            if (dA >= 0.0d) {
                bVarB.a(dA);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a(double d10);
    }

    public d(Context context) {
        this.f68192a = context;
        this.f68193b = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public double a() {
        AudioManager audioManager = this.f68193b;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f68193b;
        double streamVolume = (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
        f68191f = streamVolume;
        return streamVolume;
    }

    public b b() {
        return this.f68195d;
    }

    public void c() {
        if (this.f68192a != null) {
            this.f68196e = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f68192a.registerReceiver(this.f68196e, intentFilter);
            this.f68194c = true;
        }
    }

    public void d() {
        Context context;
        if (!this.f68194c || (context = this.f68192a) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f68196e);
            this.f68195d = null;
            this.f68194c = false;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(b bVar) {
        this.f68195d = bVar;
    }
}
