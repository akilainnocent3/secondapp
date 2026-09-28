package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final class rr60 {
    public final r4u<nlp, String> a = new r4u<>(1000);
    public final v7h.c b = v7h.a(10, new a());

    public class a implements v7h.b<b> {
        @Override // v7h.b
        public final b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                gqm.a(e);
                return null;
            }
        }
    }

    public static final class b implements v7h.d {
        public final MessageDigest a;
        public final vxd0.a b = new vxd0.a();

        public b(MessageDigest messageDigest) {
            this.a = messageDigest;
        }

        @Override // v7h.d
        public final vxd0.a b() {
            return this.b;
        }
    }

    public final String a(nlp nlpVar) {
        String strA;
        synchronized (this.a) {
            strA = this.a.a(nlpVar);
        }
        if (strA == null) {
            b bVar = (b) this.b.b();
            try {
                nlpVar.b(bVar.a);
                byte[] bArrDigest = bVar.a.digest();
                char[] cArr = erh0.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b2 = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = erh0.a;
                        cArr[i2] = cArr2[(b2 & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b2 & 15];
                    }
                    strA = new String(cArr);
                }
                this.b.a(bVar);
            } catch (Throwable th) {
                this.b.a(bVar);
                throw th;
            }
        }
        synchronized (this.a) {
            this.a.d(nlpVar, strA);
        }
        return strA;
    }
}
