package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.dP.LxHElgWAiSeM;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.spinmatch.model.response.DetailResponse;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class bkj extends Dialog {
    public DetailResponse a;
    public p8b b;
    public FloatingActionButton c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView i;
    public RecyclerView v;
    public ArrayList<DetailResponse.BetConfigList> w;
    public String y;

    /* JADX INFO: loaded from: classes6.dex */
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Integer.valueOf(((DetailResponse.BetConfigList) t).getOrderedPosition()).compareTo(Integer.valueOf(((DetailResponse.BetConfigList) t2).getOrderedPosition()));
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ArrayList<DetailResponse.BetConfigList> arrayList;
        dkj dkjVar;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.match_game_limits);
        View viewFindViewById = findViewById(R.id.game_limit_close);
        viewFindViewById.getClass();
        this.c = (FloatingActionButton) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.min_bet);
        viewFindViewById2.getClass();
        this.d = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.game_limit);
        viewFindViewById3.getClass();
        this.e = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.max_bet);
        viewFindViewById4.getClass();
        this.f = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.multiplier);
        viewFindViewById5.getClass();
        this.i = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.game_limit_list);
        viewFindViewById6.getClass();
        this.v = (RecyclerView) viewFindViewById6;
        DetailResponse detailResponse = this.a;
        if (detailResponse == null || (arrayList = detailResponse.getBetConfigList()) == null) {
            arrayList = new ArrayList<>();
        }
        this.w = arrayList;
        Iterator<DetailResponse.BetConfigList> it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            if (it.next().getOrderedPosition() == 0) {
                it.remove();
            }
        }
        ArrayList<DetailResponse.BetConfigList> arrayList2 = this.w;
        if (arrayList2.size() > 1) {
            o48.v(new a(), arrayList2);
        }
        getContext();
        if (this.v != null) {
            DetailResponse detailResponse2 = this.a;
            if (detailResponse2 != null) {
                ArrayList<DetailResponse.BetConfigList> arrayList3 = this.w;
                Context context = getContext();
                context.getClass();
                dkjVar = new dkj(arrayList3, context, detailResponse2, this.y);
            } else {
                dkjVar = null;
            }
            RecyclerView recyclerView = this.v;
            if (recyclerView != null) {
                recyclerView.setAdapter(dkjVar);
                RecyclerView recyclerView2 = this.v;
                if (recyclerView2 != null) {
                    getContext();
                    recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
                    final zjj zjjVar = new zjj(this);
                    FloatingActionButton floatingActionButton = this.c;
                    if (floatingActionButton != null) {
                        floatingActionButton.setOnClickListener(new View.OnClickListener(this) { // from class: akj
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                String str;
                                zj60 bridge;
                                if (SportyGamesManager.getInstance().getUser() != null) {
                                    str = "logged-in";
                                } else {
                                    str = "non logged-in";
                                }
                                Bundle bundleA = whs.a("popup_name", "game limit", "button_name", QWvyvNzGsBpRT.GPBXMyEy);
                                bundleA.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, "Rush");
                                bundleA.putString("user_state", str);
                                SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                                if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
                                    ((bk60) bridge).a("popup_action", bundleA);
                                }
                                zjjVar.invoke();
                            }
                        });
                        if (this.a != null) {
                            TextView textView = this.d;
                            if (textView != null) {
                                op5 op5Var = op5.a;
                                String string = getContext().getString(R.string.min_bet_cms);
                                string.getClass();
                                String string2 = getContext().getString(R.string.sg_rush_min_bet);
                                string2.getClass();
                                textView.setText(op5.c(op5Var, string, string2));
                                TextView textView2 = this.f;
                                if (textView2 != null) {
                                    String string3 = getContext().getString(R.string.max_bet_cms);
                                    string3.getClass();
                                    String string4 = getContext().getString(R.string.sg_rush_max_bet);
                                    string4.getClass();
                                    textView2.setText(op5.c(op5Var, string3, string4));
                                    TextView textView3 = this.i;
                                    if (textView3 != null) {
                                        String string5 = getContext().getString(R.string.multiplier_text_cms);
                                        string5.getClass();
                                        String string6 = getContext().getString(R.string.multiplier);
                                        string6.getClass();
                                        textView3.setText(op5.c(op5Var, string5, string6));
                                    } else {
                                        Intrinsics.n("multiplier");
                                        throw null;
                                    }
                                } else {
                                    Intrinsics.n("maxBet");
                                    throw null;
                                }
                            } else {
                                Intrinsics.n(LxHElgWAiSeM.RszUljZSTHg);
                                throw null;
                            }
                        }
                        op5 op5Var2 = op5.a;
                        TextView textView4 = this.e;
                        if (textView4 != null) {
                            op5.r(op5Var2, b.f(textView4), null, 6);
                            return;
                        } else {
                            Intrinsics.n("gameLimit");
                            throw null;
                        }
                    }
                    Intrinsics.n("closeButton");
                    throw null;
                }
                Intrinsics.n("gameLimitList");
                throw null;
            }
            Intrinsics.n("gameLimitList");
            throw null;
        }
        Intrinsics.n("gameLimitList");
        throw null;
    }
}
