package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class mh50 {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new a());

    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((qg50) message.obj).c();
            return true;
        }
    }

    public final synchronized void a(qg50<?> qg50Var, boolean z) {
        try {
            if (this.a || z) {
                this.b.obtainMessage(1, qg50Var).sendToTarget();
            } else {
                this.a = true;
                qg50Var.c();
                this.a = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
