package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.social.ShareIntentType;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class bq00 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ShareIntentType.values().length];
            try {
                iArr[ShareIntentType.TWITTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShareIntentType.TELEGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShareIntentType.WHATSAPP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShareIntentType.FACEBOOK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final boolean z, final tp00 tp00Var, final up00 up00Var, androidx.compose.runtime.a aVar, final int i) throws Throwable {
        String strA;
        Throwable th;
        char c;
        nk0 nk0VarM;
        int i2;
        b bVarI = aVar.i(-1998560387);
        int i3 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.A(tp00Var) ? 256 : 128) | (bVarI.A(up00Var) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            d.a aVar2 = d.a.b;
            d dVarJ = h.j(androidx.compose.foundation.a.b(j.g(aVar2, 1.0f), c68.a(R.color.background_general_primary, bVarI), zk40.a), 0.0f, 16.0f, 0.0f, 24.0f, 5);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
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
            bVarI.N(-699850126);
            int i4 = z ? R.string.personal_page__share_my_sportysocial : R.string.personal_page__share_vuser_sportysocial;
            if (z) {
                bVarI.N(1753904014);
                strA = cb40.a(i4, new Object[0], bVarI);
            } else {
                bVarI.N(1753905112);
                strA = cb40.a(i4, new Object[]{str}, bVarI);
            }
            bVarI.X(false);
            if (z) {
                StringBuilder sb = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb.append(strA);
                String string = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList2.add(((nk0.b.a) arrayList.get(i5)).a(sb.length()));
                }
                nk0VarM = new nk0(string, arrayList2);
                bVarI.X(false);
                th = null;
                c = 6;
            } else {
                long jA = c68.a(R.color.brand_secondary, bVarI);
                th = null;
                nk0.b bVar = new nk0.b((Object) null);
                c = 6;
                int iT = StringsKt.T(strA, str, 0, false, 6);
                bVar.g(strA.substring(0, iT));
                int iL = bVar.l(new ora0(jA, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534));
                try {
                    bVar.g(str);
                    Unit unit = Unit.a;
                    bVar.i(iL);
                    bVar.g(strA.substring(str.length() + iT));
                    nk0VarM = bVar.m();
                    bVarI.X(false);
                } catch (Throwable th2) {
                    bVar.i(iL);
                    throw th2;
                }
            }
            nk0 nk0Var = nk0VarM;
            long jF = d2l.f(18);
            n54.a aVar4 = ht.a.n;
            Throwable th3 = th;
            lkf0.e(nk0Var, new HorizontalAlignElement(aVar4), c68.a(R.color.text_type1_primary, bVarI), jF, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, null, mla.l(R.style.H3_B, bVarI), bVarI, 24576, 0, 261096);
            b(R.drawable.ic_share_copylink, i3 & 7168, bVarI, h.j(aVar2, 24.0f, 40.0f, 0.0f, 0.0f, 12), cb40.a(R.string.common_functions__copy_link, new Object[0], bVarI), up00Var);
            h2f0.a.a(h.f(aVar2, 24.0f), 1.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 3126, 0);
            bVarI = bVarI;
            List listK = kotlin.collections.b.k(new Pair(ShareIntentType.TWITTER, Integer.valueOf(R.drawable.ic_x)), new Pair(ShareIntentType.TELEGRAM, Integer.valueOf(R.drawable.ic_telegram)), new Pair(ShareIntentType.WHATSAPP, Integer.valueOf(R.drawable.ic_whatsapp)), new Pair(ShareIntentType.FACEBOOK, Integer.valueOf(R.drawable.ic_facebook)));
            d dVarB = op70.b(aVar2, op70.a(bVarI), false, true, false);
            d160 d160VarA = b160.a(new kw0.i(16.0f, true, new iw0(aVar4)), ht.a.j, bVarI, 6);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar5);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            yka.a.C1350a c1350a2 = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a2);
            }
            Iterator itA = yt1.a(bVarI, dVarC2, yka.a.d, -1989624340, listK);
            int i6 = 0;
            while (itA.hasNext()) {
                Object next = itA.next();
                int i7 = i6 + 1;
                if (i6 < 0) {
                    kotlin.collections.b.q();
                    throw th3;
                }
                Pair pair = (Pair) next;
                final ShareIntentType shareIntentType = (ShareIntentType) pair.a;
                int iIntValue = ((Number) pair.b).intValue();
                d dVarJ2 = i6 == 0 ? h.j(aVar2, 24.0f, 0.0f, 0.0f, 0.0f, 14) : aVar2;
                int i8 = a.a[shareIntentType.ordinal()];
                if (i8 == 1) {
                    i2 = R.string.common_functions__x;
                } else if (i8 == 2) {
                    i2 = R.string.common_functions__telegram;
                } else if (i8 == 3) {
                    i2 = R.string.common_functions__whatsapp;
                } else {
                    if (i8 != 4) {
                        uhc.a();
                        return;
                    }
                    i2 = R.string.common_functions__facebook;
                }
                String strA2 = cb40.a(i2, new Object[0], bVarI);
                boolean zD = ((i3 & 896) == 256) | bVarI.d(shareIntentType.ordinal());
                Object objY = bVarI.y();
                if (zD || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new Function0() { // from class: zp00
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            tp00Var.invoke(shareIntentType);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                b(iIntValue, 0, bVarI, dVarJ2, strA2, (Function0) objY);
                i6 = i7;
            }
            f30.a(bVarI, false, true, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, z, tp00Var, up00Var, i) { // from class: aq00
                public final /* synthetic */ String a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ tp00 c;
                public final /* synthetic */ up00 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws Throwable {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    bq00.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, final int i2, androidx.compose.runtime.a aVar, final d dVar, final String str, final Function0 function0) {
        function0.getClass();
        b bVarI = aVar.i(-1369652784);
        int i3 = i2 | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(str) ? 32 : 16) | (bVarI.d(i) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = (i3 & 7168) == 2048;
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new k4w(function0, 1);
                bVarI.r(objY);
            }
            d dVarD = androidx.compose.foundation.d.d(dVar, false, null, null, (Function0) objY, 15);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarD);
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
            crz crzVarA = erz.a(i, (i3 >> 6) & 14, bVarI);
            d.a aVar3 = d.a.b;
            h9n.a(crzVarA, null, j.r(aVar3, 40.0f), null, null, 0.0f, null, bVarI, 432, 120);
            lkf0.d(str, h.j(aVar3, 0.0f, 8.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_tertiary, bVarI), null, d2l.f(10), null, null, null, 0L, null, new gdf0(3), d2l.f(12), 0, false, 0, 0, null, null, bVarI, ((i3 >> 3) & 14) | 24624, 48, 259048);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, dVar, str, function0) { // from class: xp00
                public final /* synthetic */ d a;
                public final /* synthetic */ String b;
                public final /* synthetic */ int c;
                public final /* synthetic */ Function0 d;

                {
                    this.a = dVar;
                    this.b = str;
                    this.d = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    bq00.b(this.c, iA, (a) obj, this.a, this.b, this.d);
                    return Unit.a;
                }
            };
        }
    }
}
