package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckDto;
import com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultDto;
import com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultTypeDto;
import com.sportybet.plugin.realsports.betslip.domain.model.SelectionId;
import com.sportybet.plugin.realsports.betslip.liabilitycheck.domain.model.LiabilityCheckSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class k8s {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LiabilityCheckResultTypeDto.values().length];
            try {
                iArr[LiabilityCheckResultTypeDto.ACCEPT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LiabilityCheckResultTypeDto.REJECTED_BY_BET_LIABILITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LiabilityCheckResultTypeDto.REJECTED_BY_MARKET_LIABILITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LiabilityCheckResultTypeDto.REJECTED_BY_BOOKING_CODE_LIABILITY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final j8s a(BaseResponse baseResponse, m8s m8sVar, List list) {
        list.getClass();
        if (baseResponse == null) {
            return new j8s.d(m8sVar);
        }
        if (m8sVar == m8s.b && !baseResponse.isSuccessful()) {
            int i = baseResponse.bizCode;
            String str = baseResponse.message;
            return new j8s.d(m8sVar, new SprThrowable(i, str != null ? str : "", false));
        }
        LiabilityCheckResultDto liabilityCheckResultDto = (LiabilityCheckResultDto) baseResponse.data;
        ArrayList arrayList = null;
        if ((liabilityCheckResultDto != null ? LiabilityCheckResultTypeDto.INSTANCE.fromValue(liabilityCheckResultDto.getTypeId()) : null) == LiabilityCheckResultTypeDto.UNKNOWN) {
            int i2 = baseResponse.bizCode;
            String str2 = baseResponse.message;
            return new j8s.d(m8sVar, new SprThrowable(i2, str2 != null ? str2 : "", false));
        }
        LiabilityCheckResultDto liabilityCheckResultDto2 = (LiabilityCheckResultDto) baseResponse.data;
        LiabilityCheckResultTypeDto liabilityCheckResultTypeDtoFromValue = liabilityCheckResultDto2 != null ? LiabilityCheckResultTypeDto.INSTANCE.fromValue(liabilityCheckResultDto2.getTypeId()) : null;
        int i3 = liabilityCheckResultTypeDtoFromValue == null ? -1 : a.a[liabilityCheckResultTypeDtoFromValue.ordinal()];
        if (i3 == 1) {
            return new j8s.a(m8sVar);
        }
        if (i3 == 2 || i3 == 3) {
            List<LiabilityCheckDto> rejectedSelections = liabilityCheckResultDto2.getRejectedSelections();
            if (rejectedSelections != null) {
                arrayList = new ArrayList(l48.r(rejectedSelections, 10));
                Iterator<T> it = rejectedSelections.iterator();
                while (it.hasNext()) {
                    arrayList.add(b((LiabilityCheckDto) it.next()));
                }
            }
            return (arrayList == null || arrayList.isEmpty()) ? new j8s.d(m8sVar) : new j8s.b(m8sVar, LiabilityCheckResultTypeDto.INSTANCE.fromValue(liabilityCheckResultDto2.getTypeId()), arrayList);
        }
        if (i3 != 4) {
            return new j8s.d(m8sVar);
        }
        Boolean allowMultiMaker = liabilityCheckResultDto2.getAllowMultiMaker();
        boolean zBooleanValue = allowMultiMaker != null ? allowMultiMaker.booleanValue() : true;
        String bookingCode = liabilityCheckResultDto2.getBookingCode();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LiabilityCheckSelection liabilityCheckSelectionB = s880.b((SelectionId) it2.next());
            if (liabilityCheckSelectionB != null) {
                arrayList2.add(liabilityCheckSelectionB);
            }
        }
        Boolean boolIsSmartRemixAvailable = liabilityCheckResultDto2.isSmartRemixAvailable();
        return new j8s.c(m8sVar, bookingCode, zBooleanValue, arrayList2, false, boolIsSmartRemixAvailable != null ? boolIsSmartRemixAvailable.booleanValue() : false);
    }

    public static final LiabilityCheckSelection b(LiabilityCheckDto liabilityCheckDto) {
        ArrayList arrayList;
        liabilityCheckDto.getClass();
        String eventId = liabilityCheckDto.getEventId();
        String marketId = liabilityCheckDto.getMarketId();
        String outcomeId = liabilityCheckDto.getOutcomeId();
        String specifier = liabilityCheckDto.getSpecifier();
        List<LiabilityCheckDto> childSelections = liabilityCheckDto.getChildSelections();
        if (childSelections != null) {
            arrayList = new ArrayList(l48.r(childSelections, 10));
            Iterator<T> it = childSelections.iterator();
            while (it.hasNext()) {
                arrayList.add(b((LiabilityCheckDto) it.next()));
            }
        } else {
            arrayList = null;
        }
        return new LiabilityCheckSelection(eventId, marketId, outcomeId, specifier, arrayList, null, liabilityCheckDto.isLive(), 32, null);
    }
}
