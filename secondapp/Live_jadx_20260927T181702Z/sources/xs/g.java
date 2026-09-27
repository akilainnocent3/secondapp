package xs;

import fr.h0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface g extends Iterable<c>, es.a {

    /* JADX INFO: renamed from: vb, reason: collision with root package name */
    @oy.l
    public static final a f145575vb = a.f145576a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f145576a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final g f145577b = new C1531a();

        /* JADX INFO: renamed from: xs.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C1531a implements g {
            @Override // xs.g
            public boolean I(@oy.l wt.c cVar) {
                return b.b(this, cVar);
            }

            @oy.m
            public Void a(@oy.l wt.c fqName) {
                m0.p(fqName, "fqName");
                return null;
            }

            @Override // xs.g
            public /* bridge */ /* synthetic */ c c(wt.c cVar) {
                return (c) a(cVar);
            }

            @Override // xs.g
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            @oy.l
            public Iterator<c> iterator() {
                return h0.J().iterator();
            }

            @oy.l
            public String toString() {
                return "EMPTY";
            }
        }

        @oy.l
        public final g a(@oy.l List<? extends c> annotations) {
            m0.p(annotations, "annotations");
            return annotations.isEmpty() ? f145577b : new h(annotations);
        }

        @oy.l
        public final g b() {
            return f145577b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/Annotations$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n288#2,2:124\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/Annotations$DefaultImpls\n*L\n29#1:124,2\n*E\n"})
    public static final class b {
        @oy.m
        public static c a(@oy.l g gVar, @oy.l wt.c fqName) {
            c next;
            m0.p(fqName, "fqName");
            Iterator<c> it = gVar.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (m0.g(next.d(), fqName)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public static boolean b(@oy.l g gVar, @oy.l wt.c fqName) {
            m0.p(fqName, "fqName");
            return gVar.c(fqName) != null;
        }
    }

    boolean I(@oy.l wt.c cVar);

    @oy.m
    c c(@oy.l wt.c cVar);

    boolean isEmpty();
}
