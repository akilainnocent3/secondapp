package defpackage;

import com.sportybet.android.globalpay.kyc.za.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nwu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nwu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                MatchEventActivity matchEventActivity = (MatchEventActivity) obj;
                int i2 = MatchEventActivity.a0;
                matchEventActivity.finish();
                azm azmVar = matchEventActivity.X;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                azmVar.d(wae.VIRTUALS_LOBBY);
                matchEventActivity.U1(new a5o.c(0));
                return Unit.a;
            case 1:
                return Integer.valueOf(((mi30) obj).c.getColor(R.color.text_type2_primary));
            default:
                a aVar = (a) obj;
                a.InterfaceC0227a interfaceC0227a = aVar.a;
                if (interfaceC0227a != null) {
                    interfaceC0227a.a(wae.KYC);
                }
                aVar.dismiss();
                return Unit.a;
        }
    }
}
