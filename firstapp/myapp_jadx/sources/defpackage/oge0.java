package defpackage;

import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.config.Version;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.service.CountryCodeName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oge0 {
    public final k650 a;
    public final JsonSerializeService b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/sporty/android/core/model/json/JsonSerializeServiceExtKt$fromJson$1", "Lcom/google/gson/reflect/TypeToken;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<vb90> {
    }

    public oge0(k650 k650Var, JsonSerializeService jsonSerializeService) {
        k650Var.getClass();
        jsonSerializeService.getClass();
        this.a = k650Var;
        this.b = jsonSerializeService;
    }

    public final List<x7b.a> a(final CountryCodeName countryCodeName) {
        Object bVar;
        countryCodeName.getClass();
        mpe0 mpe0Var = up40.a;
        final boolean zC = vn20.c("com.sportybet.android.country.CountryManager", "IS_REDIRECT", false);
        String strG = this.a.g("android_enabled_countries_list");
        try {
            zi50.a aVar = zi50.b;
            a4g a4gVar = (a4g) this.b.fromJson(strG, a4g.class);
            bVar = a4gVar != null ? a4gVar.a() : null;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        final List list = (List) (bVar instanceof zi50.b ? null : bVar);
        if (list == null) {
            list = m2g.a;
        }
        List<ub90> listA = b().a();
        ArrayList arrayList = new ArrayList(l48.r(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((ub90) it.next()).getCountryCode());
        }
        return ld80.k(ld80.d(new ysg0(ld80.d(ld80.d(ay0.r(v7b.b), new Function1() { // from class: lge0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CountryCodeName countryCodeName2 = (CountryCodeName) obj;
                countryCodeName2.getClass();
                boolean z = true;
                if (CountryCodeName.BRAZIL == countryCodeName2 && zC) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }), new Function1() { // from class: mge0
            /* JADX WARN: Code duplicated, block: B:20:0x0055  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                Object next;
                CountryCodeName countryCodeName2 = (CountryCodeName) obj;
                countryCodeName2.getClass();
                if (countryCodeName != countryCodeName2) {
                    this.getClass();
                    Version version = new Version("1.82.2");
                    Iterator it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!Intrinsics.g(((b4g) next).getCountryCode(), countryCodeName2.getCode()));
                    b4g b4gVar = (b4g) next;
                    if (b4gVar != null && (!b4gVar.getIsEnabled() || version.compareTo(new Version(b4gVar.getEnabledFromVersion())) < 0)) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }), new Function1() { // from class: nge0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CountryCodeName countryCodeName2 = (CountryCodeName) obj;
                countryCodeName2.getClass();
                w7b w7bVarC = x7b.c(countryCodeName2, "");
                CountryCodeName countryCodeName3 = w7bVarC.a;
                countryCodeName3.getClass();
                boolean z = countryCodeName == countryCodeName2;
                int iJ = w7bVarC.j();
                String str = w7bVarC.b;
                str.getClass();
                return new x7b.a(countryCodeName3, z, iJ, str);
            }
        }), new cqj(CollectionsKt.E0(arrayList), 1)));
    }

    public final vb90 b() {
        Object bVar;
        try {
            zi50.a aVar = zi50.b;
            bVar = (vb90) this.b.fromJson(this.a.g("server_shut_down_country_list"), new a().getType());
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        vb90 vb90Var = (vb90) bVar;
        return vb90Var == null ? new vb90(null) : vb90Var;
    }
}
