package defpackage;

import com.appsflyer.internal.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xlr {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public xlr(String str, String str2, String str3, boolean z) {
        m.a(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlr)) {
            return false;
        }
        xlr xlrVar = (xlr) obj;
        return Intrinsics.g(this.a, xlrVar.a) && Intrinsics.g(this.b, xlrVar.b) && Intrinsics.g(this.c, xlrVar.c) && this.d == xlrVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return x9d.a(this.c, ", isSelected=", ")", ux5.a("LanguageItem(languageName=", this.a, ", languageCode=", this.b, ", languageDisplayCode="), this.d);
    }
}
