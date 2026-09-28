package com.sportygames.pingpong.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i0;
import com.google.android.flexbox.FlexboxLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.pingpong.components.ShRoundBetsContainer;
import com.sportygames.pingpong.remote.models.RoundBetResponse;
import com.sportygames.pingpong.remote.models.TopBets;
import defpackage.bmy;
import defpackage.c0d;
import defpackage.ej5;
import defpackage.fse;
import defpackage.gku;
import defpackage.h5e;
import defpackage.h820;
import defpackage.hkd;
import defpackage.ib5;
import defpackage.j1b;
import defpackage.o48;
import defpackage.p48;
import defpackage.pfd;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w5b;
import defpackage.y5b;
import defpackage.yv80;
import defpackage.yx50;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/sportygames/pingpong/components/ShRoundBetsContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/sportygames/pingpong/remote/models/RoundBetResponse;", "roundBetResponse", "", "setBets", "(Lcom/sportygames/pingpong/remote/models/RoundBetResponse;)V", "Lkotlin/Function0;", "totalWinListener", "setTotalWinListener", "(Lkotlin/jvm/functions/Function0;)V", "Lh820;", "d", "Lh820;", "getBinding", "()Lh820;", "setBinding", "(Lh820;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShRoundBetsContainer extends LinearLayout {
    public static final /* synthetic */ int e = 0;
    public final j1b a;
    public ArrayList b;
    public yx50 c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public h820 binding;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Double.valueOf(((TopBets) t2).getStakeAmount()).compareTo(Double.valueOf(((TopBets) t).getStakeAmount()));
        }
    }

    @c0d(c = "com.sportygames.pingpong.components.ShRoundBetsContainer$userBet$1", f = "ShRoundBetsContainer.kt", l = {135}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ShRoundBetsContainer.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(200L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ShRoundBetsContainer.this.getBinding().v.s0(0);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShRoundBetsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        pfd pfdVar = fse.a;
        this.a = w5b.a(gku.a);
        this.b = new ArrayList();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pp_round_bet, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.bet;
        TextView textView = (TextView) h5e.a(R.id.bet, viewInflate);
        if (textView != null) {
            i = R.id.coeff;
            TextView textView2 = (TextView) h5e.a(R.id.coeff, viewInflate);
            if (textView2 != null) {
                i = R.id.colon_text;
                if (((TextView) h5e.a(R.id.colon_text, viewInflate)) != null) {
                    i = R.id.current_bet;
                    TextView textView3 = (TextView) h5e.a(R.id.current_bet, viewInflate);
                    if (textView3 != null) {
                        i = R.id.layout;
                        if (((ConstraintLayout) h5e.a(R.id.layout, viewInflate)) != null) {
                            i = R.id.name;
                            TextView textView4 = (TextView) h5e.a(R.id.name, viewInflate);
                            if (textView4 != null) {
                                i = R.id.round_bet_view;
                                View viewA = h5e.a(R.id.round_bet_view, viewInflate);
                                if (viewA != null) {
                                    i = R.id.round_bet_view1;
                                    View viewA2 = h5e.a(R.id.round_bet_view1, viewInflate);
                                    if (viewA2 != null) {
                                        i = R.id.round_bets_list;
                                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.round_bets_list, viewInflate);
                                        if (recyclerView != null) {
                                            i = R.id.top_bets_layout;
                                            FlexboxLayout flexboxLayout = (FlexboxLayout) h5e.a(R.id.top_bets_layout, viewInflate);
                                            if (flexboxLayout != null) {
                                                i = R.id.top_win_icon;
                                                if (((ImageView) h5e.a(R.id.top_win_icon, viewInflate)) != null) {
                                                    i = R.id.top_win_text;
                                                    TextView textView5 = (TextView) h5e.a(R.id.top_win_text, viewInflate);
                                                    if (textView5 != null) {
                                                        i = R.id.total_bets;
                                                        TextView textView6 = (TextView) h5e.a(R.id.total_bets, viewInflate);
                                                        if (textView6 != null) {
                                                            i = R.id.total_bets_text;
                                                            TextView textView7 = (TextView) h5e.a(R.id.total_bets_text, viewInflate);
                                                            if (textView7 != null) {
                                                                i = R.id.total_wins_layout;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.total_wins_layout, viewInflate);
                                                                if (constraintLayout != null) {
                                                                    this.binding = new h820((CardView) viewInflate, textView, textView2, textView3, textView4, viewA, viewA2, recyclerView, flexboxLayout, textView5, textView6, textView7, constraintLayout);
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
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a() {
        try {
            this.b.clear();
            yx50 yx50Var = this.c;
            if (yx50Var == null) {
                b();
            } else {
                yx50Var.i(this.b);
            }
        } catch (Exception unused) {
        }
    }

    public final void b() {
        try {
            Context context = getContext();
            context.getClass();
            this.c = new yx50(context, this.b);
            RecyclerView.l itemAnimator = this.binding.v.getItemAnimator();
            itemAnimator.getClass();
            ((i0) itemAnimator).g = false;
            RecyclerView recyclerView = this.binding.v;
            getContext().getClass();
            recyclerView.setLayoutManager(new ShRoundBetsContainer$setAdapter$1(1, false));
            RecyclerView recyclerView2 = this.binding.v;
            yx50 yx50Var = this.c;
            if (yx50Var != null) {
                recyclerView2.setAdapter(yx50Var);
            } else {
                Intrinsics.n("roundBetAdapter");
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    public final void c(TopBets topBets) {
        try {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i = -1;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                TopBets topBets2 = (TopBets) obj;
                if (Intrinsics.g(topBets2.getUserId(), topBets.getUserId()) && topBets2.getBetIndex() == topBets.getBetIndex()) {
                    break;
                } else {
                    i++;
                }
            }
            ArrayList arrayList2 = this.b;
            if (i != -1) {
                arrayList2.set(i, topBets);
                yx50 yx50Var = this.c;
                if (yx50Var != null) {
                    yx50Var.i(this.b);
                    return;
                } else {
                    Intrinsics.n("roundBetAdapter");
                    throw null;
                }
            }
            if (arrayList2.isEmpty() || !Intrinsics.g(((TopBets) this.b.get(0)).getUserId(), SportyGamesManager.getInstance().getUserId()) || ((TopBets) this.b.get(0)).getStakeAmount() <= topBets.getStakeAmount()) {
                this.b.add(0, topBets);
                yx50 yx50Var2 = this.c;
                if (yx50Var2 == null) {
                    if (yx50Var2 == null) {
                        Intrinsics.n("roundBetAdapter");
                        throw null;
                    }
                    yx50Var2.i(this.b);
                }
            } else {
                this.b.add(1, topBets);
                yx50 yx50Var3 = this.c;
                if (yx50Var3 == null) {
                    if (yx50Var3 == null) {
                        Intrinsics.n("roundBetAdapter");
                        throw null;
                    }
                    yx50Var3.i(this.b);
                }
            }
            if (this.c == null) {
                b();
            }
            if (this.b.size() > 1) {
                ej5.c(this.a, null, null, new b(null), 3);
            }
        } catch (Exception unused) {
        }
    }

    public final h820 getBinding() {
        return this.binding;
    }

    public final void setBets(RoundBetResponse roundBetResponse) {
        roundBetResponse.getClass();
        try {
            if (roundBetResponse.getMessageType().equals("CASHOUT_RECORD")) {
                final TopBets bet = roundBetResponse.getBet();
                this.b.replaceAll(new UnaryOperator() { // from class: wv80
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        TopBets topBets = (TopBets) obj;
                        int i = ShRoundBetsContainer.e;
                        topBets.getClass();
                        String userId = topBets.getUserId();
                        TopBets topBets2 = bet;
                        return (Intrinsics.g(userId, topBets2 != null ? topBets2.getUserId() : null) && topBets.getBetId() == topBets2.getBetId()) ? topBets2 : topBets;
                    }
                });
                yx50 yx50Var = this.c;
                if (yx50Var != null) {
                    yx50Var.i(this.b);
                    return;
                } else {
                    Intrinsics.n("roundBetAdapter");
                    throw null;
                }
            }
            this.binding.z.setText(String.valueOf(roundBetResponse.getTotalBet()));
            List<TopBets> topBets = roundBetResponse.getTopBets();
            ArrayList arrayList = topBets != null ? new ArrayList(topBets) : null;
            if (arrayList != null) {
                p48.A(arrayList, new yv80());
            }
            ArrayList arrayList2 = this.b;
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                String userId = SportyGamesManager.getInstance().getUserId();
                userId.getClass();
                if (StringsKt.M(userId, ((TopBets) obj).getUserId(), false)) {
                    arrayList3.add(obj);
                }
            }
            if (arrayList != null) {
                this.b = arrayList;
            }
            ArrayList arrayList4 = this.b;
            if (arrayList4.size() > 1) {
                o48.v(new a(), arrayList4);
            }
            if (arrayList3.size() > 1) {
                this.b.add(0, arrayList3.get(0));
                this.b.add(1, arrayList3.get(1));
            } else if (arrayList3.size() == 1) {
                this.b.add(0, arrayList3.get(0));
            }
            yx50 yx50Var2 = this.c;
            if (yx50Var2 == null) {
                b();
            } else {
                yx50Var2.i(this.b);
            }
        } catch (Exception unused) {
        }
    }

    public final void setBinding(h820 h820Var) {
        h820Var.getClass();
        this.binding = h820Var;
    }

    public final void setTotalWinListener(final Function0<Unit> totalWinListener) {
        totalWinListener.getClass();
        this.binding.B.setOnClickListener(new View.OnClickListener() { // from class: uv80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ShRoundBetsContainer.e;
                totalWinListener.invoke();
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShRoundBetsContainer(Context context) {
        this(context, null);
        context.getClass();
    }
}
