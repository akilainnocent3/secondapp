package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum fag implements bag {
    PAYSLIP_RS_SHORTCUT("payslip_rs_shortcut"),
    PAYSLIP_IV_SHORTCUT("payslip_iv_shortcut"),
    PAYSLIP_GAME_SHORTCUT("payslip_game_shortcut"),
    D_SUCCESS_POPUP("d_success_popup"),
    D_PENDING_POPUP("d_pending_popup"),
    W_SUCCESS_POPUP("w_success_popup"),
    W_PENDING_POPUP("w_pending_popup"),
    ME("me");

    public final String a;

    fag(String str) {
        this.a = str;
    }

    @Override // defpackage.bag
    public final String K0() {
        return this.a;
    }
}
