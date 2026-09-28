package androidx.compose.foundation;

import defpackage.atu;
import defpackage.ftu;
import defpackage.g7f;
import defpackage.gpp;
import defpackage.itu;
import defpackage.p3w;
import defpackage.x5a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/MarqueeModifierElement;", "Lp3w;", "Lftu;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class MarqueeModifierElement extends p3w<ftu> {
    public final int b;
    public final int c = 1200;
    public final int d;
    public final itu e;
    public final float f;

    public MarqueeModifierElement(int i, int i2, itu ituVar, float f) {
        this.b = i;
        this.d = i2;
        this.e = ituVar;
        this.f = f;
    }

    @Override // defpackage.p3w
    public final androidx.compose.ui.d.c a() {
        return new ftu(this.b, this.c, this.d, this.e, this.f);
    }

    @Override // defpackage.p3w
    public final void d(androidx.compose.ui.d.c cVar) {
        ftu ftuVar = (ftu) cVar;
        ((x5a0) ftuVar.M).setValue(this.e);
        ((x5a0) ftuVar.N).setValue(new atu());
        int i = ftuVar.D;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        float f = this.f;
        if (i == i2 && ftuVar.E == i3 && ftuVar.F == i4 && g7f.b(ftuVar.G, f)) {
            return;
        }
        ftuVar.D = i2;
        ftuVar.E = i3;
        ftuVar.F = i4;
        ftuVar.G = f;
        ftuVar.r2();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarqueeModifierElement)) {
            return false;
        }
        MarqueeModifierElement marqueeModifierElement = (MarqueeModifierElement) obj;
        return this.b == marqueeModifierElement.b && this.c == marqueeModifierElement.c && this.d == marqueeModifierElement.d && Intrinsics.g(this.e, marqueeModifierElement.e) && g7f.b(this.f, marqueeModifierElement.f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + ((this.e.hashCode() + gpp.a(this.d, gpp.a(this.c, gpp.a(0, Integer.hashCode(this.b) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "MarqueeModifierElement(iterations=" + this.b + ", animationMode=Immediately, delayMillis=" + this.c + ", initialDelayMillis=" + this.d + ", spacing=" + this.e + ", velocity=" + ((Object) g7f.c(this.f)) + ')';
    }
}
