package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class nm8 extends yl8 {
    public final yl8 a;
    public final taj.k b = taj.g;

    public final class a implements mm8 {
        public final mm8 a;

        public a(mm8 mm8Var) {
            this.a = mm8Var;
        }

        @Override // defpackage.mm8
        public final void onComplete() {
            this.a.onComplete();
        }

        @Override // defpackage.mm8
        public final void onError(Throwable th) {
            mm8 mm8Var = this.a;
            try {
                nm8.this.b.getClass();
                mm8Var.onComplete();
            } catch (Throwable th2) {
                qtg.a(th2);
                mm8Var.onError(new gma(th, th2));
            }
        }

        @Override // defpackage.mm8
        public final void onSubscribe(pse pseVar) {
            this.a.onSubscribe(pseVar);
        }
    }

    public nm8(yl8 yl8Var) {
        this.a = yl8Var;
    }

    @Override // defpackage.yl8
    public final void e(mm8 mm8Var) {
        this.a.b(new a(mm8Var));
    }
}
