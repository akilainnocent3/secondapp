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
public final class jeq {
    public static final /* synthetic */ int a = 0;

    public jeq(rqf0 rqf0Var) {
    }

    public rmo a(boolean z, List list, List list2, q5k0 q5k0Var, Map map) {
        Object next;
        Object next2;
        Boolean boolValueOf;
        int i;
        Object next3;
        Object next4;
        BigDecimal bigDecimal;
        list.getClass();
        list2.getClass();
        q5k0Var.getClass();
        map.getClass();
        List<u5k0> list3 = q5k0Var.h;
        boolean z2 = true;
        if (list3 == null || !list3.isEmpty()) {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                String str = ((u5k0) it.next()).c;
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!((n6k0) next).a.equals(str));
                n6k0 n6k0Var = (n6k0) next;
                if (n6k0Var != null) {
                    boolValueOf = Boolean.valueOf(n6k0Var.e);
                } else {
                    Iterator it3 = list2.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!((r5k0) next2).a.equals(str));
                    r5k0 r5k0Var = (r5k0) next2;
                    boolValueOf = r5k0Var != null ? Boolean.valueOf(r5k0Var.c) : null;
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
            String str2 = (String) map.get(((u5k0) it4.next()).c);
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
            String str3 = ((u5k0) it5.next()).c;
            Iterator it6 = list.iterator();
            do {
                if (!it6.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it6.next();
            } while (!((n6k0) next3).a.equals(str3));
            n6k0 n6k0Var2 = (n6k0) next3;
            if (n6k0Var2 != null) {
                bigDecimal = n6k0Var2.b;
            } else {
                Iterator it7 = list2.iterator();
                do {
                    if (!it7.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it7.next();
                } while (!((r5k0) next4).a.equals(str3));
                r5k0 r5k0Var2 = (r5k0) next4;
                bigDecimal = r5k0Var2 != null ? r5k0Var2.b : null;
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
        return new rmo(iG, coloredUiText, numValueOf, new ColoredUiText(new ResourceUiText(i), Integer.valueOf(i2), null), rqf0.p(q5k0Var.c), strA, rqf0.m(q5k0Var.d, z, z2), rqf0.v(q5k0Var.e));
    }
}
