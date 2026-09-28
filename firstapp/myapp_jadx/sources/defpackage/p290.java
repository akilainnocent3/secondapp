package defpackage;

import androidx.compose.animation.j;
import androidx.compose.animation.l;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class p290 extends qlr implements Function1<y.a, Unit> {
    public final /* synthetic */ j a;
    public final /* synthetic */ y b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p290(j jVar, y yVar) {
        super(1);
        this.a = jVar;
        this.b = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(y.a aVar) {
        long j;
        gly glyVar;
        long jE;
        long j2;
        y.a aVar2 = aVar;
        urr urrVarF1 = aVar2.f1();
        y yVar = this.b;
        if (urrVarF1 == null) {
            aVar2.s(yVar, 0, 0, 0.0f);
        } else {
            j jVar = this.a;
            long jM = jVar.p2().M(urrVarF1, 0L);
            if (jVar.E.g().c() != null) {
                lk40 lk40VarA = jVar.E.g().a();
                if (lk40VarA == null) {
                    lk40VarA = pk40.b(jM, (((long) Float.floatToRawIntBits(yVar.a)) << 32) | (((long) Float.floatToRawIntBits(yVar.b)) & 4294967295L));
                }
                t65 t65VarD = jVar.E.d();
                i5f0 i5f0VarC = jVar.E.g().c();
                i5f0VarC.getClass();
                j = 4294967295L;
                lk40 lk40VarB = pk40.b(gly.f(((gly) ((x5a0) i5f0VarC.b).getValue()).a, ((gly) ((x5a0) i5f0VarC.c).getValue()).a), ((yw90) ((x5a0) i5f0VarC.a).getValue()).a);
                l lVar = t65VarD.a;
                ytw ytwVar = t65VarD.f;
                if (lVar.i()) {
                    if (((twd0) ((x5a0) ytwVar).getValue()) == null) {
                        t65VarD.e = ((c75) ((x5a0) t65VarD.d).getValue()).a();
                    }
                    ((x5a0) ytwVar).setValue(((dtg0.a) ((x5a0) t65VarD.c).getValue()).a(new r65(t65VarD), new s65(t65VarD, lk40VarB, lk40VarA)));
                }
            } else {
                j = 4294967295L;
            }
            lk40 lk40VarB2 = jVar.E.d().b();
            if (lk40VarB2 != null) {
                i5f0 i5f0VarC2 = jVar.E.g().c();
                i5f0VarC2.getClass();
                glyVar = new gly(gly.f(gly.e(lk40VarB2.e(), ((gly) ((x5a0) i5f0VarC2.b).getValue()).a), ((gly) ((x5a0) i5f0VarC2.d).getValue()).a));
            } else {
                glyVar = null;
            }
            if (jVar.E.d().a()) {
                j2 = glyVar != null ? glyVar.a : jM;
                ((x5a0) jVar.E.g().e).setValue(glyVar == null ? pk40.b(jM, kc6.d(urrVarF1.a())) : pk40.b(glyVar.a, lk40VarB2.d()));
            } else {
                if (glyVar != null) {
                    jE = glyVar.a;
                } else {
                    lk40 lk40VarA2 = jVar.E.g().a();
                    lk40VarA2.getClass();
                    jE = lk40VarA2.e();
                }
                j2 = jE;
            }
            long jE2 = gly.e(j2, jM);
            aVar2.s(yVar, Math.round(Float.intBitsToFloat((int) (jE2 >> 32))), Math.round(Float.intBitsToFloat((int) (jE2 & j))), 0.0f);
        }
        return Unit.a;
    }
}
