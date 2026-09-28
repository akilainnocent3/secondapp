package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class kbd implements fva {
    public final Context a;
    public final xa50.c b;

    public kbd(Context context, xa50.c cVar) {
        this.a = context.getApplicationContext();
        this.b = cVar;
    }

    @Override // defpackage.gbs
    public final void b() {
        ow90 ow90VarA = ow90.a(this.a);
        xa50.c cVar = this.b;
        synchronized (ow90VarA) {
            ow90VarA.b.add(cVar);
            ow90VarA.b();
        }
    }

    @Override // defpackage.gbs
    public final void c() {
        ow90 ow90VarA = ow90.a(this.a);
        xa50.c cVar = this.b;
        synchronized (ow90VarA) {
            ow90VarA.b.remove(cVar);
            if (ow90VarA.c && ow90VarA.b.isEmpty()) {
                ow90.c cVar2 = ow90VarA.a;
                ((ConnectivityManager) cVar2.c.get()).unregisterNetworkCallback(cVar2.d);
                ow90VarA.c = false;
            }
        }
    }

    @Override // defpackage.gbs
    public final void onDestroy() {
    }
}
