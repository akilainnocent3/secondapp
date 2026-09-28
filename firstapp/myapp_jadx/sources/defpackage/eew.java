package defpackage;

import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxDetailsV2Activity;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.crash.remote.models.DetailResponseData;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class eew implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eew(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DetailResponseData detailResponseData;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                thw thwVar = (thw) obj;
                int i2 = MultiMakerActivity.E;
                thwVar.getClass();
                tjw tjwVarZ1 = ((MultiMakerActivity) obj2).z1();
                int iOrdinal = thwVar.ordinal();
                if (iOrdinal == 0) {
                    lk50 lk50Var = (lk50) tjwVarZ1.G.getValue();
                    return lk50Var instanceof lk50.c ? tjw.A1((Collection) ((lk50.c) lk50Var).a, (Collection) tjwVarZ1.X.getValue()) : m2g.a;
                }
                if (iOrdinal != 1) {
                    return m2g.a;
                }
                lk50 lk50Var2 = (lk50) tjwVarZ1.H.getValue();
                return lk50Var2 instanceof lk50.c ? tjw.B1((Collection) ((lk50.c) lk50Var2).a, (Collection) tjwVarZ1.Y.getValue()) : m2g.a;
            case 1:
                fd90 fd90Var = (fd90) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if ((loadingState != null ? loadingState.getStatus() : null) != Status.SUCCESS) {
                    return Unit.a;
                }
                HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                if (hTTPResponse == null || (detailResponseData = (DetailResponseData) hTTPResponse.getData()) == null) {
                    return Unit.a;
                }
                fd90Var.g = detailResponseData;
                a6c0 a6c0Var = fd90Var.b;
                Boolean isChristmasTheme = detailResponseData.getIsChristmasTheme();
                Boolean bool = Boolean.TRUE;
                fd90Var.h = new ynj(new znj(Intrinsics.g(isChristmasTheme, bool), Intrinsics.g(detailResponseData.getIsFuguIntegrationEnabled(), bool), Intrinsics.g(detailResponseData.getIsWorldCupThemeEnabled(), bool)), 2);
                boolean zG = Intrinsics.g(detailResponseData.getIsSideBetsEnabled(), bool);
                ((x5a0) a6c0Var.i).setValue(Boolean.valueOf(zG));
                a6c0Var.f(zG);
                fd90Var.f();
                fd90Var.e();
                fd90Var.h();
                return Unit.a;
            default:
                TxDetailsV2Activity txDetailsV2Activity = (TxDetailsV2Activity) obj2;
                c2h0 c2h0Var = (c2h0) obj;
                int i3 = TxDetailsV2Activity.v;
                c2h0Var.getClass();
                if (c2h0Var.equals(c2h0.a.C0152a.a)) {
                    d900 d900Var = txDetailsV2Activity.f;
                    if (d900Var == null) {
                        Intrinsics.n("paymentRouter");
                        throw null;
                    }
                    d900Var.g();
                } else if (c2h0Var.equals(c2h0.a.c.a)) {
                    d0n d0nVar = txDetailsV2Activity.d;
                    if (d0nVar == null) {
                        Intrinsics.n("utils");
                        throw null;
                    }
                    d0nVar.b(txDetailsV2Activity, snb0.WITHDRAW);
                } else if (!c2h0Var.equals(c2h0.a.b.a) && !c2h0Var.equals(c2h0.b.a)) {
                    uhc.a();
                    return null;
                }
                return Unit.a;
        }
    }
}
