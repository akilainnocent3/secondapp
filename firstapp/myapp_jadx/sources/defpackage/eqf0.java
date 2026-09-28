package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.TicketInRound;
import com.sportybet.android.instantwin.presentation.ticket.round.RoundTicketsDetailAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class eqf0 extends b5m {
    public RoundTicketsDetailAdapter f;
    public ji2 i;
    public jlo v;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.iwqk_fragment_ticket_detail, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_ticket_list);
        recyclerView.i(new dor(bqe.a(20.0f)));
        RoundTicketsDetailAdapter roundTicketsDetailAdapter = new RoundTicketsDetailAdapter(this.i, new p5l(this));
        this.f = roundTicketsDetailAdapter;
        recyclerView.setAdapter(roundTicketsDetailAdapter);
        this.f.setOnScrollListener(new ov7(recyclerView));
        e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        v8i0 viewModelStore = eVarRequireActivity.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = eVarRequireActivity.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, sd7.a(eVarRequireActivity, viewModelStore, defaultViewModelProviderFactory));
        dq7 dq7VarA = jq40.a(gqf0.class);
        String strI = dq7VarA.i();
        if (strI != null) {
            ((gqf0) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI))).a.f(getViewLifecycleOwner(), new lfy() { // from class: dqf0
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    Round round = (Round) obj;
                    if (round == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator<TicketInRound> it = round.tickets.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new d060(round.sportId, it.next()));
                    }
                    eqf0 eqf0Var = this.a;
                    eqf0Var.f.setList(arrayList);
                    eqf0Var.f.setRound(round);
                    eqf0Var.f.notifyDataSetChanged();
                }
            });
        } else {
            hb5.a("Local and anonymous classes can not be ViewModels");
        }
    }
}
