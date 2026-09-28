package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.outrights.SearchMarketView;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.pingpong.components.a;
import com.sportygames.pocketrocket.component.PRBetToggle;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nlz implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nlz(ViewGroup viewGroup, Object obj, int i) {
        this.a = i;
        this.b = viewGroup;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.c;
        ViewGroup viewGroup = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                PRBetToggle pRBetToggle = (PRBetToggle) viewGroup;
                Context context = (Context) obj;
                if (!pRBetToggle.M.invoke().booleanValue()) {
                    SharedPreferences sharedPreferencesA = un20.a(context);
                    pRBetToggle.P = sharedPreferencesA;
                    pRBetToggle.Q = sharedPreferencesA != null ? sharedPreferencesA.edit() : null;
                    if (!pRBetToggle.I && pRBetToggle.H == 1) {
                        SharedPreferences sharedPreferences = pRBetToggle.P;
                        if (sharedPreferences != null) {
                            int i3 = 0;
                            if (!sharedPreferences.getBoolean("ROCKET_ONE_TAP", false)) {
                                GameMainActivity gameMainActivity = pRBetToggle.J;
                                if (gameMainActivity != null) {
                                    FragmentManager supportFragmentManager = gameMainActivity.getSupportFragmentManager();
                                    supportFragmentManager.getClass();
                                    a aVar = pRBetToggle.K;
                                    if (aVar == null || !aVar.isVisible()) {
                                        Context context2 = pRBetToggle.getContext();
                                        if (context2 != null) {
                                            op5 op5Var = op5.a;
                                            String string = pRBetToggle.getContext().getString(R.string.auto_bet_requirement_message_cms);
                                            string.getClass();
                                            String string2 = pRBetToggle.getContext().getString(R.string.auto_bet_one_tap);
                                            string2.getClass();
                                            op5Var.getClass();
                                            String strB = op5.b(string, string2, null);
                                            String string3 = pRBetToggle.getContext().getString(R.string.yes_btn_cms);
                                            string3.getClass();
                                            String string4 = pRBetToggle.getContext().getString(R.string.yes_bet);
                                            string4.getClass();
                                            String strB2 = op5.b(string3, string4, null);
                                            String string5 = pRBetToggle.getContext().getString(R.string.cancel_btn_cms);
                                            string5.getClass();
                                            String string6 = pRBetToggle.getContext().getString(R.string.cancel_bet);
                                            string6.getClass();
                                            pRBetToggle.K = a.C0444a.a("Pocket Rockets", strB, strB, strB2, op5.b(string5, string6, null), new olz(pRBetToggle, i3), new ckg(i2), context2.getColor(R.color.pr_toggle_color), context2.getColor(R.color.redblack_confirm_dialog_right_button));
                                        }
                                        a aVar2 = pRBetToggle.K;
                                        if (aVar2 != null) {
                                            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager);
                                            aVar3.f(R.id.flContent, aVar2, null);
                                            aVar3.c("PR_BET_TOGGLE");
                                            aVar3.d();
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        pRBetToggle.getStatusListener().invoke(Boolean.valueOf(!pRBetToggle.I));
                    } else {
                        pRBetToggle.getStatusListener().invoke(Boolean.valueOf(!pRBetToggle.I));
                    }
                } else {
                    pRBetToggle.N.invoke();
                }
                break;
            default:
                int i4 = SearchMarketView.K;
                ((SearchMarketView) viewGroup).setViewStatus(true);
                ((ibz) obj).c.requestFocus();
                break;
        }
    }
}
