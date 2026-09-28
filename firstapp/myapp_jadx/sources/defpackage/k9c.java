package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.social.data.remote.entity.AliasCode;
import com.sportybet.android.social.data.remote.entity.AliasCodeList;
import com.sportybet.android.social.data.remote.entity.SocShareCodeDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class k9c {
    public static final gdc a(AliasCode aliasCode, CountryCodeName countryCodeName, boolean z) {
        ArrayList arrayList;
        aliasCode.getClass();
        countryCodeName.getClass();
        int id = aliasCode.getId();
        String aliasName = aliasCode.getAliasName();
        String shareCode = aliasCode.getShareCode();
        Boolean boolValueOf = Boolean.valueOf(aliasCode.isShareCodeValid());
        Double totalOdds = aliasCode.getTotalOdds();
        Integer foldsAmount = aliasCode.getFoldsAmount();
        String userId = aliasCode.getUserId();
        Long deadline = aliasCode.getDeadline();
        Long createTime = aliasCode.getCreateTime();
        List<SocShareCodeDetail> shareCodeDetail = aliasCode.getShareCodeDetail();
        if (shareCodeDetail != null) {
            arrayList = new ArrayList(l48.r(shareCodeDetail, 10));
            for (SocShareCodeDetail socShareCodeDetail : shareCodeDetail) {
                socShareCodeDetail.getClass();
                arrayList.add(new idc(socShareCodeDetail.getEventId(), b3.T(socShareCodeDetail.getEventId()), socShareCodeDetail.getStartTime(), socShareCodeDetail.getEndTime(), socShareCodeDetail.getHomeTeamName(), socShareCodeDetail.getAwayTeamName(), socShareCodeDetail.getMarketId(), socShareCodeDetail.getMarketDescription(), socShareCodeDetail.getOutcomeId(), socShareCodeDetail.getOutcomeDescription(), socShareCodeDetail.getOdds(), socShareCodeDetail.getSportId(), socShareCodeDetail.getTournamentId(), socShareCodeDetail.getTournamentIcon(), socShareCodeDetail.getTournamentName()));
            }
        } else {
            arrayList = null;
        }
        g8c.a aVar = aliasCode.isShareCodeInvalid() ? new g8c.a(new Throwable("The code is high liability"), aliasCode.isCodeAssigned()) : null;
        z320.a aVar2 = z320.c;
        String liabilityLevel = aliasCode.getLiabilityLevel();
        aVar2.getClass();
        z320 z320VarA = z320.a.a(liabilityLevel);
        Boolean boolIsCreatorBookingCode = aliasCode.isCreatorBookingCode();
        return new gdc(id, aliasName, shareCode, boolValueOf, countryCodeName, totalOdds, foldsAmount, userId, deadline, createTime, arrayList, z, aVar, z320VarA, boolIsCreatorBookingCode != null ? boolIsCreatorBookingCode.booleanValue() : false, 4096);
    }

    public static final hdc b(AliasCodeList aliasCodeList, CountryCodeName countryCodeName, int i, boolean z) {
        aliasCodeList.getClass();
        countryCodeName.getClass();
        List<AliasCode> code = aliasCodeList.getCode();
        ArrayList arrayList = new ArrayList(l48.r(code, 10));
        int i2 = 0;
        for (Object obj : code) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            arrayList.add(a((AliasCode) obj, countryCodeName, i2 == 0));
            i2 = i3;
        }
        return new hdc(arrayList, aliasCodeList.getReachLimit(), i, z, false);
    }

    public static final kl00 c(gdc gdcVar) {
        CountryCodeName countryCodeName;
        List list;
        String str = gdcVar.c;
        String str2 = str == null ? "" : str;
        Double d = gdcVar.f;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Integer num = gdcVar.g;
        int iIntValue = num != null ? num.intValue() : 0;
        String str3 = gdcVar.h;
        String str4 = str3 == null ? "" : str3;
        Long l = gdcVar.i;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = gdcVar.j;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        CountryCodeName countryCodeName2 = gdcVar.e;
        dja0 dja0Var = dja0.b;
        List<idc> list2 = gdcVar.k;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(l48.r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                idc idcVar = (idc) it.next();
                idcVar.getClass();
                arrayList.add(new jl00(idcVar.a, idcVar.b, idcVar.c, idcVar.d, idcVar.e, idcVar.f, idcVar.g, idcVar.h, idcVar.i, idcVar.j, idcVar.k, idcVar.l, idcVar.m, idcVar.n, idcVar.o, null));
                it = it;
                countryCodeName2 = countryCodeName2;
            }
            countryCodeName = countryCodeName2;
            list = arrayList;
        } else {
            countryCodeName = countryCodeName2;
            list = m2g.a;
        }
        return new kl00(str2, dDoubleValue, iIntValue, str4, jLongValue, jLongValue2, "", gdcVar.o, gdcVar.p, null, countryCodeName, dja0Var, null, list, 119296);
    }
}
