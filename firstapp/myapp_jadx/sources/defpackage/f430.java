package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f430 implements Function1 {
    public final /* synthetic */ float a;
    public final /* synthetic */ gt7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ f430(float f, gt7 gt7Var, int i) {
        this.a = f;
        this.b = gt7Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Float fValueOf = Float.valueOf(this.a);
        gt7 gt7Var = this.b;
        lb80.g((pb80) obj, new m230(((Number) f.h(fValueOf, gt7Var)).floatValue(), gt7Var, this.c));
        return Unit.a;
    }
}
