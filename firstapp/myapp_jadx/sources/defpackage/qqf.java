package defpackage;

import android.content.Intent;
import com.sporty.android.core.model.patron.KycSource;
import com.sportybet.plugin.realsports.home.KycRejectBottomSheetActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qqf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qqf(int i, Object obj, Object obj2) {
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
                ((Function1) obj2).invoke(((ijf0) ((ytw) obj).getValue()).a.b);
                return Unit.a;
            case 1:
                KycRejectBottomSheetActivity kycRejectBottomSheetActivity = (KycRejectBottomSheetActivity) obj2;
                KycSource kycSource = (KycSource) obj;
                lsp lspVar = kycRejectBottomSheetActivity.c;
                if (lspVar == null) {
                    Intrinsics.n("kycEntryNavigator");
                    throw null;
                }
                Intent intentB = lspVar.b(kycRejectBottomSheetActivity, kycSource, null);
                if (intentB != null) {
                    kycRejectBottomSheetActivity.startActivity(intentB);
                }
                kycRejectBottomSheetActivity.finish();
                return Unit.a;
            default:
                ((Function1) obj2).invoke(((ove0.a) ((m0f0) obj).b).e);
                return Unit.a;
        }
    }
}
