package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fuf extends saj implements Function1<ijf0, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ijf0 ijf0Var) {
        ijf0 ijf0Var2 = ijf0Var;
        ijf0Var2.getClass();
        muf mufVar = (muf) this.receiver;
        mufVar.getClass();
        juf.c cVarZ1 = mufVar.z1();
        if (cVarZ1 != null) {
            Pair<UiText, UiText> pairA1 = mufVar.A1(cVarZ1.c.a.b, ijf0Var2.a.b);
            wwd0 wwd0Var = mufVar.a;
            juf.c cVarA = juf.c.a(cVarZ1, null, pairA1.a, ijf0Var2, pairA1.b, false, 151);
            wwd0Var.getClass();
            wwd0Var.k(null, cVarA);
        }
        return Unit.a;
    }
}
