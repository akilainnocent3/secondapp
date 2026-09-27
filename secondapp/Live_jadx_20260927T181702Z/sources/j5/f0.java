package j5;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import android.os.PersistableBundle;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import e5.k4;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public interface f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @m1
    public static final int f99543a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @m1
    public static final int f99544b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @m1
    public static final int f99545c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @m1
    public static final int f99546d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @m1
    public static final int f99547e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @m1
    public static final int f99548f = 3;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0 f99549a;

        public a(f0 f0Var) {
            this.f99549a = f0Var;
        }

        @Override // j5.f0.g
        public f0 a(UUID uuid) {
            this.f99549a.a();
            return this.f99549a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f99550d = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f99551e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f99552f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f99553g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f99554h = 3;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f99555i = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f99556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f99557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f99558c;

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
            return this.f99556a;
        }

        public String b() {
            return this.f99557b;
        }

        public int c() {
            return this.f99558c;
        }

        public b(byte[] bArr, String str, int i10) {
            this.f99556a = bArr;
            this.f99557b = str;
            this.f99558c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f99560b;

        public c(int i10, byte[] bArr) {
            this.f99559a = i10;
            this.f99560b = bArr;
        }

        public byte[] a() {
            return this.f99560b;
        }

        public int b() {
            return this.f99559a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void a(f0 f0Var, @Nullable byte[] bArr, int i10, int i11, @Nullable byte[] bArr2);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {
        void a(f0 f0Var, byte[] bArr, long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f {
        void a(f0 f0Var, byte[] bArr, List<c> list, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g {
        f0 a(UUID uuid);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f99561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f99562b;

        public h(byte[] bArr, String str) {
            this.f99561a = bArr;
            this.f99562b = str;
        }

        public byte[] a() {
            return this.f99561a;
        }

        public String b() {
            return this.f99562b;
        }
    }

    void a();

    @Nullable
    PersistableBundle b();

    int c();

    void closeSession(byte[] bArr);

    c5.b d(byte[] bArr) throws MediaCryptoException;

    boolean e(byte[] bArr, String str);

    b f(byte[] bArr, @Nullable List<DrmInitData.SchemeData> list, int i10, @Nullable HashMap<String, String> map) throws NotProvisionedException;

    List<byte[]> g();

    byte[] getPropertyByteArray(String str);

    String getPropertyString(String str);

    h getProvisionRequest();

    void h(byte[] bArr);

    void i(@Nullable f fVar);

    void j(byte[] bArr, k4 k4Var);

    void k(@Nullable d dVar);

    void l(@Nullable e eVar);

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
