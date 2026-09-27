package com.cleveradssolutions.adapters.exchange.rendering.utils.broadcast.local;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0427a f42509c;

    /* JADX INFO: renamed from: com.cleveradssolutions.adapters.exchange.rendering.utils.broadcast.local.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC0427a {
        void b(String str);
    }

    public a(long j10, InterfaceC0427a interfaceC0427a) {
        super(j10);
        this.f42509c = interfaceC0427a;
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.utils.broadcast.local.b
    public IntentFilter a() {
        return new IntentFilter("com.cleveradssolutions.adapters.dsp.rendering.browser.close");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (e(intent)) {
            this.f42509c.b(intent.getAction());
        }
    }
}
