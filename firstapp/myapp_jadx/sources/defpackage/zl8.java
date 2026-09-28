package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class zl8<R> extends r2i<R> {
    public final yl8 b;
    public final l3i c;

    public static final class a<R> extends AtomicReference<bee0> implements n3i<R>, mm8, bee0 {
        public final zde0<? super R> a;
        public m830<? extends R> b;
        public pse c;
        public final AtomicLong d = new AtomicLong();

        public a(zde0 zde0Var, l3i l3iVar) {
            this.a = zde0Var;
            this.b = l3iVar;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            gee0.c(this, this.d, bee0Var);
        }

        @Override // defpackage.bee0
        public final void cancel() {
            this.c.dispose();
            gee0.a(this);
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            m830<? extends R> m830Var = this.b;
            if (m830Var == null) {
                this.a.onComplete();
            } else {
                this.b = null;
                m830Var.c(this);
            }
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        @Override // defpackage.zde0
        public final void onNext(R r) {
            this.a.onNext(r);
        }

        @Override // defpackage.mm8
        public final void onSubscribe(pse pseVar) {
            if (xse.e(this.c, pseVar)) {
                this.c = pseVar;
                this.a.a(this);
            }
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            gee0.b(this, this.d, j);
        }
    }

    public zl8(yl8 yl8Var, l3i l3iVar) {
        this.b = yl8Var;
        this.c = l3iVar;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super R> zde0Var) {
        this.b.b(new a(zde0Var, this.c));
    }
}
