package ah;

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
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface q0 extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi.m0<String> f5346a = new zi.m0() { // from class: ah.o0
        @Override // zi.m0
        public final boolean apply(Object obj) {
            return p0.a((String) obj);
        }
    };

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f5347a = new g();

        @Override // ah.q0.c
        @qj.a
        public final c a(Map<String, String> map) {
            this.f5347a.b(map);
            return this;
        }

        public abstract q0 b(g gVar);

        @Override // ah.q0.c, ah.v.a
        public final q0 createDataSource() {
            return b(this.f5347a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends d {
        public b(IOException iOException, d0 d0Var) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, d0Var, 2007, 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c extends v.a {
        c a(Map<String, String> map);

        @Override // ah.v.a
        q0 createDataSource();

        @Override // ah.v.a
        /* bridge */ /* synthetic */ v createDataSource();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends a0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f5348f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f5349g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f5350h = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d0 f5351d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5352e;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        @Deprecated
        public d(d0 d0Var, int i10) {
            this(d0Var, 2000, i10);
        }

        public static int b(int i10, int i11) {
            if (i10 == 2000 && i11 == 1) {
                return 2001;
            }
            return i10;
        }

        public static d c(IOException iOException, d0 d0Var, int i10) {
            int i11;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i11 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i11 = 1004;
            } else {
                i11 = (message == null || !zi.c.g(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            return i11 == 2007 ? new b(iOException, d0Var) : new d(iOException, d0Var, i11, i10);
        }

        public d(d0 d0Var, int i10, int i11) {
            super(b(i10, i11));
            this.f5351d = d0Var;
            this.f5352e = i11;
        }

        @Deprecated
        public d(String str, d0 d0Var, int i10) {
            this(str, d0Var, 2000, i10);
        }

        public d(String str, d0 d0Var, int i10, int i11) {
            super(str, b(i10, i11));
            this.f5351d = d0Var;
            this.f5352e = i11;
        }

        @Deprecated
        public d(IOException iOException, d0 d0Var, int i10) {
            this(iOException, d0Var, 2000, i10);
        }

        public d(IOException iOException, d0 d0Var, int i10, int i11) {
            super(iOException, b(i10, i11));
            this.f5351d = d0Var;
            this.f5352e = i11;
        }

        @Deprecated
        public d(String str, IOException iOException, d0 d0Var, int i10) {
            this(str, iOException, d0Var, 2000, i10);
        }

        public d(String str, @Nullable IOException iOException, d0 d0Var, int i10, int i11) {
            super(str, iOException, b(i10, i11));
            this.f5351d = d0Var;
            this.f5352e = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f5353i;

        public e(String str, d0 d0Var) {
            super("Invalid content type: " + str, d0Var, 2003, 1);
            this.f5353i = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f extends d {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f5354i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @Nullable
        public final String f5355j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Map<String, List<String>> f5356k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final byte[] f5357l;

        public f(int i10, @Nullable String str, @Nullable IOException iOException, Map<String, List<String>> map, d0 d0Var, byte[] bArr) {
            super("Response code: " + i10, iOException, d0Var, 2004, 1);
            this.f5354i = i10;
            this.f5355j = str;
            this.f5356k = map;
            this.f5357l = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, String> f5358a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Map<String, String> f5359b;

        public synchronized void a() {
            this.f5359b = null;
            this.f5358a.clear();
        }

        public synchronized void b(Map<String, String> map) {
            this.f5359b = null;
            this.f5358a.clear();
            this.f5358a.putAll(map);
        }

        public synchronized Map<String, String> c() {
            try {
                if (this.f5359b == null) {
                    this.f5359b = Collections.unmodifiableMap(new HashMap(this.f5358a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f5359b;
        }

        public synchronized void d(String str) {
            this.f5359b = null;
            this.f5358a.remove(str);
        }

        public synchronized void e(String str, String str2) {
            this.f5359b = null;
            this.f5358a.put(str, str2);
        }

        public synchronized void f(Map<String, String> map) {
            this.f5359b = null;
            this.f5358a.putAll(map);
        }
    }

    @Override // ah.v
    long a(d0 d0Var) throws d;

    void clearAllRequestProperties();

    void clearRequestProperty(String str);

    @Override // ah.v
    void close() throws d;

    int getResponseCode();

    @Override // ah.v
    Map<String, List<String>> getResponseHeaders();

    @Override // ah.r
    int read(byte[] bArr, int i10, int i11) throws d;

    void setRequestProperty(String str, String str2);
}
