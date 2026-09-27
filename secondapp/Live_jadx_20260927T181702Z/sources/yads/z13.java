package yads;

import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z13 implements f91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a23 f158562a;

    public z13(a23 a23Var) {
        this.f158562a = a23Var;
    }

    @Override // yads.f91
    public final void a(wd3 wd3Var) {
        TextView textView = wd3Var.f157317g;
        if (textView != null) {
            textView.setText(R.string.monetization_ads_internal_instream_sponsored_social);
            textView.setVisibility(0);
            textView.setOnClickListener(new y13(this.f158562a, new db3(new cb3())));
        }
        ImageView imageView = wd3Var.f157318h;
        if (imageView != null) {
            imageView.setImageDrawable(f1.d.getDrawable(imageView.getContext(), R.drawable.monetization_ads_instream_internal_advertiser_social));
            imageView.setVisibility(0);
            imageView.setOnClickListener(new y13(this.f158562a, new db3(new cb3())));
        }
    }
}
