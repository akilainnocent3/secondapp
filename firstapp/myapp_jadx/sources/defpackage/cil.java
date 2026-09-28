package defpackage;

import com.sporty.android.core.model.account.themes.ThemeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cil {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final so1 d;
    public final ThemeConfig e;

    public cil(boolean z, boolean z2, String str, so1 so1Var, ThemeConfig themeConfig) {
        so1Var.getClass();
        themeConfig.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = so1Var;
        this.e = themeConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cil)) {
            return false;
        }
        cil cilVar = (cil) obj;
        return this.a == cilVar.a && this.b == cilVar.b && Intrinsics.g(this.c, cilVar.c) && Intrinsics.g(this.d, cilVar.d) && this.e == cilVar.e;
    }

    public final int hashCode() {
        int iA = mtg0.a(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = cwz.a("HeaderState(showSettings=", ", showDarkMode=", ", nickname=", this.a, this.b);
        sbA.append(this.c);
        sbA.append(", avatarState=");
        sbA.append(this.d);
        sbA.append(", theme=");
        sbA.append(this.e);
        sbA.append(")");
        return sbA.toString();
    }
}
