package yg;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import re.n2;
import zf.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f159514a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f159515b = 10000;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    n2 getFormat(int i10);

    int getIndexInTrackGroup(int i10);

    s1 getTrackGroup();

    int getType();

    int h(n2 n2Var);

    int indexOf(int i10);

    int length();
}
