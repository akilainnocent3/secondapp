package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class a30 extends qlr implements iaj<Integer, Integer, Integer, Integer, Unit> {
    public final /* synthetic */ b30 a;
    public final /* synthetic */ ua80 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a30(b30 b30Var, ua80 ua80Var) {
        super(4);
        this.a = b30Var;
        this.b = ua80Var;
    }

    @Override // defpackage.iaj
    public final Unit d(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        int iIntValue4 = num4.intValue();
        b30 b30Var = this.a;
        b30Var.f.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        b30Var.a.f(b30Var.c, this.b.b(), b30Var.f);
        return Unit.a;
    }
}
