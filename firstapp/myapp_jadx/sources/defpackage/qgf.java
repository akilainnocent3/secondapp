package defpackage;

import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: loaded from: classes8.dex */
public final class qgf implements php<b> {
    public static final qgf a = new qgf();
    public static final gw20 b = new gw20("kotlin.time.Duration", bw20.i.a);

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        b.a aVar = b.b;
        String strA = b5dVar.A();
        aVar.getClass();
        strA.getClass();
        try {
            long jF = c.f(strA, true);
            if (b.d(jF, b.e)) {
                throw new IllegalStateException("invariant failed");
            }
            return new b(jF);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(tug.a("Invalid ISO duration string format: '", strA, "'."), e);
        }
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        long j = ((b) obj).a;
        b.a aVar = b.b;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jL = j < 0 ? b.l(j) : j;
        long j2 = b.j(jL, rgf.HOURS);
        boolean z = false;
        int iJ = b.h(jL) ? 0 : (int) (b.j(jL, rgf.MINUTES) % 60);
        int iJ2 = b.h(jL) ? 0 : (int) (b.j(jL, rgf.SECONDS) % 60);
        int iF = b.f(jL);
        if (b.h(j)) {
            j2 = 9999999999999L;
        }
        boolean z2 = j2 != 0;
        boolean z3 = (iJ2 == 0 && iF == 0) ? false : true;
        if (iJ != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(j2);
            sb.append('H');
        }
        if (z) {
            sb.append(iJ);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            b.b(sb, iJ2, iF, 9, "S", true);
        }
        f4gVar.E(sb.toString());
    }
}
