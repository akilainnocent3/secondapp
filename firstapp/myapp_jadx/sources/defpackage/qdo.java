package defpackage;

import com.sportybet.android.instantwin.router.instantwin.InstantWinInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.InstantWinConfigViewModel$fetchConfigs$1", f = "InstantWinConfigViewModel.kt", l = {98}, m = "invokeSuspend", v = 2)
public final class qdo extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ wdo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qdo(wdo wdoVar, v1b<? super qdo> v1bVar) {
        super(2, v1bVar);
        this.b = wdoVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qdo(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qdo) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wdo wdoVar = this.b;
        InstantWinInput instantWinInput = wdoVar.v;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            d4p d4pVar = wdoVar.d;
            String str = instantWinInput != null ? instantWinInput.a : null;
            if (str == null) {
                str = "";
            }
            kzh.d(new yzh(new g1i(d4pVar.a.q(str), new rdo(wdoVar, null)), new sdo(wdoVar, null)), o8i0.d(wdoVar));
            String str2 = instantWinInput != null ? instantWinInput.a : null;
            String str3 = str2 != null ? str2 : "";
            this.a = 1;
            if (wdoVar.x1(str3, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
