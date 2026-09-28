package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p79 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ p79(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mlo.a(0, 0, r79.a, aVar, 384);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new zav((b5) qn70Var.a(jq40.a(b5.class), null, null), (mum) qn70Var.a(jq40.a(mum.class), null, null), (rum) qn70Var.a(jq40.a(rum.class), null, null), (ktm) qn70Var.a(jq40.a(ktm.class), null, null), (fzm) qn70Var.a(jq40.a(fzm.class), null, null), (ezm) qn70Var.a(jq40.a(ezm.class), null, null));
        }
    }
}
