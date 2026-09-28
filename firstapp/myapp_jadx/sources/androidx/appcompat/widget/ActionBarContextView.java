package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import com.sportybet.android.gp.tz.R;
import defpackage.ac;
import defpackage.dl30;
import defpackage.gai0;
import defpackage.gr0;
import defpackage.ib5;
import defpackage.r6i0;
import defpackage.w1;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends w1 {
    public View A;
    public View B;
    public LinearLayout C;
    public TextView D;
    public TextView E;
    public final int F;
    public final int G;
    public boolean H;
    public final int I;
    public CharSequence w;
    public CharSequence y;
    public View z;

    public class a implements View.OnClickListener {
        public final /* synthetic */ ac a;

        public a(ac acVar) {
            this.a = acVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.a.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dl30.d, i, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : gr0.a(context, resourceId));
        this.F = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.G = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.I = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void f(ac acVar) {
        View view = this.z;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.I, (ViewGroup) this, false);
            this.z = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.z);
        }
        View viewFindViewById = this.z.findViewById(R.id.action_mode_close_button);
        this.A = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(acVar));
        f fVarE = acVar.e();
        ActionMenuPresenter actionMenuPresenter = this.d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.b();
            ActionMenuPresenter.a aVar = actionMenuPresenter.J;
            if (aVar != null && aVar.b()) {
                aVar.i.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.d = actionMenuPresenter2;
        actionMenuPresenter2.B = true;
        actionMenuPresenter2.C = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        fVarE.b(this.d, this.b);
        ActionMenuPresenter actionMenuPresenter3 = this.d;
        k kVar = actionMenuPresenter3.v;
        if (kVar == null) {
            k kVar2 = (k) actionMenuPresenter3.d.inflate(actionMenuPresenter3.f, (ViewGroup) this, false);
            actionMenuPresenter3.v = kVar2;
            kVar2.a(actionMenuPresenter3.c);
            actionMenuPresenter3.j(true);
        }
        k kVar3 = actionMenuPresenter3.v;
        if (kVar != kVar3) {
            ((ActionMenuView) kVar3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) kVar3;
        this.c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.c, layoutParams);
    }

    public final void g() {
        if (this.C == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.C = linearLayout;
            this.D = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.E = (TextView) this.C.findViewById(R.id.action_bar_subtitle);
            int i = this.F;
            if (i != 0) {
                this.D.setTextAppearance(getContext(), i);
            }
            int i2 = this.G;
            if (i2 != 0) {
                this.E.setTextAppearance(getContext(), i2);
            }
        }
        this.D.setText(this.w);
        this.E.setText(this.y);
        boolean zIsEmpty = TextUtils.isEmpty(this.w);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.y);
        this.E.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.C.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.C.getParent() == null) {
            addView(this.C);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.w1
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // defpackage.w1
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public CharSequence getTitle() {
        return this.w;
    }

    public final void h() {
        removeAllViews();
        this.B = null;
        this.c = null;
        this.d = null;
        View view = this.A;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.b();
            ActionMenuPresenter.a aVar = this.d.J;
            if (aVar == null || !aVar.b()) {
                return;
            }
            aVar.i.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = gai0.a;
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.z;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int iD = w1.d(i7, paddingTop, paddingTop2, this.z, z3) + i7;
            paddingRight = z3 ? iD - i6 : iD + i6;
        }
        LinearLayout linearLayout = this.C;
        if (linearLayout != null && this.B == null && linearLayout.getVisibility() != 8) {
            paddingRight += w1.d(paddingRight, paddingTop, paddingTop2, this.C, z3);
        }
        View view2 = this.B;
        if (view2 != null) {
            w1.d(paddingRight, paddingTop, paddingTop2, view2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null) {
            w1.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            ib5.a(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
            return;
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            ib5.a(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.z;
        if (view != null) {
            int iC = w1.c(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = w1.c(this.c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.C;
        if (linearLayout != null && this.B == null) {
            if (this.H) {
                this.C.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.C.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.C.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = w1.c(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.B;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.B.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // defpackage.w1
    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.B;
        if (view2 != null) {
            removeView(view2);
        }
        this.B = view;
        if (view != null && (linearLayout = this.C) != null) {
            removeView(linearLayout);
            this.C = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.y = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.w = charSequence;
        g();
        r6i0.q(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.H) {
            requestLayout();
        }
        this.H = z;
    }

    @Override // defpackage.w1, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }
}
