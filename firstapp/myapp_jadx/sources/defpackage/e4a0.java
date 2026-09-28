package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class e4a0 implements Function2<a, Integer, Unit> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function2<a, Integer, Unit> b;
    public final /* synthetic */ op8 c;
    public final /* synthetic */ Function2<a, Integer, Unit> d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public e4a0(boolean z, Function2 function2, op8 op8Var, Function2 function3, long j, long j2) {
        this.a = z;
        this.b = function2;
        this.c = op8Var;
        this.d = function3;
        this.e = j;
        this.f = j2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            hna.a(lkf0.a.a(gah0.a(k4a0.h, aVar2)), pp8.b(969655473, new d4a0(this.a, this.b, this.c, this.d, gah0.a(k4a0.b, aVar2), this.e, this.f), aVar2), aVar2, 56);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
