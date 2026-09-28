package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatTextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.RSelection;
import com.sportybet.plugin.realsports.data.WinStatusDisplayData;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class rkf {
    public static final WinStatusDisplayData a(Context context, List<? extends RSelection> list, boolean z, int i) {
        Drawable drawableA;
        int i2;
        context.getClass();
        list.getClass();
        int size = list.size();
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        for (RSelection rSelection : list) {
            int i5 = rSelection.settleType;
            if (i5 == 1) {
                i3++;
            } else if (i5 == 2) {
                i4++;
            }
            if (rSelection.joker != null) {
                z3 = true;
            }
        }
        if (i3 > 0) {
            drawableA = gr0.a(context, R.drawable.ic_flashwin);
        } else if (i4 > 0) {
            drawableA = gr0.a(context, R.drawable.ic_flashsave);
        } else if (z) {
            drawableA = null;
        } else {
            drawableA = z3 ? iwh0.a(context, R.drawable.ic_joker_18dp, i) : iwh0.a(context, R.drawable.ic_spr_bet_history_win, i);
        }
        if (i3 == size) {
            i2 = R.string.bet_history__flash_win;
        } else if (i4 == size) {
            i2 = R.string.bet_history__flash_save;
        } else {
            i2 = z ? R.string.bet_history__partial_payout : R.string.bet_history__won;
        }
        if (i3 == 0 && i4 == 0) {
            z2 = true;
        }
        return new WinStatusDisplayData(i2, drawableA, z2);
    }

    public static void b(int i, Context context, String str) {
        b.a aVar = new b.a(context);
        if (i != -1) {
            aVar.d(i);
        }
        aVar.a.f = Html.fromHtml(str);
        aVar.setPositiveButton(R.string.common_functions__ok, new qkf());
        aVar.f();
    }

    public static void c(Context context, int i, int i2) {
        b(i, context, sn5.b(context, i2, new Object[0]));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    public static final void d(View view, xec xecVar, RSelection rSelection) {
        int i;
        View contentView;
        xecVar.getClass();
        int i2 = rSelection.eventStatus;
        if ((i2 == 0 || i2 == 6) && rSelection.status == 0) {
            i = kgb0.a.contains(rSelection.tournamentId) ? R.string.bet_history__not_started_delayed_settlement : R.string.bet_history__not_start;
        } else if (!rSelection.isOngoing()) {
            int i3 = rSelection.status;
            if (i3 != 0) {
                if (i3 != 1) {
                    i = i3 != 2 ? R.string.bet_history__void : R.string.bet_history__lost;
                } else {
                    int i4 = rSelection.settleType;
                    if (i4 == 1) {
                        i = R.string.bet_history__flash_win;
                    } else if (i4 == 2) {
                        i = R.string.bet_history__flash_save;
                    } else if (i4 == 3) {
                        i = R.string.bet_history__2up_early_payout;
                    } else if (i4 == 5) {
                        i = R.string.bet_history__1up_early_payout;
                    } else if (i4 != 6) {
                        i = i4 != 7 ? R.string.bet_history__won : R.string.bet_history__dc_1up_early_payout;
                    } else {
                        i = R.string.bet_history__early_goal;
                    }
                }
            } else if (kgb0.a.contains(rSelection.tournamentId)) {
                i = R.string.bet_history__ongoing_delayed_settlement;
            } else {
                i = R.string.bet_history__ongoing;
            }
        } else if (kgb0.a.contains(rSelection.tournamentId)) {
            i = R.string.bet_history__ongoing_delayed_settlement;
        } else {
            i = R.string.bet_history__ongoing;
        }
        PopupWindow popupWindow = xecVar.i;
        View viewFindViewById = (popupWindow == null || (contentView = popupWindow.getContentView()) == null) ? null : contentView.findViewById(R.id.status_text);
        viewFindViewById.getClass();
        ((AppCompatTextView) viewFindViewById).setText(i);
        PopupWindow popupWindow2 = xecVar.i;
        if (popupWindow2 != null) {
            popupWindow2.showAsDropDown(view);
        }
    }
}
