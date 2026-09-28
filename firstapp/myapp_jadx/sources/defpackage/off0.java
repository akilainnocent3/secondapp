package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class off0 implements gaj<d, a, Integer, d> {
    public final /* synthetic */ ya5 a;
    public final /* synthetic */ n6s b;
    public final /* synthetic */ ijf0 c;
    public final /* synthetic */ mly d;

    public off0(ya5 ya5Var, n6s n6sVar, ijf0 ijf0Var, mly mlyVar) {
        this.a = ya5Var;
        this.b = n6sVar;
        this.c = ijf0Var;
        this.d = mlyVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00cc  */
    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        d dVarC;
        d dVar2 = dVar;
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(-84507373);
        boolean zBooleanValue = ((Boolean) aVar2.O(kna.w)).booleanValue();
        boolean zB = aVar2.b(zBooleanValue);
        Object objY = aVar2.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (zB || objY == c0042a) {
            objY = new o5c(zBooleanValue);
            aVar2.r(objY);
        }
        final o5c o5cVar = (o5c) objY;
        ya5 ya5Var = this.a;
        boolean z = ((ya5Var instanceof soa0) && ((soa0) ya5Var).b == 16) ? false : true;
        if (((a8j0) aVar2.O(kna.t)).b()) {
            final n6s n6sVar = this.b;
            if (n6sVar.b()) {
                ijf0 ijf0Var = this.c;
                if (ulf0.c(ijf0Var.b) && z) {
                    aVar2.N(-707487962);
                    nk0 nk0Var = ijf0Var.a;
                    ulf0 ulf0Var = new ulf0(ijf0Var.b);
                    boolean zA = aVar2.A(o5cVar);
                    Object objY2 = aVar2.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new nff0(o5cVar, null);
                        aVar2.r(objY2);
                    }
                    xvf.g(nk0Var, ulf0Var, (Function2) objY2, aVar2);
                    boolean zA2 = aVar2.A(o5cVar);
                    final mly mlyVar = this.d;
                    boolean zM = aVar2.M(ya5Var) | zA2 | aVar2.A(mlyVar) | aVar2.M(ijf0Var) | aVar2.A(n6sVar);
                    Object objY3 = aVar2.y();
                    if (zM || objY3 == c0042a) {
                        final ijf0 ijf0Var2 = this.c;
                        final ya5 ya5Var2 = this.a;
                        Function1 function1 = new Function1() { // from class: mff0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                lza lzaVar = (lza) obj;
                                lzaVar.b2();
                                float fJ = ((t5a0) o5cVar.c).j();
                                if (fJ != 0.0f) {
                                    long j = ijf0Var2.b;
                                    int i = ulf0.c;
                                    int iB = mlyVar.b((int) (j >> 32));
                                    vkf0 vkf0VarD = n6sVar.d();
                                    lk40 lk40VarC = vkf0VarD != null ? vkf0VarD.a.c(iB) : new lk40(0.0f, 0.0f, 0.0f, 0.0f);
                                    float fFloor = (float) Math.floor(lzaVar.C1(2.0f));
                                    float f = fFloor < 1.0f ? 1.0f : fFloor;
                                    float f2 = f / 2.0f;
                                    float f3 = lk40VarC.a + f2;
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - f2;
                                    if (f3 > fIntBitsToFloat) {
                                        f3 = fIntBitsToFloat;
                                    }
                                    if (f3 >= f2) {
                                        f2 = f3;
                                    }
                                    float fFloor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
                                    tcf.M0(lzaVar, ya5Var2, (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(lk40VarC.b)) & 4294967295L), (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(lk40VarC.d)) & 4294967295L), f, fJ, 432);
                                }
                                return Unit.a;
                            }
                        };
                        aVar2.r(function1);
                        objY3 = function1;
                    }
                    dVarC = androidx.compose.ui.draw.a.c(dVar2, (Function1) objY3);
                    aVar2.H();
                } else {
                    aVar2.N(-705473241);
                    aVar2.H();
                    dVarC = d.a.b;
                }
            } else {
                aVar2.N(-705473241);
                aVar2.H();
                dVarC = d.a.b;
            }
        } else {
            aVar2.N(-705473241);
            aVar2.H();
            dVarC = d.a.b;
        }
        aVar2.H();
        return dVarC;
    }
}
