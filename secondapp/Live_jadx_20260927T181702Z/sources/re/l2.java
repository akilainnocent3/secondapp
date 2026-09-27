package re;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class l2 extends RuntimeException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f125966c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f125967d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f125968e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f125969f = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f125970b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public l2(int i10) {
        super(a(i10));
        this.f125970b = i10;
    }

    public static String a(int i10) {
        if (i10 == 1) {
            return "Player release timed out.";
        }
        if (i10 != 2) {
            return i10 != 3 ? "Undefined timeout." : "Detaching surface timed out.";
        }
        return "Setting foreground mode timed out.";
    }
}
