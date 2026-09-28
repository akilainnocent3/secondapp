package defpackage;

import android.os.SystemClock;
import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class rl9 implements gld0, ss7 {
    public static final op8 a = new op8(1744245122, new ql9(), false);

    public rl9(rqf0 rqf0Var) {
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // defpackage.gld0
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i5 = i2 - iIntValue;
            if (i2 + i5 <= stackTraceElementArr.length) {
                int i6 = 0;
                while (true) {
                    if (i6 >= i5) {
                        int iIntValue2 = i2 - num.intValue();
                        if (i4 < 10) {
                            System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, iIntValue2);
                            i3 += iIntValue2;
                            i4++;
                        }
                        i = (iIntValue2 - 1) + i2;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                        i3++;
                        i4 = 1;
                        i = i2;
                        break;
                        break;
                    }
                    i6++;
                }
            } else {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i4 = 1;
                i = i2;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // defpackage.ss7
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    public rmo c(boolean z, List list, fon fonVar, Map map) {
        Object next;
        int i;
        Object next2;
        list.getClass();
        fonVar.getClass();
        map.getClass();
        List<gon> list2 = fonVar.h;
        boolean z2 = true;
        if (list2 == null || !list2.isEmpty()) {
            for (gon gonVar : list2) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((xon) next).a.equals(gonVar.c));
                xon xonVar = (xon) next;
                if (xonVar == null || !xonVar.e) {
                    z2 = false;
                    break;
                }
            }
        }
        ArrayList arrayList = new ArrayList(l48.r(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            String str = (String) map.get(((gon) it2.next()).c);
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
        String strA0 = CollectionsKt.a0(CollectionsKt.q0(arrayList), YAzniTbXHYQ.HZaF, null, null, null, 62);
        StringUiText stringUiText = vch0.a;
        StringUiText stringUiText2 = new StringUiText(strA0);
        int i2 = R.color.bg_secondary_d_black;
        ColoredUiText coloredUiText = new ColoredUiText(stringUiText2, Integer.valueOf(z ? R.color.text_inverse_primary : R.color.bg_secondary_d_black), null);
        BigDecimal bigDecimalMultiply = BigDecimal.ONE;
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            String str2 = ((gon) it3.next()).c;
            Iterator it4 = list.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!((xon) next2).a.equals(str2));
            xon xonVar2 = (xon) next2;
            if (xonVar2 != null) {
                BigDecimal bigDecimal = xonVar2.b;
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
            i = R.string.bet_history__waiting_to_start_game;
        }
        return new rmo(iG, coloredUiText, numValueOf, new ColoredUiText(new ResourceUiText(i), Integer.valueOf(i2), null), rqf0.p(fonVar.c), strA, rqf0.m(fonVar.d, z, z2), rqf0.v(fonVar.e));
    }
}
