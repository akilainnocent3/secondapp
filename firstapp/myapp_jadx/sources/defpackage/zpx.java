package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.newCode.viewmodel.NewCustomCodeViewModel$onCodeValueChange$1", f = "NewCustomCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class zpx extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ cqx a;
    public final /* synthetic */ ijf0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpx(cqx cqxVar, ijf0 ijf0Var, v1b<? super zpx> v1bVar) {
        super(2, v1bVar);
        this.a = cqxVar;
        this.b = ijf0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zpx(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zpx) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        cqx cqxVar = this.a;
        String str = ((wpx) cqxVar.b.a.getValue()).b;
        ijf0 ijf0Var = this.b;
        String strA0 = StringsKt.a0(ijf0Var.a.b, str);
        wwd0 wwd0Var = cqxVar.a;
        wpx wpxVar = (wpx) cqxVar.b.a.getValue();
        boolean z2 = str.length() + strA0.length() <= 25;
        for (int i = 0; i < strA0.length(); i++) {
            char cCharAt = strA0.charAt(i);
            if (!Character.isDigit(cCharAt) && ('a' > cCharAt || cCharAt >= '{')) {
                z = false;
                wpx wpxVarA = wpx.a(wpxVar, null, null, null, null, ijf0Var, false, z2, z, false, 303);
                wwd0Var.getClass();
                wwd0Var.k(null, wpxVarA);
                return Unit.a;
            }
        }
        z = true;
        wpx wpxVarA2 = wpx.a(wpxVar, null, null, null, null, ijf0Var, false, z2, z, false, 303);
        wwd0Var.getClass();
        wwd0Var.k(null, wpxVarA2);
        return Unit.a;
    }
}
