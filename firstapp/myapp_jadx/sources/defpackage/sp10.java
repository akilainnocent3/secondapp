package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class sp10 {
    public final String a;
    public final a b;
    public final Object c;

    public static final class a {
        public LogSessionId a = LogSessionId.LOG_SESSION_ID_NONE;

        public final void a(LogSessionId logSessionId) {
            ly0.f(this.a.equals(LogSessionId.LOG_SESSION_ID_NONE));
            this.a = logSessionId;
        }
    }

    static {
        new sp10("");
    }

    public sp10(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new a() : null;
        this.c = new Object();
    }

    public final synchronized LogSessionId a() {
        a aVar;
        aVar = this.b;
        aVar.getClass();
        return aVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp10)) {
            return false;
        }
        sp10 sp10Var = (sp10) obj;
        return Objects.equals(this.a, sp10Var.a) && this.b == sp10Var.b && this.c == sp10Var.c;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
