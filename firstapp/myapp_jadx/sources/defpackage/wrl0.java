package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class wrl0 extends y3l {
    public final HashMap d = new HashMap();
    public final Context e;
    public volatile p5l0 f;
    public final zua g;
    public final long h;
    public final long i;

    public wrl0(Context context, Looper looper) {
        kpl0 kpl0Var = new kpl0(this);
        this.e = context.getApplicationContext();
        p5l0 p5l0Var = new p5l0(looper, kpl0Var);
        Looper.getMainLooper();
        this.f = p5l0Var;
        this.g = zua.b();
        this.h = 5000L;
        this.i = 300000L;
    }

    @Override // defpackage.y3l
    public final ConnectionResult u(rll0 rll0Var, fzk0 fzk0Var, String str, Executor executor) {
        synchronized (this.d) {
            try {
                onl0 onl0Var = (onl0) this.d.get(rll0Var);
                ConnectionResult connectionResultA = null;
                if (executor == null) {
                    executor = null;
                }
                if (onl0Var == null) {
                    onl0Var = new onl0(this, rll0Var);
                    onl0Var.a.put(fzk0Var, fzk0Var);
                    connectionResultA = onl0.a(onl0Var, str, executor);
                    this.d.put(rll0Var, onl0Var);
                } else {
                    this.f.removeMessages(0, rll0Var);
                    if (onl0Var.a.containsKey(fzk0Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(rll0Var.toString()));
                    }
                    onl0Var.a.put(fzk0Var, fzk0Var);
                    int i = onl0Var.b;
                    if (i == 1) {
                        fzk0Var.onServiceConnected(onl0Var.f, onl0Var.d);
                    } else if (i == 2) {
                        connectionResultA = onl0.a(onl0Var, str, executor);
                    }
                }
                if (onl0Var.c) {
                    return ConnectionResult.e;
                }
                if (connectionResultA == null) {
                    connectionResultA = new ConnectionResult(-1);
                }
                return connectionResultA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.y3l
    public final void v(rll0 rll0Var, ServiceConnection serviceConnection) {
        hm20.i(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.d) {
            try {
                onl0 onl0Var = (onl0) this.d.get(rll0Var);
                if (onl0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(rll0Var.toString()));
                }
                if (!onl0Var.a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(rll0Var.toString()));
                }
                onl0Var.a.remove(serviceConnection);
                if (onl0Var.a.isEmpty()) {
                    this.f.sendMessageDelayed(this.f.obtainMessage(0, rll0Var), this.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
