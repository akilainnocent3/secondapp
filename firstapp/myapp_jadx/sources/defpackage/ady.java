package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ady<T, K> extends j4<T, T> {
    public final taj.h b;
    public final yby.a c;

    public static final class a<T, K> extends j92<T, T> {
        public final faj<? super T, K> f;
        public final l54<? super K, ? super K> i;
        public K v;
        public boolean w;

        public a(kfy kfyVar, taj.h hVar, yby.a aVar) {
            super(kfyVar);
            this.f = hVar;
            this.i = aVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.kfy
        public final void onNext(T t) {
            if (this.d) {
                return;
            }
            int i = this.e;
            kfy<? super R> kfyVar = this.a;
            if (i != 0) {
                kfyVar.onNext((Object) t);
                return;
            }
            try {
                K kApply = this.f.apply(t);
                if (this.w) {
                    l54<? super K, ? super K> l54Var = this.i;
                    K k = this.v;
                    ((yby.a) l54Var).getClass();
                    boolean zA = yby.a(k, kApply);
                    this.v = kApply;
                    if (zA) {
                        return;
                    }
                } else {
                    this.w = true;
                    this.v = kApply;
                }
                kfyVar.onNext((Object) t);
            } catch (Throwable th) {
                qtg.a(th);
                this.b.dispose();
                onError(th);
            }
        }

        @Override // defpackage.lk90
        public final T poll() {
            while (true) {
                T tPoll = this.c.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f.apply(tPoll);
                if (!this.w) {
                    this.w = true;
                    this.v = kApply;
                    return tPoll;
                }
                K k = this.v;
                ((yby.a) this.i).getClass();
                if (!yby.a(k, kApply)) {
                    this.v = kApply;
                    return tPoll;
                }
                this.v = kApply;
            }
        }
    }

    public ady(eey eeyVar) {
        super(eeyVar);
        this.b = taj.a;
        this.c = yby.a;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        this.a.a(new a(kfyVar, this.b, this.c));
    }
}
