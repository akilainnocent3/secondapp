package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class maw implements Function2<a, Integer, Unit> {
    public final /* synthetic */ oaw a;
    public final /* synthetic */ haw b;

    public maw(oaw oawVar, haw hawVar) {
        this.a = oawVar;
        this.b = hawVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            o0z.a(null, null, null, null, null, pp8.b(-687424382, new law(this.a, this.b), aVar2), aVar2, 196608);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
