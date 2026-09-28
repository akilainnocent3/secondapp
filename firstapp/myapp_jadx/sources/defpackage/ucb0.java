package defpackage;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.OutcomeButton;
import com.sportybet.android.instantwin.presentation.widget.OutcomeSpinnerLayout;
import com.sportybet.android.widget.ListenableSpinner;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ucb0 extends ArrayAdapter<String> implements ListenableSpinner.a {
    public final Spinner a;
    public List<? extends OutcomeSpinnerLayout.d<bs3>> b;
    public com.sportybet.android.instantwin.presentation.widget.b c;
    public final mpe0 d;

    public static final class a {
        public final TextView a;
        public final ImageView b;

        public a(View view) {
            view.getClass();
            View viewFindViewById = view.findViewById(R.id.spinner_text);
            viewFindViewById.getClass();
            this.a = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.spinner_arrow);
            viewFindViewById2.getClass();
            this.b = (ImageView) viewFindViewById2;
        }
    }

    public static final class b {
        public final TextView a;
        public final OutcomeButton b;
        public final OutcomeButton c;
        public final OutcomeButton d;

        public b(View view) {
            view.getClass();
            View viewFindViewById = view.findViewById(R.id.spinner_text);
            viewFindViewById.getClass();
            this.a = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.outcome1);
            viewFindViewById2.getClass();
            this.b = (OutcomeButton) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.outcome2);
            viewFindViewById3.getClass();
            this.c = (OutcomeButton) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.outcome3);
            viewFindViewById4.getClass();
            this.d = (OutcomeButton) viewFindViewById4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucb0(ListenableSpinner listenableSpinner, int i, ArrayList arrayList) {
        super(listenableSpinner.getContext(), 0, arrayList);
        listenableSpinner.getClass();
        this.a = listenableSpinner;
        this.d = hwr.b(new d9b(this, 2));
        listenableSpinner.setDropDownWidth(i);
        listenableSpinner.setDropDownVerticalOffset(zch0.a(listenableSpinner.getContext(), 38));
        listenableSpinner.setSpinnerEventsListener(this);
    }

    @Override // com.sportybet.android.widget.ListenableSpinner.a
    public final void b(ListenableSpinner listenableSpinner) {
        ImageView imageView;
        View selectedView = listenableSpinner.getSelectedView();
        if (selectedView == null || (imageView = (ImageView) selectedView.findViewById(R.id.spinner_arrow)) == null) {
            return;
        }
        imageView.setImageResource(R.drawable.spr_ic_chevron_down);
    }

    @Override // com.sportybet.android.widget.ListenableSpinner.a
    public final void c(ListenableSpinner listenableSpinner) {
        ImageView imageView;
        View selectedView = listenableSpinner.getSelectedView();
        if (selectedView == null || (imageView = (ImageView) selectedView.findViewById(R.id.spinner_arrow)) == null) {
            return;
        }
        imageView.setImageResource(R.drawable.spr_ic_chevron_up);
    }

    public final void d(final OutcomeButton outcomeButton, final int i, final int i2) {
        OutcomeSpinnerLayout.d dVar;
        int i3;
        List<? extends OutcomeSpinnerLayout.d<bs3>> list = this.b;
        if (list == null || (dVar = (OutcomeSpinnerLayout.d) CollectionsKt.V(i, list)) == null) {
            return;
        }
        int size = dVar.a.size();
        outcomeButton.setVisibility(i2 < size ? 0 : 8);
        if (i2 >= size) {
            return;
        }
        Boolean bool = (Boolean) dVar.d.get(i2);
        Boolean bool2 = (Boolean) dVar.f.get(i2);
        bool.getClass();
        outcomeButton.setOutcomeEnabled(bool.booleanValue());
        Object obj = dVar.b.get(i2);
        obj.getClass();
        outcomeButton.setOutcomeValue((String) obj);
        outcomeButton.setOutcomeVisibility(bool.booleanValue() ? 0 : 8);
        outcomeButton.setOutcomeGravity(17);
        outcomeButton.setOutcomeDescVisibility(8);
        outcomeButton.setLockVisibility(bool.booleanValue() ? 8 : 0);
        if (((Boolean) dVar.e.get(i2)).booleanValue()) {
            int color = outcomeButton.getContext().getColor(R.color.text_type1_secondary);
            outcomeButton.setOutcomeDescColor(color);
            outcomeButton.setOutcomeColor(color);
            outcomeButton.setBackgroundColor(outcomeButton.getContext().getColor(R.color.iv_outcome_mutex_bg));
            outcomeButton.setEnabled(false);
            outcomeButton.setSelected(false);
            return;
        }
        if (bool.booleanValue()) {
            i3 = bool2.booleanValue() ? R.color.brand_tertiary : R.color.brand_secondary_variable_type2;
        } else {
            i3 = R.color.brand_secondary_variable_type1;
        }
        int color2 = outcomeButton.getContext().getColor(i3);
        outcomeButton.setOutcomeDescColor(color2);
        outcomeButton.setOutcomeColor(color2);
        outcomeButton.setBackgroundResource((((Boolean) dVar.g.get(i2)).booleanValue() && !bool2.booleanValue() && bool.booleanValue()) ? R.drawable.iwqk_outcome_toggle_highlight : R.drawable.iwqk_outcome_toggle_bg);
        outcomeButton.setEnabled(bool.booleanValue());
        bool2.getClass();
        outcomeButton.setSelected(bool2.booleanValue());
        outcomeButton.setOnClickListener(new View.OnClickListener() { // from class: tcb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ucb0 ucb0Var = this;
                Spinner spinner = ucb0Var.a;
                OutcomeButton outcomeButton2 = outcomeButton;
                boolean zIsSelected = outcomeButton2.isSelected();
                int i4 = i;
                spinner.setSelection(zIsSelected ? spinner.getSelectedItemPosition() : i4);
                if (spinner instanceof ListenableSpinner) {
                    ((ListenableSpinner) spinner).b();
                }
                spinner.postDelayed(new vcb0(i4, i2, ucb0Var, outcomeButton2), 100L);
            }
        });
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(final int i, View view, ViewGroup viewGroup) {
        b bVar;
        viewGroup.getClass();
        if (i >= getCount()) {
            return new View(viewGroup.getContext());
        }
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.iwqk_outcome_spinner_item, viewGroup, false);
            view.getClass();
            bVar = new b(view);
            view.setTag(bVar);
        } else {
            Object tag = view.getTag();
            tag.getClass();
            bVar = (b) tag;
        }
        ColorStateList colorStateListB = o0b.b(getContext(), R.color.selector_color_outcome_spinner_item);
        view.setBackgroundResource(R.color.custom_background_type1_primary_type2);
        TextView textView = bVar.a;
        textView.setText(getItem(i));
        textView.setTextColor(colorStateListB);
        textView.setTypeface(null, this.a.getSelectedItemPosition() == i ? 1 : 0);
        textView.setOnClickListener(new View.OnClickListener() { // from class: scb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Spinner spinner = this.a.a;
                spinner.setSelection(i);
                if (spinner instanceof ListenableSpinner) {
                    ((ListenableSpinner) spinner).b();
                }
            }
        });
        d(bVar.b, i, 0);
        d(bVar.c, i, 1);
        d(bVar.d, i, 2);
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        viewGroup.getClass();
        if (i >= getCount()) {
            return new View(viewGroup.getContext());
        }
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.iwqk_spinner, viewGroup, false);
            view.getClass();
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            Object tag = view.getTag();
            tag.getClass();
            aVar = (a) tag;
        }
        TextView textView = aVar.a;
        textView.setText(getItem(i));
        mpe0 mpe0Var = this.d;
        textView.setTextColor(((Number) mpe0Var.getValue()).intValue());
        ImageView imageView = aVar.b;
        imageView.setImageResource(R.drawable.spr_ic_chevron_down);
        imageView.setImageTintList(ColorStateList.valueOf(((Number) mpe0Var.getValue()).intValue()));
        return view;
    }
}
