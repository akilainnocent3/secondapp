package f0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@cs.j(name = "ArrayMapKt")
public final class b {
    @oy.l
    public static final <K, V> a<K, V> a() {
        return new a<>();
    }

    @oy.l
    public static final <K, V> a<K, V> b(@oy.l dr.z0<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.m0.p(pairs, "pairs");
        a<K, V> aVar = new a<>(pairs.length);
        for (dr.z0<? extends K, ? extends V> z0Var : pairs) {
            aVar.put(z0Var.j(), z0Var.k());
        }
        return aVar;
    }
}
