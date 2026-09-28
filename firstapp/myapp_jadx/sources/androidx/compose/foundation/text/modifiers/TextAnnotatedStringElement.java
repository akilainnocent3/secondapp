package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.d;
import defpackage.f8i;
import defpackage.gg8;
import defpackage.gpp;
import defpackage.if1;
import defpackage.imf0;
import defpackage.ji10;
import defpackage.lk40;
import defpackage.mtg0;
import defpackage.nk0;
import defpackage.p3w;
import defpackage.ukf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Lp3w;", "Landroidx/compose/foundation/text/modifiers/b;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextAnnotatedStringElement extends p3w<b> {
    public final nk0 b;
    public final imf0 c;
    public final f8i.a d;
    public final Function1<ukf0, Unit> e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final List<nk0.d<ji10>> j;
    public final Function1<List<lk40>, Unit> k;
    public final if1 l;
    public final Function1<b.a, Unit> m;

    public TextAnnotatedStringElement(nk0 nk0Var, imf0 imf0Var, f8i.a aVar, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, if1 if1Var, Function1 function3) {
        this.b = nk0Var;
        this.c = imf0Var;
        this.d = aVar;
        this.e = function1;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = list;
        this.k = function2;
        this.l = if1Var;
        this.m = function3;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        return new b(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null, this.l, this.m);
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        boolean z;
        b bVar = (b) cVar;
        imf0 imf0Var = bVar.E;
        imf0 imf0Var2 = this.c;
        if (imf0Var2 != imf0Var) {
            if (!imf0Var2.a.c(imf0Var.a)) {
                z = true;
            }
            bVar.p2(z, bVar.u2(this.b), bVar.t2(this.c, this.j, this.i, this.h, this.g, this.d, this.f, this.l), bVar.s2(this.e, this.k, null, this.m));
        }
        imf0Var2.getClass();
        z = false;
        bVar.p2(z, bVar.u2(this.b), bVar.t2(this.c, this.j, this.i, this.h, this.g, this.d, this.f, this.l), bVar.s2(this.e, this.k, null, this.m));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return Intrinsics.g(this.b, textAnnotatedStringElement.b) && Intrinsics.g(this.c, textAnnotatedStringElement.c) && Intrinsics.g(this.j, textAnnotatedStringElement.j) && Intrinsics.g(this.d, textAnnotatedStringElement.d) && this.e == textAnnotatedStringElement.e && this.m == textAnnotatedStringElement.m && this.f == textAnnotatedStringElement.f && this.g == textAnnotatedStringElement.g && this.h == textAnnotatedStringElement.h && this.i == textAnnotatedStringElement.i && this.k == textAnnotatedStringElement.k;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + gg8.b(this.b.hashCode() * 31, 31, this.c)) * 31;
        Function1<ukf0, Unit> function1 = this.e;
        int iA = (((mtg0.a(gpp.a(this.f, (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.g) + this.h) * 31) + this.i) * 31;
        List<nk0.d<ji10>> list = this.j;
        int iHashCode2 = (iA + (list != null ? list.hashCode() : 0)) * 31;
        Function1<List<lk40>, Unit> function2 = this.k;
        int iHashCode3 = (iHashCode2 + (function2 != null ? function2.hashCode() : 0)) * 29791;
        Function1<b.a, Unit> function3 = this.m;
        return iHashCode3 + (function3 != null ? function3.hashCode() : 0);
    }
}
