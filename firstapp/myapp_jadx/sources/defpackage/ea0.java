package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ea0 extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ w420 a;
    public final /* synthetic */ Function0<Unit> b;
    public final /* synthetic */ x420 c;
    public final /* synthetic */ op8 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(w420 w420Var, Function0 function0, x420 x420Var, op8 op8Var, int i, int i2) {
        super(2);
        this.a = w420Var;
        this.b = function0;
        this.c = x420Var;
        this.d = op8Var;
        this.e = i;
        this.f = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        num.intValue();
        u90.a(this.a, this.b, this.c, this.d, aVar, qj40.a(this.e | 1), this.f);
        return Unit.a;
    }
}
