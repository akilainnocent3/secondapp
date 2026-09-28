package defpackage;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.pocket.deposit.QuickInputItem;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class znd extends RecyclerView.f<b> {
    public ArrayList a;
    public a b;

    public interface a {
    }

    public class b extends RecyclerView.d0 implements View.OnClickListener {
        public final TextView a;
        public final TextView b;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.pay_amount);
            this.b = (TextView) view.findViewById(R.id.pay_desc);
            view.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            znd zndVar = znd.this;
            ArrayList arrayList = zndVar.a;
            int iIntValue = ((Integer) view.getTag()).intValue();
            if (iIntValue < 0 || iIntValue >= arrayList.size()) {
                return;
            }
            QuickInputItem quickInputItem = (QuickInputItem) arrayList.get(iIntValue);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((QuickInputItem) obj).isSelected = false;
            }
            quickInputItem.isSelected = true;
            zndVar.notifyDataSetChanged();
            a aVar = zndVar.b;
            if (aVar != null) {
                long j = quickInputItem.amount;
                gjp gjpVar = (gjp) aVar;
                pjp pjpVar = gjpVar.f0;
                if (pjpVar == null || !(((rr00) pjpVar.U0.getValue()) instanceof rr00.a)) {
                    gjpVar.e0 = true;
                    String string = BigDecimal.valueOf(j).divide(BigDecimal.valueOf(10000L), RoundingMode.HALF_UP).toString();
                    gjpVar.C.setText(string);
                    gjpVar.C.setSelection(string.length());
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        b bVar = (b) d0Var;
        QuickInputItem quickInputItem = (QuickInputItem) this.a.get(i);
        View view = bVar.itemView;
        TextView textView = bVar.b;
        view.setEnabled(true);
        bVar.itemView.setVisibility(0);
        boolean zIsEmpty = TextUtils.isEmpty(quickInputItem.text);
        TextView textView2 = bVar.a;
        if (zIsEmpty) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            textView2.setText(quickInputItem.text);
            textView2.setTextColor(Color.parseColor(quickInputItem.isSelected ? "#ffffff" : "#0d9737"));
        }
        String str = quickInputItem.btnText;
        if (str == null || TextUtils.isEmpty(str.trim())) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setTextColor(Color.parseColor(quickInputItem.isSelected ? "#ffffff" : "#9ca0ab"));
            textView.setText(quickInputItem.btnText);
        }
        bVar.itemView.setTag(Integer.valueOf(i));
        View view2 = bVar.itemView;
        Drawable drawableA = gr0.a(textView2.getContext(), quickInputItem.isSelected ? R.drawable.green_btn_bg : R.drawable.comb_edit_focus_bg);
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        view2.setBackground(drawableA);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_item, (ViewGroup) null));
    }
}
