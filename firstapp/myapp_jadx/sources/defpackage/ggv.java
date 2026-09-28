package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class ggv implements pdd0 {
    public final String a = "me__daily_streak_tab__view";
    public final int b;

    public ggv(int i) {
        this.b = i;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("streak_day", Integer.valueOf(this.b)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggv)) {
            return false;
        }
        ggv ggvVar = (ggv) obj;
        return this.a.equals(ggvVar.a) && this.b == ggvVar.b;
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return d830.a(this.b, "MeDailyStreakTabViewEvent(name=", this.a, ", streakDays=", ")");
    }
}
