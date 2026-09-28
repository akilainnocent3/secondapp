package defpackage;

import androidx.compose.foundation.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        okd okdVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                g2 g2Var = (g2) obj;
                ifn ifnVar = (ifn) zma.a(g2Var, g.a);
                if (!(ifnVar instanceof mfn)) {
                    zkn.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: " + ifnVar);
                }
                mfn mfnVar = g2Var.N;
                mfn mfnVar2 = (mfn) ifnVar;
                g2Var.N = mfnVar2;
                if (mfnVar != null && !Intrinsics.g(mfnVar2, mfnVar) && ((okdVar = g2Var.P) != null || !g2Var.V)) {
                    if (okdVar != null) {
                        g2Var.q2(okdVar);
                    }
                    g2Var.P = null;
                    g2Var.x2();
                }
                break;
            default:
                yfx.h((hjx) obj, c2d.j.INSTANCE, null, 6);
                break;
        }
        return Unit.a;
    }
}
