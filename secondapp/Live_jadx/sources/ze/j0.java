package ze;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j0 extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f161007c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f161008d = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f161009b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public j0(int i10) {
        this.f161009b = i10;
    }

    public j0(int i10, Exception exc) {
        super(exc);
        this.f161009b = i10;
    }
}
