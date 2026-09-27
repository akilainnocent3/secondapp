package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.fyber.inneractive.sdk.player.exoplayer2.o;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f45910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f45912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o f45913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f45914f;

    public b(String str, List list, List list2, List list3, o oVar, List list4) {
        super(str);
        this.f45910b = Collections.unmodifiableList(list);
        this.f45911c = Collections.unmodifiableList(list2);
        this.f45912d = Collections.unmodifiableList(list3);
        this.f45913e = oVar;
        this.f45914f = list4 != null ? Collections.unmodifiableList(list4) : null;
    }
}
