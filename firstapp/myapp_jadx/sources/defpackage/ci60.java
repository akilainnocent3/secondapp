package defpackage;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.SGConfirmDialogActivity;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.spin2win.model.local.LocalGameDetailsEntity;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ci60 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ci60(Object obj, int i) {
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
                SGConfirmDialogActivity sGConfirmDialogActivity = (SGConfirmDialogActivity) obj2;
                int i2 = SGConfirmDialogActivity.z;
                ((View) obj).getClass();
                String stringExtra = sGConfirmDialogActivity.getIntent().getStringExtra("dialogName");
                if (stringExtra != null) {
                    mn80 mn80Var = (mn80) sGConfirmDialogActivity.a;
                    String strValueOf = String.valueOf(mn80Var != null ? mn80Var.d.getText() : null);
                    String stringExtra2 = sGConfirmDialogActivity.getIntent().getStringExtra("game");
                    stringExtra2.getClass();
                    SGConfirmDialogActivity.A1(stringExtra, strValueOf, stringExtra2);
                }
                sGConfirmDialogActivity.setResult(107);
                sGConfirmDialogActivity.finish();
                break;
            default:
                final a1b0 a1b0Var = (a1b0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (!a1b0Var.a0 && a1b0Var.C == null) {
                    ypa0 ypa0VarZ0 = a1b0Var.z0();
                    String string = a1b0Var.getString(R.string.click_chip);
                    string.getClass();
                    ypa0VarZ0.A1(0L, string);
                    if (zBooleanValue && (activity = a1b0Var.getActivity()) != null) {
                        final zp40 zp40Var = new zp40();
                        ArrayList arrayList = a1b0Var.J;
                        int i3 = 0;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj3 = arrayList.get(i4);
                                i4++;
                                double d = zp40Var.a;
                                Double betAmount = ((LocalGameDetailsEntity) obj3).getBetAmount();
                                zp40Var.a = d + (betAmount != null ? betAmount.doubleValue() : 0.0d);
                            }
                        }
                        xi60 xi60Var2 = a1b0Var.C;
                        if (xi60Var2 == null) {
                            xi60Var2 = new xi60();
                            a1b0Var.C = xi60Var2;
                        }
                        if (!xi60Var2.isAdded() && (xi60Var = a1b0Var.C) != null) {
                            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            xi60Var.q0(supportFragmentManager, new Function0() { // from class: mza0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    List<GiftItem> entityList;
                                    xi60 xi60Var3;
                                    Double minAmount;
                                    Double maxAmount;
                                    a1b0 a1b0Var2 = a1b0Var;
                                    PromotionGiftsResponse promotionGiftsResponse = a1b0Var2.V;
                                    if (promotionGiftsResponse != null && (entityList = promotionGiftsResponse.getEntityList()) != null && (xi60Var3 = a1b0Var2.C) != null) {
                                        LocalGameDetailsEntity localGameDetailsEntity = a1b0Var2.L;
                                        double dDoubleValue = 0.0d;
                                        double dDoubleValue2 = (localGameDetailsEntity == null || (maxAmount = localGameDetailsEntity.getMaxAmount()) == null) ? 0.0d : maxAmount.doubleValue();
                                        LocalGameDetailsEntity localGameDetailsEntity2 = a1b0Var2.L;
                                        if (localGameDetailsEntity2 != null && (minAmount = localGameDetailsEntity2.getMinAmount()) != null) {
                                            dDoubleValue = minAmount.doubleValue();
                                        }
                                        xi60Var3.r0(entityList, dDoubleValue2, dDoubleValue, zp40Var.a);
                                    }
                                    return Unit.a;
                                }
                            }, new gaj() { // from class: nza0
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    Dialog dialog;
                                    GiftItem giftItem = (GiftItem) obj4;
                                    Double d2 = (Double) obj5;
                                    double dDoubleValue = d2.doubleValue();
                                    boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                                    giftItem.getClass();
                                    a1b0 a1b0Var2 = a1b0Var;
                                    a1b0Var2.c0 = zBooleanValue2;
                                    Double dValueOf = Double.valueOf(0.0d);
                                    a1b0Var2.a0 = true;
                                    wxi wxiVar = a1b0Var2.v;
                                    if (wxiVar != null) {
                                        wxiVar.i.setFbgApplied(true);
                                    }
                                    wxi wxiVar2 = a1b0Var2.v;
                                    if (wxiVar2 != null) {
                                        wxiVar2.J.setFbgApplied(true);
                                    }
                                    xi60 xi60Var3 = a1b0Var2.C;
                                    if (xi60Var3 != null && (dialog = xi60Var3.getDialog()) != null && dialog.isShowing()) {
                                        xi60 xi60Var4 = a1b0Var2.C;
                                        if (xi60Var4 != null) {
                                            xi60Var4.dismiss();
                                        }
                                        a1b0Var2.C = null;
                                    }
                                    v4b0 v4b0VarW0 = a1b0Var2.w0();
                                    v4b0VarW0.b = giftItem.getGiftId();
                                    v4b0VarW0.a = d2;
                                    a1b0Var2.w0();
                                    try {
                                        new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue).getClass();
                                    } catch (Exception unused) {
                                    }
                                    wxi wxiVar3 = a1b0Var2.v;
                                    if (wxiVar3 != null) {
                                        wxiVar3.c.setBetAmount(dValueOf, dValueOf);
                                    }
                                    a1b0Var2.j0(dDoubleValue, "fbg");
                                    return Unit.a;
                                }
                            }, new oza0(a1b0Var, i3));
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
