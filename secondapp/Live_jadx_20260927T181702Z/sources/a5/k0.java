package a5;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface k0 extends r {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @x4.m1
    public static final zi.m0<String> f3729r = new zi.m0() { // from class: a5.i0
        @Override // zi.m0
        public final boolean apply(Object obj) {
            return j0.a((String) obj);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @x4.m1
    public static abstract class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f3730a = new g();

        @Override // a5.k0.c
        @qj.a
        public final c a(Map<String, String> map) {
            this.f3730a.b(map);
            return this;
        }

        public abstract k0 b(g gVar);

        @Override // a5.k0.c, a5.r.a
        public final k0 createDataSource() {
            return b(this.f3730a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends d {
        @x4.m1
        public b(IOException iOException, z zVar) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, zVar, 2007, 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c extends r.a {
        @x4.m1
        c a(Map<String, String> map);

        @Override // a5.r.a
        @x4.m1
        k0 createDataSource();

        @Override // a5.r.a
        @x4.m1
        /* bridge */ /* synthetic */ r createDataSource();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends w {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f3731f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f3732g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f3733h = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @x4.m1
        public final z f3734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f3735e;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        @x4.m1
        @Deprecated
        public d(z zVar, int i10) {
            this(zVar, 2000, i10);
        }

        public static int b(int i10, int i11) {
            if (i10 == 2000 && i11 == 1) {
                return 2001;
            }
            return i10;
        }

        @x4.m1
        public static d c(IOException iOException, z zVar, int i10) {
            int i11;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i11 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i11 = 1004;
            } else {
                i11 = (message == null || !zi.c.g(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            return i11 == 2007 ? new b(iOException, zVar) : new d(iOException, zVar, i11, i10);
        }

        @x4.m1
        public d(z zVar, int i10, int i11) {
            super(b(i10, i11));
            this.f3734d = zVar;
            this.f3735e = i11;
        }

        @x4.m1
        @Deprecated
        public d(String str, z zVar, int i10) {
            this(str, zVar, 2000, i10);
        }

        @x4.m1
        public d(String str, z zVar, int i10, int i11) {
            super(str, b(i10, i11));
            this.f3734d = zVar;
            this.f3735e = i11;
        }

        @x4.m1
        @Deprecated
        public d(IOException iOException, z zVar, int i10) {
            this(iOException, zVar, 2000, i10);
        }

        @x4.m1
        public d(IOException iOException, z zVar, int i10, int i11) {
            super(iOException, b(i10, i11));
            this.f3734d = zVar;
            this.f3735e = i11;
        }

        @x4.m1
        @Deprecated
        public d(String str, IOException iOException, z zVar, int i10) {
            this(str, iOException, zVar, 2000, i10);
        }

        @x4.m1
        public d(String str, @Nullable IOException iOException, z zVar, int i10, int i11) {
            super(str, iOException, b(i10, i11));
            this.f3734d = zVar;
            this.f3735e = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f3736i;

        @x4.m1
        public e(String str, z zVar) {
            super("Invalid content type: " + str, zVar, 2003, 1);
            this.f3736i = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f extends d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f3737i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final String f3738j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @x4.m1
        public final Map<String, List<String>> f3739k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final byte[] f3740l;

        @x4.m1
        public f(int i10, @Nullable String str, @Nullable IOException iOException, Map<String, List<String>> map, z zVar, byte[] bArr) {
            super("Response code: " + i10, iOException, zVar, 2004, 1);
            this.f3737i = i10;
            this.f3738j = str;
            this.f3739k = map;
            this.f3740l = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @x4.m1
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, String> f3741a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Map<String, String> f3742b;

        public synchronized void a() {
            this.f3742b = null;
            this.f3741a.clear();
        }

        public synchronized void b(Map<String, String> map) {
            this.f3742b = null;
            this.f3741a.clear();
            this.f3741a.putAll(map);
        }

        public synchronized Map<String, String> c() {
            try {
                if (this.f3742b == null) {
                    this.f3742b = Collections.unmodifiableMap(new HashMap(this.f3741a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f3742b;
        }

        public synchronized void d(String str) {
            this.f3742b = null;
            this.f3741a.remove(str);
        }

        public synchronized void e(String str, String str2) {
            this.f3742b = null;
            this.f3741a.put(str, str2);
        }

        public synchronized void f(Map<String, String> map) {
            this.f3742b = null;
            this.f3741a.putAll(map);
        }
    }

    @x4.m1
    void clearAllRequestProperties();

    @x4.m1
    void clearRequestProperty(String str);

    @Override // a5.r
    @x4.m1
    void close() throws d;

    @x4.m1
    int getResponseCode();

    @Override // a5.r
    @x4.m1
    Map<String, List<String>> getResponseHeaders();

    @Override // a5.r
    @x4.m1
    long open(z zVar) throws d;

    @Override // u4.c0
    @x4.m1
    int read(byte[] bArr, int i10, int i11) throws d;

    @x4.m1
    void setRequestProperty(String str, String str2);
}
