package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c4b implements Function2<a, Integer, Unit> {
    public final /* synthetic */ iif0 a;
    public final /* synthetic */ n6s b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1<ukf0, Unit> e;
    public final /* synthetic */ ijf0 f;
    public final /* synthetic */ mly i;
    public final /* synthetic */ mmd v;
    public final /* synthetic */ int w;

    /* JADX WARN: Multi-variable type inference failed */
    public c4b(iif0 iif0Var, n6s n6sVar, boolean z, boolean z2, Function1<? super ukf0, Unit> function1, ijf0 ijf0Var, mly mlyVar, mmd mmdVar, int i) {
        this.a = iif0Var;
        this.b = n6sVar;
        this.c = z;
        this.d = z2;
        this.e = function1;
        this.f = ijf0Var;
        this.i = mlyVar;
        this.v = mmdVar;
        this.w = i;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a4  */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        boolean z;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            mmd mmdVar = this.v;
            int i = this.w;
            n6s n6sVar = this.b;
            b4b b4bVar = new b4b(n6sVar, this.e, this.f, this.i, mmdVar, i);
            int iHashCode = Long.hashCode(aVar2.m());
            ne00 ne00VarO = aVar2.o();
            d dVarC = c.c(aVar2, d.a.b);
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
            hlh0.a(aVar2, b4bVar, yka.a.f);
            hlh0.a(aVar2, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar2, iHashCode, c1350a);
            }
            hlh0.a(aVar2, dVarC, yka.a.d);
            aVar2.s();
            ocl oclVarA = n6sVar.a();
            ocl oclVar = ocl.a;
            boolean z2 = this.c;
            if (oclVarA != oclVar && n6sVar.c() != null) {
                urr urrVarC = n6sVar.c();
                urrVarC.getClass();
                z = urrVarC.e() && z2;
            }
            iif0 iif0Var = this.a;
            j4b.c(iif0Var, z, aVar2, 0);
            if (n6sVar.a() == ocl.c && !this.d && z2) {
                aVar2.N(-714666198);
                j4b.d(iif0Var, aVar2, 0);
                aVar2.H();
            } else {
                aVar2.N(-714589318);
                aVar2.H();
            }
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
