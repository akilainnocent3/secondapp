package com.sportybet.android.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ErrorView;
import defpackage.bmy;
import defpackage.ddg;
import defpackage.fae;
import defpackage.h5e;
import defpackage.sn5;
import defpackage.zch0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001#B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/sportybet/android/widget/ErrorView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "l", "", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/widget/Button;", "b", "Landroid/widget/Button;", "getButton", "()Landroid/widget/Button;", "button", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "getTitle", "()Landroid/widget/TextView;", "title", "Lcom/sportybet/android/widget/ErrorView$a;", "d", "Lcom/sportybet/android/widget/ErrorView$a;", "getOnActionListener", "()Lcom/sportybet/android/widget/ErrorView$a;", "setOnActionListener", "(Lcom/sportybet/android/widget/ErrorView$a;)V", "onActionListener", "a", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ErrorView extends LinearLayout {
    public final ddg a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Button button;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final TextView title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public a onActionListener;

    public interface a {
        void a();
    }

    public static final class b implements a {
        public final /* synthetic */ View.OnClickListener a;
        public final /* synthetic */ ErrorView b;

        public b(View.OnClickListener onClickListener, ErrorView errorView) {
            this.a = onClickListener;
            this.b = errorView;
        }

        @Override // com.sportybet.android.widget.ErrorView.a
        public final void a() {
            this.a.onClick(this.b.a.b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.error_view_new, this);
        int i2 = R.id.retry;
        Button button = (Button) h5e.a(R.id.retry, this);
        if (button != null) {
            i2 = R.id.title;
            TextView textView = (TextView) h5e.a(R.id.title, this);
            if (textView != null) {
                this.a = new ddg(this, button, textView);
                this.button = button;
                this.title = textView;
                setOrientation(1);
                setPadding(zch0.a(getContext(), 60), 0, zch0.a(getContext(), 60), 0);
                setGravity(1);
                button.setOnClickListener(new View.OnClickListener() { // from class: adg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ErrorView.a aVar = this.a.onActionListener;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                });
                return;
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    public final void a(String str, Drawable drawable, String str2) {
        str2.getClass();
        if (str == null) {
            Context context = getContext();
            context.getClass();
            str = sn5.b(context, R.string.common_feedback__something_went_wrong_please_try_again_later, new Object[0]);
        } else {
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                Context context2 = getContext();
                context2.getClass();
                str = sn5.b(context2, R.string.common_feedback__something_went_wrong_please_try_again_later, new Object[0]);
            }
        }
        TextView textView = this.title;
        textView.setText(str);
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        if (str2.length() == 0) {
            Context context3 = getContext();
            context3.getClass();
            str2 = sn5.b(context3, R.string.common_functions__retry, new Object[0]);
        }
        this.button.setText(str2);
    }

    public final Button getButton() {
        return this.button;
    }

    public final a getOnActionListener() {
        return this.onActionListener;
    }

    public final TextView getTitle() {
        return this.title;
    }

    public final void setOnActionListener(a aVar) {
        this.onActionListener = aVar;
    }

    @Override // android.view.View
    @fae
    public void setOnClickListener(View.OnClickListener l) {
        this.onActionListener = l != null ? new b(l, this) : null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ErrorView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ ErrorView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
