package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.SpecificCountryMobileEditText;
import com.sportybet.android.gp.tz.R;
import defpackage.bmy;
import defpackage.c0d;
import defpackage.ebs;
import defpackage.gaj;
import defpackage.h5e;
import defpackage.ibs;
import defpackage.itf0;
import defpackage.kzh;
import defpackage.ll5;
import defpackage.n1i;
import defpackage.rk30;
import defpackage.s9s;
import defpackage.sn5;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.uwd0;
import defpackage.v1b;
import defpackage.wwd0;
import defpackage.xwd0;
import defpackage.y5b;
import defpackage.y6j0;
import defpackage.zyh;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u0011R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\u001e8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R(\u0010+\u001a\u0004\u0018\u00010\u00162\b\u0010'\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0019¨\u0006,"}, d2 = {"Lcom/sporty/android/common_ui/widgets/SpecificCountryMobileEditText;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "enabled", "", "setEnabled", "(Z)V", "index", "setSelection", "(I)V", "", "callingCode", "setCallingCode", "(Ljava/lang/String;)V", "", "errorText", "setErrorText", "(Ljava/lang/CharSequence;)V", "hintText", "setHintText", "maxLength", "setMaxLength", "Luwd0;", "H", "Luwd0;", "getFocusedStateFlow", "()Luwd0;", "focusedStateFlow", "J", "getTextStateFlow", "textStateFlow", "value", "getText", "()Ljava/lang/CharSequence;", "setText", "text", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SpecificCountryMobileEditText extends ConstraintLayout {
    public final y6j0 F;
    public final wwd0 G;
    public final wwd0 H;
    public final wwd0 I;
    public final wwd0 J;
    public final wwd0 K;
    public final wwd0 L;

    @c0d(c = "com.sporty.android.common_ui.widgets.SpecificCountryMobileEditText$4$1$1", f = "SpecificCountryMobileEditText.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<Boolean, String, v1b<? super Unit>, Object> {
        public /* synthetic */ boolean a;
        public /* synthetic */ String b;

        public a(v1b<? super a> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(Boolean bool, String str, v1b<? super Unit> v1bVar) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = SpecificCountryMobileEditText.this.new a(v1bVar);
            aVar.a = zBooleanValue;
            aVar.b = str;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            String str = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            itf0.a.a(z + " " + str, new Object[0]);
            SpecificCountryMobileEditText.this.F.c.setVisibility((!z || str.length() <= 0) ? 8 : 0);
            return Unit.a;
        }
    }

    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String string;
            wwd0 wwd0Var = SpecificCountryMobileEditText.this.I;
            if (charSequence == null || (string = charSequence.toString()) == null) {
                string = "";
            }
            wwd0Var.getClass();
            wwd0Var.k(null, string);
        }
    }

    public static final class c implements View.OnAttachStateChangeListener {
        public final /* synthetic */ SpecificCountryMobileEditText b;

        public c(SpecificCountryMobileEditText specificCountryMobileEditText) {
            this.b = specificCountryMobileEditText;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            s9s lifecycle;
            SpecificCountryMobileEditText.this.removeOnAttachStateChangeListener(this);
            SpecificCountryMobileEditText specificCountryMobileEditText = this.b;
            ibs ibsVarB = ll5.b(specificCountryMobileEditText);
            if (ibsVarB == null || (lifecycle = ibsVarB.getLifecycle()) == null) {
                return;
            }
            kzh.d(zyh.a(new n1i(specificCountryMobileEditText.getFocusedStateFlow(), specificCountryMobileEditText.getTextStateFlow(), specificCountryMobileEditText.new a(null)), lifecycle, s9s.b.d), ebs.a(lifecycle));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpecificCountryMobileEditText(Context context, AttributeSet attributeSet, int i) {
        s9s lifecycle;
        super(context, attributeSet, i);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.widget_specific_country_mobile_edit_text, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.calling_code_text_view;
        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.calling_code_text_view, viewInflate);
        if (appCompatTextView != null) {
            i2 = R.id.clear_btn;
            FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.clear_btn, viewInflate);
            if (frameLayout != null) {
                i2 = R.id.edit_text;
                AppCompatEditText appCompatEditText = (AppCompatEditText) h5e.a(R.id.edit_text, viewInflate);
                if (appCompatEditText != null) {
                    i2 = R.id.edit_text_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.edit_text_container, viewInflate);
                    if (constraintLayout != null) {
                        i2 = R.id.error_text_view;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.error_text_view, viewInflate);
                        if (appCompatTextView2 != null) {
                            i2 = R.id.hint_text_view;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.hint_text_view, viewInflate);
                            if (appCompatTextView3 != null) {
                                i2 = R.id.icon_start_image_view;
                                if (((AppCompatImageView) h5e.a(R.id.icon_start_image_view, viewInflate)) != null) {
                                    this.F = new y6j0((ConstraintLayout) viewInflate, appCompatTextView, frameLayout, appCompatEditText, constraintLayout, appCompatTextView2, appCompatTextView3);
                                    wwd0 wwd0VarA = xwd0.a(Boolean.FALSE);
                                    this.G = wwd0VarA;
                                    this.H = wwd0VarA;
                                    wwd0 wwd0VarA2 = xwd0.a("");
                                    this.I = wwd0VarA2;
                                    this.J = wwd0VarA2;
                                    this.K = xwd0.a(null);
                                    this.L = xwd0.a(null);
                                    TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, rk30.y, i, 0);
                                    try {
                                        typedArrayObtainStyledAttributes.getClass();
                                        appCompatEditText.setHint(sn5.a(0, context, typedArrayObtainStyledAttributes));
                                        typedArrayObtainStyledAttributes.recycle();
                                        appCompatEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: msa0
                                            @Override // android.view.View.OnFocusChangeListener
                                            public final void onFocusChange(View view, boolean z) {
                                                SpecificCountryMobileEditText specificCountryMobileEditText = this.a;
                                                osa0.a(z, specificCountryMobileEditText.G, null);
                                                Object value = specificCountryMobileEditText.K.getValue();
                                                y6j0 y6j0Var = specificCountryMobileEditText.F;
                                                if (value != null) {
                                                    y6j0Var.e.setBackgroundResource(R.drawable.bg_border_edit_text_error);
                                                } else {
                                                    y6j0Var.e.setBackgroundResource(z ? R.drawable.bg_border_edit_text_focused : R.drawable.bg_icon_text_selector_button_enabled);
                                                }
                                            }
                                        });
                                        appCompatEditText.addTextChangedListener(new b());
                                        if (isAttachedToWindow()) {
                                            ibs ibsVarB = ll5.b(this);
                                            if (ibsVarB != null && (lifecycle = ibsVarB.getLifecycle()) != null) {
                                                kzh.d(zyh.a(new n1i(getFocusedStateFlow(), getTextStateFlow(), new a(null)), lifecycle, s9s.b.d), ebs.a(lifecycle));
                                            }
                                        } else {
                                            addOnAttachStateChangeListener(new c(this));
                                        }
                                        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: nsa0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                this.a.F.d.setText("");
                                            }
                                        });
                                        return;
                                    } catch (Throwable th) {
                                        typedArrayObtainStyledAttributes.recycle();
                                        throw th;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final uwd0<Boolean> getFocusedStateFlow() {
        return this.H;
    }

    public final CharSequence getText() {
        return this.F.d.getText();
    }

    public final uwd0<String> getTextStateFlow() {
        return this.J;
    }

    public final void setCallingCode(String callingCode) {
        y6j0 y6j0Var = this.F;
        if (callingCode == null || StringsKt.U(callingCode)) {
            y6j0Var.b.setText("");
            y6j0Var.b.setVisibility(8);
        } else {
            y6j0Var.b.setText(callingCode);
            y6j0Var.b.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        y6j0 y6j0Var = this.F;
        ConstraintLayout constraintLayout = y6j0Var.e;
        AppCompatEditText appCompatEditText = y6j0Var.d;
        constraintLayout.setBackgroundResource(isEnabled() ? R.drawable.bg_icon_text_selector_button_enabled : R.drawable.bg_icon_text_selector_button_disabled);
        Context context = getContext();
        boolean zIsEnabled = isEnabled();
        int i = R.color.text_disable_type1_primary;
        appCompatEditText.setTextColor(context.getColor(zIsEnabled ? R.color.text_type1_primary : R.color.text_disable_type1_primary));
        appCompatEditText.setEnabled(enabled);
        AppCompatTextView appCompatTextView = y6j0Var.b;
        Context context2 = getContext();
        if (isEnabled()) {
            i = R.color.text_type1_primary;
        }
        appCompatTextView.setTextColor(context2.getColor(i));
    }

    public final void setErrorText(CharSequence errorText) {
        this.K.setValue(errorText);
        y6j0 y6j0Var = this.F;
        if (errorText == null) {
            y6j0Var.f.setText("");
            y6j0Var.f.setVisibility(8);
            y6j0Var.e.setBackgroundResource(((Boolean) this.H.getValue()).booleanValue() ? R.drawable.bg_border_edit_text_focused : R.drawable.bg_icon_text_selector_button_enabled);
        } else {
            y6j0Var.f.setText(errorText);
            y6j0Var.f.setVisibility(0);
            y6j0Var.e.setBackgroundResource(R.drawable.bg_border_edit_text_error);
        }
    }

    public final void setHintText(CharSequence hintText) {
        this.L.setValue(hintText);
        y6j0 y6j0Var = this.F;
        if (hintText == null) {
            y6j0Var.i.setText("");
            y6j0Var.i.setVisibility(8);
        } else {
            y6j0Var.i.setText(hintText);
            y6j0Var.i.setVisibility(0);
        }
        if (this.K.getValue() == null) {
            y6j0Var.e.setBackgroundResource(((Boolean) this.H.getValue()).booleanValue() ? R.drawable.bg_border_edit_text_focused : R.drawable.bg_icon_text_selector_button_enabled);
        }
    }

    public final void setMaxLength(int maxLength) {
        this.F.d.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(maxLength)});
    }

    public final void setSelection(int index) {
        this.F.d.setSelection(index);
    }

    public final void setText(CharSequence charSequence) {
        y6j0 y6j0Var = this.F;
        if (String.valueOf(y6j0Var.d.getText()).equals(String.valueOf(charSequence))) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        y6j0Var.d.setText(charSequence);
        setSelection(Math.max(0, charSequence.length() - 1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpecificCountryMobileEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpecificCountryMobileEditText(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ SpecificCountryMobileEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
