package ms;

import dr.l1;
import java.lang.Comparable;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@l1(version = "1.1")
public interface f<T extends Comparable<? super T>> extends g<T> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static <T extends Comparable<? super T>> boolean a(@oy.l f<T> fVar, @oy.l T value) {
            m0.p(value, "value");
            return fVar.b(fVar.m(), value) && fVar.b(value, fVar.d());
        }

        public static <T extends Comparable<? super T>> boolean b(@oy.l f<T> fVar) {
            return !fVar.b(fVar.m(), fVar.d());
        }
    }

    @Override // ms.g
    boolean a(@oy.l T t10);

    boolean b(@oy.l T t10, @oy.l T t11);

    @Override // ms.g
    boolean isEmpty();
}
