package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.d;
import defpackage.f8i;
import defpackage.gg8;
import defpackage.gpp;
import defpackage.hmf0;
import defpackage.imf0;
import defpackage.mtg0;
import defpackage.orz;
import defpackage.p3w;
import defpackage.pkd;
import defpackage.rcf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Lp3w;", "Lhmf0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TextStringSimpleElement extends p3w<hmf0> {
    public final String b;
    public final imf0 c;
    public final f8i.a d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;

    public TextStringSimpleElement(String str, imf0 imf0Var, f8i.a aVar, int i, boolean z, int i2, int i3) {
        this.b = str;
        this.c = imf0Var;
        this.d = aVar;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        hmf0 hmf0Var = new hmf0();
        hmf0Var.D = this.b;
        hmf0Var.E = this.c;
        hmf0Var.F = this.d;
        hmf0Var.G = this.e;
        hmf0Var.H = this.f;
        hmf0Var.I = this.g;
        hmf0Var.J = this.h;
        return hmf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00be  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        f8i.a aVar;
        f8i.a aVar2;
        int i5;
        int i6;
        hmf0 hmf0Var = (hmf0) cVar;
        hmf0Var.getClass();
        imf0 imf0Var = hmf0Var.E;
        boolean z5 = false;
        boolean z6 = true;
        imf0 imf0Var2 = this.c;
        if (imf0Var2 != imf0Var) {
            if (!imf0Var2.a.c(imf0Var.a)) {
                z = true;
            }
            str = hmf0Var.D;
            str2 = this.b;
            if (!Intrinsics.g(str, str2)) {
                hmf0Var.D = str2;
                hmf0Var.N = null;
                z5 = true;
            }
            z2 = !hmf0Var.E.d(imf0Var2);
            hmf0Var.E = imf0Var2;
            i = hmf0Var.J;
            i2 = this.h;
            if (i != i2) {
                hmf0Var.J = i2;
                z2 = true;
            }
            i3 = hmf0Var.I;
            i4 = this.g;
            if (i3 != i4) {
                hmf0Var.I = i4;
                z2 = true;
            }
            z3 = hmf0Var.H;
            z4 = this.f;
            if (z3 != z4) {
                hmf0Var.H = z4;
                z2 = true;
            }
            aVar = hmf0Var.F;
            aVar2 = this.d;
            if (!Intrinsics.g(aVar, aVar2)) {
                hmf0Var.F = aVar2;
                z2 = true;
            }
            i5 = hmf0Var.G;
            i6 = this.e;
            if (i5 == i6) {
                z6 = z2;
            } else {
                hmf0Var.G = i6;
            }
            if (z5 || z6) {
                orz orzVarP2 = hmf0Var.p2();
                String str3 = hmf0Var.D;
                imf0 imf0Var3 = hmf0Var.E;
                f8i.a aVar3 = hmf0Var.F;
                int i7 = hmf0Var.G;
                boolean z7 = hmf0Var.H;
                int i8 = hmf0Var.I;
                int i9 = hmf0Var.J;
                orzVarP2.a = str3;
                orzVarP2.b = imf0Var3;
                orzVarP2.c = aVar3;
                orzVarP2.d = i7;
                orzVarP2.e = z7;
                orzVarP2.f = i8;
                orzVarP2.g = i9;
                orzVarP2.s = (orzVarP2.s << 2) | 2;
                orzVarP2.c();
            }
            if (hmf0Var.C) {
                if (z5 || (z && hmf0Var.M != null)) {
                    pkd.f(hmf0Var).R();
                }
                if (z5 || z6) {
                    pkd.f(hmf0Var).P();
                    rcf.a(hmf0Var);
                }
                if (z) {
                    rcf.a(hmf0Var);
                }
            }
            return;
        }
        imf0Var2.getClass();
        z = false;
        str = hmf0Var.D;
        str2 = this.b;
        if (!Intrinsics.g(str, str2)) {
            hmf0Var.D = str2;
            hmf0Var.N = null;
            z5 = true;
        }
        z2 = !hmf0Var.E.d(imf0Var2);
        hmf0Var.E = imf0Var2;
        i = hmf0Var.J;
        i2 = this.h;
        if (i != i2) {
            hmf0Var.J = i2;
            z2 = true;
        }
        i3 = hmf0Var.I;
        i4 = this.g;
        if (i3 != i4) {
            hmf0Var.I = i4;
            z2 = true;
        }
        z3 = hmf0Var.H;
        z4 = this.f;
        if (z3 != z4) {
            hmf0Var.H = z4;
            z2 = true;
        }
        aVar = hmf0Var.F;
        aVar2 = this.d;
        if (!Intrinsics.g(aVar, aVar2)) {
            hmf0Var.F = aVar2;
            z2 = true;
        }
        i5 = hmf0Var.G;
        i6 = this.e;
        if (i5 == i6) {
            z6 = z2;
        } else {
            hmf0Var.G = i6;
        }
        if (z5) {
            orz orzVarP3 = hmf0Var.p2();
            String str4 = hmf0Var.D;
            imf0 imf0Var4 = hmf0Var.E;
            f8i.a aVar4 = hmf0Var.F;
            int i10 = hmf0Var.G;
            boolean z8 = hmf0Var.H;
            int i11 = hmf0Var.I;
            int i12 = hmf0Var.J;
            orzVarP3.a = str4;
            orzVarP3.b = imf0Var4;
            orzVarP3.c = aVar4;
            orzVarP3.d = i10;
            orzVarP3.e = z8;
            orzVarP3.f = i11;
            orzVarP3.g = i12;
            orzVarP3.s = (orzVarP3.s << 2) | 2;
            orzVarP3.c();
        } else {
            orz orzVarP4 = hmf0Var.p2();
            String str5 = hmf0Var.D;
            imf0 imf0Var5 = hmf0Var.E;
            f8i.a aVar5 = hmf0Var.F;
            int i13 = hmf0Var.G;
            boolean z9 = hmf0Var.H;
            int i14 = hmf0Var.I;
            int i15 = hmf0Var.J;
            orzVarP4.a = str5;
            orzVarP4.b = imf0Var5;
            orzVarP4.c = aVar5;
            orzVarP4.d = i13;
            orzVarP4.e = z9;
            orzVarP4.f = i14;
            orzVarP4.g = i15;
            orzVarP4.s = (orzVarP4.s << 2) | 2;
            orzVarP4.c();
        }
        if (hmf0Var.C) {
            return;
        }
        if (z5) {
            pkd.f(hmf0Var).R();
        } else {
            pkd.f(hmf0Var).R();
        }
        if (z5) {
            pkd.f(hmf0Var).P();
            rcf.a(hmf0Var);
        } else {
            pkd.f(hmf0Var).P();
            rcf.a(hmf0Var);
        }
        if (z) {
            rcf.a(hmf0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return Intrinsics.g(this.b, textStringSimpleElement.b) && Intrinsics.g(this.c, textStringSimpleElement.c) && Intrinsics.g(this.d, textStringSimpleElement.d) && this.e == textStringSimpleElement.e && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g && this.h == textStringSimpleElement.h;
    }

    public final int hashCode() {
        return (((mtg0.a(gpp.a(this.e, (this.d.hashCode() + gg8.b(this.b.hashCode() * 31, 31, this.c)) * 31, 31), 31, this.f) + this.g) * 31) + this.h) * 31;
    }
}
