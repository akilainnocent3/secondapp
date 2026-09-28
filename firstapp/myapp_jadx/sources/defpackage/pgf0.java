package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class pgf0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ imf0 a;
    public final /* synthetic */ imf0 b;
    public final /* synthetic */ twd0<Float> c;
    public final /* synthetic */ twd0<j58> d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ twd0<j58> f;
    public final /* synthetic */ gaj<jhf0, a, Integer, Unit> i;
    public final /* synthetic */ vgf0 v;

    public pgf0(imf0 imf0Var, imf0 imf0Var2, dtg0.d dVar, dtg0.d dVar2, boolean z, dtg0.d dVar3, gaj gajVar, vgf0 vgf0Var) {
        this.a = imf0Var;
        this.b = imf0Var2;
        this.c = dVar;
        this.d = dVar2;
        this.e = z;
        this.f = dVar3;
        this.i = gajVar;
        this.v = vgf0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            imf0 imf0VarB = ib30.b(this.a, this.b, this.c.getValue().floatValue());
            if (this.e) {
                imf0VarB = imf0.b(imf0VarB, this.f.getValue().a, 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
            }
            wgf0.b(this.d.getValue().a, imf0VarB, pp8.b(1157484991, new ogf0(this.i, this.v), aVar2), aVar2, 384);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
