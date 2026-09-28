package defpackage;

import com.sportybet.plugin.realsports.searchv2.domain.model.SearchFeatureConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.presentation.SearchViewModel$2", f = "SearchViewModel.kt", l = {161}, m = "invokeSuspend", v = 2)
public final class t180 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public l280 a;
    public int b;
    public final /* synthetic */ l280 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t180(l280 l280Var, v1b<? super t180> v1bVar) {
        super(2, v1bVar);
        this.c = l280Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t180(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t180) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        l280 l280Var;
        l280 l280Var2 = this.c;
        String str = l280Var2.C;
        eu70 eu70Var = l280Var2.B;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            idk idkVar = l280Var2.c;
            this.a = l280Var2;
            this.b = 1;
            obj = idkVar.a.a(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            l280Var = l280Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l280Var = this.a;
            uj50.b(obj);
        }
        l280Var.D = (SearchFeatureConfig) obj;
        rdd0 rdd0Var = eu70Var.a;
        xw70 xw70Var = new xw70(eu70Var.b.getLanguageCode(null));
        k00 k00Var = k00.d;
        rdd0Var.a(xw70Var, k00Var);
        if (str.length() >= l280Var2.D.getMinQueryLength()) {
            String str2 = l280Var2.J;
            eu70Var.getClass();
            str.getClass();
            str2.getClass();
            eu70Var.a.a(new du70(str, str2), k00Var);
        }
        return Unit.a;
    }
}
