package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class lj10 implements jj10 {
    public static final lj10 a = new lj10();

    public static final class a extends kj10.a {
        @Override // kj10.a, defpackage.ij10
        public final void c(float f, long j, long j2) {
            if (!Float.isNaN(f)) {
                this.a.setZoom(f);
            }
            long j3 = 9223372034707292159L & j2;
            Magnifier magnifier = this.a;
            if (j3 != 9205357640488583168L) {
                magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
            } else {
                magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
            }
        }
    }

    @Override // defpackage.jj10
    public final boolean a() {
        return true;
    }

    @Override // defpackage.jj10
    public final ij10 b(View view, boolean z, long j, float f, float f2, boolean z2, mmd mmdVar, float f3) {
        if (z) {
            return new a(new Magnifier(view));
        }
        long jU1 = mmdVar.U1(j);
        float fC1 = mmdVar.C1(f);
        float fC2 = mmdVar.C1(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jU1 != 9205357640488583168L) {
            builder.setSize(ycv.b(Float.intBitsToFloat((int) (jU1 >> 32))), ycv.b(Float.intBitsToFloat((int) (jU1 & 4294967295L))));
        }
        if (!Float.isNaN(fC1)) {
            builder.setCornerRadius(fC1);
        }
        if (!Float.isNaN(fC2)) {
            builder.setElevation(fC2);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new a(builder.build());
    }
}
