package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class huc implements guc {
    public final LinkedHashMap a = new LinkedHashMap();

    @Override // defpackage.guc
    public final String a(Long l, Locale locale) {
        return hu5.a(l.longValue(), "yMMMM", locale, this.a);
    }

    @Override // defpackage.guc
    public final String b(Long l, Locale locale, boolean z) {
        if (l == null) {
            return null;
        }
        return hu5.a(l.longValue(), z ? "yMMMMEEEEd" : "yMMMd", locale, this.a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof huc;
    }

    public final int hashCode() {
        return 436998964;
    }
}
