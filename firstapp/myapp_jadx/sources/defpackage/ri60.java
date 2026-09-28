package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.Metadata;
import com.sportygames.commons.models.enums.GiftUseType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ri60 extends RecyclerView.f<ij60> {
    public e a;
    public ArrayList b;
    public gaj<? super GiftItem, ? super Double, ? super Boolean, Unit> c;
    public yi60 d;
    public s5p e;
    public TextInputEditText f;
    public ytw<Boolean> i;
    public ytw<Boolean> v;
    public ytw<Boolean> w;

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, final int i) {
        int i2;
        final ij60 ij60Var = (ij60) d0Var;
        e eVar = this.a;
        ij60Var.getClass();
        TextInputEditText textInputEditText = ij60Var.i;
        ao80 ao80Var = ij60Var.b;
        textInputEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: qi60
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                ri60 ri60Var = this.a;
                if (!z) {
                    if (Intrinsics.g(ri60Var.f, view)) {
                        ri60Var.f = null;
                        return;
                    }
                    return;
                }
                view.getClass();
                TextInputEditText textInputEditText2 = (TextInputEditText) view;
                ri60Var.f = textInputEditText2;
                Object systemService = textInputEditText2.getContext().getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).hideSoftInputFromWindow(textInputEditText2.getWindowToken(), 0);
            }
        });
        ArrayList arrayList = this.b;
        if (((xi60.a) arrayList.get(i)).i) {
            xi60.a aVar = (xi60.a) arrayList.get(i);
            aVar.getClass();
            eVar.getClass();
            ij60Var.d = aVar;
            ij60Var.f = eVar;
            ConstraintLayout constraintLayout = ao80Var.A;
            TextView textView = ao80Var.y;
            TextView textView2 = ao80Var.J;
            MaterialButton materialButton = ao80Var.N;
            TextView textView3 = ao80Var.d;
            MaterialButton materialButton2 = ao80Var.M;
            AppCompatButton appCompatButton = ao80Var.F;
            MaterialButton materialButton3 = ao80Var.I;
            MaterialButton materialButton4 = ao80Var.b;
            TextView textView4 = ao80Var.c;
            AppCompatTextView appCompatTextView = ao80Var.z;
            TextView textView5 = ao80Var.H;
            TextView textView6 = ao80Var.E;
            TextInputEditText textInputEditText2 = ao80Var.w;
            constraintLayout.setVisibility(0);
            appCompatButton.setVisibility(4);
            ao80Var.B.setVisibility(0);
            AppCompatTextView appCompatTextView2 = ao80Var.G;
            xi60.a aVar2 = ij60Var.d;
            if (aVar2 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            appCompatTextView2.setText(aVar2.p);
            TextView textView7 = ao80Var.e;
            op5 op5Var = op5.a;
            xi60.a aVar3 = ij60Var.d;
            if (aVar3 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            String str = aVar3.b;
            op5Var.getClass();
            textView7.setText(op5.i(str));
            xi60.a aVar4 = ij60Var.d;
            if (aVar4 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            textView5.setText(aVar4.d);
            TextView textView8 = ao80Var.C;
            xi60.a aVar5 = ij60Var.d;
            if (aVar5 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            textView8.setText(aVar5.e.toString());
            xi60.a aVar6 = ij60Var.d;
            if (aVar6 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            appCompatTextView.setText(aVar6.f.toString());
            xi60.a aVar7 = ij60Var.d;
            if (aVar7 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            textView4.setText(aVar7.c);
            xi60.a aVar8 = ij60Var.d;
            if (aVar8 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            textInputEditText2.setHint(aVar8.k);
            textInputEditText2.clearFocus();
            textInputEditText2.setEnabled(false);
            if (Build.VERSION.SDK_INT <= 25) {
                appCompatTextView.setTextSize(20.0f);
            }
            materialButton4.setEnabled(false);
            textView3.setAlpha(0.5f);
            textView4.setAlpha(0.5f);
            materialButton2.setEnabled(false);
            if (ij60Var.f != null) {
                materialButton2.setBackgroundColor(ij60Var.getContext().getColor(R.color.fbg_use_type_tint_color_unselected_v2));
                kbv.a(materialButton2, R.color.fbg_use_type_tint_color_unselected_v3);
                materialButton2.setTextColor(ij60Var.getContext().getColor(R.color.fbg_coupon_text5_color_v2));
                kbv.a(materialButton4, R.color.fbg_use_type_tint_color_unselected_v2);
            }
            materialButton3.setEnabled(false);
            textView2.setAlpha(0.5f);
            textInputEditText2.setAlpha(0.5f);
            materialButton.setEnabled(false);
            if (ij60Var.f != null) {
                materialButton.setBackgroundColor(ij60Var.getContext().getColor(R.color.fbg_use_type_tint_color_unselected_v2));
                kbv.a(materialButton, R.color.fbg_use_type_tint_color_unselected_v3);
                materialButton.setTextColor(ij60Var.getContext().getColor(R.color.fbg_coupon_text5_color_v2));
                kbv.a(materialButton3, R.color.fbg_use_type_tint_color_unselected_v2);
            }
            if (ij60Var.f != null) {
                textView.setTextColor(ij60Var.getContext().getColor(R.color.color_B2B2B2));
                textView5.setTextColor(ij60Var.getContext().getColor(R.color.color_B2B2B2));
                ao80Var.D.setBackground(ij60Var.getContext().getDrawable(R.drawable.fbg_inactive));
            }
            xi60.a aVar9 = ij60Var.d;
            if (aVar9 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            Metadata metadata = aVar9.a.getMetadata();
            if (metadata != null) {
                String displayName = metadata.getDisplayName();
                if (displayName == null || displayName.length() == 0) {
                    i2 = 8;
                    textView6.setVisibility(8);
                } else {
                    textView6.setVisibility(0);
                    textView6.setText(metadata.getDisplayName());
                    i2 = 8;
                }
            } else {
                i2 = 8;
                textView6.setVisibility(8);
            }
            TextView textView9 = ao80Var.K;
            TextView textView10 = ao80Var.L;
            TextView[] textViewArr = new TextView[i2];
            textViewArr[0] = textView;
            textViewArr[1] = textView9;
            textViewArr[2] = appCompatButton;
            textViewArr[3] = textView3;
            textViewArr[4] = textView2;
            textViewArr[5] = materialButton2;
            textViewArr[6] = materialButton;
            textViewArr[7] = textView10;
            op5.r(op5Var, b.f(textViewArr), null, 4);
            return;
        }
        int i3 = 2;
        xi60.a aVar10 = (xi60.a) arrayList.get(i);
        boolean zBooleanValue = ((Boolean) ((x5a0) this.i).getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) ((x5a0) this.v).getValue()).booleanValue();
        boolean zBooleanValue3 = ((Boolean) ((x5a0) this.w).getValue()).booleanValue();
        aVar10.getClass();
        eVar.getClass();
        ij60Var.d = aVar10;
        ij60Var.f = eVar;
        Activity activity = ij60Var.a;
        op5 op5Var2 = op5.a;
        String str2 = aVar10.b;
        op5Var2.getClass();
        ij60Var.e = new kop(activity, op5.i(str2), aVar10.j, aVar10.m, new zi60(ij60Var), new bj60(ij60Var), new cj60(ij60Var, eVar, 0), new dj60(ij60Var));
        if (zBooleanValue) {
            AppCompatTextView appCompatTextView3 = ao80Var.f;
            appCompatTextView3.setTag(eVar.getString(R.string.error_text_exceed));
            HashMap map = new HashMap();
            xi60.a aVar11 = ij60Var.d;
            if (aVar11 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            map.put("{currency}", op5.i(aVar11.b));
            TreeMap treeMap = pw.a;
            xi60.a aVar12 = ij60Var.d;
            if (aVar12 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            map.put("{amount}", pw.d(aVar12.j));
            Resources resources = appCompatTextView3.getResources();
            xi60.a aVar13 = ij60Var.d;
            if (aVar13 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            appCompatTextView3.setText(resources.getString(R.string.fbg_gift_error_partial_text, aVar13.b, pw.d(aVar13.j)));
            op5.r(op5Var2, b.f(appCompatTextView3), map, 4);
            ij60Var.a();
        }
        if (zBooleanValue2) {
            AppCompatTextView appCompatTextView4 = ao80Var.f;
            appCompatTextView4.setTag("error_text_very_low_bet:sg_fbg_dialog");
            HashMap map2 = new HashMap();
            xi60.a aVar14 = ij60Var.d;
            if (aVar14 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            map2.put("{currency}", op5.i(aVar14.b));
            TreeMap treeMap2 = pw.a;
            xi60.a aVar15 = ij60Var.d;
            if (aVar15 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            map2.put("{amount}", pw.d(aVar15.m));
            Resources resources2 = appCompatTextView4.getResources();
            xi60.a aVar16 = ij60Var.d;
            if (aVar16 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            String strI = op5.i(aVar16.b);
            xi60.a aVar17 = ij60Var.d;
            if (aVar17 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            appCompatTextView4.setText(resources2.getString(R.string.fbg_gift_error_partial_text_min_value, strI, pw.d(aVar17.m)));
            op5.r(op5Var2, b.f(appCompatTextView4), map2, 4);
            ij60Var.a();
        }
        if (zBooleanValue3) {
            ij60Var.b();
            ao80Var.f.setText("");
        }
        ConstraintLayout constraintLayout2 = ao80Var.A;
        MaterialButton materialButton5 = ao80Var.N;
        MaterialButton materialButton6 = ao80Var.M;
        TextView textView11 = ao80Var.d;
        AppCompatButton appCompatButton2 = ao80Var.F;
        MaterialButton materialButton7 = ao80Var.I;
        MaterialButton materialButton8 = ao80Var.b;
        TextInputEditText textInputEditText3 = ao80Var.w;
        TextView textView12 = ao80Var.c;
        AppCompatTextView appCompatTextView5 = ao80Var.z;
        TextView textView13 = ao80Var.E;
        constraintLayout2.setVisibility(0);
        appCompatButton2.setVisibility(4);
        ao80Var.B.setVisibility(4);
        AppCompatTextView appCompatTextView6 = ao80Var.G;
        xi60.a aVar18 = ij60Var.d;
        if (aVar18 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        appCompatTextView6.setText(aVar18.p);
        TextView textView14 = ao80Var.e;
        xi60.a aVar19 = ij60Var.d;
        if (aVar19 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        textView14.setText(op5.i(aVar19.b));
        TextView textView15 = ao80Var.H;
        xi60.a aVar20 = ij60Var.d;
        if (aVar20 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        textView15.setText(aVar20.d);
        TextView textView16 = ao80Var.C;
        xi60.a aVar21 = ij60Var.d;
        if (aVar21 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        textView16.setText(aVar21.e.toString());
        xi60.a aVar22 = ij60Var.d;
        if (aVar22 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        appCompatTextView5.setText(aVar22.f.toString());
        xi60.a aVar23 = ij60Var.d;
        if (aVar23 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        textView12.setText(aVar23.c);
        xi60.a aVar24 = ij60Var.d;
        if (aVar24 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        textInputEditText3.setHint(aVar24.k);
        textInputEditText3.clearFocus();
        textInputEditText3.setText((CharSequence) null);
        if (Build.VERSION.SDK_INT <= 25) {
            appCompatTextView5.setTextSize(20.0f);
        }
        xi60.a aVar25 = ij60Var.d;
        if (aVar25 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        if (aVar25.h) {
            materialButton8.setAlpha(0.5f);
            materialButton8.setEnabled(false);
            textView11.setAlpha(0.5f);
            textView12.setAlpha(0.5f);
            ij60Var.i(GiftUseType.PARTIAL);
            kop kopVar = ij60Var.e;
            if (kopVar == null) {
                Intrinsics.n("keyboardUtility");
                throw null;
            }
            nsj nsjVar = new nsj(ij60Var, i3);
            textInputEditText3.addTextChangedListener(kopVar.e);
            textInputEditText3.setOnEditorActionListener(new iop(nsjVar, textInputEditText3));
        } else {
            ao80Var.b.setAlpha(1.0f);
            ao80Var.b.setEnabled(true);
            ao80Var.d.setAlpha(1.0f);
            ao80Var.c.setAlpha(1.0f);
            ij60Var.i(GiftUseType.FULL);
        }
        ij60Var.a();
        xi60.a aVar26 = ij60Var.d;
        if (aVar26 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        textInputEditText3.setText(aVar26.n);
        Object tag = textInputEditText3.getTag();
        textInputEditText3.removeTextChangedListener(tag instanceof TextWatcher ? (TextWatcher) tag : null);
        jj60 jj60Var = new jj60(ij60Var);
        textInputEditText3.addTextChangedListener(jj60Var);
        textInputEditText3.setTag(jj60Var);
        xi60.a aVar27 = ij60Var.d;
        if (aVar27 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        textInputEditText3.setText(aVar27.n);
        xi60.a aVar28 = ij60Var.d;
        if (aVar28 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        Metadata metadata2 = aVar28.a.getMetadata();
        if (metadata2 != null) {
            String displayName2 = metadata2.getDisplayName();
            if (displayName2 == null || displayName2.length() == 0) {
                textView13.setVisibility(8);
            } else {
                textView13.setVisibility(0);
                textView13.setText(metadata2.getDisplayName());
            }
        } else {
            textView13.setVisibility(8);
        }
        textInputEditText3.setFilters(new wsz[]{new wsz(String.valueOf((int) aVar10.j).length())});
        textInputEditText3.setOnKeyListener(new ej60());
        textInputEditText3.setOnClickListener(new fj60(ij60Var, 0));
        appCompatButton2.setOnClickListener(new gj60(ij60Var, 0));
        int i4 = 1;
        materialButton6.setOnClickListener(new q6p(ij60Var, i4));
        materialButton5.setOnClickListener(new hj60(ij60Var, 0));
        materialButton7.setOnClickListener(new x820(ij60Var, i4));
        materialButton8.setOnClickListener(new View.OnClickListener() { // from class: aj60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ij60 ij60Var2 = ij60Var;
                xi60.a aVar29 = ij60Var2.d;
                ao80 ao80Var2 = ij60Var2.b;
                if (aVar29 == null) {
                    Intrinsics.n("dataItem");
                    throw null;
                }
                aVar29.o = 0;
                ao80Var2.f.setText("");
                if (ao80Var2.w.isEnabled()) {
                    ij60Var2.c();
                }
                ij60Var2.i(GiftUseType.FULL);
            }
        });
        xi60.a aVar29 = ij60Var.d;
        if (aVar29 == null) {
            Intrinsics.n("dataItem");
            throw null;
        }
        if (aVar29.o == 0) {
            materialButton8.performClick();
            materialButton8.setChecked(true);
            materialButton7.setChecked(false);
            ij60Var.i(GiftUseType.FULL);
            ij60Var.a();
            ao80Var.b.setAlpha(1.0f);
            ao80Var.b.setEnabled(true);
            ao80Var.d.setAlpha(1.0f);
            ao80Var.c.setAlpha(1.0f);
        } else {
            materialButton8.setChecked(false);
            materialButton7.setChecked(true);
            materialButton7.performClick();
            xi60.a aVar30 = ij60Var.d;
            if (aVar30 == null) {
                Intrinsics.n("dataItem");
                throw null;
            }
            String str3 = aVar30.n;
            StringBuilder sb = new StringBuilder();
            int length = str3.length();
            for (int i5 = 0; i5 < length; i5++) {
                char cCharAt = str3.charAt(i5);
                if (Character.isDigit(cCharAt) || cCharAt == '.') {
                    sb.append(cCharAt);
                }
            }
            String string = sb.toString();
            try {
                if (string.length() != 0) {
                    double d = Double.parseDouble(string);
                    xi60.a aVar31 = ij60Var.d;
                    if (aVar31 == null) {
                        Intrinsics.n("dataItem");
                        throw null;
                    }
                    if (d >= aVar31.m) {
                        double d2 = Double.parseDouble(string);
                        xi60.a aVar32 = ij60Var.d;
                        if (aVar32 == null) {
                            Intrinsics.n("dataItem");
                            throw null;
                        }
                        if (d2 <= aVar32.j) {
                            ij60Var.i(GiftUseType.PARTIAL);
                        }
                    }
                }
                ij60Var.a();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        textInputEditText3.clearFocus();
        op5.r(op5.a, b.f(ao80Var.y, ao80Var.K, appCompatButton2, textView11, ao80Var.J, materialButton6, materialButton5), null, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = ij60.v;
        e eVar = this.a;
        wi6 wi6Var = new wi6(1);
        gaj<? super GiftItem, ? super Double, ? super Boolean, Unit> gajVar = this.c;
        yi60 yi60Var = this.d;
        s5p s5pVar = this.e;
        eVar.getClass();
        gajVar.getClass();
        yi60Var.getClass();
        s5pVar.getClass();
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sg_fbg_gift_item_v2, viewGroup, false);
        int i3 = R.id.all_type;
        MaterialButton materialButton = (MaterialButton) h5e.a(R.id.all_type, viewInflate);
        if (materialButton != null) {
            i3 = R.id.all_type_amount;
            TextView textView = (TextView) h5e.a(R.id.all_type_amount, viewInflate);
            if (textView != null) {
                i3 = R.id.all_type_selection;
                if (((ConstraintLayout) h5e.a(R.id.all_type_selection, viewInflate)) != null) {
                    i3 = R.id.all_type_text;
                    TextView textView2 = (TextView) h5e.a(R.id.all_type_text, viewInflate);
                    if (textView2 != null) {
                        i3 = R.id.clFbgDetail;
                        if (((ConstraintLayout) h5e.a(R.id.clFbgDetail, viewInflate)) != null) {
                            i3 = R.id.currency_code;
                            TextView textView3 = (TextView) h5e.a(R.id.currency_code, viewInflate);
                            if (textView3 != null) {
                                i3 = R.id.error_txt;
                                AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.error_txt, viewInflate);
                                if (appCompatTextView != null) {
                                    i3 = R.id.fbg_gift_item_divider;
                                    View viewA = h5e.a(R.id.fbg_gift_item_divider, viewInflate);
                                    if (viewA != null) {
                                        i3 = R.id.fbg_gift_item_divider_top;
                                        View viewA2 = h5e.a(R.id.fbg_gift_item_divider_top, viewInflate);
                                        if (viewA2 != null) {
                                            i3 = R.id.fbg_gift_item_partial_amount;
                                            TextInputEditText textInputEditText = (TextInputEditText) h5e.a(R.id.fbg_gift_item_partial_amount, viewInflate);
                                            if (textInputEditText != null) {
                                                i3 = R.id.fbg_text;
                                                TextView textView4 = (TextView) h5e.a(R.id.fbg_text, viewInflate);
                                                if (textView4 != null) {
                                                    i3 = R.id.gift_amount;
                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.gift_amount, viewInflate);
                                                    if (appCompatTextView2 != null) {
                                                        i3 = R.id.gift_amount_type_selection;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.gift_amount_type_selection, viewInflate);
                                                        if (constraintLayout != null) {
                                                            i3 = R.id.gift_bottom;
                                                            if (((ConstraintLayout) h5e.a(R.id.gift_bottom, viewInflate)) != null) {
                                                                i3 = R.id.gift_disabled;
                                                                CardView cardView = (CardView) h5e.a(R.id.gift_disabled, viewInflate);
                                                                if (cardView != null) {
                                                                    i3 = R.id.gift_expiry_txt;
                                                                    TextView textView5 = (TextView) h5e.a(R.id.gift_expiry_txt, viewInflate);
                                                                    if (textView5 != null) {
                                                                        i3 = R.id.gift_item_layout;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.gift_item_layout, viewInflate);
                                                                        if (constraintLayout2 != null) {
                                                                            i3 = R.id.gift_meta_name;
                                                                            TextView textView6 = (TextView) h5e.a(R.id.gift_meta_name, viewInflate);
                                                                            if (textView6 != null) {
                                                                                i3 = R.id.gift_use_button;
                                                                                AppCompatButton appCompatButton = (AppCompatButton) h5e.a(R.id.gift_use_button, viewInflate);
                                                                                if (appCompatButton != null) {
                                                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
                                                                                    i3 = R.id.off_or_left;
                                                                                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.off_or_left, viewInflate);
                                                                                    if (appCompatTextView3 != null) {
                                                                                        i3 = R.id.original_amount_txt;
                                                                                        TextView textView7 = (TextView) h5e.a(R.id.original_amount_txt, viewInflate);
                                                                                        if (textView7 != null) {
                                                                                            i3 = R.id.partial_type;
                                                                                            MaterialButton materialButton2 = (MaterialButton) h5e.a(R.id.partial_type, viewInflate);
                                                                                            if (materialButton2 != null) {
                                                                                                i3 = R.id.partial_type_selection;
                                                                                                if (((ConstraintLayout) h5e.a(R.id.partial_type_selection, viewInflate)) != null) {
                                                                                                    i3 = R.id.partial_type_text;
                                                                                                    TextView textView8 = (TextView) h5e.a(R.id.partial_type_text, viewInflate);
                                                                                                    if (textView8 != null) {
                                                                                                        i3 = R.id.stake_text;
                                                                                                        TextView textView9 = (TextView) h5e.a(R.id.stake_text, viewInflate);
                                                                                                        if (textView9 != null) {
                                                                                                            i3 = R.id.tv_disabled_text;
                                                                                                            TextView textView10 = (TextView) h5e.a(R.id.tv_disabled_text, viewInflate);
                                                                                                            if (textView10 != null) {
                                                                                                                i3 = R.id.use_button_all;
                                                                                                                MaterialButton materialButton3 = (MaterialButton) h5e.a(R.id.use_button_all, viewInflate);
                                                                                                                if (materialButton3 != null) {
                                                                                                                    i3 = R.id.use_button_partial;
                                                                                                                    MaterialButton materialButton4 = (MaterialButton) h5e.a(R.id.use_button_partial, viewInflate);
                                                                                                                    if (materialButton4 != null) {
                                                                                                                        return new ij60(eVar, new ao80(linearLayoutCompat, materialButton, textView, textView2, textView3, appCompatTextView, viewA, viewA2, textInputEditText, textView4, appCompatTextView2, constraintLayout, cardView, textView5, constraintLayout2, textView6, appCompatButton, appCompatTextView3, textView7, materialButton2, textView8, textView9, textView10, materialButton3, materialButton4), wi6Var, gajVar, yi60Var, s5pVar);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return i;
    }
}
