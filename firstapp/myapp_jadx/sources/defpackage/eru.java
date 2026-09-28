package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class eru extends ArrayAdapter<String> implements ListenableSpinner.a {
    public final Spinner a;
    public final boolean b;

    public eru(Spinner spinner, ArrayList arrayList, boolean z) {
        super(spinner.getContext(), R.layout.spr_spinner_title, R.id.spinner_text, arrayList);
        setDropDownViewResource(R.layout.spr_spinner_item);
        this.b = z;
        this.a = spinner;
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

    public final String d(int i) {
        String item = getItem(i);
        if (TextUtils.equals(item, "near_odds")) {
            item = sn5.b(getContext(), R.string.common_functions__near_odds, new Object[0]);
        }
        return TextUtils.equals(item, "far_odds") ? sn5.b(getContext(), R.string.common_functions__far_odds, new Object[0]) : item;
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        boolean z = this.b;
        dropDownView.setBackgroundResource(z ? R.color.background_disable_type2_primary : R.color.custom_background_type1_primary_type2);
        ColorStateList colorStateListB = o0b.b(getContext(), z ? R.color.selector_color_specifier_spinner_item_live : R.color.selector_color_specifier_spinner_item);
        TextView textView = (TextView) dropDownView.findViewById(R.id.spinner_text);
        textView.setTextColor(colorStateListB);
        textView.setText(d(i));
        textView.setTypeface(Typeface.defaultFromStyle(this.a.getSelectedItemPosition() == i ? 1 : 0));
        return dropDownView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        Resources resources = getContext().getResources();
        boolean z = this.b;
        int color = resources.getColor(z ? R.color.text_type2_primary : R.color.text_type1_primary);
        TextView textView = (TextView) view2.findViewById(R.id.spinner_text);
        textView.setText(d(i));
        ImageView imageView = (ImageView) view2.findViewById(R.id.spinner_arrow);
        Spinner spinner = this.a;
        imageView.setImageResource(spinner instanceof ListenableSpinner ? ((ListenableSpinner) spinner).z : false ? R.drawable.spr_ic_chevron_up : R.drawable.spr_ic_chevron_down);
        imageView.setImageTintList(ColorStateList.valueOf(color));
        if (getCount() > 1) {
            view2.setBackgroundResource(z ? R.drawable.bg_spinner_title_live : R.drawable.bg_spinner_title);
            textView.setTextColor(color);
            imageView.setVisibility(0);
            spinner.setEnabled(true);
            return view2;
        }
        view2.setBackground(null);
        textView.setTextColor(getContext().getResources().getColor(R.color.text_type2_tertiary));
        imageView.setVisibility(8);
        spinner.setEnabled(false);
        return view2;
    }
}
