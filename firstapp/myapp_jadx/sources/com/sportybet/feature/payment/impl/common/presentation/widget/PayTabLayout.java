package com.sportybet.feature.payment.impl.common.presentation.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.common.presentation.widget.PayTabLayout;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.j400;
import defpackage.k400;
import defpackage.m400;
import defpackage.x1f0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/sportybet/feature/payment/impl/common/presentation/widget/PayTabLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "mode", "", "setTabMode", "(I)V", "Lm400;", "F", "Lm400;", "getBinding", "()Lm400;", "binding", "Landroid/content/res/ColorStateList;", "K", "Landroid/content/res/ColorStateList;", "getTabTextColors", "()Landroid/content/res/ColorStateList;", "tabTextColors", "getTabCount", "()I", "tabCount", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PayTabLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final m400 binding;
    public final TabLayout G;
    public final ImageView H;
    public final ImageView I;
    public final j400 J;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public final ColorStateList tabTextColors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v5, types: [j400] */
    public PayTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pay_tablayout_layout, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.button_left_arrow;
        ImageView imageView = (ImageView) h5e.a(R.id.button_left_arrow, viewInflate);
        if (imageView != null) {
            i = R.id.button_right_arrow;
            ImageView imageView2 = (ImageView) h5e.a(R.id.button_right_arrow, viewInflate);
            if (imageView2 != null) {
                i = R.id.tab_container;
                TabLayout tabLayout = (TabLayout) h5e.a(R.id.tab_container, viewInflate);
                if (tabLayout != null) {
                    this.binding = new m400((ConstraintLayout) viewInflate, imageView, imageView2, tabLayout);
                    this.G = tabLayout;
                    this.H = imageView;
                    this.I = imageView2;
                    this.J = new ViewTreeObserver.OnScrollChangedListener() { // from class: j400
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            PayTabLayout payTabLayout = this.a;
                            TabLayout tabLayout2 = payTabLayout.G;
                            ImageView imageView3 = payTabLayout.I;
                            ImageView imageView4 = payTabLayout.H;
                            int width = tabLayout2.getWidth();
                            int scrollX = tabLayout2.getScrollX();
                            ArrayList arrayListA = x1f0.a(tabLayout2);
                            if (arrayListA.isEmpty()) {
                                imageView4.setVisibility(8);
                                imageView3.setVisibility(8);
                            } else {
                                imageView4.setVisibility(scrollX > ((TabLayout.g) CollectionsKt.T(arrayListA)).h.getWidth() / 2 ? 0 : 8);
                                TabLayout.TabView tabView = ((TabLayout.g) CollectionsKt.b0(arrayListA)).h;
                                imageView3.setVisibility(scrollX + width < tabView.getRight() - (tabView.getWidth() / 2) ? 0 : 8);
                            }
                        }
                    };
                    imageView.setOnClickListener(new k400(this, 0));
                    imageView2.setOnClickListener(new View.OnClickListener() { // from class: l400
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            TabLayout tabLayout2 = this.a.G;
                            tabLayout2.smoothScrollBy(tabLayout2.getWidth(), 0);
                        }
                    });
                    this.tabTextColors = tabLayout.getTabTextColors();
                    return;
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final m400 getBinding() {
        return this.binding;
    }

    public int getTabCount() {
        return this.G.getTabCount();
    }

    public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G.getViewTreeObserver().addOnScrollChangedListener(this.J);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G.getViewTreeObserver().removeOnScrollChangedListener(this.J);
    }

    public void setTabMode(int mode) {
        TabLayout tabLayout = this.G;
        tabLayout.setTabMode(mode);
        x1f0.a(tabLayout).size();
    }
}
