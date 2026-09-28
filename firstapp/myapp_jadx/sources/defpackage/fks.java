package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fks {

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

    public static final jlv a(njs njsVar, njs njsVar2, njs njsVar3, final gaj gajVar) {
        njsVar3.getClass();
        final jlv jlvVar = new jlv();
        final yp40 yp40Var = new yp40();
        final dq40 dq40Var = new dq40();
        final yp40 yp40Var2 = new yp40();
        final dq40 dq40Var2 = new dq40();
        final yp40 yp40Var3 = new yp40();
        final dq40 dq40Var3 = new dq40();
        jlvVar.n(njsVar, new a(new Function1() { // from class: cks
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                T t;
                T t2;
                yp40Var.a = true;
                dq40Var.a = obj;
                if (yp40Var2.a && yp40Var3.a && obj != 0 && (t = dq40Var2.a) != 0 && (t2 = dq40Var3.a) != 0) {
                    t2.getClass();
                    jlvVar.m(gajVar.invoke(obj, t, t2));
                }
                return Unit.a;
            }
        }));
        jlvVar.n(njsVar2, new a(new Function1() { // from class: dks
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                T t;
                T t2;
                yp40Var2.a = true;
                dq40Var2.a = obj;
                if (yp40Var.a && yp40Var3.a && (t = dq40Var.a) != 0 && obj != 0 && (t2 = dq40Var3.a) != 0) {
                    t2.getClass();
                    jlvVar.m(gajVar.invoke(t, obj, t2));
                }
                return Unit.a;
            }
        }));
        jlvVar.n(njsVar3, new a(new Function1() { // from class: eks
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                T t;
                T t2;
                yp40Var3.a = true;
                dq40Var3.a = obj;
                if (yp40Var.a && yp40Var2.a && (t = dq40Var.a) != 0 && (t2 = dq40Var2.a) != 0 && obj != 0) {
                    obj.getClass();
                    jlvVar.m(gajVar.invoke(t, t2, obj));
                }
                return Unit.a;
            }
        }));
        return jlvVar;
    }

    public static final jlv b(njs njsVar, njs njsVar2, final Function2 function2) {
        njsVar.getClass();
        njsVar2.getClass();
        final jlv jlvVar = new jlv();
        final yp40 yp40Var = new yp40();
        final dq40 dq40Var = new dq40();
        final yp40 yp40Var2 = new yp40();
        final dq40 dq40Var2 = new dq40();
        jlvVar.n(njsVar, new a(new Function1() { // from class: aks
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                T t;
                yp40Var.a = true;
                dq40Var.a = obj;
                if (yp40Var2.a && obj != 0 && (t = dq40Var2.a) != 0) {
                    jlvVar.m(function2.invoke(obj, t));
                }
                return Unit.a;
            }
        }));
        jlvVar.n(njsVar2, new a(new Function1() { // from class: bks
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                T t;
                yp40Var2.a = true;
                dq40Var2.a = obj;
                if (yp40Var.a && (t = dq40Var.a) != 0 && obj != 0) {
                    jlvVar.m(function2.invoke(t, obj));
                }
                return Unit.a;
            }
        }));
        return jlvVar;
    }
}
