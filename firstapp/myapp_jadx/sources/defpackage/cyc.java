package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class cyc implements gaj<mse, a, Integer, Unit> {
    public final /* synthetic */ Long a;
    public final /* synthetic */ Long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Function2<Long, Long, Unit> d;
    public final /* synthetic */ Function1<Long, Unit> e;
    public final /* synthetic */ du5 f;
    public final /* synthetic */ IntRange i;
    public final /* synthetic */ guc v;
    public final /* synthetic */ h780 w;
    public final /* synthetic */ gtc y;
    public final /* synthetic */ b5i z;

    /* JADX WARN: Multi-variable type inference failed */
    public cyc(Long l, Long l2, long j, Function2<? super Long, ? super Long, Unit> function2, Function1<? super Long, Unit> function1, du5 du5Var, IntRange intRange, guc gucVar, h780 h780Var, gtc gtcVar, b5i b5iVar) {
        this.a = l;
        this.b = l2;
        this.c = j;
        this.d = function2;
        this.e = function1;
        this.f = du5Var;
        this.i = intRange;
        this.v = gucVar;
        this.w = h780Var;
        this.y = gtcVar;
        this.z = b5iVar;
    }

    @Override // defpackage.gaj
    public final Unit invoke(mse mseVar, a aVar, Integer num) {
        int i = mseVar.a;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar2.d(i) ? 4 : 2;
        }
        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            gtc gtcVar = this.y;
            if (i == 0) {
                aVar2.N(-619517270);
                byc.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, gtcVar, aVar2, 0);
                aVar2.H();
            } else if (i == 1) {
                aVar2.N(-619495944);
                kxc.a(this.a, this.b, this.d, this.f, this.i, this.v, this.w, gtcVar, this.z, aVar2, 0);
                aVar2.H();
            } else {
                aVar2.N(-2023979101);
                aVar2.H();
            }
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
