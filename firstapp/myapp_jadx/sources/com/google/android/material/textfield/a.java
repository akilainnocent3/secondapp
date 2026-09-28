package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.sportybet.android.gp.tz.R;
import defpackage.d6n;
import defpackage.dr7;
import defpackage.eai0;
import defpackage.ecv;
import defpackage.f6g;
import defpackage.fyf0;
import defpackage.gr0;
import defpackage.gvx;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.jff;
import defpackage.pdc;
import defpackage.swz;
import defpackage.tmf0;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends LinearLayout {
    public PorterDuff.Mode A;
    public int B;
    public ImageView.ScaleType C;
    public View.OnLongClickListener D;
    public CharSequence E;
    public final AppCompatTextView F;
    public boolean G;
    public EditText H;
    public final AccessibilityManager I;
    public AccessibilityManager.TouchExplorationStateChangeListener J;
    public final C0197a K;
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public View.OnLongClickListener f;
    public final CheckableImageButton i;
    public final d v;
    public int w;
    public final LinkedHashSet<TextInputLayout.h> y;
    public ColorStateList z;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0197a extends tmf0 {
        public C0197a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            a.this.b().a();
        }

        @Override // defpackage.tmf0, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            a.this.b().b();
        }
    }

    public class b implements TextInputLayout.g {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public final void a(TextInputLayout textInputLayout) {
            a aVar = a.this;
            C0197a c0197a = aVar.K;
            if (aVar.H == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = aVar.H;
            if (editText != null) {
                editText.removeTextChangedListener(c0197a);
                if (aVar.H.getOnFocusChangeListener() == aVar.b().e()) {
                    aVar.H.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            aVar.H = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(c0197a);
            }
            aVar.b().l(aVar.H);
            aVar.j(aVar.b());
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            a aVar = a.this;
            AccessibilityManager accessibilityManager = aVar.I;
            if (aVar.J == null || accessibilityManager == null || !aVar.isAttachedToWindow()) {
                return;
            }
            accessibilityManager.addTouchExplorationStateChangeListener(aVar.J);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            a aVar = a.this;
            AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = aVar.J;
            if (touchExplorationStateChangeListener == null || (accessibilityManager = aVar.I) == null) {
                return;
            }
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
    }

    public static class d {
        public final SparseArray<f6g> a = new SparseArray<>();
        public final a b;
        public final int c;
        public final int d;

        public d(a aVar, fyf0 fyf0Var) {
            this.b = aVar;
            TypedArray typedArray = fyf0Var.b;
            this.c = typedArray.getResourceId(28, 0);
            this.d = typedArray.getResourceId(53, 0);
        }
    }

    public a(TextInputLayout textInputLayout, fyf0 fyf0Var) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.w = 0;
        this.y = new LinkedHashSet<>();
        this.K = new C0197a();
        b bVar = new b();
        this.I = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(layoutInflaterFrom, this, R.id.text_input_error_icon);
        this.c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(layoutInflaterFrom, frameLayout, R.id.text_input_end_icon);
        this.i = checkableImageButtonA2;
        this.v = new d(this, fyf0Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.F = appCompatTextView;
        TypedArray typedArray = fyf0Var.b;
        if (typedArray.hasValue(38)) {
            this.d = ecv.b(getContext(), fyf0Var, 38);
        }
        if (typedArray.hasValue(39)) {
            this.e = eai0.f(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(fyf0Var.b(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.z = ecv.b(getContext(), fyf0Var, 32);
            }
            if (typedArray.hasValue(33)) {
                this.A = eai0.f(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.z = ecv.b(getContext(), fyf0Var, 55);
            }
            if (typedArray.hasValue(56)) {
                this.A = eai0.f(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            hb5.a("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.B) {
            this.B = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeB = d6n.b(typedArray.getInt(31, -1));
            this.C = scaleTypeB;
            checkableImageButtonA2.setScaleType(scaleTypeB);
            checkableImageButtonA.setScaleType(scaleTypeB);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            appCompatTextView.setTextColor(fyf0Var.a(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.E = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.u0.add(bVar);
        if (textInputLayout.e != null) {
            bVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new c());
    }

    public final CheckableImageButton a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (ecv.f(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final f6g b() {
        f6g pdcVar;
        int i = this.w;
        d dVar = this.v;
        SparseArray<f6g> sparseArray = dVar.a;
        f6g f6gVar = sparseArray.get(i);
        if (f6gVar != null) {
            return f6gVar;
        }
        a aVar = dVar.b;
        if (i == -1) {
            pdcVar = new pdc(aVar);
        } else if (i == 0) {
            pdcVar = new gvx(aVar);
        } else if (i == 1) {
            pdcVar = new swz(aVar, dVar.d);
        } else if (i == 2) {
            pdcVar = new dr7(aVar);
        } else {
            if (i != 3) {
                hb5.a(hce0.a(i, "Invalid end icon mode: "));
                return null;
            }
            pdcVar = new jff(aVar);
        }
        sparseArray.append(i, pdcVar);
        return pdcVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.i;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.F.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.b.getVisibility() == 0 && this.i.getVisibility() == 0;
    }

    public final boolean e() {
        return this.c.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        f6g f6gVarB = b();
        boolean zJ = f6gVarB.j();
        CheckableImageButton checkableImageButton = this.i;
        boolean z4 = true;
        if (!zJ || (z3 = checkableImageButton.d) == f6gVarB.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(f6gVarB instanceof jff) || (zIsActivated = checkableImageButton.isActivated()) == ((jff) f6gVarB).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            d6n.c(this.a, checkableImageButton, this.z);
        }
    }

    public final void g(int i) {
        if (this.w == i) {
            return;
        }
        f6g f6gVarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.J;
        AccessibilityManager accessibilityManager = this.I;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.J = null;
        f6gVarB.r();
        this.w = i;
        Iterator<TextInputLayout.h> it = this.y.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        h(i != 0);
        f6g f6gVarB2 = b();
        int iD = this.v.c;
        if (iD == 0) {
            iD = f6gVarB2.d();
        }
        Drawable drawableA = iD != 0 ? gr0.a(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.i;
        checkableImageButton.setImageDrawable(drawableA);
        TextInputLayout textInputLayout = this.a;
        if (drawableA != null) {
            d6n.a(textInputLayout, checkableImageButton, this.z, this.A);
            d6n.c(textInputLayout, checkableImageButton, this.z);
        }
        int iC = f6gVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(f6gVarB2.j());
        if (!f6gVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        f6gVarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = f6gVarB2.h();
        this.J = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.J);
        }
        View.OnClickListener onClickListenerF = f6gVarB2.f();
        View.OnLongClickListener onLongClickListener = this.D;
        checkableImageButton.setOnClickListener(onClickListenerF);
        d6n.d(checkableImageButton, onLongClickListener);
        EditText editText = this.H;
        if (editText != null) {
            f6gVarB2.l(editText);
            j(f6gVarB2);
        }
        d6n.a(textInputLayout, checkableImageButton, this.z, this.A);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.i.setVisibility(z ? 0 : 8);
            k();
            m();
            this.a.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        d6n.a(this.a, checkableImageButton, this.d, this.e);
    }

    public final void j(f6g f6gVar) {
        if (this.H == null) {
            return;
        }
        if (f6gVar.e() != null) {
            this.H.setOnFocusChangeListener(f6gVar.e());
        }
        if (f6gVar.g() != null) {
            this.i.setOnFocusChangeListener(f6gVar.g());
        }
    }

    public final void k() {
        this.b.setVisibility((this.i.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.E == null || this.G) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.z.q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.w != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.e == null) {
            return;
        }
        this.F.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.e.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.e.getPaddingEnd(), textInputLayout.e.getPaddingBottom());
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.F;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.E == null || this.G) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.a.s();
    }
}
