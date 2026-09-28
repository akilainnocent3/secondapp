package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class kh80 {
    public static final void a(final boolean z, final String str, final String str2, final List<String> list, final List<String> list2, a aVar, final int i) {
        b bVar;
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        b bVarI = aVar.i(181261503);
        int i2 = i | (bVarI.b(z) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.M(list) ? 2048 : 1024) | (bVarI.M(list2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            float f = z ? 30.0f : 16.0f;
            kw0.j jVar = kw0.a;
            n54.b bVar3 = ht.a.j;
            d160 d160VarA = b160.a(jVar, bVar3, bVarI, 0);
            float f2 = f;
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d dVarT = j.t(aVar2, f2, 16.0f);
            long jA = c68.a(R.color.brand_secondary_variable_type1, bVarI);
            zk40.a aVar4 = zk40.a;
            d dVarH = h.h(androidx.compose.foundation.a.b(dVarT, jA, aVar4), 0.0f, 2.0f, 1);
            imf0 imf0VarL = mla.l(R.style.B2_B, bVarI);
            float f3 = 16.0f;
            lkf0.d(str, dVarH, c68.a(R.color.text_type1_primary, bVarI), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, imf0VarL, bVarI, (i2 >> 3) & 14, 0, 130040);
            b bVar4 = bVarI;
            bVar4.N(424826696);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                b bVar5 = bVar4;
                lkf0.d((String) it.next(), h.h(j.r(aVar2, f3), 0.0f, 2.0f, 1), c68.a(R.color.text_type1_primary, bVar4), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar4), bVar5, 48, 0, 130040);
                bVar4 = bVar5;
                f3 = 16.0f;
            }
            bVar4.X(false);
            bVar4.X(true);
            d160 d160VarA2 = b160.a(jVar, bVar3, bVar4, 0);
            int iHashCode3 = Long.hashCode(bVar4.T);
            ne00 ne00VarS3 = bVar4.S();
            d dVarC3 = c.c(bVar4, aVar2);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVar4.D();
            if (bVar4.S) {
                bVar4.F(aVar5);
            } else {
                bVar4.p();
            }
            hlh0.a(bVar4, d160VarA2, yka.a.f);
            hlh0.a(bVar4, ne00VarS3, yka.a.e);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVar4.S || !Intrinsics.g(bVar4.y(), Integer.valueOf(iHashCode3))) {
                n30.a(iHashCode3, bVar4, iHashCode3, c1350a2);
            }
            hlh0.a(bVar4, dVarC3, yka.a.d);
            b bVar6 = bVar4;
            lkf0.d(str2, h.h(androidx.compose.foundation.a.b(j.t(aVar2, f2, 16.0f), c68.a(R.color.brand_secondary_variable_type1, bVar4), aVar4), 0.0f, 2.0f, 1), c68.a(R.color.text_type1_primary, bVar4), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_B, bVar4), bVar6, (i2 >> 6) & 14, 0, 130040);
            bVar = bVar6;
            bVar.N(309022897);
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                b bVar7 = bVar;
                lkf0.d((String) it2.next(), h.h(j.r(aVar2, 16.0f), 0.0f, 2.0f, 1), c68.a(R.color.text_type1_primary, bVar), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVar), bVar7, 48, 0, 130040);
                bVar = bVar7;
            }
            f30.a(bVar, false, true, true);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, str, str2, list, list2, i) { // from class: jh80
                public final /* synthetic */ boolean a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ List d;
                public final /* synthetic */ List e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    kh80.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
