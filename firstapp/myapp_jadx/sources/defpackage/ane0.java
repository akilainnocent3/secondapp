package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ane0 implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ ane0(String str, Function0 function0) {
        this.a = str;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            dne0.a(0, aVar, null, this.a, this.b);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
