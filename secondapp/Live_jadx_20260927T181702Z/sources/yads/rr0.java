package yads;

import com.yandex.mobile.ads.feed.FeedAdAdapter;
import com.yandex.mobile.ads.feed.FeedAdEventListener;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rr0 extends kotlin.jvm.internal.o0 implements ds.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FeedAdAdapter f155129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lr3 f155130c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr0(FeedAdAdapter feedAdAdapter, lr3 lr3Var) {
        super(0);
        this.f155129b = feedAdAdapter;
        this.f155130c = lr3Var;
    }

    @Override // ds.a
    public final Object invoke() {
        FeedAdEventListener eventListener = this.f155129b.getEventListener();
        if (eventListener != null) {
            eventListener.onImpression(this.f155130c);
        }
        return dr.w2.f79517a;
    }
}
