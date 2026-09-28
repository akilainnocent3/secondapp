package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ody<T> extends yl8 implements zaj<T> {
    public final ucy a;

    public ody(ucy ucyVar) {
        this.a = ucyVar;
    }

    @Override // defpackage.zaj
    public final ucy<T> a() {
        return new ndy(this.a);
    }

    @Override // defpackage.yl8
    public final void e(mm8 mm8Var) {
        this.a.a(new a(mm8Var));
    }

    public static final class a<T> implements kfy<T>, pse {
        public final mm8 a;
        public pse b;

        public a(mm8 mm8Var) {
            this.a = mm8Var;
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.b.dispose();
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.b.isDisposed();
        }

        @Override // defpackage.kfy
        public final void onComplete() {
            this.a.onComplete();
        }

        @Override // defpackage.kfy
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.kfy
        public final void onSubscribe(pse pseVar) {
            this.b = pseVar;
            this.a.onSubscribe(this);
        }

        @Override // defpackage.kfy
        public final void onNext(T t) {
        }
    }
}
