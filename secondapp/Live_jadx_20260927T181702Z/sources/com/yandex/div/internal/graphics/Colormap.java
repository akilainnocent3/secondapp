package com.yandex.div.internal.graphics;

import cs.g;
import java.util.Arrays;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class Colormap {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @g
    public static final Colormap EMPTY = new Colormap(new int[0], 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    @l
    private final int[] colors;

    @m
    private final float[] positions;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    public Colormap(@l int[] iArr, @m float[] fArr) {
        this.colors = iArr;
        this.positions = fArr;
        if (iArr.length != (fArr != null ? fArr.length : iArr.length)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(Colormap.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        m0.n(obj, "null cannot be cast to non-null type com.yandex.div.internal.graphics.Colormap");
        Colormap colormap = (Colormap) obj;
        return Arrays.equals(this.colors, colormap.colors) && Arrays.equals(this.positions, colormap.positions);
    }

    @l
    public final int[] getColors() {
        return this.colors;
    }

    @m
    public final float[] getPositions() {
        return this.positions;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.colors) * 31;
        float[] fArr = this.positions;
        return iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0);
    }

    public /* synthetic */ Colormap(int[] iArr, float[] fArr, int i10, x xVar) {
        this(iArr, (i10 & 2) != 0 ? null : fArr);
    }
}
