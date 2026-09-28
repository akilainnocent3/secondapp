package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tkf0 {
    public final nk0 a;
    public final imf0 b;
    public final List<nk0.d<ji10>> c;
    public final int d;
    public final boolean e;
    public final int f;
    public final mmd g;
    public final asr h;
    public final f8i.a i;
    public final long j;

    public tkf0(nk0 nk0Var, imf0 imf0Var, List<nk0.d<ji10>> list, int i, boolean z, int i2, mmd mmdVar, asr asrVar, f8i.a aVar, long j) {
        this.a = nk0Var;
        this.b = imf0Var;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = mmdVar;
        this.h = asrVar;
        this.i = aVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkf0)) {
            return false;
        }
        tkf0 tkf0Var = (tkf0) obj;
        return Intrinsics.g(this.a, tkf0Var.a) && Intrinsics.g(this.b, tkf0Var.b) && Intrinsics.g(this.c, tkf0Var.c) && this.d == tkf0Var.d && this.e == tkf0Var.e && this.f == tkf0Var.f && Intrinsics.g(this.g, tkf0Var.g) && this.h == tkf0Var.h && Intrinsics.g(this.i, tkf0Var.i) && kxa.c(this.j, tkf0Var.j);
    }

    public final int hashCode() {
        return Long.hashCode(this.j) + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + gpp.a(this.f, mtg0.a((ai50.a(gg8.b(this.a.hashCode() * 31, 31, this.b), 31, this.c) + this.d) * 31, 31, this.e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + ((Object) yn70.d(this.f)) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + ((Object) kxa.m(this.j)) + ')';
    }
}
