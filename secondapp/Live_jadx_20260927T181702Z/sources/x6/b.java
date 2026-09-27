package x6;

import f6.v;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import u4.p1;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f144554a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f144555b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f144556c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f144557d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f144558e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f144559f = 5;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void a(int i10, int i11, v vVar) throws IOException;

    void endMasterElement(int i10) throws p1;

    void floatElement(int i10, double d10) throws p1;

    int getElementType(int i10);

    void integerElement(int i10, long j10) throws p1;

    boolean isLevel1Element(int i10);

    void startMasterElement(int i10, long j10, long j11) throws p1;

    void stringElement(int i10, String str) throws p1;
}
