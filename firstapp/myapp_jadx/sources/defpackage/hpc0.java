package defpackage;

import com.appsflyer.internal.x;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class hpc0 implements pdd0 {
    public final String a = "legends__animation__view";
    public final long b;
    public final String c;

    public hpc0(long j, String str) {
        this.b = j;
        this.c = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("duration_timestamp", Long.valueOf(this.b)), new Pair("animation_mode", this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpc0)) {
            return false;
        }
        hpc0 hpc0Var = (hpc0) obj;
        return this.a.equals(hpc0Var.a) && this.b == hpc0Var.b && this.c.equals(hpc0Var.c);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + f87.a(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return pr0.a(x.a(this.b, "AnimationView(name=", this.a, ", durationMs="), ", animationMode=", this.c, ")");
    }
}
