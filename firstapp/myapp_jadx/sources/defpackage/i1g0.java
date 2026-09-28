package defpackage;

import androidx.compose.runtime.j;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class i1g0 {
    public static final uv60 d = jis.a(new h1g0(), new g1g0());
    public float a;
    public final isw b;
    public final isw c;

    public i1g0(float f, float f2, float f3) {
        this.a = f;
        this.b = j.a(f3);
        this.c = j.a(f2);
    }

    public final float a() {
        if (this.a == 0.0f) {
            return 0.0f;
        }
        return b() / this.a;
    }

    public final float b() {
        return ((t5a0) this.c).j();
    }

    public final void c(float f) {
        ((t5a0) this.c).A(f.d(f, this.a, 0.0f));
    }
}
