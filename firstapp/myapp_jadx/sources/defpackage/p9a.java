package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.sportybet.android.gp.tz.R;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class p9a {

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements PointerInputEventHandler {
        public static final a a = new a();

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
            Object objD = u4f0.d(u020Var, null, new o9a(0), v1bVar, 7);
            return objD == y5b.a ? objD : Unit.a;
        }
    }

    public static final void a(final Integer num, final String str, final String str2, final String str3, final Function0<Unit> function0, final Function0<Unit> function1, final cj5 cj5Var, androidx.compose.runtime.a aVar, final int i) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(585594218);
        int i2 = i | (bVarI.M(num) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.M(str3) ? 2048 : 1024) | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function1) ? 131072 : 65536) | (bVarI.A(cj5Var) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            float fB = lla.b(num != null ? num.intValue() : 0.0f, bVarI);
            final float f = fB / 8.0f;
            final float fMax = Math.max(fB / 15.0f, 48.0f);
            Object objY = bVarI.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new to0(1);
                bVarI.r(objY);
            }
            u60.a((Function0) objY, new yle(false, false, false), pp8.b(-1213333261, new Function2() { // from class: i9a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar3 = d.a.b;
                        d dVarB = androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), j58.c(0.1f, j58.b), zk40.a);
                        Unit unit = Unit.a;
                        Object objY2 = aVar2.y();
                        if (objY2 == a.C0041a.a) {
                            objY2 = p9a.a.a;
                            aVar2.r(objY2);
                        }
                        d dVarA = wje0.a(dVarB, unit, (PointerInputEventHandler) objY2);
                        aiv aivVarC = g75.c(ht.a.h, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarA);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        d dVarA2 = j.A(j.g(aVar3, 1.0f), null, 3);
                        fg6 fg6VarB = gg6.b(c68.a(R.color.trans_black_60, aVar2), 0L, aVar2, 0, 14);
                        jg6 jg6VarC = gg6.c(62, 8.0f);
                        final float f2 = f;
                        final float f3 = fMax;
                        final String str4 = str;
                        final cj5 cj5Var2 = cj5Var;
                        final Function0 function2 = function1;
                        final Function0 function3 = function0;
                        final String str5 = str3;
                        final String str6 = str2;
                        rg6.a(dVarA2, null, fg6VarB, jg6VarC, null, pp8.b(-384785157, new gaj() { // from class: k9a
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                boolean z;
                                a aVar5 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((j78) obj3).getClass();
                                if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    d.a aVar6 = d.a.b;
                                    d dVarA3 = j.A(aVar6, null, 3);
                                    long jA = c68.a(R.color.trans_black_60, aVar5);
                                    zk40.a aVar7 = zk40.a;
                                    d dVarB2 = androidx.compose.foundation.a.b(dVarA3, jA, aVar7);
                                    i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar5, 0);
                                    int iHashCode2 = Long.hashCode(aVar5.m());
                                    ne00 ne00VarO2 = aVar5.o();
                                    d dVarC2 = c.c(aVar5, dVarB2);
                                    yka.k.getClass();
                                    tsr.a aVar8 = yka.a.b;
                                    if (aVar5.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar5.D();
                                    if (aVar5.g()) {
                                        aVar5.F(aVar8);
                                    } else {
                                        aVar5.p();
                                    }
                                    yka.a.b bVar = yka.a.f;
                                    hlh0.a(aVar5, i78VarA, bVar);
                                    yka.a.d dVar = yka.a.e;
                                    hlh0.a(aVar5, ne00VarO2, dVar);
                                    yka.a.C1350a c1350a2 = yka.a.g;
                                    if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode2))) {
                                        j3c.a(iHashCode2, aVar5, iHashCode2, c1350a2);
                                    }
                                    yka.a.c cVar = yka.a.d;
                                    hlh0.a(aVar5, dVarC2, cVar);
                                    d dVarG = h.g(androidx.compose.foundation.a.b(j.k(j.g(aVar6, 1.0f), f2, 0.0f, 2), c68.a(R.color.white, aVar5), aVar7), fw20.a(R.dimen._12sdp, aVar5), fw20.a(R.dimen._16sdp, aVar5));
                                    n54 n54Var = ht.a.e;
                                    aiv aivVarC2 = g75.c(n54Var, false);
                                    int iHashCode3 = Long.hashCode(aVar5.m());
                                    ne00 ne00VarO3 = aVar5.o();
                                    d dVarC3 = c.c(aVar5, dVarG);
                                    if (aVar5.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar5.D();
                                    if (aVar5.g()) {
                                        aVar5.F(aVar8);
                                    } else {
                                        aVar5.p();
                                    }
                                    hlh0.a(aVar5, aivVarC2, bVar);
                                    hlh0.a(aVar5, ne00VarO3, dVar);
                                    if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode3))) {
                                        j3c.a(iHashCode3, aVar5, iHashCode3, c1350a2);
                                    }
                                    hlh0.a(aVar5, dVarC3, cVar);
                                    p9a.b(str4, aVar5, 0);
                                    aVar5.s();
                                    d dVarG2 = j.g(j.i(aVar6, f3), 1.0f);
                                    d160 d160VarA = b160.a(kw0.a, ht.a.j, aVar5, 0);
                                    int iHashCode4 = Long.hashCode(aVar5.m());
                                    ne00 ne00VarO4 = aVar5.o();
                                    d dVarC4 = c.c(aVar5, dVarG2);
                                    if (aVar5.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar5.D();
                                    if (aVar5.g()) {
                                        aVar5.F(aVar8);
                                    } else {
                                        aVar5.p();
                                    }
                                    hlh0.a(aVar5, d160VarA, bVar);
                                    hlh0.a(aVar5, ne00VarO4, dVar);
                                    if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode4))) {
                                        j3c.a(iHashCode4, aVar5, iHashCode4, c1350a2);
                                    }
                                    hlh0.a(aVar5, dVarC4, cVar);
                                    if (0.35f <= 0.0d) {
                                        ukn.a("invalid weight; must be greater than zero");
                                    }
                                    d dVarC5 = j.c(new LayoutWeightElement(0.35f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.35f, true), 1.0f);
                                    cj5 cj5Var3 = cj5Var2;
                                    d dVarB3 = androidx.compose.foundation.a.b(dVarC5, cj5Var3.u(), aVar7);
                                    Function0 function4 = function2;
                                    boolean zM = aVar5.M(function4);
                                    Object objY3 = aVar5.y();
                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                    if (zM || objY3 == c0042a) {
                                        objY3 = new l9a(function4, 0);
                                        aVar5.r(objY3);
                                    }
                                    d dVarA4 = s3w.a(androidx.compose.foundation.d.d(dVarB3, false, null, null, (Function0) objY3, 15), "cancel_button");
                                    aiv aivVarC3 = g75.c(n54Var, false);
                                    int iHashCode5 = Long.hashCode(aVar5.m());
                                    ne00 ne00VarO5 = aVar5.o();
                                    d dVarC6 = c.c(aVar5, dVarA4);
                                    if (aVar5.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar5.D();
                                    if (aVar5.g()) {
                                        aVar5.F(aVar8);
                                    } else {
                                        aVar5.p();
                                    }
                                    hlh0.a(aVar5, aivVarC3, bVar);
                                    hlh0.a(aVar5, ne00VarO5, dVar);
                                    if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode5))) {
                                        j3c.a(iHashCode5, aVar5, iHashCode5, c1350a2);
                                    }
                                    hlh0.a(aVar5, dVarC6, cVar);
                                    qyd0 qyd0Var = ni60.b;
                                    wf1.a(str5, null, imf0.b(ni60.g(((sfd0) aVar5.O(qyd0Var)).c, R.dimen._14ssp, aVar5), 0L, 0L, null, null, null, 0L, null, null, null, 0, d2l.f(20), null, null, 16646143), 0, 0L, null, 0, null, 0L, aVar5, 0, 506);
                                    aVar5.s();
                                    if (0.65f <= 0.0d) {
                                        ukn.a("invalid weight; must be greater than zero");
                                    }
                                    d dVarB4 = androidx.compose.foundation.a.b(j.c(new LayoutWeightElement(0.65f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.65f, true), 1.0f), cj5Var3.r(), aVar7);
                                    Function0 function5 = function3;
                                    boolean zM2 = aVar5.M(function5);
                                    Object objY4 = aVar5.y();
                                    if (zM2 || objY4 == c0042a) {
                                        z = false;
                                        objY4 = new m9a(function5, 0);
                                        aVar5.r(objY4);
                                    } else {
                                        z = false;
                                    }
                                    d dVarA5 = s3w.a(androidx.compose.foundation.d.d(dVarB4, false, null, null, (Function0) objY4, 15), "confirm_button");
                                    aiv aivVarC4 = g75.c(n54Var, z);
                                    int iHashCode6 = Long.hashCode(aVar5.m());
                                    ne00 ne00VarO6 = aVar5.o();
                                    d dVarC7 = c.c(aVar5, dVarA5);
                                    if (aVar5.k() == null) {
                                        l2a.b();
                                        throw null;
                                    }
                                    aVar5.D();
                                    if (aVar5.g()) {
                                        aVar5.F(aVar8);
                                    } else {
                                        aVar5.p();
                                    }
                                    hlh0.a(aVar5, aivVarC4, bVar);
                                    hlh0.a(aVar5, ne00VarO6, dVar);
                                    if (aVar5.g() || !Intrinsics.g(aVar5.y(), Integer.valueOf(iHashCode6))) {
                                        j3c.a(iHashCode6, aVar5, iHashCode6, c1350a2);
                                    }
                                    hlh0.a(aVar5, dVarC7, cVar);
                                    wf1.a(str6, null, imf0.b(ni60.g(((sfd0) aVar5.O(qyd0Var)).c, R.dimen._14ssp, aVar5), 0L, 0L, null, null, null, 0L, null, null, null, 0, d2l.f(20), null, null, 16646143), 0, 0L, null, 0, null, 0L, aVar5, 0, 506);
                                    aVar5.s();
                                    aVar5.s();
                                    aVar5.s();
                                } else {
                                    aVar5.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 196614, 18);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 438, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(num, str, str2, str3, function0, function1, cj5Var, i) { // from class: j9a
                public final /* synthetic */ Integer a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;
                public final /* synthetic */ cj5 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    p9a.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, androidx.compose.runtime.a aVar, final int i) {
        b bVar;
        nk0.b bVar2;
        Object[] objArr;
        ora0 ora0VarA;
        ora0 ora0VarA2;
        str.getClass();
        b bVarI = aVar.i(1907095273);
        int i2 = 2;
        int i3 = (bVarI.M(str) ? 4 : 2) | i;
        int i4 = 1;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            Spanned spannedFromHtml = Html.fromHtml(str, 63);
            spannedFromHtml.getClass();
            String url = null;
            nk0.b bVar3 = new nk0.b((Object) null);
            int i5 = 0;
            while (i5 < spannedFromHtml.length()) {
                int iNextSpanTransition = spannedFromHtml.nextSpanTransition(i5, spannedFromHtml.length(), Object.class);
                Object[] spans = spannedFromHtml.getSpans(i5, iNextSpanTransition, Object.class);
                ora0 ora0Var = new ora0(0L, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                spans.getClass();
                int length = spans.length;
                ora0 ora0VarA3 = ora0Var;
                int i6 = 0;
                while (i6 < length) {
                    Object obj = spans[i6];
                    boolean z = obj instanceof StyleSpan;
                    kjf0 z68Var = kjf0.a.a;
                    if (z) {
                        int style = ((StyleSpan) obj).getStyle();
                        if (style != i4) {
                            if (style == i2) {
                                bVar2 = bVar3;
                                n9i n9iVar = new n9i(i4);
                                long j = j58.m;
                                long j2 = omf0.c;
                                if (j != 16) {
                                    z68Var = new z68(j);
                                }
                                ora0VarA2 = qra0.a(ora0VarA3, z68Var.d(), z68Var.e(), z68Var.a(), j2, null, n9iVar, null, null, null, j2, null, null, null, j, null, null, null, null);
                            } else if (style != 3) {
                                bVar2 = bVar3;
                            } else {
                                t9i t9iVar = t9i.E;
                                n9i n9iVar2 = new n9i(i4);
                                bVar2 = bVar3;
                                long j3 = j58.m;
                                long j4 = omf0.c;
                                if (j3 != 16) {
                                    z68Var = new z68(j3);
                                }
                                ora0VarA3 = qra0.a(ora0VarA3, z68Var.d(), z68Var.e(), z68Var.a(), j4, t9iVar, n9iVar2, null, null, null, j4, null, null, null, j3, null, null, null, null);
                            }
                            objArr = spans;
                        } else {
                            bVar2 = bVar3;
                            t9i t9iVar2 = t9i.E;
                            long j5 = j58.m;
                            long j6 = omf0.c;
                            if (j5 != 16) {
                                z68Var = new z68(j5);
                            }
                            ora0VarA2 = qra0.a(ora0VarA3, z68Var.d(), z68Var.e(), z68Var.a(), j6, t9iVar2, null, null, null, null, j6, null, null, null, j5, null, null, null, null);
                        }
                        ora0VarA3 = ora0VarA2;
                        objArr = spans;
                    } else {
                        bVar2 = bVar3;
                        if (obj instanceof TypefaceSpan) {
                            String family = ((TypefaceSpan) obj).getFamily();
                            if (family != null) {
                                String lowerCase = family.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                if (StringsKt.M(lowerCase, "bold", false)) {
                                    t9i t9iVar3 = t9i.E;
                                    long j7 = j58.m;
                                    long j8 = omf0.c;
                                    if (j7 != 16) {
                                        z68Var = new z68(j7);
                                    }
                                    ora0VarA3 = qra0.a(ora0VarA3, z68Var.d(), z68Var.e(), z68Var.a(), j8, t9iVar3, null, null, null, null, j8, null, null, null, j7, null, null, null, null);
                                }
                            }
                        } else {
                            if (obj instanceof TextAppearanceSpan) {
                                int textStyle = ((TextAppearanceSpan) obj).getTextStyle();
                                if ((textStyle & 1) != 0) {
                                    t9i t9iVar4 = t9i.E;
                                    long j9 = j58.m;
                                    long j10 = omf0.c;
                                    kjf0 z68Var2 = j9 != 16 ? new z68(j9) : z68Var;
                                    ora0VarA3 = qra0.a(ora0VarA3, z68Var2.d(), z68Var2.e(), z68Var2.a(), j10, t9iVar4, null, null, null, null, j10, null, null, null, j9, null, null, null, null);
                                }
                                ora0 ora0Var2 = ora0VarA3;
                                if ((textStyle & 2) != 0) {
                                    n9i n9iVar3 = new n9i(1);
                                    long j11 = j58.m;
                                    long j12 = omf0.c;
                                    if (j11 != 16) {
                                        z68Var = new z68(j11);
                                    }
                                    ora0VarA2 = qra0.a(ora0Var2, z68Var.d(), z68Var.e(), z68Var.a(), j12, null, n9iVar3, null, null, null, j12, null, null, null, j11, null, null, null, null);
                                } else {
                                    ora0VarA3 = ora0Var2;
                                }
                            } else if (obj instanceof ForegroundColorSpan) {
                                long jB = r58.b(((ForegroundColorSpan) obj).getForegroundColor());
                                long j13 = omf0.c;
                                long j14 = j58.m;
                                if (jB != 16) {
                                    z68Var = new z68(jB);
                                }
                                ora0VarA2 = qra0.a(ora0VarA3, z68Var.d(), z68Var.e(), z68Var.a(), j13, null, null, null, null, null, j13, null, null, null, j14, null, null, null, null);
                            } else {
                                boolean z2 = obj instanceof UnderlineSpan;
                                yef0 yef0Var = yef0.c;
                                if (z2) {
                                    long j15 = j58.m;
                                    long j16 = omf0.c;
                                    if (j15 != 16) {
                                        z68Var = new z68(j15);
                                    }
                                    ora0VarA2 = qra0.a(ora0VarA3, z68Var.d(), z68Var.e(), z68Var.a(), j16, null, null, null, null, null, j16, null, null, null, j15, yef0Var, null, null, null);
                                } else if (obj instanceof StrikethroughSpan) {
                                    long j17 = j58.m;
                                    long j18 = omf0.c;
                                    if (j17 != 16) {
                                        z68Var = new z68(j17);
                                    }
                                    ora0VarA2 = qra0.a(ora0VarA3, z68Var.d(), z68Var.e(), z68Var.a(), j18, null, null, null, null, null, j18, null, null, null, j17, yef0.d, null, null, null);
                                } else {
                                    if (obj instanceof RelativeSizeSpan) {
                                        long jF = d2l.f(16);
                                        float sizeChange = ((RelativeSizeSpan) obj).getSizeChange();
                                        d2l.a(jF);
                                        objArr = spans;
                                        long jA = gkw.a(sizeChange, jF, jF & 1095216660480L);
                                        long j19 = j58.m;
                                        long j20 = omf0.c;
                                        if (j19 != 16) {
                                            z68Var = new z68(j19);
                                        }
                                        ora0VarA = qra0.a(ora0VarA3, z68Var.d(), z68Var.e(), z68Var.a(), jA, null, null, null, null, null, j20, null, null, null, j19, null, null, null, null);
                                    } else {
                                        objArr = spans;
                                        if (obj instanceof URLSpan) {
                                            url = ((URLSpan) obj).getURL();
                                            long j21 = j58.i;
                                            long j22 = omf0.c;
                                            long j23 = j58.m;
                                            if (j21 != 16) {
                                                z68Var = new z68(j21);
                                            }
                                            ora0VarA = qra0.a(ora0VarA3, z68Var.d(), z68Var.e(), z68Var.a(), j22, null, null, null, null, null, j22, null, null, null, j23, yef0Var, null, null, null);
                                        }
                                    }
                                    ora0VarA3 = ora0VarA;
                                }
                            }
                            ora0VarA3 = ora0VarA2;
                        }
                        objArr = spans;
                    }
                    i6++;
                    bVar3 = bVar2;
                    spans = objArr;
                    i2 = 2;
                    i4 = 1;
                }
                nk0.b bVar4 = bVar3;
                if (url != null) {
                    bVar3 = bVar4;
                    bVar3.k("URL", url);
                } else {
                    bVar3 = bVar4;
                }
                bVar3.l(ora0VarA3);
                bVar3.f(spannedFromHtml.subSequence(i5, iNextSpanTransition));
                bVar3.h();
                if (url != null) {
                    bVar3.h();
                }
                i5 = iNextSpanTransition;
                i2 = 2;
                i4 = 1;
                url = null;
            }
            bVar = bVarI;
            lkf0.c(bVar3.m(), null, c68.a(R.color.sg_button_text_color, bVarI), 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 4, 0, null, null, imf0.b(ni60.g(((sfd0) bVarI.O(ni60.b)).c, R.dimen._13ssp, bVarI), 0L, 0L, null, null, null, 0L, null, null, null, 0, d2l.f(24), null, null, 16646143), bVar, 0, 3072, 122362);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i) { // from class: n9a
                public final /* synthetic */ String a;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(1);
                    p9a.b(this.a, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }
}
