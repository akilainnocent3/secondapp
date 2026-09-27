package xs;

import fr.a0;
import fr.r0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s1;
import zu.k0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,123:1\n1726#2,3:124\n1360#2:129\n1446#2,5:130\n1229#3,2:127\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n*L\n105#1:124,3\n112#1:129\n112#1:130,5\n107#1:127,2\n*E\n"})
public final class k implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final List<g> f145584b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends o0 implements ds.l<g, c> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ wt.c f145585g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wt.c cVar) {
            super(1);
            this.f145585g = cVar;
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(@oy.l g it) {
            m0.p(it, "it");
            return it.c(this.f145585g);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends o0 implements ds.l<g, zu.m<? extends c>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f145586g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zu.m<c> invoke(@oy.l g it) {
            m0.p(it, "it");
            return r0.E1(it);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@oy.l List<? extends g> delegates) {
        m0.p(delegates, "delegates");
        this.f145584b = delegates;
    }

    @Override // xs.g
    public boolean I(@oy.l wt.c fqName) {
        m0.p(fqName, "fqName");
        Iterator it = r0.E1(this.f145584b).iterator();
        while (it.hasNext()) {
            if (((g) it.next()).I(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // xs.g
    @oy.m
    public c c(@oy.l wt.c fqName) {
        m0.p(fqName, "fqName");
        return (c) k0.i1(k0.S1(r0.E1(this.f145584b), new a(fqName)));
    }

    @Override // xs.g
    public boolean isEmpty() {
        List<g> list = this.f145584b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @oy.l
    public Iterator<c> iterator() {
        return k0.k1(r0.E1(this.f145584b), b.f145586g).iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@oy.l g... delegates) {
        this((List<? extends g>) a0.Uy(delegates));
        m0.p(delegates, "delegates");
    }
}
