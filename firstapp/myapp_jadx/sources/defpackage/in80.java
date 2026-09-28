package defpackage;

import android.content.Context;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes7.dex */
public final class in80 {
    public static volatile a840 b;
    public static final in80 a = new in80();
    public static final mpe0 c = hwr.b(new hn80());

    public final m9n a(Context context) {
        a840 a840VarA;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        a840 a840Var = b;
        if (a840Var != null) {
            return a840Var;
        }
        synchronized (this) {
            a840VarA = b;
            if (a840VarA == null) {
                applicationContext.getClass();
                m9n.a aVar = new m9n.a(applicationContext);
                ap8.a aVar2 = new ap8.a();
                aVar2.b(omy.a((OkHttpClient) c.getValue()), jq40.a(kmh0.class));
                aVar.c = aVar2.d();
                a840VarA = aVar.a();
                b = a840VarA;
            }
        }
        return a840VarA;
    }
}
