package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public final class kpl0 implements Handler.Callback {
    public final /* synthetic */ wrl0 a;

    public /* synthetic */ kpl0(wrl0 wrl0Var) {
        this.a = wrl0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.a.d) {
                try {
                    rll0 rll0Var = (rll0) message.obj;
                    onl0 onl0Var = (onl0) this.a.d.get(rll0Var);
                    if (onl0Var != null && onl0Var.a.isEmpty()) {
                        if (onl0Var.c) {
                            onl0Var.i.f.removeMessages(1, onl0Var.e);
                            wrl0 wrl0Var = onl0Var.i;
                            wrl0Var.g.c(wrl0Var.e, onl0Var);
                            onl0Var.c = false;
                            onl0Var.b = 2;
                        }
                        this.a.d.remove(rll0Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        synchronized (this.a.d) {
            try {
                rll0 rll0Var2 = (rll0) message.obj;
                onl0 onl0Var2 = (onl0) this.a.d.get(rll0Var2);
                if (onl0Var2 != null && onl0Var2.b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(rll0Var2)), new Exception());
                    ComponentName componentName = onl0Var2.f;
                    if (componentName == null) {
                        rll0Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        rll0Var2.getClass();
                        componentName = new ComponentName("com.google.android.gms", "unknown");
                    }
                    onl0Var2.onServiceDisconnected(componentName);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return true;
    }
}
