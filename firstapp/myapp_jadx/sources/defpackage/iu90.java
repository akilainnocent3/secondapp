package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class iu90 {
    public static final <T> void a(hu90<T> hu90Var, T t) {
        pse andSet;
        hu90Var.getClass();
        t.getClass();
        au90.a aVar = (au90.a) hu90Var;
        if (aVar.isDisposed()) {
            return;
        }
        pse pseVar = aVar.get();
        xse xseVar = xse.a;
        if (pseVar == xseVar || (andSet = aVar.getAndSet(xseVar)) == xseVar) {
            return;
        }
        try {
            aVar.a.onSuccess(t);
        } finally {
            if (andSet != null) {
                andSet.dispose();
            }
        }
    }

    public static final void b(hu90<?> hu90Var, Throwable th) {
        hu90Var.getClass();
        th.getClass();
        ((au90.a) hu90Var).a(th);
    }
}
