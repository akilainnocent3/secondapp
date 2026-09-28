package defpackage;

import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import com.sportygames.commons.views.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportygames.commons.views.MainActivity$removeLoader$1", f = "MainActivity.kt", l = {910}, m = "invokeSuspend", v = 1)
public final class bku extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ MainActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bku(MainActivity mainActivity, v1b<? super bku> v1bVar) {
        super(2, v1bVar);
        this.b = mainActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bku(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bku) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(100L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a(lTGEJfVytU.FhvjQF);
                return null;
            }
            uj50.b(obj);
        }
        MainActivity mainActivity = this.b;
        dn80 dn80Var = (dn80) mainActivity.a;
        if (dn80Var != null) {
            dn80Var.v.setVisibility(8);
        }
        dn80 dn80Var2 = (dn80) mainActivity.a;
        if (dn80Var2 != null) {
            dn80Var2.i.setVisibility(8);
        }
        return Unit.a;
    }
}
