package androidx.compose.ui.draw;

import androidx.compose.ui.d;
import defpackage.crz;
import defpackage.d0b;
import defpackage.drz;
import defpackage.ht;
import defpackage.l58;
import defpackage.mtg0;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.rcf;
import defpackage.tvh;
import defpackage.yw90;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "Lp3w;", "Ldrz;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class PainterElement extends p3w<drz> {
    public final crz b;
    public final boolean c = true;
    public final ht d;
    public final d0b e;
    public final float f;
    public final l58 g;

    public PainterElement(crz crzVar, ht htVar, d0b d0bVar, float f, l58 l58Var) {
        this.b = crzVar;
        this.d = htVar;
        this.e = d0bVar;
        this.f = f;
        this.g = l58Var;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        drz drzVar = new drz();
        drzVar.D = this.b;
        drzVar.E = this.c;
        drzVar.F = this.d;
        drzVar.G = this.e;
        drzVar.H = this.f;
        drzVar.I = this.g;
        return drzVar;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        drz drzVar = (drz) cVar;
        boolean z = drzVar.E;
        crz crzVar = this.b;
        boolean z2 = this.c;
        boolean z3 = z != z2 || (z2 && !yw90.a(drzVar.D.i(), crzVar.i()));
        drzVar.D = crzVar;
        drzVar.E = z2;
        drzVar.F = this.d;
        drzVar.G = this.e;
        drzVar.H = this.f;
        drzVar.I = this.g;
        if (z3) {
            pkd.f(drzVar).P();
        }
        rcf.a(drzVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) obj;
        return Intrinsics.g(this.b, painterElement.b) && this.c == painterElement.c && Intrinsics.g(this.d, painterElement.d) && Intrinsics.g(this.e, painterElement.e) && Float.compare(this.f, painterElement.f) == 0 && Intrinsics.g(this.g, painterElement.g);
    }

    public final int hashCode() {
        int iA = tvh.a(this.f, (this.e.hashCode() + ((this.d.hashCode() + mtg0.a(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31, 31);
        l58 l58Var = this.g;
        return iA + (l58Var == null ? 0 : l58Var.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.b + ", sizeToIntrinsics=" + this.c + ", alignment=" + this.d + ", contentScale=" + this.e + ", alpha=" + this.f + ", colorFilter=" + this.g + ')';
    }
}
