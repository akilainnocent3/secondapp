package yads;

import android.content.Context;
import com.yandex.mobile.ads.instream.newapi.InstreamAd;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class pr3 implements InstreamAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m00 f154086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j71 f154087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l71 f154088c = new l71();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dr.i0 f154089d = dr.k0.b(new or3(this));

    public pr3(Context context, m00 m00Var) {
        this.f154086a = m00Var;
        this.f154087b = new j71(context, new iu3(context), m00Var);
    }

    @Override // com.yandex.mobile.ads.instream.newapi.InstreamAd
    public final List getInstreamAdBreaks() {
        return (List) this.f154089d.getValue();
    }
}
