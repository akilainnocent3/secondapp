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

/* JADX INFO: loaded from: classes5.dex */
public final class lrn {
    public lrn(rqf0 rqf0Var) {
    }

    public static final nas b(ibs ibsVar) {
        ibsVar.getClass();
        return ebs.a(ibsVar.getLifecycle());
    }

    public rmo a(boolean z, List list, List list2, frn frnVar, Map map) {
        Object next;
        Object next2;
        Boolean boolValueOf;
        int i;
        Object next3;
        Object next4;
        BigDecimal bigDecimal;
        list.getClass();
        list2.getClass();
        frnVar.getClass();
        map.getClass();
        List<irn> list3 = frnVar.h;
        boolean z2 = true;
        if (list3 == null || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                String str = ((irn) it.next()).c;
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!((dsn) next).a.equals(str));
                dsn dsnVar = (dsn) next;
                if (dsnVar != null) {
                    boolValueOf = Boolean.valueOf(dsnVar.e);
                } else {
                    Iterator it3 = list2.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!((grn) next2).a.equals(str));
                    grn grnVar = (grn) next2;
                    boolValueOf = grnVar != null ? Boolean.valueOf(grnVar.c) : null;
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
            String str2 = (String) map.get(((irn) it4.next()).c);
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
            String str3 = ((irn) it5.next()).c;
            Iterator it6 = list.iterator();
            do {
                if (!it6.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it6.next();
            } while (!((dsn) next3).a.equals(str3));
            dsn dsnVar2 = (dsn) next3;
            if (dsnVar2 != null) {
                bigDecimal = dsnVar2.b;
            } else {
                Iterator it7 = list2.iterator();
                do {
                    if (!it7.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it7.next();
                } while (!((grn) next4).a.equals(str3));
                grn grnVar2 = (grn) next4;
                bigDecimal = grnVar2 != null ? grnVar2.b : null;
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
        return new rmo(iG, coloredUiText, numValueOf, new ColoredUiText(new ResourceUiText(i), Integer.valueOf(i2), null), rqf0.p(frnVar.c), strA, rqf0.m(frnVar.d, z, z2), rqf0.v(frnVar.e));
    }
}
