package com.mbridge.msdk.config.component.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import r7.u2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f65685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f65686c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f65684a = "MBVolumeEventPublisher";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList<com.mbridge.msdk.config.component.status.a> f65687d = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) && intent.getIntExtra(u2.e.b.f124195c, -1) == 3) {
                e.this.b();
            }
        }
    }

    public e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            this.f65685b = (AudioManager) contextD.getApplicationContext().getSystemService("audio");
        }
        c();
    }

    public void b(com.mbridge.msdk.config.component.status.a aVar) {
        if (aVar != null) {
            this.f65687d.remove(aVar);
        }
    }

    public void c() {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                this.f65686c = new b();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                contextD.registerReceiver(this.f65686c, intentFilter);
            }
        } catch (Throwable th2) {
            q0.b("MBVolumeEventPublisher", th2.getMessage());
        }
    }

    public void d() {
        if (this.f65687d.isEmpty()) {
            e();
            this.f65685b = null;
        }
    }

    public void e() {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                contextD.unregisterReceiver(this.f65686c);
            }
        } catch (Throwable th2) {
            q0.b("MBVolumeEventPublisher", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b("916005");
        HashMap map = new HashMap();
        map.put(com.mbridge.msdk.config.component.common.util.c.a("volume"), String.valueOf(a()));
        bVar.a(map);
        Iterator<com.mbridge.msdk.config.component.status.a> it = this.f65687d.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    public void a(com.mbridge.msdk.config.component.status.a aVar) {
        if (this.f65687d.contains(aVar)) {
            return;
        }
        this.f65687d.add(aVar);
    }

    private double a() {
        AudioManager audioManager = this.f65685b;
        int streamMaxVolume = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.f65685b;
        return (((double) (audioManager2 != null ? audioManager2.getStreamVolume(3) : -1)) * 100.0d) / ((double) streamMaxVolume);
    }
}
