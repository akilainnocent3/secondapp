package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lna extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ wgz a;
    public final /* synthetic */ lmh0 b;
    public final /* synthetic */ op8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lna(wgz wgzVar, lmh0 lmh0Var, op8 op8Var, int i) {
        super(2);
        this.a = wgzVar;
        this.b = lmh0Var;
        this.c = op8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        int iA = qj40.a(1);
        kna.a(this.a, this.b, this.c, aVar, iA);
        return Unit.a;
    }
}
