package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class be20 {
    public final Context a;
    public final uqm b;

    public be20(Context context, uqm uqmVar) {
        uqmVar.getClass();
        this.a = context;
        this.b = uqmVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    public final rog a(String str, ofb0 ofb0Var, boolean z, List list, LinkedHashMap linkedHashMap) {
        uss ussVar;
        List<String> listSplit$default;
        vts bVar;
        ArrayList arrayList;
        boolean z2;
        str.getClass();
        list.getClass();
        if (list.isEmpty()) {
            ussVar = null;
        } else {
            Context context = this.a;
            String strA = tug.a(sn5.b(context, R.string.common_functions__live, new Object[0]), " & ", sn5.b(context, R.string.live__upcoming_games, new Object[0]));
            List<String> list2 = ce20.a;
            ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Event event = (Event) it.next();
                String str2 = event.setScore;
                int i = 6;
                if (str2 == null || (listSplit$default = StringsKt__StringsKt.split$default(str2, new String[]{":"}, false, 0, 6, null)) == null) {
                    listSplit$default = ce20.a;
                }
                if (z) {
                    List<String> list3 = event.gameScore;
                    if (list3 != null) {
                        arrayList = new ArrayList(l48.r(list3, 10));
                        for (String str3 : list3) {
                            str3.getClass();
                            List listSplit$default2 = StringsKt__StringsKt.split$default(str3, new String[]{":"}, false, 0, i, null);
                            arrayList.add(new Pair((String) listSplit$default2.get(0), (String) listSplit$default2.get(1)));
                            i = 6;
                        }
                    } else {
                        arrayList = null;
                    }
                    Pair pairT = arrayList != null ? l48.t(arrayList) : new Pair(a.c("0"), a.c("0"));
                    List list4 = (List) pairT.a;
                    List list5 = (List) pairT.b;
                    String str4 = listSplit$default.get(0);
                    String str5 = listSplit$default.get(1);
                    str4.getClass();
                    str5.getClass();
                    Integer intOrNull = StringsKt.toIntOrNull(str4);
                    if (intOrNull != null) {
                        int iIntValue = intOrNull.intValue();
                        Integer intOrNull2 = StringsKt.toIntOrNull(str5);
                        if (intOrNull2 != null) {
                            int iIntValue2 = intOrNull2.intValue();
                            if (iIntValue >= 100 || iIntValue2 >= 100) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    String str6 = event.eventId;
                    str6.getClass();
                    String str7 = event.homeTeamName;
                    str7.getClass();
                    String str8 = event.homeTeamIcon;
                    String str9 = event.awayTeamName;
                    str9.getClass();
                    bVar = new vts.a(str6, str7, str8, str9, event.awayTeamIcon, z2, listSplit$default.get(0), listSplit$default.get(1), list4, list5);
                } else {
                    String str10 = event.eventId;
                    str10.getClass();
                    String str11 = event.homeTeamName;
                    str11.getClass();
                    String str12 = event.homeTeamIcon;
                    String str13 = event.awayTeamName;
                    str13.getClass();
                    bVar = new vts.b(str10, str11, str12, str13, event.awayTeamIcon, listSplit$default.get(0), listSplit$default.get(1));
                }
                arrayList2.add(bVar);
            }
            ussVar = new uss(strA, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String strJ = bwf0.j(((Event) CollectionsKt.T((List) entry.getValue())).estimateStartTime, this.b.getLanguageCode());
            String str14 = entry.getKey() + " " + strJ;
            Iterable<Event> iterable = (Iterable) entry.getValue();
            ArrayList arrayList4 = new ArrayList(l48.r(iterable, 10));
            for (Event event2 : iterable) {
                String strS = bwf0.a.s(event2.estimateStartTime, false);
                String str15 = event2.eventId;
                str15.getClass();
                String str16 = event2.homeTeamName;
                str16.getClass();
                String str17 = event2.homeTeamIcon;
                String str18 = event2.awayTeamName;
                str18.getClass();
                arrayList4.add(new kk20(str15, str16, str17, str18, event2.awayTeamIcon, strS));
            }
            arrayList3.add(new ui20(str14, arrayList4));
        }
        return new rog(str, ofb0Var, z, ussVar, arrayList3);
    }
}
