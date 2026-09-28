package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.resetpassword.presentation.ResetPasswordViewModel$checkIsLoggedIn$1", f = "ResetPasswordViewModel.kt", l = {136}, m = "invokeSuspend", v = 2)
public final class jd50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ kd50 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd50(v1b v1bVar, kd50 kd50Var, String str, String str2) {
        super(2, v1bVar);
        this.b = kd50Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jd50(v1bVar, this.b, this.c, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jd50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        UiText text;
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        fk50 fk50Var = null;
        kd50 kd50Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            ri7 ri7Var = kd50Var.e;
            this.a = 1;
            obj = ri7Var.a.H0(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        lk50 lk50Var = (lk50) obj;
        if (lk50Var instanceof lk50.c) {
            int i2 = kd50.G;
            ej5.c(o8i0.d(kd50Var), null, null, new ld50(null, kd50Var, this.d, this.c), 3);
        } else {
            lk50Var.getClass();
            if (lk50Var instanceof lk50.a) {
                Throwable th = ((lk50.a) lk50Var).a;
                if (th instanceof fk50) {
                    fk50Var = (fk50) th;
                }
            }
            if (fk50Var == null || (text = fk50Var.getText()) == null) {
                text = vch0.b;
            }
            wwd0 wwd0Var = kd50Var.C;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, dd50.a((dd50) value, null, false, uxs.ENABLE, null, new sb50.a(text, rb50.c.a), 11)));
        }
        return Unit.a;
    }
}
