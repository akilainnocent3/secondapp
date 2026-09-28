package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import androidx.media3.exoplayer.a;
import com.pairip.VMRunner;
import defpackage.cdl;
import defpackage.fqe0;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final Context a;
    public final C0063a b;
    public final cdl c;
    public boolean d;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.a$a, reason: collision with other inner class name */
    public final class C0063a extends BroadcastReceiver {
        public final b a;
        public final cdl b;

        public C0063a(cdl cdlVar, b bVar) {
            this.b = cdlVar;
            this.a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            VMRunner.invoke("eHWlUzv28pX3diWa", new Object[]{this, context, intent});
        }
    }

    public interface b {
    }

    public a(Context context, Looper looper, Looper looper2, b bVar, fqe0 fqe0Var) {
        this.a = context.getApplicationContext();
        this.c = fqe0Var.c(looper, null);
        this.b = new C0063a(fqe0Var.c(looper2, null), bVar);
    }

    public final void a() {
        if (this.d) {
            this.c.i(new Runnable() { // from class: s21
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = this.a;
                    aVar.a.unregisterReceiver(aVar.b);
                }
            });
            this.d = false;
        }
    }
}
