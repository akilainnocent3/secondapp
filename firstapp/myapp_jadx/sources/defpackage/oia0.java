package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class oia0 {
    public final uqm a;
    public final h530 b;
    public final vga0 c;
    public final li7 d;

    public oia0(uqm uqmVar, h530 h530Var, vga0 vga0Var, li7 li7Var) {
        uqmVar.getClass();
        h530Var.getClass();
        vga0Var.getClass();
        this.a = uqmVar;
        this.b = h530Var;
        this.c = vga0Var;
        this.d = li7Var;
    }

    public final g1i a(String str, CountryCodeName countryCodeName, CountryCodeName countryCodeName2, Function2 function2, Function2 function3) {
        String code;
        str.getClass();
        countryCodeName.getClass();
        if (countryCodeName2 == null || (code = countryCodeName2.getCode()) == null) {
            code = "";
        }
        return new g1i(new yzh(r0i.a(r0i.a(new eia0(this.c.k(str, code)), new fia0(countryCodeName, countryCodeName2, this, null)), new aia0(this, null)), new bia0(function2, null)), new cia0(function3, null));
    }

    public final lyh<BaseResponse<BookingData>> b(BookingData bookingData) {
        List<Event> list = bookingData.outcomes;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMapA = apg.a(list);
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                String str = ((Event) obj).parentBetBuilderMarketId;
                if (str == null || str.length() == 0) {
                    arrayList2.add(obj);
                }
            }
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                Event event = (Event) obj2;
                List<Market> list2 = event.markets;
                if (list2 != null) {
                    for (Market market : list2) {
                        List<Outcome> list3 = market.outcomes;
                        if (list3 != null) {
                            Iterator<T> it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(new Selection(event, market, (Outcome) it.next(), (List) linkedHashMapA.get(market.id)));
                            }
                        }
                    }
                }
            }
        }
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        return this.c.a(g880.o(arrayList, null, o2gVar, null), false);
    }

    public final g1i c(String str, CountryCodeName countryCodeName, CountryCodeName countryCodeName2, Function2 function2, Function2 function3) {
        String code;
        str.getClass();
        countryCodeName.getClass();
        if (countryCodeName2 == null || (code = countryCodeName2.getCode()) == null) {
            code = "";
        }
        return new g1i(new yzh(new gia0(r0i.a(r0i.a(new kia0(this.c.k(str, code)), new lia0(countryCodeName, countryCodeName2, this, null)), new hia0(this, null))), new iia0(function2, null)), new jia0(function3, null));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Boolean] */
    public final lyh<BaseResponse<Boolean>> d(String str) {
        str.getClass();
        if (this.a.isLogin()) {
            return this.c.p(str);
        }
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.bizCode = 11810;
        baseResponse.data = Boolean.FALSE;
        return new gzh(baseResponse);
    }

    public final lyh<BaseResponse<Void>> e(String str, String str2) {
        str.getClass();
        if (this.a.isLogin()) {
            return this.c.f(str, str2);
        }
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.bizCode = 11810;
        return new gzh(baseResponse);
    }
}
