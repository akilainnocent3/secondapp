package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zb4 extends saj implements Function2<Integer, String, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, String str) {
        Object value;
        int iIntValue = num.intValue();
        String str2 = str;
        str2.getClass();
        cc4 cc4Var = (cc4) this.receiver;
        cc4Var.getClass();
        wwd0 wwd0Var = cc4Var.f;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, bc4.a((bc4) value, false, str2, iIntValue, false, 9)));
        return Unit.a;
    }
}
