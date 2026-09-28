package com.sportybet.feature.luckynumber.placebet.presentation;

import defpackage.a1s;
import defpackage.ae80;
import defpackage.b5d;
import defpackage.cgo;
import defpackage.d1r;
import defpackage.dma;
import defpackage.f4g;
import defpackage.fae;
import defpackage.fma;
import defpackage.gae0;
import defpackage.hwr;
import defpackage.jtf0;
import defpackage.kr10;
import defpackage.o1k;
import defpackage.pd80;
import defpackage.php;
import defpackage.ttr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ae80
public final class a {
    public static final b Companion = new b();
    public static final ttr<php<Object>>[] c = {null, hwr.a(a1s.b, new d1r())};
    public final String a;
    public final HowToPlayPresentation b;

    /* JADX INFO: renamed from: com.sportybet.feature.luckynumber.placebet.presentation.a$a, reason: collision with other inner class name */
    @fae
    public static final /* synthetic */ class C0408a implements o1k<a> {
        public static final C0408a a;
        private static final pd80 descriptor;

        static {
            C0408a c0408a = new C0408a();
            a = c0408a;
            kr10 kr10Var = new kr10("com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetNavDestination.HowToPlay", c0408a, 2);
            kr10Var.j("description", false);
            kr10Var.j("presentation", true);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            return new php[]{gae0.a, a.c[1].getValue()};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            ttr<php<Object>>[] ttrVarArr = a.c;
            boolean z = true;
            int i = 0;
            String strJ = null;
            HowToPlayPresentation howToPlayPresentation = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                if (iV == -1) {
                    z = false;
                } else if (iV == 0) {
                    strJ = dmaVarC.j(pd80Var, 0);
                    i |= 1;
                } else {
                    if (iV != 1) {
                        jtf0.a(iV);
                        return null;
                    }
                    howToPlayPresentation = (HowToPlayPresentation) dmaVarC.y(pd80Var, 1, ttrVarArr[1].getValue(), howToPlayPresentation);
                    i |= 2;
                }
            }
            dmaVarC.b(pd80Var);
            return new a(i, strJ, howToPlayPresentation);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            a aVar = (a) obj;
            aVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            ttr<php<Object>>[] ttrVarArr = a.c;
            String str = aVar.a;
            HowToPlayPresentation howToPlayPresentation = aVar.b;
            fmaVarC.o(pd80Var, 0, str);
            if (fmaVarC.a(pd80Var) || howToPlayPresentation != HowToPlayPresentation.DEFAULT) {
                fmaVarC.q(pd80Var, 1, ttrVarArr[1].getValue(), howToPlayPresentation);
            }
            fmaVarC.b(pd80Var);
        }
    }

    public static final class b {
        public final php<a> serializer() {
            return C0408a.a;
        }
    }

    public /* synthetic */ a(int i, String str, HowToPlayPresentation howToPlayPresentation) {
        if (1 != (i & 1)) {
            cgo.a(i, 1, C0408a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = HowToPlayPresentation.DEFAULT;
        } else {
            this.b = howToPlayPresentation;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HowToPlay(description=" + this.a + ", presentation=" + this.b + ")";
    }

    public a(String str, HowToPlayPresentation howToPlayPresentation) {
        str.getClass();
        howToPlayPresentation.getClass();
        this.a = str;
        this.b = howToPlayPresentation;
    }
}
