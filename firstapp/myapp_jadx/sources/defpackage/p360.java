package defpackage;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.lobby.remote.models.GameDetails;
import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p360 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p360(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CharSequence text;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final l560 l560Var = (l560) obj2;
                ((View) obj).getClass();
                e activity = l560Var.getActivity();
                if (activity != null && l560Var.getContext() != null) {
                    GameDetails gameDetails = l560Var.S;
                    String string = null;
                    wz.a("FBGIconClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
                    xi60 xi60Var = l560Var.Z;
                    if (xi60Var == null) {
                        xi60Var = new xi60();
                        l560Var.Z = xi60Var;
                    }
                    if (!xi60Var.isAdded()) {
                        eo80 eo80Var = l560Var.l0;
                        if (eo80Var != null && (text = eo80Var.r0.getText()) != null) {
                            string = text.toString();
                        }
                        l560Var.F0().d = string;
                        xi60 xi60Var2 = l560Var.Z;
                        if (xi60Var2 != null) {
                            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            int i2 = 1;
                            xi60Var2.q0(supportFragmentManager, new kfj(l560Var, i2), new gaj() { // from class: c560
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    b bVarK;
                                    Dialog dialog;
                                    GiftItem giftItem = (GiftItem) obj3;
                                    Double d = (Double) obj4;
                                    double dDoubleValue = d.doubleValue();
                                    ((Boolean) obj5).getClass();
                                    giftItem.getClass();
                                    String str = "0.00";
                                    l560 l560Var2 = l560Var;
                                    l560Var2.K = true;
                                    eo80 eo80Var2 = l560Var2.l0;
                                    if (eo80Var2 != null) {
                                        eo80Var2.c.setVisibility(8);
                                    }
                                    eo80 eo80Var3 = l560Var2.l0;
                                    if (eo80Var3 != null) {
                                        eo80Var3.d.setVisibility(0);
                                    }
                                    eo80 eo80Var4 = l560Var2.l0;
                                    if (eo80Var4 != null) {
                                        TextView textView = eo80Var4.r0;
                                        try {
                                            String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue);
                                            str2.getClass();
                                            str = str2;
                                        } catch (Exception unused) {
                                        }
                                        textView.setText(str);
                                    }
                                    eo80 eo80Var5 = l560Var2.l0;
                                    ViewGroup.LayoutParams layoutParams = eo80Var5 != null ? eo80Var5.r0.getLayoutParams() : null;
                                    ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
                                    if (layoutParams2 != null) {
                                        layoutParams2.setMarginStart(70);
                                    }
                                    eo80 eo80Var6 = l560Var2.l0;
                                    if (eo80Var6 != null) {
                                        eo80Var6.r0.setLayoutParams(layoutParams2);
                                    }
                                    xi60 xi60Var3 = l560Var2.Z;
                                    if (xi60Var3 != null && (dialog = xi60Var3.getDialog()) != null && dialog.isShowing()) {
                                        xi60 xi60Var4 = l560Var2.Z;
                                        if (xi60Var4 != null) {
                                            xi60Var4.dismiss();
                                        }
                                        l560Var2.Z = null;
                                    }
                                    c760 c760VarF0 = l560Var2.F0();
                                    c760VarF0.e = giftItem.getGiftId();
                                    c760VarF0.b = d;
                                    eo80 eo80Var7 = l560Var2.l0;
                                    if (eo80Var7 != null && (bVarK = eo80Var7.n0.K(R.id.start)) != null) {
                                        bVarK.w(R.id.auto_bet_btn, 0.5f);
                                        eo80 eo80Var8 = l560Var2.l0;
                                        bVarK.b(eo80Var8 != null ? eo80Var8.n0 : null);
                                    }
                                    eo80 eo80Var9 = l560Var2.l0;
                                    if (eo80Var9 != null) {
                                        eo80Var9.X.setEnabled(false);
                                    }
                                    eo80 eo80Var10 = l560Var2.l0;
                                    if (eo80Var10 != null) {
                                        eo80Var10.X.setAlpha(0.5f);
                                    }
                                    return Unit.a;
                                }
                            }, new ex10(l560Var, i2));
                        }
                    }
                }
                break;
            default:
                f1e0 f1e0Var = (f1e0) obj;
                f1e0Var.getClass();
                ((eoa0) obj2).v.j(f1e0Var.c);
                break;
        }
        return Unit.a;
    }
}
