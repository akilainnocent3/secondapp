package defpackage;

import android.R;
import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class m4a0 {
    public static final void a(Activity activity, String str, CharSequence charSequence, final Function0 function0) {
        activity.getClass();
        str.getClass();
        final Snackbar snackbarH = Snackbar.h(((ViewGroup) activity.findViewById(R.id.content)).getChildAt(0), "", 6000);
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = snackbarH.i;
        snackbarBaseLayout.getClass();
        snackbarBaseLayout.setBackgroundResource(R.color.transparent);
        snackbarBaseLayout.setPadding(0, 0, 0, 0);
        ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = -1;
        marginLayoutParams.setMargins(16, 0, 16, 16);
        snackbarBaseLayout.setLayoutParams(marginLayoutParams);
        View viewInflate = LayoutInflater.from(activity).inflate(com.sportybet.android.gp.tz.R.layout.view_streak_upgrade_hint, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(com.sportybet.android.gp.tz.R.id.streak_upgrade_title);
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = (TextView) viewInflate.findViewById(com.sportybet.android.gp.tz.R.id.streak_upgrade_message);
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: l4a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                function0.invoke();
                snackbarH.b(3);
            }
        });
        snackbarBaseLayout.removeAllViews();
        snackbarBaseLayout.addView(viewInflate, 0);
        snackbarH.j();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static Snackbar b(Activity activity, CharSequence charSequence, int i) {
        int i2 = (i & 4) != 0 ? com.sportybet.android.gp.tz.R.color.background_snackbar : com.sportybet.android.gp.tz.R.color.custom_background_snackbar_type1;
        int i3 = (i & 8) != 0 ? com.sportybet.android.gp.tz.R.color.text_type2_primary : com.sportybet.android.gp.tz.R.color.text_inverse_primary;
        int i4 = (i & 32) != 0 ? 16 : 12;
        int i5 = (i & 64) == 0 ? 0 : 12;
        activity.getClass();
        charSequence.getClass();
        Snackbar snackbarH = Snackbar.h(((ViewGroup) activity.findViewById(R.id.content)).getChildAt(0), charSequence, 0);
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout = snackbarH.i;
        snackbarBaseLayout.getClass();
        int color = activity.getColor(i2);
        int color2 = activity.getColor(i3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(activity.getResources().getDisplayMetrics().density * 4.0f);
        snackbarBaseLayout.setBackground(gradientDrawable);
        snackbarBaseLayout.setElevation(8.0f);
        ViewGroup.LayoutParams layoutParams = snackbarBaseLayout.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        float f = i4;
        int i6 = (int) (activity.getResources().getDisplayMetrics().density * f);
        marginLayoutParams.setMargins(i6, 0, i6, (int) (f * activity.getResources().getDisplayMetrics().density));
        snackbarBaseLayout.setLayoutParams(marginLayoutParams);
        int i7 = (int) (i5 * activity.getResources().getDisplayMetrics().density);
        snackbarBaseLayout.setPadding(i7, i7, i7, i7);
        TextView textView = (TextView) snackbarBaseLayout.findViewById(com.sportybet.android.gp.tz.R.id.snackbar_text);
        if (textView != null) {
            textView.setTextAppearance(com.sportybet.android.gp.tz.R.style.B1_M);
            textView.setTextColor(color2);
        }
        snackbarH.j();
        return snackbarH;
    }
}
