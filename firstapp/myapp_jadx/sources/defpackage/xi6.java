package defpackage;

import android.content.Context;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.router.Sender;
import com.sportybet.plugin.realsports.data.BetSelection;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class xi6 {
    public static final CharSequence a(BetSelection betSelection, Context context, mfb0 mfb0Var, boolean z) {
        context.getClass();
        int i = betSelection.eventStatus;
        if (i != 1 && i != 2) {
            return "";
        }
        String strF = mfb0Var.f(betSelection.playedSeconds, betSelection.remainingTimeInPeriod, betSelection.matchStatus);
        ArrayList arrayListF0 = CollectionsKt.F0(mfb0Var.A(betSelection.setScore, betSelection.pointScore, betSelection.gameScore), 2, 2);
        ArrayList arrayList = new ArrayList(l48.r(arrayListF0, 10));
        int size = arrayListF0.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListF0.get(i3);
            i3++;
            arrayList.add(CollectionsKt.a0((List) obj, ":", null, null, null, 62));
        }
        if (StringsKt.U(strF)) {
            return "";
        }
        int color = context.getColor(R.color.brand_secondary);
        int color2 = context.getColor(R.color.sporty_gray_dark);
        j7g j7gVar = new j7g();
        j7gVar.e(color, strF);
        j7gVar.e(color, " | ");
        if (arrayList.isEmpty()) {
            j7gVar.e(color, "- : -");
            return j7gVar;
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            int i5 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            String str = (String) obj2;
            if (i2 == 0) {
                j7gVar.g(str + " ", color, z);
            } else {
                j7gVar.e(color2, str + " ");
            }
            i2 = i5;
        }
        return j7gVar;
    }

    public static final void b(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            return;
        }
        if (b3.U(str)) {
            sh8.c().f(o7d.a(wae.SPORTY_PICKS), null, Sender.OPEN_BETS);
            return;
        }
        try {
            String strA = o7d.a(wae.EVENT_DETAIL);
            String strEncode = URLEncoder.encode(str, "UTF-8");
            if (b3.T(str)) {
                if (str2 == null) {
                    str2 = "";
                }
                if (str3 == null) {
                    str3 = "";
                }
                if (str4 == null) {
                    str4 = "";
                }
                str5 = strA + "?eventId=" + strEncode + "&eventType=outright&marketId=" + str2 + "&specifier=" + str3 + "&sportId=" + str4;
            } else {
                str5 = strA + "?eventId=" + strEncode + "&eventType=" + (z ? "live" : "prematch");
            }
            sh8.c().e(str5);
        } catch (UnsupportedEncodingException e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT);
            aVar.e(e);
        }
    }

    public static final ArrayList c(List list) {
        int i;
        ArrayList arrayListA = kw5.a(list);
        Iterator it = list.iterator();
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i2 = ((BetSelection) next).eventStatus;
            if (i2 == 1 || i2 == 2) {
                arrayListA.add(next);
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayListA.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListA.get(i4);
            i4++;
            if (((BetSelection) obj).status != 0) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        List listR0 = CollectionsKt.r0(arrayList2, vl8.a(new li6(i3), new si6(i3)));
        List listR1 = CollectionsKt.r0(arrayList, vl8.a(new ti6(i3), new k81(i), new ui6(i3)));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            int i5 = ((BetSelection) obj2).eventStatus;
            if (i5 > 2 && i5 != 6) {
                arrayList3.add(obj2);
            }
        }
        List listR2 = CollectionsKt.r0(arrayList3, vl8.a(new vi6(), new wi6(i3)));
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list) {
            int i6 = ((BetSelection) obj3).eventStatus;
            if (i6 == 0 || i6 == 6) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        int size2 = arrayList4.size();
        int i7 = 0;
        while (i7 < size2) {
            Object obj4 = arrayList4.get(i7);
            i7++;
            if (((BetSelection) obj4).status != 0) {
                arrayList5.add(obj4);
            } else {
                arrayList6.add(obj4);
            }
        }
        return CollectionsKt.i0(CollectionsKt.r0(arrayList6, vl8.a(new pi6(i3), new qi6(i3), new ri6())), CollectionsKt.i0(CollectionsKt.r0(arrayList5, vl8.a(new mi6(), new ni6(), new oi6())), CollectionsKt.i0(listR2, CollectionsKt.i0(listR1, listR0))));
    }
}
