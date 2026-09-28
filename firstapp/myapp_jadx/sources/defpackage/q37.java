package defpackage;

import com.sporty.android.core.model.loyalty.BetBuilderType;
import com.sporty.android.core.model.loyalty.EarlyGoalsType;
import com.sporty.android.core.model.loyalty.UpType;
import com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class q37 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayList = ((uxt) obj).c;
        ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            urt urtVar = (urt) obj2;
            urtVar.getClass();
            long j = urtVar.a;
            mz6 mz6VarD = wz6.d(urtVar.b);
            b27 b27VarE = wz6.e(urtVar.c);
            m2g m2gVar = m2g.a;
            String str = urtVar.d;
            String str2 = urtVar.e;
            yrt yrtVar = urtVar.h;
            ChallengeType challengeTypeF = wz6.f(yrtVar.a);
            int i2 = yrtVar.b;
            String str3 = yrtVar.c;
            ArrayList arrayList3 = arrayList;
            String str4 = !StringsKt.U(str3) ? str3 : null;
            ArrayList arrayList4 = arrayList2;
            long j2 = yrtVar.d;
            long j3 = urtVar.f;
            long j4 = urtVar.g;
            Integer num = yrtVar.u;
            int iIntValue = num != null ? num.intValue() : 0;
            hk2 hk2VarB = wz6.b(yrtVar.e);
            List<String> list = yrtVar.f;
            int i3 = size;
            ArrayList arrayList5 = new ArrayList(l48.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList5.add(wz6.m((String) it.next()));
            }
            List<String> list2 = yrtVar.g;
            ArrayList arrayList6 = new ArrayList(l48.r(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList6.add(wz6.l((String) it2.next()));
            }
            List<String> list3 = yrtVar.h;
            List<String> list4 = yrtVar.i;
            List<String> list5 = yrtVar.j;
            ArrayList arrayList7 = new ArrayList(l48.r(list5, 10));
            Iterator<T> it3 = list5.iterator();
            while (it3.hasNext()) {
                arrayList7.add(wz6.c((String) it3.next()));
            }
            List<String> list6 = yrtVar.k;
            ArrayList arrayList8 = new ArrayList();
            Iterator<T> it4 = list6.iterator();
            while (it4.hasNext()) {
                BetBuilderType betBuilderTypeA = wz6.a((String) it4.next());
                if (betBuilderTypeA != null) {
                    arrayList8.add(betBuilderTypeA);
                }
            }
            List<String> list7 = yrtVar.l;
            ArrayList arrayList9 = new ArrayList();
            Iterator<T> it5 = list7.iterator();
            while (it5.hasNext()) {
                ArrayList arrayList10 = arrayList7;
                UpType upTypeN = wz6.n((String) it5.next());
                if (upTypeN != null) {
                    arrayList9.add(upTypeN);
                }
                arrayList7 = arrayList10;
            }
            ArrayList arrayList11 = arrayList7;
            List<String> list8 = yrtVar.m;
            ArrayList arrayList12 = new ArrayList();
            Iterator it6 = list8.iterator();
            while (it6.hasNext()) {
                Iterator it7 = it6;
                EarlyGoalsType earlyGoalsTypeK = wz6.k((String) it6.next());
                if (earlyGoalsTypeK != null) {
                    arrayList12.add(earlyGoalsTypeK);
                }
                it6 = it7;
            }
            Long l = yrtVar.n;
            t27 t27Var = new t27(hk2VarB, arrayList5, arrayList6, list3, list4, arrayList11, arrayList8, arrayList9, arrayList12, l != null ? Double.valueOf(l.longValue()) : null, yrtVar.o, yrtVar.p, yrtVar.q, yrtVar.r);
            List<k27> list9 = yrtVar.s;
            ArrayList arrayList13 = new ArrayList(l48.r(list9, 10));
            Iterator<T> it8 = list9.iterator();
            while (it8.hasNext()) {
                arrayList13.add(j830.a((k27) it8.next()));
            }
            List<k27> list10 = yrtVar.t;
            ArrayList arrayList14 = new ArrayList(l48.r(list10, 10));
            Iterator<T> it9 = list10.iterator();
            while (it9.hasNext()) {
                arrayList14.add(j830.a((k27) it9.next()));
            }
            arrayList4.add(new jx6(new qw6(j, mz6VarD, b27VarE, m2gVar, str, str2, challengeTypeF, i2, str4, j2, j3, j4, iIntValue, t27Var, arrayList13, arrayList14), null, urtVar.i, false));
            arrayList2 = arrayList4;
            arrayList = arrayList3;
            size = i3;
        }
        return arrayList2;
    }
}
