package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tsg0 {

    public static final class a implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public a(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public static final jlv a(jlv jlvVar) {
        jlv jlvVar2;
        yp40 yp40Var = new yp40();
        yp40Var.a = true;
        if (jlvVar.e != njs.k) {
            yp40Var.a = false;
            jlvVar2 = new jlv(jlvVar.d());
        } else {
            jlvVar2 = new jlv();
        }
        jlvVar2.n(jlvVar, new a(new o0w(1, jlvVar2, yp40Var)));
        return jlvVar2;
    }

    public static final jlv b(ssw sswVar, final Function1 function1) {
        sswVar.getClass();
        final jlv jlvVar = sswVar.e != njs.k ? new jlv(function1.invoke(sswVar.d())) : new jlv();
        jlvVar.n(sswVar, new a(new Function1() { // from class: rsg0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                jlvVar.m(function1.invoke(obj));
                return Unit.a;
            }
        }));
        return jlvVar;
    }

    public static final jlv c(njs njsVar, final Function1 function1) {
        njs njsVar2;
        njsVar.getClass();
        final dq40 dq40Var = new dq40();
        Object obj = njsVar.e;
        Object obj2 = njs.k;
        final jlv jlvVar = (obj == obj2 || (njsVar2 = (njs) function1.invoke(njsVar.d())) == null || njsVar2.e == obj2) ? new jlv() : new jlv(njsVar2.d());
        jlvVar.n(njsVar, new a(new Function1() { // from class: ssg0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v2, types: [T, njs] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                ?? r4 = (njs) function1.invoke(obj3);
                dq40 dq40Var2 = dq40Var;
                T t = dq40Var2.a;
                if (t != r4) {
                    jlv jlvVar2 = jlvVar;
                    if (t != 0) {
                        jlv.a<?> aVarB = jlvVar2.l.b((njs) t);
                        if (aVarB != null) {
                            aVarB.a();
                        }
                    }
                    dq40Var2.a = r4;
                    if (r4 != 0) {
                        jlvVar2.n(r4, new tsg0.a(new kic0(jlvVar2, 1)));
                    }
                }
                return Unit.a;
            }
        }));
        return jlvVar;
    }
}
