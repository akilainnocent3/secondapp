package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class d4b implements Function2<a, Integer, Unit> {
    public final /* synthetic */ ia5 A;
    public final /* synthetic */ iif0 B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ Function1<ukf0, Unit> E;
    public final /* synthetic */ mly F;
    public final /* synthetic */ mmd G;
    public final /* synthetic */ n6s a;
    public final /* synthetic */ imf0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ yhf0 e;
    public final /* synthetic */ ijf0 f;
    public final /* synthetic */ uni0 i;
    public final /* synthetic */ d v;
    public final /* synthetic */ d w;
    public final /* synthetic */ d y;
    public final /* synthetic */ d z;

    /* JADX WARN: Multi-variable type inference failed */
    public d4b(n6s n6sVar, imf0 imf0Var, int i, int i2, yhf0 yhf0Var, ijf0 ijf0Var, uni0 uni0Var, d dVar, d dVar2, d dVar3, d dVar4, ia5 ia5Var, iif0 iif0Var, boolean z, boolean z2, Function1<? super ukf0, Unit> function1, mly mlyVar, mmd mmdVar) {
        this.a = n6sVar;
        this.b = imf0Var;
        this.c = i;
        this.d = i2;
        this.e = yhf0Var;
        this.f = ijf0Var;
        this.i = uni0Var;
        this.v = dVar;
        this.w = dVar2;
        this.y = dVar3;
        this.z = dVar4;
        this.A = ia5Var;
        this.B = iif0Var;
        this.C = z;
        this.D = z2;
        this.E = function1;
        this.F = mlyVar;
        this.G = mmdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        d a3i0Var;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        int i = 0;
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            n6s n6sVar = this.a;
            d dVarK = j.k(d.a.b, ((g7f) ((x5a0) n6sVar.g).getValue()).a, 0.0f, 2);
            gnn.a aVar3 = gnn.a;
            int i2 = this.c;
            int i3 = this.d;
            imf0 imf0Var = this.b;
            d dVarA = c.a(dVarK, aVar3, new vil(i2, i3, imf0Var));
            boolean zA = aVar2.A(n6sVar);
            Object objY = aVar2.y();
            if (zA || objY == a.C0041a.a) {
                objY = new z3b(n6sVar, i);
                aVar2.r(objY);
            }
            Function0 function0 = (Function0) objY;
            yhf0 yhf0Var = this.e;
            i3z i3zVar = (i3z) ((x5a0) yhf0Var.f).getValue();
            ijf0 ijf0Var = this.f;
            long j = ijf0Var.b;
            int i4 = ulf0.c;
            int iF = (int) (j >> 32);
            long j2 = yhf0Var.e;
            if (iF == ((int) (j2 >> 32)) && (iF = (int) (j & 4294967295L)) == ((int) (4294967295L & j2))) {
                iF = ulf0.f(j);
            }
            yhf0Var.e = ijf0Var.b;
            wsg0 wsg0VarA = luh0.a(this.i, ijf0Var.a);
            int iOrdinal = i3zVar.ordinal();
            if (iOrdinal == 0) {
                a3i0Var = new a3i0(yhf0Var, iF, wsg0VarA, function0);
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                a3i0Var = new sjm(yhf0Var, iF, wsg0VarA, function0);
            }
            dk90.a(androidx.compose.foundation.relocation.a.a(c.a(ls7.b(dVarA).n(a3i0Var).n(this.v).n(this.w), aVar3, new ejf0(imf0Var)).n(this.y).n(this.z), this.A), pp8.b(1412697320, new c4b(this.B, n6sVar, this.C, this.D, this.E, this.f, this.F, this.G, this.d), aVar2), aVar2, 48);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
