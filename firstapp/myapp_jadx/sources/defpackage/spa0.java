package defpackage;

import android.media.SoundPool;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class spa0 implements co5 {
    public final scn<String, Integer> a;
    public final SoundPool b;

    public spa0(wf00 wf00Var, SoundPool soundPool) {
        wf00Var.getClass();
        soundPool.getClass();
        this.a = wf00Var;
        this.b = soundPool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spa0)) {
            return false;
        }
        spa0 spa0Var = (spa0) obj;
        return Intrinsics.g(this.a, spa0Var.a) && Intrinsics.g(this.b, spa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.co5
    public final void release() {
        this.b.release();
    }

    public final String toString() {
        return "SoundResource(soundUrlMap=" + this.a + ", soundPool=" + this.b + ')';
    }
}
