package defpackage;

import com.google.android.gms.common.annotation.LjLk.llGRV;
import defpackage.d7g;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes4.dex */
public final class o6g<T_WRAPPER extends d7g<JcePrimitiveT>, JcePrimitiveT> {
    public static final o6g<d7g.a, Cipher> b = new o6g<>(new d7g.a());
    public static final o6g<d7g.e, Mac> c = new o6g<>(new d7g.e());
    public final d<JcePrimitiveT> a;

    public static class a<JcePrimitiveT> implements d<JcePrimitiveT> {
        public final d7g<JcePrimitiveT> a;

        public a(d7g<JcePrimitiveT> d7gVar) {
            this.a = d7gVar;
        }

        @Override // o6g.d
        public final JcePrimitiveT a(String str) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < 2; i2++) {
                Provider provider = Security.getProvider(strArr[i2]);
                if (provider != null) {
                    arrayList.add(provider);
                }
            }
            int size = arrayList.size();
            Exception exc = null;
            while (true) {
                d7g<JcePrimitiveT> d7gVar = this.a;
                if (i >= size) {
                    return d7gVar.a(str, null);
                }
                Object obj = arrayList.get(i);
                i++;
                try {
                    return d7gVar.a(str, (Provider) obj);
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    }
                }
            }
        }
    }

    public static class b<JcePrimitiveT> implements d<JcePrimitiveT> {
        public final d7g<JcePrimitiveT> a;

        public b(d7g<JcePrimitiveT> d7gVar) {
            this.a = d7gVar;
        }

        @Override // o6g.d
        public final JcePrimitiveT a(String str) {
            return this.a.a(str, null);
        }
    }

    public static class c<JcePrimitiveT> implements d<JcePrimitiveT> {
        public final d7g<JcePrimitiveT> a;

        public c(d7g<JcePrimitiveT> d7gVar) {
            this.a = d7gVar;
        }

        @Override // o6g.d
        public final JcePrimitiveT a(String str) throws GeneralSecurityException {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (int i2 = 0; i2 < 3; i2++) {
                Provider provider = Security.getProvider(strArr[i2]);
                if (provider != null) {
                    arrayList.add(provider);
                }
            }
            int size = arrayList.size();
            Exception exc = null;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                try {
                    return this.a.a(str, (Provider) obj);
                } catch (Exception e) {
                    if (exc == null) {
                        exc = e;
                    }
                }
            }
            throw new GeneralSecurityException(llGRV.IjowGMJWKX, exc);
        }
    }

    public interface d<JcePrimitiveT> {
        JcePrimitiveT a(String str);
    }

    static {
        new o6g(new d7g.g());
        new o6g(new d7g.f());
        new o6g(new d7g.b());
        new o6g(new d7g.d());
        new o6g(new d7g.c());
    }

    public o6g(T_WRAPPER t_wrapper) {
        if (byf0.a()) {
            this.a = new c(t_wrapper);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.a = new a(t_wrapper);
        } else {
            this.a = new b(t_wrapper);
        }
    }
}
