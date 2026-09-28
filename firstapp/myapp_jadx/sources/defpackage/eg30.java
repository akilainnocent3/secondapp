package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class eg30 extends RecyclerView.f {
    public ArrayList a;
    public LayoutInflater b;

    public static class a extends RecyclerView.d0 {
        public final TextView a;
        public final TextView b;
        public final ImageView c;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.step_num);
            this.b = (TextView) view.findViewById(R.id.step_details);
            this.c = (ImageView) view.findViewById(R.id.step_pic);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        a aVar = (a) d0Var;
        pal palVar = (pal) this.a.get(i);
        TextView textView = aVar.a;
        textView.setText(sn5.c(textView, R.string.app_common__step_prefix, palVar.a));
        aVar.b.setText(palVar.b);
        int i2 = palVar.c;
        ImageView imageView = aVar.c;
        if (i2 == -1) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this.b.inflate(R.layout.item_quick_guide, viewGroup, false));
    }
}
