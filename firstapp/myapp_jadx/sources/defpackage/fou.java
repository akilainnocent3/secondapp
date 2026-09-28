package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fou<K, V> {
    public final a<K, V> a;

    public static class a<K, V> {
        public final kgj0 a;
        public final kgj0 b;
        public final V c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kgj0 kgj0Var, kgj0 kgj0Var2, Object obj) {
            this.a = kgj0Var;
            this.b = kgj0Var2;
            this.c = obj;
        }
    }

    public fou(kgj0 kgj0Var, kgj0 kgj0Var2, ho20 ho20Var) {
        this.a = new a<>(kgj0Var, kgj0Var2, ho20Var);
    }

    public static <K, V> int a(a<K, V> aVar, K k, V v) {
        return mjh.b(aVar.b, 2, v) + mjh.b(aVar.a, 1, k);
    }

    public static <K, V> void b(q08 q08Var, a<K, V> aVar, K k, V v) {
        mjh.k(q08Var, aVar.a, 1, k);
        mjh.k(q08Var, aVar.b, 2, v);
    }
}
