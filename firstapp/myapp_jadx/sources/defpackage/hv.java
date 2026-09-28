package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hv extends saj implements Function1<b800, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(b800 b800Var) {
        o800 o800Var;
        List<o800.a> list;
        o800.a aVar;
        o800 o800Var2;
        b800 b800Var2 = b800Var;
        b800Var2.getClass();
        sv svVar = (sv) this.receiver;
        svVar.getClass();
        v800 v800Var = svVar.a;
        w900 w900Var = v800Var.c;
        ConcurrentHashMap<Integer, ztw<Integer>> concurrentHashMap = v800Var.n;
        int i = b800Var2.d;
        int i2 = b800Var2.e;
        ztw<Integer> ztwVar = concurrentHashMap.get(Integer.valueOf(i));
        if (ztwVar != null) {
            ztwVar.setValue(Integer.valueOf(i2));
        }
        w900Var.a(i, i2);
        et7 et7Var = v800Var.m;
        if (et7Var != null) {
            ej5.c(et7Var, null, null, new r800(v800Var, b800Var2, null), 3);
        }
        Context context = w900Var.a;
        itf0.a aVar2 = itf0.a;
        aVar2.q("DepositTabSelection");
        aVar2.a("onSelectedFromAllScreen " + b800Var2, new Object[0]);
        ArrayList arrayList = w900Var.e;
        String string = (arrayList == null || (o800Var2 = (o800) arrayList.get(i)) == null) ? null : o800Var2.a.e(context).toString();
        ArrayList arrayList2 = w900Var.e;
        String string2 = (arrayList2 == null || (o800Var = (o800) arrayList2.get(i)) == null || (list = o800Var.b.a) == null || (aVar = list.get(i2)) == null) ? null : aVar.a.e(context).toString();
        if (string2 == null) {
            string = null;
        } else if (string2.length() != 0) {
            string = string2;
        }
        if (string != null) {
            w900Var.b(new x900(string));
        }
        if (svVar.d.O()) {
            ej5.c(o8i0.d(svVar), null, null, new rv(svVar, null), 3);
        }
        return Unit.a;
    }
}
