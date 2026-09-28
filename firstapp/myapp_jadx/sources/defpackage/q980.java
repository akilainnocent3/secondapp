package defpackage;

import com.sporty.android.core.model.config.BoreDrawItem;
import com.sportybet.plugin.realsports.data.BoreDrawConfig;
import com.sportybet.plugin.realsports.data.RSelection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class q980 {
    public static final CharSequence a(RSelection rSelection) {
        String str;
        rSelection.getClass();
        int i = rSelection.eventStatus;
        if (i != 1 && i != 2) {
            String str2 = "";
            if (i != 3 && i != 4) {
                return "";
            }
            if (!b3.T(rSelection.eventId) && (str = rSelection.setScore) != null && str.length() > 0) {
                str2 = rSelection.setScore;
            }
            str2.getClass();
            return str2;
        }
        mfb0 mfb0VarE = lfb0.d().e(rSelection.sportId);
        ArrayList arrayList = new ArrayList();
        if (mfb0VarE != null) {
            arrayList.addAll(mfb0VarE.A(rSelection.setScore, rSelection.pointScore, rSelection.gameScore));
        }
        j7g j7gVar = new j7g();
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 2) {
                j7gVar.a((CharSequence) arrayList.get(0));
                j7gVar.a(":");
                j7gVar.a((CharSequence) arrayList.get(1));
                return j7gVar;
            }
            j7gVar.d((CharSequence) arrayList.get(0), true);
            j7gVar.d(":", true);
            j7gVar.d((CharSequence) arrayList.get(1), true);
            for (int i2 = 2; i2 < arrayList.size(); i2 += 2) {
                j7gVar.a("  ");
                j7gVar.a((CharSequence) arrayList.get(i2));
                j7gVar.a(":");
                j7gVar.a((CharSequence) arrayList.get(i2 + 1));
            }
        }
        return j7gVar;
    }

    public static final boolean b(String str, String str2, String str3, List list) {
        str.getClass();
        str2.getClass();
        if (list != null && !list.isEmpty()) {
            if (list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                BoreDrawItem boreDrawItem = (BoreDrawItem) it.next();
                if (!Intrinsics.g(String.valueOf(boreDrawItem.getMarketId()), str) || !Intrinsics.g(String.valueOf(boreDrawItem.getExcludedOutcomeId()), str2)) {
                }
            }
            return true;
        }
        if (str3 != null && !StringsKt.M(str3, "Draw/Draw", false) && !StringsKt.M(str3, "0:0", false)) {
            return true;
        }
        return false;
    }

    public static final boolean c(RSelection rSelection) {
        if (rSelection.status == 0) {
            return kgb0.a.contains(rSelection.tournamentId);
        }
        return false;
    }

    public static final boolean d(BoreDrawConfig boreDrawConfig, String str, int i, int i2, String str2, String str3, String str4, String str5) {
        boreDrawConfig.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        cqu[] cquVarArr = cqu.a;
        if ((Intrinsics.g(str2, "45") || Intrinsics.g(str2, "47")) && Intrinsics.g(str3, "sr:sport:1")) {
            boolean z = i2 == 0;
            boolean z2 = i == 0 && str.equals("0:0");
            boolean z3 = i == 4;
            if ((z || z2 || z3) && b(str2, str4, str5, boreDrawConfig.getBoreDrawItems())) {
                return true;
            }
        }
        return false;
    }
}
