package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class kdy<T> extends ucy<T> {
    public final T[] a;

    public static final class a<T> extends ha2<T> {
        public final kfy<? super T> a;
        public final T[] b;
        public int c;
        public boolean d;
        public volatile boolean e;

        public a(kfy<? super T> kfyVar, T[] tArr) {
            this.a = kfyVar;
            this.b = tArr;
        }

        @Override // defpackage.mb30
        public final int b(int i) {
            this.d = true;
            return 1;
        }

        @Override // defpackage.lk90
        public final void clear() {
            this.c = this.b.length;
        }

        @Override // defpackage.pse
        public final void dispose() {
            this.e = true;
        }

        @Override // defpackage.pse
        public final boolean isDisposed() {
            return this.e;
        }

        @Override // defpackage.lk90
        public final boolean isEmpty() {
            return this.c == this.b.length;
        }

        @Override // defpackage.lk90
        public final T poll() {
            int i = this.c;
            T[] tArr = this.b;
            if (i == tArr.length) {
                return null;
            }
            this.c = i + 1;
            T t = tArr[i];
            yby.b(t, "The array element is null");
            return t;
        }
    }

    public kdy(T[] tArr) {
        this.a = tArr;
    }

    @Override // defpackage.ucy
    public final void g(kfy<? super T> kfyVar) {
        T[] tArr = this.a;
        a aVar = new a(kfyVar, tArr);
        kfyVar.onSubscribe(aVar);
        if (aVar.d) {
            return;
        }
        int length = tArr.length;
        for (int i = 0; i < length && !aVar.e; i++) {
            T t = tArr[i];
            kfy<? super T> kfyVar2 = aVar.a;
            if (t == null) {
                kfyVar2.onError(new NullPointerException(pe4.b(i, "The element at index ", " is null")));
                return;
            }
            kfyVar2.onNext(t);
        }
        if (aVar.e) {
            return;
        }
        aVar.a.onComplete();
    }
}
