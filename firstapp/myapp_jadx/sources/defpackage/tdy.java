package defpackage;

import androidx.work.impl.eLa.LhMGMAwwhzjwfz;

/* JADX INFO: loaded from: classes8.dex */
public final class tdy<T, U> extends j4<T, U> {
    public final faj<? super T, ? extends U> b;

    public static final class a<T, U> extends j92<T, U> {
        public final faj<? super T, ? extends U> f;

        public a(kfy<? super U> kfyVar, faj<? super T, ? extends U> fajVar) {
            super(kfyVar);
            this.f = fajVar;
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
                kfyVar.onNext(null);
                return;
            }
            try {
                U uApply = this.f.apply(t);
                yby.b(uApply, "The mapper function returned a null value.");
                kfyVar.onNext((Object) uApply);
            } catch (Throwable th) {
                qtg.a(th);
                this.b.dispose();
                onError(th);
            }
        }

        @Override // defpackage.lk90
        public final U poll() {
            T tPoll = this.c.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f.apply(tPoll);
            yby.b(uApply, LhMGMAwwhzjwfz.UCQ);
            return uApply;
        }
    }

    public tdy(ucy ucyVar, faj fajVar) {
        super(ucyVar);
        this.b = fajVar;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super U> kfyVar) {
        this.a.a(new a(kfyVar, this.b));
    }
}
