package defpackage;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pmn {
    public final int a;
    public final ijf0 b;
    public final boolean c;
    public final Integer d;
    public final Pair<Integer, String> e;
    public final String f;

    public pmn(int i, ijf0 ijf0Var, boolean z, Integer num, Pair<Integer, String> pair, String str) {
        ijf0Var.getClass();
        this.a = i;
        this.b = ijf0Var;
        this.c = z;
        this.d = num;
        this.e = pair;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmn)) {
            return false;
        }
        pmn pmnVar = (pmn) obj;
        return this.a == pmnVar.a && Intrinsics.g(this.b, pmnVar.b) && this.c == pmnVar.c && Intrinsics.g(this.d, pmnVar.d) && this.e.equals(pmnVar.e) && this.f.equals(pmnVar.f);
    }

    public final int hashCode() {
        int iA = mtg0.a(ey1.b(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        Integer num = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iA + (num == null ? 0 : num.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "InputUIModel(title=" + this.a + ", value=" + this.b + ", showError=" + this.c + ", errorMessage=" + this.d + ", hint=" + this.e + ", currency=" + this.f + ")";
    }
}
