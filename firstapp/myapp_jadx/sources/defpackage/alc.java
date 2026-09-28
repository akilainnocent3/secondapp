package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class alc {
    public final String a;
    public final uf00<e3i0> b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final boolean g;

    public alc(String str, uf00<e3i0> uf00Var, boolean z, boolean z2, boolean z3, float f, boolean z4) {
        uf00Var.getClass();
        this.a = str;
        this.b = uf00Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = f;
        this.g = z4;
    }

    public static alc a(alc alcVar, String str, uf00 uf00Var, boolean z, boolean z2, boolean z3, float f, boolean z4, int i) {
        if ((i & 1) != 0) {
            str = alcVar.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            uf00Var = alcVar.b;
        }
        uf00 uf00Var2 = uf00Var;
        if ((i & 4) != 0) {
            z = alcVar.c;
        }
        boolean z5 = z;
        if ((i & 8) != 0) {
            z2 = alcVar.d;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = alcVar.e;
        }
        boolean z7 = z3;
        if ((i & 32) != 0) {
            f = alcVar.f;
        }
        float f2 = f;
        if ((i & 64) != 0) {
            z4 = alcVar.g;
        }
        alcVar.getClass();
        str2.getClass();
        uf00Var2.getClass();
        return new alc(str2, uf00Var2, z5, z6, z7, f2, z4);
    }

    public final float b() {
        e3i0 next;
        Iterator<e3i0> it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            e3i0 e3i0Var = next;
            if (e3i0Var.c > 0 && e3i0Var.d > 0) {
                break;
            }
        }
        e3i0 e3i0Var2 = next;
        if (e3i0Var2 != null) {
            return e3i0Var2.c / e3i0Var2.d;
        }
        return 1.7777778f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alc)) {
            return false;
        }
        alc alcVar = (alc) obj;
        return Intrinsics.g(this.a, alcVar.a) && Intrinsics.g(this.b, alcVar.b) && this.c == alcVar.c && this.d == alcVar.d && this.e == alcVar.e && Float.compare(this.f, alcVar.f) == 0 && this.g == alcVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + tvh.a(this.f, mtg0.a(mtg0.a(mtg0.a(yvz.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomVideoPlayerState(videoId=");
        sb.append(this.a);
        sb.append(", videoSources=");
        sb.append(this.b);
        sb.append(", forceLandscape=");
        nng.a(", isFullscreen=", ", isMuted=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", playbackSpeed=");
        sb.append(this.f);
        sb.append(", isBuffering=");
        return mq0.a(sb, this.g, ")");
    }

    public alc() {
        this(0);
    }

    public alc(int i) {
        this("", n1a0.c, true, false, false, 1.0f, false);
    }
}
