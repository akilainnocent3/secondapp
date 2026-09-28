package defpackage;

import com.sportybet.android.bethistory.data.dto.RealBetHistoryOrderDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class sm7 {
    public static final ArrayList a(long j, List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        long j2 = j;
        while (it.hasNext()) {
            RealBetHistoryOrderDto realBetHistoryOrderDto = (RealBetHistoryOrderDto) it.next();
            Long createTime = realBetHistoryOrderDto.getCreateTime();
            long jLongValue = createTime != null ? createTime.longValue() : 0L;
            rm7 rm7Var = new rm7(realBetHistoryOrderDto, false, false, false, Intrinsics.g(realBetHistoryOrderDto.isPublished(), Boolean.TRUE));
            if (!vjt.a(j, jLongValue)) {
                rm7Var.b = true;
                j = jLongValue;
            }
            if (!vjt.b(j2, jLongValue)) {
                rm7Var.c = true;
                j2 = jLongValue;
            }
            arrayList.add(rm7Var);
        }
        return arrayList;
    }
}
