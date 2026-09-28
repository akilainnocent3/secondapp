package defpackage;

import com.sportybet.plugin.realsports.data.local.BetSlipDataStore;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetSettingDialogHelper$BetSettingBottomSheetDialog$initDefaultGift$defaultGiftChange$1", f = "BetSettingDialogHelper.kt", l = {HttpStatusCodesKt.HTTP_TEMP_REDIRECT}, m = "invokeSuspend", v = 2)
public final class nz2 extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    public int a;
    public final /* synthetic */ qz2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz2(qz2 qz2Var, v1b<? super nz2> v1bVar) {
        super(2, v1bVar);
        this.b = qz2Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nz2(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((nz2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        BetSlipDataStore betSlipDataStore = this.b.i;
        if (betSlipDataStore == null) {
            Intrinsics.n("betSlipDataStore");
            throw null;
        }
        wm20<Boolean> betSlipDefaultGift = betSlipDataStore.getBetSlipDefaultGift();
        Boolean bool = Boolean.TRUE;
        this.a = 1;
        Object objE = betSlipDefaultGift.e(this, bool);
        return objE == y5bVar ? y5bVar : objE;
    }
}
