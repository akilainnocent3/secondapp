package defpackage;

import android.text.TextUtils;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class c6g0 extends jpc {
    public boolean a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public List<ing> f;
    public boolean i;
    public int v;
    public boolean w;
    public int y = 0;

    @Override // defpackage.jpc
    public final int a() {
        return 1;
    }

    public final ArrayList b(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (this.f != null) {
            BigDecimal bigDecimal3 = BigDecimal.ZERO;
            if (bigDecimal.compareTo(bigDecimal3) == 0 && bigDecimal2.compareTo(bigDecimal3) == 0) {
                arrayList.addAll(this.f);
            } else {
                for (ing ingVar : this.f) {
                    ing ingVar2 = new ing(ingVar);
                    Event event = new Event(ingVar.a);
                    if (event.hasAnyOutcomeInOddsRange(str, bigDecimal, bigDecimal2)) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Market market : event.markets) {
                            if (TextUtils.equals(str, market.id)) {
                                arrayList2.add(market);
                            }
                        }
                        event.markets = arrayList2;
                        ingVar2.a = event;
                        ingVar2.v = false;
                        Category category = event.sport.category;
                        if (category != null) {
                            ingVar2.i = category.tournament.name;
                            ingVar2.f = category.name;
                        }
                        arrayList.add(ingVar2);
                    }
                }
            }
            long j = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                jpc jpcVar = (jpc) arrayList.get(i);
                if (jpcVar instanceof ing) {
                    ing ingVar3 = (ing) jpcVar;
                    boolean zA = vjt.a(j, ingVar3.a.estimateStartTime);
                    boolean z2 = !zA;
                    if (!zA && z) {
                        arrayList.add(i, new rru(ingVar3.a.estimateStartTime));
                    }
                    ingVar3.c = z2;
                    j = ingVar3.a.estimateStartTime;
                }
            }
        }
        return arrayList;
    }
}
