package com.sportybet.feature.luckynumber.luncher;

import android.net.Uri;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import defpackage.ay0;
import defpackage.bnh0;
import defpackage.drq;
import defpackage.e1i;
import defpackage.j8i0;
import defpackage.k650;
import defpackage.l48;
import defpackage.o8i0;
import defpackage.odd;
import defpackage.or60;
import defpackage.ozh;
import defpackage.q490;
import defpackage.v340;
import defpackage.vu60;
import defpackage.yi5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/luckynumber/luncher/c;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c extends j8i0 {
    public final vu60 a;
    public final yi5 b;
    public final bnh0 c;
    public final drq d;
    public final String e;
    public final v340 f;

    public c(vu60 vu60Var, k650 k650Var, yi5 yi5Var, bnh0 bnh0Var, drq drqVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        vu60Var.getClass();
        k650Var.getClass();
        yi5Var.getClass();
        bnh0Var.getClass();
        drqVar.getClass();
        this.a = vu60Var;
        this.b = yi5Var;
        this.c = bnh0Var;
        this.d = drqVar;
        this.e = bnh0.d(bnh0Var, new String[]{"lucky-numbers"}, null, 6);
        this.f = e1i.e(ozh.c(new or60(new b(this, k650Var, null)), oddVar), o8i0.d(this), q490.a.a, a.d.a);
    }

    public static int x1(String str, String str2) {
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(l48.r(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
            arrayList.add(Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0));
        }
        List listSplit$default2 = StringsKt__StringsKt.split$default(str2, new String[]{"."}, false, 0, 6, null);
        ArrayList arrayList2 = new ArrayList(l48.r(listSplit$default2, 10));
        Iterator it2 = listSplit$default2.iterator();
        while (it2.hasNext()) {
            Integer intOrNull2 = StringsKt.toIntOrNull((String) it2.next());
            arrayList2.add(Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : 0));
        }
        int iMax = Math.max(arrayList.size(), arrayList2.size());
        int i = 0;
        while (i < iMax) {
            int iIntValue = ((Number) ((i < 0 || i >= arrayList.size()) ? 0 : arrayList.get(i))).intValue();
            int iIntValue2 = ((Number) ((i < 0 || i >= arrayList2.size()) ? 0 : arrayList2.get(i))).intValue();
            if (iIntValue > iIntValue2) {
                return 1;
            }
            if (iIntValue < iIntValue2) {
                return -1;
            }
            i++;
        }
        return 0;
    }

    public final String y1(String str, String str2) {
        String strD;
        String str3 = null;
        if (str != null) {
            strD = bnh0.d(this.c, new String[]{str}, null, 6);
        } else {
            strD = this.e;
        }
        Uri uriBuild = Uri.parse(strD);
        if (!StringsKt.U(str2)) {
            String encodedQuery = uriBuild.getEncodedQuery();
            if (encodedQuery != null && !StringsKt.U(encodedQuery)) {
                str3 = encodedQuery;
            }
            uriBuild = uriBuild.buildUpon().encodedQuery(CollectionsKt.a0(ay0.v(new String[]{str3, str2}), "&", null, null, null, 62)).build();
            uriBuild.getClass();
        }
        String string = uriBuild.toString();
        string.getClass();
        return string;
    }
}
