package defpackage;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;

/* JADX INFO: loaded from: classes8.dex */
public final class av90<T> extends ct90<T> {
    public final ct90 a;
    public final e290 b;

    public final class a implements zu90<T> {
        public final zu90<? super T> a;

        public a(zu90<? super T> zu90Var) {
            this.a = zu90Var;
        }

        @Override // defpackage.zu90
        public final void onSubscribe(pse pseVar) {
            this.a.onSubscribe(pseVar);
        }

        @Override // defpackage.zu90
        public final void onSuccess(T t) {
            this.a.onSuccess(t);
        }

        @Override // defpackage.zu90
        public final void onError(Throwable th) {
            z190.a aVar;
            e290 e290Var = av90.this.b;
            zu90<? super T> zu90Var = this.a;
            if (e290Var != null) {
                try {
                    th.getClass();
                    aVar = z190.a.a;
                } catch (Throwable th2) {
                    qtg.a(th2);
                    zu90Var.onError(new gma(th, th2));
                    return;
                }
            } else {
                aVar = null;
            }
            if (aVar != null) {
                zu90Var.onSuccess(aVar);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException(QWvyvNzGsBpRT.jmrEBLfJeH);
            nullPointerException.initCause(th);
            zu90Var.onError(nullPointerException);
        }
    }

    public av90(ct90 ct90Var, e290 e290Var) {
        this.a = ct90Var;
        this.b = e290Var;
    }

    @Override // defpackage.ct90
    public final void c(zu90<? super T> zu90Var) {
        this.a.a(new a(zu90Var));
    }
}
