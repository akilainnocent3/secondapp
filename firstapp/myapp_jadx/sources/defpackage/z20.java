package defpackage;

import android.graphics.Rect;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class z20 extends qlr implements iaj<Integer, Integer, Integer, Integer, Unit> {
    public final /* synthetic */ b30 a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z20(b30 b30Var, int i) {
        super(4);
        this.a = b30Var;
        this.b = i;
    }

    @Override // defpackage.iaj
    public final Unit d(Integer num, Integer num2, Integer num3, Integer num4) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        int iIntValue4 = num4.intValue();
        b30 b30Var = this.a;
        b30Var.a.c(b30Var.c, this.b, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
        return Unit.a;
    }
}
