package vb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f140855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f140856b = new Handler(Looper.getMainLooper(), new a());

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f140857b = 1;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).a();
            return true;
        }
    }

    public synchronized void a(v<?> vVar, boolean z10) {
        try {
            if (this.f140855a || z10) {
                this.f140856b.obtainMessage(1, vVar).sendToTarget();
            } else {
                this.f140855a = true;
                vVar.a();
                this.f140855a = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
