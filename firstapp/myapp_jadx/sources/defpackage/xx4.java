package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoOutcomeDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xx4 {
    public static final Set<Integer> a;

    static {
        g08 g08Var = g08.UNKNOWN;
        g08 g08Var2 = g08.UNKNOWN;
        g08 g08Var3 = g08.UNKNOWN;
        a = ay0.V(new Integer[]{25, 28, 17});
    }

    public static final boolean a(BookingCodeInfoDto bookingCodeInfoDto) {
        String upperCase;
        bookingCodeInfoDto.getClass();
        String featureCodeMarket = bookingCodeInfoDto.getFeatureCodeMarket();
        if (featureCodeMarket != null) {
            Locale locale = Locale.US;
            locale.getClass();
            upperCase = featureCodeMarket.toUpperCase(locale);
            upperCase.getClass();
        } else {
            upperCase = null;
        }
        if (!Intrinsics.g(upperCase, "BB") && !a.contains(bookingCodeInfoDto.getSource())) {
            List<BookingCodeInfoOutcomeDto> outcomeInfos = bookingCodeInfoDto.getOutcomeInfos();
            if (outcomeInfos == null) {
                outcomeInfos = m2g.a;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = outcomeInfos.iterator();
            while (it.hasNext()) {
                String eventId = ((BookingCodeInfoOutcomeDto) it.next()).getEventId();
                if (eventId != null) {
                    arrayList.add(eventId);
                }
            }
            List listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList));
            List<BookingCodeInfoOutcomeDto> outcomeInfos2 = bookingCodeInfoDto.getOutcomeInfos();
            if (outcomeInfos2 == null) {
                outcomeInfos2 = m2g.a;
            }
            if (outcomeInfos2.size() <= 1 || listA0.size() != 1) {
                return false;
            }
        }
        return true;
    }
}
