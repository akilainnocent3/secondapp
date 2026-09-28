package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class v90 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ ht a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Function0<Unit> c;
    public final /* synthetic */ x420 d;
    public final /* synthetic */ op8 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v90(ht htVar, long j, Function0 function0, x420 x420Var, op8 op8Var, int i, int i2) {
        super(2);
        this.a = htVar;
        this.b = j;
        this.c = function0;
        this.d = x420Var;
        this.e = op8Var;
        this.f = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        u90.b(this.a, this.b, this.c, this.d, this.e, aVar, qj40.a(this.f | 1), this.i);
        return Unit.a;
    }
}
