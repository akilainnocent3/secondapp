package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final class ask0 extends p5l0 {
    public final /* synthetic */ r12 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ask0(r12 r12Var, Looper looper) {
        super(looper);
        this.a = r12Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        int i = this.a.w.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if (i3 == 2 || i3 == 1 || i3 == 7) {
                bvk0 bvk0Var = (bvk0) message.obj;
                bvk0Var.getClass();
                bvk0Var.b();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !this.a.c()) {
            bvk0 bvk0Var2 = (bvk0) message.obj;
            bvk0Var2.getClass();
            bvk0Var2.b();
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            this.a.t = new ConnectionResult(message.arg2);
            r12 r12Var = this.a;
            if (!r12Var.u && !TextUtils.isEmpty(r12Var.w()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(r12Var.w());
                    r12 r12Var2 = this.a;
                    if (!r12Var2.u) {
                        r12Var2.C(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = this.a.t;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8);
            }
            this.a.j.a(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            ConnectionResult connectionResult2 = this.a.t;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8);
            }
            this.a.j.a(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            this.a.j.a(new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            this.a.C(5, null);
            r12.a aVar = this.a.o;
            if (aVar != null) {
                aVar.b(message.arg2);
            }
            this.a.z();
            r12.B(this.a, 5, 1, null);
            return;
        }
        if (i4 == 2 && !this.a.isConnected()) {
            bvk0 bvk0Var3 = (bvk0) message.obj;
            bvk0Var3.getClass();
            bvk0Var3.b();
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", hce0.a(i5, "Don't know how to handle message: "), new Exception());
            return;
        }
        bvk0 bvk0Var4 = (bvk0) message.obj;
        synchronized (bvk0Var4) {
            try {
                bool = bvk0Var4.a;
                if (bvk0Var4.b) {
                    Log.w("GmsClient", "Callback proxy " + bvk0Var4.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            bvk0Var4.a(bool);
        }
        synchronized (bvk0Var4) {
            bvk0Var4.b = true;
        }
        bvk0Var4.b();
    }
}
