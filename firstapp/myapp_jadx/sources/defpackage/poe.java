package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class poe extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ long C;
    public final /* synthetic */ float D;
    public final /* synthetic */ String E;
    public final /* synthetic */ m9i F;
    public final /* synthetic */ ytw a;
    public final /* synthetic */ nwa b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ imf0 e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long i;
    public final /* synthetic */ float v;
    public final /* synthetic */ m9i w;
    public final /* synthetic */ long y;
    public final /* synthetic */ imf0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public poe(ytw ytwVar, nwa nwaVar, Function0 function0, String str, imf0 imf0Var, long j, long j2, float f, m9i m9iVar, long j3, imf0 imf0Var2, long j4, long j5, long j6, float f2, String str2, m9i m9iVar2) {
        super(2);
        this.a = ytwVar;
        this.b = nwaVar;
        this.c = function0;
        this.d = str;
        this.e = imf0Var;
        this.f = j;
        this.i = j2;
        this.v = f;
        this.w = m9iVar;
        this.y = j3;
        this.z = imf0Var2;
        this.A = j4;
        this.B = j5;
        this.C = j6;
        this.D = f2;
        this.E = str2;
        this.F = m9iVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        if ((num.intValue() & 3) == 2 && aVar2.j()) {
            aVar2.G();
        } else {
            this.a.setValue(Unit.a);
            nwa nwaVar = this.b;
            int i = nwaVar.b;
            nwa nwaVar2 = nwa.this;
            cwa cwaVarE = nwaVar2.e();
            cwa cwaVarE2 = nwaVar2.e();
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = koe.a;
                aVar2.r(objY);
            }
            d.a aVar3 = d.a.b;
            d dVarD = nwa.d(aVar3, cwaVarE, (Function1) objY);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(aVar2.m());
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, dVarD);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            if (aVar2.k() == null) {
                l2a.b();
                throw null;
            }
            aVar2.D();
            if (aVar2.g()) {
                aVar2.F(aVar4);
            } else {
                aVar2.p();
            }
            hlh0.a(aVar2, aivVarC, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            imf0 imf0VarB = imf0.b(this.z, this.A, 0L, null, null, null, 0L, null, new ix80(this.D, this.B, this.C), null, 0, 0L, null, null, 16769022);
            int i2 = m9i.e;
            xe1.a(this.E, this.F, null, 0L, 0L, null, 0L, 2, false, 1, imf0VarB, aVar2, 0, 3120, 6140);
            aVar2.s();
            imf0 imf0VarB2 = imf0.b(this.e, 0L, 0L, null, null, null, 0L, null, new ix80(this.v, this.f, this.i), null, 0, 0L, null, null, 16769023);
            boolean zM = aVar2.M(cwaVarE);
            Object objY2 = aVar2.y();
            if (zM || objY2 == c0042a) {
                objY2 = new loe(cwaVarE);
                aVar2.r(objY2);
            }
            xe1.a(this.d, this.w, nwa.d(aVar3, cwaVarE2, (Function1) objY2), this.y, 0L, null, 0L, 2, false, 1, imf0VarB2, aVar2, 0, 3120, 6128);
            aVar2.H();
            if (nwaVar.b != i) {
                use useVar = xvf.a;
                aVar2.t(this.c);
            }
        }
        return Unit.a;
    }
}
