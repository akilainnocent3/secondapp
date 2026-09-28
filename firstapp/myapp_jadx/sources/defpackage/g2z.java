package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g2z {
    public static final boolean[] a = new boolean[3];

    public static void a(jxa jxaVar, ofs ofsVar, ixa ixaVar) {
        ixaVar.p = -1;
        ewa ewaVar = ixaVar.O;
        ewa ewaVar2 = ixaVar.N;
        ewa ewaVar3 = ixaVar.L;
        ewa ewaVar4 = ixaVar.M;
        ewa ewaVar5 = ixaVar.K;
        ixaVar.q = -1;
        ixa.a aVar = jxaVar.V[0];
        ixa.a aVar2 = ixa.a.d;
        ixa.a aVar3 = ixa.a.b;
        if (aVar != aVar3 && ixaVar.V[0] == aVar2) {
            int i = ewaVar5.g;
            int iS = jxaVar.s() - ewaVar4.g;
            ewaVar5.i = ofsVar.k(ewaVar5);
            ewaVar4.i = ofsVar.k(ewaVar4);
            ofsVar.d(ewaVar5.i, i);
            ofsVar.d(ewaVar4.i, iS);
            ixaVar.p = 2;
            ixaVar.b0 = i;
            int i2 = iS - i;
            ixaVar.X = i2;
            int i3 = ixaVar.e0;
            if (i2 < i3) {
                ixaVar.X = i3;
            }
        }
        if (jxaVar.V[1] == aVar3 || ixaVar.V[1] != aVar2) {
            return;
        }
        int i4 = ewaVar3.g;
        int iM = jxaVar.m() - ewaVar2.g;
        ewaVar3.i = ofsVar.k(ewaVar3);
        ewaVar2.i = ofsVar.k(ewaVar2);
        ofsVar.d(ewaVar3.i, i4);
        ofsVar.d(ewaVar2.i, iM);
        if (ixaVar.d0 > 0 || ixaVar.j0 == 8) {
            uoa0 uoa0VarK = ofsVar.k(ewaVar);
            ewaVar.i = uoa0VarK;
            ofsVar.d(uoa0VarK, ixaVar.d0 + i4);
        }
        ixaVar.q = 2;
        ixaVar.c0 = i4;
        int i5 = iM - i4;
        ixaVar.Y = i5;
        int i6 = ixaVar.f0;
        if (i5 < i6) {
            ixaVar.Y = i6;
        }
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
