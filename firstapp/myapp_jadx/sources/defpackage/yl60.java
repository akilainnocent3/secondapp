package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.crash.models.header.snc.OdQr;
import com.sportygames.pingpong.components.SHBetToggle;
import com.sportygames.pingpong.components.a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yl60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yl60(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                SHBetToggle sHBetToggle = (SHBetToggle) obj2;
                Context context = (Context) obj;
                if (sHBetToggle.M.invoke().booleanValue()) {
                    sHBetToggle.N.invoke();
                    break;
                } else {
                    SharedPreferences sharedPreferencesA = un20.a(context);
                    sHBetToggle.P = sharedPreferencesA;
                    sHBetToggle.Q = sharedPreferencesA != null ? sharedPreferencesA.edit() : null;
                    int i2 = 1;
                    if (sHBetToggle.I || sHBetToggle.H != 1) {
                        sHBetToggle.getStatusListener().invoke(Boolean.valueOf(!sHBetToggle.I));
                        break;
                    } else {
                        SharedPreferences sharedPreferences = sHBetToggle.P;
                        if (sharedPreferences != null && !sharedPreferences.getBoolean(OdQr.NIPChYUyXbma, false)) {
                            if (sHBetToggle.R) {
                                sHBetToggle.getStatusListener().invoke(Boolean.valueOf(!sHBetToggle.I));
                                break;
                            } else {
                                GameMainActivity gameMainActivity = sHBetToggle.J;
                                if (gameMainActivity != null) {
                                    FragmentManager supportFragmentManager = gameMainActivity.getSupportFragmentManager();
                                    supportFragmentManager.getClass();
                                    a aVar = sHBetToggle.K;
                                    if (aVar == null || !aVar.isVisible()) {
                                        Context context2 = sHBetToggle.getContext();
                                        if (context2 != null) {
                                            op5 op5Var = op5.a;
                                            String string = sHBetToggle.getContext().getString(R.string.auto_bet_requirement_message_cms);
                                            string.getClass();
                                            String string2 = sHBetToggle.getContext().getString(R.string.auto_bet_one_tap);
                                            string2.getClass();
                                            op5Var.getClass();
                                            String strB = op5.b(string, string2, null);
                                            String string3 = sHBetToggle.getContext().getString(R.string.yes_btn_cms);
                                            string3.getClass();
                                            String string4 = sHBetToggle.getContext().getString(R.string.yes_bet);
                                            string4.getClass();
                                            String strB2 = op5.b(string3, string4, null);
                                            String string5 = sHBetToggle.getContext().getString(R.string.cancel_btn_cms);
                                            string5.getClass();
                                            String string6 = sHBetToggle.getContext().getString(R.string.cancel_bet);
                                            string6.getClass();
                                            sHBetToggle.K = a.C0444a.a("Spin da' Bottle", strB, strB, strB2, op5.b(string5, string6, null), new sb20(sHBetToggle, i2), new uqt(i2), context2.getColor(R.color.redblack_confirm_dialog_left_button), context2.getColor(R.color.redblack_confirm_dialog_right_button));
                                        }
                                        a aVar2 = sHBetToggle.K;
                                        if (aVar2 != null) {
                                            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
                                            aVar3.f(R.id.flContent, aVar2, null);
                                            aVar3.c("SH_BET_TOGGLE");
                                            aVar3.d();
                                        }
                                    }
                                    break;
                                }
                            }
                        } else {
                            sHBetToggle.getStatusListener().invoke(Boolean.valueOf(!sHBetToggle.I));
                            break;
                        }
                    }
                }
                break;
            default:
                ((jf1) obj2).invoke(new une0.a((aoe0) obj));
                break;
        }
    }
}
