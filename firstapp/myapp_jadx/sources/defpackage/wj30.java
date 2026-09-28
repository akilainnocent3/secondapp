package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wj30 {
    public static final vj30 b = new vj30(true, null, null);
    public static final wj30 c = new wj30();
    public final auw<vj30> a = new auw<>(b);

    public static class a<T> implements tcy.a<T> {
        public final qya<T> a;

        public a(qya<T> qyaVar) {
            this.a = qyaVar;
        }

        @Override // tcy.a
        public final void a(T t) {
            this.a.accept(t);
        }

        @Override // tcy.a
        public final void onError(Throwable th) {
            pgt.d("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
        }
    }
}
