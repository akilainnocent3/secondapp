package defpackage;

import com.sportybet.plugin.realsports.betslip.virtualkeyboard.EditTextWithKeyBoard;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;

/* JADX INFO: loaded from: classes7.dex */
public final class l33 implements EditTextWithKeyBoard.a {
    public final /* synthetic */ BetSlipFooter a;
    public final /* synthetic */ mgd0 b;

    public l33(BetSlipFooter betSlipFooter, mgd0 mgd0Var) {
        this.a = betSlipFooter;
        this.b = mgd0Var;
    }

    @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.EditTextWithKeyBoard.a
    public final void b() {
        to3 to3Var = this.a.H;
        if (to3Var != null) {
            to3Var.v();
        }
    }

    @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.EditTextWithKeyBoard.a
    public final void c(boolean z) {
        to3 to3Var = this.a.H;
        if (to3Var != null) {
            String inputData = this.b.M0.getInputData();
            inputData.getClass();
            to3Var.z(inputData, z);
        }
    }

    @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.EditTextWithKeyBoard.a
    public final void f() {
        to3 to3Var = this.a.H;
        if (to3Var != null) {
            to3Var.f();
        }
    }

    @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.EditTextWithKeyBoard.a
    public final void g(String str) {
        to3 to3Var = this.a.H;
        if (to3Var != null) {
            to3Var.g(str);
        }
    }

    @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.EditTextWithKeyBoard.a
    public final void k(String str) {
        str.getClass();
        to3 to3Var = this.a.H;
        if (to3Var != null) {
            to3Var.k(str);
        }
    }

    @Override // com.sportybet.plugin.realsports.betslip.virtualkeyboard.EditTextWithKeyBoard.a
    public final void a() {
    }
}
