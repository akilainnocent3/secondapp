package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.Reader;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.bookingcode.presentation.uistate.HighLiabilityItemUiState;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class ujl extends RecyclerView.f<a> {
    public final ArrayList a;

    public final class a extends RecyclerView.d0 {
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final TextView d;
        public final LinearLayout e;
        public final TextView f;
        public final TextView i;
        public final TextView v;
        public final TextView w;
        public final TextView y;

        public a(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.tvOutcome);
            viewFindViewById.getClass();
            this.a = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.tvSeparator);
            viewFindViewById2.getClass();
            this.b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.tvCategory);
            viewFindViewById3.getClass();
            this.c = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.tvOdds);
            viewFindViewById4.getClass();
            this.d = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.layoutTeams);
            viewFindViewById5.getClass();
            this.e = (LinearLayout) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.tvHomeTeam);
            viewFindViewById6.getClass();
            this.f = (TextView) viewFindViewById6;
            View viewFindViewById7 = view.findViewById(R.id.tvAwayTeam);
            viewFindViewById7.getClass();
            this.i = (TextView) viewFindViewById7;
            View viewFindViewById8 = view.findViewById(R.id.tvTournamentName);
            viewFindViewById8.getClass();
            this.v = (TextView) viewFindViewById8;
            View viewFindViewById9 = view.findViewById(R.id.tvBetBuilderChildren);
            viewFindViewById9.getClass();
            this.w = (TextView) viewFindViewById9;
            View viewFindViewById10 = view.findViewById(R.id.tvTime);
            viewFindViewById10.getClass();
            this.y = (TextView) viewFindViewById10;
        }
    }

    public ujl(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        aVar.getClass();
        HighLiabilityItemUiState highLiabilityItemUiState = (HighLiabilityItemUiState) this.a.get(i);
        TextView textView = aVar.i;
        TextView textView2 = aVar.f;
        LinearLayout linearLayout = aVar.e;
        TextView textView3 = aVar.b;
        TextView textView4 = aVar.c;
        TextView textView5 = aVar.v;
        TextView textView6 = aVar.w;
        highLiabilityItemUiState.getClass();
        TextView textView7 = aVar.a;
        textView7.setText(highLiabilityItemUiState.getOutComeDesc());
        aVar.d.setText(gky.a(highLiabilityItemUiState.getOutComeOdds()));
        if (b3.T(highLiabilityItemUiState.getEventId())) {
            textView4.setVisibility(8);
            textView3.setVisibility(8);
            linearLayout.setVisibility(8);
            textView5.setText(highLiabilityItemUiState.getTournamentName());
            textView5.setVisibility(0);
            textView6.setText(highLiabilityItemUiState.getMarketDesc());
            textView6.setVisibility(0);
            textView7.setMaxWidth(Reader.READ_DONE);
        } else if (highLiabilityItemUiState.isBetBuilder()) {
            textView4.setVisibility(8);
            textView3.setVisibility(8);
            textView5.setVisibility(8);
            textView6.setText(highLiabilityItemUiState.getBetBuilderChildren());
            textView6.setVisibility(0);
            linearLayout.setVisibility(0);
            textView2.setText(highLiabilityItemUiState.getHomeTeamName());
            textView.setText(highLiabilityItemUiState.getAwayTeamName());
            textView7.setMaxWidth(bqe.b(120.0f, aVar.itemView.getContext()));
        } else {
            textView4.setText(highLiabilityItemUiState.getMarketDesc());
            textView4.setVisibility(0);
            textView3.setVisibility(0);
            textView5.setVisibility(8);
            textView6.setVisibility(8);
            linearLayout.setVisibility(0);
            textView2.setText(highLiabilityItemUiState.getHomeTeamName());
            textView.setText(highLiabilityItemUiState.getAwayTeamName());
            textView7.setMaxWidth(bqe.b(120.0f, aVar.itemView.getContext()));
        }
        TextView textView8 = aVar.y;
        UiText displayDate = highLiabilityItemUiState.getDisplayDate();
        Context context = aVar.itemView.getContext();
        context.getClass();
        displayDate.getClass();
        textView8.setText(displayDate.e(context).toString());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.spm_item_high_liability_code, viewGroup, false);
        viewA.getClass();
        return new a(viewA);
    }
}
