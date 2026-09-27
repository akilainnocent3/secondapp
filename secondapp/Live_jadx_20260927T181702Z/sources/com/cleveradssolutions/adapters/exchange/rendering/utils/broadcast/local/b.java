package com.cleveradssolutions.adapters.exchange.rendering.utils.broadcast.local;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f42511b;

    public b(long j10) {
        this.f42510a = j10;
    }

    public static void c(Context context, long j10, String str) {
        Intent intent = new Intent(str);
        intent.putExtra("BROADCAST_IDENTIFIER_KEY", j10);
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(intent);
    }

    public abstract IntentFilter a();

    public void b(BroadcastReceiver broadcastReceiver) {
        Context context = this.f42511b;
        if (context == null || broadcastReceiver == null) {
            return;
        }
        LocalBroadcastManager.getInstance(context).unregisterReceiver(broadcastReceiver);
        this.f42511b = null;
    }

    public void d(Context context, BroadcastReceiver broadcastReceiver) {
        Context applicationContext = context.getApplicationContext();
        this.f42511b = applicationContext;
        LocalBroadcastManager.getInstance(applicationContext).registerReceiver(broadcastReceiver, a());
    }

    public boolean e(Intent intent) {
        return this.f42510a == intent.getLongExtra("BROADCAST_IDENTIFIER_KEY", -1L);
    }
}
