package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.feature.country.ChangeRegionViewModel$doChange$1", f = "ChangeRegionViewModel.kt", l = {41}, m = "invokeSuspend", v = 2)
public final class t57 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ s57 b;
    public final /* synthetic */ CountryCodeName c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t57(s57 s57Var, CountryCodeName countryCodeName, v1b<? super t57> v1bVar) {
        super(2, v1bVar);
        this.b = s57Var;
        this.c = countryCodeName;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t57(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t57) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            r57 r57Var = this.b.a;
            this.a = 1;
            if (r57Var.a(this.c, this) == y5bVar) {
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
