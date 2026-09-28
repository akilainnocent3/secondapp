package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.sportynews.ui.SportyNewsArticleDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mt40 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mt40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                nt40 nt40Var = (nt40) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                nt40Var.b = OtpData.RegisterBrazil.a((OtpData.RegisterBrazil) nt40Var.B1(), oTPResult);
                return Unit.a;
            default:
                String str = (String) obj;
                ohp<Object>[] ohpVarArr = SportyNewsArticleDetailFragment.N;
                str.getClass();
                azm azmVar = ((SportyNewsArticleDetailFragment) obj2).H;
                if (azmVar != null) {
                    azm.c(azmVar, str, null, null, 6);
                    return Unit.a;
                }
                Intrinsics.n("router");
                throw null;
        }
    }
}
