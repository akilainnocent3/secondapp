package defpackage;

import com.sporty.android.platform.features.kyc.domain.uploadfile.KycFileSubmissionBottomSheetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ssp implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ssp(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                KycFileSubmissionBottomSheetActivity kycFileSubmissionBottomSheetActivity = (KycFileSubmissionBottomSheetActivity) obj2;
                ftp ftpVar = (ftp) obj;
                azm azmVar = kycFileSubmissionBottomSheetActivity.b;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar.d(ftpVar == ftp.a ? wae.PAYSTACK_TRANS : wae.DEPOSIT);
                kycFileSubmissionBottomSheetActivity.finish();
                return Unit.a;
            default:
                ((Function1) obj2).invoke(((fpg0) ((ytw) obj).getValue()).b);
                return Unit.a;
        }
    }
}
