package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qkg extends saj implements Function1<c7i0, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(c7i0 c7i0Var) {
        c7i0 c7i0Var2 = c7i0Var;
        c7i0Var2.getClass();
        ch7 ch7Var = ch7.a;
        vn20.a("sportybet").edit().putInt("chat_country_filter", c7i0Var2.a).apply();
        return Unit.a;
    }
}
