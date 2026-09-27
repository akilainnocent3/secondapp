package yads;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class p61 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final og0 f153753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final er f153754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f153755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View.OnClickListener f153756d;

    public p61(Context context, og0 og0Var) {
        super(context);
        this.f153753a = og0Var;
        this.f153754b = new er(context, og0Var);
        this.f153755c = new TextView(context);
        this.f153756d = new View.OnClickListener() { // from class: yads.z74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p61.a(this.f158650b, view);
            }
        };
        a(context);
    }

    public static final void a(p61 p61Var, View view) {
        boolean zIsSelected = p61Var.f153754b.isSelected();
        p61Var.f153754b.setSelected(!zIsSelected);
        p61Var.f153755c.setVisibility(!zIsSelected ? 0 : 8);
    }

    public final void setDescription(@oy.l String str) {
        this.f153755c.setText(str);
    }

    public final void a(Context context) {
        setOrientation(0);
        this.f153753a.getClass();
        int iA = og0.a(context, 4.0f);
        setPadding(iA, iA, iA, iA);
        this.f153754b.setOnClickListener(this.f153756d);
        addView(this.f153754b);
        this.f153753a.getClass();
        int iL0 = is.d.L0(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.f153755c.setPadding(iL0, iL0, iL0, iL0);
        this.f153753a.getClass();
        int iL1 = is.d.L0(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(iL1, p1.a.f120313c);
        this.f153755c.setBackgroundDrawable(gradientDrawable);
        addView(this.f153755c);
        this.f153753a.getClass();
        int iL2 = is.d.L0(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams = this.f153755c.getLayoutParams();
        kotlin.jvm.internal.m0.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(iL2, 0, iL2, iL2);
        this.f153755c.setLayoutParams(layoutParams2);
        this.f153755c.setVisibility(8);
    }
}
