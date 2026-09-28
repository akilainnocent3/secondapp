package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class udb0 extends y3l {
    public final nsz d = new nsz();
    public final msz e = new msz();
    public zxf0 f;

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // defpackage.y3l
    public final uov d(apv apvVar, ByteBuffer byteBuffer) {
        uov.a wdb0Var;
        long j;
        long j2;
        nsz nszVar = this.d;
        msz mszVar = this.e;
        zxf0 zxf0Var = this.f;
        if (zxf0Var != null) {
            long j3 = apvVar.w;
            synchronized (zxf0Var) {
                j2 = zxf0Var.b;
            }
            if (j3 != j2) {
                zxf0 zxf0Var2 = new zxf0(apvVar.f);
                this.f = zxf0Var2;
                zxf0Var2.a(apvVar.f - apvVar.w);
            }
        } else {
            zxf0 zxf0Var3 = new zxf0(apvVar.f);
            this.f = zxf0Var3;
            zxf0Var3.a(apvVar.f - apvVar.w);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        nszVar.G(iLimit, bArrArray);
        mszVar.k(iLimit, bArrArray);
        mszVar.o(39);
        long jG = (((long) mszVar.g(1)) << 32) | ((long) mszVar.g(32));
        mszVar.o(20);
        int iG = mszVar.g(12);
        int iG2 = mszVar.g(8);
        nszVar.J(14);
        if (iG2 == 0) {
            wdb0Var = new wdb0();
        } else if (iG2 == 255) {
            long jY = nszVar.y();
            int i = iG - 4;
            nszVar.h(new byte[i], 0, i);
            wdb0Var = new sw20(jY, jG);
        } else if (iG2 == 4) {
            int iW = nszVar.w();
            ArrayList arrayList = new ArrayList(iW);
            for (int i2 = 0; i2 < iW; i2++) {
                nszVar.y();
                boolean z = (nszVar.w() & 128) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int iW2 = nszVar.w();
                    boolean z2 = (iW2 & 64) != 0;
                    boolean z3 = (iW2 & 32) != 0;
                    if (z2) {
                        nszVar.y();
                    }
                    if (!z2) {
                        int iW3 = nszVar.w();
                        ArrayList arrayList3 = new ArrayList(iW3);
                        for (int i3 = 0; i3 < iW3; i3++) {
                            nszVar.w();
                            nszVar.y();
                            arrayList3.add(new xdb0.a());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        nszVar.w();
                        nszVar.y();
                    }
                    nszVar.C();
                    nszVar.w();
                    nszVar.w();
                }
                arrayList.add(new xdb0.b(arrayList2));
            }
            wdb0Var = new xdb0(arrayList);
        } else if (iG2 == 5) {
            zxf0 zxf0Var4 = this.f;
            nszVar.y();
            boolean z4 = (nszVar.w() & 128) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int iW4 = nszVar.w();
                boolean z5 = (iW4 & 64) != 0;
                boolean z6 = (iW4 & 32) != 0;
                boolean z7 = (iW4 & 16) != 0;
                long jD = (!z5 || z7) ? -9223372036854775807L : fxf0.d(jG, nszVar);
                if (!z5) {
                    int iW5 = nszVar.w();
                    ArrayList arrayList4 = new ArrayList(iW5);
                    for (int i4 = 0; i4 < iW5; i4++) {
                        nszVar.w();
                        zxf0Var4.b(!z7 ? fxf0.d(jG, nszVar) : -9223372036854775807L);
                        arrayList4.add(new vdb0.a());
                    }
                    list = arrayList4;
                }
                if (z6) {
                    nszVar.w();
                    nszVar.y();
                }
                nszVar.C();
                nszVar.w();
                nszVar.w();
                j = jD;
            }
            wdb0Var = new vdb0(j, zxf0Var4.b(j), list);
        } else if (iG2 != 6) {
            wdb0Var = null;
        } else {
            zxf0 zxf0Var5 = this.f;
            long jD2 = fxf0.d(jG, nszVar);
            wdb0Var = new fxf0(jD2, zxf0Var5.b(jD2));
        }
        return wdb0Var == null ? new uov(new uov.a[0]) : new uov(wdb0Var);
    }
}
