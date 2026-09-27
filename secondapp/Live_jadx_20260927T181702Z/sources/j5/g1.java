package j5;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class g1 extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f99603c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f99604d = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99605b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public g1(int i10) {
        this.f99605b = i10;
    }

    public g1(int i10, Exception exc) {
        super(exc);
        this.f99605b = i10;
    }
}
