package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pj5 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final d dVar, final List list, String str, imf0 imf0Var, imf0 imf0Var2, a aVar, final int i) {
        String str2;
        final imf0 imf0Var3;
        final imf0 imf0Var4;
        b bVar;
        imf0 imf0VarB;
        String str3;
        imf0 imf0Var5;
        list.getClass();
        b bVarI = aVar.i(50932733);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(list) ? 32 : 16) | 9600;
        int i3 = 0;
        boolean z = true;
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                imf0 imf0VarB2 = imf0.b(mla.l(R.style.B1_R, bVarI), c68.a(R.color.text_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                imf0VarB = imf0.b(mla.l(R.style.B1_R, bVarI), c68.a(R.color.text_primary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214);
                str3 = "•";
                imf0Var5 = imf0VarB2;
            } else {
                bVarI.G();
                str3 = str;
                imf0Var5 = imf0Var;
                imf0VarB = imf0Var2;
            }
            bVarI.Y();
            float f = 8.0f;
            i78 i78VarA = g78.a(new kw0.i(8.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
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
            Iterator itA = yt1.a(bVarI, dVarC, yka.a.d, -670000961, list);
            while (itA.hasNext()) {
                UiText uiText = (UiText) itA.next();
                d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, i3);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d.a aVar3 = d.a.b;
                d dVarC2 = c.c(bVarI, aVar3);
                yka.k.getClass();
                tsr.a aVar4 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar4);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, yka.a.f);
                hlh0.a(bVarI, ne00VarS2, yka.a.e);
                yka.a.C1350a c1350a2 = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
                }
                hlh0.a(bVarI, dVarC2, yka.a.d);
                float f2 = f;
                b bVar2 = bVarI;
                lkf0.d(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var5, bVar2, 6, 0, 131070);
                ty0.a(bVar2, j.w(aVar3, f2));
                uiText.getClass();
                String strG = uiText.g((Context) bVar2.O(AndroidCompositionLocals_androidKt.b));
                long jM = mla.m(21.0f, bVar2);
                imf0 imf0Var6 = imf0VarB;
                lkf0.d(strG, new LayoutWeightElement(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(imf0Var6, 0L, 0L, null, null, null, 0L, null, null, null, 0, jM, null, null, 16646143), bVar2, 0, 0, 131068);
                bVar2.X(true);
                f = f2;
                imf0VarB = imf0Var6;
                bVarI = bVar2;
                z = true;
                str3 = str3;
                imf0Var5 = imf0Var5;
                i3 = 0;
            }
            str2 = str3;
            b bVar3 = bVarI;
            bVar3.X(i3);
            bVar3.X(z);
            imf0Var4 = imf0VarB;
            imf0Var3 = imf0Var5;
            bVar = bVar3;
        } else {
            b bVar4 = bVarI;
            bVar4.G();
            str2 = str;
            imf0Var3 = imf0Var;
            imf0Var4 = imf0Var2;
            bVar = bVar4;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final String str4 = str2;
            eVarZ.d = new Function2(list, str4, imf0Var3, imf0Var4, i) { // from class: oj5
                public final /* synthetic */ List b;
                public final /* synthetic */ String c;
                public final /* synthetic */ imf0 d;
                public final /* synthetic */ imf0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    pj5.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
