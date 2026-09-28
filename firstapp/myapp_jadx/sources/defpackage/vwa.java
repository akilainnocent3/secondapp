package defpackage;

import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.Reader;
import com.sportybet.plugin.realsports.home.featuredsection.lAly.lTGEJfVytU;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vwa {

    public static class a implements b {
        public boolean a;
        public String b;
        public String c;
        public float d;
        public float e;

        @Override // vwa.b
        public final float value() {
            float f = this.d;
            if (f >= this.e) {
                this.a = true;
            }
            if (this.a) {
                return f;
            }
            float f2 = f + 1.0f;
            this.d = f2;
            return f2;
        }
    }

    public interface b {
        float value();
    }

    public static class c implements b {
        public float a;
        public float b;

        @Override // vwa.b
        public final float value() {
            float f = this.b + this.a;
            this.b = f;
            return f;
        }
    }

    public static class d {
        public HashMap<String, Integer> a;
        public HashMap<String, b> b;
        public HashMap<String, ArrayList<String>> c;

        public final float a(fm5 fm5Var) {
            HashMap<String, Integer> map = this.a;
            HashMap<String, b> map2 = this.b;
            if (!(fm5Var instanceof lm5)) {
                if (fm5Var instanceof hm5) {
                    return ((hm5) fm5Var).c();
                }
                return 0.0f;
            }
            String strB = ((lm5) fm5Var).b();
            if (map2.containsKey(strB)) {
                return map2.get(strB).value();
            }
            if (map.containsKey(strB)) {
                return map.get(strB).floatValue();
            }
            return 0.0f;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    public static void b(int i, rwd0 rwd0Var, d dVar, cm5 cm5Var) throws jm5 {
        String strB;
        gw6 gw6Var = i == 0 ? (ojm) rwd0Var.e(rwd0.d.a) : (v2i0) rwd0Var.e(rwd0.d.b);
        fm5 fm5VarJ = cm5Var.j(1);
        if (fm5VarJ instanceof cm5) {
            cm5 cm5Var2 = (cm5) fm5VarJ;
            if (cm5Var2.e.size() < 1) {
                return;
            }
            for (int i2 = 0; i2 < cm5Var2.e.size(); i2++) {
                gw6Var.q(cm5Var2.o(i2));
            }
            if (cm5Var.e.size() > 2) {
                fm5 fm5VarJ2 = cm5Var.j(2);
                if (fm5VarJ2 instanceof im5) {
                    im5 im5Var = (im5) fm5VarJ2;
                    ArrayList<String> arrayListS = im5Var.s();
                    int size = arrayListS.size();
                    int i3 = 0;
                    while (i3 < size) {
                        String str = arrayListS.get(i3);
                        i3++;
                        String str2 = str;
                        str2.getClass();
                        if (str2.equals("style")) {
                            fm5 fm5VarK = im5Var.k(str2);
                            if (fm5VarK instanceof cm5) {
                                cm5 cm5Var3 = (cm5) fm5VarK;
                                if (cm5Var3.e.size() > 1) {
                                    strB = cm5Var3.o(0);
                                    gw6Var.n0 = cm5Var3.getFloat(1);
                                } else {
                                    strB = fm5VarK.b();
                                }
                            } else {
                                strB = fm5VarK.b();
                            }
                            if (strB.equals("packed")) {
                                gw6Var.t0 = rwd0.a.c;
                            } else if (strB.equals("spread_inside")) {
                                gw6Var.t0 = rwd0.a.b;
                            } else {
                                gw6Var.t0 = rwd0.a.a;
                            }
                        } else {
                            c(im5Var, gw6Var, dVar, rwd0Var, str2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x00f8. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r25v0, types: [rwa] */
    /* JADX WARN: Type inference failed for: r27v0, types: [rwd0] */
    public static void c(im5 im5Var, rwa rwaVar, d dVar, rwd0 rwd0Var, String str) throws jm5 {
        boolean z;
        char c2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = rwd0Var.b;
        fm5 fm5VarN = im5Var.n(str);
        cm5 cm5Var = fm5VarN instanceof cm5 ? (cm5) fm5VarN : null;
        ?? r16 = -1;
        r16 = -1;
        r16 = -1;
        r16 = -1;
        rwd0.b bVar = rwd0.b.D;
        rwd0.b bVar2 = rwd0.b.d;
        rwd0.b bVar3 = rwd0.b.a;
        if (cm5Var != null) {
            if (cm5Var.e.size() > 1) {
                String strO = cm5Var.o(0);
                fm5 fm5VarM = cm5Var.m(1);
                String strB = fm5VarM instanceof lm5 ? fm5VarM.b() : null;
                float fA = cm5Var.e.size() > 2 ? rwd0Var.a.a(dVar.a(cm5Var.m(2))) : 0.0f;
                float fA2 = cm5Var.e.size() > 3 ? rwd0Var.a.a(dVar.a(cm5Var.m(3))) : 0.0f;
                rwa rwaVarB = strO.equals("parent") ? rwd0Var.b(0) : rwd0Var.b(strO);
                str.getClass();
                switch (str) {
                    case "baseline":
                        z = true;
                        c2 = 2;
                        strB.getClass();
                        switch (strB) {
                            case "baseline":
                                rwd0Var.a(rwaVar.a);
                                rwd0Var.a(rwaVarB.a);
                                rwaVar.d0 = bVar;
                                rwaVar.X = rwaVarB;
                                break;
                            case "bottom":
                                rwd0Var.a(rwaVar.a);
                                rwaVar.d0 = rwd0.b.F;
                                rwaVar.Z = rwaVarB;
                                break;
                            case "top":
                                rwd0Var.a(rwaVar.a);
                                rwaVar.d0 = rwd0.b.E;
                                rwaVar.Y = rwaVarB;
                                break;
                        }
                        z2 = z;
                        z3 = false;
                        break;
                    case "circular":
                        z = true;
                        float fA3 = dVar.a(cm5Var.j(1));
                        float fA4 = cm5Var.e.size() > 2 ? rwd0Var.a.a(dVar.a(cm5Var.m(2))) : 0.0f;
                        rwaVar.a0 = rwaVar.j(rwaVarB);
                        rwaVar.b0 = fA3;
                        rwaVar.c0 = fA4;
                        rwaVar.d0 = rwd0.b.G;
                        c2 = 2;
                        z2 = z;
                        z3 = false;
                        break;
                    case "bottom":
                        strB.getClass();
                        switch (strB) {
                            case "baseline":
                                rwd0Var.a(rwaVarB.a);
                                rwaVar.d0 = rwd0.b.C;
                                rwaVar.W = rwaVarB;
                                break;
                            case "bottom":
                                rwaVar.e(rwaVarB);
                                break;
                            case "top":
                                rwaVar.d0 = rwd0.b.A;
                                rwaVar.U = rwaVarB;
                                break;
                        }
                        z = true;
                        c2 = 2;
                        z2 = z;
                        z3 = false;
                        break;
                    case "end":
                        z2 = !z5;
                        z = true;
                        c2 = 2;
                        z3 = true;
                        break;
                    case "top":
                        strB.getClass();
                        switch (strB) {
                            case "baseline":
                                rwd0Var.a(rwaVarB.a);
                                rwaVar.d0 = rwd0.b.z;
                                rwaVar.T = rwaVarB;
                                break;
                            case "bottom":
                                rwaVar.d0 = rwd0.b.y;
                                rwaVar.S = rwaVarB;
                                break;
                            case "top":
                                rwaVar.p(rwaVarB);
                                break;
                        }
                        z = true;
                        c2 = 2;
                        z2 = z;
                        z3 = false;
                        break;
                    case "left":
                        z2 = true;
                        z = true;
                        c2 = 2;
                        z3 = true;
                        break;
                    case "right":
                        z2 = false;
                        z = true;
                        c2 = 2;
                        z3 = true;
                        break;
                    case "start":
                        z2 = z5;
                        z = true;
                        c2 = 2;
                        z3 = true;
                        break;
                    default:
                        z = true;
                        c2 = 2;
                        z2 = z;
                        z3 = false;
                        break;
                }
                if (z3) {
                    strB.getClass();
                    switch (strB.hashCode()) {
                        case 100571:
                            if (strB.equals("end")) {
                                r16 = 0;
                            }
                            break;
                        case 108511772:
                            if (strB.equals("right")) {
                                r16 = z;
                            }
                            break;
                        case 109757538:
                            if (strB.equals("start")) {
                                r16 = c2;
                            }
                            break;
                    }
                    switch (r16) {
                        case 0:
                            z4 = !z5;
                            break;
                        case 1:
                            z4 = false;
                            break;
                        case 2:
                            z4 = z5;
                            break;
                        default:
                            z4 = z;
                            break;
                    }
                    if (z2) {
                        if (z4) {
                            rwaVar.d0 = bVar3;
                            rwaVar.J = rwaVarB;
                        } else {
                            rwaVar.d0 = rwd0.b.b;
                            rwaVar.K = rwaVarB;
                        }
                    } else if (z4) {
                        rwaVar.d0 = rwd0.b.c;
                        rwaVar.L = rwaVarB;
                    } else {
                        rwaVar.d0 = bVar2;
                        rwaVar.M = rwaVarB;
                    }
                }
                rwaVar.l(Float.valueOf(fA)).n(Float.valueOf(fA2));
            }
            bVar2 = bVar2;
        }
        String strQ = im5Var.q(str);
        if (strQ != null) {
            rwa rwaVarB2 = strQ.equals("parent") ? rwd0Var.b(0) : rwd0Var.b(strQ);
            str.getClass();
            switch (str) {
                case "baseline":
                    rwd0Var.a(rwaVar.a);
                    rwd0Var.a(rwaVarB2.a);
                    rwaVar.d0 = bVar;
                    rwaVar.X = rwaVarB2;
                    break;
                case "bottom":
                    rwaVar.e(rwaVarB2);
                    break;
                case "end":
                    if (z5) {
                        rwaVar.d0 = bVar2;
                        rwaVar.M = rwaVarB2;
                        break;
                    } else {
                        rwaVar.d0 = bVar3;
                        rwaVar.J = rwaVarB2;
                        break;
                    }
                    break;
                case "top":
                    rwaVar.p(rwaVarB2);
                    break;
                case "start":
                    if (z5) {
                        rwaVar.d0 = bVar3;
                        rwaVar.J = rwaVarB2;
                        break;
                    } else {
                        rwaVar.d0 = bVar2;
                        rwaVar.M = rwaVarB2;
                        break;
                    }
                    break;
            }
        }
    }

    public static cqe d(im5 im5Var, String str, rwd0 rwd0Var, ax5 ax5Var) throws jm5 {
        fm5 fm5VarK = im5Var.k(str);
        cqe cqeVarB = cqe.b(0);
        if (fm5VarK instanceof lm5) {
            return e(fm5VarK.b());
        }
        if (fm5VarK instanceof hm5) {
            return cqe.b(rwd0Var.c(Float.valueOf(ax5Var.a(im5Var.l(str)))));
        }
        if (fm5VarK instanceof im5) {
            im5 im5Var2 = (im5) fm5VarK;
            String strQ = im5Var2.q("value");
            if (strQ != null) {
                cqeVarB = e(strQ);
            }
            fm5 fm5VarN = im5Var2.n("min");
            if (fm5VarN != null) {
                if (fm5VarN instanceof hm5) {
                    int iC = rwd0Var.c(Float.valueOf(ax5Var.a(((hm5) fm5VarN).c())));
                    if (iC >= 0) {
                        cqeVarB.a = iC;
                    }
                } else if (fm5VarN instanceof lm5) {
                    cqeVarB.a = -2;
                }
            }
            fm5 fm5VarN2 = im5Var2.n("max");
            if (fm5VarN2 != null) {
                if (fm5VarN2 instanceof hm5) {
                    int iC2 = rwd0Var.c(Float.valueOf(ax5Var.a(((hm5) fm5VarN2).c())));
                    if (cqeVarB.b >= 0) {
                        cqeVarB.b = iC2;
                        return cqeVarB;
                    }
                } else if ((fm5VarN2 instanceof lm5) && cqeVarB.g) {
                    cqeVarB.f = cqe.i;
                    cqeVarB.b = Reader.READ_DONE;
                }
            }
        }
        return cqeVarB;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static cqe e(String str) {
        cqe cqeVarB = cqe.b(0);
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    b2 = 0;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    b2 = 1;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    b2 = 2;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    b2 = 3;
                }
                break;
        }
        String str2 = cqe.i;
        String str3 = cqe.j;
        switch (b2) {
            case 0:
                return cqe.c(str2);
            case 1:
                return new cqe(cqe.k);
            case 2:
                return cqe.c(str3);
            case 3:
                return new cqe(str2);
            default:
                if (str.endsWith("%")) {
                    float f = Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f;
                    cqe cqeVar = new cqe(cqe.l);
                    cqeVar.c = f;
                    cqeVar.g = true;
                    cqeVar.b = 0;
                    return cqeVar;
                }
                if (!str.contains(":")) {
                    return cqeVarB;
                }
                cqe cqeVar2 = new cqe(cqe.m);
                cqeVar2.e = str;
                cqeVar2.f = str3;
                cqeVar2.g = true;
                return cqeVar2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e6  */
    public static void f(int i, rwd0 rwd0Var, String str, im5 im5Var) throws jm5 {
        boolean z;
        boolean z2;
        ArrayList<String> arrayListS = im5Var.s();
        rwa rwaVarB = rwd0Var.b(str);
        if (i == 0) {
            rwd0Var.d(0, str);
        } else {
            rwd0Var.d(1, str);
        }
        boolean z3 = rwd0Var.b || i == 0;
        sal salVar = (sal) rwaVarB.c;
        int size = arrayListS.size();
        boolean z4 = false;
        int i2 = 0;
        boolean z5 = true;
        float fL = 0.0f;
        while (i2 < size) {
            String str2 = arrayListS.get(i2);
            i2++;
            String str3 = str2;
            str3.getClass();
            switch (str3) {
                case "percent":
                    fm5 fm5VarN = im5Var.n(str3);
                    cm5 cm5Var = fm5VarN instanceof cm5 ? (cm5) fm5VarN : null;
                    if (cm5Var != null) {
                        z = true;
                        if (cm5Var.e.size() > 1) {
                            z2 = false;
                            String strO = cm5Var.o(0);
                            float f = cm5Var.getFloat(1);
                            switch (strO) {
                                case "end":
                                    z5 = !z3;
                                    fL = f;
                                    break;
                                case "left":
                                    fL = f;
                                    z4 = true;
                                    z5 = true;
                                    break;
                                case "right":
                                    fL = f;
                                    z5 = false;
                                    break;
                                case "start":
                                    z5 = z3;
                                    fL = f;
                                    break;
                                default:
                                    fL = f;
                                    break;
                            }
                        } else {
                            z2 = false;
                        }
                        z4 = true;
                        break;
                    } else {
                        fL = im5Var.l(str3);
                        z4 = true;
                        z5 = true;
                        z2 = false;
                        z = true;
                        break;
                    }
                    break;
                case "end":
                    fL = rwd0Var.a.a(im5Var.l(str3));
                    z5 = !z3;
                    z2 = false;
                    z = true;
                    break;
                case "left":
                    fL = rwd0Var.a.a(im5Var.l(str3));
                    z5 = true;
                    z2 = false;
                    z = true;
                    break;
                case "right":
                    fL = rwd0Var.a.a(im5Var.l(str3));
                    z5 = false;
                    z2 = false;
                    z = true;
                    break;
                case "start":
                    fL = rwd0Var.a.a(im5Var.l(str3));
                    z5 = z3;
                    z2 = false;
                    z = true;
                    break;
                default:
                    z2 = false;
                    z = true;
                    break;
            }
        }
        if (z4) {
            if (z5) {
                salVar.d = -1;
                salVar.e = -1;
                salVar.f = fL;
                return;
            } else {
                salVar.d = -1;
                salVar.e = -1;
                salVar.f = 1.0f - fL;
                return;
            }
        }
        if (z5) {
            salVar.d = salVar.a.c(Float.valueOf(fL));
            salVar.e = -1;
            salVar.f = 0.0f;
        } else {
            Float fValueOf = Float.valueOf(fL);
            salVar.d = -1;
            salVar.e = salVar.a.c(fValueOf);
            salVar.f = 0.0f;
        }
    }

    public static void g(rwd0 rwd0Var, d dVar, String str, im5 im5Var) throws jm5 {
        rwa rwaVarB = rwd0Var.b(str);
        cqe cqeVar = rwaVarB.e0;
        ArrayList<String> arrayListS = im5Var.s();
        int size = arrayListS.size();
        int i = 0;
        while (i < size) {
            String str2 = arrayListS.get(i);
            i++;
            a(im5Var, rwaVarB, dVar, rwd0Var, str2);
        }
    }

    public static void a(im5 im5Var, rwa rwaVar, d dVar, rwd0 rwd0Var, String str) throws jm5 {
        byte b2;
        long j;
        byte b3;
        int i = 0;
        str.getClass();
        switch (str.hashCode()) {
            case -1448775240:
                b2 = !str.equals("centerVertically") ? (byte) -1 : (byte) 0;
                break;
            case -1364013995:
                b2 = !str.equals("center") ? (byte) -1 : (byte) 1;
                break;
            case -1349088399:
                b2 = !str.equals("custom") ? (byte) -1 : (byte) 2;
                break;
            case -1249320806:
                b2 = !str.equals("rotationX") ? (byte) -1 : (byte) 3;
                break;
            case -1249320805:
                b2 = !str.equals("rotationY") ? (byte) -1 : (byte) 4;
                break;
            case -1249320804:
                b2 = !str.equals("rotationZ") ? (byte) -1 : (byte) 5;
                break;
            case -1225497657:
                b2 = !str.equals("translationX") ? (byte) -1 : (byte) 6;
                break;
            case -1225497656:
                b2 = !str.equals("translationY") ? (byte) -1 : (byte) 7;
                break;
            case -1225497655:
                b2 = !str.equals(lTGEJfVytU.LsmWwrneA) ? (byte) -1 : (byte) 8;
                break;
            case -1221029593:
                b2 = !str.equals("height") ? (byte) -1 : (byte) 9;
                break;
            case -1068318794:
                b2 = !str.equals("motion") ? (byte) -1 : (byte) 10;
                break;
            case -987906986:
                b2 = !str.equals("pivotX") ? (byte) -1 : (byte) 11;
                break;
            case -987906985:
                b2 = !str.equals("pivotY") ? (byte) -1 : (byte) 12;
                break;
            case -908189618:
                b2 = !str.equals("scaleX") ? (byte) -1 : (byte) 13;
                break;
            case -908189617:
                b2 = !str.equals("scaleY") ? (byte) -1 : (byte) 14;
                break;
            case -247669061:
                b2 = !str.equals("hRtlBias") ? (byte) -1 : (byte) 15;
                break;
            case -61505906:
                b2 = !str.equals("vWeight") ? (byte) -1 : (byte) 16;
                break;
            case 92909918:
                b2 = !str.equals("alpha") ? (byte) -1 : (byte) 17;
                break;
            case 98116417:
                b2 = !str.equals("hBias") ? (byte) -1 : (byte) 18;
                break;
            case 111045711:
                b2 = !str.equals("vBias") ? (byte) -1 : (byte) 19;
                break;
            case 113126854:
                b2 = !str.equals("width") ? (byte) -1 : (byte) 20;
                break;
            case 398344448:
                b2 = !str.equals("hWeight") ? (byte) -1 : (byte) 21;
                break;
            case 1404070310:
                b2 = !str.equals("centerHorizontally") ? (byte) -1 : (byte) 22;
                break;
            case 1941332754:
                b2 = !str.equals("visibility") ? (byte) -1 : (byte) 23;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                String strP = im5Var.p(str);
                rwa rwaVarB = strP.equals("parent") ? rwd0Var.b(0) : rwd0Var.b(strP);
                rwaVar.p(rwaVarB);
                rwaVar.e(rwaVarB);
                return;
            case 1:
                String strP2 = im5Var.p(str);
                rwa rwaVarB2 = strP2.equals("parent") ? rwd0Var.b(0) : rwd0Var.b(strP2);
                rwaVar.o(rwaVarB2);
                rwaVar.i(rwaVarB2);
                rwaVar.p(rwaVarB2);
                rwaVar.e(rwaVarB2);
                return;
            case 2:
                fm5 fm5VarN = im5Var.n(str);
                im5 im5Var2 = fm5VarN instanceof im5 ? (im5) fm5VarN : null;
                if (im5Var2 == null) {
                    return;
                }
                ArrayList<String> arrayListS = im5Var2.s();
                int size = arrayListS.size();
                while (i < size) {
                    String str2 = arrayListS.get(i);
                    i++;
                    String str3 = str2;
                    fm5 fm5VarK = im5Var2.k(str3);
                    if (fm5VarK instanceof hm5) {
                        rwaVar.j0.put(str3, Float.valueOf(fm5VarK.c()));
                    } else if (fm5VarK instanceof lm5) {
                        String strB = fm5VarK.b();
                        if (strB.startsWith("#")) {
                            String strSubstring = strB.substring(1);
                            if (strSubstring.length() == 6) {
                                strSubstring = "FF".concat(strSubstring);
                            }
                            j = Long.parseLong(strSubstring, 16);
                        } else {
                            j = -1;
                        }
                        if (j != -1) {
                            rwaVar.i0.put(str3, Integer.valueOf((int) j));
                        }
                    }
                }
                return;
            case 3:
                rwaVar.z = dVar.a(im5Var.k(str));
                return;
            case 4:
                rwaVar.A = dVar.a(im5Var.k(str));
                return;
            case 5:
                rwaVar.B = dVar.a(im5Var.k(str));
                return;
            case 6:
                rwaVar.C = rwd0Var.a.a(dVar.a(im5Var.k(str)));
                return;
            case 7:
                rwaVar.D = rwd0Var.a.a(dVar.a(im5Var.k(str)));
                return;
            case 8:
                rwaVar.E = rwd0Var.a.a(dVar.a(im5Var.k(str)));
                return;
            case 9:
                rwaVar.f0 = d(im5Var, str, rwd0Var, rwd0Var.a);
                return;
            case 10:
                fm5 fm5VarK2 = im5Var.k(str);
                if (fm5VarK2 instanceof im5) {
                    im5 im5Var3 = (im5) fm5VarK2;
                    i9h0 i9h0Var = new i9h0();
                    i9h0Var.a = new int[10];
                    i9h0Var.b = new int[10];
                    i9h0Var.c = 0;
                    i9h0Var.d = new int[10];
                    i9h0Var.e = new float[10];
                    i9h0Var.f = 0;
                    i9h0Var.g = new int[5];
                    i9h0Var.h = new String[5];
                    i9h0Var.i = 0;
                    ArrayList<String> arrayListS2 = im5Var3.s();
                    int size2 = arrayListS2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        String str4 = arrayListS2.get(i2);
                        i2++;
                        String str5 = str4;
                        str5.getClass();
                        switch (str5) {
                            case "stagger":
                                i9h0Var.a(600, im5Var3.l(str5));
                                continue;
                                break;
                            case "easing":
                                i9h0Var.c(603, im5Var3.p(str5));
                                continue;
                                break;
                            case "quantize":
                                fm5 fm5VarK3 = im5Var3.k(str5);
                                if (fm5VarK3 instanceof cm5) {
                                    cm5 cm5Var = (cm5) fm5VarK3;
                                    int size3 = cm5Var.e.size();
                                    if (size3 <= 0) {
                                        break;
                                    } else {
                                        i9h0Var.b(610, cm5Var.getInt(0));
                                        if (size3 <= 1) {
                                            break;
                                        } else {
                                            i9h0Var.c(611, cm5Var.o(1));
                                            if (size3 > 2) {
                                                i9h0Var.a(602, cm5Var.getFloat(2));
                                            }
                                        }
                                    }
                                } else {
                                    fm5 fm5VarK4 = im5Var3.k(str5);
                                    if (fm5VarK4 == null) {
                                        StringBuilder sbA = he.a("no int found for key <", str5, ">, found [");
                                        sbA.append(fm5VarK4.e());
                                        sbA.append("] : ");
                                        sbA.append(fm5VarK4);
                                        throw new jm5(sbA.toString(), im5Var3);
                                    }
                                    i9h0Var.b(610, fm5VarK4.d());
                                }
                                break;
                            case "pathArc":
                                String strP3 = im5Var3.p(str5);
                                String[] strArr = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 6) {
                                        i3 = -1;
                                    } else if (!strArr[i3].equals(strP3)) {
                                        i3++;
                                    }
                                }
                                if (i3 == -1) {
                                    System.err.println("0 pathArc = '" + strP3 + "'");
                                    break;
                                } else {
                                    i9h0Var.b(607, i3);
                                    break;
                                }
                                break;
                            case "relativeTo":
                                i9h0Var.c(605, im5Var3.p(str5));
                                break;
                        }
                    }
                    rwaVar.getClass();
                    return;
                }
                return;
            case 11:
                rwaVar.x = dVar.a(im5Var.k(str));
                return;
            case 12:
                rwaVar.y = dVar.a(im5Var.k(str));
                return;
            case 13:
                rwaVar.G = dVar.a(im5Var.k(str));
                return;
            case 14:
                rwaVar.H = dVar.a(im5Var.k(str));
                return;
            case 15:
                float fA = dVar.a(im5Var.k(str));
                if (!rwd0Var.b) {
                    fA = 1.0f - fA;
                }
                rwaVar.h = fA;
                return;
            case 16:
                rwaVar.g = dVar.a(im5Var.k(str));
                return;
            case 17:
                rwaVar.F = dVar.a(im5Var.k(str));
                return;
            case 18:
                rwaVar.h = dVar.a(im5Var.k(str));
                return;
            case 19:
                rwaVar.i = dVar.a(im5Var.k(str));
                return;
            case 20:
                rwaVar.e0 = d(im5Var, str, rwd0Var, rwd0Var.a);
                return;
            case 21:
                rwaVar.f = dVar.a(im5Var.k(str));
                return;
            case 22:
                String strP4 = im5Var.p(str);
                rwa rwaVarB3 = strP4.equals("parent") ? rwd0Var.b(0) : rwd0Var.b(strP4);
                rwaVar.o(rwaVarB3);
                rwaVar.i(rwaVarB3);
                return;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                String strP5 = im5Var.p(str);
                switch (strP5.hashCode()) {
                    case -1901805651:
                        b3 = !strP5.equals(lobGSRIlnSGJY.kaGZQQkfgpdwDOl) ? (byte) -1 : (byte) 0;
                        break;
                    case 3178655:
                        b3 = !strP5.equals("gone") ? (byte) -1 : (byte) 1;
                        break;
                    case 466743410:
                        b3 = !strP5.equals("visible") ? (byte) -1 : (byte) 2;
                        break;
                    default:
                        b3 = -1;
                        break;
                }
                switch (b3) {
                    case 0:
                        rwaVar.I = 4;
                        rwaVar.F = 0.0f;
                        return;
                    case 1:
                        rwaVar.I = 8;
                        return;
                    case 2:
                        rwaVar.I = 0;
                        return;
                    default:
                        return;
                }
            default:
                c(im5Var, rwaVar, dVar, rwd0Var, str);
                return;
        }
    }
}
