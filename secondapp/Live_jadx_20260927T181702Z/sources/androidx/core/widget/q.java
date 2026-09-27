package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ba.d1;
import e2.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import k.c1;
import k.e0;
import k.q0;
import k.t0;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f9368a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f9369b = 1;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(23)
    public static class a {
        @k.t
        public static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        @k.t
        public static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @k.t
        public static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        @k.t
        public static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        @k.t
        public static void e(TextView textView, int i10) {
            textView.setBreakStrategy(i10);
        }

        @k.t
        public static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @k.t
        public static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @k.t
        public static void h(TextView textView, int i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(24)
    public static class b {
        @k.t
        public static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(26)
    public static class c {
        @k.t
        public static int a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        @k.t
        public static int b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        @k.t
        public static int c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @k.t
        public static int[] d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        @k.t
        public static int e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        @k.t
        public static void f(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        @k.t
        public static void g(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        @k.t
        public static void h(TextView textView, int i10) {
            textView.setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(34)
    public static class e {
        @k.t
        public static void a(@NonNull TextView textView, int i10, @k.w(from = 0.0d) float f10) {
            textView.setLineHeight(i10, f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public @interface f {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(26)
    public static class g implements ActionMode.Callback {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f9370g = 100;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f9371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f9372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<?> f9373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Method f9374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f9375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f9376f = false;

        public g(ActionMode.Callback callback, TextView textView) {
            this.f9371a = callback;
            this.f9372b = textView;
        }

        public final Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType(d1.f20912b);
        }

        public final Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        public final List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                    if (f(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            return arrayList;
        }

        @NonNull
        public ActionMode.Callback d() {
            return this.f9371a;
        }

        public final boolean e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        public final boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        public final void g(Menu menu) {
            Context context = this.f9372b.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z10 = this.f9376f;
            Class<?> cls = Integer.TYPE;
            if (!z10) {
                this.f9376f = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f9373c = cls2;
                    this.f9374d = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f9375e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f9373c = null;
                    this.f9374d = null;
                    this.f9375e = false;
                }
            }
            try {
                Method declaredMethod = (this.f9375e && this.f9373c.isInstance(menu)) ? this.f9374d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> listC = c(context, packageManager);
                for (int i10 = 0; i10 < listC.size(); i10++) {
                    ResolveInfo resolveInfo = listC.get(i10);
                    menu.add(0, 0, i10 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f9372b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f9371a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f9371a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f9371a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.f9371a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static void A(@NonNull TextView textView, @e0(from = 0) @q0 int i10) {
        x.i(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public static void B(@NonNull TextView textView, int i10, @k.w(from = 0.0d) float f10) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.a(textView, i10, f10);
        } else {
            A(textView, Math.round(TypedValue.applyDimension(i10, f10, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void C(@NonNull TextView textView, @NonNull a2.p pVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(d.a(pVar.f()));
        } else {
            if (!o(textView).a(pVar.e())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(pVar);
        }
    }

    public static void D(@NonNull TextView textView, @c1 int i10) {
        textView.setTextAppearance(i10);
    }

    public static void E(@NonNull TextView textView, @NonNull a2.p.b bVar) {
        textView.setTextDirection(m(bVar.d()));
        textView.getPaint().set(bVar.e());
        a.e(textView, bVar.b());
        a.h(textView, bVar.c());
    }

    @Nullable
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback F(@Nullable ActionMode.Callback callback) {
        return (!(callback instanceof g) || Build.VERSION.SDK_INT < 26) ? callback : ((g) callback).d();
    }

    @Nullable
    @y0({y0.a.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback G(@NonNull TextView textView, @Nullable ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof g) || callback == null) ? callback : new g(callback, textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.a(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.b(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.c(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static int[] d(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.d(textView);
        }
        return textView instanceof androidx.core.widget.b ? ((androidx.core.widget.b) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int e(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return c.e(textView);
        }
        if (textView instanceof androidx.core.widget.b) {
            return ((androidx.core.widget.b) textView).getAutoSizeTextType();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static ColorStateList f(@NonNull TextView textView) {
        x.l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return a.b(textView);
        }
        if (textView instanceof v) {
            return ((v) textView).getSupportCompoundDrawablesTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static PorterDuff.Mode g(@NonNull TextView textView) {
        x.l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return a.c(textView);
        }
        if (textView instanceof v) {
            return ((v) textView).getSupportCompoundDrawablesTintMode();
        }
        return null;
    }

    @NonNull
    public static Drawable[] h(@NonNull TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int i(@NonNull TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int j(@NonNull TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int k(@NonNull TextView textView) {
        return textView.getMaxLines();
    }

    public static int l(@NonNull TextView textView) {
        return textView.getMinLines();
    }

    public static int m(@NonNull TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    public static TextDirectionHeuristic n(@NonNull TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(d.b(b.a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z10 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z10 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    @NonNull
    public static a2.p.b o(@NonNull TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new a2.p.b(d.c(textView));
        }
        a2.p.b.a aVar = new a2.p.b.a(new TextPaint(textView.getPaint()));
        aVar.b(a.a(textView));
        aVar.c(a.d(textView));
        aVar.d(n(textView));
        return aVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p(@NonNull TextView textView, int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            c.f(textView, i10, i11, i12, i13);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void q(@NonNull TextView textView, @NonNull int[] iArr, int i10) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            c.g(textView, iArr, i10);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(@NonNull TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 27) {
            c.h(textView, i10);
        } else if (textView instanceof androidx.core.widget.b) {
            ((androidx.core.widget.b) textView).setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(@NonNull TextView textView, @Nullable ColorStateList colorStateList) {
        x.l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            a.f(textView, colorStateList);
        } else if (textView instanceof v) {
            ((v) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(@NonNull TextView textView, @Nullable PorterDuff.Mode mode) {
        x.l(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            a.g(textView, mode);
        } else if (textView instanceof v) {
            ((v) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void u(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void v(@NonNull TextView textView, @k.u int i10, @k.u int i11, @k.u int i12, @k.u int i13) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    public static void w(@NonNull TextView textView, @Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public static void x(@NonNull TextView textView, @NonNull ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(G(textView, callback));
    }

    public static void y(@NonNull TextView textView, @e0(from = 0) @q0 int i10) {
        x.i(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            d.d(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void z(@NonNull TextView textView, @e0(from = 0) @q0 int i10) {
        x.i(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(28)
    public static class d {
        @k.t
        public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        @k.t
        public static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        @k.t
        public static void d(TextView textView, int i10) {
            textView.setFirstBaselineToTopHeight(i10);
        }

        @k.t
        public static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }
    }
}
