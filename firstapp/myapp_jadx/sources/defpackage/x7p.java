package defpackage;

import android.content.Context;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class x7p {
    public static final /* synthetic */ ohp<Object>[] d;
    public final String a;
    public final ThreadLocal<Boolean> b;
    public final sqc<zn20> c;

    static {
        f630 f630Var = new f630(fv5.NO_RECEIVER, x7p.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        jq40.a.getClass();
        d = new ohp[]{f630Var};
    }

    public x7p(Context context, String str) {
        context.getClass();
        this.a = str;
        this.b = new ThreadLocal<>();
        this.c = v8b.a(10, str, new Function1() { // from class: s7p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Context context2 = (Context) obj;
                context2.getClass();
                return a.c(q390.a(context2, this.a.a, q390.a));
            }
        }).a(context, d[0]);
    }

    public final void a(Function1 function1) {
    }
}
