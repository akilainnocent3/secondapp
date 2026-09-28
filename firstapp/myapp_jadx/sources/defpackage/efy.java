package defpackage;

import com.sporty.android.core.model.patron.KycHintExtra;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.domain.ObserveMeScreenAssetsUseCase$kycHintStateFlow$1", f = "ObserveMeScreenAssetsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class efy extends tje0 implements iaj<Integer, Integer, KycHintExtra, v1b<? super zsp>, Object> {
    public /* synthetic */ int a;
    public /* synthetic */ int b;
    public /* synthetic */ KycHintExtra c;

    @Override // defpackage.iaj
    public final Object d(Integer num, Integer num2, KycHintExtra kycHintExtra, v1b<? super zsp> v1bVar) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        efy efyVar = new efy(4, v1bVar);
        efyVar.a = iIntValue;
        efyVar.b = iIntValue2;
        efyVar.c = kycHintExtra;
        return efyVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = this.b;
        KycHintExtra kycHintExtra = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return btp.a(i, i2, kycHintExtra.getRejectTitle(), kycHintExtra.getRejectReason());
    }
}
