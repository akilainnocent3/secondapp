package a9;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@er.e(er.a.BINARY)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
@er.f(allowedTargets = {er.b.FIELD, er.b.FUNCTION})
public @interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final b f4162a = b.f4176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final String f4163b = "[field-name]";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4164c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f4165d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f4166e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f4167f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f4168g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f4169h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f4170i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f4171j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f4172k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f4173l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f4174m = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @oy.l
    public static final String f4175n = "[value-unspecified]";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @er.e(er.a.BINARY)
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f4176a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static final String f4177b = "[field-name]";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f4178c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f4179d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f4180e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f4181f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f4182g = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f4183h = 1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f4184i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f4185j = 3;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f4186k = 4;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f4187l = 5;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final int f4188m = 6;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @oy.l
        public static final String f4189n = "[value-unspecified]";
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @er.e(er.a.BINARY)
    @Retention(RetentionPolicy.CLASS)
    public @interface c {
    }

    @a
    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    @c
    int typeAffinity() default 1;
}
