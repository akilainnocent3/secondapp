package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class z0b implements gaj<v0b, a, Integer, Unit> {
    public final /* synthetic */ Function2<a, Integer, String> a;
    public final /* synthetic */ gaj<j58, a, Integer, Unit> b;
    public final /* synthetic */ Function0<Unit> c;

    public z0b(Function2 function2, gaj gajVar, Function0 function0) {
        this.a = function2;
        this.b = gajVar;
        this.c = function0;
    }

    @Override // defpackage.gaj
    public final Unit invoke(v0b v0bVar, a aVar, Integer num) {
        v0b v0bVar2 = v0bVar;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar2.M(v0bVar2) ? 4 : 2;
        }
        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            String strInvoke = this.a.invoke(aVar2, 0);
            if (StringsKt.U(strInvoke)) {
                zkn.c("Label must not be blank");
            }
            g1b.c(strInvoke, v0bVar2, d.a.b, this.b, this.c, aVar2, (iIntValue << 6) & 896);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
