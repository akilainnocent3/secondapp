package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ulr extends x<xlr, lmr> {
    public ydm b;

    /* JADX INFO: loaded from: classes7.dex */
    public final class a extends n.e<xlr> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(xlr xlrVar, xlr xlrVar2) {
            xlr xlrVar3 = xlrVar;
            xlr xlrVar4 = xlrVar2;
            xlrVar3.getClass();
            xlrVar4.getClass();
            return xlrVar3.d == xlrVar4.d;
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(xlr xlrVar, xlr xlrVar2) {
            xlr xlrVar3 = xlrVar;
            xlr xlrVar4 = xlrVar2;
            xlrVar3.getClass();
            xlrVar4.getClass();
            return Intrinsics.g(xlrVar3.b, xlrVar4.b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        lmr lmrVar = (lmr) d0Var;
        lmrVar.getClass();
        xlr item = getItem(i);
        item.getClass();
        xlr xlrVar = item;
        ylr ylrVar = lmrVar.a;
        ylrVar.a.setTag(xlrVar);
        TextView textView = ylrVar.b;
        textView.setText(xlrVar.a);
        Context context = ylrVar.a.getContext();
        boolean z = xlrVar.d;
        textView.setTextColor(context.getColor(z ? R.color.brand_secondary : R.color.text_type1_primary));
        ylrVar.c.setVisibility(z ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View viewA = dzc.a(viewGroup, R.layout.language_item, viewGroup, false);
        int i2 = R.id.language;
        TextView textView = (TextView) h5e.a(R.id.language, viewA);
        if (textView != null) {
            i2 = R.id.selected_language;
            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.selected_language, viewA);
            if (appCompatImageView != null) {
                return new lmr(new ylr(textView, appCompatImageView, (ConstraintLayout) viewA), this.b);
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }
}
