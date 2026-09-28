package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneConfig;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class xr20 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final PrimaryPhoneConfig primaryPhoneConfig, final Function0 function0, final Function1 function1, zr20 zr20Var, a aVar, final int i) {
        final zr20 zr20Var2;
        zr20 zr20Var3;
        int i2;
        function0.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1652158425);
        int i3 = i | (bVarI.A(primaryPhoneConfig) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | 1024;
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    zr20Var3 = (zr20) p8i0.a(jq40.a(zr20.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
                    i2 = i3 & (-7169);
                }
            } else {
                bVarI.G();
                i2 = i3 & (-7169);
                zr20Var3 = zr20Var;
            }
            bVarI.Y();
            ytw ytwVarC = wyh.c(zr20Var3.c, bVarI, 0, 7);
            ytw ytwVarC2 = wyh.c(zr20Var3.d, bVarI, 0, 7);
            gso gsoVar = (gso) ytwVarC.getValue();
            t340 t340Var = zr20Var3.f;
            uxs uxsVar = (uxs) ytwVarC2.getValue();
            boolean zA = bVarI.A(zr20Var3);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                vr20 vr20Var = new vr20(0, zr20Var3, zr20.class, "fetchWithdrawPinStatus", "fetchWithdrawPinStatus()Lkotlinx/coroutines/Job;", 8);
                bVarI.r(vr20Var);
                objY = vr20Var;
            }
            Function0 function2 = (Function0) objY;
            boolean zA2 = bVarI.A(zr20Var3);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                wr20 wr20Var = new wr20(0, zr20Var3, zr20.class, "dismissDialog", "dismissDialog()V", 0);
                bVarI.r(wr20Var);
                objY2 = wr20Var;
            }
            int i4 = (i2 << 3) & 112;
            int i5 = i2 << 15;
            b(null, primaryPhoneConfig, gsoVar, t340Var, uxsVar, function2, function0, function1, (Function0) ((chp) objY2), bVarI, i4 | (3670016 & i5) | (i5 & 29360128), 1);
            zr20Var2 = zr20Var3;
        } else {
            bVarI.G();
            zr20Var2 = zr20Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, zr20Var2, i) { // from class: qr20
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ zr20 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    xr20.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x013b  */
    /* JADX WARN: Code duplicated, block: B:110:0x013f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:114:0x014f  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0161  */
    /* JADX WARN: Code duplicated, block: B:118:0x0164  */
    /* JADX WARN: Code duplicated, block: B:120:0x0168  */
    /* JADX WARN: Code duplicated, block: B:122:0x016e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0179  */
    /* JADX WARN: Code duplicated, block: B:126:0x017c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0182  */
    /* JADX WARN: Code duplicated, block: B:130:0x018d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0190  */
    /* JADX WARN: Code duplicated, block: B:134:0x0196  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:148:0x01da  */
    /* JADX WARN: Code duplicated, block: B:149:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:154:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:163:0x0225  */
    /* JADX WARN: Code duplicated, block: B:164:0x027d  */
    /* JADX WARN: Code duplicated, block: B:167:0x02db  */
    /* JADX WARN: Code duplicated, block: B:168:0x02df  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:174:0x0305  */
    /* JADX WARN: Code duplicated, block: B:178:0x0422  */
    /* JADX WARN: Code duplicated, block: B:179:0x0426  */
    /* JADX WARN: Code duplicated, block: B:182:0x0433  */
    /* JADX WARN: Code duplicated, block: B:184:0x0441  */
    /* JADX WARN: Code duplicated, block: B:187:0x0524  */
    /* JADX WARN: Code duplicated, block: B:189:0x0567  */
    /* JADX WARN: Code duplicated, block: B:191:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:194:0x05df  */
    /* JADX WARN: Code duplicated, block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    /* JADX WARN: Code duplicated, block: B:98:0x0115  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(d dVar, final PrimaryPhoneConfig primaryPhoneConfig, gso gsoVar, a390<String> a390Var, uxs uxsVar, Function0<Unit> function0, Function0<Unit> function1, Function1<? super String, Unit> function2, Function0<Unit> function3, a aVar, final int i, final int i2) {
        Function0<Unit> function4;
        int i3;
        Function0<Unit> function5;
        int i4;
        int i5;
        int i6;
        int i7;
        Function0<Unit> function6;
        int i8;
        boolean z;
        b bVar;
        final d dVar2;
        final gso gsoVar2;
        final a390<String> a390Var2;
        final uxs uxsVar2;
        final Function1<? super String, Unit> function7;
        final Function0<Unit> function8;
        final Function0<Unit> function9;
        final Function0<Unit> function10;
        e eVarZ;
        int i9;
        d.a aVar2;
        a.C0041a.C0042a c0042a;
        a390<String> a390VarB;
        uxs uxsVar3;
        Function0<Unit> function11;
        Function0<Unit> function12;
        Function1<? super String, Unit> function13;
        Function0<Unit> function14;
        uxs uxsVar4;
        d dVar3;
        Object objY;
        Object objY2;
        Object objY3;
        Object objY4;
        zp70 zp70VarA;
        Object objY5;
        ytw ytwVar;
        boolean z2;
        Object objY6;
        b bVar2;
        zp70 zp70Var;
        int iHashCode;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        Function1<? super String, Unit> function15;
        b bVar3;
        int iHashCode2;
        d.a aVar4;
        int i10;
        boolean z3;
        int i11;
        int i12;
        b bVarI = aVar.i(1566478541);
        int i13 = i | 6;
        if ((i & 48) == 0) {
            i13 |= bVarI.A(primaryPhoneConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) != 0) {
                i12 = 128;
            } else {
                if ((i & 512) == 0 ? bVarI.M(gsoVar) : bVarI.A(gsoVar)) {
                    i12 = 256;
                } else {
                    i12 = 128;
                }
            }
            i13 |= i12;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) != 0) {
                i11 = 1024;
            } else {
                if ((i & 4096) == 0 ? bVarI.M(a390Var) : bVarI.A(a390Var)) {
                    i11 = 2048;
                } else {
                    i11 = 1024;
                }
            }
            i13 |= i11;
        }
        int i14 = i2 & 16;
        if (i14 != 0) {
            i13 |= 24576;
        } else if ((i & 24576) == 0) {
            i13 |= bVarI.d(uxsVar == null ? -1 : uxsVar.ordinal()) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i15 = i2 & 32;
        if (i15 == 0) {
            if ((196608 & i) == 0) {
                function4 = function0;
                i13 |= bVarI.A(function4) ? 131072 : 65536;
            }
            i3 = i2 & 64;
            if (i3 != 0) {
                if ((1572864 & i) == 0) {
                    function5 = function1;
                    if (bVarI.A(function5)) {
                        i4 = 1048576;
                    } else {
                        i4 = 524288;
                    }
                    i13 |= i4;
                }
                i5 = i2 & 128;
                if (i5 != 0) {
                    if ((12582912 & i) == 0) {
                        if (bVarI.A(function2)) {
                            i6 = 8388608;
                        } else {
                            i6 = 4194304;
                        }
                        i13 |= i6;
                    }
                    i7 = i2 & 256;
                    if (i7 != 0) {
                        i13 |= 100663296;
                        function6 = function3;
                    } else {
                        function6 = function3;
                        if ((i & 100663296) == 0) {
                            if (bVarI.A(function6)) {
                                i8 = 67108864;
                            } else {
                                i8 = 33554432;
                            }
                            i13 |= i8;
                        }
                    }
                    if ((i13 & 38347923) != 38347922) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (bVarI.q(i13 & 1, z)) {
                        bVarI.A0();
                        i9 = i & 1;
                        aVar2 = d.a.b;
                        c0042a = a.C0041a.a;
                        if (i9 != 0 || bVarI.h0()) {
                            if ((i2 & 4) != 0) {
                                gsoVar2 = new gso(null, null, 31);
                                i13 &= -897;
                            } else {
                                gsoVar2 = gsoVar;
                            }
                            if ((i2 & 8) != 0) {
                                a390VarB = d390.b(0, 0, null, 7);
                                i13 &= -7169;
                            } else {
                                a390VarB = a390Var;
                            }
                            if (i14 != 0) {
                                uxsVar3 = uxs.ENABLE;
                            } else {
                                uxsVar3 = uxsVar;
                            }
                            if (i15 != 0) {
                                objY4 = bVarI.y();
                                if (objY4 == c0042a) {
                                    objY4 = new rr20();
                                    bVarI.r(objY4);
                                }
                                function11 = (Function0) objY4;
                            } else {
                                function11 = function4;
                            }
                            if (i3 != 0) {
                                objY3 = bVarI.y();
                                if (objY3 == c0042a) {
                                    objY3 = new sr20();
                                    bVarI.r(objY3);
                                }
                                function12 = (Function0) objY3;
                            } else {
                                function12 = function5;
                            }
                            if (i5 != 0) {
                                objY2 = bVarI.y();
                                if (objY2 == c0042a) {
                                    objY2 = new s87(1);
                                    bVarI.r(objY2);
                                }
                                function13 = (Function1) objY2;
                            } else {
                                function13 = function2;
                            }
                            if (i7 != 0) {
                                objY = bVarI.y();
                                if (objY == c0042a) {
                                    objY = new tr20();
                                    bVarI.r(objY);
                                }
                                function14 = (Function0) objY;
                            } else {
                                function14 = function6;
                            }
                            function4 = function11;
                            uxsVar4 = uxsVar3;
                            dVar3 = aVar2;
                        } else {
                            bVarI.G();
                            if ((i2 & 4) != 0) {
                                i13 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i13 &= -7169;
                            }
                            dVar3 = dVar;
                            a390VarB = a390Var;
                            uxsVar4 = uxsVar;
                            function13 = function2;
                            function12 = function5;
                            function14 = function6;
                            i13 = i13;
                            gsoVar2 = gsoVar;
                        }
                        bVarI.Y();
                        zp70VarA = op70.a(bVarI);
                        objY5 = bVarI.y();
                        if (objY5 == c0042a) {
                            if (gsoVar2.b != CountryCodeName.NIGERIA) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            objY5 = nvc.a(z3, bVarI);
                        }
                        ytwVar = (ytw) objY5;
                        if ((i13 & 29360128) == 8388608) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objY6 = bVarI.y();
                        if (z2 || objY6 == c0042a) {
                            objY6 = new i7u(1, function13);
                            bVarI.r(objY6);
                        }
                        a390<String> a390Var3 = a390VarB;
                        abs.a(a390Var3, null, null, (Function1) objY6, bVarI, (i13 >> 9) & 14);
                        if (gsoVar2.d) {
                            bVarI.N(2143307671);
                            zp70Var = zp70VarA;
                            nzj.a(null, cb40.a(R.string.common_functions__error, new Object[0], bVarI), null, null, jk9.a, null, null, null, null, null, null, function14, null, bVarI, 24576, (i13 >> 21) & 112, 6125);
                            bVar2 = bVarI;
                            bVar2.X(false);
                        } else {
                            bVar2 = bVarI;
                            zp70Var = zp70VarA;
                            bVar2.N(2143613269);
                            bVar2.X(false);
                        }
                        d dVarJ = h.j(j.e(dVar3, 1.0f), 0.0f, 0.0f, 0.0f, 20.0f, 7);
                        kw0.k kVar = kw0.c;
                        n54.a aVar5 = ht.a.n;
                        i78 i78VarA = g78.a(kVar, aVar5, bVar2, 48);
                        iHashCode = Long.hashCode(bVar2.T);
                        ne00 ne00VarS = bVar2.S();
                        d dVarC = c.c(bVar2, dVarJ);
                        yka.k.getClass();
                        aVar3 = yka.a.b;
                        bVar2.D();
                        d dVar4 = dVar3;
                        if (bVar2.S) {
                            bVar2.F(aVar3);
                        } else {
                            bVar2.p();
                        }
                        yka.a.b bVar4 = yka.a.f;
                        hlh0.a(bVar2, i78VarA, bVar4);
                        yka.a.d dVar5 = yka.a.e;
                        hlh0.a(bVar2, ne00VarS, dVar5);
                        c1350a = yka.a.g;
                        Function0<Unit> function16 = function4;
                        if (bVar2.S) {
                            function15 = function13;
                        } else {
                            function15 = function13;
                            if (!Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                            }
                            yka.a.c cVar = yka.a.d;
                            hlh0.a(bVar2, dVarC, cVar);
                            odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
                            ty0.a(bVar2, j.i(aVar2, 20.0f));
                            bVar3 = bVar2;
                            h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
                            lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
                            d dVarC2 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
                            i78 i78VarA2 = g78.a(kVar, aVar5, bVar3, 48);
                            iHashCode2 = Long.hashCode(bVar3.T);
                            ne00 ne00VarS2 = bVar3.S();
                            d dVarC3 = c.c(bVar3, dVarC2);
                            bVar3.D();
                            if (bVar3.S) {
                                bVar3.F(aVar3);
                            } else {
                                bVar3.p();
                            }
                            hlh0.a(bVar3, i78VarA2, bVar4);
                            hlh0.a(bVar3, ne00VarS2, dVar5);
                            if (bVar3.S || !Intrinsics.g(bVar3.y(), Integer.valueOf(iHashCode2))) {
                                n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                            }
                            hlh0.a(bVar3, dVarC3, cVar);
                            nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
                            nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
                            nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
                            nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
                            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                                bVar3.N(1523778676);
                                d dVarJ2 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                                aVar4 = aVar2;
                                i10 = 0;
                                nj5.b(6, 10, 0L, null, bVar3, dVarJ2, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                                bVar3.X(false);
                            } else {
                                aVar4 = aVar2;
                                i10 = 0;
                                bVar3.N(1523983369);
                                bVar3.X(false);
                            }
                            bVar3.X(true);
                            Function0<Unit> function17 = function12;
                            l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function17, function16, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
                            bVar = bVar3;
                            bVar.X(true);
                            function9 = function17;
                            a390Var2 = a390Var3;
                            uxsVar2 = uxsVar4;
                            function10 = function14;
                            dVar2 = dVar4;
                            function8 = function16;
                            function7 = function15;
                        }
                        n30.a(iHashCode, bVar2, iHashCode, c1350a);
                        yka.a.c cVar2 = yka.a.d;
                        hlh0.a(bVar2, dVarC, cVar2);
                        odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
                        ty0.a(bVar2, j.i(aVar2, 20.0f));
                        bVar3 = bVar2;
                        h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
                        lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
                        d dVarC4 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
                        i78 i78VarA3 = g78.a(kVar, aVar5, bVar3, 48);
                        iHashCode2 = Long.hashCode(bVar3.T);
                        ne00 ne00VarS3 = bVar3.S();
                        d dVarC5 = c.c(bVar3, dVarC4);
                        bVar3.D();
                        if (bVar3.S) {
                            bVar3.F(aVar3);
                        } else {
                            bVar3.p();
                        }
                        hlh0.a(bVar3, i78VarA3, bVar4);
                        hlh0.a(bVar3, ne00VarS3, dVar5);
                        if (bVar3.S) {
                            n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                        } else {
                            n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                        }
                        hlh0.a(bVar3, dVarC5, cVar2);
                        nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
                        nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
                        nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
                        nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
                        if (((Boolean) ytwVar.getValue()).booleanValue()) {
                            bVar3.N(1523778676);
                            d dVarJ3 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                            aVar4 = aVar2;
                            i10 = 0;
                            nj5.b(6, 10, 0L, null, bVar3, dVarJ3, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                            bVar3.X(false);
                        } else {
                            aVar4 = aVar2;
                            i10 = 0;
                            bVar3.N(1523983369);
                            bVar3.X(false);
                        }
                        bVar3.X(true);
                        Function0<Unit> function18 = function12;
                        l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function18, function16, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
                        bVar = bVar3;
                        bVar.X(true);
                        function9 = function18;
                        a390Var2 = a390Var3;
                        uxsVar2 = uxsVar4;
                        function10 = function14;
                        dVar2 = dVar4;
                        function8 = function16;
                        function7 = function15;
                    } else {
                        bVar = bVarI;
                        bVar.G();
                        dVar2 = dVar;
                        gsoVar2 = gsoVar;
                        a390Var2 = a390Var;
                        uxsVar2 = uxsVar;
                        function7 = function2;
                        function8 = function4;
                        function9 = function5;
                        function10 = function6;
                    }
                    eVarZ = bVar.Z();
                    if (eVarZ != null) {
                        eVarZ.d = new Function2() { // from class: ur20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                xr20.b(dVar2, primaryPhoneConfig, gsoVar2, a390Var2, uxsVar2, function8, function9, function7, function10, (a) obj, qj40.a(i | 1), i2);
                                return Unit.a;
                            }
                        };
                    }
                }
                i13 |= 12582912;
                i7 = i2 & 256;
                if (i7 != 0) {
                    i13 |= 100663296;
                    function6 = function3;
                } else {
                    function6 = function3;
                    if ((i & 100663296) == 0) {
                        if (bVarI.A(function6)) {
                            i8 = 67108864;
                        } else {
                            i8 = 33554432;
                        }
                        i13 |= i8;
                    }
                }
                if ((i13 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i13 & 1, z)) {
                    bVarI.A0();
                    i9 = i & 1;
                    aVar2 = d.a.b;
                    c0042a = a.C0041a.a;
                    if (i9 != 0) {
                        if ((i2 & 4) != 0) {
                            gsoVar2 = new gso(null, null, 31);
                            i13 &= -897;
                        } else {
                            gsoVar2 = gsoVar;
                        }
                        if ((i2 & 8) != 0) {
                            a390VarB = d390.b(0, 0, null, 7);
                            i13 &= -7169;
                        } else {
                            a390VarB = a390Var;
                        }
                        if (i14 != 0) {
                            uxsVar3 = uxs.ENABLE;
                        } else {
                            uxsVar3 = uxsVar;
                        }
                        if (i15 != 0) {
                            objY4 = bVarI.y();
                            if (objY4 == c0042a) {
                                objY4 = new rr20();
                                bVarI.r(objY4);
                            }
                            function11 = (Function0) objY4;
                        } else {
                            function11 = function4;
                        }
                        if (i3 != 0) {
                            objY3 = bVarI.y();
                            if (objY3 == c0042a) {
                                objY3 = new sr20();
                                bVarI.r(objY3);
                            }
                            function12 = (Function0) objY3;
                        } else {
                            function12 = function5;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new s87(1);
                                bVarI.r(objY2);
                            }
                            function13 = (Function1) objY2;
                        } else {
                            function13 = function2;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new tr20();
                                bVarI.r(objY);
                            }
                            function14 = (Function0) objY;
                        } else {
                            function14 = function6;
                        }
                        function4 = function11;
                        uxsVar4 = uxsVar3;
                        dVar3 = aVar2;
                    } else {
                        if ((i2 & 4) != 0) {
                            gsoVar2 = new gso(null, null, 31);
                            i13 &= -897;
                        } else {
                            gsoVar2 = gsoVar;
                        }
                        if ((i2 & 8) != 0) {
                            a390VarB = d390.b(0, 0, null, 7);
                            i13 &= -7169;
                        } else {
                            a390VarB = a390Var;
                        }
                        if (i14 != 0) {
                            uxsVar3 = uxs.ENABLE;
                        } else {
                            uxsVar3 = uxsVar;
                        }
                        if (i15 != 0) {
                            objY4 = bVarI.y();
                            if (objY4 == c0042a) {
                                objY4 = new rr20();
                                bVarI.r(objY4);
                            }
                            function11 = (Function0) objY4;
                        } else {
                            function11 = function4;
                        }
                        if (i3 != 0) {
                            objY3 = bVarI.y();
                            if (objY3 == c0042a) {
                                objY3 = new sr20();
                                bVarI.r(objY3);
                            }
                            function12 = (Function0) objY3;
                        } else {
                            function12 = function5;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new s87(1);
                                bVarI.r(objY2);
                            }
                            function13 = (Function1) objY2;
                        } else {
                            function13 = function2;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new tr20();
                                bVarI.r(objY);
                            }
                            function14 = (Function0) objY;
                        } else {
                            function14 = function6;
                        }
                        function4 = function11;
                        uxsVar4 = uxsVar3;
                        dVar3 = aVar2;
                    }
                    bVarI.Y();
                    zp70VarA = op70.a(bVarI);
                    objY5 = bVarI.y();
                    if (objY5 == c0042a) {
                        if (gsoVar2.b != CountryCodeName.NIGERIA) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objY5 = nvc.a(z3, bVarI);
                    }
                    ytwVar = (ytw) objY5;
                    if ((i13 & 29360128) == 8388608) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objY6 = bVarI.y();
                    if (z2) {
                        objY6 = new i7u(1, function13);
                        bVarI.r(objY6);
                    } else {
                        objY6 = new i7u(1, function13);
                        bVarI.r(objY6);
                    }
                    a390<String> a390Var4 = a390VarB;
                    abs.a(a390Var4, null, null, (Function1) objY6, bVarI, (i13 >> 9) & 14);
                    if (gsoVar2.d) {
                        bVarI.N(2143307671);
                        zp70Var = zp70VarA;
                        nzj.a(null, cb40.a(R.string.common_functions__error, new Object[0], bVarI), null, null, jk9.a, null, null, null, null, null, null, function14, null, bVarI, 24576, (i13 >> 21) & 112, 6125);
                        bVar2 = bVarI;
                        bVar2.X(false);
                    } else {
                        bVar2 = bVarI;
                        zp70Var = zp70VarA;
                        bVar2.N(2143613269);
                        bVar2.X(false);
                    }
                    d dVarJ4 = h.j(j.e(dVar3, 1.0f), 0.0f, 0.0f, 0.0f, 20.0f, 7);
                    kw0.k kVar2 = kw0.c;
                    n54.a aVar6 = ht.a.n;
                    i78 i78VarA4 = g78.a(kVar2, aVar6, bVar2, 48);
                    iHashCode = Long.hashCode(bVar2.T);
                    ne00 ne00VarS4 = bVar2.S();
                    d dVarC6 = c.c(bVar2, dVarJ4);
                    yka.k.getClass();
                    aVar3 = yka.a.b;
                    bVar2.D();
                    d dVar6 = dVar3;
                    if (bVar2.S) {
                        bVar2.F(aVar3);
                    } else {
                        bVar2.p();
                    }
                    yka.a.b bVar5 = yka.a.f;
                    hlh0.a(bVar2, i78VarA4, bVar5);
                    yka.a.d dVar7 = yka.a.e;
                    hlh0.a(bVar2, ne00VarS4, dVar7);
                    c1350a = yka.a.g;
                    Function0<Unit> function19 = function4;
                    if (bVar2.S) {
                        function15 = function13;
                        if (!Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                        }
                        yka.a.c cVar3 = yka.a.d;
                        hlh0.a(bVar2, dVarC6, cVar3);
                        odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
                        ty0.a(bVar2, j.i(aVar2, 20.0f));
                        bVar3 = bVar2;
                        h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
                        lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
                        d dVarC7 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
                        i78 i78VarA5 = g78.a(kVar2, aVar6, bVar3, 48);
                        iHashCode2 = Long.hashCode(bVar3.T);
                        ne00 ne00VarS5 = bVar3.S();
                        d dVarC8 = c.c(bVar3, dVarC7);
                        bVar3.D();
                        if (bVar3.S) {
                            bVar3.F(aVar3);
                        } else {
                            bVar3.p();
                        }
                        hlh0.a(bVar3, i78VarA5, bVar5);
                        hlh0.a(bVar3, ne00VarS5, dVar7);
                        if (bVar3.S) {
                            n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                        } else {
                            n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                        }
                        hlh0.a(bVar3, dVarC8, cVar3);
                        nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
                        nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
                        nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
                        nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
                        if (((Boolean) ytwVar.getValue()).booleanValue()) {
                            bVar3.N(1523778676);
                            d dVarJ5 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                            aVar4 = aVar2;
                            i10 = 0;
                            nj5.b(6, 10, 0L, null, bVar3, dVarJ5, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                            bVar3.X(false);
                        } else {
                            aVar4 = aVar2;
                            i10 = 0;
                            bVar3.N(1523983369);
                            bVar3.X(false);
                        }
                        bVar3.X(true);
                        Function0<Unit> function110 = function12;
                        l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function110, function19, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
                        bVar = bVar3;
                        bVar.X(true);
                        function9 = function110;
                        a390Var2 = a390Var4;
                        uxsVar2 = uxsVar4;
                        function10 = function14;
                        dVar2 = dVar6;
                        function8 = function19;
                        function7 = function15;
                    } else {
                        function15 = function13;
                    }
                    n30.a(iHashCode, bVar2, iHashCode, c1350a);
                    yka.a.c cVar4 = yka.a.d;
                    hlh0.a(bVar2, dVarC6, cVar4);
                    odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
                    ty0.a(bVar2, j.i(aVar2, 20.0f));
                    bVar3 = bVar2;
                    h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
                    lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
                    d dVarC9 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
                    i78 i78VarA6 = g78.a(kVar2, aVar6, bVar3, 48);
                    iHashCode2 = Long.hashCode(bVar3.T);
                    ne00 ne00VarS6 = bVar3.S();
                    d dVarC10 = c.c(bVar3, dVarC9);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar3);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, i78VarA6, bVar5);
                    hlh0.a(bVar3, ne00VarS6, dVar7);
                    if (bVar3.S) {
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                    }
                    hlh0.a(bVar3, dVarC10, cVar4);
                    nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
                    if (((Boolean) ytwVar.getValue()).booleanValue()) {
                        bVar3.N(1523778676);
                        d dVarJ6 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        aVar4 = aVar2;
                        i10 = 0;
                        nj5.b(6, 10, 0L, null, bVar3, dVarJ6, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                        bVar3.X(false);
                    } else {
                        aVar4 = aVar2;
                        i10 = 0;
                        bVar3.N(1523983369);
                        bVar3.X(false);
                    }
                    bVar3.X(true);
                    Function0<Unit> function111 = function12;
                    l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function111, function19, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
                    bVar = bVar3;
                    bVar.X(true);
                    function9 = function111;
                    a390Var2 = a390Var4;
                    uxsVar2 = uxsVar4;
                    function10 = function14;
                    dVar2 = dVar6;
                    function8 = function19;
                    function7 = function15;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    gsoVar2 = gsoVar;
                    a390Var2 = a390Var;
                    uxsVar2 = uxsVar;
                    function7 = function2;
                    function8 = function4;
                    function9 = function5;
                    function10 = function6;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: ur20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            xr20.b(dVar2, primaryPhoneConfig, gsoVar2, a390Var2, uxsVar2, function8, function9, function7, function10, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i13 |= 1572864;
            function5 = function1;
            i5 = i2 & 128;
            if (i5 != 0) {
                if ((12582912 & i) == 0) {
                    if (bVarI.A(function2)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i13 |= i6;
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                    i13 |= 100663296;
                    function6 = function3;
                } else {
                    function6 = function3;
                    if ((i & 100663296) == 0) {
                        if (bVarI.A(function6)) {
                            i8 = 67108864;
                        } else {
                            i8 = 33554432;
                        }
                        i13 |= i8;
                    }
                }
                if ((i13 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i13 & 1, z)) {
                    bVarI.A0();
                    i9 = i & 1;
                    aVar2 = d.a.b;
                    c0042a = a.C0041a.a;
                    if (i9 != 0) {
                        if ((i2 & 4) != 0) {
                            gsoVar2 = new gso(null, null, 31);
                            i13 &= -897;
                        } else {
                            gsoVar2 = gsoVar;
                        }
                        if ((i2 & 8) != 0) {
                            a390VarB = d390.b(0, 0, null, 7);
                            i13 &= -7169;
                        } else {
                            a390VarB = a390Var;
                        }
                        if (i14 != 0) {
                            uxsVar3 = uxs.ENABLE;
                        } else {
                            uxsVar3 = uxsVar;
                        }
                        if (i15 != 0) {
                            objY4 = bVarI.y();
                            if (objY4 == c0042a) {
                                objY4 = new rr20();
                                bVarI.r(objY4);
                            }
                            function11 = (Function0) objY4;
                        } else {
                            function11 = function4;
                        }
                        if (i3 != 0) {
                            objY3 = bVarI.y();
                            if (objY3 == c0042a) {
                                objY3 = new sr20();
                                bVarI.r(objY3);
                            }
                            function12 = (Function0) objY3;
                        } else {
                            function12 = function5;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new s87(1);
                                bVarI.r(objY2);
                            }
                            function13 = (Function1) objY2;
                        } else {
                            function13 = function2;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new tr20();
                                bVarI.r(objY);
                            }
                            function14 = (Function0) objY;
                        } else {
                            function14 = function6;
                        }
                        function4 = function11;
                        uxsVar4 = uxsVar3;
                        dVar3 = aVar2;
                    } else {
                        if ((i2 & 4) != 0) {
                            gsoVar2 = new gso(null, null, 31);
                            i13 &= -897;
                        } else {
                            gsoVar2 = gsoVar;
                        }
                        if ((i2 & 8) != 0) {
                            a390VarB = d390.b(0, 0, null, 7);
                            i13 &= -7169;
                        } else {
                            a390VarB = a390Var;
                        }
                        if (i14 != 0) {
                            uxsVar3 = uxs.ENABLE;
                        } else {
                            uxsVar3 = uxsVar;
                        }
                        if (i15 != 0) {
                            objY4 = bVarI.y();
                            if (objY4 == c0042a) {
                                objY4 = new rr20();
                                bVarI.r(objY4);
                            }
                            function11 = (Function0) objY4;
                        } else {
                            function11 = function4;
                        }
                        if (i3 != 0) {
                            objY3 = bVarI.y();
                            if (objY3 == c0042a) {
                                objY3 = new sr20();
                                bVarI.r(objY3);
                            }
                            function12 = (Function0) objY3;
                        } else {
                            function12 = function5;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new s87(1);
                                bVarI.r(objY2);
                            }
                            function13 = (Function1) objY2;
                        } else {
                            function13 = function2;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new tr20();
                                bVarI.r(objY);
                            }
                            function14 = (Function0) objY;
                        } else {
                            function14 = function6;
                        }
                        function4 = function11;
                        uxsVar4 = uxsVar3;
                        dVar3 = aVar2;
                    }
                    bVarI.Y();
                    zp70VarA = op70.a(bVarI);
                    objY5 = bVarI.y();
                    if (objY5 == c0042a) {
                        if (gsoVar2.b != CountryCodeName.NIGERIA) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objY5 = nvc.a(z3, bVarI);
                    }
                    ytwVar = (ytw) objY5;
                    if ((i13 & 29360128) == 8388608) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objY6 = bVarI.y();
                    if (z2) {
                        objY6 = new i7u(1, function13);
                        bVarI.r(objY6);
                    } else {
                        objY6 = new i7u(1, function13);
                        bVarI.r(objY6);
                    }
                    a390<String> a390Var5 = a390VarB;
                    abs.a(a390Var5, null, null, (Function1) objY6, bVarI, (i13 >> 9) & 14);
                    if (gsoVar2.d) {
                        bVarI.N(2143307671);
                        zp70Var = zp70VarA;
                        nzj.a(null, cb40.a(R.string.common_functions__error, new Object[0], bVarI), null, null, jk9.a, null, null, null, null, null, null, function14, null, bVarI, 24576, (i13 >> 21) & 112, 6125);
                        bVar2 = bVarI;
                        bVar2.X(false);
                    } else {
                        bVar2 = bVarI;
                        zp70Var = zp70VarA;
                        bVar2.N(2143613269);
                        bVar2.X(false);
                    }
                    d dVarJ7 = h.j(j.e(dVar3, 1.0f), 0.0f, 0.0f, 0.0f, 20.0f, 7);
                    kw0.k kVar3 = kw0.c;
                    n54.a aVar7 = ht.a.n;
                    i78 i78VarA7 = g78.a(kVar3, aVar7, bVar2, 48);
                    iHashCode = Long.hashCode(bVar2.T);
                    ne00 ne00VarS7 = bVar2.S();
                    d dVarC11 = c.c(bVar2, dVarJ7);
                    yka.k.getClass();
                    aVar3 = yka.a.b;
                    bVar2.D();
                    d dVar8 = dVar3;
                    if (bVar2.S) {
                        bVar2.F(aVar3);
                    } else {
                        bVar2.p();
                    }
                    yka.a.b bVar6 = yka.a.f;
                    hlh0.a(bVar2, i78VarA7, bVar6);
                    yka.a.d dVar9 = yka.a.e;
                    hlh0.a(bVar2, ne00VarS7, dVar9);
                    c1350a = yka.a.g;
                    Function0<Unit> function112 = function4;
                    if (bVar2.S) {
                        function15 = function13;
                        if (!Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                        }
                        yka.a.c cVar5 = yka.a.d;
                        hlh0.a(bVar2, dVarC11, cVar5);
                        odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
                        ty0.a(bVar2, j.i(aVar2, 20.0f));
                        bVar3 = bVar2;
                        h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
                        lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
                        d dVarC12 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
                        i78 i78VarA8 = g78.a(kVar3, aVar7, bVar3, 48);
                        iHashCode2 = Long.hashCode(bVar3.T);
                        ne00 ne00VarS8 = bVar3.S();
                        d dVarC13 = c.c(bVar3, dVarC12);
                        bVar3.D();
                        if (bVar3.S) {
                            bVar3.F(aVar3);
                        } else {
                            bVar3.p();
                        }
                        hlh0.a(bVar3, i78VarA8, bVar6);
                        hlh0.a(bVar3, ne00VarS8, dVar9);
                        if (bVar3.S) {
                            n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                        } else {
                            n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                        }
                        hlh0.a(bVar3, dVarC13, cVar5);
                        nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
                        nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
                        nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
                        nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
                        if (((Boolean) ytwVar.getValue()).booleanValue()) {
                            bVar3.N(1523778676);
                            d dVarJ8 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                            aVar4 = aVar2;
                            i10 = 0;
                            nj5.b(6, 10, 0L, null, bVar3, dVarJ8, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                            bVar3.X(false);
                        } else {
                            aVar4 = aVar2;
                            i10 = 0;
                            bVar3.N(1523983369);
                            bVar3.X(false);
                        }
                        bVar3.X(true);
                        Function0<Unit> function113 = function12;
                        l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function113, function112, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
                        bVar = bVar3;
                        bVar.X(true);
                        function9 = function113;
                        a390Var2 = a390Var5;
                        uxsVar2 = uxsVar4;
                        function10 = function14;
                        dVar2 = dVar8;
                        function8 = function112;
                        function7 = function15;
                    } else {
                        function15 = function13;
                    }
                    n30.a(iHashCode, bVar2, iHashCode, c1350a);
                    yka.a.c cVar6 = yka.a.d;
                    hlh0.a(bVar2, dVarC11, cVar6);
                    odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
                    ty0.a(bVar2, j.i(aVar2, 20.0f));
                    bVar3 = bVar2;
                    h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
                    lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
                    d dVarC14 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
                    i78 i78VarA9 = g78.a(kVar3, aVar7, bVar3, 48);
                    iHashCode2 = Long.hashCode(bVar3.T);
                    ne00 ne00VarS9 = bVar3.S();
                    d dVarC15 = c.c(bVar3, dVarC14);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar3);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, i78VarA9, bVar6);
                    hlh0.a(bVar3, ne00VarS9, dVar9);
                    if (bVar3.S) {
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                    }
                    hlh0.a(bVar3, dVarC15, cVar6);
                    nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
                    if (((Boolean) ytwVar.getValue()).booleanValue()) {
                        bVar3.N(1523778676);
                        d dVarJ9 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        aVar4 = aVar2;
                        i10 = 0;
                        nj5.b(6, 10, 0L, null, bVar3, dVarJ9, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                        bVar3.X(false);
                    } else {
                        aVar4 = aVar2;
                        i10 = 0;
                        bVar3.N(1523983369);
                        bVar3.X(false);
                    }
                    bVar3.X(true);
                    Function0<Unit> function114 = function12;
                    l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function114, function112, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
                    bVar = bVar3;
                    bVar.X(true);
                    function9 = function114;
                    a390Var2 = a390Var5;
                    uxsVar2 = uxsVar4;
                    function10 = function14;
                    dVar2 = dVar8;
                    function8 = function112;
                    function7 = function15;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    gsoVar2 = gsoVar;
                    a390Var2 = a390Var;
                    uxsVar2 = uxsVar;
                    function7 = function2;
                    function8 = function4;
                    function9 = function5;
                    function10 = function6;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: ur20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            xr20.b(dVar2, primaryPhoneConfig, gsoVar2, a390Var2, uxsVar2, function8, function9, function7, function10, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i13 |= 12582912;
            i7 = i2 & 256;
            if (i7 != 0) {
                i13 |= 100663296;
                function6 = function3;
            } else {
                function6 = function3;
                if ((i & 100663296) == 0) {
                    if (bVarI.A(function6)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i13 |= i8;
                }
            }
            if ((i13 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i13 & 1, z)) {
                bVarI.A0();
                i9 = i & 1;
                aVar2 = d.a.b;
                c0042a = a.C0041a.a;
                if (i9 != 0) {
                    if ((i2 & 4) != 0) {
                        gsoVar2 = new gso(null, null, 31);
                        i13 &= -897;
                    } else {
                        gsoVar2 = gsoVar;
                    }
                    if ((i2 & 8) != 0) {
                        a390VarB = d390.b(0, 0, null, 7);
                        i13 &= -7169;
                    } else {
                        a390VarB = a390Var;
                    }
                    if (i14 != 0) {
                        uxsVar3 = uxs.ENABLE;
                    } else {
                        uxsVar3 = uxsVar;
                    }
                    if (i15 != 0) {
                        objY4 = bVarI.y();
                        if (objY4 == c0042a) {
                            objY4 = new rr20();
                            bVarI.r(objY4);
                        }
                        function11 = (Function0) objY4;
                    } else {
                        function11 = function4;
                    }
                    if (i3 != 0) {
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = new sr20();
                            bVarI.r(objY3);
                        }
                        function12 = (Function0) objY3;
                    } else {
                        function12 = function5;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new s87(1);
                            bVarI.r(objY2);
                        }
                        function13 = (Function1) objY2;
                    } else {
                        function13 = function2;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new tr20();
                            bVarI.r(objY);
                        }
                        function14 = (Function0) objY;
                    } else {
                        function14 = function6;
                    }
                    function4 = function11;
                    uxsVar4 = uxsVar3;
                    dVar3 = aVar2;
                } else {
                    if ((i2 & 4) != 0) {
                        gsoVar2 = new gso(null, null, 31);
                        i13 &= -897;
                    } else {
                        gsoVar2 = gsoVar;
                    }
                    if ((i2 & 8) != 0) {
                        a390VarB = d390.b(0, 0, null, 7);
                        i13 &= -7169;
                    } else {
                        a390VarB = a390Var;
                    }
                    if (i14 != 0) {
                        uxsVar3 = uxs.ENABLE;
                    } else {
                        uxsVar3 = uxsVar;
                    }
                    if (i15 != 0) {
                        objY4 = bVarI.y();
                        if (objY4 == c0042a) {
                            objY4 = new rr20();
                            bVarI.r(objY4);
                        }
                        function11 = (Function0) objY4;
                    } else {
                        function11 = function4;
                    }
                    if (i3 != 0) {
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = new sr20();
                            bVarI.r(objY3);
                        }
                        function12 = (Function0) objY3;
                    } else {
                        function12 = function5;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new s87(1);
                            bVarI.r(objY2);
                        }
                        function13 = (Function1) objY2;
                    } else {
                        function13 = function2;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new tr20();
                            bVarI.r(objY);
                        }
                        function14 = (Function0) objY;
                    } else {
                        function14 = function6;
                    }
                    function4 = function11;
                    uxsVar4 = uxsVar3;
                    dVar3 = aVar2;
                }
                bVarI.Y();
                zp70VarA = op70.a(bVarI);
                objY5 = bVarI.y();
                if (objY5 == c0042a) {
                    if (gsoVar2.b != CountryCodeName.NIGERIA) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objY5 = nvc.a(z3, bVarI);
                }
                ytwVar = (ytw) objY5;
                if ((i13 & 29360128) == 8388608) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objY6 = bVarI.y();
                if (z2) {
                    objY6 = new i7u(1, function13);
                    bVarI.r(objY6);
                } else {
                    objY6 = new i7u(1, function13);
                    bVarI.r(objY6);
                }
                a390<String> a390Var6 = a390VarB;
                abs.a(a390Var6, null, null, (Function1) objY6, bVarI, (i13 >> 9) & 14);
                if (gsoVar2.d) {
                    bVarI.N(2143307671);
                    zp70Var = zp70VarA;
                    nzj.a(null, cb40.a(R.string.common_functions__error, new Object[0], bVarI), null, null, jk9.a, null, null, null, null, null, null, function14, null, bVarI, 24576, (i13 >> 21) & 112, 6125);
                    bVar2 = bVarI;
                    bVar2.X(false);
                } else {
                    bVar2 = bVarI;
                    zp70Var = zp70VarA;
                    bVar2.N(2143613269);
                    bVar2.X(false);
                }
                d dVarJ10 = h.j(j.e(dVar3, 1.0f), 0.0f, 0.0f, 0.0f, 20.0f, 7);
                kw0.k kVar4 = kw0.c;
                n54.a aVar8 = ht.a.n;
                i78 i78VarA10 = g78.a(kVar4, aVar8, bVar2, 48);
                iHashCode = Long.hashCode(bVar2.T);
                ne00 ne00VarS10 = bVar2.S();
                d dVarC16 = c.c(bVar2, dVarJ10);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVar2.D();
                d dVar10 = dVar3;
                if (bVar2.S) {
                    bVar2.F(aVar3);
                } else {
                    bVar2.p();
                }
                yka.a.b bVar7 = yka.a.f;
                hlh0.a(bVar2, i78VarA10, bVar7);
                yka.a.d dVar11 = yka.a.e;
                hlh0.a(bVar2, ne00VarS10, dVar11);
                c1350a = yka.a.g;
                Function0<Unit> function115 = function4;
                if (bVar2.S) {
                    function15 = function13;
                    if (!Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                    }
                    yka.a.c cVar7 = yka.a.d;
                    hlh0.a(bVar2, dVarC16, cVar7);
                    odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
                    ty0.a(bVar2, j.i(aVar2, 20.0f));
                    bVar3 = bVar2;
                    h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
                    lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
                    d dVarC17 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
                    i78 i78VarA11 = g78.a(kVar4, aVar8, bVar3, 48);
                    iHashCode2 = Long.hashCode(bVar3.T);
                    ne00 ne00VarS11 = bVar3.S();
                    d dVarC18 = c.c(bVar3, dVarC17);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar3);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, i78VarA11, bVar7);
                    hlh0.a(bVar3, ne00VarS11, dVar11);
                    if (bVar3.S) {
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                    }
                    hlh0.a(bVar3, dVarC18, cVar7);
                    nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
                    if (((Boolean) ytwVar.getValue()).booleanValue()) {
                        bVar3.N(1523778676);
                        d dVarJ11 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        aVar4 = aVar2;
                        i10 = 0;
                        nj5.b(6, 10, 0L, null, bVar3, dVarJ11, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                        bVar3.X(false);
                    } else {
                        aVar4 = aVar2;
                        i10 = 0;
                        bVar3.N(1523983369);
                        bVar3.X(false);
                    }
                    bVar3.X(true);
                    Function0<Unit> function116 = function12;
                    l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function116, function115, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
                    bVar = bVar3;
                    bVar.X(true);
                    function9 = function116;
                    a390Var2 = a390Var6;
                    uxsVar2 = uxsVar4;
                    function10 = function14;
                    dVar2 = dVar10;
                    function8 = function115;
                    function7 = function15;
                } else {
                    function15 = function13;
                }
                n30.a(iHashCode, bVar2, iHashCode, c1350a);
                yka.a.c cVar8 = yka.a.d;
                hlh0.a(bVar2, dVarC16, cVar8);
                odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
                ty0.a(bVar2, j.i(aVar2, 20.0f));
                bVar3 = bVar2;
                h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
                lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
                d dVarC19 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
                i78 i78VarA12 = g78.a(kVar4, aVar8, bVar3, 48);
                iHashCode2 = Long.hashCode(bVar3.T);
                ne00 ne00VarS12 = bVar3.S();
                d dVarC110 = c.c(bVar3, dVarC19);
                bVar3.D();
                if (bVar3.S) {
                    bVar3.F(aVar3);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, i78VarA12, bVar7);
                hlh0.a(bVar3, ne00VarS12, dVar11);
                if (bVar3.S) {
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                }
                hlh0.a(bVar3, dVarC110, cVar8);
                nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
                nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
                nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
                nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                    bVar3.N(1523778676);
                    d dVarJ12 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    aVar4 = aVar2;
                    i10 = 0;
                    nj5.b(6, 10, 0L, null, bVar3, dVarJ12, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                    bVar3.X(false);
                } else {
                    aVar4 = aVar2;
                    i10 = 0;
                    bVar3.N(1523983369);
                    bVar3.X(false);
                }
                bVar3.X(true);
                Function0<Unit> function117 = function12;
                l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function117, function115, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
                bVar = bVar3;
                bVar.X(true);
                function9 = function117;
                a390Var2 = a390Var6;
                uxsVar2 = uxsVar4;
                function10 = function14;
                dVar2 = dVar10;
                function8 = function115;
                function7 = function15;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                gsoVar2 = gsoVar;
                a390Var2 = a390Var;
                uxsVar2 = uxsVar;
                function7 = function2;
                function8 = function4;
                function9 = function5;
                function10 = function6;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ur20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xr20.b(dVar2, primaryPhoneConfig, gsoVar2, a390Var2, uxsVar2, function8, function9, function7, function10, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i13 |= 196608;
        function4 = function0;
        i3 = i2 & 64;
        if (i3 != 0) {
            if ((1572864 & i) == 0) {
                function5 = function1;
                if (bVarI.A(function5)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i13 |= i4;
            }
            i5 = i2 & 128;
            if (i5 != 0) {
                if ((12582912 & i) == 0) {
                    if (bVarI.A(function2)) {
                        i6 = 8388608;
                    } else {
                        i6 = 4194304;
                    }
                    i13 |= i6;
                }
                i7 = i2 & 256;
                if (i7 != 0) {
                    i13 |= 100663296;
                    function6 = function3;
                } else {
                    function6 = function3;
                    if ((i & 100663296) == 0) {
                        if (bVarI.A(function6)) {
                            i8 = 67108864;
                        } else {
                            i8 = 33554432;
                        }
                        i13 |= i8;
                    }
                }
                if ((i13 & 38347923) != 38347922) {
                    z = true;
                } else {
                    z = false;
                }
                if (bVarI.q(i13 & 1, z)) {
                    bVarI.A0();
                    i9 = i & 1;
                    aVar2 = d.a.b;
                    c0042a = a.C0041a.a;
                    if (i9 != 0) {
                        if ((i2 & 4) != 0) {
                            gsoVar2 = new gso(null, null, 31);
                            i13 &= -897;
                        } else {
                            gsoVar2 = gsoVar;
                        }
                        if ((i2 & 8) != 0) {
                            a390VarB = d390.b(0, 0, null, 7);
                            i13 &= -7169;
                        } else {
                            a390VarB = a390Var;
                        }
                        if (i14 != 0) {
                            uxsVar3 = uxs.ENABLE;
                        } else {
                            uxsVar3 = uxsVar;
                        }
                        if (i15 != 0) {
                            objY4 = bVarI.y();
                            if (objY4 == c0042a) {
                                objY4 = new rr20();
                                bVarI.r(objY4);
                            }
                            function11 = (Function0) objY4;
                        } else {
                            function11 = function4;
                        }
                        if (i3 != 0) {
                            objY3 = bVarI.y();
                            if (objY3 == c0042a) {
                                objY3 = new sr20();
                                bVarI.r(objY3);
                            }
                            function12 = (Function0) objY3;
                        } else {
                            function12 = function5;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new s87(1);
                                bVarI.r(objY2);
                            }
                            function13 = (Function1) objY2;
                        } else {
                            function13 = function2;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new tr20();
                                bVarI.r(objY);
                            }
                            function14 = (Function0) objY;
                        } else {
                            function14 = function6;
                        }
                        function4 = function11;
                        uxsVar4 = uxsVar3;
                        dVar3 = aVar2;
                    } else {
                        if ((i2 & 4) != 0) {
                            gsoVar2 = new gso(null, null, 31);
                            i13 &= -897;
                        } else {
                            gsoVar2 = gsoVar;
                        }
                        if ((i2 & 8) != 0) {
                            a390VarB = d390.b(0, 0, null, 7);
                            i13 &= -7169;
                        } else {
                            a390VarB = a390Var;
                        }
                        if (i14 != 0) {
                            uxsVar3 = uxs.ENABLE;
                        } else {
                            uxsVar3 = uxsVar;
                        }
                        if (i15 != 0) {
                            objY4 = bVarI.y();
                            if (objY4 == c0042a) {
                                objY4 = new rr20();
                                bVarI.r(objY4);
                            }
                            function11 = (Function0) objY4;
                        } else {
                            function11 = function4;
                        }
                        if (i3 != 0) {
                            objY3 = bVarI.y();
                            if (objY3 == c0042a) {
                                objY3 = new sr20();
                                bVarI.r(objY3);
                            }
                            function12 = (Function0) objY3;
                        } else {
                            function12 = function5;
                        }
                        if (i5 != 0) {
                            objY2 = bVarI.y();
                            if (objY2 == c0042a) {
                                objY2 = new s87(1);
                                bVarI.r(objY2);
                            }
                            function13 = (Function1) objY2;
                        } else {
                            function13 = function2;
                        }
                        if (i7 != 0) {
                            objY = bVarI.y();
                            if (objY == c0042a) {
                                objY = new tr20();
                                bVarI.r(objY);
                            }
                            function14 = (Function0) objY;
                        } else {
                            function14 = function6;
                        }
                        function4 = function11;
                        uxsVar4 = uxsVar3;
                        dVar3 = aVar2;
                    }
                    bVarI.Y();
                    zp70VarA = op70.a(bVarI);
                    objY5 = bVarI.y();
                    if (objY5 == c0042a) {
                        if (gsoVar2.b != CountryCodeName.NIGERIA) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        objY5 = nvc.a(z3, bVarI);
                    }
                    ytwVar = (ytw) objY5;
                    if ((i13 & 29360128) == 8388608) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objY6 = bVarI.y();
                    if (z2) {
                        objY6 = new i7u(1, function13);
                        bVarI.r(objY6);
                    } else {
                        objY6 = new i7u(1, function13);
                        bVarI.r(objY6);
                    }
                    a390<String> a390Var7 = a390VarB;
                    abs.a(a390Var7, null, null, (Function1) objY6, bVarI, (i13 >> 9) & 14);
                    if (gsoVar2.d) {
                        bVarI.N(2143307671);
                        zp70Var = zp70VarA;
                        nzj.a(null, cb40.a(R.string.common_functions__error, new Object[0], bVarI), null, null, jk9.a, null, null, null, null, null, null, function14, null, bVarI, 24576, (i13 >> 21) & 112, 6125);
                        bVar2 = bVarI;
                        bVar2.X(false);
                    } else {
                        bVar2 = bVarI;
                        zp70Var = zp70VarA;
                        bVar2.N(2143613269);
                        bVar2.X(false);
                    }
                    d dVarJ13 = h.j(j.e(dVar3, 1.0f), 0.0f, 0.0f, 0.0f, 20.0f, 7);
                    kw0.k kVar5 = kw0.c;
                    n54.a aVar9 = ht.a.n;
                    i78 i78VarA13 = g78.a(kVar5, aVar9, bVar2, 48);
                    iHashCode = Long.hashCode(bVar2.T);
                    ne00 ne00VarS13 = bVar2.S();
                    d dVarC111 = c.c(bVar2, dVarJ13);
                    yka.k.getClass();
                    aVar3 = yka.a.b;
                    bVar2.D();
                    d dVar12 = dVar3;
                    if (bVar2.S) {
                        bVar2.F(aVar3);
                    } else {
                        bVar2.p();
                    }
                    yka.a.b bVar8 = yka.a.f;
                    hlh0.a(bVar2, i78VarA13, bVar8);
                    yka.a.d dVar13 = yka.a.e;
                    hlh0.a(bVar2, ne00VarS13, dVar13);
                    c1350a = yka.a.g;
                    Function0<Unit> function118 = function4;
                    if (bVar2.S) {
                        function15 = function13;
                        if (!Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                        }
                        yka.a.c cVar9 = yka.a.d;
                        hlh0.a(bVar2, dVarC111, cVar9);
                        odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
                        ty0.a(bVar2, j.i(aVar2, 20.0f));
                        bVar3 = bVar2;
                        h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
                        lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
                        d dVarC112 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
                        i78 i78VarA14 = g78.a(kVar5, aVar9, bVar3, 48);
                        iHashCode2 = Long.hashCode(bVar3.T);
                        ne00 ne00VarS14 = bVar3.S();
                        d dVarC113 = c.c(bVar3, dVarC112);
                        bVar3.D();
                        if (bVar3.S) {
                            bVar3.F(aVar3);
                        } else {
                            bVar3.p();
                        }
                        hlh0.a(bVar3, i78VarA14, bVar8);
                        hlh0.a(bVar3, ne00VarS14, dVar13);
                        if (bVar3.S) {
                            n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                        } else {
                            n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                        }
                        hlh0.a(bVar3, dVarC113, cVar9);
                        nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
                        nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
                        nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
                        nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
                        if (((Boolean) ytwVar.getValue()).booleanValue()) {
                            bVar3.N(1523778676);
                            d dVarJ14 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                            aVar4 = aVar2;
                            i10 = 0;
                            nj5.b(6, 10, 0L, null, bVar3, dVarJ14, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                            bVar3.X(false);
                        } else {
                            aVar4 = aVar2;
                            i10 = 0;
                            bVar3.N(1523983369);
                            bVar3.X(false);
                        }
                        bVar3.X(true);
                        Function0<Unit> function119 = function12;
                        l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function119, function118, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
                        bVar = bVar3;
                        bVar.X(true);
                        function9 = function119;
                        a390Var2 = a390Var7;
                        uxsVar2 = uxsVar4;
                        function10 = function14;
                        dVar2 = dVar12;
                        function8 = function118;
                        function7 = function15;
                    } else {
                        function15 = function13;
                    }
                    n30.a(iHashCode, bVar2, iHashCode, c1350a);
                    yka.a.c cVar10 = yka.a.d;
                    hlh0.a(bVar2, dVarC111, cVar10);
                    odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
                    ty0.a(bVar2, j.i(aVar2, 20.0f));
                    bVar3 = bVar2;
                    h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
                    lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
                    d dVarC114 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
                    i78 i78VarA15 = g78.a(kVar5, aVar9, bVar3, 48);
                    iHashCode2 = Long.hashCode(bVar3.T);
                    ne00 ne00VarS15 = bVar3.S();
                    d dVarC115 = c.c(bVar3, dVarC114);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar3);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, i78VarA15, bVar8);
                    hlh0.a(bVar3, ne00VarS15, dVar13);
                    if (bVar3.S) {
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                    }
                    hlh0.a(bVar3, dVarC115, cVar10);
                    nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
                    if (((Boolean) ytwVar.getValue()).booleanValue()) {
                        bVar3.N(1523778676);
                        d dVarJ15 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        aVar4 = aVar2;
                        i10 = 0;
                        nj5.b(6, 10, 0L, null, bVar3, dVarJ15, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                        bVar3.X(false);
                    } else {
                        aVar4 = aVar2;
                        i10 = 0;
                        bVar3.N(1523983369);
                        bVar3.X(false);
                    }
                    bVar3.X(true);
                    Function0<Unit> function1110 = function12;
                    l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function1110, function118, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
                    bVar = bVar3;
                    bVar.X(true);
                    function9 = function1110;
                    a390Var2 = a390Var7;
                    uxsVar2 = uxsVar4;
                    function10 = function14;
                    dVar2 = dVar12;
                    function8 = function118;
                    function7 = function15;
                } else {
                    bVar = bVarI;
                    bVar.G();
                    dVar2 = dVar;
                    gsoVar2 = gsoVar;
                    a390Var2 = a390Var;
                    uxsVar2 = uxsVar;
                    function7 = function2;
                    function8 = function4;
                    function9 = function5;
                    function10 = function6;
                }
                eVarZ = bVar.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2() { // from class: ur20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            xr20.b(dVar2, primaryPhoneConfig, gsoVar2, a390Var2, uxsVar2, function8, function9, function7, function10, (a) obj, qj40.a(i | 1), i2);
                            return Unit.a;
                        }
                    };
                }
            }
            i13 |= 12582912;
            i7 = i2 & 256;
            if (i7 != 0) {
                i13 |= 100663296;
                function6 = function3;
            } else {
                function6 = function3;
                if ((i & 100663296) == 0) {
                    if (bVarI.A(function6)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i13 |= i8;
                }
            }
            if ((i13 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i13 & 1, z)) {
                bVarI.A0();
                i9 = i & 1;
                aVar2 = d.a.b;
                c0042a = a.C0041a.a;
                if (i9 != 0) {
                    if ((i2 & 4) != 0) {
                        gsoVar2 = new gso(null, null, 31);
                        i13 &= -897;
                    } else {
                        gsoVar2 = gsoVar;
                    }
                    if ((i2 & 8) != 0) {
                        a390VarB = d390.b(0, 0, null, 7);
                        i13 &= -7169;
                    } else {
                        a390VarB = a390Var;
                    }
                    if (i14 != 0) {
                        uxsVar3 = uxs.ENABLE;
                    } else {
                        uxsVar3 = uxsVar;
                    }
                    if (i15 != 0) {
                        objY4 = bVarI.y();
                        if (objY4 == c0042a) {
                            objY4 = new rr20();
                            bVarI.r(objY4);
                        }
                        function11 = (Function0) objY4;
                    } else {
                        function11 = function4;
                    }
                    if (i3 != 0) {
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = new sr20();
                            bVarI.r(objY3);
                        }
                        function12 = (Function0) objY3;
                    } else {
                        function12 = function5;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new s87(1);
                            bVarI.r(objY2);
                        }
                        function13 = (Function1) objY2;
                    } else {
                        function13 = function2;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new tr20();
                            bVarI.r(objY);
                        }
                        function14 = (Function0) objY;
                    } else {
                        function14 = function6;
                    }
                    function4 = function11;
                    uxsVar4 = uxsVar3;
                    dVar3 = aVar2;
                } else {
                    if ((i2 & 4) != 0) {
                        gsoVar2 = new gso(null, null, 31);
                        i13 &= -897;
                    } else {
                        gsoVar2 = gsoVar;
                    }
                    if ((i2 & 8) != 0) {
                        a390VarB = d390.b(0, 0, null, 7);
                        i13 &= -7169;
                    } else {
                        a390VarB = a390Var;
                    }
                    if (i14 != 0) {
                        uxsVar3 = uxs.ENABLE;
                    } else {
                        uxsVar3 = uxsVar;
                    }
                    if (i15 != 0) {
                        objY4 = bVarI.y();
                        if (objY4 == c0042a) {
                            objY4 = new rr20();
                            bVarI.r(objY4);
                        }
                        function11 = (Function0) objY4;
                    } else {
                        function11 = function4;
                    }
                    if (i3 != 0) {
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = new sr20();
                            bVarI.r(objY3);
                        }
                        function12 = (Function0) objY3;
                    } else {
                        function12 = function5;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new s87(1);
                            bVarI.r(objY2);
                        }
                        function13 = (Function1) objY2;
                    } else {
                        function13 = function2;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new tr20();
                            bVarI.r(objY);
                        }
                        function14 = (Function0) objY;
                    } else {
                        function14 = function6;
                    }
                    function4 = function11;
                    uxsVar4 = uxsVar3;
                    dVar3 = aVar2;
                }
                bVarI.Y();
                zp70VarA = op70.a(bVarI);
                objY5 = bVarI.y();
                if (objY5 == c0042a) {
                    if (gsoVar2.b != CountryCodeName.NIGERIA) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objY5 = nvc.a(z3, bVarI);
                }
                ytwVar = (ytw) objY5;
                if ((i13 & 29360128) == 8388608) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objY6 = bVarI.y();
                if (z2) {
                    objY6 = new i7u(1, function13);
                    bVarI.r(objY6);
                } else {
                    objY6 = new i7u(1, function13);
                    bVarI.r(objY6);
                }
                a390<String> a390Var8 = a390VarB;
                abs.a(a390Var8, null, null, (Function1) objY6, bVarI, (i13 >> 9) & 14);
                if (gsoVar2.d) {
                    bVarI.N(2143307671);
                    zp70Var = zp70VarA;
                    nzj.a(null, cb40.a(R.string.common_functions__error, new Object[0], bVarI), null, null, jk9.a, null, null, null, null, null, null, function14, null, bVarI, 24576, (i13 >> 21) & 112, 6125);
                    bVar2 = bVarI;
                    bVar2.X(false);
                } else {
                    bVar2 = bVarI;
                    zp70Var = zp70VarA;
                    bVar2.N(2143613269);
                    bVar2.X(false);
                }
                d dVarJ16 = h.j(j.e(dVar3, 1.0f), 0.0f, 0.0f, 0.0f, 20.0f, 7);
                kw0.k kVar6 = kw0.c;
                n54.a aVar10 = ht.a.n;
                i78 i78VarA16 = g78.a(kVar6, aVar10, bVar2, 48);
                iHashCode = Long.hashCode(bVar2.T);
                ne00 ne00VarS16 = bVar2.S();
                d dVarC116 = c.c(bVar2, dVarJ16);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVar2.D();
                d dVar14 = dVar3;
                if (bVar2.S) {
                    bVar2.F(aVar3);
                } else {
                    bVar2.p();
                }
                yka.a.b bVar9 = yka.a.f;
                hlh0.a(bVar2, i78VarA16, bVar9);
                yka.a.d dVar15 = yka.a.e;
                hlh0.a(bVar2, ne00VarS16, dVar15);
                c1350a = yka.a.g;
                Function0<Unit> function1111 = function4;
                if (bVar2.S) {
                    function15 = function13;
                    if (!Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                    }
                    yka.a.c cVar11 = yka.a.d;
                    hlh0.a(bVar2, dVarC116, cVar11);
                    odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
                    ty0.a(bVar2, j.i(aVar2, 20.0f));
                    bVar3 = bVar2;
                    h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
                    lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
                    d dVarC117 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
                    i78 i78VarA17 = g78.a(kVar6, aVar10, bVar3, 48);
                    iHashCode2 = Long.hashCode(bVar3.T);
                    ne00 ne00VarS17 = bVar3.S();
                    d dVarC118 = c.c(bVar3, dVarC117);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar3);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, i78VarA17, bVar9);
                    hlh0.a(bVar3, ne00VarS17, dVar15);
                    if (bVar3.S) {
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                    }
                    hlh0.a(bVar3, dVarC118, cVar11);
                    nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
                    if (((Boolean) ytwVar.getValue()).booleanValue()) {
                        bVar3.N(1523778676);
                        d dVarJ17 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        aVar4 = aVar2;
                        i10 = 0;
                        nj5.b(6, 10, 0L, null, bVar3, dVarJ17, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                        bVar3.X(false);
                    } else {
                        aVar4 = aVar2;
                        i10 = 0;
                        bVar3.N(1523983369);
                        bVar3.X(false);
                    }
                    bVar3.X(true);
                    Function0<Unit> function1112 = function12;
                    l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function1112, function1111, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
                    bVar = bVar3;
                    bVar.X(true);
                    function9 = function1112;
                    a390Var2 = a390Var8;
                    uxsVar2 = uxsVar4;
                    function10 = function14;
                    dVar2 = dVar14;
                    function8 = function1111;
                    function7 = function15;
                } else {
                    function15 = function13;
                }
                n30.a(iHashCode, bVar2, iHashCode, c1350a);
                yka.a.c cVar12 = yka.a.d;
                hlh0.a(bVar2, dVarC116, cVar12);
                odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
                ty0.a(bVar2, j.i(aVar2, 20.0f));
                bVar3 = bVar2;
                h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
                lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
                d dVarC119 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
                i78 i78VarA18 = g78.a(kVar6, aVar10, bVar3, 48);
                iHashCode2 = Long.hashCode(bVar3.T);
                ne00 ne00VarS18 = bVar3.S();
                d dVarC1110 = c.c(bVar3, dVarC119);
                bVar3.D();
                if (bVar3.S) {
                    bVar3.F(aVar3);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, i78VarA18, bVar9);
                hlh0.a(bVar3, ne00VarS18, dVar15);
                if (bVar3.S) {
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                }
                hlh0.a(bVar3, dVarC1110, cVar12);
                nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
                nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
                nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
                nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                    bVar3.N(1523778676);
                    d dVarJ18 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    aVar4 = aVar2;
                    i10 = 0;
                    nj5.b(6, 10, 0L, null, bVar3, dVarJ18, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                    bVar3.X(false);
                } else {
                    aVar4 = aVar2;
                    i10 = 0;
                    bVar3.N(1523983369);
                    bVar3.X(false);
                }
                bVar3.X(true);
                Function0<Unit> function1113 = function12;
                l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function1113, function1111, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
                bVar = bVar3;
                bVar.X(true);
                function9 = function1113;
                a390Var2 = a390Var8;
                uxsVar2 = uxsVar4;
                function10 = function14;
                dVar2 = dVar14;
                function8 = function1111;
                function7 = function15;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                gsoVar2 = gsoVar;
                a390Var2 = a390Var;
                uxsVar2 = uxsVar;
                function7 = function2;
                function8 = function4;
                function9 = function5;
                function10 = function6;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ur20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xr20.b(dVar2, primaryPhoneConfig, gsoVar2, a390Var2, uxsVar2, function8, function9, function7, function10, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i13 |= 1572864;
        function5 = function1;
        i5 = i2 & 128;
        if (i5 != 0) {
            if ((12582912 & i) == 0) {
                if (bVarI.A(function2)) {
                    i6 = 8388608;
                } else {
                    i6 = 4194304;
                }
                i13 |= i6;
            }
            i7 = i2 & 256;
            if (i7 != 0) {
                i13 |= 100663296;
                function6 = function3;
            } else {
                function6 = function3;
                if ((i & 100663296) == 0) {
                    if (bVarI.A(function6)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i13 |= i8;
                }
            }
            if ((i13 & 38347923) != 38347922) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i13 & 1, z)) {
                bVarI.A0();
                i9 = i & 1;
                aVar2 = d.a.b;
                c0042a = a.C0041a.a;
                if (i9 != 0) {
                    if ((i2 & 4) != 0) {
                        gsoVar2 = new gso(null, null, 31);
                        i13 &= -897;
                    } else {
                        gsoVar2 = gsoVar;
                    }
                    if ((i2 & 8) != 0) {
                        a390VarB = d390.b(0, 0, null, 7);
                        i13 &= -7169;
                    } else {
                        a390VarB = a390Var;
                    }
                    if (i14 != 0) {
                        uxsVar3 = uxs.ENABLE;
                    } else {
                        uxsVar3 = uxsVar;
                    }
                    if (i15 != 0) {
                        objY4 = bVarI.y();
                        if (objY4 == c0042a) {
                            objY4 = new rr20();
                            bVarI.r(objY4);
                        }
                        function11 = (Function0) objY4;
                    } else {
                        function11 = function4;
                    }
                    if (i3 != 0) {
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = new sr20();
                            bVarI.r(objY3);
                        }
                        function12 = (Function0) objY3;
                    } else {
                        function12 = function5;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new s87(1);
                            bVarI.r(objY2);
                        }
                        function13 = (Function1) objY2;
                    } else {
                        function13 = function2;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new tr20();
                            bVarI.r(objY);
                        }
                        function14 = (Function0) objY;
                    } else {
                        function14 = function6;
                    }
                    function4 = function11;
                    uxsVar4 = uxsVar3;
                    dVar3 = aVar2;
                } else {
                    if ((i2 & 4) != 0) {
                        gsoVar2 = new gso(null, null, 31);
                        i13 &= -897;
                    } else {
                        gsoVar2 = gsoVar;
                    }
                    if ((i2 & 8) != 0) {
                        a390VarB = d390.b(0, 0, null, 7);
                        i13 &= -7169;
                    } else {
                        a390VarB = a390Var;
                    }
                    if (i14 != 0) {
                        uxsVar3 = uxs.ENABLE;
                    } else {
                        uxsVar3 = uxsVar;
                    }
                    if (i15 != 0) {
                        objY4 = bVarI.y();
                        if (objY4 == c0042a) {
                            objY4 = new rr20();
                            bVarI.r(objY4);
                        }
                        function11 = (Function0) objY4;
                    } else {
                        function11 = function4;
                    }
                    if (i3 != 0) {
                        objY3 = bVarI.y();
                        if (objY3 == c0042a) {
                            objY3 = new sr20();
                            bVarI.r(objY3);
                        }
                        function12 = (Function0) objY3;
                    } else {
                        function12 = function5;
                    }
                    if (i5 != 0) {
                        objY2 = bVarI.y();
                        if (objY2 == c0042a) {
                            objY2 = new s87(1);
                            bVarI.r(objY2);
                        }
                        function13 = (Function1) objY2;
                    } else {
                        function13 = function2;
                    }
                    if (i7 != 0) {
                        objY = bVarI.y();
                        if (objY == c0042a) {
                            objY = new tr20();
                            bVarI.r(objY);
                        }
                        function14 = (Function0) objY;
                    } else {
                        function14 = function6;
                    }
                    function4 = function11;
                    uxsVar4 = uxsVar3;
                    dVar3 = aVar2;
                }
                bVarI.Y();
                zp70VarA = op70.a(bVarI);
                objY5 = bVarI.y();
                if (objY5 == c0042a) {
                    if (gsoVar2.b != CountryCodeName.NIGERIA) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objY5 = nvc.a(z3, bVarI);
                }
                ytwVar = (ytw) objY5;
                if ((i13 & 29360128) == 8388608) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objY6 = bVarI.y();
                if (z2) {
                    objY6 = new i7u(1, function13);
                    bVarI.r(objY6);
                } else {
                    objY6 = new i7u(1, function13);
                    bVarI.r(objY6);
                }
                a390<String> a390Var9 = a390VarB;
                abs.a(a390Var9, null, null, (Function1) objY6, bVarI, (i13 >> 9) & 14);
                if (gsoVar2.d) {
                    bVarI.N(2143307671);
                    zp70Var = zp70VarA;
                    nzj.a(null, cb40.a(R.string.common_functions__error, new Object[0], bVarI), null, null, jk9.a, null, null, null, null, null, null, function14, null, bVarI, 24576, (i13 >> 21) & 112, 6125);
                    bVar2 = bVarI;
                    bVar2.X(false);
                } else {
                    bVar2 = bVarI;
                    zp70Var = zp70VarA;
                    bVar2.N(2143613269);
                    bVar2.X(false);
                }
                d dVarJ19 = h.j(j.e(dVar3, 1.0f), 0.0f, 0.0f, 0.0f, 20.0f, 7);
                kw0.k kVar7 = kw0.c;
                n54.a aVar11 = ht.a.n;
                i78 i78VarA19 = g78.a(kVar7, aVar11, bVar2, 48);
                iHashCode = Long.hashCode(bVar2.T);
                ne00 ne00VarS19 = bVar2.S();
                d dVarC1111 = c.c(bVar2, dVarJ19);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVar2.D();
                d dVar16 = dVar3;
                if (bVar2.S) {
                    bVar2.F(aVar3);
                } else {
                    bVar2.p();
                }
                yka.a.b bVar10 = yka.a.f;
                hlh0.a(bVar2, i78VarA19, bVar10);
                yka.a.d dVar17 = yka.a.e;
                hlh0.a(bVar2, ne00VarS19, dVar17);
                c1350a = yka.a.g;
                Function0<Unit> function1114 = function4;
                if (bVar2.S) {
                    function15 = function13;
                    if (!Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                    }
                    yka.a.c cVar13 = yka.a.d;
                    hlh0.a(bVar2, dVarC1111, cVar13);
                    odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
                    ty0.a(bVar2, j.i(aVar2, 20.0f));
                    bVar3 = bVar2;
                    h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
                    lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
                    d dVarC1112 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
                    i78 i78VarA110 = g78.a(kVar7, aVar11, bVar3, 48);
                    iHashCode2 = Long.hashCode(bVar3.T);
                    ne00 ne00VarS110 = bVar3.S();
                    d dVarC1113 = c.c(bVar3, dVarC1112);
                    bVar3.D();
                    if (bVar3.S) {
                        bVar3.F(aVar3);
                    } else {
                        bVar3.p();
                    }
                    hlh0.a(bVar3, i78VarA110, bVar10);
                    hlh0.a(bVar3, ne00VarS110, dVar17);
                    if (bVar3.S) {
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                    } else {
                        n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                    }
                    hlh0.a(bVar3, dVarC1113, cVar13);
                    nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
                    nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
                    if (((Boolean) ytwVar.getValue()).booleanValue()) {
                        bVar3.N(1523778676);
                        d dVarJ110 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        aVar4 = aVar2;
                        i10 = 0;
                        nj5.b(6, 10, 0L, null, bVar3, dVarJ110, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                        bVar3.X(false);
                    } else {
                        aVar4 = aVar2;
                        i10 = 0;
                        bVar3.N(1523983369);
                        bVar3.X(false);
                    }
                    bVar3.X(true);
                    Function0<Unit> function1115 = function12;
                    l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function1115, function1114, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
                    bVar = bVar3;
                    bVar.X(true);
                    function9 = function1115;
                    a390Var2 = a390Var9;
                    uxsVar2 = uxsVar4;
                    function10 = function14;
                    dVar2 = dVar16;
                    function8 = function1114;
                    function7 = function15;
                } else {
                    function15 = function13;
                }
                n30.a(iHashCode, bVar2, iHashCode, c1350a);
                yka.a.c cVar14 = yka.a.d;
                hlh0.a(bVar2, dVarC1111, cVar14);
                odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
                ty0.a(bVar2, j.i(aVar2, 20.0f));
                bVar3 = bVar2;
                h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
                lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
                d dVarC1114 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
                i78 i78VarA111 = g78.a(kVar7, aVar11, bVar3, 48);
                iHashCode2 = Long.hashCode(bVar3.T);
                ne00 ne00VarS111 = bVar3.S();
                d dVarC1115 = c.c(bVar3, dVarC1114);
                bVar3.D();
                if (bVar3.S) {
                    bVar3.F(aVar3);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, i78VarA111, bVar10);
                hlh0.a(bVar3, ne00VarS111, dVar17);
                if (bVar3.S) {
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                }
                hlh0.a(bVar3, dVarC1115, cVar14);
                nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
                nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
                nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
                nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                    bVar3.N(1523778676);
                    d dVarJ111 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    aVar4 = aVar2;
                    i10 = 0;
                    nj5.b(6, 10, 0L, null, bVar3, dVarJ111, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                    bVar3.X(false);
                } else {
                    aVar4 = aVar2;
                    i10 = 0;
                    bVar3.N(1523983369);
                    bVar3.X(false);
                }
                bVar3.X(true);
                Function0<Unit> function1116 = function12;
                l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function1116, function1114, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
                bVar = bVar3;
                bVar.X(true);
                function9 = function1116;
                a390Var2 = a390Var9;
                uxsVar2 = uxsVar4;
                function10 = function14;
                dVar2 = dVar16;
                function8 = function1114;
                function7 = function15;
            } else {
                bVar = bVarI;
                bVar.G();
                dVar2 = dVar;
                gsoVar2 = gsoVar;
                a390Var2 = a390Var;
                uxsVar2 = uxsVar;
                function7 = function2;
                function8 = function4;
                function9 = function5;
                function10 = function6;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: ur20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xr20.b(dVar2, primaryPhoneConfig, gsoVar2, a390Var2, uxsVar2, function8, function9, function7, function10, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i13 |= 12582912;
        i7 = i2 & 256;
        if (i7 != 0) {
            i13 |= 100663296;
            function6 = function3;
        } else {
            function6 = function3;
            if ((i & 100663296) == 0) {
                if (bVarI.A(function6)) {
                    i8 = 67108864;
                } else {
                    i8 = 33554432;
                }
                i13 |= i8;
            }
        }
        if ((i13 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i13 & 1, z)) {
            bVarI.A0();
            i9 = i & 1;
            aVar2 = d.a.b;
            c0042a = a.C0041a.a;
            if (i9 != 0) {
                if ((i2 & 4) != 0) {
                    gsoVar2 = new gso(null, null, 31);
                    i13 &= -897;
                } else {
                    gsoVar2 = gsoVar;
                }
                if ((i2 & 8) != 0) {
                    a390VarB = d390.b(0, 0, null, 7);
                    i13 &= -7169;
                } else {
                    a390VarB = a390Var;
                }
                if (i14 != 0) {
                    uxsVar3 = uxs.ENABLE;
                } else {
                    uxsVar3 = uxsVar;
                }
                if (i15 != 0) {
                    objY4 = bVarI.y();
                    if (objY4 == c0042a) {
                        objY4 = new rr20();
                        bVarI.r(objY4);
                    }
                    function11 = (Function0) objY4;
                } else {
                    function11 = function4;
                }
                if (i3 != 0) {
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new sr20();
                        bVarI.r(objY3);
                    }
                    function12 = (Function0) objY3;
                } else {
                    function12 = function5;
                }
                if (i5 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new s87(1);
                        bVarI.r(objY2);
                    }
                    function13 = (Function1) objY2;
                } else {
                    function13 = function2;
                }
                if (i7 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new tr20();
                        bVarI.r(objY);
                    }
                    function14 = (Function0) objY;
                } else {
                    function14 = function6;
                }
                function4 = function11;
                uxsVar4 = uxsVar3;
                dVar3 = aVar2;
            } else {
                if ((i2 & 4) != 0) {
                    gsoVar2 = new gso(null, null, 31);
                    i13 &= -897;
                } else {
                    gsoVar2 = gsoVar;
                }
                if ((i2 & 8) != 0) {
                    a390VarB = d390.b(0, 0, null, 7);
                    i13 &= -7169;
                } else {
                    a390VarB = a390Var;
                }
                if (i14 != 0) {
                    uxsVar3 = uxs.ENABLE;
                } else {
                    uxsVar3 = uxsVar;
                }
                if (i15 != 0) {
                    objY4 = bVarI.y();
                    if (objY4 == c0042a) {
                        objY4 = new rr20();
                        bVarI.r(objY4);
                    }
                    function11 = (Function0) objY4;
                } else {
                    function11 = function4;
                }
                if (i3 != 0) {
                    objY3 = bVarI.y();
                    if (objY3 == c0042a) {
                        objY3 = new sr20();
                        bVarI.r(objY3);
                    }
                    function12 = (Function0) objY3;
                } else {
                    function12 = function5;
                }
                if (i5 != 0) {
                    objY2 = bVarI.y();
                    if (objY2 == c0042a) {
                        objY2 = new s87(1);
                        bVarI.r(objY2);
                    }
                    function13 = (Function1) objY2;
                } else {
                    function13 = function2;
                }
                if (i7 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new tr20();
                        bVarI.r(objY);
                    }
                    function14 = (Function0) objY;
                } else {
                    function14 = function6;
                }
                function4 = function11;
                uxsVar4 = uxsVar3;
                dVar3 = aVar2;
            }
            bVarI.Y();
            zp70VarA = op70.a(bVarI);
            objY5 = bVarI.y();
            if (objY5 == c0042a) {
                if (gsoVar2.b != CountryCodeName.NIGERIA) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objY5 = nvc.a(z3, bVarI);
            }
            ytwVar = (ytw) objY5;
            if ((i13 & 29360128) == 8388608) {
                z2 = true;
            } else {
                z2 = false;
            }
            objY6 = bVarI.y();
            if (z2) {
                objY6 = new i7u(1, function13);
                bVarI.r(objY6);
            } else {
                objY6 = new i7u(1, function13);
                bVarI.r(objY6);
            }
            a390<String> a390Var10 = a390VarB;
            abs.a(a390Var10, null, null, (Function1) objY6, bVarI, (i13 >> 9) & 14);
            if (gsoVar2.d) {
                bVarI.N(2143307671);
                zp70Var = zp70VarA;
                nzj.a(null, cb40.a(R.string.common_functions__error, new Object[0], bVarI), null, null, jk9.a, null, null, null, null, null, null, function14, null, bVarI, 24576, (i13 >> 21) & 112, 6125);
                bVar2 = bVarI;
                bVar2.X(false);
            } else {
                bVar2 = bVarI;
                zp70Var = zp70VarA;
                bVar2.N(2143613269);
                bVar2.X(false);
            }
            d dVarJ112 = h.j(j.e(dVar3, 1.0f), 0.0f, 0.0f, 0.0f, 20.0f, 7);
            kw0.k kVar8 = kw0.c;
            n54.a aVar12 = ht.a.n;
            i78 i78VarA112 = g78.a(kVar8, aVar12, bVar2, 48);
            iHashCode = Long.hashCode(bVar2.T);
            ne00 ne00VarS112 = bVar2.S();
            d dVarC1116 = c.c(bVar2, dVarJ112);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVar2.D();
            d dVar18 = dVar3;
            if (bVar2.S) {
                bVar2.F(aVar3);
            } else {
                bVar2.p();
            }
            yka.a.b bVar11 = yka.a.f;
            hlh0.a(bVar2, i78VarA112, bVar11);
            yka.a.d dVar19 = yka.a.e;
            hlh0.a(bVar2, ne00VarS112, dVar19);
            c1350a = yka.a.g;
            Function0<Unit> function1117 = function4;
            if (bVar2.S) {
                function15 = function13;
                if (!Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                }
                yka.a.c cVar15 = yka.a.d;
                hlh0.a(bVar2, dVarC1116, cVar15);
                odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
                ty0.a(bVar2, j.i(aVar2, 20.0f));
                bVar3 = bVar2;
                h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
                lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
                d dVarC1117 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
                i78 i78VarA113 = g78.a(kVar8, aVar12, bVar3, 48);
                iHashCode2 = Long.hashCode(bVar3.T);
                ne00 ne00VarS113 = bVar3.S();
                d dVarC1118 = c.c(bVar3, dVarC1117);
                bVar3.D();
                if (bVar3.S) {
                    bVar3.F(aVar3);
                } else {
                    bVar3.p();
                }
                hlh0.a(bVar3, i78VarA113, bVar11);
                hlh0.a(bVar3, ne00VarS113, dVar19);
                if (bVar3.S) {
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                } else {
                    n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
                }
                hlh0.a(bVar3, dVarC1118, cVar15);
                nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
                nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
                nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
                nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
                if (((Boolean) ytwVar.getValue()).booleanValue()) {
                    bVar3.N(1523778676);
                    d dVarJ113 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    aVar4 = aVar2;
                    i10 = 0;
                    nj5.b(6, 10, 0L, null, bVar3, dVarJ113, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                    bVar3.X(false);
                } else {
                    aVar4 = aVar2;
                    i10 = 0;
                    bVar3.N(1523983369);
                    bVar3.X(false);
                }
                bVar3.X(true);
                Function0<Unit> function1118 = function12;
                l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function1118, function1117, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
                bVar = bVar3;
                bVar.X(true);
                function9 = function1118;
                a390Var2 = a390Var10;
                uxsVar2 = uxsVar4;
                function10 = function14;
                dVar2 = dVar18;
                function8 = function1117;
                function7 = function15;
            } else {
                function15 = function13;
            }
            n30.a(iHashCode, bVar2, iHashCode, c1350a);
            yka.a.c cVar16 = yka.a.d;
            hlh0.a(bVar2, dVarC1116, cVar16);
            odd0.b((i13 >> 12) & 896, bVar2, null, cb40.a(R.string.wap_profile__phone, new Object[0], bVar2), function12);
            ty0.a(bVar2, j.i(aVar2, 20.0f));
            bVar3 = bVar2;
            h9n.a(erz.a(R.drawable.account_activation_successful, 0, bVar2), "Phone Number Change", j.r(aVar2, 120.0f), null, null, 0.0f, null, bVar3, 432, 120);
            lkf0.d(cb40.a(R.string.primary_phone__change_your_phone_number, new Object[0], bVar3), h.j(aVar2, 0.0f, 24.0f, 0.0f, 20.0f, 5), c68.a(R.color.text_type1_primary, bVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, bVar3), bVar3, 48, 0, 131064);
            d dVarC1119 = op70.c(h.j(j.e(aVar2, 1.0f), 32.0f, 0.0f, 32.0f, 24.0f, 2).n(new LayoutWeightElement(1.0f, true)), zp70Var, 14);
            i78 i78VarA114 = g78.a(kVar8, aVar12, bVar3, 48);
            iHashCode2 = Long.hashCode(bVar3.T);
            ne00 ne00VarS114 = bVar3.S();
            d dVarC11110 = c.c(bVar3, dVarC1119);
            bVar3.D();
            if (bVar3.S) {
                bVar3.F(aVar3);
            } else {
                bVar3.p();
            }
            hlh0.a(bVar3, i78VarA114, bVar11);
            hlh0.a(bVar3, ne00VarS114, dVar19);
            if (bVar3.S) {
                n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVar3, iHashCode2, c1350a);
            }
            hlh0.a(bVar3, dVarC11110, cVar16);
            nj5.b(0, 11, 0L, null, bVar3, null, cb40.a(R.string.primary_phone__instruction_1, new Object[0], bVar3));
            nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_2, new Object[0], bVar3));
            nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_3, new Object[0], bVar3));
            nj5.b(6, 10, 0L, null, bVar3, h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13), cb40.a(R.string.primary_phone__instruction_4, new Object[]{primaryPhoneConfig.getWithdrawLimitAmount(), gsoVar2.a, Integer.valueOf(primaryPhoneConfig.getWithdrawLimitDays())}, bVar3));
            if (((Boolean) ytwVar.getValue()).booleanValue()) {
                bVar3.N(1523778676);
                d dVarJ114 = h.j(aVar2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                aVar4 = aVar2;
                i10 = 0;
                nj5.b(6, 10, 0L, null, bVar3, dVarJ114, cb40.a(R.string.primary_phone__instruction_6, new Object[0], bVar3));
                bVar3.X(false);
            } else {
                aVar4 = aVar2;
                i10 = 0;
                bVar3.N(1523983369);
                bVar3.X(false);
            }
            bVar3.X(true);
            Function0<Unit> function1119 = function12;
            l9z.a(h.h(aVar4, 32.0f, 0.0f, 2), cb40.a(R.string.common_functions__cancel, new Object[i10], bVar3), cb40.a(R.string.common_functions__proceed, new Object[i10], bVar3), uxsVar4, null, null, function1119, function1117, bVar3, ((i13 >> 3) & 7168) | 6 | (3670016 & i13) | ((i13 << 6) & 29360128), 48);
            bVar = bVar3;
            bVar.X(true);
            function9 = function1119;
            a390Var2 = a390Var10;
            uxsVar2 = uxsVar4;
            function10 = function14;
            dVar2 = dVar18;
            function8 = function1117;
            function7 = function15;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
            gsoVar2 = gsoVar;
            a390Var2 = a390Var;
            uxsVar2 = uxsVar;
            function7 = function2;
            function8 = function4;
            function9 = function5;
            function10 = function6;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ur20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xr20.b(dVar2, primaryPhoneConfig, gsoVar2, a390Var2, uxsVar2, function8, function9, function7, function10, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
