package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.os.PersistableBundle;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import se.b2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f48384a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f48385b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48386c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f48387d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f48388e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f48389f = 3;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f48390a;

        public a(j jVar) {
            this.f48390a = jVar;
        }

        @Override // com.google.android.exoplayer2.drm.j.g
        public j a(UUID uuid) {
            this.f48390a.a();
            return this.f48390a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f48391d = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f48392e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f48393f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f48394g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f48395h = 3;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f48396i = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f48397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f48398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48399c;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public b(byte[] bArr, String str) {
            this(bArr, str, Integer.MIN_VALUE);
        }

        public byte[] a() {
            return this.f48397a;
        }

        public String b() {
            return this.f48398b;
        }

        public int c() {
            return this.f48399c;
        }

        public b(byte[] bArr, String str, int i10) {
            this.f48397a = bArr;
            this.f48398b = str;
            this.f48399c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f48401b;

        public c(int i10, byte[] bArr) {
            this.f48400a = i10;
            this.f48401b = bArr;
        }

        public byte[] a() {
            return this.f48401b;
        }

        public int b() {
            return this.f48400a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void a(j jVar, @Nullable byte[] bArr, int i10, int i11, @Nullable byte[] bArr2);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {
        void a(j jVar, byte[] bArr, long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f {
        void a(j jVar, byte[] bArr, List<c> list, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g {
        j a(UUID uuid);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f48402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f48403b;

        public h(byte[] bArr, String str) {
            this.f48402a = bArr;
            this.f48403b = str;
        }

        public byte[] a() {
            return this.f48402a;
        }

        public String b() {
            return this.f48403b;
        }
    }

    void a();

    @Nullable
    PersistableBundle b();

    int c();

    void closeSession(byte[] bArr);

    ye.c d(byte[] bArr) throws MediaCryptoException;

    boolean e(byte[] bArr, String str);

    b f(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i10, @Nullable HashMap<String, String> map) throws NotProvisionedException;

    void g(@Nullable d dVar);

    byte[] getPropertyByteArray(String str);

    String getPropertyString(String str);

    h getProvisionRequest();

    void h(@Nullable f fVar);

    void i(@Nullable e eVar);

    void j(byte[] bArr, b2 b2Var);

    byte[] openSession() throws MediaDrmException;

    @Nullable
    byte[] provideKeyResponse(byte[] bArr, byte[] bArr2) throws DeniedByServerException, NotProvisionedException;

    void provideProvisionResponse(byte[] bArr) throws DeniedByServerException;

    Map<String, String> queryKeyStatus(byte[] bArr);

    void release();

    void restoreKeys(byte[] bArr, byte[] bArr2);

    void setPropertyByteArray(String str, byte[] bArr);

    void setPropertyString(String str, String str2);
}
