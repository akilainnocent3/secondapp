package defpackage;

import androidx.compose.foundation.layout.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h55 {
    public final tmz a;
    public final tmz b;
    public final tmz c;
    public final tmz d;

    public static final class a {
        public static h55 a(umz umzVar, umz umzVar2, umz umzVar3, umz umzVar4, androidx.compose.runtime.a aVar, int i) {
            if ((i & 1) != 0) {
                umzVar = h.a(2, ((cjb0) aVar.O(ejb0.a)).h, 0.0f);
            }
            if ((i & 2) != 0) {
                umzVar2 = h.a(2, ((cjb0) aVar.O(ejb0.a)).h, 0.0f);
            }
            if ((i & 4) != 0) {
                umzVar3 = h.a(2, ((cjb0) aVar.O(ejb0.a)).h, 0.0f);
            }
            if ((i & 8) != 0) {
                umzVar4 = h.a(2, ((cjb0) aVar.O(ejb0.a)).h, 0.0f);
            }
            return new h55(umzVar, umzVar2, umzVar3, umzVar4);
        }
    }

    public h55(tmz tmzVar, tmz tmzVar2, tmz tmzVar3, tmz tmzVar4) {
        tmzVar.getClass();
        tmzVar2.getClass();
        tmzVar3.getClass();
        tmzVar4.getClass();
        this.a = tmzVar;
        this.b = tmzVar2;
        this.c = tmzVar3;
        this.d = tmzVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h55)) {
            return false;
        }
        h55 h55Var = (h55) obj;
        return Intrinsics.g(this.a, h55Var.a) && Intrinsics.g(this.b, h55Var.b) && Intrinsics.g(this.c, h55Var.c) && Intrinsics.g(this.d, h55Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BottomSheetPadding(headerPadding=" + this.a + ", contentPadding=" + this.b + ", buttonPadding=" + this.c + ", bottomPadding=" + this.d + ")";
    }
}
