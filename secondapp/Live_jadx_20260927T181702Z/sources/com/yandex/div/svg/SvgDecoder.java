package com.yandex.div.svg;

import android.graphics.RectF;
import android.graphics.drawable.PictureDrawable;
import com.yandex.div.core.annotations.InternalApi;
import java.io.InputStream;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;
import sc.k;
import sc.o;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@InternalApi
public final class SvgDecoder {
    private final boolean useViewBoundsAsIntrinsicSize;

    public SvgDecoder() {
        this(false, 1, null);
    }

    @m
    public final PictureDrawable decode(@l InputStream inputStream) {
        float fN;
        float fI;
        try {
            k kVarU = k.u(inputStream);
            RectF rectFM = kVarU.m();
            if (!this.useViewBoundsAsIntrinsicSize || rectFM == null) {
                fN = kVarU.n();
                fI = kVarU.i();
            } else {
                fN = rectFM.width();
                fI = rectFM.height();
            }
            if (rectFM == null && fN > 0.0f && fI > 0.0f) {
                kVarU.U(0.0f, 0.0f, fN, fI);
            }
            return new PictureDrawable(kVarU.I());
        } catch (o unused) {
            return null;
        }
    }

    public SvgDecoder(boolean z10) {
        this.useViewBoundsAsIntrinsicSize = z10;
    }

    public /* synthetic */ SvgDecoder(boolean z10, int i10, x xVar) {
        this((i10 & 1) != 0 ? true : z10);
    }
}
