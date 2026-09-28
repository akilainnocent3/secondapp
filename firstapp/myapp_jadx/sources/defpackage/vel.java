package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes8.dex */
public final class vel extends iui {
    public final MessageDigest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vel(bf4 bf4Var) throws NoSuchAlgorithmException {
        super(bf4Var);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.getClass();
        this.b = messageDigest;
    }

    @Override // defpackage.iui, defpackage.uw90
    public final void write(lb5 lb5Var, long j) {
        lb5Var.getClass();
        l.b(lb5Var.b, 0L, j);
        e580 e580Var = lb5Var.a;
        e580Var.getClass();
        long j2 = 0;
        while (j2 < j) {
            int iMin = (int) Math.min(j - j2, e580Var.c - e580Var.b);
            MessageDigest messageDigest = this.b;
            messageDigest.getClass();
            messageDigest.update(e580Var.a, e580Var.b, iMin);
            j2 += (long) iMin;
            e580Var = e580Var.f;
            e580Var.getClass();
        }
        super.write(lb5Var, j);
    }
}
