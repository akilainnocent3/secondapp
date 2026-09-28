package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class izx implements pdd0 {
    public final String a = AnalyticsEvent.NOTE_EDIT_SUCCESS;
    public final String b;

    public izx(String str) {
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
        if (!(obj instanceof izx)) {
            return false;
        }
        izx izxVar = (izx) obj;
        return this.a.equals(izxVar.a) && this.b.equals(izxVar.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("NoteEdited(name=", this.a, ", source=", this.b, ")");
    }
}
