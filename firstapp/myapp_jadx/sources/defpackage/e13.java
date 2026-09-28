package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e13 implements Function0 {
    public final /* synthetic */ mgd0 a;
    public final /* synthetic */ imn b;

    public /* synthetic */ e13(mgd0 mgd0Var, imn imnVar) {
        this.a = mgd0Var;
        this.b = imnVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = BetSlipFooter.j0;
        this.a.j0.setInputData(this.b.a);
        return Unit.a;
    }
}
