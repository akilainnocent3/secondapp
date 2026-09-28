package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes8.dex */
public final class am8 extends yl8 {
    public final sm8[] a;

    public static final class a extends AtomicInteger implements mm8 {
        public final mm8 a;
        public final sm8[] b;
        public int c;
        public final md80 d = new md80();

        public a(mm8 mm8Var, sm8[] sm8VarArr) {
            this.a = mm8Var;
            this.b = sm8VarArr;
        }

        public final void a() {
            md80 md80Var = this.d;
            if (!md80Var.isDisposed() && getAndIncrement() == 0) {
                while (!md80Var.isDisposed()) {
                    int i = this.c;
                    this.c = i + 1;
                    sm8[] sm8VarArr = this.b;
                    if (i == sm8VarArr.length) {
                        this.a.onComplete();
                        return;
                    } else {
                        sm8VarArr[i].b(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // defpackage.mm8
        public final void onComplete() {
            a();
        }

        @Override // defpackage.mm8
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.mm8
        public final void onSubscribe(pse pseVar) {
            xse.c(this.d, pseVar);
        }
    }

    public am8(sm8[] sm8VarArr) {
        this.a = sm8VarArr;
    }

    @Override // defpackage.yl8
    public final void e(mm8 mm8Var) {
        a aVar = new a(mm8Var, this.a);
        mm8Var.onSubscribe(aVar.d);
        aVar.a();
    }
}
