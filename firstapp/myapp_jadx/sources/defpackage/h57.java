package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.passwordentry.impl.presentation.ChangePasswordViewModel$changePassword$1", f = "ChangePasswordViewModel.kt", l = {107}, m = "invokeSuspend", v = 2)
public final class h57 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i57 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h57(i57 i57Var, String str, v1b<? super h57> v1bVar) {
        super(2, v1bVar);
        this.b = i57Var;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new h57(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h57) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objZ0;
        String message;
        Object value2;
        Object value3;
        y5b y5bVar = y5b.a;
        int i = this.a;
        i57 i57Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = i57Var.d;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, tvz.a((tvz) value, null, null, null, false, xce0.c.a, null, null, false, 239)));
            lyz lyzVar = i57Var.a;
            String str = i57Var.v;
            this.a = 1;
            objZ0 = lyzVar.z0(str, this.c, this);
            if (objZ0 == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objZ0 = obj;
        }
        lk50 lk50Var = (lk50) objZ0;
        if (lk50Var instanceof lk50.c) {
            i57Var.w = new g57(i57Var);
            wwd0 wwd0Var2 = i57Var.d;
            do {
                value3 = wwd0Var2.getValue();
            } while (!wwd0Var2.g(value3, tvz.a((tvz) value3, null, null, null, false, xce0.d.a, null, null, true, 111)));
        } else if (lk50Var instanceof lk50.a) {
            Throwable th = ((lk50.a) lk50Var).a;
            SprThrowable sprThrowable = th instanceof SprThrowable ? (SprThrowable) th : null;
            if ((sprThrowable == null || (message = sprThrowable.getE()) == null) && (message = th.getMessage()) == null) {
                message = "";
            }
            String str2 = message;
            wwd0 wwd0Var3 = i57Var.d;
            do {
                value2 = wwd0Var3.getValue();
            } while (!wwd0Var3.g(value2, tvz.a((tvz) value2, null, null, null, false, new xce0.a(str2), str2, null, false, 207)));
            itf0.a aVar = itf0.a;
            aVar.q("ChangePasswordVM");
            aVar.f(th, "changePassword failed", new Object[0]);
        } else if (!(lk50Var instanceof lk50.b)) {
            uhc.a();
            return null;
        }
        return Unit.a;
    }
}
