package defpackage;

import com.sporty.android.core.model.tracking.TrackingKind;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public final class j9i implements pdd0 {
    public final float a;
    public final String b = "font_scale";
    public final TrackingKind c = TrackingKind.Measurement;

    public j9i(float f) {
        this.a = f;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("font_scale", Float.valueOf(this.a)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9i)) {
            return false;
        }
        j9i j9iVar = (j9i) obj;
        return Float.compare(this.a, j9iVar.a) == 0 && this.b.equals(j9iVar.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.pdd0
    public final TrackingKind getTrackingKind() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FontScaleTrackingEvent(fontScale=" + this.a + ", name=" + this.b + ")";
    }
}
