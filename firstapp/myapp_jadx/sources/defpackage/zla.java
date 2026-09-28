package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zla implements Function2<a, Integer, Unit> {
    public final /* synthetic */ Object a;

    public zla(w6w<Object> w6wVar, Object obj) {
        this.a = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            throw null;
        }
        aVar2.G();
        return Unit.a;
    }
}
