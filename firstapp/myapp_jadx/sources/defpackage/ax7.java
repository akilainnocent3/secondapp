package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ax7 {
    public static final boolean a(iy7.d dVar, iy7.d dVar2) {
        dVar.getClass();
        BookingCodeFilterDto.SortBy sortBy = dVar.a;
        String fieldValue = sortBy.getFieldValue();
        BookingCodeFilterDto.SortBy sortBy2 = dVar2.a;
        return Intrinsics.g(fieldValue, sortBy2.getFieldValue()) && Intrinsics.g(sortBy.getOrder(), sortBy2.getOrder());
    }

    public static final iy7 b(BookingCodeFilterDto bookingCodeFilterDto, hy7 hy7Var) {
        bookingCodeFilterDto.getClass();
        hy7Var.getClass();
        int iOrdinal = hy7Var.ordinal();
        if (iOrdinal == 1) {
            List<Long> timeFilter = bookingCodeFilterDto.getTimeFilter();
            if (timeFilter == null) {
                timeFilter = m2g.a;
            }
            List<Long> timeSegmentFilter = bookingCodeFilterDto.getTimeSegmentFilter();
            if (timeSegmentFilter == null) {
                timeSegmentFilter = m2g.a;
            }
            return new iy7.e(12, timeFilter, timeSegmentFilter);
        }
        if (iOrdinal == 2) {
            return new iy7.b(((Number) CollectionsKt.T(bookingCodeFilterDto.getFoldsFilter())).intValue(), bookingCodeFilterDto.getFoldsFilter().get(1).intValue());
        }
        if (iOrdinal == 3) {
            return new iy7.c(((Number) CollectionsKt.T(bookingCodeFilterDto.getOddsFilter())).doubleValue(), bookingCodeFilterDto.getOddsFilter().get(1).doubleValue());
        }
        if (iOrdinal == 4) {
            return new iy7.d(bookingCodeFilterDto.getSortBy());
        }
        hb5.a("Unsupported filter type");
        return null;
    }
}
