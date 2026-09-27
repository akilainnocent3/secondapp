package yads;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c63 extends Spannable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f147601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f147603c;

    public c63(Drawable drawable, int i10, int i11) {
        this.f147601a = drawable;
        this.f147602b = i10;
        this.f147603c = i11;
    }

    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.f147601a != null && this.f147602b > 0) {
            spannableStringBuilder.append((CharSequence) vb.q.a.f140822e);
            Drawable drawable = this.f147601a;
            int i10 = this.f147602b;
            drawable.setBounds(0, 0, i10, i10);
            oe oeVar = new oe(drawable);
            ColorDrawable colorDrawable = new ColorDrawable(0);
            int i11 = this.f147603c;
            colorDrawable.setBounds(0, 0, i11, i11);
            oe oeVar2 = new oe(colorDrawable);
            spannableStringBuilder.setSpan(oeVar, 0, 1, 33);
            spannableStringBuilder.setSpan(oeVar2, 1, 2, 33);
        }
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }
}
