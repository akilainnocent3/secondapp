package ri;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.l2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class d extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f127293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f127294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f127295d;

    public d(Context context) {
        this(context, null);
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l2 l2VarF = l2.F(context, attributeSet, ih.a.o.f93985vv);
        this.f127293b = l2VarF.x(ih.a.o.f94090yv);
        this.f127294c = l2VarF.h(ih.a.o.f94020wv);
        this.f127295d = l2VarF.u(ih.a.o.f94055xv, 0);
        l2VarF.I();
    }
}
