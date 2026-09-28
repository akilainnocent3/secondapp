package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a2 implements x4b {
    public final float a;

    public a2(float f) {
        this.a = f;
    }

    @Override // defpackage.x4b
    public final float a(RectF rectF) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2) && this.a == ((a2) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return wi1.a(this.a, "px", new StringBuilder());
    }
}
