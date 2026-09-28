package defpackage;

import com.sporty.android.platform.features.kyc.domain.uploadfile.KycFileSubmissionBottomSheetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s32 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s32(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (w8i0) ((Function0) obj).invoke();
            case 1:
                KycFileSubmissionBottomSheetActivity.a aVar = KycFileSubmissionBottomSheetActivity.c;
                ((KycFileSubmissionBottomSheetActivity) obj).finish();
                return Unit.a;
            default:
                ((Function1) obj).invoke(new pze0.b(c0f0.d.a));
                return Unit.a;
        }
    }
}
