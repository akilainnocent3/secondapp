package com.sportybet.android.sportypin;

import defpackage.snb0;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements e.a {
    public final /* synthetic */ VerifyResetPinActivity a;

    public h(VerifyResetPinActivity verifyResetPinActivity) {
        this.a = verifyResetPinActivity;
    }

    @Override // com.sportybet.android.sportypin.e.a
    public final void a() {
        int i = VerifyResetPinActivity.H;
        VerifyResetPinActivity verifyResetPinActivity = this.a;
        verifyResetPinActivity.G.b(verifyResetPinActivity, snb0.RESET_PIN);
    }

    @Override // com.sportybet.android.sportypin.e.a
    public final void onDismiss() {
        int i = VerifyResetPinActivity.H;
        VerifyResetPinActivity verifyResetPinActivity = this.a;
        verifyResetPinActivity.setResult(4001);
        verifyResetPinActivity.finish();
    }
}
