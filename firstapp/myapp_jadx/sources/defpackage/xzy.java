package defpackage;

import android.text.TextUtils;
import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.BetDetail;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xzy {
    public final Round a;
    public final List<Bet> b;
    public final int c;
    public final BetDetail d;
    public final int e;
    public final String f;
    public final boolean g;
    public final LinkedList<xzy> h;
    public j7g i;
    public a j;
    public final ji2 k;

    public static class a {
        public j7g a;
        public String b;
        public j7g c;
        public String d;
        public ArrayList e;
    }

    public xzy(Round round, List<Bet> list, int i, BetDetail betDetail, ji2 ji2Var, int i2, boolean z, String str) {
        LinkedList<xzy> linkedList = new LinkedList<>();
        this.h = linkedList;
        this.a = round;
        this.b = list;
        this.c = i;
        this.d = betDetail;
        this.k = ji2Var;
        this.e = i2;
        this.g = z;
        this.f = str;
        if (i == 2) {
            HashSet hashSet = new HashSet();
            HashSet<BetDetail> hashSet2 = new HashSet();
            Iterator<Bet> it = list.iterator();
            while (it.hasNext()) {
                for (BetDetail betDetail2 : it.next().betDetails) {
                    if (!hashSet.contains(betDetail2.outcomeId)) {
                        hashSet2.add(betDetail2);
                        hashSet.add(betDetail2.outcomeId);
                    }
                }
            }
            int size = hashSet2.size();
            int i3 = 0;
            for (BetDetail betDetail3 : hashSet2) {
                Round round2 = this.a;
                if (i3 == 0) {
                    List<Bet> list2 = this.b;
                    if (size == 1) {
                        linkedList.add(new xzy(round2, list2, 4, betDetail3, this.k, this.e, true, this.f));
                    } else {
                        linkedList.add(new xzy(round2, list2, 3, betDetail3, this.k, this.e, true, this.f));
                    }
                } else {
                    int i4 = size - 1;
                    List<Bet> list3 = this.b;
                    if (i4 == i3) {
                        linkedList.add(new xzy(round2, list3, 4, betDetail3, this.k, this.e, false, this.f));
                    } else {
                        linkedList.add(new xzy(round2, list3, 3, betDetail3, this.k, this.e, false, this.f));
                    }
                }
                i3++;
            }
        }
        if (this.c != 1) {
            return;
        }
        HashSet hashSet3 = new HashSet();
        Iterator<Bet> it2 = this.b.iterator();
        while (it2.hasNext()) {
            for (BetDetail betDetail4 : it2.next().betDetails) {
                if (!hashSet3.contains(betDetail4.outcomeId)) {
                    hashSet3.add(betDetail4.outcomeId);
                    if (!TextUtils.isEmpty(betDetail4.marketId) && !this.k.b(betDetail4.marketId)) {
                        this.h.add(new xzy(this.a, this.b, 6, betDetail4, this.k, this.e, true, this.f));
                    }
                }
            }
        }
    }
}
