package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rn20 implements n340<Context, sqc<zn20>> {
    public final String a;
    public final Function1<Context, List<kpc<zn20>>> b;
    public final v5b c;
    public final Object d = new Object();
    public volatile cn20 e;

    public rn20(v5b v5bVar, String str, Function1 function1) {
        this.a = str;
        this.b = function1;
        this.c = v5bVar;
    }

    @Override // defpackage.n340
    public final sqc<zn20> a(Context context, ohp ohpVar) {
        cn20 cn20Var;
        Context context2 = context;
        context2.getClass();
        ohpVar.getClass();
        cn20 cn20Var2 = this.e;
        if (cn20Var2 != null) {
            return cn20Var2;
        }
        synchronized (this.d) {
            try {
                if (this.e == null) {
                    Context applicationContext = context2.getApplicationContext();
                    Function1<Context, List<kpc<zn20>>> function1 = this.b;
                    applicationContext.getClass();
                    List<kpc<zn20>> listInvoke = function1.invoke(applicationContext);
                    v5b v5bVar = this.c;
                    qn20 qn20Var = new qn20(applicationContext, this);
                    listInvoke.getClass();
                    this.e = new cn20(new cn20(new yqc(new skh(bo20.a, rkh.a, new gn20(qn20Var)), a.c(new lpc(listInvoke, null)), new g9e0(), v5bVar)));
                }
                cn20Var = this.e;
                cn20Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return cn20Var;
    }
}
