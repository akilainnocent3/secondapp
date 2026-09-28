package defpackage;

import android.content.Context;
import com.sportygames.commons.models.ComposeCoeffModel;
import com.sportygames.sportyherov2.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ebc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ebc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                urr urrVar = (urr) obj;
                urrVar.getClass();
                ((Function1) obj2).invoke(Integer.valueOf((int) (urrVar.a() & 4294967295L)));
                break;
            case 1:
                zxq zxqVar = (zxq) obj;
                zxqVar.getClass();
                ((Function1) obj2).invoke(zxqVar);
                break;
            default:
                wcg0 wcg0Var = (wcg0) obj2;
                MultiplierResponse multiplierResponse = (MultiplierResponse) q97.a(MultiplierResponse.class, (String) obj);
                Context context = wcg0Var.getContext();
                ytw<ComposeCoeffModel> ytwVar = wcg0Var.C;
                if (context != null) {
                    String messageType = multiplierResponse.getMessageType();
                    if (Intrinsics.g(messageType, "ROUND_ONGOING")) {
                        ((x5a0) ytwVar).setValue(new ComposeCoeffModel(yk10.a(multiplierResponse.getCurrentMultiplier(), "x"), new j58(a6g0.g), null));
                    } else if (Intrinsics.g(messageType, "ROUND_END_WAIT")) {
                        ((x5a0) ytwVar).setValue(new ComposeCoeffModel(yk10.a(multiplierResponse.getCurrentMultiplier(), "x"), new j58(a6g0.f), null));
                    } else {
                        ((x5a0) ytwVar).setValue(new ComposeCoeffModel("0.00x", new j58(a6g0.g), null));
                    }
                }
                break;
        }
        return Unit.a;
    }
}
