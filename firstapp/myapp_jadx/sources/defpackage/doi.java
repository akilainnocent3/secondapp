package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.esotericsoftware.spine.android.SpineView;
import com.esotericsoftware.spine.android.b;
import com.sportygames.commons.SportyGamesManager;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes8.dex */
public final class doi {

    public static final class a implements tse {
        public final /* synthetic */ s9s a;
        public final /* synthetic */ tni b;

        public a(s9s s9sVar, tni tniVar) {
            this.a = s9sVar;
            this.b = tniVar;
        }

        @Override // defpackage.tse
        public final void dispose() {
            this.a.d(this.b);
        }
    }

    public static final void a(final d dVar, final File file, final File file2, final ytw<b> ytwVar, final int i, final int i2, androidx.compose.runtime.a aVar, final int i3) {
        dVar.getClass();
        ytwVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(84226803);
        int i4 = i3 | (bVarI.M(dVar) ? 4 : 2) | (bVarI.A(file) ? 32 : 16) | (bVarI.A(file2) ? 256 : 128) | (bVarI.M(ytwVar) ? 2048 : 1024) | (bVarI.d(i) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.d(i2) ? 131072 : 65536);
        if (bVarI.q(i4 & 1, (74899 & i4) != 74898)) {
            final ibs ibsVar = (ibs) bVarI.O(ndt.a);
            int i5 = i4 & 7168;
            boolean zA = (i5 == 2048) | bVarI.A(ibsVar);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new Function1() { // from class: pni
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r2v2, types: [hbs, tni] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((use) obj).getClass();
                        final ytw ytwVar2 = ytwVar;
                        ?? r2 = new cbs() { // from class: tni
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.cbs
                            public final void F0(ibs ibsVar2, s9s.a aVar2) {
                                if (aVar2 == s9s.a.ON_RESUME) {
                                    doi.d((b) ytwVar2.getValue());
                                }
                            }
                        };
                        s9s lifecycle = ibsVar.getLifecycle();
                        lifecycle.a(r2);
                        return new doi.a(lifecycle, r2);
                    }
                };
                bVarI.r(objY);
            }
            xvf.c(ibsVar, (Function1) objY, bVarI);
            d dVarE = j.e(dVar, 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            float f = i;
            float f2 = i2;
            final float f3 = f / f2 < 1.9f ? 0.85f : 1.0f;
            float f4 = f2 * 0.528f;
            final float f5 = (f * 0.642f) - ((f / 2.0f) + (0.428f * f4));
            final float f6 = f3 == 1.0f ? 0.0f : ((f3 - 1.0f) * f4) / 2.15f;
            d dVarE2 = j.e(d.a.b, 1.0f);
            boolean zC = bVarI.c(f5) | bVarI.c(f6) | bVarI.c(f3);
            Object objY2 = bVarI.y();
            if (zC || objY2 == c0042a) {
                objY2 = new Function1() { // from class: uni
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.f(f5 - f6);
                        float f7 = f3;
                        if (f7 != 1.0f) {
                            a7lVar.k(f7);
                            a7lVar.v(f7);
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            d dVarA = androidx.compose.ui.graphics.a.a(dVarE2, (Function1) objY2);
            boolean zA2 = bVarI.A(file) | bVarI.A(file2) | (i5 == 2048);
            Object objY3 = bVarI.y();
            if (zA2 || objY3 == c0042a) {
                objY3 = new Function1() { // from class: vni
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        final ytw ytwVar2 = ytwVar;
                        return SpineView.a(file, file2, context, new b(new hcb0() { // from class: sni
                            @Override // defpackage.hcb0
                            public final void b(b bVar) {
                                ytwVar2.setValue(bVar);
                                doi.d(bVar);
                                bVar.a().m(0, "idle", true);
                            }
                        }));
                    }
                };
                bVarI.r(objY3);
            }
            Function1 function1 = (Function1) objY3;
            boolean z = i5 == 2048;
            Object objY4 = bVarI.y();
            if (z || objY4 == c0042a) {
                objY4 = new wni(ytwVar, 0);
                bVarI.r(objY4);
            }
            androidx.compose.ui.viewinterop.b.a(function1, dVarA, (Function1) objY4, bVarI, 0, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(file, file2, ytwVar, i, i2, i3) { // from class: xni
                public final /* synthetic */ File b;
                public final /* synthetic */ File c;
                public final /* synthetic */ ytw d;
                public final /* synthetic */ int e;
                public final /* synthetic */ int f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    doi.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final File file, final File file2, ytw ytwVar, final String str, final int i, final int i2, final boolean z, final Function1 function1, androidx.compose.runtime.a aVar, final int i3) {
        Object obj;
        boolean z2;
        boolean z3;
        final ytw ytwVar2 = ytwVar;
        dVar.getClass();
        ytwVar2.getClass();
        str.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1612982894);
        int i4 = i3 | (bVarI.M(dVar) ? 4 : 2) | (bVarI.A(file) ? 32 : 16) | (bVarI.A(file2) ? 256 : 128) | (bVarI.M(ytwVar2) ? 2048 : 1024) | (bVarI.M(str) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.d(i) ? 131072 : 65536) | (bVarI.d(i2) ? 1048576 : 524288) | (bVarI.b(z) ? 8388608 : 4194304) | (bVarI.A(function1) ? 67108864 : 33554432);
        if (bVarI.q(i4 & 1, (38347923 & i4) != 38347922)) {
            final ytw ytwVarC = m.c(str, bVarI);
            final ytw ytwVarC2 = m.c(Boolean.valueOf(z), bVarI);
            final ibs ibsVar = (ibs) bVarI.O(ndt.a);
            Boolean boolValueOf = Boolean.valueOf(z);
            int i5 = i4 & 7168;
            int i6 = i4 & 29360128;
            boolean zA = (i5 == 2048) | (i6 == 8388608) | bVarI.A(ibsVar);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new Function1() { // from class: yni
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r3v2, types: [hbs, rni] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        ((use) obj2).getClass();
                        ytw ytwVar3 = ytwVar2;
                        boolean z4 = z;
                        ?? r3 = new cbs(z4) { // from class: rni
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.cbs
                            public final void F0(ibs ibsVar2, s9s.a aVar2) {
                                if (aVar2 == s9s.a.ON_RESUME) {
                                    doi.e((b) this.a.getValue());
                                }
                            }
                        };
                        if (z4) {
                            doi.e((b) ytwVar3.getValue());
                        }
                        s9s lifecycle = ibsVar.getLifecycle();
                        lifecycle.a(r3);
                        return new goi(lifecycle, r3);
                    }
                };
                bVarI.r(objY);
            }
            xvf.a(ibsVar, boolValueOf, (Function1) objY, bVarI);
            boolean zM = bVarI.M(ytwVarC) | (i5 == 2048);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new eoi(ytwVar2, ytwVarC, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, str, (Function2) objY2);
            d dVarE = j.e(dVar, 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            float f = i;
            float f2 = i2;
            final float f3 = f / f2 < 1.9f ? 0.9f : 1.05f;
            float f4 = f2 * 0.498f;
            final float f5 = (f * 0.642f) - ((f / 2.0f) + (0.379f * f4));
            final float f6 = ((f3 - 1.0f) * f4) / 2.15f;
            d dVarE2 = j.e(d.a.b, 1.0f);
            boolean zC = bVarI.c(f5) | bVarI.c(f6) | bVarI.c(f3);
            Object objY3 = bVarI.y();
            if (zC || objY3 == c0042a) {
                objY3 = new Function1() { // from class: zni
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        a7l a7lVar = (a7l) obj2;
                        a7lVar.getClass();
                        a7lVar.f(f5 - f6);
                        float f7 = f3;
                        a7lVar.k(f7);
                        a7lVar.v(f7);
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            d dVarA = androidx.compose.ui.graphics.a.a(dVarE2, (Function1) objY3);
            boolean zA2 = bVarI.A(file) | bVarI.A(file2) | (i5 == 2048) | bVarI.M(ytwVarC2) | ((i4 & 234881024) == 67108864) | bVarI.M(ytwVarC);
            Object objY4 = bVarI.y();
            if (zA2 || objY4 == c0042a) {
                ytwVar2 = ytwVar;
                z2 = true;
                z3 = false;
                obj = new Function1() { // from class: aoi
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Context context = (Context) obj2;
                        context.getClass();
                        final ytw ytwVar3 = ytwVar2;
                        final ytw ytwVar4 = ytwVarC2;
                        final Function1 function2 = function1;
                        final ytw ytwVar5 = ytwVarC;
                        return SpineView.a(file, file2, context, new b(new hcb0() { // from class: qni
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.hcb0
                            public final void b(b bVar) {
                                ytw ytwVar6 = ytwVar3;
                                ytwVar6.setValue(bVar);
                                ((Boolean) ytwVar4.getValue()).getClass();
                                doi.e(bVar);
                                b bVar2 = (b) ytwVar6.getValue();
                                if (bVar2 != null) {
                                    bVar2.a().d.clear();
                                }
                                b bVar3 = (b) ytwVar6.getValue();
                                ytw ytwVar7 = ytwVar5;
                                if (bVar3 != null) {
                                    bVar3.a().b(new foi(function2, ytwVar7, ytwVar6));
                                }
                                doi.c(ytwVar6, ytwVar7);
                            }
                        }));
                    }
                };
                bVarI.r(obj);
            } else {
                ytwVar2 = ytwVar;
                obj = objY4;
                z2 = true;
                z3 = false;
            }
            Function1 function2 = (Function1) obj;
            boolean z4 = i5 == 2048 ? z2 : z3;
            if (i6 == 8388608) {
                z3 = z2;
            }
            boolean z5 = z4 | z3;
            Object objY5 = bVarI.y();
            if (z5 || objY5 == c0042a) {
                objY5 = new Function1(z) { // from class: boi
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        doi.e((b) this.a.getValue());
                        return Unit.a;
                    }
                };
                bVarI.r(objY5);
            }
            androidx.compose.ui.viewinterop.b.a(function2, dVarA, (Function1) objY5, bVarI, 0, 0);
            bVarI.X(z2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final ytw ytwVar3 = ytwVar2;
            eVarZ.d = new Function2(file, file2, ytwVar3, str, i, i2, z, function1, i3) { // from class: coi
                public final /* synthetic */ File b;
                public final /* synthetic */ File c;
                public final /* synthetic */ ytw d;
                public final /* synthetic */ String e;
                public final /* synthetic */ int f;
                public final /* synthetic */ int i;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ Function1 w;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(1);
                    doi.b(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b1  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(ytw ytwVar, ytw ytwVar2) {
        b bVar;
        String str;
        String strA;
        List list;
        int i;
        List<do60.c> list2;
        do60.b bVar2;
        do60.b bVar3;
        do60.b bVar4;
        if (Intrinsics.g((String) ytwVar2.getValue(), "ROUND_PRE_START")) {
            b bVar5 = (b) ytwVar.getValue();
            if (bVar5 != null) {
                bVar5.a().a(0, "1_Leg/0_Start", false);
                return;
            }
            return;
        }
        if (!Intrinsics.g((String) ytwVar2.getValue(), "ROUND_ONGOING")) {
            if (Intrinsics.g((String) ytwVar2.getValue(), "ROUND_END_WAIT")) {
                b bVar6 = (b) ytwVar.getValue();
                zi0.e eVarJ = bVar6 != null ? bVar6.a().j() : null;
                if (eVarJ != null) {
                    b bVar7 = (b) ytwVar.getValue();
                    if (bVar7 != null) {
                        bVar7.a().f(eVarJ);
                    }
                    lh0 lh0Var = eVarJ.a;
                    String str2 = "";
                    if (lh0Var != null && (str = lh0Var.a) != null && (strA = do60.a(str, "")) != null) {
                        str2 = strA;
                    }
                    if (str2.length() <= 0 || (bVar = (b) ytwVar.getValue()) == null) {
                        return;
                    }
                    bVar.a().a(0, str2, false);
                    return;
                }
                return;
            }
            return;
        }
        HashMap<String, do60.a> map = do60.a;
        ArrayList arrayList = new ArrayList();
        String str3 = "Leg";
        int i2 = 0;
        while (true) {
            do60.a aVar = do60.a.get(str3);
            if (aVar != null && (bVar4 = aVar.e) != null) {
                arrayList.add(bVar4.a);
            }
            if (aVar != null && aVar.a) {
                arrayList.add(aVar.d.a);
            }
            int i3 = aVar != null ? aVar.b : 0;
            if (aVar == null || (bVar3 = aVar.e) == null || (list = bVar3.c) == null) {
                list = m2g.a;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i3 += ((do60.c) it.next()).d;
            }
            lx30.INSTANCE.getClass();
            int iF = lx30.b.f(i3);
            if (iF < 0) {
                if (aVar != null) {
                    i = aVar.b;
                } else {
                    i = 0;
                }
                if (aVar != null || (bVar2 = aVar.e) == null || (list2 = bVar2.c) == null) {
                    list2 = m2g.a;
                }
                for (do60.c cVar : list2) {
                    if (iF < i && iF < cVar.d + i) {
                        str3 = cVar.a;
                        arrayList.add(cVar.c);
                        break;
                    }
                    i += cVar.d;
                }
            } else if (iF >= (aVar != null ? aVar.b : 0)) {
                if (aVar != null) {
                    i = aVar.b;
                } else {
                    i = 0;
                }
                if (aVar != null) {
                    list2 = m2g.a;
                } else {
                    list2 = m2g.a;
                }
                while (r3.hasNext()) {
                    if (iF < i) {
                    }
                    i += cVar.d;
                }
            }
            if (i2 == 50) {
                break;
            } else {
                i2++;
            }
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            obj.getClass();
            String str4 = (String) obj;
            b bVar8 = (b) ytwVar.getValue();
            if (bVar8 != null) {
                bVar8.a().a(0, str4, false);
            }
        }
    }

    public static final void d(b bVar) {
        String str;
        if (bVar != null) {
            try {
                mx90 mx90VarB = bVar.b();
                String country = SportyGamesManager.getInstance().getCountry();
                country.getClass();
                Locale locale = Locale.ROOT;
                String lowerCase = country.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.equalsIgnoreCase("ke")) {
                    str = "Kenya_Benni_McCarthy";
                } else {
                    String country2 = SportyGamesManager.getInstance().getCountry();
                    country2.getClass();
                    String lowerCase2 = country2.toLowerCase(locale);
                    lowerCase2.getClass();
                    str = lowerCase2.equalsIgnoreCase("za") ? "South_Africa_Benni_McCarthy" : "Sportybet";
                }
                mx90VarB.c(str);
                mx90VarB.d();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static final void e(b bVar) {
        String str;
        if (bVar != null) {
            try {
                mx90 mx90VarB = bVar.b();
                String country = SportyGamesManager.getInstance().getCountry();
                country.getClass();
                Locale locale = Locale.ROOT;
                String lowerCase = country.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.equalsIgnoreCase("ke")) {
                    str = "Kenya_Benni_McCarthy";
                } else {
                    String country2 = SportyGamesManager.getInstance().getCountry();
                    country2.getClass();
                    String lowerCase2 = country2.toLowerCase(locale);
                    lowerCase2.getClass();
                    str = lowerCase2.equalsIgnoreCase("za") ? "South_Africa_Benni_McCarthy" : "Sportybet";
                }
                mx90VarB.c(str);
                mx90VarB.d();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
