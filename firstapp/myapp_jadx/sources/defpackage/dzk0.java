package defpackage;

import com.appsflyer.internal.w;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dzk0 implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ jcl0 c;

    public /* synthetic */ dzk0(boolean z, String str, jcl0 jcl0Var) {
        this.a = z;
        this.b = str;
        this.c = jcl0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.a;
        String str = this.b;
        jcl0 jcl0Var = this.c;
        String str2 = (z || !djl0.a(str, jcl0Var, true, false).a) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        hm20.h(messageDigest);
        byte[] bArrDigest = messageDigest.digest(jcl0Var.c);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : bArrDigest) {
            char[] cArr2 = ijl.b;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        return w.a(ux5.a(str2, ": pkg=", str, ", sha256=", new String(cArr)), ", atk=", z, ", ver=12451000.false");
    }
}
