package defpackage;

import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes8.dex */
public abstract class l3 extends uex implements ncp {
    public final wbp c;
    public final String d;
    public final fcp e;

    public l3(wbp wbpVar, scp scpVar, String str) {
        this.c = wbpVar;
        this.d = str;
        this.e = wbpVar.a;
    }

    @Override // defpackage.uex
    public final char C(Object obj) {
        String str = (String) obj;
        str.getClass();
        scp scpVarT = T(str);
        if (!(scpVarT instanceof bep)) {
            throw jdp.c(-1, scpVarT.toString(), "Expected " + jq40.a(bep.class).k() + ", but had " + jq40.a(scpVarT.getClass()).k() + " as the serialized body of char at element: " + W(str));
        }
        bep bepVar = (bep) scpVarT;
        try {
            String strB = bepVar.b();
            strB.getClass();
            int length = strB.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strB.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            X(bepVar, "char", str);
            throw null;
        }
    }

    @Override // defpackage.b5d
    public boolean D() {
        return !(U() instanceof sdp);
    }

    @Override // defpackage.uex
    public final double H(Object obj) {
        String str = (String) obj;
        str.getClass();
        scp scpVarT = T(str);
        if (!(scpVarT instanceof bep)) {
            throw jdp.c(-1, scpVarT.toString(), "Expected " + jq40.a(bep.class).k() + ", but had " + jq40.a(scpVarT.getClass()).k() + " as the serialized body of double at element: " + W(str));
        }
        bep bepVar = (bep) scpVarT;
        try {
            skn sknVar = ucp.a;
            double d = Double.parseDouble(bepVar.b());
            fcp fcpVar = this.c.a;
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            Double dValueOf = Double.valueOf(d);
            String string = U().toString();
            string.getClass();
            throw jdp.d(-1, jdp.i(dValueOf, str, string));
        } catch (IllegalArgumentException unused) {
            X(bepVar, "double", str);
            throw null;
        }
    }

    @Override // defpackage.uex
    public final int I(Object obj, pd80 pd80Var) {
        String str = (String) obj;
        str.getClass();
        pd80Var.getClass();
        scp scpVarT = T(str);
        String strH = pd80Var.h();
        if (scpVarT instanceof bep) {
            return rdp.b(pd80Var, this.c, ((bep) scpVarT).b(), "");
        }
        throw jdp.c(-1, scpVarT.toString(), "Expected " + jq40.a(bep.class).k() + ", but had " + jq40.a(scpVarT.getClass()).k() + " as the serialized body of " + strH + " at element: " + W(str));
    }

    @Override // defpackage.uex
    public final float J(Object obj) {
        String str = (String) obj;
        str.getClass();
        scp scpVarT = T(str);
        if (!(scpVarT instanceof bep)) {
            throw jdp.c(-1, scpVarT.toString(), "Expected " + jq40.a(bep.class).k() + ", but had " + jq40.a(scpVarT.getClass()).k() + " as the serialized body of float at element: " + W(str));
        }
        bep bepVar = (bep) scpVarT;
        try {
            skn sknVar = ucp.a;
            float f = Float.parseFloat(bepVar.b());
            fcp fcpVar = this.c.a;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            Float fValueOf = Float.valueOf(f);
            String string = U().toString();
            string.getClass();
            throw jdp.d(-1, jdp.i(fValueOf, str, string));
        } catch (IllegalArgumentException unused) {
            X(bepVar, "float", str);
            throw null;
        }
    }

    @Override // defpackage.uex
    public final b5d K(Object obj, pd80 pd80Var) {
        String str = (String) obj;
        str.getClass();
        pd80Var.getClass();
        if (!v8e0.a(pd80Var)) {
            this.a.add(str);
            return this;
        }
        scp scpVarT = T(str);
        String strH = pd80Var.h();
        if (scpVarT instanceof bep) {
            String strB = ((bep) scpVarT).b();
            wbp wbpVar = this.c;
            wbpVar.getClass();
            strB.getClass();
            return new ocp(new v9e0(strB), wbpVar);
        }
        throw jdp.c(-1, scpVarT.toString(), "Expected " + jq40.a(bep.class).k() + ", but had " + jq40.a(scpVarT.getClass()).k() + " as the serialized body of " + strH + " at element: " + W(str));
    }

