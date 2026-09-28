package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class or5 {
    public final String a;
    public final int b;
    public final String c;
    public final Event d;

    public or5(String str, int i, String str2, Event event) {
        str.getClass();
        str2.getClass();
        event.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = event;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or5)) {
            return false;
        }
        or5 or5Var = (or5) obj;
        return Intrinsics.g(this.a, or5Var.a) && this.b == or5Var.b && Intrinsics.g(this.c, or5Var.c) && Intrinsics.g(this.d, or5Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(gpp.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = ml5.a(this.b, "CacheEvent(eventId=", this.a, ", productType=", ", language=");
        sbA.append(this.c);
        sbA.append(", event=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
