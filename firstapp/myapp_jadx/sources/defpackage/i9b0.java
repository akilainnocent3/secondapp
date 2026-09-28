package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.spinmatch.components.BetChips;
import com.sportygames.spinmatch.model.response.DetailResponse;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i9b0 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i9b0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0277  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01db  */
    /* JADX WARN: Code duplicated, block: B:71:0x0224  */
    /* JADX WARN: Code duplicated, block: B:74:0x022d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0236  */
    /* JADX WARN: Code duplicated, block: B:80:0x023f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0245  */
    /* JADX WARN: Code duplicated, block: B:83:0x024c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0251  */
    /* JADX WARN: Code duplicated, block: B:88:0x0256  */
    /* JADX WARN: Code duplicated, block: B:91:0x025c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0265  */
    /* JADX WARN: Code duplicated, block: B:97:0x026e  */
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DetailResponse.BetConfigList betConfigList;
        int iIndexOf;
        List<Double> list;
        boolean z;
        fo80 fo80Var;
        String strA;
        fo80 fo80Var2;
        fo80 fo80Var3;
        fo80 fo80Var4;
        fo80 fo80Var5;
        fo80 fo80Var6;
        fo80 fo80Var7;
        fo80 fo80Var8;
        fo80 fo80Var9;
        vk2 vk2Var;
        RecyclerView.f adapter;
        tk2 tk2Var;
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                kab0 kab0Var = (kab0) obj4;
                GiftItem giftItem = (GiftItem) obj;
                Double d = (Double) obj2;
                double dDoubleValue = d.doubleValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                giftItem.getClass();
                kab0Var.k0 = zBooleanValue;
                Double dValueOf = Double.valueOf(0.0d);
                kab0Var.j0 = true;
                xi60 xi60Var = kab0Var.B;
                if (xi60Var != null) {
                    xi60Var.dismiss();
                }
                kab0Var.B = null;
                nbb0 nbb0VarW0 = kab0Var.w0();
                nbb0VarW0.c = giftItem.getGiftId();
                nbb0VarW0.b = d;
                String str = "0.00";
                boolean zContainsKey = kab0Var.f.containsKey(Integer.valueOf(kab0Var.i));
                HashMap<Integer, List<Double>> map = kab0Var.f;
                int i2 = kab0Var.i;
                if (zContainsKey) {
                    List<Double> list2 = map.get(Integer.valueOf(i2));
                    if (list2 != null) {
                        list2.add(d);
                    }
                    List<Double> list3 = kab0Var.f.get(Integer.valueOf(kab0Var.i));
                    if (list3 != null) {
                        CollectionsKt.j0(list3, d);
                    }
                    if (list2 != null) {
                        kab0Var.f.put(Integer.valueOf(kab0Var.i), list2);
                    }
                } else {
                    map.put(Integer.valueOf(i2), b.l(d));
                }
                if ((kab0Var.f.size() == 1 && kab0Var.f.values().size() > 0) || kab0Var.f.size() > 1) {
                    kab0Var.q0();
                }
                fo80 fo80Var10 = kab0Var.c;
                if (fo80Var10 != null) {
                    BetChips betChips = fo80Var10.i;
                    Double dValueOf2 = Double.valueOf(kab0Var.v);
                    List<Double> list4 = kab0Var.f.get(Integer.valueOf(kab0Var.i));
                    betChips.J(dValueOf2, list4 != null ? Double.valueOf(CollectionsKt.s0(list4)) : null);
                }
                fo80 fo80Var11 = kab0Var.c;
                if (fo80Var11 != null) {
                    fo80Var11.i.I(true);
                }
                ArrayList<DetailResponse.BetConfigList> arrayList = kab0Var.y;
                int size = arrayList.size();
                int i3 = 0;
                try {
                    do {
                        if (i3 < size) {
                            betConfigList = arrayList.get(i3);
                            i3++;
                        } else {
                            betConfigList = null;
                        }
                        iIndexOf = arrayList.indexOf(betConfigList);
                        list = kab0Var.f.get(Integer.valueOf(kab0Var.i));
                        if (list == null && list.size() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        fo80Var = kab0Var.c;
                        if (fo80Var != null) {
                            fo80Var.c.F(dDoubleValue, iIndexOf, z);
                        }
                        op5 op5Var = op5.a;
                        String string = kab0Var.getString(R.string.btn_spin_total_stake_text_cms);
                        string.getClass();
                        String string2 = kab0Var.getString(R.string.total_stake);
                        string2.getClass();
                        op5Var.getClass();
                        String strB = op5.b(string, string2, null);
                        String strI = op5.i(kab0Var.L);
                        TreeMap treeMap = pw.a;
                        String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue);
                        str2.getClass();
                        str = str2;
                        strA = tx5.a(strB, " : ", strI, " ", pw.a(str));
                        fo80Var2 = kab0Var.c;
                        if (fo80Var2 != null) {
                            fo80Var2.b.setText(strA);
                        }
                        fo80Var3 = kab0Var.c;
                        if (fo80Var3 != null) {
                            fo80Var3.b.setVisibility(0);
                        }
                        fo80Var4 = kab0Var.c;
                        if (fo80Var4 != null) {
                            fo80Var4.H.setVisibility(0);
                        }
                        fo80Var5 = kab0Var.c;
                        if (fo80Var5 != null) {
                            vk2Var = fo80Var5.c.binding;
                            if (vk2Var != null) {
                                adapter = vk2Var.b.getAdapter();
                            } else {
                                adapter = null;
                            }
                            tk2Var = adapter instanceof tk2 ? (tk2) adapter : null;
                            if (tk2Var != null) {
                                tk2Var.v = true;
                            }
                        }
                        fo80Var6 = kab0Var.c;
                        if (fo80Var6 != null) {
                            fo80Var6.i.J(dValueOf, dValueOf);
                        }
                        fo80Var7 = kab0Var.c;
                        if (fo80Var7 != null) {
                            fo80Var7.i.H();
                        }
                        fo80Var8 = kab0Var.c;
                        if (fo80Var8 != null) {
                            fo80Var8.i.F(false);
                        }
                        fo80Var9 = kab0Var.c;
                        if (fo80Var9 != null) {
                            fo80Var9.i.I(false);
                        }
                        return Unit.a;
                    } while (betConfigList.getId() != kab0Var.i);
                    String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue);
                    str3.getClass();
                    str = str3;
                } catch (Exception unused) {
                }
                iIndexOf = arrayList.indexOf(betConfigList);
                list = kab0Var.f.get(Integer.valueOf(kab0Var.i));
                if (list == null) {
                    z = false;
                } else {
                    z = false;
                }
                fo80Var = kab0Var.c;
                if (fo80Var != null) {
                    fo80Var.c.F(dDoubleValue, iIndexOf, z);
                }
                op5 op5Var2 = op5.a;
                String string3 = kab0Var.getString(R.string.btn_spin_total_stake_text_cms);
                string3.getClass();
                String string4 = kab0Var.getString(R.string.total_stake);
                string4.getClass();
                op5Var2.getClass();
                String strB2 = op5.b(string3, string4, null);
                String strI2 = op5.i(kab0Var.L);
                TreeMap treeMap2 = pw.a;
                strA = tx5.a(strB2, " : ", strI2, " ", pw.a(str));
                fo80Var2 = kab0Var.c;
                if (fo80Var2 != null) {
                    fo80Var2.b.setText(strA);
                }
                fo80Var3 = kab0Var.c;
                if (fo80Var3 != null) {
                    fo80Var3.b.setVisibility(0);
                }
                fo80Var4 = kab0Var.c;
                if (fo80Var4 != null) {
                    fo80Var4.H.setVisibility(0);
                }
                fo80Var5 = kab0Var.c;
                if (fo80Var5 != null) {
                    vk2Var = fo80Var5.c.binding;
                    if (vk2Var != null) {
                        adapter = vk2Var.b.getAdapter();
                    } else {
                        adapter = null;
                    }
                    if (adapter instanceof tk2) {
                    }
                    if (tk2Var != null) {
                        tk2Var.v = true;
                    }
                }
                fo80Var6 = kab0Var.c;
                if (fo80Var6 != null) {
                    fo80Var6.i.J(dValueOf, dValueOf);
                }
                fo80Var7 = kab0Var.c;
                if (fo80Var7 != null) {
                    fo80Var7.i.H();
                }
                fo80Var8 = kab0Var.c;
                if (fo80Var8 != null) {
                    fo80Var8.i.F(false);
                }
                fo80Var9 = kab0Var.c;
                if (fo80Var9 != null) {
                    fo80Var9.i.I(false);
                }
                return Unit.a;
            default:
                Function0 function0 = (Function0) obj4;
                a aVar = (a) obj2;
                ((Integer) obj3).getClass();
                ((jh0) obj).getClass();
                i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar, 48);
                int iHashCode = Long.hashCode(aVar.m());
                ne00 ne00VarO = aVar.o();
                d.a aVar2 = d.a.b;
                d dVarC = c.c(aVar, aVar2);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                if (aVar.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar.D();
                if (aVar.g()) {
                    aVar.F(aVar3);
                } else {
                    aVar.p();
                }
                hlh0.a(aVar, i78VarA, yka.a.f);
                hlh0.a(aVar, ne00VarO, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                    j3c.a(iHashCode, aVar, iHashCode, c1350a);
                }
                hlh0.a(aVar, dVarC, yka.a.d);
                mw90.a(com.sportygames.newcms.c.c(vue0.X0.y, new String[0], aVar), "locker", j.t(aVar2, 50.0f, 66.0f), null, null, null, null, aVar, 432, 2040);
                kxe0.a(6, aVar, h.j(aVar2, 0.0f, 10.0f, 0.0f, 0.0f, 13), function0);
                aVar.s();
                return Unit.a;
        }
    }
}
