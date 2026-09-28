package defpackage;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.data.Category;
import com.sportybet.plugin.realsports.data.Schedule;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class nz60 extends RecyclerView.f<a> {
    public e a;
    public List<Schedule> b;

    public class a extends RecyclerView.d0 implements View.OnClickListener {
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final TextView d;

        public a(View view) {
            super(view);
            this.d = (TextView) view.findViewById(R.id.title_desc);
            this.a = (TextView) view.findViewById(R.id.time);
            this.b = (TextView) view.findViewById(R.id.team);
            this.c = (TextView) view.findViewById(R.id.tournament);
            view.setOnClickListener(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Schedule schedule = (Schedule) view.getTag();
            e eVar = nz60.this.a;
            Intent intent = new Intent(eVar, (Class<?>) PreMatchEventActivity.class);
            intent.putExtra("EXTRA_EVENT_ID", schedule.eventId);
            nkd0 nkd0Var = nkd0.a.a;
            nkd0Var.getClass();
            int iContains = 0;
            try {
                iContains = nkd0Var.a.contains(schedule.sport.category.id);
            } catch (Exception unused) {
            }
            intent.putExtra("EXTRA_EVENT_LABEL", iContains);
            yrh0.s(eVar, intent, true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        List<Schedule> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        Schedule schedule = this.b.get(i);
        aVar.d.setVisibility(i == 0 ? 0 : 8);
        aVar.itemView.setTag(schedule);
        aVar.a.setText(bwf0.a.s(schedule.estimateStartTime, false));
        TextView textView = aVar.b;
        StringBuilder sb = new StringBuilder();
        sb.append(schedule.homeTeamName);
        sb.append("\n");
        zug.b(sb, schedule.awayTeamName, textView);
        TextView textView2 = aVar.c;
        Category category = schedule.sport.category;
        textView2.setText(sn5.c(textView2, R.string.app_common__var_to_var, category.name, category.tournament.name));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(this.a).inflate(R.layout.spr_schedule_item, viewGroup, false));
    }
}
