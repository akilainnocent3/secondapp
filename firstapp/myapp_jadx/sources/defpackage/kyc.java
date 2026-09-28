package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kyc implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ du5 a;
    public final /* synthetic */ iu5 b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Function1<Long, Unit> e;
    public final /* synthetic */ xt5 f;
    public final /* synthetic */ guc i;
    public final /* synthetic */ h780 v;
    public final /* synthetic */ gtc w;
    public final /* synthetic */ List<a6c> y;

    /* JADX WARN: Multi-variable type inference failed */
    public kyc(du5 du5Var, iu5 iu5Var, Long l, Long l2, Function1<? super Long, Unit> function1, xt5 xt5Var, guc gucVar, h780 h780Var, gtc gtcVar, List<a6c> list) {
        this.a = du5Var;
        this.b = iu5Var;
        this.c = l;
        this.d = l2;
        this.e = function1;
        this.f = xt5Var;
        this.i = gucVar;
        this.v = h780Var;
        this.w = gtcVar;
        this.y = list;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x017f  */
    @Override // defpackage.iaj
    public final Unit d(gwr gwrVar, Integer num, a aVar, Integer num2) {
        int i;
        o780 o780Var;
        Object o780Var2;
        gwr gwrVar2 = gwrVar;
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= aVar2.d(iIntValue) ? 32 : 16;
        }
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            iu5 iu5VarK = this.a.k(this.b, iIntValue);
            d dVarA = gwrVar2.a(1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar2, 0);
            int I = aVar2.I();
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar3);
            } else {
                aVar2.p();
            }
            hlh0.a(aVar2, i78VarA, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                j3c.a(I, aVar2, I, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            imf0 imf0VarA = gah0.a(dxc.z, aVar2);
            guc gucVar = this.i;
            du5 du5Var = this.a;
            List<a6c> list = this.y;
            gtc gtcVar = this.w;
            lkf0.a(imf0VarA, pp8.b(-577031469, new jyc(gucVar, iu5VarK, du5Var, list, gtcVar), aVar2), aVar2, 48);
            Long l = this.c;
            Long l2 = this.d;
            if (l == null || l2 == null) {
                du5Var = du5Var;
                l = l;
                gtcVar = gtcVar;
                aVar2.N(186488258);
                aVar2.H();
                o780Var = null;
            } else {
                aVar2.N(185956701);
                boolean zM = aVar2.M(l) | aVar2.M(l2);
                Object objY = aVar2.y();
                if (zM || objY == a.C0041a.a) {
                    xt5 xt5VarB = du5Var.b(l.longValue());
                    xt5 xt5VarB2 = du5Var.b(l2.longValue());
                    long j = xt5VarB.d;
                    long j2 = iu5VarK.f;
                    if (j <= j2) {
                        long j3 = xt5VarB2.d;
                        long j4 = iu5VarK.e;
                        if (j3 < j4) {
                            o780Var2 = null;
                        } else {
                            boolean z = j >= j4;
                            boolean z2 = j3 <= j2;
                            int i2 = iu5VarK.d;
                            int i3 = z ? (xt5VarB.c + i2) - 1 : i2;
                            int i4 = (i2 + (z2 ? xt5VarB2.c : iu5VarK.c)) - 1;
                            o780Var2 = new o780(z, (((long) (i3 % 7)) << 32) | (((long) (i3 / 7)) & 4294967295L), (((long) (i4 % 7)) << 32) | (((long) (i4 / 7)) & 4294967295L), z2);
                        }
                    } else {
                        o780Var2 = null;
                    }
                    aVar2.r(o780Var2);
                } else {
                    o780Var2 = objY;
                }
                aVar2.H();
                o780Var = (o780) o780Var2;
            }
            xvc.i(iu5VarK, this.e, this.f.d, l, l2, o780Var, gucVar, this.v, gtcVar, du5Var.a, aVar2, 0);
            aVar2.s();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
