package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iv extends saj implements Function1<Integer, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        v800 v800Var = ((sv) this.receiver).a;
        et7 et7Var = v800Var.m;
        if (et7Var != null) {
            ej5.c(et7Var, null, null, new s800(iIntValue, v800Var, null), 3);
        }
        return Unit.a;
    }
}
