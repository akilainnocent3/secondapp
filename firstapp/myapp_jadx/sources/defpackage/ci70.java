package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ci70 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        bi70 bi70Var = (bi70) obj;
        bi70Var.getClass();
        z370 z370Var = bi70Var.d;
        String str = z370Var.c;
        String str2 = z370Var.f;
        String str3 = bi70Var.e.c;
        ad70 ad70Var = bi70Var.f;
        BigDecimal bigDecimal = ad70Var.b;
        BigDecimal bigDecimal2 = ad70Var.c;
        StringBuilder sbA = ux5.a(str, " vs ", str2, ", market: ", str3);
        sbA.append(", odds: ");
        sbA.append(bigDecimal);
        sbA.append(", probability: ");
        sbA.append(bigDecimal2);
        return sbA.toString();
    }
}
