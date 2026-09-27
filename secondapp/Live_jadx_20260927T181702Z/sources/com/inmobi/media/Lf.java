package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Transformation;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Lf implements Transformation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap.Config f55071a;

    public Lf(Bitmap.Config config) {
        kotlin.jvm.internal.m0.p(config, "config");
        this.f55071a = config;
    }

    @Override // com.squareup.picasso.Transformation
    public final String key() {
        return "config(" + this.f55071a + gi.j.f86771d;
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap transform(Bitmap source) {
        kotlin.jvm.internal.m0.p(source, "source");
        Bitmap bitmapCopy = source.copy(this.f55071a, false);
        source.recycle();
        kotlin.jvm.internal.m0.m(bitmapCopy);
        return bitmapCopy;
    }
}
