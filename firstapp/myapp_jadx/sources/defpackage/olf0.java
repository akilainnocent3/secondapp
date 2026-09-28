package defpackage;

import com.google.protobuf.Reader;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class olf0 {
    public final f8i.a a;
    public final mmd b;
    public final asr c;
    public final rkf0 d = new rkf0();

    public olf0(f8i.a aVar, mmd mmdVar, asr asrVar) {
        this.a = aVar;
        this.b = mmdVar;
        this.c = asrVar;
    }

    public static ukf0 a(olf0 olf0Var, String str, imf0 imf0Var, long j, int i) {
        int i2 = (i & 16) != 0 ? Reader.READ_DONE : 1;
        long jB = (i & 32) != 0 ? oxa.b(0, 0, 0, 15) : j;
        asr asrVar = olf0Var.c;
        mmd mmdVar = olf0Var.b;
        f8i.a aVar = olf0Var.a;
        olf0Var.getClass();
        return b(olf0Var, new nk0(str), imf0Var, i2, jB, asrVar, mmdVar, aVar, 32);
    }

    public static ukf0 b(olf0 olf0Var, nk0 nk0Var, imf0 imf0Var, int i, long j, asr asrVar, mmd mmdVar, f8i.a aVar, int i2) {
        ukf0 ukf0VarB;
        imf0 imf0Var2 = (i2 & 2) != 0 ? imf0.d : imf0Var;
        m2g m2gVar = m2g.a;
        long jB = (i2 & 64) != 0 ? oxa.b(0, 0, 0, 15) : j;
        asr asrVar2 = (i2 & 128) != 0 ? olf0Var.c : asrVar;
        mmd mmdVar2 = (i2 & 256) != 0 ? olf0Var.b : mmdVar;
        f8i.a aVar2 = (i2 & 512) != 0 ? olf0Var.a : aVar;
        rkf0 rkf0Var = olf0Var.d;
        tkf0 tkf0Var = new tkf0(nk0Var, imf0Var2, m2gVar, i, true, 1, mmdVar2, asrVar2, aVar2, jB);
        ukf0 ukf0Var = null;
        if (rkf0Var != null) {
            zr5 zr5Var = new zr5(tkf0Var);
            s4u<zr5, ukf0> s4uVar = rkf0Var.a;
            if (s4uVar != null) {
                ukf0VarB = s4uVar.b(zr5Var);
            } else if (Intrinsics.g(rkf0Var.b, zr5Var)) {
                ukf0VarB = rkf0Var.c;
            }
            if (ukf0VarB != null && !ukf0VarB.b.a.a()) {
                ukf0Var = ukf0VarB;
            }
        }
        if (ukf0Var != null) {
            zjw zjwVar = ukf0Var.b;
            return new ukf0(tkf0Var, zjwVar, oxa.d(jB, (((long) ((int) Math.ceil(zjwVar.d))) << 32) | (((long) ((int) Math.ceil(zjwVar.e))) & 4294967295L)));
        }
        ckw ckwVar = new ckw(nk0Var, ib30.c(imf0Var2, asrVar2), m2gVar, mmdVar2, aVar2);
        int iK = kxa.k(jB);
        int i3 = kxa.e(jB) ? kxa.i(jB) : Reader.READ_DONE;
        if (iK != i3) {
            i3 = f.e((int) Math.ceil(ckwVar.b()), iK, i3);
        }
        zjw zjwVar2 = new zjw(ckwVar, kxa.a.b(0, i3, 0, kxa.h(jB)), i, 1);
        ukf0 ukf0Var2 = new ukf0(tkf0Var, zjwVar2, oxa.d(jB, (((long) ((int) Math.ceil(zjwVar2.e))) & 4294967295L) | (((long) ((int) Math.ceil(zjwVar2.d))) << 32)));
        if (rkf0Var != null) {
            s4u<zr5, ukf0> s4uVar2 = rkf0Var.a;
            if (s4uVar2 != null) {
                s4uVar2.c(new zr5(tkf0Var), ukf0Var2);
                return ukf0Var2;
            }
            rkf0Var.b = new zr5(tkf0Var);
            rkf0Var.c = ukf0Var2;
        }
        return ukf0Var2;
    }
}
