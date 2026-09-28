package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uq {
    public static final /* synthetic */ int a = 0;

    public uq(rqf0 rqf0Var) {
    }

    public rmo a(boolean z, List list, List list2, oq oqVar, Map map) {
        Object next;
        Object next2;
        Boolean boolValueOf;
        int i;
        Object next3;
        Object next4;
        BigDecimal bigDecimal;
        list.getClass();
        list2.getClass();
        oqVar.getClass();
        map.getClass();
        List<sq> list3 = oqVar.h;
        boolean z2 = true;
        if (list3 == null || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                String str = ((sq) it.next()).c;
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!((nr) next).a.equals(str));
                nr nrVar = (nr) next;
                if (nrVar != null) {
                    boolValueOf = Boolean.valueOf(nrVar.e);
                } else {
                    Iterator it3 = list2.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!((pq) next2).a.equals(str));
                    pq pqVar = (pq) next2;
                    boolValueOf = pqVar != null ? Boolean.valueOf(pqVar.c) : null;
                }
                if (!Intrinsics.g(boolValueOf, Boolean.TRUE)) {
                    z2 = false;
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList(l48.r(list3, 10));
        Iterator<T> it4 = list3.iterator();
        while (it4.hasNext()) {
            String str2 = (String) map.get(((sq) it4.next()).c);
            if (str2 == null) {
                str2 = "";
            }
            arrayList.add(str2);
        }
        String strA0 = CollectionsKt.a0(CollectionsKt.q0(arrayList), "/", null, null, null, 62);
        StringUiText stringUiText = vch0.a;
        StringUiText stringUiText2 = new StringUiText(strA0);
        int i2 = R.color.bg_secondary_d_black;
        ColoredUiText coloredUiText = new ColoredUiText(stringUiText2, Integer.valueOf(z ? R.color.text_inverse_primary : R.color.bg_secondary_d_black), null);
        BigDecimal bigDecimalMultiply = BigDecimal.ONE;
        Iterator<T> it5 = list3.iterator();
        while (it5.hasNext()) {
            String str3 = ((sq) it5.next()).c;
            Iterator it6 = list.iterator();
            do {
                if (!it6.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it6.next();
            } while (!((nr) next3).a.equals(str3));
            nr nrVar2 = (nr) next3;
            if (nrVar2 != null) {
                bigDecimal = nrVar2.b;
            } else {
                Iterator it7 = list2.iterator();
                do {
                    if (!it7.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it7.next();
                } while (!((pq) next4).a.equals(str3));
                pq pqVar2 = (pq) next4;
                bigDecimal = pqVar2 != null ? pqVar2.b : null;
            }
            if (bigDecimal != null) {
                bigDecimalMultiply.getClass();
                bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal);
                bigDecimalMultiply.getClass();
            }
        }
        String strA = gky.a.a(bjb0.L(bigDecimalMultiply, Locale.US), false);
        int iG = rqf0.g(z, z2);
        Integer numValueOf = z2 ? Integer.valueOf(R.drawable.ic__feature__won) : null;
        if (z) {
            i = z2 ? R.string.bet_history__won : R.string.bet_history__lost;
            vch0.f(new ResourceUiText(i), Integer.valueOf(R.color.text_inverse_primary));
            i2 = R.color.text_inverse_primary;
        } else {
            i = R.string.bet_history__waiting_to_kick_off;
        }
        return new rmo(iG, coloredUiText, numValueOf, new ColoredUiText(new ResourceUiText(i), Integer.valueOf(i2), null), rqf0.p(oqVar.c), strA, rqf0.m(oqVar.d, z, z2), rqf0.v(oqVar.e));
    }
}
