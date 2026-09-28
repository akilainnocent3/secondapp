package defpackage;

import android.text.TextUtils;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class h2z<T> {
    public static final a e = new a();
    public final T a;
    public final b<T> b;
    public final String c;
    public volatile byte[] d;

    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public h2z(String str, T t, b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            hb5.a("Must not be null or empty");
            throw null;
        }
        this.c = str;
        this.a = t;
        this.b = bVar;
    }

    public static h2z a(Object obj, String str) {
        return new h2z(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h2z) {
            return this.c.equals(((h2z) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return uf80.a(new StringBuilder("Option{key='"), this.c, "'}");
    }

    public class a implements b<Object> {
        @Override // h2z.b
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
