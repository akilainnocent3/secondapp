package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.racingevent.handler.InstantRacingSingleBetHandlerImpl$init$1", f = "InstantRacingSingleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y3o extends tje0 implements Function2<List<? extends h3o>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b4o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3o(b4o b4oVar, v1b<? super y3o> v1bVar) {
        super(2, v1bVar);
        this.b = b4oVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        y3o y3oVar = new y3o(this.b, v1bVar);
        y3oVar.a = obj;
        return y3oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends h3o> list, v1b<? super Unit> v1bVar) {
        return ((y3o) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        Object value2;
        Object next;
        List<h3o> list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        b4o b4oVar = this.b;
        nzm nzmVar = b4oVar.b;
        wwd0 wwd0Var = b4oVar.e;
        CharSequence charSequenceJ = (CharSequence) wwd0Var.getValue();
        if (StringsKt.U(charSequenceJ)) {
            charSequenceJ = nzmVar.j();
            charSequenceJ.getClass();
        }
        String str = (String) charSequenceJ;
        wwd0 wwd0Var2 = b4oVar.d;
        do {
            value = wwd0Var2.getValue();
            List list2 = (List) value;
            arrayList = new ArrayList(l48.r(list, 10));
            for (h3o h3oVar : list) {
                Iterator it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.g(((x3o) next).a, h3oVar));
                x3o x3oVar = (x3o) next;
                if (x3oVar == null) {
                    x3oVar = new x3o(h3oVar, str);
                }
                arrayList.add(x3oVar);
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
