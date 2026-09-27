package bw;

import fr.h0;
import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface f {
    boolean b();

    @zv.g
    int c(@oy.l String str);

    @oy.l
    @zv.g
    f d(int i10);

    int e();

    @oy.l
    @zv.g
    String f(int i10);

    @oy.l
    @zv.g
    List<Annotation> g(int i10);

    @oy.l
    List<Annotation> getAnnotations();

    @oy.l
    n getKind();

    @oy.l
    String h();

    @zv.g
    boolean i(int i10);

    boolean isInline();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        @oy.l
        public static List<Annotation> a(@oy.l f fVar) {
            return h0.J();
        }

        public static boolean f(@oy.l f fVar) {
            return false;
        }

        public static boolean g(@oy.l f fVar) {
            return false;
        }

        @zv.g
        public static /* synthetic */ void b() {
        }

        @zv.g
        public static /* synthetic */ void c() {
        }

        @zv.g
        public static /* synthetic */ void d() {
        }

        @zv.g
        public static /* synthetic */ void e() {
        }

        @zv.g
        public static /* synthetic */ void h() {
        }
    }
}
