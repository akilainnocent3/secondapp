package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.handler.SportyLegendsSingleBetHandlerImpl$init$1", f = "SportyLegendsSingleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class emc0 extends tje0 implements Function2<List<? extends kjc0>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ hmc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emc0(hmc0 hmc0Var, v1b<? super emc0> v1bVar) {
        super(2, v1bVar);
        this.b = hmc0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        emc0 emc0Var = new emc0(this.b, v1bVar);
        emc0Var.a = obj;
        return emc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends kjc0> list, v1b<? super Unit> v1bVar) {
        return ((emc0) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        Object value2;
        Object next;
        List<kjc0> list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        hmc0 hmc0Var = this.b;
        nzm nzmVar = hmc0Var.b;
        wwd0 wwd0Var = hmc0Var.e;
        CharSequence charSequenceJ = (CharSequence) wwd0Var.getValue();
        if (StringsKt.U(charSequenceJ)) {
            charSequenceJ = nzmVar.j();
            charSequenceJ.getClass();
        }
        String str = (String) charSequenceJ;
        wwd0 wwd0Var2 = hmc0Var.d;
        do {
            value = wwd0Var2.getValue();
            List list2 = (List) value;
            arrayList = new ArrayList(l48.r(list, 10));
            for (kjc0 kjc0Var : list) {
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.g(((dmc0) next).a, kjc0Var));
                dmc0 dmc0Var = (dmc0) next;
                if (dmc0Var == null) {
                    dmc0Var = new dmc0(kjc0Var, str);
                }
                arrayList.add(dmc0Var);
            }
        } while (!wwd0Var2.g(value, arrayList));
        String strJ = nzmVar.j();
        strJ.getClass();
        if (list.isEmpty()) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, strJ));
        }
        return Unit.a;
    }
}
