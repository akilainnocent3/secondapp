package defpackage;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.v;
import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class byu extends v {
    public final /* synthetic */ float q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byu(MatchEventActivity matchEventActivity, float f) {
        super(matchEventActivity);
        this.q = f;
    }

    @Override // androidx.recyclerview.widget.v
    public final float k(DisplayMetrics displayMetrics) {
        displayMetrics.getClass();
        return ((this.q * 75.0f) + 25.0f) / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.v
    public final int n() {
        return -1;
    }
}
