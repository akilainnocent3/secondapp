package d5;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class m3 extends RuntimeException {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f77933c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f77934d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f77935e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f77936f = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77937b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public m3(int i10) {
        super(a(i10));
        this.f77937b = i10;
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
