package androidx.leanback.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f12359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f12360c;

    public c1(Context context) {
        this(context, null);
    }

    public final CharSequence getDescription() {
        return this.f12360c.getText();
    }

    public final CharSequence getTitle() {
        return this.f12359b.getText();
    }

    public final void setDescription(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f12360c.setVisibility(8);
        } else {
            this.f12360c.setText(charSequence);
            this.f12360c.setVisibility(0);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f12359b.setVisibility(8);
        } else {
            this.f12359b.setText(charSequence);
            this.f12359b.setVisibility(0);
        }
    }

    public c1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(s3.a.j.E, this);
        this.f12359b = (TextView) findViewById(s3.a.h.f128742m2);
        this.f12360c = (TextView) findViewById(s3.a.h.M);
    }
}
