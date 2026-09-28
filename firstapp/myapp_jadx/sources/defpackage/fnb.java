package defpackage;

import com.sportygames.crashInitiated.model.response.CrashInitiatedCoeffListResponse;
import com.sportygames.crashInitiated.model.response.CrashInitiatedPlaceBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$animateHouseCoeffList$1", f = "CrashInitiatedFragment.kt", l = {2865}, m = "invokeSuspend", v = 1)
public final class fnb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ CrashInitiatedPlaceBetResponse b;
    public final /* synthetic */ zqy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnb(v1b v1bVar, zqy zqyVar, CrashInitiatedPlaceBetResponse crashInitiatedPlaceBetResponse) {
        super(2, v1bVar);
        this.b = crashInitiatedPlaceBetResponse;
        this.c = zqyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fnb(v1bVar, this.c, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fnb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Double houseCoefficient;
        Double houseCoefficient2;
        Double userCoefficient;
        Double houseCoefficient3;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(1500L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        double dDoubleValue = 0.0d;
        CrashInitiatedPlaceBetResponse crashInitiatedPlaceBetResponse = this.b;
        boolean z = ((crashInitiatedPlaceBetResponse == null || (houseCoefficient3 = crashInitiatedPlaceBetResponse.getHouseCoefficient()) == null) ? 0.0d : houseCoefficient3.doubleValue()) >= ((crashInitiatedPlaceBetResponse == null || (userCoefficient = crashInitiatedPlaceBetResponse.getUserCoefficient()) == null) ? 0.0d : userCoefficient.doubleValue());
        zqy zqyVar = this.c;
        zqyVar.x0.add(new CrashInitiatedCoeffListResponse((crashInitiatedPlaceBetResponse == null || (houseCoefficient2 = crashInitiatedPlaceBetResponse.getHouseCoefficient()) == null) ? 0.0d : houseCoefficient2.doubleValue(), z, false));
        if (crashInitiatedPlaceBetResponse != null) {
            crashInitiatedPlaceBetResponse.getHouseCoefficient();
        }
        ytw<CrashInitiatedCoeffListResponse> ytwVar = zqyVar.s0().D;
        if (crashInitiatedPlaceBetResponse != null && (houseCoefficient = crashInitiatedPlaceBetResponse.getHouseCoefficient()) != null) {
            dDoubleValue = houseCoefficient.doubleValue();
        }
        ((x5a0) ytwVar).setValue(new CrashInitiatedCoeffListResponse(dDoubleValue, z, true));
        return Unit.a;
    }
}
