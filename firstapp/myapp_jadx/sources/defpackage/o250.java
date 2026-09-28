package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class o250 implements x4b {
    public final float a;

    public o250(float f) {
        this.a = f;
    }

    @Override // defpackage.x4b
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o250) && this.a == ((o250) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return zk1.a((int) (this.a * 100.0f), "%", new StringBuilder());
    }
}
