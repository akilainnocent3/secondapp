package v4;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f139994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f139995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4.y f139996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f139997d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1469c f139998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x4.y f139999b;

        public final void b() {
            if (c.this.f139997d) {
                this.f139998a.i();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f139999b.post(new Runnable() { // from class: v4.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f140001b.b();
                    }
                });
            }
        }

        public b(x4.y yVar, InterfaceC1469c interfaceC1469c) {
            this.f139999b = yVar;
            this.f139998a = interfaceC1469c;
        }
    }

    /* JADX INFO: renamed from: v4.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC1469c {
        void i();
    }

    public c(Context context, Looper looper, Looper looper2, InterfaceC1469c interfaceC1469c, x4.l lVar) {
        this.f139994a = context.getApplicationContext();
        this.f139996c = lVar.createHandler(looper, null);
        this.f139995b = new b(lVar.createHandler(looper2, null), interfaceC1469c);
    }

    @SuppressLint({"UnprotectedReceiver"})
    public void d(boolean z10) {
        if (z10 == this.f139997d) {
            return;
        }
        if (z10) {
            this.f139996c.post(new Runnable() { // from class: v4.a
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = this.f139985b;
                    cVar.f139994a.registerReceiver(cVar.f139995b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                }
            });
            this.f139997d = true;
        } else {
            this.f139996c.post(new Runnable() { // from class: v4.b
                @Override // java.lang.Runnable
                public final void run() {
                    c cVar = this.f139987b;
                    cVar.f139994a.unregisterReceiver(cVar.f139995b);
                }
            });
            this.f139997d = false;
        }
    }
}
