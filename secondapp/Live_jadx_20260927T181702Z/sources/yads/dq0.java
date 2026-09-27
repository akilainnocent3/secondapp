package yads;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dq0 implements de1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f148317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f148318c;

    public dq0(int i10, RectF rectF) {
        this.f148317b = i10;
        this.f148318c = rectF;
    }

    @Override // yads.de1
    public final String a() {
        String str;
        kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
        Integer numValueOf = Integer.valueOf(this.f148317b);
        RectF rectF = this.f148318c;
        if (rectF != null) {
            str = String.format("{x:%s,y:%s,width:%s,height:%s}", Arrays.copyOf(new Object[]{Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.width()), Float.valueOf(rectF.height())}, 4));
            kotlin.jvm.internal.m0.o(str, "format(...)");
        } else {
            str = null;
        }
        String str2 = String.format("exposure:{exposedPercentage:%s,visibleRectangle:%s,occlusionRectangles:[]}", Arrays.copyOf(new Object[]{numValueOf, str}, 2));
        kotlin.jvm.internal.m0.o(str2, "format(...)");
        return str2;
    }
}
