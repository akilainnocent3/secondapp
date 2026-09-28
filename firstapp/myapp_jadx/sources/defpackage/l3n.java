package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.MarketInRound;
import com.sportybet.android.instantwin.newtork.model.response.OutcomeInRound;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class l3n {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cd3.values().length];
            try {
                cd3.a aVar = cd3.b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                cd3.a aVar2 = cd3.b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                cd3.a aVar3 = cd3.b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                cd3.a aVar4 = cd3.b;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                cd3.a aVar5 = cd3.b;
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public static bxg0 a(String str) {
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{":"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<String> listO = CollectionsKt.O(listSplit$default, 1);
        ArrayList arrayList3 = new ArrayList();
        for (String str2 : listO) {
            p48.w(str2.length() > 0 ? StringsKt__StringsKt.split$default(str2, new String[]{","}, false, 0, 6, null) : m2g.a, arrayList3);
        }
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            List listSplit$default2 = StringsKt__StringsKt.split$default((String) obj, new String[]{"-"}, false, 0, 6, null);
            ArrayList arrayList4 = new ArrayList(l48.r(listSplit$default2, 10));
            Iterator it = listSplit$default2.iterator();
            while (it.hasNext()) {
                arrayList4.add(StringsKt.t0((String) it.next()).toString());
            }
            String str3 = (String) arrayList4.get(0);
            String str4 = (String) arrayList4.get(1);
            arrayList.add(str3);
            arrayList2.add(str4);
        }
        return new bxg0(arrayList, arrayList2, Integer.valueOf(arrayList.size() > 4 ? arrayList.size() - 4 : 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(ArrayList arrayList, MarketInRound marketInRound, OutcomeInRound outcomeInRound, boolean z, dq40 dq40Var, dq40 dq40Var2, List list, String str) {
        int size = (list.size() + 2) / 3;
        int i = 0;
        while (i < size) {
            int i2 = i * 3;
            i++;
            List listSubList = list.subList(i2, Math.min(i * 3, list.size()));
            String str2 = marketInRound != null ? marketInRound.title : null;
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(new sw2(str2, outcomeInRound.desc, outcomeInRound.odds, new a88(str, listSubList), z, outcomeInRound.hit, (jrn) null));
            if (z) {
                arrayList.add(new sw2((String) dq40Var.a, (String) dq40Var2.a, "", new a88(str, listSubList), false, true, outcomeInRound.hit));
            }
        }
    }
}
