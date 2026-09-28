package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.SGToggle;
import com.sportygames.commons.models.LeftMenuButton;
import com.sportygames.commons.models.MenuIconSize;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class k4s extends RecyclerView.f<q4s> {
    public final List<LeftMenuButton> a;
    public final Activity b;
    public final String c;

    /* JADX WARN: Multi-variable type inference failed */
    public k4s(List<? extends LeftMenuButton> list, Activity activity, ypa0 ypa0Var, String str, boolean z) {
        list.getClass();
        activity.getClass();
        str.getClass();
        this.a = list;
        this.b = activity;
        this.c = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        MenuIconSize iconSize;
        MenuIconSize iconSize2;
        q4s q4sVar = (q4s) d0Var;
        q4sVar.getClass();
        LeftMenuButton leftMenuButton = this.a.get(i);
        uo80 uo80Var = q4sVar.a;
        Activity activity = this.b;
        activity.getClass();
        String str = this.c;
        str.getClass();
        Object[] objArr = 0;
        if ((leftMenuButton != null ? leftMenuButton.getToggleOnColor() : null) != null && leftMenuButton.getToggleOffColor() != null) {
            SGToggle sGToggle = uo80Var.b;
            Integer toggleOnColor = leftMenuButton.getToggleOnColor();
            int iIntValue = toggleOnColor != null ? toggleOnColor.intValue() : 0;
            Integer toggleOffColor = leftMenuButton.getToggleOffColor();
            sGToggle.setOnOffColor(iIntValue, toggleOffColor != null ? toggleOffColor.intValue() : 0, activity);
        }
        SGToggle sGToggle2 = uo80Var.b;
        TextView textView = uo80Var.e;
        SpinKitView spinKitView = uo80Var.f;
        TextView textView2 = uo80Var.d;
        AppCompatImageView appCompatImageView = uo80Var.c;
        sGToggle2.setOnStateChange(new p4s(leftMenuButton, objArr == true ? 1 : 0));
        ConstraintLayout constraintLayout = uo80Var.a;
        constraintLayout.getClass();
        gr60.a(constraintLayout, new mgi(leftMenuButton, 1));
        String subtitle = leftMenuButton != null ? leftMenuButton.getSubtitle() : null;
        if (subtitle == null || subtitle.length() == 0) {
            textView2.setVisibility(8);
            spinKitView.setVisibility(8);
        } else {
            textView2.setText(leftMenuButton != null ? leftMenuButton.getSubtitle() : null);
            textView2.setVisibility(0);
            textView2.setContentDescription("menu_subtitle_" + (leftMenuButton != null ? leftMenuButton.getName() : null));
            if (leftMenuButton == null || !leftMenuButton.getIsLoading()) {
                spinKitView.setVisibility(8);
            } else {
                spinKitView.setVisibility(0);
            }
        }
        textView.setText(leftMenuButton != null ? leftMenuButton.getName() : null);
        textView.setContentDescription("menu_txt_" + (leftMenuButton != null ? leftMenuButton.getName() : null));
        if (leftMenuButton != null && leftMenuButton.getPopup() == 1) {
            sGToggle2.J = str;
        }
        if (leftMenuButton != null) {
            appCompatImageView.setImageResource(leftMenuButton.getIcon());
        }
        if (leftMenuButton != null && (iconSize2 = leftMenuButton.getIconSize()) != null) {
            appCompatImageView.getLayoutParams().width = (int) appCompatImageView.getResources().getDimension(iconSize2.getWidth());
        }
        if (leftMenuButton != null && (iconSize = leftMenuButton.getIconSize()) != null) {
            appCompatImageView.getLayoutParams().height = (int) appCompatImageView.getResources().getDimension(iconSize.getHeight());
        }
        appCompatImageView.setContentDescription("menu_icon_" + (leftMenuButton != null ? leftMenuButton.getName() : null));
        Boolean boolValueOf = leftMenuButton != null ? Boolean.valueOf(leftMenuButton.getIsToggle()) : null;
        boolValueOf.getClass();
        sGToggle2.setVisibility(boolValueOf.booleanValue() ? 0 : 8);
        if (leftMenuButton.getToggleState() != null) {
            Boolean toggleState = leftMenuButton.getToggleState();
            sGToggle2.setStatus(toggleState != null ? toggleState.booleanValue() : false, str);
        }
        sGToggle2.setGameName(str);
        sGToggle2.setContentDescription("menu_toggle_" + leftMenuButton.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = q4s.b;
        View viewA = dzc.a(viewGroup, R.layout.sg_left_menu_item, viewGroup, false);
        int i3 = R.id.chkState;
        SGToggle sGToggle = (SGToggle) h5e.a(R.id.chkState, viewA);
        if (sGToggle != null) {
            i3 = R.id.icon_menu;
            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.icon_menu, viewA);
            if (appCompatImageView != null) {
                i3 = R.id.icon_menu_layout;
                if (((LinearLayoutCompat) h5e.a(R.id.icon_menu_layout, viewA)) != null) {
                    i3 = R.id.menu_sub_title;
                    TextView textView = (TextView) h5e.a(R.id.menu_sub_title, viewA);
                    if (textView != null) {
                        i3 = R.id.menu_txt;
                        TextView textView2 = (TextView) h5e.a(R.id.menu_txt, viewA);
                        if (textView2 != null) {
                            i3 = R.id.spin_kit;
                            SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.spin_kit, viewA);
                            if (spinKitView != null) {
                                return new q4s(new uo80((ConstraintLayout) viewA, sGToggle, appCompatImageView, textView, textView2, spinKitView));
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i3)));
        return null;
    }
}
