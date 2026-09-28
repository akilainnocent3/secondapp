package defpackage;

import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final class zwz implements uni0 {
    public final char a = 8226;

    public zwz(int i) {
    }

    @Override // defpackage.uni0
    public final wsg0 a(nk0 nk0Var) {
        return new wsg0(new nk0(c.o(nk0Var.b.length(), String.valueOf(this.a))), mly.a.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zwz) {
            return this.a == ((zwz) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Character.hashCode(this.a);
    }
}
