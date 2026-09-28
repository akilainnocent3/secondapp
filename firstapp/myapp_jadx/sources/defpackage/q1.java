package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.AZTournamentActivity;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class q1 extends RecyclerView.f<a> {
    public ArrayList a;
    public AZTournamentActivity b;

    public class a extends RecyclerView.d0 {
        public final AppCompatCheckBox a;
        public final TextView b;
        public final TextView c;

        public a(View view) {
            super(view);
            this.b = (TextView) view.findViewById(R.id.az_tour_name);
            this.c = (TextView) view.findViewById(R.id.az_tour_count);
            this.a = (AppCompatCheckBox) view.findViewById(R.id.az_checkbox);
            view.setOnClickListener(new View.OnClickListener() { // from class: p1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    q1.a aVar = this.a;
                    q1 q1Var = q1.this;
                    int adapterPosition = aVar.getAdapterPosition();
                    if (adapterPosition >= 0) {
                        r1 r1Var = (r1) q1Var.a.get(adapterPosition);
                        boolean z = !r1Var.d;
                        r1Var.d = z;
                        aVar.a.setChecked(z);
                        AZTournamentActivity aZTournamentActivity = q1Var.b;
                        if (aZTournamentActivity != null) {
                            boolean z2 = r1Var.d;
                            ArrayList<String> arrayList = aZTournamentActivity.a;
                            String str = r1Var.b;
                            if (z2) {
                                arrayList.add(str);
                            } else {
                                arrayList.remove(str);
                            }
                            aZTournamentActivity.A1();
                        }
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        if (i < this.a.size()) {
            r1 r1Var = (r1) this.a.get(i);
            aVar.b.setText(r1Var.a);
            aVar.c.setText(String.valueOf(r1Var.c));
            aVar.a.setChecked(r1Var.d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(dzc.a(viewGroup, R.layout.spr_az_tournament_item, viewGroup, false));
    }
}
