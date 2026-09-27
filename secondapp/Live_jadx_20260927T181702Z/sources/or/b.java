package or;

import dr.l1;
import dr.v;
import kotlin.jvm.internal.m0;
import or.j.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@v
@l1(version = "1.3")
public abstract class b<B extends j.b, E extends B> implements j.c<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final ds.l<j.b, E> f119523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final j.c<?> f119524c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [or.j$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [ds.l<? super or.j$b, ? extends E extends B>, ds.l<or.j$b, E extends B>, java.lang.Object] */
    public b(@oy.l j.c<B> baseKey, @oy.l ds.l<? super j.b, ? extends E> safeCast) {
        m0.p(baseKey, "baseKey");
        m0.p(safeCast, "safeCast");
        this.f119523b = safeCast;
        this.f119524c = baseKey instanceof b ? (j.c<B>) ((b) baseKey).f119524c : baseKey;
    }

    public final boolean a(@oy.l j.c<?> key) {
        m0.p(key, "key");
        return key == this || this.f119524c == key;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lor/j$b;)TE; */
    @oy.m
    public final j.b b(@oy.l j.b element) {
        m0.p(element, "element");
        return (j.b) this.f119523b.invoke(element);
    }
}
