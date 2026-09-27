package yads;

import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final og0 f158433a;

    public /* synthetic */ yn2() {
        this(new og0());
    }

    public final Button a(Context context) {
        Button button = new Button(context);
        button.setBackground(f1.d.getDrawable(context, R.drawable.monetization_ads_video_ic_replay));
        this.f158433a.getClass();
        int iA = og0.a(context, 90.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
        layoutParams.gravity = 17;
        button.setLayoutParams(layoutParams);
        return button;
    }

    public yn2(og0 og0Var) {
        this.f158433a = og0Var;
    }
}
