package defpackage;

import com.sportybet.android.instantwin.model.scheduledfootball.ScheduledFootballServerTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ni70 {
    public final x270 a;
    public final ScheduledFootballServerTime b;
    public final List<l770> c;
    public final Set<String> d;
    public final Set<String> e;

    public ni70(x270 x270Var, ScheduledFootballServerTime scheduledFootballServerTime, List<l770> list, Set<String> set, Set<String> set2) {
        x270Var.getClass();
        scheduledFootballServerTime.getClass();
        list.getClass();
        set.getClass();
        set2.getClass();
        this.a = x270Var;
        this.b = scheduledFootballServerTime;
        this.c = list;
        this.d = set;
        this.e = set2;
    }

    public static ni70 a(ni70 ni70Var, ArrayList arrayList) {
        x270 x270Var = ni70Var.a;
        ScheduledFootballServerTime scheduledFootballServerTime = ni70Var.b;
        Set<String> set = ni70Var.d;
        Set<String> set2 = ni70Var.e;
        x270Var.getClass();
        scheduledFootballServerTime.getClass();
        set.getClass();
        set2.getClass();
        return new ni70(x270Var, scheduledFootballServerTime, arrayList, set, set2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni70)) {
            return false;
        }
        ni70 ni70Var = (ni70) obj;
        return Intrinsics.g(this.a, ni70Var.a) && Intrinsics.g(this.b, ni70Var.b) && Intrinsics.g(this.c, ni70Var.c) && Intrinsics.g(this.d, ni70Var.d) && Intrinsics.g(this.e, ni70Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ai50.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "ScheduledFootballSessionData(config=" + this.a + ", serverTime=" + this.b + ", leagues=" + this.c + ", upcomingBetClosedMatchdayIds=" + this.d + ", kickoffMatchdayIds=" + this.e + ")";
    }
}
