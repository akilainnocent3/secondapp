package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.gridlayout.widget.GridLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.SearchLiveEventMeta;
import com.sportybet.plugin.realsports.data.Sport;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final class cw70 extends x<Event, mw70> {
    public static final LinkedHashMap f = new LinkedHashMap();
    public static final LinkedHashSet i = new LinkedHashSet();
    public final /* synthetic */ vfh0 b;
    public final k650 c;
    public final mpe0 d;
    public com.sportybet.plugin.realsports.search.a e;

    public static final class a extends n.e<Event> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(Event event, Event event2) {
            Event event3 = event;
            Event event4 = event2;
            event3.getClass();
            event4.getClass();
            return Intrinsics.g(event3, event4);
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(Event event, Event event2) {
            Event event3 = event;
            Event event4 = event2;
            event3.getClass();
            event4.getClass();
            return Intrinsics.g(event3.eventId, event4.eventId);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw70(Context context, k650 k650Var) {
        super(new a());
        context.getClass();
        k650Var.getClass();
        this.b = new vfh0(context, "search/live");
        this.c = k650Var;
        this.d = hwr.b(new bw70());
    }

    public final SearchLiveEventMeta k() {
        return (SearchLiveEventMeta) this.d.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i2) {
        int i3;
        Category category;
        Category category2;
        Tournament tournament;
        Category category3;
        final mw70 mw70Var = (mw70) d0Var;
        mw70Var.getClass();
        Event item = getItem(i2);
        item.getClass();
        final Event event = item;
        SearchLiveEventMeta searchLiveEventMetaK = k();
        Context context = mw70Var.d;
        searchLiveEventMetaK.getClass();
        k650 k650Var = this.c;
        k650Var.getClass();
        fid0 fid0Var = mw70Var.a;
        mfb0 sportRule = searchLiveEventMetaK.getSportRule();
        if (sportRule == null) {
            return;
        }
        ConstraintLayout constraintLayout = fid0Var.a;
        AppCompatImageView appCompatImageView = fid0Var.N;
        ImageView imageView = fid0Var.v;
        TextView textView = fid0Var.c;
        GridLayout gridLayout = fid0Var.E;
        ImageView imageView2 = fid0Var.b;
        constraintLayout.setTag(event);
        fid0Var.O.setText(event.homeTeamName);
        fid0Var.P.setText(event.awayTeamName);
        TextView textView2 = fid0Var.V;
        searchLiveEventMetaK.getMarketRule();
        textView2.setText(b3.M(event));
        if (event.commentsNum <= 0 || !k650Var.b("enable_live_event_list_chat_count")) {
            textView.setVisibility(8);
        } else {
            Context context2 = mw70Var.itemView.getContext();
            context2.getClass();
            textView.setText(ch7.a(context2, event.commentsNum));
            textView.setVisibility(0);
        }
        fid0Var.Q.setText(sportRule.p(event.playedSeconds, event.remainingTimeInPeriod, event.matchStatus));
        Sport sport = event.sport;
        String str = null;
        String str2 = (sport == null || (category3 = sport.category) == null) ? null : category3.name;
        if (sport != null && (category2 = sport.category) != null && (tournament = category2.tournament) != null) {
            str = tournament.name;
        }
        fid0Var.i.setText(sn5.b(context, R.string.app_common__league_title, str2, str));
        boolean zA = nkd0.a.a.a(event);
        fid0Var.F.setVisibility(zA ? 0 : 8);
        imageView2.setVisibility(8);
        Sport sport2 = event.sport;
        if (sport2 != null && (category = sport2.category) != null && category.tournament != null && t25.b(event, searchLiveEventMetaK.getBoostInfoResult())) {
            imageView2.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            layoutParams.getClass();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(-bqe.a(zA ? 7.0f : 17.0f), bqe.a(7.0f), 0, 0);
            imageView2.setLayoutParams(layoutParams2);
        }
        fid0Var.K.setVisibility(event.hasAudioStream() ? 0 : 8);
        fid0Var.M.setVisibility(event.hasLiveStream() ? 0 : 8);
        fid0Var.L.setVisibility(event.hasGift() ? 0 : 8);
        imageView.setVisibility(event.isVirtualSoccer() ? 0 : 8);
        int iA = fug0.a(hug0.a, context);
        if (iA == 1) {
            i3 = R.drawable.ic_spr_live_virtual_sw;
        } else if (iA == 2) {
            i3 = R.drawable.ic_spr_live_virtual_es_mx;
        } else if (iA != 4) {
            i3 = iA != 5 ? R.drawable.ic_spr_live_virtual : R.drawable.ic_spr_live_virtual_fr_fr;
        } else {
            i3 = R.drawable.ic_spr_live_virtual_pt_mz;
        }
        imageView.setImageDrawable(gr0.a(context, i3));
        appCompatImageView.setVisibility(event.showStats() ? 0 : 8);
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: hw70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lmg lmgVar = mw70Var.b;
                if (lmgVar != null) {
                    lmgVar.a(event);
                }
            }
        });
        ArrayList arrayListA = sportRule.A(event.setScore, event.pointScore, event.gameScore);
        gridLayout.removeAllViews();
        gridLayout.setColumnCount(arrayListA.size() / 2);
        int i4 = 0;
        int iA2 = sbz.a(0, arrayListA.size() - 1, 2);
        if (iA2 >= 0) {
            while (true) {
                Object obj = arrayListA.get(i4);
                obj.getClass();
                gridLayout.addView(mw70Var.b(i4, (String) obj));
                if (i4 == iA2) {
                    break;
                } else {
                    i4 += 2;
                }
            }
        }
        c cVarL = f.l(2, f.n(1, arrayListA.size()));
        int i5 = cVarL.a;
        int i6 = cVarL.b;
        int i7 = cVarL.c;
        if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
            while (true) {
                Object obj2 = arrayListA.get(i5);
                obj2.getClass();
                gridLayout.addView(mw70Var.b(i5, (String) obj2));
                if (i5 == i6) {
                    break;
                } else {
                    i5 += i7;
                }
            }
        }
        mw70Var.a(event, searchLiveEventMetaK, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i2) {
        viewGroup.getClass();
        return new mw70(fid0.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spr_live_item, viewGroup, false)), this.e, new dw70(this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onViewRecycled(RecyclerView.d0 d0Var) {
        mw70 mw70Var = (mw70) d0Var;
        mw70Var.getClass();
        super.onViewRecycled(mw70Var);
        ArrayList arrayList = mw70Var.f;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((OutcomeButton) obj).a();
        }
        arrayList.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i2, List list) {
        mw70 mw70Var = (mw70) d0Var;
        mw70Var.getClass();
        list.getClass();
        if (list.isEmpty()) {
            super.onBindViewHolder(mw70Var, i2, list);
            return;
        }
        Event item = getItem(i2);
        item.getClass();
        mw70Var.a(item, k(), i2);
    }
}
