package defpackage;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;

/* JADX INFO: loaded from: classes8.dex */
public final class ovo implements yxd0 {
    public static final ovo a = new ovo();

    public static final boolean c(m020 m020Var) {
        return !m020Var.h && m020Var.d;
    }

    public static final boolean d(m020 m020Var) {
        return (m020Var.b() || !m020Var.h || m020Var.d) ? false : true;
    }

    public static final boolean e(m020 m020Var) {
        return m020Var.h && !m020Var.d;
    }

    public static final boolean f(m020 m020Var, long j, long j2) {
        int i = m020Var.i == 1 ? 1 : 0;
        long j3 = m020Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final Date g(String str) throws ParseException {
        str.getClass();
        Date dateB = bzm.b(str, new ParsePosition(0));
        dateB.getClass();
        return dateB;
    }

    public static final long h(m020 m020Var, boolean z) {
        long jE = gly.e(m020Var.c, m020Var.g);
        if (z || !m020Var.b()) {
            return jE;
        }
        return 0L;
    }

    @Override // defpackage.yxd0
    public int a(Object obj, ptu ptuVar) {
        return s08.b(((Long) obj).longValue()) + cl0.c.c;
    }

    @Override // defpackage.yxd0
    public void b(me80 me80Var, Object obj, ptu ptuVar) {
        me80Var.h0(cl0.c, ((Long) obj).longValue());
    }
}
