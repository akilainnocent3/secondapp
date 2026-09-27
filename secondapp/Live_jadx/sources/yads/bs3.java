package yads;

import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bs3 implements InstreamAdBreakQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ci1 f147328a;

    public bs3(ci1 ci1Var) {
        this.f147328a = ci1Var;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    public final int getCount() {
        return this.f147328a.f147739a.size();
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    public final Object poll() {
        return this.f147328a.f147739a.poll();
    }
}
