package y5;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import u4.a5;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public interface c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f146199a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f146200b = 10000;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    int g(androidx.media3.common.a aVar);

    androidx.media3.common.a getFormat(int i10);

    int getIndexInTrackGroup(int i10);

    a5 getTrackGroup();

    int getType();

    int indexOf(int i10);

    int length();
}
