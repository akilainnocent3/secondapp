package com.sportybet.android.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sportybet/android/widget/IndicatorView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isGrey", "", "setGreyVersion", "(Z)V", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class IndicatorView extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public int a;
    public boolean b;
    public boolean c;

    public IndicatorView(Context context) {
        super(context);
    }

    public final void a(int i, boolean z) {
        this.a = i;
        this.c = z;
        for (int i2 = 0; i2 < i; i2++) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageDrawable(getContext().getDrawable(z ? R.drawable.ic_dot_indicator_selected : R.drawable.ic_appintro_indicator_selected));
            addView(imageView, new LinearLayout.LayoutParams(-2, -2));
        }
        b(0);
    }

    public final void b(int i) {
        int i2 = this.a;
        for (int i3 = 0; i3 < i2; i3++) {
            boolean z = this.c;
            int i4 = R.drawable.ic_dot_indicator_unselected;
            int i5 = z ? R.drawable.ic_dot_indicator_unselected : R.drawable.ic_appintro_indicator_unselected;
            int i6 = R.drawable.ic_dot_indicator_selected;
            if (i3 == i) {
                i5 = z ? R.drawable.ic_dot_indicator_selected : R.drawable.ic_appintro_indicator_selected;
            }
            if (this.b) {
                if (!z) {
                    i4 = R.drawable.ic_kyc_indicator_unselected;
                }
                if (i3 == i) {
                    if (!z) {
                        i6 = R.drawable.ic_kyc_indicator_selected;
                    }
                    i5 = i6;
                } else {
                    i5 = i4;
                }
            }
            if (getChildAt(i3) instanceof ImageView) {
                View childAt = getChildAt(i3);
                childAt.getClass();
                ((ImageView) childAt).setImageDrawable(getContext().getDrawable(i5));
            }
        }
    }

    public final void setGreyVersion(boolean isGrey) {
        this.b = isGrey;
    }
}
