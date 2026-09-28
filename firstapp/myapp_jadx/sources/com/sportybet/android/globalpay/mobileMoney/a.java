package com.sportybet.android.globalpay.mobileMoney;

import defpackage.ee;
import defpackage.f0i0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements Function0<Unit> {
    public final /* synthetic */ MobileMoneyDepositFragment a;
    public final /* synthetic */ b b;

    public a(MobileMoneyDepositFragment mobileMoneyDepositFragment, b bVar) {
        this.a = mobileMoneyDepositFragment;
        this.b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ee<f0i0> eeVar = this.a.p0;
        if (eeVar == null) {
            Intrinsics.n("depositMomoPrimaryPhoneOtpLauncher");
            throw null;
        }
        b.c cVar = (b.c) this.b;
        eeVar.b(new f0i0(cVar.a, cVar.b));
        return Unit.a;
    }
}
