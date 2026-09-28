package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.codehub.data.CodeHubFilterMergedEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w320 extends saj implements Function2<Boolean, BookingCodeFilterDto, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, BookingCodeFilterDto bookingCodeFilterDto) {
        String strP;
        g08 g08Var;
        boolean zBooleanValue = bool.booleanValue();
        BookingCodeFilterDto bookingCodeFilterDto2 = bookingCodeFilterDto;
        bookingCodeFilterDto2.getClass();
        r320 r320Var = (r320) this.receiver;
        r320Var.getClass();
        if (zBooleanValue) {
            strP = "default";
        } else {
            List<Long> timeFilter = bookingCodeFilterDto2.getTimeFilter();
            if (timeFilter == null) {
                timeFilter = m2g.a;
            }
            ArrayList arrayList = new ArrayList(l48.r(timeFilter, 10));
            Iterator<T> it = timeFilter.iterator();
            while (it.hasNext()) {
                arrayList.add(r320Var.K.format(new Date(((Number) it.next()).longValue())));
            }
            List<Integer> foldsFilter = bookingCodeFilterDto2.getFoldsFilter();
            List<Double> oddsFilter = bookingCodeFilterDto2.getOddsFilter();
            String fieldValue = bookingCodeFilterDto2.getSortBy().getFieldValue();
            if (Intrinsics.g(fieldValue, "folds_amount")) {
                fieldValue = "folds";
            } else if (Intrinsics.g(fieldValue, "total_odds")) {
                fieldValue = "odds";
            }
            CodeHubFilterMergedEvent codeHubFilterMergedEvent = new CodeHubFilterMergedEvent(arrayList, foldsFilter, oddsFilter, b.k(fieldValue, bookingCodeFilterDto2.getSortBy().getOrder()));
            List<String> time = codeHubFilterMergedEvent.getTime();
            List<Integer> folds = codeHubFilterMergedEvent.getFolds();
            List<Double> odds = codeHubFilterMergedEvent.getOdds();
            List<String> sortBy = codeHubFilterMergedEvent.getSortBy();
            StringBuilder sbA = hfb0.a("time:", ",folds:", ",odds:", time, folds);
            sbA.append(odds);
            sbA.append(",sortBy:");
            sbA.append(sortBy);
            strP = c.p(sbA.toString(), " ", "", false);
        }
        f00 f00Var = vgb0.a;
        vgb0.c("code_hub_filter_value", jpu.b(new Pair(AnalyticsParam.EVENT_PATH, strP)), false);
        int iOrdinal = r320Var.p0().ordinal();
        if (iOrdinal == 0) {
            g08Var = g08.CODEHUB_POPULAR_CODES;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                uhc.a();
                return null;
            }
            g08Var = g08.CODEHUB_POPULAR_CODES;
        } else {
            g08Var = g08.PRE_CANNED_BET_BUILDER_CODEHUB;
        }
        r320Var.L = g08Var.name();
        return Unit.a;
    }
}
