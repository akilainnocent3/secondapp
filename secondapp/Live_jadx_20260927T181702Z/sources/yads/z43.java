package yads;

import android.view.View;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z43 implements de1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f158610b;

    public z43(hb2 hb2Var) {
        this.f158610b = hb2Var;
    }

    @Override // yads.de1
    public final String a() {
        boolean zIsHardwareAccelerated = this.f158610b.isHardwareAccelerated();
        kotlin.jvm.internal.u1 u1Var = kotlin.jvm.internal.u1.f102789a;
        String str = String.format("supports: {inlineVideo: %s}", Arrays.copyOf(new Object[]{Boolean.valueOf(zIsHardwareAccelerated)}, 1));
        kotlin.jvm.internal.m0.o(str, "format(...)");
        return str;
    }
}
