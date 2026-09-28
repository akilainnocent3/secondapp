package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import androidx.appcompat.app.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lq0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                c.ExecutorC0030c executorC0030c = (c.ExecutorC0030c) obj2;
                try {
                    ((Runnable) obj).run();
                    return;
                } finally {
                    executorC0030c.a();
                }
            case 1:
                ((q26.a) obj2).b.onCameraAvailable((String) obj);
                return;
            default:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                ((Context) obj).registerReceiver(new tox.d((tox) obj2), intentFilter);
                return;
        }
    }
}
