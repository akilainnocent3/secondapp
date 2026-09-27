package yads;

import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fb0 implements f91 {
    @Override // yads.f91
    public final void a(wd3 wd3Var) {
        TextView textView = wd3Var.f157317g;
        if (textView != null) {
            textView.setText(R.string.monetization_ads_internal_instream_sponsored_default);
            textView.setVisibility(0);
        }
        ImageView imageView = wd3Var.f157318h;
        if (imageView != null) {
            imageView.setImageDrawable(f1.d.getDrawable(imageView.getContext(), R.drawable.monetization_ads_instream_internal_advertiser));
            imageView.setVisibility(0);
        }
    }
}
