package com.sportygames.pocketrocket.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.pocketrocket.component.PrAllUserBet;
import com.sportygames.pocketrocket.model.response.BetDetails;
import com.sportygames.pocketrocket.model.response.RoundBetResponse;
import defpackage.bmy;
import defpackage.fn1;
import defpackage.h5e;
import defpackage.ibs;
import defpackage.o48;
import defpackage.op5;
import defpackage.r920;
import defpackage.st;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/sportygames/pocketrocket/component/PrAllUserBet;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/sportygames/pocketrocket/model/response/RoundBetResponse;", "roundBetResponse", "Lcom/sportygames/pocketrocket/component/MultiplierContainer;", "multiplier", "", "setBets", "(Lcom/sportygames/pocketrocket/model/response/RoundBetResponse;Lcom/sportygames/pocketrocket/component/MultiplierContainer;)V", "setAdapter", "()V", "Lst;", "a", "Lst;", "getBinding", "()Lst;", "setBinding", "(Lst;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PrAllUserBet extends LinearLayout {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public st binding;
    public ibs b;
    public ArrayList c;
    public r920 d;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Double.valueOf(((BetDetails) t2).getStakeAmount()).compareTo(Double.valueOf(((BetDetails) t).getStakeAmount()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrAllUserBet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.all_bet_list_layout, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.biggest_coeff;
        if (((ConstraintLayout) h5e.a(R.id.biggest_coeff, viewInflate)) != null) {
            i = R.id.coeff;
            TextView textView = (TextView) h5e.a(R.id.coeff, viewInflate);
            if (textView != null) {
                i = R.id.list;
                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.list, viewInflate);
                if (recyclerView != null) {
                    i = R.id.name;
                    TextView textView2 = (TextView) h5e.a(R.id.name, viewInflate);
                    if (textView2 != null) {
                        i = R.id.no_record_found;
                        CardView cardView = (CardView) h5e.a(R.id.no_record_found, viewInflate);
                        if (cardView != null) {
                            i = R.id.no_record_text;
                            TextView textView3 = (TextView) h5e.a(R.id.no_record_text, viewInflate);
                            if (textView3 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                i = R.id.pr_round_history_list;
                                if (((ConstraintLayout) h5e.a(R.id.pr_round_history_list, viewInflate)) != null) {
                                    i = R.id.rocket;
                                    TextView textView4 = (TextView) h5e.a(R.id.rocket, viewInflate);
                                    if (textView4 != null) {
                                        i = R.id.spin_kit;
                                        if (((SpinKitView) h5e.a(R.id.spin_kit, viewInflate)) != null) {
                                            i = R.id.stake;
                                            TextView textView5 = (TextView) h5e.a(R.id.stake, viewInflate);
                                            if (textView5 != null) {
                                                i = R.id.status;
                                                TextView textView6 = (TextView) h5e.a(R.id.status, viewInflate);
                                                if (textView6 != null) {
                                                    this.binding = new st(constraintLayout, textView, recyclerView, textView2, cardView, textView3, textView4, textView5, textView6);
                                                    this.c = new ArrayList();
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a(fn1 fn1Var, ibs ibsVar) {
        fn1Var.getClass();
        ibsVar.getClass();
        try {
            this.b = ibsVar;
            TextView textView = this.binding.d;
            Context context = getContext();
            textView.setText(context != null ? context.getString(R.string.name) : null);
            TextView textView2 = this.binding.d;
            Context context2 = getContext();
            textView2.setTag(context2 != null ? context2.getString(R.string.bet_username_cms) : null);
            TextView textView3 = this.binding.f;
            Context context3 = getContext();
            textView3.setTag(context3 != null ? context3.getString(R.string.no_bets_placed_yet_cms) : null);
            op5 op5Var = op5.a;
            st stVar = this.binding;
            op5.r(op5Var, b.f(stVar.d, stVar.v, stVar.w, stVar.i, stVar.b, stVar.f), null, 4);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final st getBinding() {
        return this.binding;
    }

    public final void setAdapter() {
        RecyclerView recyclerView = this.binding.c;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        ArrayList arrayList = this.c;
        Context context = getContext();
        context.getClass();
        r920 r920Var = new r920(context, arrayList);
        this.d = r920Var;
        this.binding.c.setAdapter(r920Var);
    }

    public final void setBets(RoundBetResponse roundBetResponse, MultiplierContainer multiplier) {
        roundBetResponse.getClass();
        try {
            if (Intrinsics.g(roundBetResponse.getMessageType(), "CASHOUT_RECORD")) {
                final BetDetails bet = roundBetResponse.getBet();
                if (bet != null) {
                    bet.setTicketStatus("WIN");
                }
                this.c.replaceAll(new UnaryOperator() { // from class: n820
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        BetDetails betDetails = (BetDetails) obj;
                        int i = PrAllUserBet.e;
                        betDetails.getClass();
                        BetDetails betDetails2 = bet;
                        return (betDetails2 == null || betDetails.getBetId() != betDetails2.getBetId()) ? betDetails : betDetails2;
                    }
                });
                r920 r920Var = this.d;
                if (r920Var == null) {
                    Intrinsics.n("prAllUserBetAdapter");
                    throw null;
                }
                r920Var.l(this.c, multiplier);
            } else {
                List<BetDetails> topBets = roundBetResponse.getTopBets();
                ArrayList arrayList = topBets != null ? new ArrayList(topBets) : null;
                if (arrayList != null) {
                    this.c = arrayList;
                }
                ArrayList arrayList2 = this.c;
                if (arrayList2.size() > 1) {
                    o48.v(new a(), arrayList2);
                }
                ArrayList arrayList3 = this.c;
                int size = arrayList3.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList3.get(i);
                    i++;
                    BetDetails betDetails = (BetDetails) obj;
                    if (betDetails.getCashoutCoefficient() != 0.0d) {
                        betDetails.setTicketStatus("WIN");
                    }
                }
                r920 r920Var2 = this.d;
                if (r920Var2 == null) {
                    setAdapter();
                } else {
                    r920Var2.l(this.c, multiplier);
                }
            }
            boolean zIsEmpty = this.c.isEmpty();
            st stVar = this.binding;
            if (zIsEmpty) {
                stVar.e.setVisibility(0);
            } else {
                stVar.e.setVisibility(8);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void setBinding(st stVar) {
        stVar.getClass();
        this.binding = stVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrAllUserBet(Context context) {
        this(context, null);
        context.getClass();
    }
}
