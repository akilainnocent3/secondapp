package re;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f125352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f125353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f125354c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1216b f125355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f125356c;

        public a(Handler handler, InterfaceC1216b interfaceC1216b) {
            this.f125356c = handler;
            this.f125355b = interfaceC1216b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f125356c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f125354c) {
                this.f125355b.i();
            }
        }
    }

    /* JADX INFO: renamed from: re.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface InterfaceC1216b {
        void i();
    }

    public b(Context context, Handler handler, InterfaceC1216b interfaceC1216b) {
        this.f125352a = context.getApplicationContext();
        this.f125353b = new a(handler, interfaceC1216b);
    }

    public void b(boolean z10) {
        if (z10 && !this.f125354c) {
            this.f125352a.registerReceiver(this.f125353b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f125354c = true;
        } else {
            if (z10 || !this.f125354c) {
                return;
            }
            this.f125352a.unregisterReceiver(this.f125353b);
            this.f125354c = false;
        }
    }
}
