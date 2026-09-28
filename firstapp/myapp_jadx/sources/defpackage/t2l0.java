package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class t2l0 {
    public static final Object f = new Object();
    public final String a;
    public final otk0 b;
    public final Object c;
    public final Object d = new Object();
    public volatile Object e = null;

    public /* synthetic */ t2l0(String str, Object obj, otk0 otk0Var) {
        this.a = str;
        this.c = obj;
        this.b = otk0Var;
    }

    public final Object a(Object obj) {
        synchronized (this.d) {
        }
        if (obj != null) {
            return obj;
        }
        if (flc.b == null) {
            return this.c;
        }
        synchronized (f) {
            try {
                if (l9c.c()) {
                    return this.e == null ? this.c : this.e;
                }
                try {
                    for (t2l0 t2l0Var : v2l0.a) {
                        if (l9c.c()) {
                            throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                        }
                        Object objZza = null;
                        try {
                            otk0 otk0Var = t2l0Var.b;
                            if (otk0Var != null) {
                                objZza = otk0Var.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (f) {
                            t2l0Var.e = objZza;
                        }
                    }
                } catch (SecurityException unused2) {
                }
                otk0 otk0Var2 = this.b;
                if (otk0Var2 != null) {
                    try {
                        return otk0Var2.zza();
                    } catch (IllegalStateException | SecurityException unused3) {
                    }
                }
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
