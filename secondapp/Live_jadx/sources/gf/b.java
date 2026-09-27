package gf;

import af.n;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import re.d4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f86453a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f86454b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f86455c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f86456d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f86457e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f86458f = 5;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void a(int i10, int i11, n nVar) throws IOException;

    void endMasterElement(int i10) throws d4;

    void floatElement(int i10, double d10) throws d4;

    int getElementType(int i10);

    void integerElement(int i10, long j10) throws d4;

    boolean isLevel1Element(int i10);

    void startMasterElement(int i10, long j10, long j11) throws d4;

    void stringElement(int i10, String str) throws d4;
}
