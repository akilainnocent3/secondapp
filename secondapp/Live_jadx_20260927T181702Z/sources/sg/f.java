package sg;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f implements sg.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f135311d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f135312e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f135313f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f135314g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f135315h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f135316i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f135317j = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f135318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f135319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f135320c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public f(int i10, int i11, int i12) {
        this.f135318a = i10;
        this.f135319b = i11;
        this.f135320c = i12;
    }
}
