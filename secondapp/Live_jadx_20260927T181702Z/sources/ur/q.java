package ur;

import dr.l1;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.jvm.internal.o1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.SOURCE)
@er.e(er.a.SOURCE)
@er.d
@l1(version = "1.2")
@Repeatable(a.class)
@er.f(allowedTargets = {er.b.CLASS, er.b.FUNCTION, er.b.PROPERTY, er.b.CONSTRUCTOR, er.b.TYPEALIAS})
public @interface q {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @er.e(er.a.SOURCE)
    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @o1
    @Retention(RetentionPolicy.SOURCE)
    @er.f(allowedTargets = {er.b.CLASS, er.b.FUNCTION, er.b.PROPERTY, er.b.CONSTRUCTOR, er.b.TYPEALIAS})
    public @interface a {
        q[] value();
    }

    int errorCode() default -1;

    dr.q level() default dr.q.ERROR;

    String message() default "";

    String version();

    r versionKind() default r.LANGUAGE_VERSION;
}
