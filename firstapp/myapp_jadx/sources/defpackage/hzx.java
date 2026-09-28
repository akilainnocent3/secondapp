package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class hzx implements pdd0 {
    public final String a = AnalyticsEvent.NOTE_EDIT_BTN_CLICK;

    @Override // defpackage.pdd0
    public final HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair("source", "bet_successful"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hzx) && this.a.equals(((hzx) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 574336776;
    }

    public final String toString() {
        return tug.a("NoteEditClick(name=", this.a, ", source=bet_successful)");
    }
}
