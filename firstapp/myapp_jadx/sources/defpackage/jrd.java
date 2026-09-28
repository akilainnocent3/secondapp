package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class jrd implements Function2<a, Integer, Unit> {
    public final /* synthetic */ String a;

    public jrd(String str) {
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            oqd.a(0, 2, aVar2, null, this.a);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
