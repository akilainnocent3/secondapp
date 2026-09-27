package kotlin;

import cs.j;
import dr.l1;
import dr.o;
import dr.q;
import er.b;
import er.e;
import er.f;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Classes with same name are omitted, all sources:
  assets/audience_network/classes2.dex
  classes8.dex
 */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@e(er.a.RUNTIME)
@Target({ElementType.TYPE})
@l1(version = "1.3")
@Retention(RetentionPolicy.RUNTIME)
@f(allowedTargets = {b.CLASS})
public @interface Metadata {
    @j(name = "bv")
    int[] bv() default {1, 0, 3};

    @j(name = "d1")
    String[] d1() default {};

    @j(name = "d2")
    String[] d2() default {};

    @j(name = "k")
    int k() default 1;

    @j(name = "mv")
    int[] mv() default {};

    @j(name = "pn")
    String pn() default "";

    @j(name = "xi")
    int xi() default 0;

    @j(name = "xs")
    String xs() default "";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        @o(level = q.WARNING, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        public static /* synthetic */ void a() {
        }

        @l1(version = "1.2")
        public static /* synthetic */ void b() {
        }

        @l1(version = "1.1")
        public static /* synthetic */ void c() {
        }
    }
}
