package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import com.sportybet.plugin.realsports.prematch.data.TournamentTitleData;
import com.sportybet.plugin.realsports.sportssoccer.expandview.RegionsListView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vah implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vah(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object value;
        lk50.c cVar;
        List list;
        Object obj;
        TournamentTitleData tournamentTitleData;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((bbh) obj2).p0();
                break;
            default:
                ggg0 ggg0Var = (ggg0) obj2;
                Object tag = view.getTag();
                if (!(tag instanceof String)) {
                    tag = null;
                }
                String str = (String) tag;
                if (str != null) {
                    PreMatchSportActivity preMatchSportActivity = PreMatchSportActivity.this;
                    LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                    jk20 jk20VarI1 = preMatchSportActivity.I1();
                    rs40.b().a.remove(str);
                    jk20VarI1.z.remove(str);
                    wwd0 wwd0Var = jk20VarI1.H;
                    do {
                        value = wwd0Var.getValue();
                        lk50 lk50Var = (lk50) value;
                        if (lk50Var instanceof lk50.c) {
                            cVar = (lk50.c) lk50Var;
                            list = (List) cVar.a;
                            ArrayList arrayListA = kw5.a(list);
                            for (Object obj3 : list) {
                                if (obj3 instanceof TournamentTitleData) {
                                    arrayListA.add(obj3);
                                }
                            }
                            int size = arrayListA.size();
                            int i2 = 0;
                            do {
                                if (i2 < size) {
                                    obj = arrayListA.get(i2);
                                    i2++;
                                } else {
                                    obj = null;
                                }
                                tournamentTitleData = (TournamentTitleData) obj;
                                if (tournamentTitleData != null) {
                                    ArrayList arrayList = new ArrayList(list);
                                    arrayList.remove(tournamentTitleData);
                                    list = arrayList;
                                }
                            } while (!Intrinsics.g(((TournamentTitleData) obj).getTournamentId(), str));
                            tournamentTitleData = (TournamentTitleData) obj;
                            if (tournamentTitleData != null) {
                                ArrayList arrayList2 = new ArrayList(list);
                                arrayList2.remove(tournamentTitleData);
                                list = arrayList2;
                            }
                        }
                        ymh ymhVarC1 = preMatchSportActivity.C1();
                        ((RegionsListView) ymhVarC1.f.getValue()).d(ymhVarC1.m);
                        break;
                    } while (!wwd0Var.g(value, new lk50.c(list, cVar.b)));
                    ymh ymhVarC2 = preMatchSportActivity.C1();
                    ((RegionsListView) ymhVarC2.f.getValue()).d(ymhVarC2.m);
                    break;
                }
                break;
        }
    }
}
