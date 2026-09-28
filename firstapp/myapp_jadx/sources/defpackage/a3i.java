package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class a3i<T, U> extends e3<T, U> {
    public final itu c;

    public static final class a<T, U> extends i92<T, U> {
        public final faj<? super T, ? extends U> e;

        public a(foa foaVar, itu ituVar) {
            super(foaVar);
            this.e = ituVar;
        }

        @Override // defpackage.mb30
        public final int b(int i) {
            return 0;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.foa
        public final boolean d(T t) {
            if (this.d) {
                return false;
            }
            try {
                U uApply = this.e.apply(t);
                yby.b(uApply, "The mapper function returned a null value.");
                return this.a.d((Object) uApply);
            } catch (Throwable th) {
                c(th);
                return true;
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.zde0
        public final void onNext(T t) {
            if (this.d) {
                return;
            }
            try {
                U uApply = this.e.apply(t);
                yby.b(uApply, "The mapper function returned a null value.");
                this.a.onNext((Object) uApply);
            } catch (Throwable th) {
                c(th);
            }
        }

        @Override // defpackage.lk90
        public final U poll() {
            T tPoll = this.c.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.e.apply(tPoll);
            yby.b(uApply, "The mapper function returned a null value.");
            return uApply;
        }
    }

    public static final class b<T, U> extends k92<T, U> {
        public final faj<? super T, ? extends U> e;

        public b(zde0 zde0Var, itu ituVar) {
            super(zde0Var);
            this.e = ituVar;
        }

        @Override // defpackage.mb30
        public final int b(int i) {
            return 0;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.zde0
        public final void onNext(T t) {
            if (this.d) {
                return;
            }
            try {
                U uApply = this.e.apply(t);
                yby.b(uApply, "The mapper function returned a null value.");
                this.a.onNext((Object) uApply);
            } catch (Throwable th) {
                qtg.a(th);
                this.b.cancel();
                onError(th);
            }
        }

        @Override // defpackage.lk90
        public final U poll() {
            T tPoll = this.c.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.e.apply(tPoll);
            yby.b(uApply, "The mapper function returned a null value.");
            return uApply;
        }
    }

    public a3i(b3i b3iVar, itu ituVar) {
        super(b3iVar);
        this.c = ituVar;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super U> zde0Var) {
        boolean z = zde0Var instanceof foa;
        itu ituVar = this.c;
        r2i<T> r2iVar = this.b;
        if (z) {
            r2iVar.h(new a((foa) zde0Var, ituVar));
        } else {
            r2iVar.h(new b(zde0Var, ituVar));
        }
    }
}
