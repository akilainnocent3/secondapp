package defpackage;

import com.sportybet.android.globalpay.pixBtg.withdraw.g;
import com.sportybet.android.globalpay.pixBtg.withdraw.h;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.withdraw.PixBtgWithdrawViewModel$loadDescriptionLinesHints$1", f = "PixBtgWithdrawViewModel.kt", l = {432}, m = "invokeSuspend", v = 2)
public final class gd10 extends tje0 implements Function1<v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd10(h hVar, v1b<? super gd10> v1bVar) {
        super(1, v1bVar);
        this.b = hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new gd10(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Unit> v1bVar) {
        return ((gd10) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        h hVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            w9e w9eVar = hVar.i;
            String strValueOf = String.valueOf(hVar.F.a);
            this.a = 1;
            obj = w9eVar.c(strValueOf, this);
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
        b0o b0oVar = new b0o((List) obj, 1);
        wwd0 wwd0Var = hVar.D;
        et7 et7VarD = o8i0.d(hVar);
        wwd0Var.getClass();
        g.a(wwd0Var, et7VarD, new vc10(b0oVar, 0));
        return Unit.a;
    }
}
