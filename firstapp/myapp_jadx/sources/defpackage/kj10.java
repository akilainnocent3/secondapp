package defpackage;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: loaded from: classes.dex */
public final class kj10 implements jj10 {
    public static final kj10 a = new kj10();

    public static class a implements ij10 {
        public final Magnifier a;

        public a(Magnifier magnifier) {
            this.a = magnifier;
        }

        @Override // defpackage.ij10
        public final long a() {
            return (((long) this.a.getWidth()) << 32) | (((long) this.a.getHeight()) & 4294967295L);
        }

        @Override // defpackage.ij10
        public final void b() {
            this.a.update();
        }

        @Override // defpackage.ij10
        public void c(float f, long j, long j2) {
            this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }

        @Override // defpackage.ij10
        public final void dismiss() {
            this.a.dismiss();
        }
    }

    @Override // defpackage.jj10
    public final boolean a() {
        return false;
    }

    @Override // defpackage.jj10
    public final ij10 b(View view, boolean z, long j, float f, float f2, boolean z2, mmd mmdVar, float f3) {
        return new a(new Magnifier(view));
    }
}
