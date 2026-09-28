package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ow90 {
    public static volatile ow90 d;
    public final c a;
    public final HashSet b = new HashSet();
    public boolean c;

    public class a implements c0l<ConnectivityManager> {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.c0l
        public final ConnectivityManager get() {
            return (ConnectivityManager) this.a.getSystemService("connectivity");
        }
    }

    public class b implements fva.a {
        public b() {
        }

        @Override // fva.a
        public final void a(boolean z) {
            ArrayList arrayList;
            erh0.a();
            synchronized (ow90.this) {
                arrayList = new ArrayList(ow90.this.b);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((fva.a) obj).a(z);
            }
        }
    }

    public static final class c {
        public boolean a;
        public final b b;
        public final b0l c;
        public final a d = new a();

        public class a extends ConnectivityManager.NetworkCallback {
            public a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                erh0.f().post(new pw90(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                erh0.f().post(new pw90(this, false));
            }
        }

        public c(b0l b0lVar, b bVar) {
            this.c = b0lVar;
            this.b = bVar;
        }
    }

    public ow90(Context context) {
        this.a = new c(new b0l(new a(context)), new b());
    }

    public static ow90 a(Context context) {
        if (d == null) {
            synchronized (ow90.class) {
                try {
                    if (d == null) {
                        d = new ow90(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final void b() {
        if (this.c || this.b.isEmpty()) {
            return;
        }
        c cVar = this.a;
        b0l b0lVar = cVar.c;
        boolean z = false;
        cVar.a = ((ConnectivityManager) b0lVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) b0lVar.get()).registerDefaultNetworkCallback(cVar.d);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.c = z;
    }
}
