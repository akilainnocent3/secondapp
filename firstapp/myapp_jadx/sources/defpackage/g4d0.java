package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.penalty.handler.SportyPenaltySingleBetHandlerImpl$init$1", f = "SportyPenaltySingleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g4d0 extends tje0 implements Function2<List<? extends e1d0>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ j4d0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4d0(j4d0 j4d0Var, v1b<? super g4d0> v1bVar) {
        super(2, v1bVar);
        this.b = j4d0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        g4d0 g4d0Var = new g4d0(this.b, v1bVar);
        g4d0Var.a = obj;
        return g4d0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends e1d0> list, v1b<? super Unit> v1bVar) {
        return ((g4d0) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        Object value2;
        Object next;
        List<e1d0> list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        j4d0 j4d0Var = this.b;
        nzm nzmVar = j4d0Var.b;
        wwd0 wwd0Var = j4d0Var.e;
        CharSequence charSequenceJ = (CharSequence) wwd0Var.getValue();
        if (StringsKt.U(charSequenceJ)) {
            charSequenceJ = nzmVar.j();
            charSequenceJ.getClass();
        }
        String str = (String) charSequenceJ;
        wwd0 wwd0Var2 = j4d0Var.d;
        do {
            value = wwd0Var2.getValue();
            List list2 = (List) value;
            arrayList = new ArrayList(l48.r(list, 10));
            for (e1d0 e1d0Var : list) {
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.g(((f4d0) next).a, e1d0Var));
                f4d0 f4d0Var = (f4d0) next;
                if (f4d0Var == null) {
                    f4d0Var = new f4d0(e1d0Var, str);
                }
                arrayList.add(f4d0Var);
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
