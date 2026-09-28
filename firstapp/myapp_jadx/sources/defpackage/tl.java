package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class tl implements x4b {
    public final x4b a;
    public final float b;

    public tl(float f, x4b x4bVar) {
        while (x4bVar instanceof tl) {
            x4bVar = ((tl) x4bVar).a;
            f += ((tl) x4bVar).b;
        }
        this.a = x4bVar;
        this.b = f;
    }

    @Override // defpackage.x4b
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl)) {
            return false;
        }
        tl tlVar = (tl) obj;
        return this.a.equals(tlVar.a) && this.b == tlVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
