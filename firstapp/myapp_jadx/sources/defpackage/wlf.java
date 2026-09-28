package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wlf {
    public final List<Event> a;
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public wlf(List<? extends Event> list, String str) {
        list.getClass();
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlf)) {
            return false;
        }
        wlf wlfVar = (wlf) obj;
        return Intrinsics.g(this.a, wlfVar.a) && this.b.equals(wlfVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EditBetCashOutMeta(eventList=" + this.a + ", maxCashOutAmount=" + this.b + ")";
    }
}
