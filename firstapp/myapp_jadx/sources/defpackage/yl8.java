package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class yl8 implements sm8 {
    @Override // defpackage.sm8
    public final void b(mm8 mm8Var) {
        try {
            e(mm8Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            qtg.a(th);
            o760.b(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final am8 c(mdv mdvVar) {
        return new am8(new sm8[]{mdvVar, this});
    }

    public final void d() {
        b(new z1g());
    }

    public abstract void e(mm8 mm8Var);

    public final tm8 f(qm70 qm70Var) {
        yby.b(qm70Var, "scheduler is null");
        return new tm8(this, qm70Var);
    }
}
