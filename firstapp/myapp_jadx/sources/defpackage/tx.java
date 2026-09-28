package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tx extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        yx yxVar = (yx) this.receiver;
        String string = StringsKt.t0((String) yxVar.c.getValue()).toString();
        if (!StringsKt.U(string) && !((Boolean) yxVar.i.getValue()).booleanValue()) {
            String string2 = StringsKt.t0((String) yxVar.e.getValue()).toString();
            if (StringsKt.U(string2)) {
                string2 = null;
            }
            ej5.c(o8i0.d(yxVar), null, null, new xx(yxVar, string, string2, null), 3);
        }
        return Unit.a;
    }
}
