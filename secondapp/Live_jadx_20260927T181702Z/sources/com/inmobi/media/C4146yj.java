package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import java.util.Comparator;

/* JADX INFO: renamed from: com.inmobi.media.yj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4146yj implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58208a;

    public C4146yj(int i10) {
        this.f58208a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return jr.g.l(Integer.valueOf(Math.abs(((Image) obj).getWidth() - this.f58208a)), Integer.valueOf(Math.abs(((Image) obj2).getWidth() - this.f58208a)));
    }
}
