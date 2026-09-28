package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class n5u {
    public static final n5u a = new n5u();
    public static final php<l5u> b = l5u.Companion.serializer();
    public static final mdp c;

    static {
        wbp.a aVar = wbp.d;
        aVar.getClass();
        fcp fcpVar = aVar.a;
        boolean z = fcpVar.b;
        String str = fcpVar.c;
        wp7 wp7Var = fcpVar.f;
        boolean z2 = fcpVar.e;
        y3l y3lVar = aVar.b;
        Unit unit = Unit.a;
        if (!Intrinsics.g(str, "    ")) {
            hb5.a("Indent should not be specified when default printing mode is used");
            return;
        }
        fcp fcpVar2 = new fcp(true, z, str, AnalyticsParam.MINI_GAMES_PAGE, z2, wp7Var);
        y3lVar.getClass();
        mdp mdpVar = new mdp(fcpVar2, y3lVar);
        if (!y3lVar.equals(ve80.a)) {
            pep pepVar = new pep();
            wp7 wp7Var2 = wp7.a;
            y3lVar.e(pepVar);
        }
        c = mdpVar;
    }

    public static l5u a(String str) {
        Object bVar;
        boolean z = false;
        try {
            zi50.a aVar = zi50.b;
            Map mapB = b(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapB.entrySet()) {
                String str2 = (String) entry.getKey();
                bep bepVarB = ucp.b((String) entry.getValue());
                str2.getClass();
                bepVarB.getClass();
            }
            if (!mapB.containsKey(AnalyticsParam.MINI_GAMES_PAGE)) {
                bep bepVarB2 = ucp.b("lobby");
                bepVarB2.getClass();
            }
            wdp wdpVar = new wdp(linkedHashMap);
            mdp mdpVar = c;
            php<l5u> phpVar = b;
            mdpVar.getClass();
            phpVar.getClass();
            bVar = (l5u) new sep((wbp) mdpVar, wdpVar, (String) (z ? 1 : 0), 12).z(phpVar);
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        zi50.a aVar3 = zi50.b;
        return (l5u) (bVar instanceof zi50.b ? null : bVar);
    }

    public static Map b(String str) throws UnsupportedEncodingException {
        if (str == null || StringsKt.U(str)) {
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            return o2gVar;
        }
        List<String> listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"&"}, false, 0, 6, null);
        int iA = jpu.a(l48.r(listSplit$default, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (String str2 : listSplit$default) {
            int iS = StringsKt.S(str2, '=', 0, 6);
            String strSubstring = iS >= 0 ? str2.substring(0, iS) : str2;
            String strSubstring2 = iS >= 0 ? str2.substring(iS + 1) : "";
            a.getClass();
            Charset charset = StandardCharsets.UTF_8;
            String strDecode = URLDecoder.decode(strSubstring, charset.name());
            strDecode.getClass();
            String strDecode2 = URLDecoder.decode(strSubstring2, charset.name());
            strDecode2.getClass();
            linkedHashMap.put(strDecode, strDecode2);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList c(l5u l5uVar) {
        l5uVar.getClass();
        php<l5u> phpVar = b;
        mdp mdpVar = c;
        mdpVar.getClass();
        phpVar.getClass();
        final dq40 dq40Var = new dq40();
        new tep(mdpVar, new Function1() { // from class: wvg0
            /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, scp] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ?? r1 = (scp) obj;
                r1.getClass();
                dq40Var.a = r1;
                return Unit.a;
            }
        }).x(phpVar, l5uVar);
        T t = dq40Var.a;
        if (t == 0) {
            Intrinsics.n(AnalyticsParam.EVENT_PARAM_RESULT);
            throw null;
        }
        scp scpVar = (scp) t;
        skn sknVar = ucp.a;
        wdp wdpVar = scpVar instanceof wdp ? (wdp) scpVar : null;
        if (wdpVar == null) {
            ucp.c(scpVar, "JsonObject");
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, scp> entry : wdpVar.a.entrySet()) {
            String key = entry.getKey();
            bep bepVarD = ucp.d(entry.getValue());
            String strB = bepVarD instanceof sdp ? null : bepVarD.b();
            Pair pair = strB != null ? new Pair(key, strB) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return arrayList;
    }
}
