package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.openbet.OpenBetsActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a1z extends RecyclerView.f<uyy> {
    public xzy b;
    public final ji2 c;
    public final tlo d;
    public final OpenBetsActivity e;
    public final ArrayList a = new ArrayList();
    public final a f = new a();
    public final z0z i = new z0z(this);

    public class a implements l7v.a {
        public a() {
        }
    }

    public a1z(ji2 ji2Var, n4p n4pVar, OpenBetsActivity openBetsActivity) {
        this.c = ji2Var;
        this.d = n4pVar;
        this.e = openBetsActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return ((xzy) this.a.get(i)).c;
    }

    public final void i() {
        xzy xzyVar = this.b;
        if (xzyVar == null || xzyVar.h.isEmpty()) {
            return;
        }
        xzy first = this.b.h.getFirst();
        ArrayList arrayList = this.a;
        int iIndexOf = arrayList.indexOf(first);
        if (iIndexOf < 0) {
            return;
        }
        int size = arrayList.size();
        arrayList.removeAll(this.b.h);
        notifyItemRangeRemoved(iIndexOf, size - arrayList.size());
        xzy xzyVar2 = this.b;
        arrayList.add(iIndexOf, new xzy(xzyVar2.a, xzyVar2.b, 2, null, this.c, xzyVar2.e, false, xzyVar2.f));
        notifyItemInserted(iIndexOf);
        this.b = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((uyy) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        int i2 = R.id.divider_line;
        tlo tloVar = this.d;
        ArrayList arrayList = this.a;
        if (i == 1) {
            View viewInflate = layoutInflaterFrom.inflate(R.layout.iwqk_open_bet_header_item, viewGroup, false);
            View viewA = h5e.a(R.id.divider_line, viewInflate);
            if (viewA != null) {
                i2 = R.id.rebet;
                TextView textView = (TextView) h5e.a(R.id.rebet, viewInflate);
                if (textView != null) {
                    i2 = R.id.ticket_id;
                    TextView textView2 = (TextView) h5e.a(R.id.ticket_id, viewInflate);
                    if (textView2 != null) {
                        i2 = R.id.title;
                        TextView textView3 = (TextView) h5e.a(R.id.title, viewInflate);
                        if (textView3 != null) {
                            return new phl(new h5p((ConstraintLayout) viewInflate, viewA, textView, textView2, textView3), this.e, tloVar, arrayList);
                        }
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
            return null;
        }
        if (i == 2) {
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.iwqk_open_bet_short_item, viewGroup, false);
            View viewA2 = h5e.a(R.id.divider_line, viewInflate2);
            if (viewA2 != null) {
                i2 = R.id.expand;
                TextView textView4 = (TextView) h5e.a(R.id.expand, viewInflate2);
                if (textView4 != null) {
                    TextView textView5 = (TextView) h5e.a(R.id.flex_one_cut_info, viewInflate2);
                    if (textView5 != null) {
                        i2 = R.id.match;
                        TextView textView6 = (TextView) h5e.a(R.id.match, viewInflate2);
                        if (textView6 != null) {
                            return new l7v(new i5p((RelativeLayout) viewInflate2, viewA2, textView4, textView5, textView6), this.f, arrayList);
                        }
                    } else {
                        i2 = R.id.flex_one_cut_info;
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
            return null;
        }
        if (i != 3 && i != 4) {
            if (i != 5) {
                return null;
            }
            View viewInflate3 = layoutInflaterFrom.inflate(R.layout.iwqk_open_bet_stake_item, viewGroup, false);
            int i3 = R.id.pot_win_value;
            TextView textView7 = (TextView) h5e.a(R.id.pot_win_value, viewInflate3);
            if (textView7 != null) {
                i3 = R.id.stake;
                if (((TextView) h5e.a(R.id.stake, viewInflate3)) != null) {
                    i3 = R.id.stake_value;
                    TextView textView8 = (TextView) h5e.a(R.id.stake_value, viewInflate3);
                    if (textView8 != null) {
                        i3 = R.id.win;
                        if (((TextView) h5e.a(R.id.win, viewInflate3)) != null) {
                            return new gvd0(new j5p((LinearLayout) viewInflate3, textView7, textView8), tloVar, arrayList);
                        }
                    }
                }
            }
            bmy.a("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i3)));
            return null;
        }
        View viewInflate4 = layoutInflaterFrom.inflate(R.layout.iwqk_open_bet_full_item, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.bet_builder_market_desc_list, viewInflate4);
        if (linearLayout != null) {
            View viewA3 = h5e.a(R.id.divider_line, viewInflate4);
            if (viewA3 != null) {
                i2 = R.id.event_desc;
                TextView textView9 = (TextView) h5e.a(R.id.event_desc, viewInflate4);
                if (textView9 != null) {
                    TextView textView10 = (TextView) h5e.a(R.id.flex_one_cut_info, viewInflate4);
                    if (textView10 != null) {
                        i2 = R.id.info_container;
                        if (((LinearLayout) h5e.a(R.id.info_container, viewInflate4)) != null) {
                            i2 = R.id.league_name;
                            TextView textView11 = (TextView) h5e.a(R.id.league_name, viewInflate4);
                            if (textView11 != null) {
                                i2 = R.id.market_desc;
                                TextView textView12 = (TextView) h5e.a(R.id.market_desc, viewInflate4);
                                if (textView12 != null) {
                                    i2 = R.id.odd_desc;
                                    TextView textView13 = (TextView) h5e.a(R.id.odd_desc, viewInflate4);
                                    if (textView13 != null) {
                                        i2 = R.id.shrink;
                                        TextView textView14 = (TextView) h5e.a(R.id.shrink, viewInflate4);
                                        if (textView14 != null) {
                                            return new t6v(new g5p((RelativeLayout) viewInflate4, linearLayout, viewA3, textView9, textView10, textView11, textView12, textView13, textView14), this.i, this.c, tloVar.s(), arrayList);
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        i2 = R.id.flex_one_cut_info;
                    }
                }
            }
        } else {
            i2 = R.id.bet_builder_market_desc_list;
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i2)));
        return null;
    }
}
