package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.debugscreen.impl.encrypt.data.EncryptedRequest;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s4g {
    public static final void a(final EncryptedRequest encryptedRequest, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(1888611370);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(encryptedRequest) : bVarI.A(encryptedRequest) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.G();
        } else if (encryptedRequest == null) {
            bVarI.N(-450137028);
            bVarI.X(false);
        } else {
            bVarI.N(-450137027);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, d.a.b);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            c("Time", bwf0.r(new Date(encryptedRequest.getStartTime())), bVarI, 6);
            ute.b(null, 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 0, 3);
            c("Method", encryptedRequest.getMethod(), bVarI, 6);
            ute.b(null, 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 0, 3);
            c("Url", encryptedRequest.getUrl(), bVarI, 6);
            ute.b(null, 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 0, 3);
            b("Original body", encryptedRequest.getOriginalBody(), bVarI, 6);
            ute.b(null, 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 0, 3);
            b("Encrypted body", encryptedRequest.getEncryptedBody(), bVarI, 6);
            bVarI.X(true);
            bVarI.X(false);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: n4g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    s4g.a(encryptedRequest, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final String str, final String str2, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(-1551947790);
        int i2 = i | (bVarI.M(str2) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            final Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            boolean zA = ((i2 & 112) == 32) | bVarI.A(context);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new Function0() { // from class: o4g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        hgy.a(context, str2);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarF = h.f(androidx.compose.foundation.d.d(dVarG, false, null, null, (Function0) objY, 15), 16.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(str, null, c68.a(R.color.colorPrimary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 6, 0, 262138);
            ty0.a(bVarI, j.i(aVar2, 8.0f));
            lkf0.d(str2, null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, (i2 >> 3) & 14, 0, 262138);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, i) { // from class: p4g
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    s4g.b(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(String str, String str2, a aVar, int i) {
        b bVar;
        final String str3 = str2;
        b bVarI = aVar.i(-1052910588);
        int i2 = i | (bVarI.M(str3) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            final Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            d dVarG = j.g(d.a.b, 1.0f);
            boolean zA = ((i2 & 112) == 32) | bVarI.A(context);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new Function0() { // from class: q4g
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        hgy.a(context, str3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            d dVarF = h.f(androidx.compose.foundation.d.d(dVarG, false, null, null, (Function0) objY, 15), 16.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(str, null, c68.a(R.color.colorPrimary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, 6, 0, 262138);
            ty0.a(bVarI, new LayoutWeightElement(1.0f, true));
            str3 = str2;
            lkf0.d(str3, null, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVarI, (i2 >> 3) & 14, 0, 262138);
            bVar = bVarI;
            bVar.X(true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new r4g(str, str3, i);
        }
    }
}
