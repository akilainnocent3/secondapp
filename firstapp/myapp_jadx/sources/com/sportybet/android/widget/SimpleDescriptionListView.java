package com.sportybet.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import defpackage.rk30;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/sportybet/android/widget/SimpleDescriptionListView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "", "descriptionList", "", "setDescriptionList", "(Ljava/util/List;)V", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SimpleDescriptionListView extends LinearLayout {
    public final int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleDescriptionListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        setOrientation(1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rk30.w, i, 0);
        typedArrayObtainStyledAttributes.getClass();
        this.a = typedArrayObtainStyledAttributes.getResourceId(0, R.style.DefaultDescriptionTextAppearance);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setDescriptionList(List<String> descriptionList) {
        descriptionList.getClass();
        removeAllViews();
        int i = 0;
        for (Object obj : descriptionList) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            TextView textView = new TextView(getContext());
            textView.setTag("descriptionListTextView" + i);
            textView.setText((String) obj);
            textView.setTextAppearance(this.a);
            addView(textView);
            i = i2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleDescriptionListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleDescriptionListView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ SimpleDescriptionListView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
