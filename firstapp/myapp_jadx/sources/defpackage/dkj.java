package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.spinmatch.model.response.DetailResponse;
import java.util.ArrayList;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dkj extends RecyclerView.f<a> {
    public final ArrayList<DetailResponse.BetConfigList> a;
    public final Context b;
    public final DetailResponse c;
    public final String d;
    public ekj e;

    public final class a extends RecyclerView.d0 {
        public final ekj a;
        public final /* synthetic */ dkj b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dkj dkjVar, ekj ekjVar) {
            super(ekjVar.a);
            ekjVar.getClass();
            this.b = dkjVar;
            this.a = ekjVar;
        }
    }

    public dkj(ArrayList<DetailResponse.BetConfigList> arrayList, Context context, DetailResponse detailResponse, String str) {
        context.getClass();
        detailResponse.getClass();
        str.getClass();
        this.a = arrayList;
        this.b = context;
        this.c = detailResponse;
        this.d = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        ArrayList<DetailResponse.BetConfigList> arrayList = this.a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        aVar.getClass();
        DetailResponse.MaxBetConfigList maxBetConfigList = null;
        ArrayList<DetailResponse.BetConfigList> arrayList = this.a;
        DetailResponse.BetConfigList betConfigList = arrayList != null ? arrayList.get(i) : null;
        if (betConfigList != null) {
            pfd pfdVar = fse.a;
            j1b j1bVarA = w5b.a(gku.a);
            dkj dkjVar = aVar.b;
            ej5.c(j1bVarA, null, null, new ckj(dkjVar, aVar, null), 3);
            ekj ekjVar = aVar.a;
            ekjVar.e.setText("x" + ((int) betConfigList.getPayout()));
            TextView textView = ekjVar.e;
            Context context = dkjVar.b;
            DetailResponse detailResponse = dkjVar.c;
            String str = dkjVar.d;
            textView.setTextColor(context.getColor(betConfigList.getColorCode()));
            TextView textView2 = ekjVar.c;
            TreeMap treeMap = pw.a;
            textView2.setText(str + " " + pw.a(String.valueOf(detailResponse.getMinStakeAmount())));
            TextView textView3 = ekjVar.b;
            ArrayList<DetailResponse.MaxBetConfigList> maxBetConfigList2 = detailResponse.getMaxBetConfigList();
            int size = maxBetConfigList2.size();
            int i2 = 0;
            while (i2 < size) {
                DetailResponse.MaxBetConfigList maxBetConfigList3 = maxBetConfigList2.get(i2);
                i2++;
                if (maxBetConfigList3.getBetConfigId() == betConfigList.getId()) {
                    maxBetConfigList = maxBetConfigList3;
                    break;
                }
            }
            DetailResponse.MaxBetConfigList maxBetConfigList4 = maxBetConfigList;
            textView3.setText(str + " " + pw.b(String.valueOf(maxBetConfigList4 != null ? maxBetConfigList4.getMaxStakeAmount() : 0.0d)));
            ConstraintLayout constraintLayout = ekjVar.d;
            String strValueOf = String.valueOf(betConfigList.getColorCode());
            strValueOf.getClass();
            int i3 = Integer.parseInt(strValueOf);
            if (i3 != R.color.white) {
                constraintLayout.setBackgroundTintList(ColorStateList.valueOf(constraintLayout.getContext().getColor(i3)));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.game_limit_item, viewGroup, false);
        int i2 = R.id.max_amt;
        TextView textView = (TextView) h5e.a(R.id.max_amt, viewA);
        if (textView != null) {
            i2 = R.id.min_amt;
            TextView textView2 = (TextView) h5e.a(R.id.min_amt, viewA);
            if (textView2 != null) {
                i2 = R.id.parentLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.parentLayout, viewA);
                if (constraintLayout != null) {
                    i2 = R.id.payout_amount;
                    TextView textView3 = (TextView) h5e.a(R.id.payout_amount, viewA);
                    if (textView3 != null) {
                        this.e = new ekj((ConstraintLayout) viewA, textView, textView2, constraintLayout, textView3);
                        ekj ekjVar = this.e;
                        if (ekjVar != null) {
                            return new a(this, ekjVar);
                        }
                        Intrinsics.n("binding");
                        throw null;
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }
}
