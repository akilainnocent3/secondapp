package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$6", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z2u extends tje0 implements Function2<qsv, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b3u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2u(v1b v1bVar, b3u b3uVar) {
        super(2, v1bVar);
        this.b = b3uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        z2u z2uVar = new z2u(v1bVar, this.b);
        z2uVar.a = obj;
        return z2uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(qsv qsvVar, v1b<? super Unit> v1bVar) {
        return ((z2u) create(qsvVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        gtt.a aVar;
        qsv qsvVar = (qsv) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = qsvVar instanceof qsv.c;
        b3u b3uVar = this.b;
        if (z) {
            wwd0 wwd0Var = b3uVar.I;
            y0u.b bVar = new y0u.b(((qsv.c) qsvVar).a);
            wwd0Var.getClass();
            wwd0Var.k(null, bVar);
        } else if (qsvVar instanceof qsv.b) {
            qsv.b bVar2 = (qsv.b) qsvVar;
            b3uVar.E.a(new jgm.d(bVar2.a, bVar2.b));
        } else {
            if (!(qsvVar instanceof qsv.a)) {
                uhc.a();
                return null;
            }
            wwd0 wwd0Var2 = b3uVar.e0;
            do {
                value = wwd0Var2.getValue();
                aVar = gtt.a.a;
                StringUiText stringUiText = vch0.a;
            } while (!wwd0Var2.g(value, new myt(aVar, new kst.c(new ResourceUiText(R.string.common_functions__error), ((qsv.a) qsvVar).a, igm.l.a), 252)));
        }
        return Unit.a;
    }
}
