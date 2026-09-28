package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sporty.android.book.domain.entity.Sport;
import com.sporty.android.book.domain.entity.SportsMenuData;
import com.sporty.android.book.domain.entity.UIState;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class vfg0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(927697247);
        int i2 = 1;
        if (bVarI.q(i & 1, i != 0)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final dgb0 dgb0Var = (dgb0) p8i0.a(jq40.a(dgb0.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            final ytw ytwVarC = wyh.c(dgb0Var.A, bVarI, 0, 7);
            final ytw ytwVarC2 = wyh.c(dgb0Var.w, bVarI, 0, 7);
            final ytw ytwVarC3 = wyh.c(dgb0Var.i, bVarI, 0, 7);
            ytw ytwVarC4 = wyh.c(dgb0Var.K, bVarI, 0, 7);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = a6a0.b(new Function0() { // from class: sfg0
                    /* JADX WARN: Code duplicated, block: B:67:0x0124  */
                    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
                    /* JADX WARN: Code duplicated, block: B:72:0x0136  */
                    /* JADX WARN: Code duplicated, block: B:78:0x0144  */
                    /* JADX WARN: Code duplicated, block: B:79:0x0147  */
                    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
                    /* JADX WARN: Code duplicated, block: B:87:0x013f A[SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:88:0x0140 A[EDGE_INSN: B:88:0x0140->B:76:0x0140 BREAK  A[LOOP:1: B:68:0x0128->B:90:?], SYNTHETIC] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int size;
                        Object obj;
                        rfg0 rfg0Var;
                        String str;
                        rfg0 rfg0Var2;
                        Object obj2;
                        Map<String, Sport> sportMap;
                        Sport sport;
                        Map<String, Sport> popularSportsMap;
                        Sport sport2;
                        Map<String, Sport> topSportsMap;
                        Sport sport3;
                        Map map = (Map) ytwVarC.getValue();
                        twd0 twd0Var = ytwVarC3;
                        List list = (List) map.get((String) twd0Var.getValue());
                        int i3 = 0;
                        boolean z = list != null && (list.isEmpty() ^ true);
                        twd0 twd0Var2 = ytwVarC2;
                        SportsMenuData sportsMenuData = (SportsMenuData) ((UIState) twd0Var2.getValue()).getData();
                        boolean z2 = ((sportsMenuData == null || (topSportsMap = sportsMenuData.getTopSportsMap()) == null || (sport3 = topSportsMap.get((String) twd0Var.getValue())) == null) ? null : sport3.getTopCategory()) != null;
                        SportsMenuData sportsMenuData2 = (SportsMenuData) ((UIState) twd0Var2.getValue()).getData();
                        boolean z3 = ((sportsMenuData2 == null || (popularSportsMap = sportsMenuData2.getPopularSportsMap()) == null || (sport2 = popularSportsMap.get((String) twd0Var.getValue())) == null) ? null : sport2.getCategories()) != null;
                        SportsMenuData sportsMenuData3 = (SportsMenuData) ((UIState) twd0Var2.getValue()).getData();
                        boolean z4 = ((sportsMenuData3 == null || (sportMap = sportsMenuData3.getSportMap()) == null || (sport = sportMap.get((String) twd0Var.getValue())) == null) ? null : sport.getCategories()) != null;
                        dgb0 dgb0Var2 = dgb0Var;
                        wwd0 wwd0Var = dgb0Var2.J;
                        boolean zIsLogin = dgb0Var2.d.isLogin();
                        rfg0 rfg0Var3 = new rfg0("my_favourites", R.string.common_functions__my_favourites);
                        if (!zIsLogin) {
                            rfg0Var3 = null;
                        }
                        rfg0 rfg0Var4 = new rfg0("top_leagues", R.string.my_favourites_settings__top_leagues);
                        if (!z2) {
                            rfg0Var4 = null;
                        }
                        rfg0 rfg0Var5 = new rfg0("popular_countries", R.string.sports_menu__popular_countries);
                        if (!z3) {
                            rfg0Var5 = null;
                        }
                        rfg0 rfg0Var6 = new rfg0("a_z", R.string.common_functions__a_z);
                        if (!z4) {
                            rfg0Var6 = null;
                        }
                        ArrayList arrayListV = ay0.v(new rfg0[]{rfg0Var3, rfg0Var4, rfg0Var5, rfg0Var6});
                        if (((CharSequence) wwd0Var.getValue()).length() == 0) {
                            size = arrayListV.size();
                            do {
                                if (i3 < size) {
                                    obj = null;
                                    break;
                                }
                                obj = arrayListV.get(i3);
                                i3++;
                                rfg0Var2 = (rfg0) obj;
                                if (z) {
                                    break;
                                }
                            } while (rfg0Var2.a.equals("my_favourites"));
                            rfg0Var = (rfg0) obj;
                            if (rfg0Var != null) {
                                str = rfg0Var.a;
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str = "";
                            }
                            wwd0Var.k(null, str);
                        } else {
                            int size2 = arrayListV.size();
                            int i4 = 0;
                            do {
                                if (i4 >= size2) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = arrayListV.get(i4);
                                i4++;
                            } while (!((rfg0) obj2).a.equals(wwd0Var.getValue()));
                            if (obj2 == null) {
                                size = arrayListV.size();
                                do {
                                    if (i3 < size) {
                                        obj = null;
                                        break;
                                    }
                                    obj = arrayListV.get(i3);
                                    i3++;
                                    rfg0Var2 = (rfg0) obj;
                                    if (z) {
                                        break;
                                        break;
                                    }
                                } while (rfg0Var2.a.equals("my_favourites"));
                                rfg0Var = (rfg0) obj;
                                if (rfg0Var != null) {
                                    str = rfg0Var.a;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    str = "";
                                }
                                wwd0Var.k(null, str);
                            }
                        }
                        return arrayListV;
                    }
                });
                bVarI.r(objY);
            }
            twd0 twd0Var = (twd0) objY;
            List list = (List) twd0Var.getValue();
            String str = (String) ytwVarC4.getValue();
            boolean zA = bVarI.A(dgb0Var);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new q8c0(i2, dgb0Var, twd0Var);
                bVarI.r(objY2);
            }
            b(list, str, (Function1) objY2, bVarI, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new tfg0();
        }
    }

    public static final void b(final List list, final String str, Function1 function1, a aVar, final int i) {
        final Function1 function2;
        list.getClass();
        str.getClass();
        b bVarI = aVar.i(1022916628);
        int i2 = (bVarI.M(list) ? 4 : 2) | i | (bVarI.M(str) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            bVarI.N(-524625646);
            int i3 = 0;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(cb40.a(((rfg0) it.next()).b, new Object[0], bVarI));
            }
            bVarI.X(false);
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    i3 = -1;
                    break;
                } else if (((rfg0) it2.next()).a.equals(str)) {
                    break;
                } else {
                    i3++;
                }
            }
            function2 = function1;
            pr70.a(null, arrayList, i3, function2, bVarI, (i2 << 3) & 7168);
        } else {
            function2 = function1;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(list, str, function2, i) { // from class: ufg0
                public final /* synthetic */ List a;
                public final /* synthetic */ String b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    vfg0.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
