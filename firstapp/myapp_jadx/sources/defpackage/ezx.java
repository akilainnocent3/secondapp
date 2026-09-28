package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public final class ezx implements pdd0 {
    public final String a = AnalyticsEvent.NOTE_ADD_BTN_CLICK;
    public final String b;

    public ezx(String str) {
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
        if (!(obj instanceof ezx)) {
            return false;
        }
        ezx ezxVar = (ezx) obj;
        return this.a.equals(ezxVar.a) && this.b.equals(ezxVar.b);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("NoteAddClick(name=", this.a, ", source=", this.b, ")");
    }
}
