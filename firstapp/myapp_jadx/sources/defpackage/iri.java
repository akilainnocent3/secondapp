package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.globalpay.pixBtg.withdraw.e;
import com.sportybet.android.globalpay.pixBtg.withdraw.h;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iri implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iri(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final Function2 function2 = (Function2) obj2;
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szr.h(szrVar, "for_you_empty_guidance", new op8(-232426945, new gaj() { // from class: nri
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        a aVar = (a) obj4;
                        int iIntValue = ((Integer) obj5).intValue();
                        ((gwr) obj3).getClass();
                        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            function2.invoke(aVar, 0);
                        } else {
                            aVar.G();
                        }
                        return Unit.a;
                    }
                }, true), 2);
                return Unit.a;
            default:
                h hVar = (h) obj2;
                e.c cVar = (e.c) obj;
                cVar.getClass();
                Object value = hVar.G.getValue();
                vhn vhnVar = value instanceof vhn ? (vhn) value : null;
                if (vhnVar == null || vhnVar.c.isEmpty()) {
                    z = true;
                } else {
                    List<kw40> list = cVar.c.f.a;
                    if (list == null || !list.isEmpty()) {
                        Iterator<T> it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((kw40) it.next()).e) {
                                    z = true;
                                }
                            }
                        }
                    }
                    z = false;
                }
                return e.c.a(cVar, null, 0.0d, null, null, hVar.H && z ? uxs.ENABLE : uxs.DISABLE, null, 47);
        }
    }
}
