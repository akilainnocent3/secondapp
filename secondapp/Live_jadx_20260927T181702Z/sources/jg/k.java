package jg;

import ah.d0;
import android.net.Uri;
import eh.o1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f100403a = "rtp://0.0.0.0";

    public static d0 a(int i10) {
        return new d0(Uri.parse(o1.M("%s:%d", f100403a, Integer.valueOf(i10))));
    }
}
