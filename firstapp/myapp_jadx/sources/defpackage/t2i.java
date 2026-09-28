package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class t2i<T> extends e3<T, T> {
    public final ib c;

    public static final class a<T> extends m92<T> implements foa<T> {
        public final foa<? super T> a;
        public final ib b;
        public bee0 c;
        public nb30<T> d;

        public a(foa<? super T> foaVar, ib ibVar) {
            this.a = foaVar;
            this.b = ibVar;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            if (gee0.f(this.c, bee0Var)) {
                this.c = bee0Var;
                if (bee0Var instanceof nb30) {
                    this.d = (nb30) bee0Var;
                }
                this.a.a(this);
            }
        }

        @Override // defpackage.mb30
        public final int b(int i) {
            return 0;
        }

        public final void c() {
            if (compareAndSet(0, 1)) {
                try {
                    this.b.run();
                } catch (Throwable th) {
                    qtg.a(th);
                    o760.b(th);
                }
            }
        }

        @Override // defpackage.bee0
        public final void cancel() {
            this.c.cancel();
            c();
        }

        @Override // defpackage.lk90
        public final void clear() {
            this.d.clear();
        }

        @Override // defpackage.foa
        public final boolean d(T t) {
            return this.a.d(t);
        }

        @Override // defpackage.lk90
        public final boolean isEmpty() {
            return this.d.isEmpty();
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            this.a.onComplete();
            c();
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            this.a.onError(th);
            c();
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // defpackage.lk90
        public final T poll() {
            return this.d.poll();
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            this.c.request(j);
        }
    }

    public static final class b<T> extends m92<T> implements n3i<T> {
        public final zde0<? super T> a;
        public final ib b;
        public bee0 c;
        public nb30<T> d;

        public b(zde0<? super T> zde0Var, ib ibVar) {
            this.a = zde0Var;
            this.b = ibVar;
        }

        @Override // defpackage.zde0
        public final void a(bee0 bee0Var) {
            if (gee0.f(this.c, bee0Var)) {
                this.c = bee0Var;
                if (bee0Var instanceof nb30) {
                    this.d = (nb30) bee0Var;
                }
                this.a.a(this);
            }
        }

        @Override // defpackage.mb30
        public final int b(int i) {
            return 0;
        }

        public final void c() {
            if (compareAndSet(0, 1)) {
                try {
                    this.b.run();
                } catch (Throwable th) {
                    qtg.a(th);
                    o760.b(th);
                }
            }
        }

        @Override // defpackage.bee0
        public final void cancel() {
            this.c.cancel();
            c();
        }

        @Override // defpackage.lk90
        public final void clear() {
            this.d.clear();
        }

        @Override // defpackage.lk90
        public final boolean isEmpty() {
            return this.d.isEmpty();
        }

        @Override // defpackage.zde0
        public final void onComplete() {
            this.a.onComplete();
            c();
        }

        @Override // defpackage.zde0
        public final void onError(Throwable th) {
            this.a.onError(th);
            c();
        }

        @Override // defpackage.zde0
        public final void onNext(T t) {
            this.a.onNext(t);
        }

        @Override // defpackage.lk90
        public final T poll() {
            return this.d.poll();
        }

        @Override // defpackage.bee0
        public final void request(long j) {
            this.c.request(j);
        }
    }

    public t2i(r2i<T> r2iVar, ib ibVar) {
        super(r2iVar);
        this.c = ibVar;
    }

    @Override // defpackage.r2i
    public final void i(zde0<? super T> zde0Var) {
        boolean z = zde0Var instanceof foa;
        ib ibVar = this.c;
        r2i<T> r2iVar = this.b;
        if (z) {
            r2iVar.h(new a((foa) zde0Var, ibVar));
        } else {
            r2iVar.h(new b(zde0Var, ibVar));
        }
    }
}
