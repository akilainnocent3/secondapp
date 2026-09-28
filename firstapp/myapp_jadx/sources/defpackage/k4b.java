package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.spinmatch.components.BetChips;
import com.sportygames.spinmatch.model.response.DetailResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k4b implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k4b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00fe  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        zn80 binding;
        zn80 binding2;
        zn80 binding3;
        kk2 binding4;
        double maxStakeAmount;
        kk2 binding5;
        kk2 binding6;
        ArrayList<DetailResponse.MaxBetConfigList> maxBetConfigList;
        DetailResponse.MaxBetConfigList maxBetConfigList2;
        DetailResponse.MaxBetConfigList maxBetConfigList3;
        fo80 fo80Var;
        kk2 binding7;
        DetailResponse detailResponse;
        long minStakeAmount;
        List<Double> list;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((iif0) obj2).r();
                break;
            case 1:
                lk50 lk50Var = (lk50) obj;
                lk50Var.getClass();
                wwd0 wwd0Var = ((jk20) obj2).F;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, lk50Var));
                break;
            default:
                kab0 kab0Var = (kab0) obj2;
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                if (iIntValue > -1) {
                    Double dValueOf = Double.valueOf(0.0d);
                    if (kab0Var.f.containsKey(Integer.valueOf(kab0Var.i)) && (list = kab0Var.f.get(Integer.valueOf(kab0Var.i))) != null && list.isEmpty()) {
                        kab0Var.f.remove(Integer.valueOf(kab0Var.i));
                    }
                    if (kab0Var.f.containsKey(num)) {
                        kab0Var.q0();
                    } else {
                        kab0Var.o0();
                    }
                    kab0Var.i = iIntValue;
                    DetailResponse detailResponse2 = kab0Var.z;
                    if (detailResponse2 == null || !Double.valueOf(detailResponse2.getMinStakeAmount() % 1.0d).equals(dValueOf)) {
                        DetailResponse detailResponse3 = kab0Var.z;
                        if ((detailResponse3 != null ? detailResponse3.getMinStakeAmount() : 0.0d) > 1000.0d) {
                            fo80Var = kab0Var.c;
                            if (fo80Var != null && (binding7 = fo80Var.i.getBinding()) != null) {
                                TextView textView = binding7.e;
                                TreeMap treeMap = pw.a;
                                detailResponse = kab0Var.z;
                                if (detailResponse != null) {
                                    minStakeAmount = (long) detailResponse.getMinStakeAmount();
                                } else {
                                    minStakeAmount = 0;
                                }
                                textView.setText(pw.h(minStakeAmount));
                            }
                        } else {
                            fo80 fo80Var2 = kab0Var.c;
                            if (fo80Var2 != null && (binding4 = fo80Var2.i.getBinding()) != null) {
                                TextView textView2 = binding4.e;
                                DetailResponse detailResponse4 = kab0Var.z;
                                textView2.setText(String.valueOf(detailResponse4 != null ? Double.valueOf(detailResponse4.getMinStakeAmount()) : null));
                            }
                        }
                    } else {
                        fo80Var = kab0Var.c;
                        if (fo80Var != null) {
                            TextView textView3 = binding7.e;
                            TreeMap treeMap2 = pw.a;
                            detailResponse = kab0Var.z;
                            if (detailResponse != null) {
                                minStakeAmount = (long) detailResponse.getMinStakeAmount();
                            } else {
                                minStakeAmount = 0;
                            }
                            textView3.setText(pw.h(minStakeAmount));
                        }
                    }
                    DetailResponse detailResponse5 = kab0Var.z;
                    if (detailResponse5 == null || (maxBetConfigList = detailResponse5.getMaxBetConfigList()) == null) {
                        maxStakeAmount = 0.0d;
                    } else {
                        int size = maxBetConfigList.size();
                        int i2 = 0;
                        do {
                            if (i2 < size) {
                                maxBetConfigList2 = maxBetConfigList.get(i2);
                                i2++;
                            } else {
                                maxBetConfigList2 = null;
                            }
                            maxBetConfigList3 = maxBetConfigList2;
                            if (maxBetConfigList3 != null) {
                                maxStakeAmount = maxBetConfigList3.getMaxStakeAmount();
                            } else {
                                maxStakeAmount = 0.0d;
                            }
                        } while (maxBetConfigList2.getBetConfigId() != iIntValue);
                        maxBetConfigList3 = maxBetConfigList2;
                        if (maxBetConfigList3 != null) {
                            maxStakeAmount = maxBetConfigList3.getMaxStakeAmount();
                        } else {
                            maxStakeAmount = 0.0d;
                        }
                    }
                    kab0Var.v = maxStakeAmount;
                    if (Double.valueOf(maxStakeAmount % 1.0d).equals(dValueOf) || kab0Var.v > 1000.0d) {
                        fo80 fo80Var3 = kab0Var.c;
                        if (fo80Var3 != null && (binding5 = fo80Var3.i.getBinding()) != null) {
                            TextView textView4 = binding5.c;
                            TreeMap treeMap3 = pw.a;
                            textView4.setText(pw.h((long) kab0Var.v));
                        }
                    } else {
                        fo80 fo80Var4 = kab0Var.c;
                        if (fo80Var4 != null && (binding6 = fo80Var4.i.getBinding()) != null) {
                            binding6.c.setText(String.valueOf(kab0Var.v));
                        }
                    }
                    fo80 fo80Var5 = kab0Var.c;
                    if (fo80Var5 != null) {
                        BetChips betChips = fo80Var5.i;
                        Double dValueOf2 = Double.valueOf(kab0Var.v);
                        List<Double> list2 = kab0Var.f.get(Integer.valueOf(kab0Var.i));
                        betChips.J(dValueOf2, list2 != null ? Double.valueOf(CollectionsKt.s0(list2)) : null);
                    }
                    fo80 fo80Var6 = kab0Var.c;
                    if (fo80Var6 != null) {
                        fo80Var6.i.I(true);
                    }
                    fo80 fo80Var7 = kab0Var.c;
                    if (fo80Var7 != null) {
                        fo80Var7.i.H();
                    }
                    boolean zIsEmpty = kab0Var.f.isEmpty();
                    fo80 fo80Var8 = kab0Var.c;
                    if (zIsEmpty) {
                        if (fo80Var8 != null) {
                            fo80Var8.i.F(true);
                        }
                    } else if (fo80Var8 != null) {
                        fo80Var8.i.F(false);
                    }
                } else {
                    op5 op5Var = op5.a;
                    String string = kab0Var.getString(R.string.key_fbg_only_one_market);
                    string.getClass();
                    String string2 = kab0Var.getString(R.string.free_bet_gift_use_allows_only_one_market);
                    string2.getClass();
                    op5Var.getClass();
                    String strB = op5.b(string, string2, null);
                    Context context = kab0Var.getContext();
                    if (context != null) {
                        fo80 fo80Var9 = kab0Var.c;
                        if (fo80Var9 != null) {
                            fo80Var9.A.setVisibility(0);
                        }
                        fo80 fo80Var10 = kab0Var.c;
                        if (fo80Var10 != null && (binding3 = fo80Var10.A.getBinding()) != null) {
                            binding3.b.setBackgroundColor(context.getColor(R.color.warn_toast));
                        }
                        fo80 fo80Var11 = kab0Var.c;
                        if (fo80Var11 != null && (binding2 = fo80Var11.A.getBinding()) != null) {
                            binding2.c.setText(strB);
                        }
                        fo80 fo80Var12 = kab0Var.c;
                        if (fo80Var12 != null && (binding = fo80Var12.A.getBinding()) != null) {
                            binding.c.setTextColor(context.getColor(R.color.white));
                        }
                        pfd pfdVar = fse.a;
                        ej5.c(w5b.a(gku.a), null, null, new yab0(kab0Var, null), 3);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
