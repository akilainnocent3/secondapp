package defpackage;

import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import kotlin.Unit;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.GetPlaceBetConfigFlowUseCase$invoke$refreshTriggers$1", f = "GetPlaceBetConfigFlowUseCase.kt", l = {HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "invokeSuspend", v = 2)
public final class vbk extends tje0 implements gaj<myh<? super qcn<? extends ocq>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super qcn<? extends ocq>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        vbk vbkVar = new vbk(3, v1bVar);
        vbkVar.b = myhVar;
        return vbkVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            n1a0 n1a0Var = n1a0.c;
            this.b = null;
            this.a = 1;
            if (myhVar.emit(n1a0Var, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a(LGxrN.sPrbISzNmr);
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
