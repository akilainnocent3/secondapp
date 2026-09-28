package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class gzx implements pdd0 {
    public final String a = AnalyticsEvent.NOTE_DELETE_SUCCESS;
    public final String b;

    public gzx(String str) {
        this.b = str;
    }

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("source", this.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzx)) {
            return false;
        }
        gzx gzxVar = (gzx) obj;
        return this.a.equals(gzxVar.a) && this.b.equals(gzxVar.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("NoteDeleted(name=", this.a, ", source=", this.b, ")");
    }
}
