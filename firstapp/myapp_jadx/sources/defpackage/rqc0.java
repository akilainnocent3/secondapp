package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.presentation.legends.d;
import com.sportybet.android.instantwin.router.sportylegends.SportyLegendsInput;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.SportyLegendsViewModel$observeSessionDataStatusFlow$3", f = "SportyLegendsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rqc0 extends tje0 implements Function2<bkc0.c, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqc0(v1b v1bVar, d dVar) {
        super(2, v1bVar);
        this.b = dVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rqc0 rqc0Var = new rqc0(v1bVar, this.b);
        rqc0Var.a = obj;
        return rqc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bkc0.c cVar, v1b<? super Unit> v1bVar) {
        return ((rqc0) create(cVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        SportyLegendsInput sportyLegendsInput;
        BetBuilderConfig betBuilderConfig;
        jmc0 jmc0Var;
        List<icc0> list;
        bkc0.c cVar = (bkc0.c) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        pjc0 pjc0Var = cVar.a;
        d dVar = this.b;
        goc0 goc0Var = dVar.E;
        fac0 fac0Var = dVar.C;
        jpk jpkVar = dVar.e;
        imc0 imc0Var = pjc0Var.a;
        jpkVar.R0(imc0Var.e);
        jpkVar.T0(imc0Var.b);
        hcc0 hcc0Var = pjc0Var.c;
        if (hcc0Var != null) {
            fac0Var.j(hcc0Var.a.a);
        }
        fac0Var.i((hcc0Var == null || (list = hcc0Var.b) == null) ? null : (icc0) CollectionsKt.firstOrNull(list));
        if (cVar.b == uhc0.b) {
            wwd0 wwd0Var = dVar.c0;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, null));
            goc0Var.f(new jqc0(false, kqc0.d));
            xnc0 xnc0Var = (xnc0) e1i.b(goc0Var.b).a.getValue();
            if (xnc0Var.b == null && xnc0Var.c == null && hcc0Var != null && (jmc0Var = hcc0Var.c) != null) {
                cnc0 cnc0Var = jmc0Var.a;
                String str = cnc0Var.a;
                enc0 enc0Var = StringsKt.U(str) ? null : new enc0(str, cnc0Var.b, "", cnc0Var.c, false, cnc0Var.m, null);
                cnc0 cnc0Var2 = jmc0Var.b;
                String str2 = cnc0Var2.a;
                enc0 enc0Var2 = StringsKt.U(str2) ? null : new enc0(str2, cnc0Var2.b, "", cnc0Var2.c, false, cnc0Var2.m, null);
                if (enc0Var != null || enc0Var2 != null) {
                    goc0Var.e(new xnc0(enc0Var, enc0Var2, 1));
                }
            }
            if (!dVar.f0 && (sportyLegendsInput = dVar.R) != null && sportyLegendsInput.b && (betBuilderConfig = pjc0Var.d) != null && betBuilderConfig.active) {
                dVar.f0 = true;
                fac0Var.g(true);
            }
        } else {
            ej5.c(o8i0.d(dVar), null, null, new xqc0(dVar, cVar, null), 3);
        }
        return Unit.a;
    }
}
