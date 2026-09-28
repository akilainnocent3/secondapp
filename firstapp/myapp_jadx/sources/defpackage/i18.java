package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes8.dex */
public final class i18 {
    public static final void a(final int i, a aVar, final d dVar, final String str, final Function0 function0) {
        int i2;
        b bVarA = mzj.a(1085918976, aVar, str, function0);
        if ((i & 6) == 0) {
            i2 = (bVarA.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarA.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarA.M(dVar) ? 256 : 128;
        }
        if (bVarA.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarA.y();
            if (objY == a.C0041a.a) {
                objY = m.b(Boolean.TRUE);
                bVarA.r(objY);
            }
            ihe0.a(j.i(dVar, c(R.dimen._40sdp, 6, bVarA)), j060.c(10.0f), 0L, 0L, 0.0f, 8.0f, null, pp8.b(-2010223589, new b18(function0, (ytw) objY, str), bVarA), bVarA, 12804096, 76);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: e18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i18.a(qj40.a(i | 1), (a) obj, dVar, str, function0);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x021b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0220  */
    /* JADX WARN: Code duplicated, block: B:114:0x026a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0283  */
    /* JADX WARN: Code duplicated, block: B:119:0x028c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0297  */
    /* JADX WARN: Code duplicated, block: B:123:0x029a  */
    /* JADX WARN: Code duplicated, block: B:126:0x030c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0310  */
    /* JADX WARN: Code duplicated, block: B:132:0x0331  */
    /* JADX WARN: Code duplicated, block: B:136:0x0344  */
    /* JADX WARN: Code duplicated, block: B:142:0x035a  */
    /* JADX WARN: Code duplicated, block: B:145:0x036f  */
    /* JADX WARN: Code duplicated, block: B:148:0x0378  */
    /* JADX WARN: Code duplicated, block: B:149:0x037b  */
    /* JADX WARN: Code duplicated, block: B:152:0x038b  */
    /* JADX WARN: Code duplicated, block: B:156:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:167:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:170:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:183:0x0350 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:? A[LOOP:1: B:154:0x03a3->B:188:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0102  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:66:0x0130  */
    /* JADX WARN: Code duplicated, block: B:67:0x0134  */
    /* JADX WARN: Code duplicated, block: B:72:0x0155  */
    /* JADX WARN: Code duplicated, block: B:76:0x017d  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b2 A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:86:0x0198, B:88:0x01b2, B:90:0x01c3, B:91:0x01d5), top: B:179:0x0198 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01c3 A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:86:0x0198, B:88:0x01b2, B:90:0x01c3, B:91:0x01d5), top: B:179:0x0198 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01d5 A[Catch: Exception -> 0x01da, TRY_LEAVE, TryCatch #0 {Exception -> 0x01da, blocks: (B:86:0x0198, B:88:0x01b2, B:90:0x01c3, B:91:0x01d5), top: B:179:0x0198 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:161:0x03ba, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x01c3, please report this as an issue */
    public static final void b(final d dVar, final String str, final j58 j58Var, final List list, final Function0 function0, final Function0 function1, final float f, final float f2, final String str2, final String str3, final boolean z, a aVar, final int i) {
        b bVar;
        float f3;
        float f4;
        kw0.l lVar;
        String str4;
        int iHashCode;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        boolean z2;
        String str5;
        Double dH;
        boolean z3;
        b bVar2;
        int i2;
        float f5;
        boolean z4;
        long j;
        float f6;
        int iHashCode2;
        tsr.a aVar3;
        yka.a.C1350a c1350a2;
        Iterator it;
        Object obj;
        Object next;
        ps6 ps6Var;
        String str6;
        float f7;
        ps6 ps6Var2;
        float f8;
        boolean zK;
        Double dH2;
        b bVarA = v2g.a(function0, function1, aVar, -1435808489);
        int i3 = i | (bVarA.M(dVar) ? 4 : 2) | (bVarA.M(str) ? 32 : 16) | (bVarA.M(j58Var) ? 256 : 128) | (bVarA.A(list) ? 2048 : 1024) | (bVarA.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarA.A(function1) ? 131072 : 65536) | (bVarA.c(f) ? 1048576 : 524288) | (bVarA.c(f2) ? 8388608 : 4194304) | (bVarA.M(str3) ? 536870912 : 268435456);
        if (bVarA.q(i3 & 1, ((i3 & 306783379) == 306783378 && ((bVarA.b(z) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            d dVarG = j.g(dVar, 1.0f);
            chf chfVar = AndroidCompositionLocals_androidKt.a;
            float f9 = ((Configuration) bVarA.O(chfVar)).screenHeightDp;
            try {
                try {
                    if (f2 > 0.31f) {
                        f3 = f9;
                        if (!str2.equals("user_choice_screen")) {
                            f4 = 0.29f;
                        }
                        d dVarF = h.f(j.i(dVarG, f4 * f3), 2.0f);
                        if (f == 0.0f) {
                            lVar = kw0.d;
                        } else {
                            lVar = kw0.c;
                        }
                        kw0.l lVar2 = lVar;
                        str4 = "0.00x";
                        i78 i78VarA = g78.a(lVar2, ht.a.n, bVarA, 48);
                        iHashCode = Long.hashCode(bVarA.T);
                        ne00 ne00VarS = bVarA.S();
                        d dVarC = c.c(bVarA, dVarF);
                        yka.k.getClass();
                        aVar2 = yka.a.b;
                        bVarA.D();
                        if (bVarA.S) {
                            bVarA.F(aVar2);
                        } else {
                            bVarA.p();
                        }
                        hlh0.a(bVarA, i78VarA, yka.a.f);
                        hlh0.a(bVarA, ne00VarS, yka.a.e);
                        c1350a = yka.a.g;
                        if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                            n30.a(iHashCode, bVarA, iHashCode, c1350a);
                        }
                        hlh0.a(bVarA, dVarC, yka.a.d);
                        d.a aVar4 = d.a.b;
                        ty0.a(bVarA, j.i(j.g(aVar4, 1.0f), ((Configuration) bVarA.O(chfVar)).screenHeightDp * f));
                        if (!StringsKt.U(str) || str.equalsIgnoreCase("null") || str.equalsIgnoreCase("nullx")) {
                            str5 = str4;
                        } else {
                            str5 = str;
                        }
                        String string = StringsKt.t0(str5).toString();
                        z2 = true;
                        zK = kotlin.text.c.k(string, "x", true);
                        dH2 = kotlin.text.b.h(StringsKt.t0(StringsKt.c0(StringsKt.c0(string, "x"), AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X)).toString());
                        if (dH2 != null) {
                            str5 = new DecimalFormat("0.00").format(dH2.doubleValue());
                            if (zK) {
                                str5 = str5 + 'x';
                            } else {
                                str5.getClass();
                            }
                        }
                        if (!StringsKt.U(str5) && !str5.equalsIgnoreCase("null") && !str5.equalsIgnoreCase("nullx")) {
                            str4 = str5;
                        }
                        dH = kotlin.text.b.h(StringsKt.t0(StringsKt.c0(StringsKt.c0(StringsKt.t0(str4).toString(), "x"), AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X)).toString());
                        if (dH != null || dH.doubleValue() <= 0.0d) {
                            z3 = z2;
                        } else {
                            z3 = false;
                        }
                        if (z) {
                            bVarA.N(1098110576);
                            i2 = 2;
                            f5 = 0.0f;
                            z4 = false;
                            lkf0.b(str3, null, j58.f, d(R.dimen._16ssp, bVarA), null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarA, ((i3 >> 27) & 14) | 196992, 0, 131026);
                            bVar2 = bVarA;
                        } else {
                            bVar2 = bVarA;
                            i2 = 2;
                            f5 = 0.0f;
                            z4 = false;
                            bVar2.N(1094979297);
                        }
                        bVar2.X(z4);
                        long jD = d(R.dimen._36ssp, bVar2);
                        t9i t9iVar = t9i.E;
                        if (j58Var != null) {
                            j = j58Var.a;
                        } else {
                            j = j58.f;
                        }
                        long j2 = j;
                        d dVarG2 = j.g(aVar4, 1.0f);
                        if (z3) {
                            f6 = f5;
                        } else {
                            f6 = 1.0f;
                        }
                        b bVar3 = bVar2;
                        lkf0.b(str5, dw.a(dVarG2, f6), j2, jD, null, t9iVar, null, 0L, new gdf0(3), 0L, 0, false, 1, 0, null, null, bVar3, 196608, 3072, 122320);
                        bVar = bVar3;
                        d dVarH = h.h(j.g(j.i(aVar4, c(R.dimen._49sdp, 6, bVar)), 1.0f), c(R.dimen._6sdp, 6, bVar), f5, i2);
                        d160 d160VarA = b160.a(kw0.h, ht.a.k, bVar, 54);
                        iHashCode2 = Long.hashCode(bVar.T);
                        ne00 ne00VarS2 = bVar.S();
                        d dVarC2 = c.c(bVar, dVarH);
                        yka.k.getClass();
                        aVar3 = yka.a.b;
                        bVar.D();
                        if (bVar.S) {
                            bVar.F(aVar3);
                        } else {
                            bVar.p();
                        }
                        hlh0.a(bVar, d160VarA, yka.a.f);
                        hlh0.a(bVar, ne00VarS2, yka.a.e);
                        c1350a2 = yka.a.g;
                        if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode2))) {
                            n30.a(iHashCode2, bVar, iHashCode2, c1350a2);
                        }
                        hlh0.a(bVar, dVarC2, yka.a.d);
                        it = list.iterator();
                        do {
                            obj = null;
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ps6) next).b != z2);
                        ps6Var = (ps6) next;
                        if (ps6Var != null) {
                            bVar.N(806907160);
                            String str7 = ps6Var.c;
                            str6 = "invalid weight; must be greater than zero";
                            f7 = Float.MAX_VALUE;
                            if (1.0f <= 0) {
                                ukn.a(str6);
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f8 = Float.MAX_VALUE;
                            } else {
                                f8 = 1.0f;
                            }
                            a((i3 >> 9) & 112, bVar, new LayoutWeightElement(f8, z2), str7, function0);
                        } else {
                            str6 = "invalid weight; must be greater than zero";
                            f7 = Float.MAX_VALUE;
                            bVar.N(802797893);
                        }
                        bVar.X(z4);
                        ty0.a(bVar, j.w(aVar4, c(R.dimen._6sdp, 6, bVar)));
                        for (Object obj2 : list) {
                            if (((ps6) obj2).b == 2) {
                                obj = obj2;
                                break;
                            }
                        }
                        ps6Var2 = (ps6) obj;
                        if (ps6Var2 != null) {
                            bVar.N(807280152);
                            String str8 = ps6Var2.c;
                            if (1.0f <= r8) {
                                ukn.a(str6);
                            }
                            a((i3 >> 12) & 112, bVar, new LayoutWeightElement(1.0f > f7 ? f7 : 1.0f, z2), str8, function1);
                        } else {
                            bVar.N(802797893);
                        }
                        bVar.X(z4);
                        bVar.X(z2);
                        bVar.X(z2);
                    } else {
                        f3 = f9;
                    }
                    zK = kotlin.text.c.k(string, "x", true);
                    dH2 = kotlin.text.b.h(StringsKt.t0(StringsKt.c0(StringsKt.c0(string, "x"), AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X)).toString());
                    if (dH2 != null) {
                        str5 = new DecimalFormat("0.00").format(dH2.doubleValue());
                        if (zK) {
                            str5 = str5 + 'x';
                        } else {
                            str5.getClass();
                        }
                    }
                } catch (Exception unused) {
                    str5 = "";
                }
                if (!StringsKt.U(str)) {
                    str5 = str4;
                } else {
                    str5 = str;
                }
                String string2 = StringsKt.t0(str5).toString();
                z2 = true;
            } catch (Exception unused2) {
                z2 = true;
            }
            f4 = f2;
            d dVarF2 = h.f(j.i(dVarG, f4 * f3), 2.0f);
            if (f == 0.0f) {
                lVar = kw0.d;
            } else {
                lVar = kw0.c;
            }
            kw0.l lVar3 = lVar;
            str4 = "0.00x";
            i78 i78VarA2 = g78.a(lVar3, ht.a.n, bVarA, 48);
            iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS3 = bVarA.S();
            d dVarC3 = c.c(bVarA, dVarF2);
            yka.k.getClass();
            aVar2 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar2);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, i78VarA2, yka.a.f);
            hlh0.a(bVarA, ne00VarS3, yka.a.e);
            c1350a = yka.a.g;
            if (bVarA.S) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            hlh0.a(bVarA, dVarC3, yka.a.d);
            d.a aVar5 = d.a.b;
            ty0.a(bVarA, j.i(j.g(aVar5, 1.0f), ((Configuration) bVarA.O(chfVar)).screenHeightDp * f));
            if (!StringsKt.U(str5)) {
                str4 = str5;
            }
            dH = kotlin.text.b.h(StringsKt.t0(StringsKt.c0(StringsKt.c0(StringsKt.t0(str4).toString(), "x"), AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X)).toString());
            if (dH != null) {
                z3 = z2;
            } else {
                z3 = z2;
            }
            if (z) {
                bVarA.N(1098110576);
                i2 = 2;
                f5 = 0.0f;
                z4 = false;
                lkf0.b(str3, null, j58.f, d(R.dimen._16ssp, bVarA), null, t9i.E, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVarA, ((i3 >> 27) & 14) | 196992, 0, 131026);
                bVar2 = bVarA;
            } else {
                bVar2 = bVarA;
                i2 = 2;
                f5 = 0.0f;
                z4 = false;
                bVar2.N(1094979297);
            }
            bVar2.X(z4);
            long jD2 = d(R.dimen._36ssp, bVar2);
            t9i t9iVar2 = t9i.E;
            if (j58Var != null) {
                j = j58Var.a;
            } else {
                j = j58.f;
            }
            long j3 = j;
            d dVarG3 = j.g(aVar5, 1.0f);
            if (z3) {
                f6 = 1.0f;
            } else {
                f6 = f5;
            }
            b bVar4 = bVar2;
            lkf0.b(str5, dw.a(dVarG3, f6), j3, jD2, null, t9iVar2, null, 0L, new gdf0(3), 0L, 0, false, 1, 0, null, null, bVar4, 196608, 3072, 122320);
            bVar = bVar4;
            d dVarH2 = h.h(j.g(j.i(aVar5, c(R.dimen._49sdp, 6, bVar)), 1.0f), c(R.dimen._6sdp, 6, bVar), f5, i2);
            d160 d160VarA2 = b160.a(kw0.h, ht.a.k, bVar, 54);
            iHashCode2 = Long.hashCode(bVar.T);
            ne00 ne00VarS4 = bVar.S();
            d dVarC4 = c.c(bVar, dVarH2);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar3);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, d160VarA2, yka.a.f);
            hlh0.a(bVar, ne00VarS4, yka.a.e);
            c1350a2 = yka.a.g;
            if (bVar.S) {
                n30.a(iHashCode2, bVar, iHashCode2, c1350a2);
            } else {
                n30.a(iHashCode2, bVar, iHashCode2, c1350a2);
            }
            hlh0.a(bVar, dVarC4, yka.a.d);
            it = list.iterator();
            do {
                obj = null;
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ps6) next).b != z2);
            ps6Var = (ps6) next;
            if (ps6Var != null) {
                bVar.N(806907160);
                String str9 = ps6Var.c;
                str6 = "invalid weight; must be greater than zero";
                f7 = Float.MAX_VALUE;
                if (1.0f <= 0) {
                    ukn.a(str6);
                }
                if (1.0f > Float.MAX_VALUE) {
                    f8 = Float.MAX_VALUE;
                } else {
                    f8 = 1.0f;
                }
                a((i3 >> 9) & 112, bVar, new LayoutWeightElement(f8, z2), str9, function0);
            } else {
                str6 = "invalid weight; must be greater than zero";
                f7 = Float.MAX_VALUE;
                bVar.N(802797893);
            }
            bVar.X(z4);
            ty0.a(bVar, j.w(aVar5, c(R.dimen._6sdp, 6, bVar)));
            while (r1.hasNext()) {
                if (((ps6) obj2).b == 2) {
                    obj = obj2;
                    break;
                }
            }
            ps6Var2 = (ps6) obj;
            if (ps6Var2 != null) {
                bVar.N(807280152);
                String str10 = ps6Var2.c;
                if (1.0f <= r8) {
                    ukn.a(str6);
                }
                a((i3 >> 12) & 112, bVar, new LayoutWeightElement(1.0f > f7 ? f7 : 1.0f, z2), str10, function1);
            } else {
                bVar.N(802797893);
            }
            bVar.X(z4);
            bVar.X(z2);
            bVar.X(z2);
        } else {
            bVar = bVarA;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, j58Var, list, function0, function1, f, f2, str2, str3, z, i) { // from class: y08
                public final /* synthetic */ String b;
                public final /* synthetic */ j58 c;
                public final /* synthetic */ List d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ float i;
                public final /* synthetic */ float v;
                public final /* synthetic */ String w;
                public final /* synthetic */ String y;
                public final /* synthetic */ boolean z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = qj40.a(100663297);
                    i18.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, (a) obj3, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final float c(int i, int i2, a aVar) {
        int i3 = oi60.a;
        Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        mmd mmdVar = (mmd) aVar.O(kna.h);
        Configuration configuration = (Configuration) aVar.O(AndroidCompositionLocals_androidKt.a);
        boolean zD = ((((i2 & 14) ^ 6) > 4 && aVar.d(i)) || (i2 & 6) == 4) | aVar.d(configuration.screenWidthDp) | aVar.d(configuration.screenHeightDp) | aVar.c(configuration.fontScale) | aVar.c(mmdVar.getDensity()) | aVar.c(mmdVar.y1());
        Object objY = aVar.y();
        if (zD || objY == a.C0041a.a) {
            objY = new g7f(mmdVar.v1(context.getResources().getDimension(i)));
            aVar.r(objY);
        }
        return ((g7f) objY).a;
    }

    public static final long d(int i, a aVar) {
        int i2 = oi60.a;
        Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
        mmd mmdVar = (mmd) aVar.O(kna.h);
        Configuration configuration = (Configuration) aVar.O(AndroidCompositionLocals_androidKt.a);
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        float f = configuration.fontScale;
        float density = mmdVar.getDensity();
        float fY1 = mmdVar.y1();
        boolean zC = aVar.c(f) | aVar.d(i3) | aVar.d(i4) | aVar.c(density) | aVar.c(fY1);
        Object objY = aVar.y();
        if (zC || objY == a.C0041a.a) {
            objY = new omf0(mmdVar.g0(context.getResources().getDimension(i)));
            aVar.r(objY);
        }
        return ((omf0) objY).a;
    }
}
