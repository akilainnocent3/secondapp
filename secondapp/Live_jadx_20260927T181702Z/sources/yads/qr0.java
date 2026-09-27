package yads;

import com.yandex.mobile.ads.feed.FeedAdAdapter;
import com.yandex.mobile.ads.feed.FeedAdEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class qr0 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedAdAdapter f154571b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr0(FeedAdAdapter feedAdAdapter) {
        super(0);
        this.f154571b = feedAdAdapter;
    }

    @Override // ds.a
    public final Object invoke() {
        FeedAdEventListener eventListener = this.f154571b.getEventListener();
        if (eventListener != null) {
            eventListener.onAdClicked();
        }
        return dr.w2.f79517a;
    }
}
