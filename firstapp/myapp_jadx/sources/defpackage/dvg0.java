package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class dvg0 {
    public static volatile bnc e;
    public final ss7 a;
    public final ss7 b;
    public final pm70 c;
    public final bmh0 d;

    public dvg0(ss7 ss7Var, ss7 ss7Var2, pm70 pm70Var, bmh0 bmh0Var, final mvj0 mvj0Var) {
        this.a = ss7Var;
        this.b = ss7Var2;
        this.c = pm70Var;
        this.d = bmh0Var;
        mvj0Var.a.execute(new Runnable() { // from class: kvj0
            @Override // java.lang.Runnable
            public final void run() {
                final mvj0 mvj0Var2 = mvj0Var;
                mvj0Var2.d.f(new zoe0.a() { // from class: lvj0
                    @Override // zoe0.a
                    public final Object execute() {
                        mvj0 mvj0Var3 = mvj0Var2;
                        Iterator<oug0> it = mvj0Var3.b.I().iterator();
                        while (it.hasNext()) {
                            mvj0Var3.c.a(it.next(), 1);
                        }
                        return null;
                    }
                });
            }
        });
    }

    public static dvg0 a() {
        bnc bncVar = e;
        if (bncVar != null) {
            return bncVar.i.get();
        }
        ib5.a("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (dvg0.class) {
                try {
                    if (e == null) {
                        anc ancVar = new anc();
                        context.getClass();
                        ancVar.a = context;
                        e = ancVar.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final qug0 c(bm5 bm5Var) {
        byte[] bytes;
        Set setUnmodifiableSet = bm5Var != null ? Collections.unmodifiableSet(bm5.d) : Collections.singleton(new j4g("proto"));
        bm5Var.getClass();
        String str = bm5Var.a;
        String str2 = bm5Var.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = lx5.a("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        return new qug0(setUnmodifiableSet, new ml1("cct", bytes, kw20.a), this);
    }
}
