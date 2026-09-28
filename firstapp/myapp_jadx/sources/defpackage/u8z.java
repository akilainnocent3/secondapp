package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class u8z extends ArrayAdapter<String> implements ListenableSpinner.a {
    public final Spinner a;
    public final View b;
    public final boolean c;
    public Event d;
    public List<? extends Market> e;
    public a f;

    public interface a {
        default boolean a(Outcome outcome) {
            return false;
        }

        void b(OutcomeButton outcomeButton);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8z(Spinner spinner, View view, ArrayList arrayList, boolean z) {
        super(spinner.getContext(), R.layout.spr_outcome_spinner_title, R.id.spinner_text, arrayList);
        spinner.getClass();
        this.a = spinner;
        this.b = view;
        this.c = z;
        this.d = new Event();
        this.e = m2g.a;
        setDropDownViewResource(R.layout.spr_outcome_spinner_item);
        spinner.setDropDownWidth(zch0.a(spinner.getContext(), 205));
        spinner.setDropDownHorizontalOffset(zch0.a(spinner.getContext(), -4));
        spinner.setDropDownVerticalOffset(zch0.a(spinner.getContext(), 38));
        if (spinner instanceof ListenableSpinner) {
            ((ListenableSpinner) spinner).setSpinnerEventsListener(this);
        }
    }

    @Override // com.sportybet.plugin.realsports.widget.ListenableSpinner.a
    public final void b(ListenableSpinner listenableSpinner) {
        notifyDataSetChanged();
    }

    @Override // com.sportybet.plugin.realsports.widget.ListenableSpinner.a
    public final void c(ListenableSpinner listenableSpinner) {
        notifyDataSetChanged();
    }

    public final void d(final OutcomeButton outcomeButton, final int i, int i2) {
        Market market = this.e.get(i);
        if (i2 >= market.outcomes.size()) {
            outcomeButton.setVisibility(8);
            return;
        }
        outcomeButton.setVisibility(0);
        boolean z = this.c;
        outcomeButton.setBackgroundResource(z ? R.drawable.bg_filled_background_type2_secondary_with_brand_secondary : R.drawable.bg_filled_brand_secondary_variable_type1_with_brand_secondary);
        outcomeButton.setTextColor(o0b.b(outcomeButton.getContext(), z ? R.color.text_color_custom_brand_secondary_variable_type3_type2_with_text_type2_primary : R.color.text_color_custom_brand_secondary_variable_type2_type3_with_brand_tertiary));
        outcomeButton.G = true;
        if (market.status != 0) {
            outcomeButton.setText(zch0.h(outcomeButton.getContext()));
            outcomeButton.setEnabled(false);
            return;
        }
        Outcome outcome = market.outcomes.get(i2);
        boolean z2 = outcome.isActive == 1;
        outcomeButton.setEnabled(z2);
        if (z2) {
            String str = outcome.odds;
            str.getClass();
            outcomeButton.setOdds(str);
            a aVar = this.f;
            outcomeButton.setForceActivated(aVar != null ? aVar.a(outcome) : false);
        } else {
            outcomeButton.setTextOnAndOff(zch0.h(outcomeButton.getContext()));
        }
        int i3 = outcome.flag;
        if (i3 == 1) {
            outcomeButton.g();
            outcome.flag = 0;
        } else if (i3 == 2) {
            outcomeButton.c();
            outcome.flag = 0;
        }
        outcomeButton.setTag(new Selection(this.d, market, outcome));
        outcomeButton.setChecked(iu2.n(this.d, market, outcome));
        outcomeButton.setOnClickListener(new View.OnClickListener() { // from class: t8z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                u8z u8zVar = this.a;
                Spinner spinner = u8zVar.a;
                OutcomeButton outcomeButton2 = outcomeButton;
                spinner.setSelection(outcomeButton2.isChecked() ? i : spinner.getSelectedItemPosition());
                if (spinner instanceof ListenableSpinner) {
                    ((ListenableSpinner) spinner).b();
                }
                spinner.postDelayed(new v8z(u8zVar, outcomeButton2, outcomeButton2.isChecked()), 100L);
            }
        });
    }

    public final boolean e() {
        Spinner spinner = this.a;
        if (spinner instanceof ListenableSpinner) {
            return ((ListenableSpinner) spinner).z;
        }
        return false;
    }

    public final void f(Event event, List<? extends Market> list) {
        event.getClass();
        list.getClass();
        this.d = event;
        this.e = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(final int i, View view, ViewGroup viewGroup) {
        viewGroup.getClass();
        if (i >= getCount()) {
            return new View(viewGroup.getContext());
        }
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        Context context = getContext();
        boolean z = this.c;
        ColorStateList colorStateListB = o0b.b(context, z ? R.color.selector_color_outcome_spinner_item_live : R.color.selector_color_outcome_spinner_item);
        dropDownView.setBackgroundResource(z ? R.color.background_disable_type1_primary : R.color.custom_background_type1_primary_type2);
        TextView textView = (TextView) dropDownView.findViewById(R.id.spinner_text);
        textView.setTextColor(colorStateListB);
        textView.setTypeface(Typeface.defaultFromStyle(this.a.getSelectedItemPosition() == i ? 1 : 0));
        textView.setOnClickListener(new View.OnClickListener() { // from class: s8z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Spinner spinner = this.a.a;
                spinner.setSelection(i);
                if (spinner instanceof ListenableSpinner) {
                    ((ListenableSpinner) spinner).b();
                }
            }
        });
        OutcomeButton outcomeButton = (OutcomeButton) dropDownView.findViewById(R.id.spinner_outcome1);
        outcomeButton.getClass();
        d(outcomeButton, i, 0);
        OutcomeButton outcomeButton2 = (OutcomeButton) dropDownView.findViewById(R.id.spinner_outcome2);
        outcomeButton2.getClass();
        d(outcomeButton2, i, 1);
        OutcomeButton outcomeButton3 = (OutcomeButton) dropDownView.findViewById(R.id.spinner_outcome3);
        outcomeButton3.getClass();
        d(outcomeButton3, i, 2);
        return dropDownView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        viewGroup.getClass();
        if (i >= getCount()) {
            return new View(viewGroup.getContext());
        }
        View view2 = super.getView(i, view, viewGroup);
        view2.getClass();
        Context context = getContext();
        boolean z = this.c;
        int color = context.getColor(z ? R.color.custom_brand_secondary_variable_type3_type2 : R.color.brand_secondary_variable_type2);
        int i3 = R.drawable.bg_filled_custom_brand_secondary_variable_type1_opacity_type1_with_brand_quinary;
        if (z && e()) {
            i2 = R.drawable.bg_filled_background_type2_secondary_with_brand_secondary;
        } else {
            i2 = (!z || e()) ? R.drawable.bg_outcome_spinner_title : R.drawable.bg_filled_custom_brand_secondary_variable_type1_opacity_type1_with_brand_quinary;
        }
        view2.setBackgroundResource(i2);
        ((TextView) view2.findViewById(R.id.spinner_text)).setTextColor(color);
        ImageView imageView = (ImageView) view2.findViewById(R.id.spinner_arrow);
        imageView.setImageResource(e() ? R.drawable.spr_ic_chevron_up : R.drawable.spr_ic_chevron_down);
        imageView.setImageTintList(ColorStateList.valueOf(color));
        ViewParent parent = this.a.getParent();
        parent.getClass();
        ViewGroup viewGroup2 = (ViewGroup) parent;
        if (z) {
            List listK = b.k(Integer.valueOf(R.id.o1), Integer.valueOf(R.id.o2), Integer.valueOf(R.id.o3), Integer.valueOf(R.id.o4));
            if (e()) {
                i3 = R.drawable.bg_filled_background_type2_secondary_with_brand_secondary;
            }
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                OutcomeButton outcomeButton = (OutcomeButton) viewGroup2.findViewById(((Number) it.next()).intValue());
                if (outcomeButton != null) {
                    outcomeButton.setBackgroundResource(i3);
                }
            }
        }
        View view3 = this.b;
        if (view3 != null) {
            view3.setVisibility(e() ? 0 : 8);
        }
        return view2;
    }
}
