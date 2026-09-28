package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class aek0 implements dek0 {
    public static final Object c = new Object();
    public volatile dek0 a;
    public volatile Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public static aek0 b(bek0 bek0Var) {
        if (bek0Var instanceof aek0) {
            return (aek0) bek0Var;
        }
        aek0 aek0Var = new aek0();
        aek0Var.b = c;
        aek0Var.a = bek0Var;
        return aek0Var;
    }

    @Override // defpackage.iek0
    public final Object a() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objA = this.a.a();
                Object obj4 = this.b;
                if (obj4 != obj2 && obj4 != objA) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objA + ". This is likely due to a circular dependency.");
                }
                this.b = objA;
                this.a = null;
                return objA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
