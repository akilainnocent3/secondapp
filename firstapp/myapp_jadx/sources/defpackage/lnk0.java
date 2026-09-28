package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lnk0 implements wnk0 {
    public static final Object c = new Object();
    public volatile wnk0 a;
    public volatile Object b;

    public static wnk0 a(wnk0 wnk0Var) {
        if (wnk0Var instanceof lnk0) {
            return wnk0Var;
        }
        lnk0 lnk0Var = new lnk0();
        lnk0Var.b = c;
        lnk0Var.a = wnk0Var;
        return lnk0Var;
    }

    @Override // defpackage.wnk0
    public final Object zza() {
        Object objZza;
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.b;
                if (objZza == obj2) {
                    objZza = this.a.zza();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.b = objZza;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZza;
    }
}
