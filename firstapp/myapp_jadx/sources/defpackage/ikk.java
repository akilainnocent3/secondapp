package defpackage;

import com.sportybet.plugin.jackpot.data.Order;
import com.sportybet.plugin.jackpot.data.ROrderWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ikk {
    public static final /* synthetic */ int a = 0;

    public static ArrayList a(long j, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        long j2 = j;
        while (it.hasNext()) {
            Order order = (Order) it.next();
            ROrderWrapper rOrderWrapper = new ROrderWrapper();
            rOrderWrapper.order = order;
            if (!vjt.a(j, order.createTime)) {
                rOrderWrapper.dateShowEnabled = true;
                j = order.createTime;
            }
            if (j2 == 0) {
                j2 = order.createTime;
            }
            if (!vjt.b(j2, order.createTime)) {
                rOrderWrapper.yearShowEnabled = true;
                j2 = order.createTime;
            }
            arrayList.add(rOrderWrapper);
        }
        return arrayList;
    }
}
