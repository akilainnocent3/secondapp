package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.d;
import androidx.compose.runtime.j;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.esotericsoftware.spine.android.SpineView;
import com.sportybet.android.gp.tz.R;
import java.io.File;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes8.dex */
public final class a9p {

    /* JADX INFO: loaded from: classes.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[s9s.a.values().length];
            try {
                iArr[s9s.a.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s9s.a.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(File file, File file2, String str, final File file3, final boolean z, final long j, final boolean z2, final boolean z3, long j2, final String str2, final boolean z4, final ytw ytwVar, xpf0 xpf0Var, boolean z5, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final String str3;
        File file4;
        File file5;
        b bVar;
        final xpf0 xpf0Var2;
        int i3;
        xpf0 xpf0Var3;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        final ytw ytwVar2;
        char c;
        final isw iswVar;
        final isw iswVar2;
        boolean z6;
        boolean z7;
        float fJ;
        float fJ2;
        long j3 = j2;
        final boolean z8 = z5;
        str.getClass();
        ytwVar.getClass();
        b bVarI = aVar.i(217015994);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(file) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(file2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.e(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.b(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.b(z3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= bVarI.e(j3) ? 67108864 : 33554432;
        }
        int i4 = 128 | (bVarI.M(ytwVar) ? ' ' : (char) 16) | (bVarI.b(z8) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, ((i2 & 38346899) == 38346898 && (i4 & 1169) == 1168) ? false : true)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    xpf0 xpf0Var4 = (xpf0) p8i0.a(jq40.a(xpf0.class), w8i0VarA, null, null, w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
                    i3 = i4 & (-897);
                    xpf0Var3 = xpf0Var4;
                }
            } else {
                bVarI.G();
                i3 = i4 & (-897);
                xpf0Var3 = xpf0Var;
            }
            bVarI.Y();
            chf chfVar = AndroidCompositionLocals_androidKt.a;
            Configuration configuration = (Configuration) bVarI.O(chfVar);
            int i5 = configuration.screenWidthDp;
            int i6 = configuration.screenHeightDp;
            int i7 = i3;
            float density = ((mmd) bVarI.O(kna.h)).getDensity();
            float f = i5 * density;
            float f2 = i6 * density;
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a2) {
                objY = j.a(0.0f);
                bVarI.r(objY);
            }
            isw iswVar3 = (isw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a2) {
                objY2 = j.a(0.0f);
                bVarI.r(objY2);
            }
            isw iswVar4 = (isw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a2) {
                objY3 = m.b(new gly((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)));
                bVarI.r(objY3);
            }
            ytw ytwVar3 = (ytw) objY3;
            ytw ytwVarB = n95.b(xpf0Var3.d, bVarI);
            final aq40 aq40Var = new aq40();
            xpf0 xpf0Var5 = xpf0Var3;
            aq40Var.a = Math.max(((Number) ytwVarB.getValue()).floatValue() / 2.0f, 1.0f);
            d<ibs> dVar = ndt.a;
            final ibs ibsVar = (ibs) bVarI.O(dVar);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a2) {
                objY4 = m.b(null);
                bVarI.r(objY4);
            }
            ytw ytwVar4 = (ytw) objY4;
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            Context context = (Context) bVarI.O(qyd0Var);
            int i8 = i2 & 896;
            int i9 = i2;
            boolean z9 = i8 == 256;
            Object objY5 = bVarI.y();
            if (z9 || objY5 == c0042a2) {
                objY5 = SpineView.a(file, file2, context, new com.esotericsoftware.spine.android.b(new htj(ytwVar4)));
                bVarI.r(objY5);
            }
            SpineView spineView = (SpineView) objY5;
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean z10 = ((i9 & 29360128) == 8388608) | ((i7 & 112) == 32) | (i8 == 256);
            Object objY6 = bVarI.y();
            if (z10 || objY6 == c0042a2) {
                bVar = bVarI;
                c0042a = c0042a2;
                ytwVar2 = ytwVar4;
                c = ' ';
                str3 = str;
                objY6 = new s8p(z3, ytwVar, ytwVar2, str3, null);
                bVar.r(objY6);
            } else {
                str3 = str;
                bVar = bVarI;
                c0042a = c0042a2;
                ytwVar2 = ytwVar4;
                c = ' ';
            }
            xvf.g(str3, boolValueOf, (Function2) objY6, bVar);
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            if (z3) {
                bVar.N(1199960334);
                if (iswVar3.j() == 0.0f) {
                    bVar.N(-1900957045);
                    fJ = (f - (f / 1.11f)) - i7f.a(fw20.a(R.dimen._4sdp, bVar), bVar);
                    bVar.X(false);
                } else {
                    bVar.N(-1900954268);
                    bVar.X(false);
                    fJ = iswVar3.j();
                }
                if (iswVar4.j() == 0.0f) {
                    bVar.N(-1900952035);
                    fJ2 = (f2 / 2.29f) - i7f.a(fw20.a(R.dimen._64sdp, bVar), bVar);
                    bVar.X(false);
                } else {
                    bVar.N(-1900949692);
                    bVar.X(false);
                    fJ2 = iswVar4.j();
                }
                Object objY7 = bVar.y();
                if (objY7 == c0042a) {
                    objY7 = ee0.a(fJ);
                    bVar.r(objY7);
                }
                wd0 wd0Var = (wd0) objY7;
                Object objY8 = bVar.y();
                if (objY8 == c0042a) {
                    objY8 = ee0.a(fJ2);
                    bVar.r(objY8);
                }
                wd0 wd0Var2 = (wd0) objY8;
                Object objY9 = bVar.y();
                if (objY9 == c0042a) {
                    objY9 = xvf.i(e.a, bVar);
                    bVar.r(objY9);
                }
                v5b v5bVar = (v5b) objY9;
                float fA = i7f.a(((Configuration) bVar.O(r18)).screenWidthDp, bVar);
                float fA2 = i7f.a(((Configuration) bVar.O(chfVar)).screenHeightDp, bVar);
                Unit unit = Unit.a;
                boolean zA = bVar.A(v5bVar) | bVar.A(wd0Var) | bVar.c(fJ) | bVar.c(fA) | bVar.A(wd0Var2) | bVar.c(fJ2) | bVar.c(fA2);
                Object objY10 = bVar.y();
                if (zA || objY10 == c0042a) {
                    objY10 = new u8p(v5bVar, wd0Var, fJ, fA, wd0Var2, fJ2, fA2, null);
                    bVar.r(objY10);
                }
                xvf.e(bVar, unit, (Function2) objY10);
                boolean zA2 = bVar.A(ibsVar);
                Object objY11 = bVar.y();
                if (zA2 || objY11 == c0042a) {
                    objY11 = new Function1() { // from class: p8p
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r2v2, types: [hbs, l8p] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((use) obj).getClass();
                            final ytw ytwVar5 = ytwVar2;
                            ?? r2 = new cbs() { // from class: l8p
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.cbs
                                public final void F0(ibs ibsVar2, s9s.a aVar3) {
                                    if (a9p.a.a[aVar3.ordinal()] == 1) {
                                        ytw ytwVar6 = ytwVar5;
                                        if (((com.esotericsoftware.spine.android.b) ytwVar6.getValue()) != null) {
                                            com.esotericsoftware.spine.android.b bVar2 = (com.esotericsoftware.spine.android.b) ytwVar6.getValue();
                                            if (bVar2 != null && bVar2.d) {
                                                bVar2.d = false;
                                            }
                                            com.esotericsoftware.spine.android.b bVar3 = (com.esotericsoftware.spine.android.b) ytwVar6.getValue();
                                            if (bVar3 != null) {
                                                bVar3.a().h();
                                            }
                                            com.esotericsoftware.spine.android.b bVar4 = (com.esotericsoftware.spine.android.b) ytwVar6.getValue();
                                            if (bVar4 != null) {
                                                bVar4.a().d.clear();
                                            }
                                        }
                                    }
                                }
                            };
                            ibs ibsVar2 = ibsVar;
                            ibsVar2.getLifecycle().a(r2);
                            return new w8p(ibsVar2, r2);
                        }
                    };
                    bVar.r(objY11);
                }
                xvf.c(ibsVar, (Function1) objY11, bVar);
                boolean zA3 = (i8 == 256) | bVar.A(ibsVar);
                Object objY12 = bVar.y();
                if (zA3 || objY12 == c0042a) {
                    objY12 = new Function1() { // from class: q8p
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r3v2, types: [hbs, i8p] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((use) obj).getClass();
                            final ytw ytwVar5 = ytwVar2;
                            final String str4 = str3;
                            ?? r3 = new cbs() { // from class: i8p
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.cbs
                                public final void F0(ibs ibsVar2, s9s.a aVar3) {
                                    com.esotericsoftware.spine.android.b bVar2;
                                    if (aVar3 != s9s.a.ON_RESUME || (bVar2 = (com.esotericsoftware.spine.android.b) ytwVar5.getValue()) == null) {
                                        return;
                                    }
                                    bVar2.a().m(0, str4, true);
                                }
                            };
                            s9s lifecycle = ibsVar.getLifecycle();
                            lifecycle.a(r3);
                            return new x8p(lifecycle, r3);
                        }
                    };
                    bVar.r(objY12);
                }
                xvf.c(ibsVar, (Function1) objY12, bVar);
                boolean z11 = i8 == 256;
                Object objY13 = bVar.y();
                if (z11 || objY13 == c0042a) {
                    objY13 = new v8p(null, ytwVar2, str3);
                    bVar.r(objY13);
                }
                xvf.e(bVar, str3, (Function2) objY13);
                boolean zA4 = bVar.A(spineView);
                Object objY14 = bVar.y();
                if (zA4 || objY14 == c0042a) {
                    objY14 = new r8p(spineView, 0);
                    bVar.r(objY14);
                }
                Function1 function1 = (Function1) objY14;
                androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.j.i(androidx.compose.foundation.layout.j.w(aVar2, fw20.a(R.dimen._110sdp, bVar)), fw20.a(R.dimen._80sdp, bVar));
                boolean zA5 = bVar.A(wd0Var) | bVar.A(wd0Var2);
                Object objY15 = bVar.y();
                if (zA5 || objY15 == c0042a) {
                    objY15 = new pc1(1, wd0Var, wd0Var2);
                    bVar.r(objY15);
                }
                androidx.compose.ui.d dVarC = androidx.compose.ui.draw.a.c(s3w.a(androidx.compose.ui.graphics.a.a(dVarI, (Function1) objY15), "sj_jet_animation"), new Function1() { // from class: d8p
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        lza lzaVar = (lza) obj;
                        lzaVar.getClass();
                        float[] fArrA = t58.a();
                        float f3 = aq40Var.a;
                        t58.b(f3, f3, f3, fArrA);
                        b90 b90VarA = c90.a();
                        b90VarA.k(new u58(fArrA));
                        lc6 lc6VarA = lzaVar.F1().a();
                        try {
                            lc6VarA.s(pk40.b(0L, lzaVar.F1().d()), b90VarA);
                            lzaVar.b2();
                            return Unit.a;
                        } finally {
                            lc6VarA.f();
                        }
                    }
                });
                boolean z12 = (i8 == 256) | ((i7 & 7168) == 2048);
                Object objY16 = bVar.y();
                if (z12 || objY16 == c0042a) {
                    z8 = z5;
                    objY16 = new Function1() { // from class: e8p
                        /* JADX WARN: Code duplicated, block: B:39:0x0082  */
                        /* JADX WARN: Code duplicated, block: B:40:0x0085  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str4;
                            ytw ytwVar5 = ytwVar2;
                            com.esotericsoftware.spine.android.b bVar2 = (com.esotericsoftware.spine.android.b) ytwVar5.getValue();
                            if (bVar2 != null) {
                                bVar2.a().m(0, str3, true);
                            }
                            com.esotericsoftware.spine.android.b bVar3 = (com.esotericsoftware.spine.android.b) ytwVar5.getValue();
                            if (bVar3 == null) {
                                return Unit.a;
                            }
                            if (z8) {
                                String lowerCase = e6a.a().toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                int iHashCode = lowerCase.hashCode();
                                if (iHashCode != 3152) {
                                    if (iHashCode != 3297) {
                                        if (iHashCode != 3499) {
                                            if (iHashCode != 3879) {
                                                if (iHashCode == 104431 && lowerCase.equals("int")) {
                                                    str4 = "WC_Brazil";
                                                }
                                            } else if (lowerCase.equals("za")) {
                                                str4 = "WC_SouthAfrica";
                                            }
                                            str4 = "WC_NG_TZ";
                                        } else if (lowerCase.equals("mx")) {
                                            str4 = "WC_Mexico";
                                        } else {
                                            str4 = "WC_NG_TZ";
                                        }
                                    } else if (lowerCase.equals("gh")) {
                                        str4 = "WC_Ghana";
                                    } else {
                                        str4 = "WC_NG_TZ";
                                    }
                                } else if (lowerCase.equals("br")) {
                                    str4 = "WC_Brazil";
                                } else {
                                    str4 = "WC_NG_TZ";
                                }
                            } else {
                                str4 = "default";
                            }
                            bVar3.b().c(str4);
                            bVar3.b().d();
                            return Unit.a;
                        }
                    };
                    bVar.r(objY16);
                } else {
                    z8 = z5;
                }
                androidx.compose.ui.viewinterop.b.a(function1, dVarC, (Function1) objY16, bVar, 0, 0);
                bVar.X(false);
                file4 = file;
                file5 = file2;
                j3 = j2;
            } else {
                bVar.N(1204724321);
                Object objY17 = bVar.y();
                if (objY17 == c0042a) {
                    objY17 = m.b(null);
                    bVar.r(objY17);
                }
                final ytw ytwVar5 = (ytw) objY17;
                final ibs ibsVar2 = (ibs) bVar.O(dVar);
                if (z) {
                    bVar.N(1204754360);
                    boolean zA6 = (i8 == 256) | bVar.A(ibsVar2);
                    Object objY18 = bVar.y();
                    if (zA6 || objY18 == c0042a) {
                        objY18 = new Function1() { // from class: f8p
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r3v2, types: [hbs, j8p] */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ((use) obj).getClass();
                                final ytw ytwVar6 = ytwVar5;
                                final String str4 = str3;
                                ?? r3 = new cbs() { // from class: j8p
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.cbs
                                    public final void F0(ibs ibsVar3, s9s.a aVar3) {
                                        com.esotericsoftware.spine.android.b bVar2;
                                        int i10 = a9p.a.a[aVar3.ordinal()];
                                        ytw ytwVar7 = ytwVar6;
                                        if (i10 != 1) {
                                            if (i10 == 2 && (bVar2 = (com.esotericsoftware.spine.android.b) ytwVar7.getValue()) != null) {
                                                bVar2.a().m(0, str4, true);
                                                return;
                                            }
                                            return;
                                        }
                                        if (((com.esotericsoftware.spine.android.b) ytwVar7.getValue()) != null) {
                                            com.esotericsoftware.spine.android.b bVar3 = (com.esotericsoftware.spine.android.b) ytwVar7.getValue();
                                            if (bVar3 != null && bVar3.d) {
                                                bVar3.d = false;
                                            }
                                            com.esotericsoftware.spine.android.b bVar4 = (com.esotericsoftware.spine.android.b) ytwVar7.getValue();
                                            if (bVar4 != null) {
                                                bVar4.a().h();
                                            }
                                            com.esotericsoftware.spine.android.b bVar5 = (com.esotericsoftware.spine.android.b) ytwVar7.getValue();
                                            if (bVar5 != null) {
                                                bVar5.a().d.clear();
                                            }
                                        }
                                    }
                                };
                                ibs ibsVar3 = ibsVar2;
                                ibsVar3.getLifecycle().a(r3);
                                return new y8p(ibsVar3, r3);
                            }
                        };
                        bVar.r(objY18);
                    }
                    xvf.c(ibsVar2, (Function1) objY18, bVar);
                    if (z2) {
                        iswVar = iswVar3;
                        iswVar2 = iswVar4;
                        bVar.N(1206001397);
                        iswVar.A(Float.intBitsToFloat((int) (j >> c)) - i7f.a(fw20.a(R.dimen._12sdp, bVar), bVar));
                        iswVar2.A(Float.intBitsToFloat((int) (j & 4294967295L)) - i7f.a(fw20.a(R.dimen._62sdp, bVar), bVar));
                        z7 = false;
                        bVar.X(false);
                    } else {
                        bVar.N(1205800331);
                        iswVar = iswVar3;
                        iswVar.A(Float.intBitsToFloat((int) (j2 >> c)) - i7f.a(fw20.a(R.dimen._12sdp, bVar), bVar));
                        iswVar2 = iswVar4;
                        iswVar2.A(Float.intBitsToFloat((int) (j2 & 4294967295L)) - i7f.a(fw20.a(R.dimen._64sdp, bVar), bVar));
                        z7 = false;
                        bVar.X(false);
                    }
                    bVar.X(z7);
                } else {
                    iswVar = iswVar3;
                    iswVar2 = iswVar4;
                    bVar.N(1206458926);
                    int i10 = (int) (j2 >> c);
                    if (Float.intBitsToFloat(i10) == 0.0f && Float.intBitsToFloat((int) (j2 & 4294967295L)) == 0.0f) {
                        bVar.N(1206501520);
                        iswVar.A((f - (f / 1.11f)) - i7f.a(fw20.a(R.dimen._12sdp, bVar), bVar));
                        iswVar2.A((f2 / 2.29f) - i7f.a(fw20.a(R.dimen._64sdp, bVar), bVar));
                        z6 = false;
                        bVar.X(false);
                    } else {
                        bVar.N(1206751597);
                        iswVar.A(Float.intBitsToFloat(i10) - i7f.a(fw20.a(R.dimen._12sdp, bVar), bVar));
                        iswVar2.A(Float.intBitsToFloat((int) (j2 & 4294967295L)) - i7f.a(fw20.a(R.dimen._64sdp, bVar), bVar));
                        z6 = false;
                        bVar.X(false);
                    }
                    bVar.X(z6);
                }
                if (Intrinsics.g(String.valueOf(Float.intBitsToFloat((int) (j >> c))), "0.0")) {
                    j3 = j2;
                    ytwVar3.setValue(new gly(j3));
                } else {
                    j3 = j2;
                }
                boolean zA7 = (i8 == 256) | bVar.A(ibsVar2);
                Object objY19 = bVar.y();
                if (zA7 || objY19 == c0042a) {
                    objY19 = new Function1() { // from class: g8p
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r3v2, types: [hbs, k8p] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((use) obj).getClass();
                            final ytw ytwVar6 = ytwVar5;
                            final String str4 = str3;
                            ?? r3 = new cbs() { // from class: k8p
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.cbs
                                public final void F0(ibs ibsVar3, s9s.a aVar3) {
                                    com.esotericsoftware.spine.android.b bVar2;
                                    if (aVar3 != s9s.a.ON_RESUME || (bVar2 = (com.esotericsoftware.spine.android.b) ytwVar6.getValue()) == null) {
                                        return;
                                    }
                                    bVar2.a().m(0, str4, true);
                                }
                            };
                            s9s lifecycle = ibsVar2.getLifecycle();
                            lifecycle.a(r3);
                            return new z8p(lifecycle, r3);
                        }
                    };
                    bVar.r(objY19);
                }
                xvf.c(ibsVar2, (Function1) objY19, bVar);
                Context context2 = (Context) bVar.O(qyd0Var);
                Object objY20 = bVar.y();
                if (objY20 == c0042a) {
                    file4 = file;
                    file5 = file2;
                    objY20 = SpineView.a(file4, file5, context2, new com.esotericsoftware.spine.android.b(new hcb0() { // from class: h8p
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.hcb0
                        public final void b(com.esotericsoftware.spine.android.b bVar2) {
                            ytw ytwVar6 = ytwVar5;
                            ytwVar6.setValue(bVar2);
                            com.esotericsoftware.spine.android.b bVar3 = (com.esotericsoftware.spine.android.b) ytwVar6.getValue();
                            if (bVar3 != null) {
                                bVar3.a().m(0, str3, true);
                            }
                            com.esotericsoftware.spine.android.b bVar4 = (com.esotericsoftware.spine.android.b) ytwVar6.getValue();
                            if (bVar4 != null) {
                                bVar4.b().k(mx90.a.b);
                            }
                        }
                    }));
                    bVar.r(objY20);
                } else {
                    file4 = file;
                    file5 = file2;
                }
                SpineView spineView2 = (SpineView) objY20;
                boolean z13 = i8 == 256;
                Object objY21 = bVar.y();
                if (z13 || objY21 == c0042a) {
                    objY21 = new t8p(null, ytwVar5, str3);
                    bVar.r(objY21);
                }
                xvf.e(bVar, str3, (Function2) objY21);
                boolean zA8 = bVar.A(spineView2);
                Object objY22 = bVar.y();
                if (zA8 || objY22 == c0042a) {
                    objY22 = new ptj(spineView2, 1);
                    bVar.r(objY22);
                }
                Function1 function2 = (Function1) objY22;
                androidx.compose.ui.d dVarA = abk0.a(androidx.compose.foundation.layout.j.i(androidx.compose.foundation.layout.j.w(aVar2, fw20.a(R.dimen._110sdp, bVar)), fw20.a(R.dimen._80sdp, bVar)), 1.0f);
                Object objY23 = bVar.y();
                if (objY23 == c0042a) {
                    objY23 = new Function1() { // from class: m8p
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            a7l a7lVar = (a7l) obj;
                            a7lVar.getClass();
                            a7lVar.B(iswVar.j());
                            a7lVar.f(iswVar2.j());
                            return Unit.a;
                        }
                    };
                    bVar.r(objY23);
                }
                androidx.compose.ui.d dVarC2 = androidx.compose.ui.draw.a.c(androidx.compose.ui.graphics.a.a(dVarA, (Function1) objY23), new rtj(aq40Var, 1));
                int i11 = (i7 & 7168) != 2048 ? 0 : 1;
                Object objY24 = bVar.y();
                if (i11 != 0 || objY24 == c0042a) {
                    objY24 = new Function1() { // from class: n8p
                        /* JADX WARN: Code duplicated, block: B:36:0x006f  */
                        /* JADX WARN: Code duplicated, block: B:37:0x0072  */
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String str4;
                            com.esotericsoftware.spine.android.b bVar2 = (com.esotericsoftware.spine.android.b) ytwVar5.getValue();
                            if (bVar2 == null) {
                                return Unit.a;
                            }
                            if (z8) {
                                String lowerCase = e6a.a().toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                int iHashCode = lowerCase.hashCode();
                                if (iHashCode != 3152) {
                                    if (iHashCode != 3297) {
                                        if (iHashCode != 3499) {
                                            if (iHashCode != 3879) {
                                                if (iHashCode == 104431 && lowerCase.equals("int")) {
                                                    str4 = "WC_Brazil";
                                                }
                                            } else if (lowerCase.equals("za")) {
                                                str4 = "WC_SouthAfrica";
                                            }
                                            str4 = "WC_NG_TZ";
                                        } else if (lowerCase.equals("mx")) {
                                            str4 = "WC_Mexico";
                                        } else {
                                            str4 = "WC_NG_TZ";
                                        }
                                    } else if (lowerCase.equals("gh")) {
                                        str4 = "WC_Ghana";
                                    } else {
                                        str4 = "WC_NG_TZ";
                                    }
                                } else if (lowerCase.equals("br")) {
                                    str4 = "WC_Brazil";
                                } else {
                                    str4 = "WC_NG_TZ";
                                }
                            } else {
                                str4 = "default";
                            }
                            bVar2.b().c(str4);
                            bVar2.b().d();
                            return Unit.a;
                        }
                    };
                    bVar.r(objY24);
                }
                androidx.compose.ui.viewinterop.b.a(function2, dVarC2, (Function1) objY24, bVar, 0, 0);
                bVar.X(false);
            }
            xpf0Var2 = xpf0Var5;
        } else {
            str3 = str;
            file4 = file;
            file5 = file2;
            bVar = bVarI;
            bVar.G();
            xpf0Var2 = xpf0Var;
        }
        androidx.compose.runtime.e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final String str4 = str3;
            final File file6 = file4;
            final File file7 = file5;
            final long j4 = j3;
            final boolean z14 = z8;
            eVarZ.d = new Function2() { // from class: o8p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    a9p.a(file6, file7, str4, file3, z, j, z2, z3, j4, str2, z4, ytwVar, xpf0Var2, z14, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
