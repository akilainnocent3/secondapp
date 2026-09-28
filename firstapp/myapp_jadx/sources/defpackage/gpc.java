package defpackage;

import android.graphics.RectF;
import java.security.SecureRandom;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class gpc extends q12<epc> {
    public int b;
    public boolean d;
    public final pqc e;
    public ArrayList g;
    public oqc h;
    public int f = 0;
    public final SecureRandom c = n380.a();

    public gpc(awf awfVar, RectF rectF) {
        this.h = new oqc(System.currentTimeMillis(), awfVar.a(), awfVar.b(), 0, 0);
        this.e = new pqc(new rqc(awfVar.a(), 1000L, 1, wij.a().b, new qqc() { // from class: fpc
            /* JADX WARN: Code duplicated, block: B:16:0x0028 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:17:0x0029 A[RETURN] */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x000b, code lost:
            
                if (r4 != 1) goto L8;
             */
            @Override // defpackage.qqc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int a(int r4, boolean r5, boolean r6) {
                /*
                    r3 = this;
                    r0 = 0
                    r1 = 1
                    r2 = -1
                    if (r6 != 0) goto L7
                    if (r5 == 0) goto Ld
                L7:
                    if (r4 == r2) goto L2a
                    if (r4 == 0) goto L26
                    if (r4 == r1) goto L2a
                Ld:
                    gpc r3 = r3.a
                    java.security.SecureRandom r3 = r3.c
                    if (r4 != 0) goto L1a
                    boolean r3 = r3.nextBoolean()
                    if (r3 == 0) goto L28
                    goto L29
                L1a:
                    int[] r4 = new int[]{r2, r1, r0}
                    r5 = 3
                    int r3 = r3.nextInt(r5)
                    r3 = r4[r3]
                    return r3
                L26:
                    if (r6 == 0) goto L29
                L28:
                    return r1
                L29:
                    return r2
                L2a:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fpc.a(int, boolean, boolean):int");
            }
        }), null, rectF);
    }

    @Override // defpackage.q12
    public final epc b(long j, long j2) {
        oqc oqcVarB = this.h;
        if (this.d) {
            this.b = 1;
        } else {
            this.b = 0;
            synchronized (this) {
                try {
                    if (this.g == null) {
                        oqcVarB = null;
                        break;
                    }
                    do {
                        if (this.f >= this.g.size()) {
                            oqcVarB = null;
                            break;
                        }
                        oqcVarB = (oqc) this.g.get(this.f);
                        this.f++;
                    } while (j > oqcVarB.a);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (oqcVarB == null) {
                oqcVarB = this.e.b(j, j2);
            }
            this.h = oqcVarB;
        }
        return new epc(this.b, oqcVarB.b);
    }
}
