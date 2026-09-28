package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class tsc implements Function2<a, Integer, Unit> {
    public final /* synthetic */ ytw<String> a;

    public tsc(ytw<String> ytwVar) {
        this.a = ytwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            ytw<String> ytwVar = this.a;
            if (StringsKt.U(ytwVar.getValue())) {
                aVar2.N(-1548950640);
            } else {
                aVar2.N(-327061465);
                lkf0.d(ytwVar.getValue(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 262142);
                aVar2 = aVar2;
            }
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
