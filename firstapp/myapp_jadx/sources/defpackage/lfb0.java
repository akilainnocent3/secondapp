package defpackage;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.SportExtension;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class lfb0 {
    public static final String[] e = {"sr:sport:1", "sr:sport:202120001", "sr:sport:2", "sr:sport:5", "sr:sport:196", "sr:sport:31", "sr:sport:109", "sr:sport:111", "sr:sport:110", "sr:sport:20", "sr:sport:23", "sr:sport:6", "sr:sport:4", "sr:sport:12", "sr:sport:21", "sr:sport:22", "sr:sport:34", "sr:sport:3", "sr:sport:16", "sr:sport:117", "sr:sport:29", "sr:sport:137", "sr:sport:153", "sr:sport:195"};
    public static final String[] f = {"sr:sport:1", "sr:sport:2", "sr:sport:5", "sr:sport:196", "sr:sport:31", "sr:sport:109", "sr:sport:111", "sr:sport:110", "sr:sport:20", "sr:sport:23", "sr:sport:6", "sr:sport:4", "sr:sport:12", "sr:sport:21", "sr:sport:22", "sr:sport:34", "sr:sport:3", "sr:sport:16", "sr:sport:117", "sr:sport:29", "sr:sport:137", "sr:sport:153", "sr:sport:195"};
    public final JsonSerializeService a = sh8.b();
    public final psm b;
    public final nfb0 c;
    public LinkedHashMap d;

    public class a extends TypeToken<List<SportExtension>> {
    }

    public interface b {
        lfb0 l();
    }

    public lfb0(psm psmVar, nfb0 nfb0Var) {
        this.d = new LinkedHashMap();
        this.b = psmVar;
        this.c = nfb0Var;
        String[] strArr = CountryCodeName.SOUTH_AFRICA.equals(psmVar.getCountryCode()) ? f : e;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : strArr) {
            nfb0 nfb0Var2 = this.c;
            nfb0Var2.getClass();
            str.getClass();
            x1 x1Var = nfb0Var2.a.get(str);
            if (x1Var != null) {
                linkedHashMap.put(str, x1Var);
            }
        }
        this.d = linkedHashMap;
    }

    @Deprecated(since = "This method is now deprecated, as it returns the same object as DI. Please leverage the DI instance.")
    public static lfb0 d() {
        return ((b) jm2.a(hp0.A, b.class)).l();
    }

    public final void a() {
        mfb0 mfb0Var;
        try {
            String strD = vn20.d("sportybet", "pref_key_sport_extension", "");
            if (TextUtils.isEmpty(strD)) {
                return;
            }
            List<SportExtension> list = (List) this.a.fromJson(strD, new a().getType());
            if (list == null || list.isEmpty()) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.d);
            for (SportExtension sportExtension : list) {
                if (sportExtension != null) {
                    mfb0 mfb0Var2 = (mfb0) linkedHashMap.get(sportExtension.id);
                    if (mfb0Var2 != null) {
                        sportExtension.nameUiText = mfb0Var2.c();
                    } else {
                        sportExtension.nameUiText = new StringUiText(sportExtension.name);
                    }
                    u1h u1hVar = new u1h();
                    u1hVar.c = new ArrayList();
                    u1hVar.b = sportExtension;
                    Iterator<String> it = sportExtension.regularMarkets.iterator();
                    while (it.hasNext()) {
                        u1hVar.c.add(RegularMarketRule.a(it.next(), null));
                    }
                    if (TextUtils.isEmpty(u1hVar.b.iconUrl) && (mfb0Var = (mfb0) linkedHashMap.get(u1hVar.b.id)) != null) {
                        u1hVar.b.iconUrl = mfb0Var.a();
                    }
                    linkedHashMap.put(u1hVar.b.id, u1hVar);
                }
            }
            this.d = linkedHashMap;
        } catch (Exception unused) {
        }
    }

    public final boolean b() {
        hp0 hp0Var = hp0.A;
        hp0Var.getClass();
        long jC = ((g650) qag.a(hp0Var, g650.class)).Q().c("sport_extension_check_frequency_in_hour");
        if (jC == 0) {
            jC = 1;
        }
        long j = vn20.a("sportybet").getLong("pref_key_sport_extension_last_check_time", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        itf0.a aVar = itf0.a;
        aVar.q("SportRepository");
        aVar.a("FetchExtension - frequency in hour = %s", Long.valueOf(jC));
        if (jCurrentTimeMillis - j >= jC * 3600000) {
            return false;
        }
        aVar.q("SportRepository");
        aVar.a("in cool down time", new Object[0]);
        a();
        return true;
    }

    public final ArrayList c() {
        return new ArrayList(this.d.values());
    }

    public final mfb0 e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (mfb0) this.d.get(str);
    }

    public final ArrayList f(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Sport sport = (Sport) it.next();
                if (this.d.containsKey(sport.id)) {
                    arrayList.add(sport);
                }
            }
        }
        return arrayList;
    }
}
