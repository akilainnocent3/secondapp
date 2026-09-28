package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sx90 implements Function2 {
    public final /* synthetic */ boolean a;

    public /* synthetic */ sx90(boolean z) {
        this.a = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            wx90.a(this.a, aVar, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
