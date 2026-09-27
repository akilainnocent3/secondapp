package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class U7 implements Gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55607a;

    public U7(String content) {
        kotlin.jvm.internal.m0.p(content, "content");
        this.f55607a = content;
    }

    @Override // com.inmobi.media.Gg
    public final Object a(or.f fVar) {
        return dr.w2.f79517a;
    }

    @Override // com.inmobi.media.Gg
    public final Object b() {
        return this.f55607a;
    }

    @Override // com.inmobi.media.Gg
    public final void a() {
        if (this.f55607a.length() != 0) {
            return;
        }
        HashMap map = new HashMap();
        map.put("errorCode", (short) 2162);
        throw new Ig(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(map));
    }
}
