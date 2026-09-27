package ms;

import java.lang.Comparable;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface g<T extends Comparable<? super T>> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@oy.l g<T> gVar, @oy.l T value) {
            m0.p(value, "value");
            return value.compareTo(gVar.m()) >= 0 && value.compareTo(gVar.d()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@oy.l g<T> gVar) {
            return gVar.m().compareTo(gVar.d()) > 0;
        }
    }

    boolean a(@oy.l T t10);

    @oy.l
    T d();

    boolean isEmpty();

    @oy.l
    T m();
}
