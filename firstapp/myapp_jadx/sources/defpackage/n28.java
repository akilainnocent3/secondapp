package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.rush.model.response.RushCoeffListResponse;
import java.text.DecimalFormat;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n28 extends RecyclerView.f<a> {
    public final ArrayList<RushCoeffListResponse> a;
    public j260 b;

    public final class a extends RecyclerView.d0 {
        public final j260 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j260 j260Var) {
            super(j260Var.a);
            j260Var.getClass();
            this.a = j260Var;
        }
    }

    public n28(ArrayList<RushCoeffListResponse> arrayList) {
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
        RushCoeffListResponse rushCoeffListResponse = this.a.get(i);
        rushCoeffListResponse.getClass();
        RushCoeffListResponse rushCoeffListResponse2 = rushCoeffListResponse;
        String str = "0.00";
        j260 j260Var = aVar.a;
        TextView textView = j260Var.c;
        ConstraintLayout constraintLayout = j260Var.a;
        try {
            String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(rushCoeffListResponse2.getHouseCoefficient());
            str2.getClass();
            str = str2;
        } catch (Exception unused) {
        }
        textView.setText(str.concat(" X"));
        j260Var.c.setTextColor(rushCoeffListResponse2.isWon() ? constraintLayout.getContext().getColor(R.color.sg_rush_coeff_green) : constraintLayout.getContext().getColor(R.color.sg_rush_coeff_red));
        j260Var.b.startAnimation(AnimationUtils.loadAnimation(constraintLayout.getContext(), R.anim.rush_coeff_list_scale));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.rush_coeff_list, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewA;
        TextView textView = (TextView) h5e.a(R.id.user_coeff, viewA);
        if (textView == null) {
            bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(R.id.user_coeff)));
            return null;
        }
        this.b = new j260(constraintLayout, constraintLayout, textView);
        j260 j260Var = this.b;
        if (j260Var != null) {
            return new a(j260Var);
        }
        Intrinsics.n("binding");
        throw null;
    }
}
