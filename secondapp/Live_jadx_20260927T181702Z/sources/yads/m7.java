package yads;

import android.widget.TextView;
import com.yandex.mobile.ads.R;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class m7 implements f91 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f152339c = R.string.monetization_ads_internal_instream_ad_position;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f152340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152341b;

    public m7(int i10, int i11) {
        this.f152340a = i10;
        this.f152341b = i11;
    }

    @Override // yads.f91
    public final void a(wd3 wd3Var) {
        TextView textView = wd3Var.f157321k;
        if (textView != null) {
            String string = textView.getContext().getResources().getString(f152339c);
            kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
            String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(this.f152340a), Integer.valueOf(this.f152341b)}, 2));
            kotlin.jvm.internal.m0.o(str, "format(...)");
            textView.setText(str);
        }
    }
}
