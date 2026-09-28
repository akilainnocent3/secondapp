package defpackage;

import com.sportybet.feature.gift.gift.presentation.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wf7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wf7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                wwd0 wwd0Var = ((pxy) obj).v;
                Boolean bool = Boolean.FALSE;
                wwd0Var.getClass();
                wwd0Var.k(null, bool);
                break;
            case 1:
                ((Function1) obj).invoke(b.i.a);
                break;
            default:
                ylb0 ylb0Var = (ylb0) obj;
                if (!ylb0Var.I3()) {
                    if (!ylb0Var.F2) {
                        ((x5a0) ylb0Var.P2).setValue(Boolean.FALSE);
                        gvi gviVar = ylb0Var.z;
                        if (gviVar != null) {
                            gviVar.V.setVisibility(8);
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
