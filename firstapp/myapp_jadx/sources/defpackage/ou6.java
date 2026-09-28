package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ou6 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final ArrayList f;

    public ou6(String str, String str2, int i, int i2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou6)) {
            return false;
        }
        ou6 ou6Var = (ou6) obj;
        return this.a.equals(ou6Var.a) && this.b.equals(ou6Var.b) && this.c == ou6Var.c && this.d == ou6Var.d && Intrinsics.g(this.e, ou6Var.e) && this.f.equals(ou6Var.f);
    }

    public final int hashCode() {
        int iA = gpp.a(this.d, gpp.a(this.c, gmf0.a(this.a.hashCode() * 31, 31, this.b), 31), 31);
        String str = this.e;
        return this.f.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "CaveConfigurationUiModel(caveName=" + this.a + ", caveImageUrl=" + this.b + ", symbolsFound=" + this.c + ", totalSymbolsCount=" + this.d + ", caveLockedMessage=" + this.e + ", symbolConfiguration=" + this.f + ')';
    }
}
