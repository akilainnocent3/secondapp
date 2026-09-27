package com.google.android.exoplayer2.drm;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f48366a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f48367b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48368c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f48369d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f48370e = 4;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f48371b;

        public a(Throwable th2, int i10) {
            super(th2);
            this.f48371b = i10;
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
    ye.c b();

    UUID c();

    boolean d(String str);

    void e(@Nullable e.a aVar);

    void f(@Nullable e.a aVar);

    @Nullable
    a getError();

    @Nullable
    byte[] getOfflineLicenseKeySetId();

    int getState();

    @Nullable
    Map<String, String> queryKeyStatus();
}
