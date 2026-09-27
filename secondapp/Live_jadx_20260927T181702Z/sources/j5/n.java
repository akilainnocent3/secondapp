package j5;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.UUID;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f99663a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f99664b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f99665c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f99666d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f99667e = 4;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f99668b;

        public a(Throwable th2, int i10) {
            super(th2);
            this.f99668b = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    boolean a();

    @Nullable
    c5.b b();

    UUID c();

    boolean d(String str);

    void e(@Nullable v.a aVar);

    void f(@Nullable v.a aVar);

    @Nullable
    a getError();

    @Nullable
    byte[] getOfflineLicenseKeySetId();

    int getState();

    @Nullable
    Map<String, String> queryKeyStatus();
}
