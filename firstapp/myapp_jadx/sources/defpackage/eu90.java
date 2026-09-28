package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class eu90<T> extends ct90<T> {
    public final cu90 a;
    public final wrg0 b;

    public static final class a<T> implements zu90<T> {
        public final zu90<? super T> a;
        public final pya<? super pse> b;
        public boolean c;

        public a(zu90 zu90Var, wrg0 wrg0Var) {
            this.a = zu90Var;
            this.b = wrg0Var;
        }

        @Override // defpackage.zu90
        public final void onError(Throwable th) {
            if (this.c) {
                o760.b(th);
            } else {
                this.a.onError(th);
            }
        }

        @Override // defpackage.zu90
        public final void onSubscribe(pse pseVar) {
            zu90<? super T> zu90Var = this.a;
            try {
                this.b.accept(pseVar);
                zu90Var.onSubscribe(pseVar);
            } catch (Throwable th) {
                qtg.a(th);
                this.c = true;
                pseVar.dispose();
                zu90Var.onSubscribe(f2g.a);
                zu90Var.onError(th);
            }
        }

        @Override // defpackage.zu90
        public final void onSuccess(T t) {
            if (this.c) {
                return;
            }
            this.a.onSuccess(t);
        }
    }

    public eu90(cu90 cu90Var, wrg0 wrg0Var) {
        this.a = cu90Var;
        this.b = wrg0Var;
    }

    @Override // defpackage.ct90
    public final void c(zu90<? super T> zu90Var) {
        this.a.a(new a(zu90Var, this.b));
    }
}
