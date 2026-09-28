package defpackage;

import android.util.Range;
import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.multimaker.domain.model.MultiMakerSport;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class liw {
    public static void a(wwd0 wwd0Var, boolean z, boolean z2, UiText uiText, List list, List list2) {
        Object value;
        kiw kiwVar;
        wwd0Var.getClass();
        uiText.getClass();
        list.getClass();
        list2.getClass();
        do {
            value = wwd0Var.getValue();
            kiwVar = (kiw) value;
        } while (!wwd0Var.g(value, kiw.a(kiwVar, null, ogw.a(kiwVar.b, z, z2, uiText, list, list2, 32), null, null, null, 0, false, false, false, false, 1021)));
    }

    public static void b(wwd0 wwd0Var, List list, boolean z, boolean z2) {
        Object value;
        kiw kiwVar;
        fiw fiwVar;
        ArrayList arrayList;
        wwd0Var.getClass();
        list.getClass();
        do {
            value = wwd0Var.getValue();
            kiwVar = (kiw) value;
            fiwVar = kiwVar.a;
            arrayList = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MultiMakerSport multiMakerSport = (MultiMakerSport) it.next();
                String str = multiMakerSport.a;
                UiText uiText = multiMakerSport.b;
                String str2 = multiMakerSport.c;
                boolean z3 = multiMakerSport.e;
                str.getClass();
                uiText.getClass();
                str2.getClass();
                arrayList.add(new MultiMakerSport(uiText, str, str2, z, z3));
            }
        } while (!wwd0Var.g(value, kiw.a(kiwVar, new fiw(fiwVar.c, arrayList, z2), null, null, null, null, 0, false, false, false, false, 1022)));
    }

    public static ohw c(ohw ohwVar, boolean z, mhw mhwVar, lhw lhwVar, lhw lhwVar2, Range range, Range range2, Range range3) {
        Float fValueOf;
        String strB;
        UiText stringUiText;
        ohwVar.getClass();
        mhwVar.getClass();
        lhwVar.getClass();
        lhwVar2.getClass();
        range.getClass();
        range2.getClass();
        range3.getClass();
        float f = lhwVar.a;
        Object lower = range2.getLower();
        lower.getClass();
        float fMax = Math.max(f, ((Number) lower).floatValue());
        Object upper = range2.getUpper();
        upper.getClass();
        float fMin = Math.min(fMax, ((Number) upper).floatValue());
        Float f2 = lhwVar.b;
        if (f2 != null) {
            float fFloatValue = f2.floatValue();
            Object lower2 = range2.getLower();
            lower2.getClass();
            float fMax2 = Math.max(fFloatValue, ((Number) lower2).floatValue());
            Object upper2 = range2.getUpper();
            upper2.getClass();
            fValueOf = Float.valueOf(Math.min(fMax2, ((Number) upper2).floatValue()));
        } else {
            fValueOf = null;
        }
        lhw lhwVar3 = new lhw(fMin, fValueOf);
        float f3 = lhwVar2.a;
        Object lower3 = range3.getLower();
        lower3.getClass();
        float fMax3 = Math.max(f3, ((Number) lower3).floatValue());
        Object upper3 = range3.getUpper();
        upper3.getClass();
        float fMin2 = Math.min(fMax3, ((Number) upper3).floatValue());
        lhw lhwVar4 = new lhw(fMin2, null);
        List<Float> list = b980.a;
        String strA = yk10.a(gky.a.b(fMin, false), " ~ ");
        StringUiText stringUiText2 = vch0.a;
        StringUiText stringUiText3 = new StringUiText(strA);
        if (Intrinsics.e(fValueOf, Float.MAX_VALUE)) {
            stringUiText = new ResourceUiText(R.string.component_odds_filters__max);
        } else {
            if (fValueOf == null || (strB = gky.a.b(fValueOf.floatValue(), false)) == null) {
                strB = "";
            }
            stringUiText = new StringUiText(strB);
        }
        ConcatUiText concatUiText = new ConcatUiText(new UiText[]{stringUiText3, stringUiText});
        Object lower4 = range.getLower();
        lower4.getClass();
        float fFloatValue2 = ((Number) lower4).floatValue();
        Object upper4 = range.getUpper();
        upper4.getClass();
        float fFloatValue3 = ((Number) upper4).floatValue();
        Object lower5 = b980.b(lhwVar3).getLower();
        lower5.getClass();
        nhw nhwVar = new nhw(fFloatValue2, fFloatValue3, ((Number) lower5).floatValue(), (Float) b980.b(lhwVar3).getUpper());
        StringUiText stringUiText4 = new StringUiText(inm.a(" ~ ", gky.a.b(fMin2, false)));
        Object lower6 = range3.getLower();
        lower6.getClass();
        float fFloatValue4 = ((Number) lower6).floatValue();
        Object upper5 = range3.getUpper();
        upper5.getClass();
        nhw nhwVar2 = new nhw(fFloatValue4, ((Number) upper5).floatValue(), fMin2, null);
        Range<Float> range4 = ohwVar.i;
        Range<Float> range5 = ohwVar.j;
        Range<Float> range6 = ohwVar.k;
        range4.getClass();
        range5.getClass();
        range6.getClass();
        return new ohw(z, mhwVar, lhwVar3, lhwVar4, concatUiText, stringUiText4, nhwVar, nhwVar2, range4, range5, range6);
    }

    public static ohw d(ohw ohwVar, mhw mhwVar, lhw lhwVar, lhw lhwVar2, int i) {
        boolean z = ohwVar.a;
        if ((i & 2) != 0) {
            mhwVar = ohwVar.b;
        }
        mhw mhwVar2 = mhwVar;
        if ((i & 4) != 0) {
            lhwVar = ohwVar.c;
        }
        lhw lhwVar3 = lhwVar;
        if ((i & 8) != 0) {
            lhwVar2 = ohwVar.d;
        }
        return c(ohwVar, z, mhwVar2, lhwVar3, lhwVar2, ohwVar.i, ohwVar.j, ohwVar.k);
    }
}
