package defpackage;

import com.sporty.android.core.model.recentcode.RecentShareCodeDetail;
import com.sporty.android.core.model.recentcode.RecentShareCodeItem;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes5.dex */
public final class ji40 {
    public final RecentShareCodeItem a;
    public final li40 b;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a {
        public static li40 a(RecentShareCodeItem recentShareCodeItem) {
            Object next;
            li40 cVar;
            li40 aVar;
            recentShareCodeItem.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (recentShareCodeItem.getShareCodeDetail().isEmpty()) {
                return li40.b.a;
            }
            List<RecentShareCodeDetail> shareCodeDetail = recentShareCodeItem.getShareCodeDetail();
            ArrayList arrayList = new ArrayList();
            for (Object obj : shareCodeDetail) {
                Long startTime = ((RecentShareCodeDetail) obj).getStartTime();
                if (startTime != null && startTime.longValue() > jCurrentTimeMillis) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            RecentShareCodeDetail recentShareCodeDetail = null;
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Long startTime2 = ((RecentShareCodeDetail) next).getStartTime();
                    long jLongValue = startTime2 != null ? startTime2.longValue() : Long.MAX_VALUE;
                    do {
                        Object next2 = it.next();
                        Long startTime3 = ((RecentShareCodeDetail) next2).getStartTime();
                        long jLongValue2 = startTime3 != null ? startTime3.longValue() : Long.MAX_VALUE;
                        if (jLongValue > jLongValue2) {
                            next = next2;
                            jLongValue = jLongValue2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            RecentShareCodeDetail recentShareCodeDetail2 = (RecentShareCodeDetail) next;
            if (recentShareCodeDetail2 != null) {
                Long startTime4 = recentShareCodeDetail2.getStartTime();
                if (startTime4 != null) {
                    long jLongValue3 = startTime4.longValue();
                    long j = jLongValue3 - jCurrentTimeMillis;
                    if (j <= 86400000) {
                        aVar = new li40.d(String.format(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 3600000), Long.valueOf((j / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS) % 60), Long.valueOf((j / 1000) % 60)}, 3)));
                    } else {
                        String str = new SimpleDateFormat("HH:mm dd/MM", Locale.ENGLISH).format(new Date(jLongValue3));
                        str.getClass();
                        aVar = new li40.a(str);
                    }
                } else {
                    aVar = li40.b.a;
                }
                if (aVar != null) {
                    return aVar;
                }
            }
            List<RecentShareCodeDetail> shareCodeDetail2 = recentShareCodeItem.getShareCodeDetail();
            ListIterator<RecentShareCodeDetail> listIterator = shareCodeDetail2.listIterator(shareCodeDetail2.size());
            while (listIterator.hasPrevious()) {
                RecentShareCodeDetail recentShareCodeDetailPrevious = listIterator.previous();
                Long startTime5 = recentShareCodeDetailPrevious.getStartTime();
                if (startTime5 != null && startTime5.longValue() <= jCurrentTimeMillis) {
                    recentShareCodeDetail = recentShareCodeDetailPrevious;
                    break;
                }
            }
            RecentShareCodeDetail recentShareCodeDetail3 = recentShareCodeDetail;
            if (recentShareCodeDetail3 != null) {
                Long startTime6 = recentShareCodeDetail3.getStartTime();
                if (startTime6 != null) {
                    String str2 = new SimpleDateFormat("HH:mm dd/MM", Locale.ENGLISH).format(new Date(startTime6.longValue()));
                    str2.getClass();
                    cVar = new li40.c(str2);
                } else {
                    cVar = li40.b.a;
                }
                if (cVar != null) {
                    return cVar;
                }
            }
            return li40.b.a;
        }
    }

    public ji40(RecentShareCodeItem recentShareCodeItem, li40 li40Var) {
        li40Var.getClass();
        this.a = recentShareCodeItem;
        this.b = li40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji40)) {
            return false;
        }
        ji40 ji40Var = (ji40) obj;
        return this.a.equals(ji40Var.a) && Intrinsics.g(this.b, ji40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RecentShareCodeItemUiState(recentShareCodeItem=" + this.a + ", description=" + this.b + ")";
    }
}
