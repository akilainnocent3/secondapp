package defpackage;

import android.animation.AnimatorSet;
import android.net.Uri;
import com.sportybet.plugin.realsports.event.viewholder.PlayerThreeColumnViewHolder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l5j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l5j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) obj;
                u6jVar.Q0.start();
                AnimatorSet animatorSet = u6jVar.R0;
                animatorSet.start();
                ej5.c(o8i0.d(u6jVar.t0()), null, null, new b7j(u6jVar, null), 3);
                djh djhVar = u6jVar.b;
                if (djhVar != null) {
                    djhVar.b.setVisibility(8);
                }
                djh djhVar2 = u6jVar.b;
                if (djhVar2 != null) {
                    e6i0.e(djhVar2.w.C);
                }
                djh djhVar3 = u6jVar.b;
                if (djhVar3 != null) {
                    e6i0.e(djhVar3.w.y);
                }
                animatorSet.addListener(new c7j(u6jVar));
                u6jVar.j1();
                return Unit.a;
            case 1:
                pgx pgxVar = (pgx) obj;
                String str = pgxVar.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) pgxVar.g.getValue()).booleanValue()) {
                    str.getClass();
                    Uri uri = Uri.parse(str);
                    uri.getClass();
                    for (String str2 : uri.getQueryParameterNames()) {
                        StringBuilder sb = new StringBuilder();
                        List<String> queryParameters = uri.getQueryParameters(str2);
                        if (queryParameters.size() > 1) {
                            kb5.a(tx5.a("Query parameter ", str2, " must only be present once in ", str, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                            return null;
                        }
                        String str3 = (String) CollectionsKt.firstOrNull(queryParameters);
                        if (str3 == null) {
                            pgxVar.i = true;
                            str3 = str2;
                        }
                        pgx.b bVar = new pgx.b();
                        int i2 = 0;
                        for (n8v n8vVarB = pgx.r.b(str3); n8vVarB != null; n8vVarB = n8vVarB.next()) {
                            MatchGroup matchGroupC = n8vVarB.c.c(1);
                            matchGroupC.getClass();
                            String str4 = matchGroupC.a;
                            str4.getClass();
                            bVar.b.add(str4);
                            if (n8vVarB.b().a > i2) {
                                String strSubstring = str3.substring(i2, n8vVarB.b().a);
                                Regex.INSTANCE.getClass();
                                String strQuote = Pattern.quote(strSubstring);
                                strQuote.getClass();
                                sb.append(strQuote);
                            }
                            sb.append("([\\s\\S]+?)?");
                            i2 = n8vVarB.b().b + 1;
                        }
                        if (i2 < str3.length()) {
                            Regex.Companion companion = Regex.INSTANCE;
                            String strSubstring2 = str3.substring(i2);
                            companion.getClass();
                            String strQuote2 = Pattern.quote(strSubstring2);
                            strQuote2.getClass();
                            sb.append(strQuote2);
                        }
                        sb.append("$");
                        bVar.a = pgx.h(sb.toString());
                        linkedHashMap.put(str2, bVar);
                    }
                }
                return linkedHashMap;
            default:
                return Integer.valueOf(PlayerThreeColumnViewHolder.columnHeightPx_delegate$lambda$0((PlayerThreeColumnViewHolder) obj));
        }
    }
}
