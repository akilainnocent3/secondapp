package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class nwc implements iaj<pf0, mse, a, Integer, Unit> {
    public final /* synthetic */ Long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Function1<Long, Unit> c;
    public final /* synthetic */ Function1<Long, Unit> d;
    public final /* synthetic */ du5 e;
    public final /* synthetic */ IntRange f;
    public final /* synthetic */ guc i;
    public final /* synthetic */ h780 v;
    public final /* synthetic */ gtc w;
    public final /* synthetic */ b5i y;

    /* JADX WARN: Multi-variable type inference failed */
    public nwc(Long l, long j, Function1<? super Long, Unit> function1, Function1<? super Long, Unit> function2, du5 du5Var, IntRange intRange, guc gucVar, h780 h780Var, gtc gtcVar, b5i b5iVar) {
        this.a = l;
        this.b = j;
        this.c = function1;
        this.d = function2;
        this.e = du5Var;
        this.f = intRange;
        this.i = gucVar;
        this.v = h780Var;
        this.w = gtcVar;
        this.y = b5iVar;
    }

    @Override // defpackage.iaj
    public final Unit d(pf0 pf0Var, mse mseVar, a aVar, Integer num) {
        int i = mseVar.a;
        a aVar2 = aVar;
        num.intValue();
        gtc gtcVar = this.w;
        if (i == 0) {
            aVar2.N(1567031954);
            xvc.c(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, gtcVar, aVar2, 0);
            aVar2.H();
        } else if (i == 1) {
            aVar2.N(1567050592);
            rsc.a(this.a, this.c, this.e, this.f, this.i, this.v, gtcVar, this.y, aVar2, 0);
            aVar2.H();
        } else {
            aVar2.N(1334373351);
            aVar2.H();
        }
        return Unit.a;
    }
}
