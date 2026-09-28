package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.spin2win.model.local.Payouts;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cq80 extends Dialog {
    public LinkedHashSet a;
    public Function0<Unit> b;
    public FloatingActionButton c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView i;
    public TextView v;
    public TextView w;
    public TextView y;
    public TextView z;

    /* JADX WARN: Code duplicated, block: B:110:0x0201  */
    /* JADX WARN: Code duplicated, block: B:127:0x0237  */
    /* JADX WARN: Code duplicated, block: B:23:0x00de  */
    /* JADX WARN: Code duplicated, block: B:40:0x0114  */
    /* JADX WARN: Code duplicated, block: B:57:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0195  */
    /* JADX WARN: Code duplicated, block: B:93:0x01cb  */
    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String payoutMultiplier;
        String payoutMultiplier2;
        String payoutMultiplier3;
        String payoutMultiplier4;
        String payoutMultiplier5;
        String payoutMultiplier6;
        String payoutMultiplier7;
        String payoutMultiplier8;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object next7;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.sg_payout_spin2win);
        Window window = getWindow();
        if (window != null) {
            window.setDimAmount(0.7f);
        }
        View viewFindViewById = findViewById(R.id.close);
        viewFindViewById.getClass();
        this.c = (FloatingActionButton) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.payout_1);
        viewFindViewById2.getClass();
        this.d = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.payout_2);
        viewFindViewById3.getClass();
        this.e = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.payout_3);
        viewFindViewById4.getClass();
        this.f = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.payout_4);
        viewFindViewById5.getClass();
        this.i = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.payout_5);
        viewFindViewById6.getClass();
        this.v = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.payout_6);
        viewFindViewById7.getClass();
        this.w = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.payout_7);
        viewFindViewById8.getClass();
        this.y = (TextView) viewFindViewById8;
        View viewFindViewById9 = findViewById(R.id.payout_8);
        viewFindViewById9.getClass();
        this.z = (TextView) viewFindViewById9;
        final lq3 lq3Var = new lq3(this, 2);
        FloatingActionButton floatingActionButton = this.c;
        Object obj = null;
        if (floatingActionButton == null) {
            Intrinsics.n("closeButton");
            throw null;
        }
        floatingActionButton.setOnClickListener(new View.OnClickListener(this) { // from class: aq80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zj60 bridge;
                String str = SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in";
                Bundle bundleA = whs.a("popup_name", "how to play", "button_name", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
                bundleA.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, "Spin2Win");
                bundleA.putString("user_state", str);
                SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
                    ((bk60) bridge).a("popup_action", bundleA);
                }
                lq3Var.invoke();
            }
        });
        TextView textView = this.d;
        if (textView == null) {
            Intrinsics.n("payout1");
            throw null;
        }
        LinkedHashSet linkedHashSet = this.a;
        String str = "x";
        if (linkedHashSet != null) {
            Iterator it = linkedHashSet.iterator();
            do {
                if (!it.hasNext()) {
                    next7 = null;
                    break;
                }
                next7 = it.next();
            } while (!Intrinsics.g(((Payouts) next7).getBetCategory(), "WHEEL_NUMBERS"));
            Payouts payouts = (Payouts) next7;
            if (payouts == null || (payoutMultiplier = payouts.getPayoutMultiplier()) == null) {
                payoutMultiplier = "x";
            }
        } else {
            payoutMultiplier = "x";
        }
        textView.setText(payoutMultiplier);
        TextView textView2 = this.e;
        if (textView2 == null) {
            Intrinsics.n("payout2");
            throw null;
        }
        LinkedHashSet linkedHashSet2 = this.a;
        if (linkedHashSet2 != null) {
            Iterator it2 = linkedHashSet2.iterator();
            do {
                if (!it2.hasNext()) {
                    next6 = null;
                    break;
                }
                next6 = it2.next();
            } while (!Intrinsics.g(((Payouts) next6).getBetCategory(), "DOZEN"));
            Payouts payouts2 = (Payouts) next6;
            if (payouts2 == null || (payoutMultiplier2 = payouts2.getPayoutMultiplier()) == null) {
                payoutMultiplier2 = "x";
            }
        } else {
            payoutMultiplier2 = "x";
        }
        textView2.setText(payoutMultiplier2);
        TextView textView3 = this.f;
        if (textView3 == null) {
            Intrinsics.n("payout3");
            throw null;
        }
        LinkedHashSet linkedHashSet3 = this.a;
        if (linkedHashSet3 != null) {
            Iterator it3 = linkedHashSet3.iterator();
            do {
                if (!it3.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it3.next();
            } while (!Intrinsics.g(((Payouts) next5).getBetCategory(), "EVEN_ODD"));
            Payouts payouts3 = (Payouts) next5;
            if (payouts3 == null || (payoutMultiplier3 = payouts3.getPayoutMultiplier()) == null) {
                payoutMultiplier3 = "x";
            }
        } else {
            payoutMultiplier3 = "x";
        }
        textView3.setText(payoutMultiplier3);
        TextView textView4 = this.i;
        if (textView4 == null) {
            Intrinsics.n("payout4");
            throw null;
        }
        LinkedHashSet linkedHashSet4 = this.a;
        if (linkedHashSet4 != null) {
            Iterator it4 = linkedHashSet4.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it4.next();
                Payouts payouts4 = (Payouts) next4;
                if (Intrinsics.g(payouts4.getBetCategory(), "COLOUR")) {
                    String lowerCase = payouts4.getBetTitle().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (!lowerCase.equals("green")) {
                        break;
                    }
                }
            }
            Payouts payouts5 = (Payouts) next4;
            if (payouts5 == null || (payoutMultiplier4 = payouts5.getPayoutMultiplier()) == null) {
                payoutMultiplier4 = "x";
            }
        } else {
            payoutMultiplier4 = "x";
        }
        textView4.setText(payoutMultiplier4);
        TextView textView5 = this.v;
        if (textView5 == null) {
            Intrinsics.n("payout5");
            throw null;
        }
        LinkedHashSet linkedHashSet5 = this.a;
        if (linkedHashSet5 != null) {
            Iterator it5 = linkedHashSet5.iterator();
            do {
                if (!it5.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it5.next();
            } while (!Intrinsics.g(((Payouts) next3).getBetCategory(), "SECTOR"));
            Payouts payouts6 = (Payouts) next3;
            if (payouts6 == null || (payoutMultiplier5 = payouts6.getPayoutMultiplier()) == null) {
                payoutMultiplier5 = "x";
            }
        } else {
            payoutMultiplier5 = "x";
        }
        textView5.setText(payoutMultiplier5);
        TextView textView6 = this.w;
        if (textView6 == null) {
            Intrinsics.n("payout6");
            throw null;
        }
        LinkedHashSet linkedHashSet6 = this.a;
        if (linkedHashSet6 != null) {
            Iterator it6 = linkedHashSet6.iterator();
            do {
                if (!it6.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it6.next();
            } while (!Intrinsics.g(((Payouts) next2).getBetCategory(), "HIGH_LOW"));
            Payouts payouts7 = (Payouts) next2;
            if (payouts7 == null || (payoutMultiplier6 = payouts7.getPayoutMultiplier()) == null) {
                payoutMultiplier6 = "x";
            }
        } else {
            payoutMultiplier6 = "x";
        }
        textView6.setText(payoutMultiplier6);
        TextView textView7 = this.y;
        if (textView7 == null) {
            Intrinsics.n("payout7");
            throw null;
        }
        LinkedHashSet linkedHashSet7 = this.a;
        if (linkedHashSet7 != null) {
            Iterator it7 = linkedHashSet7.iterator();
            do {
                if (!it7.hasNext()) {
                    next = null;
                    break;
                }
                next = it7.next();
            } while (!Intrinsics.g(((Payouts) next).getBetCategory(), "HIGH_LOW_COLOUR"));
            Payouts payouts8 = (Payouts) next;
            if (payouts8 == null || (payoutMultiplier7 = payouts8.getPayoutMultiplier()) == null) {
                payoutMultiplier7 = "x";
            }
        } else {
            payoutMultiplier7 = "x";
        }
        textView7.setText(payoutMultiplier7);
        TextView textView8 = this.z;
        if (textView8 == null) {
            Intrinsics.n("payout8");
            throw null;
        }
        LinkedHashSet linkedHashSet8 = this.a;
        if (linkedHashSet8 != null) {
            for (Object obj2 : linkedHashSet8) {
                Payouts payouts9 = (Payouts) obj2;
                if (Intrinsics.g(payouts9.getBetCategory(), "COLOUR")) {
                    String lowerCase2 = payouts9.getBetTitle().toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    if (lowerCase2.equals("green")) {
                        obj = obj2;
                        break;
                    }
                }
            }
            Payouts payouts10 = (Payouts) obj;
            if (payouts10 != null && (payoutMultiplier8 = payouts10.getPayoutMultiplier()) != null) {
                str = payoutMultiplier8;
            }
        }
        textView8.setText(str);
    }
}
