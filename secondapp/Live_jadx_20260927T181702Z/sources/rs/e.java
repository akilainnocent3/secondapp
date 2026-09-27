package rs;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface e<M extends Member> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static <M extends Member> void a(@l e<? extends M> eVar, @l Object[] args) {
            m0.p(args, "args");
            if (g.a(eVar) == args.length) {
                return;
            }
            throw new IllegalArgumentException("Callable expects " + g.a(eVar) + " arguments, but " + args.length + " were provided.");
        }
    }

    @l
    List<Type> a();

    M b();

    @m
    Object call(@l Object[] objArr);

    @l
    Type getReturnType();
}
