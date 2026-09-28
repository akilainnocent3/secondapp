package defpackage;

import java.io.File;
import okhttp3.ConnectionPool;
import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes5.dex */
public final class onx implements l730 {
    public static on50 a(jnx jnxVar, final File file, final yly ylyVar, final hzi0 hzi0Var, final ugb0 ugb0Var, final u72.a aVar, str strVar, final ConnectionPool connectionPool) {
        file.getClass();
        aVar.getClass();
        strVar.getClass();
        connectionPool.getClass();
        return pn50.b("https://placeholder.sporty.com/", new str() { // from class: enx
            @Override // defpackage.str
            public final Object get() {
                return pn50.a(file, new Interceptor[]{aVar.a(), ugb0Var}, ylyVar, hzi0Var, connectionPool, null, 976);
            }
        }, new fnx(0, strVar, str.class, "get", "get()Ljava/lang/Object;", 0), null, 56);
    }
}
