package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class azj0 {

    @c0d(c = "com.sportybet.feature.loyalty.api.worldcuppass.components.WorldCupMissionBannerKt$observeWorldCupPassBanner$2$1$1$1", f = "WorldCupMissionBanner.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0<Unit> function0, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = function0;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.invoke();
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0231  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:111:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:113:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:116:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:118:0x0312  */
    /* JADX WARN: Code duplicated, block: B:120:0x0323  */
    /* JADX WARN: Code duplicated, block: B:122:0x032b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0334  */
    /* JADX WARN: Code duplicated, block: B:126:0x033d  */
    /* JADX WARN: Code duplicated, block: B:129:0x0348  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x0114  */
    /* JADX WARN: Code duplicated, block: B:70:0x0127  */
    /* JADX WARN: Code duplicated, block: B:72:0x012f  */
    /* JADX WARN: Code duplicated, block: B:74:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0140  */
    /* JADX WARN: Code duplicated, block: B:79:0x0148  */
    /* JADX WARN: Code duplicated, block: B:80:0x015b  */
    /* JADX WARN: Code duplicated, block: B:83:0x016f  */
    /* JADX WARN: Code duplicated, block: B:85:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0180  */
    /* JADX WARN: Code duplicated, block: B:90:0x0188  */
    /* JADX WARN: Code duplicated, block: B:91:0x019b  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:98:0x020c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0210  */
    public static final void a(final vyj0 vyj0Var, final Function0<Unit> function0, d dVar, final czj0 czj0Var, final bzj0 bzj0Var, crz crzVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final crz crzVarA;
        int i3;
        boolean z;
        final d dVar2;
        e eVarZ;
        int i4;
        d.a aVar2;
        int i5;
        d dVar3;
        boolean z2;
        int iOrdinal;
        String strA;
        final String strA2;
        int iHashCode;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        androidx.compose.foundation.layout.d dVar4;
        int iOrdinal2;
        int iOrdinal3;
        vyj0Var.getClass();
        function0.getClass();
        b bVarI = aVar.i(1419965888);
        int i6 = (bVarI.M(vyj0Var) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | 384;
        if ((i & 3072) == 0) {
            i6 |= bVarI.d(czj0Var == null ? -1 : czj0Var.ordinal()) ? 2048 : 1024;
        }
        int i7 = i6 | (bVarI.M(bzj0Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if ((i2 & 32) == 0) {
            crzVarA = crzVar;
            int i8 = bVarI.A(crzVarA) ? 131072 : 65536;
            i3 = i7 | i8;
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                bVarI.A0();
                i4 = i & 1;
                aVar2 = d.a.b;
                if (i4 != 0 || bVarI.h0()) {
                    if ((i2 & 32) != 0) {
                        if (vyj0Var instanceof vyj0.a) {
                            bVarI.N(-1212360917);
                            crzVarA = pib0.a(R.drawable.ic__arrow_chevron_right, 0, bVarI);
                            bVarI.X(false);
                        } else {
                            if (!vyj0Var.equals(vyj0.b.a)) {
                                throw igf0.a(bVarI, -1212364021, false);
                            }
                            bVarI.N(-1212358261);
                            crzVarA = pib0.a(R.drawable.ic__export, 0, bVarI);
                            bVarI.X(false);
                        }
                        i3 &= -458753;
                    }
                    i5 = i3;
                    dVar3 = aVar2;
                } else {
                    bVarI.G();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    i5 = i3;
                    dVar3 = dVar;
                }
                bVarI.Y();
                z2 = vyj0Var instanceof vyj0.a;
                if (z2) {
                    bVarI.N(1071717282);
                    iOrdinal3 = czj0Var.ordinal();
                    if (iOrdinal3 == 0) {
                        bVarI.N(-1212351168);
                        strA = cb40.a(R.string.world_cup_mission__wc_pass_banner_title, new Object[0], bVarI);
                        bVarI.X(false);
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            throw igf0.a(bVarI, -1212354464, false);
                        }
                        bVarI.N(-1212351168);
                        strA = cb40.a(R.string.world_cup_mission__wc_pass_banner_title, new Object[0], bVarI);
                        bVarI.X(false);
                    } else {
                        bVarI.N(-1212346941);
                        strA = cb40.a(R.string.world_cup_mission__wc_pass_bundle_tv_title, new Object[0], bVarI);
                        bVarI.X(false);
                    }
                    bVarI.X(false);
                } else {
                    if (vyj0Var.equals(vyj0.b.a)) {
                        throw igf0.a(bVarI, -1212356108, false);
                    }
                    bVarI.N(1072089933);
                    iOrdinal = czj0Var.ordinal();
                    if (iOrdinal == 0) {
                        bVarI.N(-1212334752);
                        strA = cb40.a(R.string.world_cup_mission__wc_pass_banner_title, new Object[0], bVarI);
                        bVarI.X(false);
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw igf0.a(bVarI, -1212342443, false);
                        }
                        bVarI.N(-1212334752);
                        strA = cb40.a(R.string.world_cup_mission__wc_pass_banner_title, new Object[0], bVarI);
                        bVarI.X(false);
                    } else {
                        bVarI.N(-1212330518);
                        strA = cb40.a(R.string.world_cup_mission__wc_pass_bundle_tv_title_active, new Object[0], bVarI);
                        bVarI.X(false);
                    }
                    bVarI.X(false);
                }
                if (z2) {
                    bVarI.N(1072648522);
                    iOrdinal2 = czj0Var.ordinal();
                    if (iOrdinal2 == 0) {
                        bVarI.N(-1212321126);
                        strA2 = cb40.a(R.string.world_cup_mission__wc_pass_banner_subtitle_pre_purchase, new Object[]{((vyj0.a) vyj0Var).a}, bVarI);
                        bVarI.X(false);
                    } else if (iOrdinal2 != 1) {
                        if (iOrdinal2 != 2) {
                            throw igf0.a(bVarI, -1212324424, false);
                        }
                        bVarI.N(-1212321126);
                        strA2 = cb40.a(R.string.world_cup_mission__wc_pass_banner_subtitle_pre_purchase, new Object[]{((vyj0.a) vyj0Var).a}, bVarI);
                        bVarI.X(false);
                    } else {
                        bVarI.N(-1212314111);
                        strA2 = cb40.a(R.string.world_cup_mission__wc_pass_bundle_tv_sub, new Object[0], bVarI);
                        bVarI.X(false);
                    }
                    bVarI.X(false);
                } else {
                    if (vyj0Var.equals(vyj0.b.a)) {
                        throw igf0.a(bVarI, -1212326312, false);
                    }
                    bVarI.N(-1212305176);
                    strA2 = cb40.a(R.string.world_cup_mission__wc_pass_bundle_tv_sub_active, new Object[0], bVarI);
                    bVarI.X(false);
                }
                d dVarA = ls7.a(j.i(j.g(dVar3, 1.0f), czj0Var.a), j060.c(czj0Var.b));
                aiv aivVarC = g75.c(ht.a.a, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarA);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                crz crzVarA2 = erz.a(R.drawable.bg_world_cup_mission_banner, 0, bVarI);
                dVar4 = androidx.compose.foundation.layout.d.a;
                final String str = strA;
                d dVar5 = dVar3;
                h9n.a(crzVarA2, null, dVar4.f(aVar2), null, d0b.a.a, 0.0f, null, bVarI, 24624, 104);
                ihe0.c(function0, dVar4.f(aVar2), false, null, j58.l, 0L, 0.0f, 0.0f, null, null, pp8.b(1811317841, new Function2() { // from class: yyj0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        a aVar4 = (a) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                            d.a aVar5 = d.a.b;
                            d dVarE = j.e(aVar5, 1.0f);
                            czj0 czj0Var2 = czj0Var;
                            float f = czj0Var2.d;
                            float f2 = czj0Var2.e;
                            float f3 = czj0Var2.c;
                            d dVarI = h.i(dVarE, f, f3, f2, f3);
                            d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar4, 48);
                            int iHashCode2 = Long.hashCode(aVar4.m());
                            ne00 ne00VarO = aVar4.o();
                            d dVarC2 = c.c(aVar4, dVarI);
                            yka.k.getClass();
                            tsr.a aVar6 = yka.a.b;
                            if (aVar4.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar4.D();
                            if (aVar4.g()) {
                                aVar4.F(aVar6);
                            } else {
                                aVar4.p();
                            }
                            yka.a.b bVar = yka.a.f;
                            hlh0.a(aVar4, d160VarA, bVar);
                            yka.a.d dVar6 = yka.a.e;
                            hlh0.a(aVar4, ne00VarO, dVar6);
                            yka.a.C1350a c1350a2 = yka.a.g;
                            if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                                j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(aVar4, dVarC2, cVar);
                            h2k0[] h2k0VarArr = h2k0.b;
                            mw90.a("https://s.sporty.net/cms/fifa_world_cup_pass_trophy_img_82fa1afd43.png", null, j.s(czj0Var2.i, aVar5), null, null, null, null, aVar4, 48, 2040);
                            qyd0 qyd0Var = ejb0.a;
                            ty0.a(aVar4, j.w(aVar5, ((cjb0) aVar4.O(qyd0Var)).e));
                            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                            i78 i78VarA = g78.a(new kw0.i(((cjb0) aVar4.O(qyd0Var)).c, true, new hw0()), ht.a.m, aVar4, 0);
                            int iHashCode3 = Long.hashCode(aVar4.m());
                            ne00 ne00VarO2 = aVar4.o();
                            d dVarC3 = c.c(aVar4, layoutWeightElement);
                            if (aVar4.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar4.D();
                            if (aVar4.g()) {
                                aVar4.F(aVar6);
                            } else {
                                aVar4.p();
                            }
                            hlh0.a(aVar4, i78VarA, bVar);
                            hlh0.a(aVar4, ne00VarO2, dVar6);
                            if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                                j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                            }
                            hlh0.a(aVar4, dVarC3, cVar);
                            qyd0 qyd0Var2 = kjb0.a;
                            lkf0.d(str, null, sjh.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar4.O(qyd0Var2)).j, aVar4, 0, 0, 131066);
                            imf0 imf0Var = ((ijb0) aVar4.O(qyd0Var2)).o;
                            qyd0 qyd0Var3 = oib0.a;
                            lkf0.d(strA2, null, ((lib0) aVar4.O(qyd0Var3)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, aVar4, 0, 0, 131066);
                            aVar4.s();
                            ty0.a(aVar4, j.w(aVar5, ((cjb0) aVar4.O(qyd0Var)).d));
                            h6n.b(crzVarA, null, j.r(aVar5, 16.0f), ((lib0) aVar4.O(qyd0Var3)).a0, aVar4, 432, 0);
                            aVar4.s();
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, ((i5 >> 3) & 14) | 24576, 1004);
                bVarI = bVarI;
                if (Intrinsics.g(bzj0Var, bzj0.b.a)) {
                    bVarI.N(1758901834);
                    bVarI.X(false);
                } else if (Intrinsics.g(bzj0Var, bzj0.a.a)) {
                    bVarI.N(1758904186);
                    aft.b(dVar4.f(aVar2), bVarI, 0);
                    bVarI.X(false);
                } else {
                    if (Intrinsics.g(bzj0Var, bzj0.c.a)) {
                        throw igf0.a(bVarI, 1758900047, false);
                    }
                    bVarI.N(1758908190);
                    aft.c(dVar4.f(aVar2), bVarI, 0);
                    bVarI.X(false);
                }
                if (czj0Var.f) {
                    bVarI.N(-1308313572);
                    ty0.a(bVarI, androidx.compose.foundation.a.b(j.i(j.g(dVar4.b(aVar2, ht.a.h), 1.0f), 1.0f), ((lib0) bVarI.O(oib0.a)).A, zk40.a));
                    bVarI.X(false);
                } else {
                    bVarI.N(-1308067556);
                    bVarI.X(false);
                }
                bVarI.X(true);
                dVar2 = dVar5;
            } else {
                bVarI.G();
                dVar2 = dVar;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: zyj0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        azj0.a(vyj0Var, function0, dVar2, czj0Var, bzj0Var, crzVarA, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        crzVarA = crzVar;
        i3 = i7 | i8;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            bVarI.A0();
            i4 = i & 1;
            aVar2 = d.a.b;
            if (i4 != 0) {
                if ((i2 & 32) != 0) {
                    if (vyj0Var instanceof vyj0.a) {
                        bVarI.N(-1212360917);
                        crzVarA = pib0.a(R.drawable.ic__arrow_chevron_right, 0, bVarI);
                        bVarI.X(false);
                    } else {
                        if (!vyj0Var.equals(vyj0.b.a)) {
                            throw igf0.a(bVarI, -1212364021, false);
                        }
                        bVarI.N(-1212358261);
                        crzVarA = pib0.a(R.drawable.ic__export, 0, bVarI);
                        bVarI.X(false);
                    }
                    i3 &= -458753;
                }
                i5 = i3;
                dVar3 = aVar2;
            } else {
                if ((i2 & 32) != 0) {
                    if (vyj0Var instanceof vyj0.a) {
                        bVarI.N(-1212360917);
                        crzVarA = pib0.a(R.drawable.ic__arrow_chevron_right, 0, bVarI);
                        bVarI.X(false);
                    } else {
                        if (!vyj0Var.equals(vyj0.b.a)) {
                            throw igf0.a(bVarI, -1212364021, false);
                        }
                        bVarI.N(-1212358261);
                        crzVarA = pib0.a(R.drawable.ic__export, 0, bVarI);
                        bVarI.X(false);
                    }
                    i3 &= -458753;
                }
                i5 = i3;
                dVar3 = aVar2;
            }
            bVarI.Y();
            z2 = vyj0Var instanceof vyj0.a;
            if (z2) {
                bVarI.N(1071717282);
                iOrdinal3 = czj0Var.ordinal();
                if (iOrdinal3 == 0) {
                    bVarI.N(-1212351168);
                    strA = cb40.a(R.string.world_cup_mission__wc_pass_banner_title, new Object[0], bVarI);
                    bVarI.X(false);
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        throw igf0.a(bVarI, -1212354464, false);
                    }
                    bVarI.N(-1212351168);
                    strA = cb40.a(R.string.world_cup_mission__wc_pass_banner_title, new Object[0], bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(-1212346941);
                    strA = cb40.a(R.string.world_cup_mission__wc_pass_bundle_tv_title, new Object[0], bVarI);
                    bVarI.X(false);
                }
                bVarI.X(false);
            } else {
                if (vyj0Var.equals(vyj0.b.a)) {
                    throw igf0.a(bVarI, -1212356108, false);
                }
                bVarI.N(1072089933);
                iOrdinal = czj0Var.ordinal();
                if (iOrdinal == 0) {
                    bVarI.N(-1212334752);
                    strA = cb40.a(R.string.world_cup_mission__wc_pass_banner_title, new Object[0], bVarI);
                    bVarI.X(false);
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw igf0.a(bVarI, -1212342443, false);
                    }
                    bVarI.N(-1212334752);
                    strA = cb40.a(R.string.world_cup_mission__wc_pass_banner_title, new Object[0], bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(-1212330518);
                    strA = cb40.a(R.string.world_cup_mission__wc_pass_bundle_tv_title_active, new Object[0], bVarI);
                    bVarI.X(false);
                }
                bVarI.X(false);
            }
            if (z2) {
                bVarI.N(1072648522);
                iOrdinal2 = czj0Var.ordinal();
                if (iOrdinal2 == 0) {
                    bVarI.N(-1212321126);
                    strA2 = cb40.a(R.string.world_cup_mission__wc_pass_banner_subtitle_pre_purchase, new Object[]{((vyj0.a) vyj0Var).a}, bVarI);
                    bVarI.X(false);
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw igf0.a(bVarI, -1212324424, false);
                    }
                    bVarI.N(-1212321126);
                    strA2 = cb40.a(R.string.world_cup_mission__wc_pass_banner_subtitle_pre_purchase, new Object[]{((vyj0.a) vyj0Var).a}, bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(-1212314111);
                    strA2 = cb40.a(R.string.world_cup_mission__wc_pass_bundle_tv_sub, new Object[0], bVarI);
                    bVarI.X(false);
                }
                bVarI.X(false);
            } else {
                if (vyj0Var.equals(vyj0.b.a)) {
                    throw igf0.a(bVarI, -1212326312, false);
                }
                bVarI.N(-1212305176);
                strA2 = cb40.a(R.string.world_cup_mission__wc_pass_bundle_tv_sub_active, new Object[0], bVarI);
                bVarI.X(false);
            }
            d dVarA2 = ls7.a(j.i(j.g(dVar3, 1.0f), czj0Var.a), j060.c(czj0Var.b));
            aiv aivVarC2 = g75.c(ht.a.a, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarA2);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            crz crzVarA3 = erz.a(R.drawable.bg_world_cup_mission_banner, 0, bVarI);
            dVar4 = androidx.compose.foundation.layout.d.a;
            final String str2 = strA;
            d dVar6 = dVar3;
            h9n.a(crzVarA3, null, dVar4.f(aVar2), null, d0b.a.a, 0.0f, null, bVarI, 24624, 104);
            ihe0.c(function0, dVar4.f(aVar2), false, null, j58.l, 0L, 0.0f, 0.0f, null, null, pp8.b(1811317841, new Function2() { // from class: yyj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar4 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar5 = d.a.b;
                        d dVarE = j.e(aVar5, 1.0f);
                        czj0 czj0Var2 = czj0Var;
                        float f = czj0Var2.d;
                        float f2 = czj0Var2.e;
                        float f3 = czj0Var2.c;
                        d dVarI = h.i(dVarE, f, f3, f2, f3);
                        d160 d160VarA = b160.a(kw0.a, ht.a.k, aVar4, 48);
                        int iHashCode2 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d dVarC3 = c.c(aVar4, dVarI);
                        yka.k.getClass();
                        tsr.a aVar6 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar6);
                        } else {
                            aVar4.p();
                        }
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar4, d160VarA, bVar);
                        yka.a.d dVar7 = yka.a.e;
                        hlh0.a(aVar4, ne00VarO, dVar7);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                        }
                        yka.a.c cVar = yka.a.d;
                        hlh0.a(aVar4, dVarC3, cVar);
                        h2k0[] h2k0VarArr = h2k0.b;
                        mw90.a("https://s.sporty.net/cms/fifa_world_cup_pass_trophy_img_82fa1afd43.png", null, j.s(czj0Var2.i, aVar5), null, null, null, null, aVar4, 48, 2040);
                        qyd0 qyd0Var = ejb0.a;
                        ty0.a(aVar4, j.w(aVar5, ((cjb0) aVar4.O(qyd0Var)).e));
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        i78 i78VarA = g78.a(new kw0.i(((cjb0) aVar4.O(qyd0Var)).c, true, new hw0()), ht.a.m, aVar4, 0);
                        int iHashCode3 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO2 = aVar4.o();
                        d dVarC4 = c.c(aVar4, layoutWeightElement);
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar6);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, i78VarA, bVar);
                        hlh0.a(aVar4, ne00VarO2, dVar7);
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode3))) {
                            j3c.a(iHashCode3, aVar4, iHashCode3, c1350a2);
                        }
                        hlh0.a(aVar4, dVarC4, cVar);
                        qyd0 qyd0Var2 = kjb0.a;
                        lkf0.d(str2, null, sjh.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar4.O(qyd0Var2)).j, aVar4, 0, 0, 131066);
                        imf0 imf0Var = ((ijb0) aVar4.O(qyd0Var2)).o;
                        qyd0 qyd0Var3 = oib0.a;
                        lkf0.d(strA2, null, ((lib0) aVar4.O(qyd0Var3)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, aVar4, 0, 0, 131066);
                        aVar4.s();
                        ty0.a(aVar4, j.w(aVar5, ((cjb0) aVar4.O(qyd0Var)).d));
                        h6n.b(crzVarA, null, j.r(aVar5, 16.0f), ((lib0) aVar4.O(qyd0Var3)).a0, aVar4, 432, 0);
                        aVar4.s();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i5 >> 3) & 14) | 24576, 1004);
            bVarI = bVarI;
            if (Intrinsics.g(bzj0Var, bzj0.b.a)) {
                bVarI.N(1758901834);
                bVarI.X(false);
            } else if (Intrinsics.g(bzj0Var, bzj0.a.a)) {
                bVarI.N(1758904186);
                aft.b(dVar4.f(aVar2), bVarI, 0);
                bVarI.X(false);
            } else {
                if (Intrinsics.g(bzj0Var, bzj0.c.a)) {
                    throw igf0.a(bVarI, 1758900047, false);
                }
                bVarI.N(1758908190);
                aft.c(dVar4.f(aVar2), bVarI, 0);
                bVarI.X(false);
            }
            if (czj0Var.f) {
                bVarI.N(-1308313572);
                ty0.a(bVarI, androidx.compose.foundation.a.b(j.i(j.g(dVar4.b(aVar2, ht.a.h), 1.0f), 1.0f), ((lib0) bVarI.O(oib0.a)).A, zk40.a));
                bVarI.X(false);
            } else {
                bVarI.N(-1308067556);
                bVarI.X(false);
            }
            bVarI.X(true);
            dVar2 = dVar6;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: zyj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    azj0.a(vyj0Var, function0, dVar2, czj0Var, bzj0Var, crzVarA, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(ComposeView composeView, final y1k0 y1k0Var, final czj0 czj0Var, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, final boolean z) {
        composeView.getClass();
        y1k0Var.getClass();
        czj0Var.getClass();
        composeView.setContent(new op8(-1818431432, new Function2() { // from class: wyj0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ezj0 ezj0VarA = dzj0.a((x1k0) wyh.c(y1k0Var.getState(), aVar, 0, 7).getValue(), function0, function1, z);
                    if (ezj0VarA == null) {
                        aVar.N(-468028591);
                        aVar.H();
                    } else {
                        aVar.N(-468028590);
                        Unit unit = Unit.a;
                        Function0 function3 = function2;
                        boolean zM = aVar.M(function3);
                        Object objY = aVar.y();
                        if (zM || objY == a.C0041a.a) {
                            objY = new azj0.a(function3, null);
                            aVar.r(objY);
                        }
                        xvf.e(aVar, unit, (Function2) objY);
                        final czj0 czj0Var2 = czj0Var;
                        l0u.c(null, null, null, false, pp8.b(-1490764630, new Function2() { // from class: xyj0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar2 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ezj0 ezj0Var = ezj0VarA;
                                    azj0.a(ezj0Var.a, ezj0Var.c, null, czj0Var2, ezj0Var.b, null, aVar2, 0, 36);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, aVar), aVar, 24576, 15);
                        aVar.H();
                    }
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
