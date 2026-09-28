package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class mdv<T> extends yl8 {
    public final fdy a;

    public static final class a<T> implements pse {
        public final mm8 a;
        public pse b;

        public a(mm8 mm8Var) {
            this.a = mm8Var;
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.b.dispose();
            this.b = xse.a;
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.b.isDisposed();
        }
    }

    public mdv(fdy fdyVar) {
        this.a = fdyVar;
    }

    @Override // defpackage.yl8
    public final void e(mm8 mm8Var) {
        a aVar = new a(mm8Var);
        fdy fdyVar = this.a;
        fdyVar.getClass();
        try {
            fdyVar.a.a(new fdy.a(aVar));
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            qtg.a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
