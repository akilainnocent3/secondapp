package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lwc implements Function2<a, Integer, Unit> {
    public final /* synthetic */ rbn a;
    public final /* synthetic */ String b;

    public lwc(rbn rbnVar, String str) {
        this.a = rbnVar;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            h6n.a(this.a, this.b, null, 0L, aVar2, 0, 12);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
