package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class p3 extends o implements edp {
    public final wbp b;
    public final Function1<scp, Unit> c;
    public final fcp d;
    public String e;
    public String f;

    /* JADX WARN: Multi-variable type inference failed */
    public p3(wbp wbpVar, Function1<? super scp, Unit> function1) {
        super(2);
        this.b = wbpVar;
        this.c = function1;
        this.d = wbpVar.a;
    }

    @Override // defpackage.o
    public String G(pd80 pd80Var, int i) {
        pd80Var.getClass();
        wbp wbpVar = this.b;
        wbpVar.getClass();
        rdp.d(wbpVar, pd80Var);
        return pd80Var.e(i);
    }

    @Override // defpackage.o
    public final void H(Object obj, boolean z) {
        String str = (String) obj;
        str.getClass();
        Boolean boolValueOf = Boolean.valueOf(z);
        skn sknVar = ucp.a;
        o0(new ndp(boolValueOf, false, null), str);
    }

    @Override // defpackage.o
    public final void I(Object obj, byte b) {
        String str = (String) obj;
        str.getClass();
        o0(ucp.a(Byte.valueOf(b)), str);
    }

    @Override // defpackage.o
    public final void J(Object obj, char c) {
        String str = (String) obj;
        str.getClass();
        o0(ucp.b(String.valueOf(c)), str);
    }

    @Override // defpackage.o
    public final void K(Object obj, double d) {
        String str = (String) obj;
        str.getClass();
        o0(ucp.a(Double.valueOf(d)), str);
        this.d.getClass();
        if (Math.abs(d) <= Double.MAX_VALUE) {
            return;
        }
        Double dValueOf = Double.valueOf(d);
        String string = n0().toString();
        string.getClass();
        throw new gdp(jdp.i(dValueOf, str, string));
    }

    @Override // defpackage.o
    public final void L(Object obj, pd80 pd80Var, int i) {
        String str = (String) obj;
        str.getClass();
        pd80Var.getClass();
        o0(ucp.b(pd80Var.e(i)), str);
    }

    @Override // defpackage.o
    public final void M(Object obj, float f) {
        String str = (String) obj;
        str.getClass();
        o0(ucp.a(Float.valueOf(f)), str);
        this.d.getClass();
        if (Math.abs(f) <= Float.MAX_VALUE) {
            return;
        }
        Float fValueOf = Float.valueOf(f);
        String string = n0().toString();
        string.getClass();
        throw new gdp(jdp.i(fValueOf, str, string));
    }

    @Override // defpackage.o
    public final f4g N(Object obj, pd80 pd80Var) {
        String str = (String) obj;
        str.getClass();
        pd80Var.getClass();
        if (v8e0.a(pd80Var)) {
            return new o3(this, str);
        }
        if (pd80Var.isInline() && pd80Var.equals(ucp.a)) {
            return new n3(this, str, pd80Var);
        }
        ((ArrayList) this.a).add(str);
        return this;
    }

    @Override // defpackage.o
    public final void O(int i, Object obj) {
        String str = (String) obj;
        str.getClass();
        o0(ucp.a(Integer.valueOf(i)), str);
    }

    @Override // defpackage.o
    public final void P(Object obj, long j) {
        String str = (String) obj;
        str.getClass();
        o0(ucp.a(Long.valueOf(j)), str);
    }

    @Override // defpackage.o
    public final void Q(Object obj, short s) {
        String str = (String) obj;
        str.getClass();
        o0(ucp.a(Short.valueOf(s)), str);
    }

    @Override // defpackage.o
    public final void R(Object obj, String str) {
        String str2 = (String) obj;
        str2.getClass();
        str.getClass();
        o0(ucp.b(str), str2);
    }

    @Override // defpackage.o
    public final void T(pd80 pd80Var) {
        pd80Var.getClass();
        this.c.invoke(n0());
    }

    @Override // defpackage.fma
    public final boolean a(pd80 pd80Var) {
        pd80Var.getClass();
        this.d.getClass();
        return false;
    }

    @Override // defpackage.f4g
    public final fma c(pd80 pd80Var) {
        p3 vepVar;
        pd80Var.getClass();
        Function1<scp, Unit> function1 = CollectionsKt.d0((ArrayList) this.a) == null ? this.c : new Function1() { // from class: m3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                scp scpVar = (scp) obj;
                scpVar.getClass();
                p3 p3Var = this.a;
                p3Var.o0(scpVar, (String) CollectionsKt.b0((ArrayList) p3Var.a));
                return Unit.a;
            }
        };
        yd80 kind = pd80Var.getKind();
        boolean zG = Intrinsics.g(kind, ebe0.b.a);
        wbp wbpVar = this.b;
        if (zG || (kind instanceof f120)) {
            vepVar = new vep(wbpVar, function1);
        } else if (Intrinsics.g(kind, ebe0.c.a)) {
            pd80 pd80VarA = v7k0.a(pd80Var.g(0), wbpVar.b);
            yd80 kind2 = pd80VarA.getKind();
            if (!(kind2 instanceof bw20) && !Intrinsics.g(kind2, yd80.b.a)) {
                throw jdp.b(pd80VarA);
            }
            function1.getClass();
            xep xepVar = new xep(wbpVar, function1);
            xepVar.i = true;
            vepVar = xepVar;
        } else {
            vepVar = new tep(wbpVar, function1);
        }
        String str = this.e;
        if (str != null) {
            if (vepVar instanceof xep) {
                xep xepVar2 = (xep) vepVar;
                xepVar2.o0(ucp.b(str), "key");
                String strH = this.f;
                if (strH == null) {
                    strH = pd80Var.h();
                }
                xepVar2.o0(ucp.b(strH), "value");
            } else {
                String strH2 = this.f;
                if (strH2 == null) {
                    strH2 = pd80Var.h();
                }
                vepVar.o0(ucp.b(strH2), str);
            }
            this.e = null;
            this.f = null;
        }
        return vepVar;
    }

    @Override // defpackage.f4g
    public final y3l d() {
        return this.b.b;
    }

    @Override // defpackage.f4g
    public final f4g h(pd80 pd80Var) {
        pd80Var.getClass();
        if (CollectionsKt.d0((ArrayList) this.a) == null) {
            return new eep(this.b, this.c).h(pd80Var);
        }
        if (this.e != null) {
            this.f = pd80Var.h();
        }
        return N(c0(), pd80Var);
    }

    public abstract scp n0();

    public abstract void o0(scp scpVar, String str);

    @Override // defpackage.f4g
    public final void t() {
        String str = (String) CollectionsKt.d0((ArrayList) this.a);
        if (str == null) {
            this.c.invoke(sdp.INSTANCE);
        } else {
            o0(sdp.INSTANCE, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o, defpackage.f4g
    public final <T> void x(he80<? super T> he80Var, T t) {
        String strB;
        he80Var.getClass();
        Object objD0 = CollectionsKt.d0((ArrayList) this.a);
        wbp wbpVar = this.b;
        if (objD0 == null) {
            pd80 pd80VarA = v7k0.a(he80Var.getDescriptor(), wbpVar.b);
            if ((pd80VarA.getKind() instanceof bw20) || pd80VarA.getKind() == yd80.b.a) {
                new eep(wbpVar, this.c).x(he80Var, t);
                return;
            }
        }
        boolean z = he80Var instanceof q4;
        wp7 wp7Var = wbpVar.a.f;
        if (!z) {
            int iOrdinal = wp7Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    yd80 kind = he80Var.getDescriptor().getKind();
                    strB = (Intrinsics.g(kind, ebe0.a.a) || Intrinsics.g(kind, ebe0.d.a)) ? g120.b(wbpVar, he80Var.getDescriptor()) : null;
                } else if (iOrdinal != 2) {
                    uhc.a();
                    return;
                }
            }
        } else if (wp7Var != wp7.a) {
        }
        if (z) {
            q4 q4Var = (q4) he80Var;
            if (t == 0) {
                efx.a(q4Var.getDescriptor(), "Value for serializer ", " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                return;
            }
            he80<? super T> he80VarE = byx.e(q4Var, this, t);
            if (strB != null) {
                g120.c(he80Var, he80VarE, strB);
                g120.a(he80VarE.getDescriptor().getKind());
            }
            he80Var = he80VarE;
        }
        if (strB != null) {
            String strH = he80Var.getDescriptor().h();
            this.e = strB;
            this.f = strH;
        }
        he80Var.serialize(this, t);
    }

    @Override // defpackage.f4g
    public final void z() {
    }
}
