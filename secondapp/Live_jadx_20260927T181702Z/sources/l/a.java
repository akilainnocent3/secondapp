package l;

import dr.g1;
import dr.o;
import er.e;
import er.f;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@e(er.a.BINARY)
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
@o(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @g1(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@f(allowedTargets = {er.b.ANNOTATION_CLASS})
public @interface a {

    /* JADX INFO: renamed from: l.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum EnumC0980a {
        WARNING,
        ERROR;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ sr.a f103221e = sr.c.c(d());

        @l
        public static sr.a<EnumC0980a> g() {
            return f103221e;
        }
    }

    EnumC0980a level() default EnumC0980a.ERROR;
}
