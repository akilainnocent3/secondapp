package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ct90<T> implements dw90<T> {
    @Override // defpackage.dw90
    public final void a(zu90<? super T> zu90Var) {
        yby.b(zu90Var, "observer is null");
        try {
            c(zu90Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            qtg.a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final ct90<T> b(qm70 qm70Var) {
        yby.b(qm70Var, "scheduler is null");
        return new yu90(this, qm70Var);
    }

    public abstract void c(zu90<? super T> zu90Var);

    public final ct90<T> d(qm70 qm70Var) {
        yby.b(qm70Var, "scheduler is null");
        return new ew90(this, qm70Var);
    }
}
