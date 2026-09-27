package ms;

import dr.a3;
import dr.l1;
import java.lang.Comparable;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.9")
@a3(markerClass = {dr.v.class})
public interface r<T extends Comparable<? super T>> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@oy.l r<T> rVar, @oy.l T value) {
            m0.p(value, "value");
            return value.compareTo(rVar.m()) >= 0 && value.compareTo(rVar.e()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean b(@oy.l r<T> rVar) {
            return rVar.m().compareTo(rVar.e()) >= 0;
        }
    }

    boolean a(@oy.l T t10);

    @oy.l
    T e();

    boolean isEmpty();

    @oy.l
    T m();
}
