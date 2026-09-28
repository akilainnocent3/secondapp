package defpackage;

import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public final class fet implements eet {
    public final LocaleList a;

    public fet(LocaleList localeList) {
        this.a = localeList;
    }

    @Override // defpackage.eet
    public final LocaleList a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((eet) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
