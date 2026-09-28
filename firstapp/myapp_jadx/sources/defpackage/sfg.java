package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.GiftItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sfg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sfg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e activity;
        xi60 xi60Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final fgg fggVar = (fgg) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (fggVar.F0 || fggVar.A != null) {
                    return Unit.a;
                }
                ypa0 ypa0VarD0 = fggVar.D0();
                String string = fggVar.getString(R.string.click_chip);
                string.getClass();
                ypa0VarD0.A1(0L, string);
                if (zBooleanValue) {
                    bo1 bo1Var = (bo1) fggVar.a;
                    fggVar.H0 = bo1Var != null ? bo1Var.x1() : null;
                    xi60 xi60Var2 = new xi60();
                    fggVar.A = xi60Var2;
                    if (!xi60Var2.isAdded() && (activity = fggVar.getActivity()) != null && (xi60Var = fggVar.A) != null) {
                        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        xi60Var.q0(supportFragmentManager, new jmb(fggVar, 1), new gaj() { // from class: geg
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                fgg fggVar2 = fggVar;
                                GiftItem giftItem = (GiftItem) obj3;
                                Double d = (Double) obj4;
                                double dDoubleValue = d.doubleValue();
                                boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
                                giftItem.getClass();
                                try {
                                    fggVar2.F0 = true;
                                    fggVar2.G0 = zBooleanValue2;
                                    bo1.b bVar = fggVar2.H0;
                                    double d2 = (bVar != null ? bVar.a : 0.0d) - dDoubleValue;
                                    jhg jhgVar = (jhg) fggVar2.b;
                                    if (jhgVar != null) {
                                        jhgVar.c.setBetAmount(d, fggVar2.W);
                                    }
                                    jhg jhgVar2 = (jhg) fggVar2.b;
                                    if (jhgVar2 != null) {
                                        jhgVar2.i.setBetAmount(dDoubleValue, fggVar2.W);
                                    }
                                    bo1 bo1Var2 = (bo1) fggVar2.a;
                                    if (bo1Var2 != null) {
                                        bo1Var2.z1(d);
                                    }
                                    bo1 bo1Var3 = (bo1) fggVar2.a;
                                    if (bo1Var3 != null) {
                                        bo1Var3.A1(new bo1.c(giftItem, dDoubleValue, d2));
                                    }
                                    jhg jhgVar3 = (jhg) fggVar2.b;
                                    if (jhgVar3 != null) {
                                        jhgVar3.d.setEnabled(false);
                                    }
                                    jhg jhgVar4 = (jhg) fggVar2.b;
                                    if (jhgVar4 != null) {
                                        jhgVar4.d.setAlpha(0.5f);
                                    }
                                    jhg jhgVar5 = (jhg) fggVar2.b;
                                    if (jhgVar5 != null) {
                                        jhgVar5.d.E(0.5f, false);
                                    }
                                    jhg jhgVar6 = (jhg) fggVar2.b;
                                    if (jhgVar6 != null) {
                                        jhgVar6.i.setEnabled(false);
                                    }
                                    jhg jhgVar7 = (jhg) fggVar2.b;
                                    if (jhgVar7 != null) {
                                        jhgVar7.i.setAlpha(0.5f);
                                    }
                                    jhg jhgVar8 = (jhg) fggVar2.b;
                                    if (jhgVar8 != null) {
                                        jhgVar8.i.b(false);
                                    }
                                    fggVar2.R0(dDoubleValue);
                                    jhg jhgVar9 = (jhg) fggVar2.b;
                                    if (jhgVar9 != null) {
                                        jhgVar9.f.setVisibility(0);
                                    }
                                } catch (Exception unused) {
                                }
                                return Unit.a;
                            }
                        }, new jbq(fggVar, 2));
                    }
                }
                return Unit.a;
            default:
                ((mmd) obj).getClass();
                return new iwo(((long) ycv.b(((isw) obj2).j())) & 4294967295L);
        }
    }
}
