package defpackage;

import com.sportygames.crashInitiated.model.response.CrashInitiatedPlaceBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.CrashInitiatedFragment$setCashoutData$1", f = "CrashInitiatedFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class unb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ zqy a;
    public final /* synthetic */ CrashInitiatedPlaceBetResponse b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unb(v1b v1bVar, zqy zqyVar, CrashInitiatedPlaceBetResponse crashInitiatedPlaceBetResponse) {
        super(2, v1bVar);
        this.a = zqyVar;
        this.b = crashInitiatedPlaceBetResponse;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new unb(v1bVar, this.a, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((unb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zqy zqyVar = this.a;
        boolean zBooleanValue = ((Boolean) ((x5a0) zqyVar.R).getValue()).booleanValue();
        CrashInitiatedPlaceBetResponse crashInitiatedPlaceBetResponse = this.b;
        try {
            if (zBooleanValue) {
                tnb tnbVar = new tnb(null, zqyVar, crashInitiatedPlaceBetResponse);
                nas nasVarA = ebs.a(zqyVar.getLifecycle());
                pfd pfdVar = fse.a;
                ej5.c(nasVarA, gku.a, null, new hnb(zqyVar, tnbVar, null), 2);
            } else {
                xnb xnbVar = new xnb(null, zqyVar, crashInitiatedPlaceBetResponse);
                nas nasVarA2 = ebs.a(zqyVar.getLifecycle());
                pfd pfdVar2 = fse.a;
                ej5.c(nasVarA2, gku.a, null, new hnb(zqyVar, xnbVar, null), 2);
            }
        } catch (Exception unused) {
        }
        return Unit.a;
    }
}