    @Override // defpackage.uex
    public final int L(Object obj) {
        String str = (String) obj;
        str.getClass();
        scp scpVarT = T(str);
        if (!(scpVarT instanceof bep)) {
            throw jdp.c(-1, scpVarT.toString(), "Expected " + jq40.a(bep.class).k() + ", but had " + jq40.a(scpVarT.getClass()).k() + " as the serialized body of int at element: " + W(str));
        }
        bep bepVar = (bep) scpVarT;
        try {
            long jE = ucp.e(bepVar);
            Integer numValueOf = (-2147483648L > jE || jE > 2147483647L) ? null : Integer.valueOf((int) jE);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            X(bepVar, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(bepVar, "int", str);
            throw null;
        }
    }

    @Override // defpackage.uex
    public final long M(Object obj) {
        String str = (String) obj;
        str.getClass();
        scp scpVarT = T(str);
        if (scpVarT instanceof bep) {
            bep bepVar = (bep) scpVarT;
            try {
                return ucp.e(bepVar);
            } catch (IllegalArgumentException unused) {
                X(bepVar, "long", str);
                throw null;
            }
        }
        throw jdp.c(-1, scpVarT.toString(), "Expected " + jq40.a(bep.class).k() + ", but had " + jq40.a(scpVarT.getClass()).k() + " as the serialized body of long at element: " + W(str));
    }

    @Override // defpackage.uex
    public final short N(Object obj) {
        String str = (String) obj;
        str.getClass();
        scp scpVarT = T(str);
        if (!(scpVarT instanceof bep)) {
            throw jdp.c(-1, scpVarT.toString(), "Expected " + jq40.a(bep.class).k() + ", but had " + jq40.a(scpVarT.getClass()).k() + " as the serialized body of short at element: " + W(str));
        }
        bep bepVar = (bep) scpVarT;
        try {
            long jE = ucp.e(bepVar);
            Short shValueOf = (-32768 > jE || jE > 32767) ? null : Short.valueOf((short) jE);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            X(bepVar, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(bepVar, "short", str);
            throw null;
        }
    }

    @Override // defpackage.uex
    public final String O(Object obj) {
        String str = (String) obj;
        str.getClass();
        scp scpVarT = T(str);
        if (!(scpVarT instanceof bep)) {
            throw jdp.c(-1, scpVarT.toString(), "Expected " + jq40.a(bep.class).k() + ", but had " + jq40.a(scpVarT.getClass()).k() + " as the serialized body of string at element: " + W(str));
        }
        bep bepVar = (bep) scpVarT;
        if (!(bepVar instanceof ndp)) {
            StringBuilder sbA = he.a("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            sbA.append(W(str));
            throw jdp.c(-1, U().toString(), sbA.toString());
        }
        ndp ndpVar = (ndp) bepVar;
        if (ndpVar.a) {
            return ndpVar.c;
        }
        fcp fcpVar = this.c.a;
        StringBuilder sbA2 = he.a("String literal for key '", str, "' should be quoted at element: ");
        sbA2.append(W(str));
        sbA2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw jdp.c(-1, U().toString(), sbA2.toString());
    }

    public abstract scp T(String str);

    public final scp U() {
        scp scpVarT;
        String str = (String) CollectionsKt.d0(this.a);
        return (str == null || (scpVarT = T(str)) == null) ? V() : scpVarT;
    }

    public abstract scp V();

    public final String W(String str) {
        str.getClass();
        return S() + '.' + str;
    }

    public final void X(bep bepVar, String str, String str2) {
        throw jdp.c(-1, U().toString(), "Failed to parse literal '" + bepVar + "' as " + (c.u(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + W(str2));
    }

    @Override // defpackage.uex
    public final boolean a(Object obj) {
        Boolean bool;
        String str = (String) obj;
        str.getClass();
        scp scpVarT = T(str);
        if (!(scpVarT instanceof bep)) {
            throw jdp.c(-1, scpVarT.toString(), "Expected " + jq40.a(bep.class).k() + ", but had " + jq40.a(scpVarT.getClass()).k() + " as the serialized body of boolean at element: " + W(str));
        }
        bep bepVar = (bep) scpVarT;
        try {
            skn sknVar = ucp.a;
            String strB = bepVar.b();
            String[] strArr = dae0.a;
            strB.getClass();
            if (strB.equalsIgnoreCase("true")) {
                bool = Boolean.TRUE;
            } else {
                bool = strB.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            X(bepVar, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(bepVar, "boolean", str);
            throw null;
        }
    }

    @Override // defpackage.dma
    public void b(pd80 pd80Var) {
        pd80Var.getClass();
    }

    @Override // defpackage.b5d
    public dma c(pd80 pd80Var) {
        pd80Var.getClass();
        scp scpVarU = U();
        yd80 kind = pd80Var.getKind();
        boolean zG = Intrinsics.g(kind, ebe0.b.a);
        wbp wbpVar = this.c;
        if (zG || (kind instanceof f120)) {
            String strH = pd80Var.h();
            if (scpVarU instanceof acp) {
                return new uep(wbpVar, (acp) scpVarU);
            }
            throw jdp.c(-1, scpVarU.toString(), "Expected " + jq40.a(acp.class).k() + ", but had " + jq40.a(scpVarU.getClass()).k() + " as the serialized body of " + strH + " at element: " + S());
        }
        if (!Intrinsics.g(kind, ebe0.c.a)) {
            String strH2 = pd80Var.h();
            if (scpVarU instanceof wdp) {
                return new sep(wbpVar, (wdp) scpVarU, this.d, 8);
            }
            throw jdp.c(-1, scpVarU.toString(), "Expected " + jq40.a(wdp.class).k() + ", but had " + jq40.a(scpVarU.getClass()).k() + " as the serialized body of " + strH2 + " at element: " + S());
        }
        pd80 pd80VarA = v7k0.a(pd80Var.g(0), wbpVar.b);
        yd80 kind2 = pd80VarA.getKind();
        if (!(kind2 instanceof bw20) && !Intrinsics.g(kind2, yd80.b.a)) {
            throw jdp.b(pd80VarA);
        }
        String strH3 = pd80Var.h();
        if (scpVarU instanceof wdp) {
            return new wep(wbpVar, (wdp) scpVarU);
        }
        throw jdp.c(-1, scpVarU.toString(), "Expected " + jq40.a(wdp.class).k() + ", but had " + jq40.a(scpVarU.getClass()).k() + " as the serialized body of " + strH3 + " at element: " + S());
    }

    @Override // defpackage.dma
    public final y3l d() {
        return this.c.b;
    }

    @Override // defpackage.ncp
    public final scp h() {
        return U();
    }

    @Override // defpackage.b5d
    public final b5d l(pd80 pd80Var) {
        pd80Var.getClass();
        if (CollectionsKt.d0(this.a) != null) {
            return K(R(), pd80Var);
        }
        return new dep(this.c, V(), this.d).l(pd80Var);
    }

    @Override // defpackage.uex
    public final byte w(Object obj) {
        String str = (String) obj;
        str.getClass();
        scp scpVarT = T(str);
        if (!(scpVarT instanceof bep)) {
            throw jdp.c(-1, scpVarT.toString(), "Expected " + jq40.a(bep.class).k() + ", but had " + jq40.a(scpVarT.getClass()).k() + " as the serialized body of byte at element: " + W(str));
        }
        bep bepVar = (bep) scpVarT;
        try {
            long jE = ucp.e(bepVar);
            Byte bValueOf = (-128 > jE || jE > 127) ? null : Byte.valueOf((byte) jE);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            X(bepVar, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(bepVar, "byte", str);
            throw null;
        }
    }

    @Override // defpackage.uex, defpackage.b5d
    public final <T> T z(tae<? extends T> taeVar) {
        taeVar.getClass();
        if (!(taeVar instanceof q4)) {
            return taeVar.deserialize(this);
        }
        wbp wbpVar = this.c;
        fcp fcpVar = wbpVar.a;
        q4 q4Var = (q4) taeVar;
        String strB = g120.b(wbpVar, q4Var.getDescriptor());
        scp scpVarU = U();
        String strH = q4Var.getDescriptor().h();
        if (!(scpVarU instanceof wdp)) {
            throw jdp.c(-1, scpVarU.toString(), "Expected " + jq40.a(wdp.class).k() + ", but had " + jq40.a(scpVarU.getClass()).k() + " as the serialized body of " + strH + " at element: " + S());
        }
        wdp wdpVar = (wdp) scpVarU;
        scp scpVar = (scp) wdpVar.get(strB);
        String strB2 = null;
        if (scpVar != null) {
            bep bepVarD = ucp.d(scpVar);
            if (!(bepVarD instanceof sdp)) {
                strB2 = bepVarD.b();
            }
        }
        try {
            return (T) a54.a(wbpVar, strB, wdpVar, byx.d((q4) taeVar, this, strB2));
        } catch (ee80 e) {
            String message = e.getMessage();
            message.getClass();
            throw jdp.c(-1, wdpVar.toString(), message);
        }
    }
}
