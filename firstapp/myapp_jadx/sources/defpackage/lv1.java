package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class lv1 extends RecyclerView.f<a> {
    public final ArrayList a = new ArrayList();

    public static class a extends RecyclerView.d0 {
        public final TextView a;
        public final View b;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.no);
            this.b = view.findViewById(R.id.check);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        kv1 kv1Var = (kv1) this.a.get(i);
        aVar.a.setText(kv1Var.a);
        TextView textView = aVar.a;
        ShapeDrawable shapeDrawableA = mv1.a(textView.getContext(), Integer.parseInt(kv1Var.a));
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        textView.setBackground(shapeDrawableA);
        boolean z = kv1Var.b;
        View view = aVar.b;
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(dzc.a(viewGroup, R.layout.sg_rut_ball, viewGroup, false));
    }
}
