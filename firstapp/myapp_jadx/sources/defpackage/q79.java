package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q79 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, r79.b, aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            case 1:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                en20 en20Var = (en20) qn70Var.a(jq40.a(en20.class), null, null);
                pfd pfdVar = fse.a;
                return new og90(en20Var, odd.b, (b5) qn70Var.a(jq40.a(b5.class), null, null), (yzm) qn70Var.a(jq40.a(yzm.class), null, null));
            default:
                ((Integer) obj).getClass();
                x590 x590Var = (x590) obj2;
                x590Var.getClass();
                return Integer.valueOf(x590Var.a);
        }
    }
}
