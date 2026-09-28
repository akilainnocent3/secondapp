package defpackage;

import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import com.sporty.android.common_analytics.opentelemetry.UrlTemplateConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class inh0 implements fra0 {
    public final UrlTemplateConfig a;

    public inh0(UrlTemplateConfig urlTemplateConfig) {
        urlTemplateConfig.getClass();
        this.a = urlTemplateConfig;
    }

    @Override // defpackage.fra0
    public final boolean B1() {
        return false;
    }

    @Override // defpackage.fra0
    public final boolean C() {
        return this.a.validate();
    }

    public final String d(String str) {
        UrlTemplateConfig urlTemplateConfig;
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"?"}, false, 2, 2, null);
        String str2 = (String) listSplit$default.get(0);
        String strConcat = "";
        String str3 = listSplit$default.size() > 1 ? (String) listSplit$default.get(1) : "";
        String strA = fu5.a("^https?://[^/]+", str2, "");
        char[] cArr = {'/'};
        strA.getClass();
        int length = strA.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zT = ay0.t(cArr, strA.charAt(!z ? i : length));
            if (z) {
                if (!zT) {
                    break;
                }
                length--;
            } else if (zT) {
                i++;
            } else {
                z = true;
            }
        }
        List listF0 = StringsKt.f0(strA.subSequence(i, length + 1).toString(), new char[]{'/'});
        ArrayList arrayList = new ArrayList(listF0.size());
        Iterator it = listF0.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            urlTemplateConfig = this.a;
            if (!zHasNext) {
                break;
            }
            String str4 = (String) it.next();
            if (new Regex(urlTemplateConfig.getCountryReg()).f(str4)) {
                arrayList.add("*");
            } else if (new Regex("\\d").a(str4)) {
                arrayList.add("*");
            } else {
                arrayList.add(str4);
            }
        }
        String strConcat2 = "/".concat(CollectionsKt.a0(arrayList, "/", null, null, null, 62));
        for (Map.Entry<String, String> entry : urlTemplateConfig.getPathRegMap().entrySet()) {
            strConcat2 = fu5.a(entry.getKey(), strConcat2, entry.getValue());
        }
        if (str3.length() > 0) {
            List listSplit$default2 = StringsKt__StringsKt.split$default(str3, new String[]{"&"}, false, 0, 6, null);
            ArrayList arrayList2 = new ArrayList(l48.r(listSplit$default2, 10));
            Iterator it2 = listSplit$default2.iterator();
            while (it2.hasNext()) {
                List listSplit$default3 = StringsKt__StringsKt.split$default((String) it2.next(), new String[]{"="}, false, 2, 2, null);
                String strA2 = (String) listSplit$default3.get(0);
                if (listSplit$default3.size() > 1) {
                    strA2 = yk10.a(strA2, "=*");
                }
                arrayList2.add(strA2);
            }
            strConcat = "?".concat(CollectionsKt.a0(CollectionsKt.q0(arrayList2), "&", null, null, null, 62));
        }
        return ((Object) strConcat2) + strConcat;
    }

    @Override // defpackage.fra0
    public final void r0(at70 at70Var) {
        itf0.a aVar = itf0.a;
        aVar.q("UrlTemplateSpanProcessor");
        aVar.a("=== Span Attributes ===", new Object[0]);
        m21 m21VarO = at70Var.e().o();
        final gnh0 gnh0Var = new gnh0();
        m21VarO.forEach(new BiConsumer() { // from class: hnh0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                gnh0Var.invoke(obj, obj2);
            }
        });
    }

    @Override // defpackage.fra0
    public final void r1(m0b m0bVar, at70 at70Var) {
        m21 m21VarA;
        m0bVar.getClass();
        synchronized (at70Var.l) {
            try {
                q21 q21Var = at70Var.n;
                if (q21Var == null) {
                    m21VarA = vw0.d;
                } else {
                    xw0 xw0Var = new xw0();
                    xw0Var.c(q21Var);
                    m21VarA = xw0Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g21 g21Var = g21.a;
        String str = (String) ((vw0) m21VarA).e(kyo.a(g21Var, "url.full"));
        if (str == null) {
            itf0.a aVar = itf0.a;
            aVar.q("UrlTemplateSpanProcessor");
            aVar.a("Can't find the url.full attribute", new Object[0]);
            return;
        }
        try {
            String strD = d(str);
            itf0.a aVar2 = itf0.a;
            aVar2.q("UrlTemplateSpanProcessor");
            aVar2.a("url: " + str + ", template: " + strD, new Object[0]);
            at70Var.f(kyo.a(g21Var, "url.template"), strD);
        } catch (Exception unused) {
            itf0.a aVar3 = itf0.a;
            aVar3.q("UrlTemplateSpanProcessor");
            aVar3.a(CaxEybC.cvmhvpeO.concat(str), new Object[0]);
        }
    }
}
