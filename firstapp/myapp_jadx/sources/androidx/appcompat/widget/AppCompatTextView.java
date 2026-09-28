package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.br0;
import defpackage.cr0;
import defpackage.cyf0;
import defpackage.eg1;
import defpackage.em20;
import defpackage.gai0;
import defpackage.gq0;
import defpackage.gr0;
import defpackage.hb5;
import defpackage.ir0;
import defpackage.j9h0;
import defpackage.jr0;
import defpackage.lr0;
import defpackage.nof0;
import defpackage.q9h0;
import defpackage.qmf0;
import defpackage.wvf;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements eg1 {
    public final gq0 a;
    public final jr0 b;
    public final ir0 c;
    public br0 d;
    public boolean e;
    public b f;
    public Future<em20> i;

    public interface a {
        void a(int i);

        void b(int i, float f);

        void c(int i);
    }

    public class b implements a {
        public b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int i) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void b(int i, float f) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void c(int i) {
        }
    }

    public class c extends b {
        public c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void a(int i) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void c(int i) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i);
        }
    }

    public class d extends c {
        public d() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public final void b(int i, float f) {
            AppCompatTextView.super.setLineHeight(i, f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        cyf0.a(context);
        this.e = false;
        this.f = null;
        nof0.a(this, getContext());
        gq0 gq0Var = new gq0(this);
        this.a = gq0Var;
        gq0Var.d(attributeSet, i);
        jr0 jr0Var = new jr0(this);
        this.b = jr0Var;
        jr0Var.f(attributeSet, i);
        jr0Var.b();
        ir0 ir0Var = new ir0();
        ir0Var.a = this;
        this.c = ir0Var;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private br0 getEmojiTextViewHelper() {
        br0 br0Var = this.d;
        if (br0Var != null) {
            return br0Var;
        }
        br0 br0Var2 = new br0(this);
        this.d = br0Var2;
        return br0Var2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.a();
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (gai0.c) {
            return super.getAutoSizeMaxTextSize();
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            return Math.round(jr0Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (gai0.c) {
            return super.getAutoSizeMinTextSize();
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            return Math.round(jr0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (gai0.c) {
            return super.getAutoSizeStepGranularity();
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            return Math.round(jr0Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (gai0.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        jr0 jr0Var = this.b;
        return jr0Var != null ? jr0Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (gai0.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            return jr0Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return qmf0.e(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public a getSuperCaller() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            d dVar = new d();
            this.f = dVar;
            return dVar;
        }
        if (i >= 28) {
            c cVar = new c();
            this.f = cVar;
            return cVar;
        }
        if (i < 26) {
            return bVar;
        }
        b bVar2 = new b();
        this.f = bVar2;
        return bVar2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            return gq0Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            return gq0Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<em20> future = this.i;
        if (future != null) {
            try {
                this.i = null;
                em20 em20Var = future.get();
                if (Build.VERSION.SDK_INT < 29) {
                    em20.a aVarA = qmf0.a(this);
                    em20Var.getClass();
                    aVarA.a(null);
                    throw null;
                }
                em20Var.getClass();
                setText((CharSequence) null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        ir0 ir0Var;
        if (Build.VERSION.SDK_INT >= 28 || (ir0Var = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = ir0Var.b;
        return textClassifier == null ? ir0.a.a(ir0Var.a) : textClassifier;
    }

    public em20.a getTextMetricsParamsCompat() {
        return qmf0.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        if (Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            wvf.c(editorInfo, getText());
        }
        cr0.d(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        jr0 jr0Var = this.b;
        if (jr0Var == null || gai0.c) {
            return;
        }
        jr0Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future<em20> future = this.i;
        if (future != null) {
            try {
                this.i = null;
                em20 em20Var = future.get();
                if (Build.VERSION.SDK_INT < 29) {
                    em20.a aVarA = qmf0.a(this);
                    em20Var.getClass();
                    aVarA.a(null);
                    throw null;
                }
                em20Var.getClass();
                setText((CharSequence) null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            lr0 lr0Var = jr0Var.i;
            if (gai0.c || !lr0Var.f()) {
                return;
            }
            lr0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView, defpackage.eg1
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (gai0.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (gai0.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (gai0.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? gr0.a(context, i) : null, i2 != 0 ? gr0.a(context, i2) : null, i3 != 0 ? gr0.a(context, i3) : null, i4 != 0 ? gr0.a(context, i4) : null);
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? gr0.a(context, i) : null, i2 != 0 ? gr0.a(context, i2) : null, i3 != 0 ? gr0.a(context, i3) : null, i4 != 0 ? gr0.a(context, i4) : null);
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(qmf0.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            qmf0.b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i);
        } else {
            qmf0.c(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().b(i, f);
        } else if (i2 >= 34) {
            qmf0.c.a(this, i, f);
        } else {
            qmf0.d(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(em20 em20Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            em20Var.getClass();
            setText((CharSequence) null);
        } else {
            em20.a aVarA = qmf0.a(this);
            em20Var.getClass();
            aVarA.a(null);
            throw null;
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        jr0 jr0Var = this.b;
        jr0Var.k(colorStateList);
        jr0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        jr0 jr0Var = this.b;
        jr0Var.l(mode);
        jr0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        ir0 ir0Var;
        if (Build.VERSION.SDK_INT >= 28 || (ir0Var = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            ir0Var.b = textClassifier;
        }
    }

    public void setTextFuture(Future<em20> future) {
        this.i = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(em20.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aVar.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aVar.a);
        setBreakStrategy(aVar.c);
        setHyphenationFrequency(aVar.d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = gai0.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            lr0 lr0Var = jr0Var.i;
            if (z || lr0Var.f()) {
                return;
            }
            lr0Var.g(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            q9h0 q9h0Var = j9h0.a;
            if (context == null) {
                hb5.a("Context cannot be null");
                return;
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.e = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        qmf0.d(this, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.b();
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }
}
