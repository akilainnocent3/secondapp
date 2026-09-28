package defpackage;

import android.content.res.Configuration;
import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.common.network.campaign.CampaignTier;
import com.sportygames.common.network.campaign.CampaignTierCriteria;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.c;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class uw4 {

    @c0d(c = "com.sportygames.compose.campaign.components.vault.BonusVaultToastWrapperKt$BonusVaultToastWrapper$3$1", f = "BonusVaultToastWrapper.kt", l = {74}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ nw4 c;
        public final /* synthetic */ ytw<Boolean> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, nw4 nw4Var, ytw<Boolean> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = nw4Var;
            this.d = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            ytw<Boolean> ytwVar = this.d;
            if (i == 0) {
                uj50.b(obj);
                if (!this.b) {
                    ytwVar.setValue(Boolean.FALSE);
                } else if (!(this.c instanceof nw4.d.b)) {
                    kotlin.time.b.a aVar = kotlin.time.b.b;
                    long jI = c.i(5000L, rgf.MILLISECONDS);
                    this.a = 1;
                    if (hkd.c(jI, this) == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            ytwVar.setValue(Boolean.TRUE);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<String, String> {
        public static final b a = new b(1, uw4.class, "findCampaignCmsValue", "findCampaignCmsValue(Ljava/lang/String;)Ljava/lang/String;", 1);

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            String str2 = str;
            str2.getClass();
            return uw4.b(str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x016a  */
    /* JADX WARN: Code duplicated, block: B:107:0x016c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0175  */
    /* JADX WARN: Code duplicated, block: B:113:0x017d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0197  */
    /* JADX WARN: Code duplicated, block: B:117:0x0199  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:124:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:125:0x01be  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01df  */
    /* JADX WARN: Code duplicated, block: B:140:0x0221  */
    /* JADX WARN: Code duplicated, block: B:141:0x0225  */
    /* JADX WARN: Code duplicated, block: B:146:0x0246  */
    /* JADX WARN: Code duplicated, block: B:149:0x0268  */
    /* JADX WARN: Code duplicated, block: B:152:0x0287  */
    /* JADX WARN: Code duplicated, block: B:153:0x0291  */
    /* JADX WARN: Code duplicated, block: B:155:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:158:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    /* JADX WARN: Code duplicated, block: B:22:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00da  */
    /* JADX WARN: Code duplicated, block: B:63:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:77:0x0105  */
    /* JADX WARN: Code duplicated, block: B:79:0x0111  */
    /* JADX WARN: Code duplicated, block: B:81:0x0115  */
    /* JADX WARN: Code duplicated, block: B:83:0x011b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0126  */
    /* JADX WARN: Code duplicated, block: B:87:0x012a  */
    /* JADX WARN: Code duplicated, block: B:88:0x012c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0141  */
    /* JADX WARN: Code duplicated, block: B:93:0x0146  */
    /* JADX WARN: Code duplicated, block: B:99:0x0155  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final nw4 nw4Var, boolean z, final String str, final Campaign campaign, final Function0<String> function0, final Function0<Unit> function1, final Function0<Unit> function2, Function0<Boolean> function3, Function0<Unit> function4, boolean z2, androidx.compose.runtime.a aVar, final int i, final int i2) {
        final boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z4;
        androidx.compose.runtime.b bVar;
        final Function0<Boolean> function5;
        final Function0<Unit> function6;
        final boolean z5;
        e eVarZ;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        final Function0<Boolean> function7;
        final Function0<Unit> function8;
        boolean z6;
        final String strInvoke;
        int iHashCode;
        boolean z7;
        Object objY;
        ytw ytwVar;
        boolean z8;
        boolean z9;
        Object objY2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Object objY3;
        int iHashCode2;
        tsr.a aVar2;
        yka.a.C1350a c1350a;
        Object objY4;
        Object objY5;
        boolean z14;
        Object objY6;
        Object objY7;
        int i18;
        nw4Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1155976258);
        int i19 = (bVarI.M(nw4Var) ? 4 : 2) | i;
        int i20 = i2 & 2;
        if (i20 == 0) {
            if ((i & 48) == 0) {
                z3 = z;
                i19 |= bVarI.b(z3) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if (bVarI.M(str)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i19 |= i18;
            }
            if (bVarI.A(campaign)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            int i21 = i19 | i3;
            if (bVarI.A(function0)) {
                i4 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i4 = 8192;
            }
            int i22 = i21 | i4;
            if (bVarI.A(function1)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            int i23 = i22 | i5;
            if (bVarI.A(function2)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i7 = i23 | i6;
            i8 = i2 & 128;
            if (i8 != 0) {
                i10 = i7 | 12582912;
            } else {
                if (bVarI.A(function3)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i10 = i7 | i9;
            }
            i11 = i2 & 256;
            if (i11 != 0) {
                i13 = i10 | 100663296;
            } else {
                if (bVarI.A(function4)) {
                    i12 = 67108864;
                } else {
                    i12 = 33554432;
                }
                i13 = i10 | i12;
            }
            i14 = i13;
            i15 = i2 & 512;
            if (i15 != 0) {
                i17 = i14 | 805306368;
            } else {
                if (bVarI.b(z2)) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i17 = i14 | i16;
            }
            if ((i17 & 306783379) != 306783378) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bVarI.q(i17 & 1, z4)) {
                if (i20 != 0) {
                    z3 = true;
                }
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (i8 != 0) {
                    objY7 = bVarI.y();
                    if (objY7 == c0042a) {
                        objY7 = new f38();
                        bVarI.r(objY7);
                    }
                    function7 = (Function0) objY7;
                } else {
                    function7 = function3;
                }
                if (i11 != 0) {
                    objY6 = bVarI.y();
                    if (objY6 == c0042a) {
                        objY6 = new pw4();
                        bVarI.r(objY6);
                    }
                    function8 = (Function0) objY6;
                } else {
                    function8 = function4;
                }
                if (i15 != 0) {
                    z6 = false;
                } else {
                    z6 = z2;
                }
                strInvoke = function0.invoke();
                iHashCode = strInvoke.hashCode();
                final boolean z15 = z6;
                if (iHashCode != 69387) {
                    if (iHashCode != 1037699538) {
                        if (nw4Var.equals(nw4.c.a) && campaign != null) {
                            z7 = true;
                        }
                    } else if (nw4Var.equals(nw4.c.a)) {
                    }
                    z7 = false;
                } else if (strInvoke.equals("FBG")) {
                    z7 = nw4Var instanceof nw4.b.a;
                } else {
                    z7 = false;
                }
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = m.b(Boolean.FALSE);
                    bVarI.r(objY);
                }
                ytwVar = (ytw) objY;
                Boolean boolValueOf = Boolean.valueOf(z7);
                boolean zB = bVarI.b(z7);
                boolean z16 = z3;
                if ((i17 & 14) != 4) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                z9 = zB | z8;
                objY2 = bVarI.y();
                if (z9 || objY2 == c0042a) {
                    objY2 = new a(z7, nw4Var, ytwVar, null);
                    bVarI.r(objY2);
                }
                xvf.e(bVarI, boolValueOf, (Function2) objY2);
                if ((i17 & 29360128) == 8388608) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i17 & 234881024) == 67108864) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z17 = z10 | z11;
                if ((i17 & 458752) == 131072) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = z17 | z12;
                objY3 = bVarI.y();
                if (z13 || objY3 == c0042a) {
                    objY3 = new Function0() { // from class: qw4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            if (((Boolean) function7.invoke()).booleanValue()) {
                                function8.invoke();
                            } else {
                                function1.invoke();
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                final Function0 function9 = (Function0) objY3;
                d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.l, zk40.a);
                aiv aivVarC = g75.c(ht.a.b, false);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = androidx.compose.ui.c.c(bVarI, dVarB);
                yka.k.getClass();
                Function0<Unit> function10 = function8;
                aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
                gzg0 gzg0VarE = yi0.e(400, 0, xkf.a, 2);
                objY4 = bVarI.y();
                if (objY4 == c0042a) {
                    objY4 = new br(1);
                    bVarI.r(objY4);
                }
                t9g t9gVarB = f.p(gzg0VarE, (Function1) objY4).b(f.f(null, 3));
                objY5 = bVarI.y();
                if (objY5 == c0042a) {
                    z14 = true;
                    objY5 = new cr(1);
                    bVarI.r(objY5);
                } else {
                    z14 = true;
                }
                z3 = z16;
                hh0.e(zBooleanValue, null, t9gVarB, f.u((Function1) objY5).b(f.g(null, 3)), null, pp8.b(-1989670876, new gaj() { // from class: rw4
                    /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar3;
                        Double dValueOf;
                        Object next;
                        Integer intOrNull;
                        a aVar4;
                        List<CampaignTierCriteria> criteria;
                        h46 h46Var;
                        a aVar5 = (a) obj2;
                        ((Integer) obj3).getClass();
                        ((jh0) obj).getClass();
                        String str2 = strInvoke;
                        int iHashCode3 = str2.hashCode();
                        d dVarC2 = d.a.b;
                        boolean z18 = z15;
                        String str3 = str;
                        Function0 function11 = function9;
                        float f = 1.0f;
                        Function0 function12 = function2;
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (iHashCode3 == 69387) {
                            if (str2.equals("FBG")) {
                                aVar5.N(559974850);
                                if (z18) {
                                    dVarC2 = v8j0.c(dVarC2);
                                }
                                d dVarJ = h.j(j.i(j.g(dVarC2, str3.equals("Even Odd") ? 0.94f : 1.0f), 44.0f), 8.0f, 2.0f, 8.0f, 0.0f, 8);
                                Object objY8 = aVar5.y();
                                if (objY8 == c0042a2) {
                                    objY8 = new tw4(0);
                                    aVar5.r(objY8);
                                }
                                mbh.a(dVarJ, (Function1) objY8, function11, function12, aVar5, 48);
                            }
                            aVar5.H();
                            return Unit.a;
                        }
                        if (iHashCode3 == 1037699538 ? str2.equals("BONUS_VAULT") : iHashCode3 == 1887537372 && str2.equals("STACKER_GAME")) {
                            aVar5.N(-813260674);
                            Campaign campaign2 = campaign;
                            if (campaign2 != null) {
                                aVar5.N(558747870);
                                if (z18) {
                                    dVarC2 = v8j0.c(dVarC2);
                                }
                                Configuration configuration = (Configuration) aVar5.O(AndroidCompositionLocals_androidKt.a);
                                float f2 = configuration.screenHeightDp;
                                float f3 = configuration.screenWidthDp;
                                if (str3.equals("Even Odd")) {
                                    f = 0.94f;
                                }
                                d dVarH = h.h(j.i((0.5625f > f3 / f2 || z3) ? j.g(dVarC2, f) : j.w(dVarC2, f2 * 0.5625f), 48.0f), 8.0f, 0.0f, 2);
                                List<h46> listC = uw4.c(campaign2);
                                String currency = (listC == null || (h46Var = (h46) CollectionsKt.firstOrNull(listC)) == null) ? null : h46Var.getCurrency();
                                if (currency == null) {
                                    currency = "";
                                }
                                List<h46> listC2 = uw4.c(campaign2);
                                if (listC2 != null) {
                                    Iterator<T> it = listC2.iterator();
                                    if (it.hasNext()) {
                                        double winningAmount = ((h46) it.next()).getWinningAmount();
                                        while (it.hasNext()) {
                                            winningAmount = Math.max(winningAmount, ((h46) it.next()).getWinningAmount());
                                            aVar5 = aVar5;
                                        }
                                        aVar3 = aVar5;
                                        dValueOf = Double.valueOf(winningAmount);
                                    } else {
                                        aVar3 = aVar5;
                                        dValueOf = null;
                                    }
                                } else {
                                    aVar3 = aVar5;
                                    dValueOf = null;
                                }
                                Iterator<T> it2 = campaign2.getTiers().iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                } while (((CampaignTier) next).getTierLevel() != campaign2.getCurrentTierLevel());
                                CampaignTier campaignTier = (CampaignTier) next;
                                if (campaignTier != null && (criteria = campaignTier.getCriteria()) != null) {
                                    Iterator<T> it3 = criteria.iterator();
                                    do {
                                        if (!it3.hasNext()) {
                                            intOrNull = null;
                                            break;
                                        }
                                        String str4 = ((CampaignTierCriteria) it3.next()).getValueMap().get("totalBetCount");
                                        intOrNull = str4 != null ? StringsKt.toIntOrNull(str4) : null;
                                    } while (intOrNull == null);
                                } else {
                                    intOrNull = null;
                                    break;
                                }
                                Object objY9 = aVar3.y();
                                if (objY9 == c0042a2) {
                                    objY9 = uw4.b.a;
                                    aVar4 = aVar3;
                                    aVar4.r(objY9);
                                } else {
                                    aVar4 = aVar3;
                                }
                                tv4.a(dVarH, currency, str3, dValueOf, intOrNull, nw4Var, (Function1) ((chp) objY9), function11, function12, aVar4, 1572864);
                                aVar5 = aVar4;
                            } else {
                                aVar5.N(554397950);
                            }
                            aVar5.H();
                            aVar5.H();
                        }
                        return Unit.a;
                        aVar5.N(554397950);
                        aVar5.H();
                        return Unit.a;
                    }
                }, bVarI), bVarI, 199680, 18);
                bVar = bVarI;
                bVar.X(z14);
                function5 = function7;
                z5 = z15;
                function6 = function10;
            } else {
                bVar = bVarI;
                bVar.G();
                function5 = function3;
                function6 = function4;
                z5 = z2;
            }
            eVarZ = bVar.Z();
            if (eVarZ != null) {
                final boolean z18 = z3;
                eVarZ.d = new Function2() { // from class: sw4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        uw4.a(nw4Var, z18, str, campaign, function0, function1, function2, function5, function6, z5, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i19 |= 48;
        z3 = z;
        if ((i & 384) != 0) {
            if (bVarI.M(str)) {
                i18 = 256;
            } else {
                i18 = 128;
            }
            i19 |= i18;
        }
        if (bVarI.A(campaign)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i24 = i19 | i3;
        if (bVarI.A(function0)) {
            i4 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i4 = 8192;
        }
        int i25 = i24 | i4;
        if (bVarI.A(function1)) {
            i5 = 131072;
        } else {
            i5 = 65536;
        }
        int i26 = i25 | i5;
        if (bVarI.A(function2)) {
            i6 = 1048576;
        } else {
            i6 = 524288;
        }
        i7 = i26 | i6;
        i8 = i2 & 128;
        if (i8 != 0) {
            i10 = i7 | 12582912;
        } else {
            if (bVarI.A(function3)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i10 = i7 | i9;
        }
        i11 = i2 & 256;
        if (i11 != 0) {
            i13 = i10 | 100663296;
        } else {
            if (bVarI.A(function4)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i13 = i10 | i12;
        }
        i14 = i13;
        i15 = i2 & 512;
        if (i15 != 0) {
            i17 = i14 | 805306368;
        } else {
            if (bVarI.b(z2)) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i17 = i14 | i16;
        }
        if ((i17 & 306783379) != 306783378) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (bVarI.q(i17 & 1, z4)) {
            if (i20 != 0) {
                z3 = true;
            }
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i8 != 0) {
                objY7 = bVarI.y();
                if (objY7 == c0042a) {
                    objY7 = new f38();
                    bVarI.r(objY7);
                }
                function7 = (Function0) objY7;
            } else {
                function7 = function3;
            }
            if (i11 != 0) {
                objY6 = bVarI.y();
                if (objY6 == c0042a) {
                    objY6 = new pw4();
                    bVarI.r(objY6);
                }
                function8 = (Function0) objY6;
            } else {
                function8 = function4;
            }
            if (i15 != 0) {
                z6 = false;
            } else {
                z6 = z2;
            }
            strInvoke = function0.invoke();
            iHashCode = strInvoke.hashCode();
            final boolean z19 = z6;
            if (iHashCode != 69387) {
                if (iHashCode != 1037699538) {
                    if (nw4Var.equals(nw4.c.a)) {
                    }
                } else if (nw4Var.equals(nw4.c.a)) {
                }
                z7 = false;
            } else if (strInvoke.equals("FBG")) {
                z7 = false;
            } else {
                z7 = nw4Var instanceof nw4.b.a;
            }
            objY = bVarI.y();
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytwVar = (ytw) objY;
            Boolean boolValueOf2 = Boolean.valueOf(z7);
            boolean zB2 = bVarI.b(z7);
            boolean z110 = z3;
            if ((i17 & 14) != 4) {
                z8 = false;
            } else {
                z8 = true;
            }
            z9 = zB2 | z8;
            objY2 = bVarI.y();
            if (z9) {
                objY2 = new a(z7, nw4Var, ytwVar, null);
                bVarI.r(objY2);
            } else {
                objY2 = new a(z7, nw4Var, ytwVar, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, boolValueOf2, (Function2) objY2);
            if ((i17 & 29360128) == 8388608) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i17 & 234881024) == 67108864) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z111 = z10 | z11;
            if ((i17 & 458752) == 131072) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = z111 | z12;
            objY3 = bVarI.y();
            if (z13) {
                objY3 = new Function0() { // from class: qw4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (((Boolean) function7.invoke()).booleanValue()) {
                            function8.invoke();
                        } else {
                            function1.invoke();
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            } else {
                objY3 = new Function0() { // from class: qw4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (((Boolean) function7.invoke()).booleanValue()) {
                            function8.invoke();
                        } else {
                            function1.invoke();
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY3);
            }
            final Function0 function11 = (Function0) objY3;
            d dVarB2 = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.l, zk40.a);
            aiv aivVarC2 = g75.c(ht.a.b, false);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarB2);
            yka.k.getClass();
            Function0<Unit> function12 = function8;
            aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            boolean zBooleanValue2 = ((Boolean) ytwVar.getValue()).booleanValue();
            gzg0 gzg0VarE2 = yi0.e(400, 0, xkf.a, 2);
            objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new br(1);
                bVarI.r(objY4);
            }
            t9g t9gVarB2 = f.p(gzg0VarE2, (Function1) objY4).b(f.f(null, 3));
            objY5 = bVarI.y();
            if (objY5 == c0042a) {
                z14 = true;
                objY5 = new cr(1);
                bVarI.r(objY5);
            } else {
                z14 = true;
            }
            z3 = z110;
            hh0.e(zBooleanValue2, null, t9gVarB2, f.u((Function1) objY5).b(f.g(null, 3)), null, pp8.b(-1989670876, new gaj() { // from class: rw4
                /* JADX WARN: Code duplicated, block: B:48:0x00f9  */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar3;
                    Double dValueOf;
                    Object next;
                    Integer intOrNull;
                    a aVar4;
                    List<CampaignTierCriteria> criteria;
                    h46 h46Var;
                    a aVar5 = (a) obj2;
                    ((Integer) obj3).getClass();
                    ((jh0) obj).getClass();
                    String str2 = strInvoke;
                    int iHashCode3 = str2.hashCode();
                    d dVarC3 = d.a.b;
                    boolean z112 = z19;
                    String str3 = str;
                    Function0 function13 = function11;
                    float f = 1.0f;
                    Function0 function14 = function2;
                    a.C0041a.C0042a c0042a2 = a.C0041a.a;
                    if (iHashCode3 == 69387) {
                        if (str2.equals("FBG")) {
                            aVar5.N(559974850);
                            if (z112) {
                                dVarC3 = v8j0.c(dVarC3);
                            }
                            d dVarJ = h.j(j.i(j.g(dVarC3, str3.equals("Even Odd") ? 0.94f : 1.0f), 44.0f), 8.0f, 2.0f, 8.0f, 0.0f, 8);
                            Object objY8 = aVar5.y();
                            if (objY8 == c0042a2) {
                                objY8 = new tw4(0);
                                aVar5.r(objY8);
                            }
                            mbh.a(dVarJ, (Function1) objY8, function13, function14, aVar5, 48);
                        }
                        aVar5.H();
                        return Unit.a;
                    }
                    if (iHashCode3 == 1037699538 ? str2.equals("BONUS_VAULT") : iHashCode3 == 1887537372 && str2.equals("STACKER_GAME")) {
                        aVar5.N(-813260674);
                        Campaign campaign2 = campaign;
                        if (campaign2 != null) {
                            aVar5.N(558747870);
                            if (z112) {
                                dVarC3 = v8j0.c(dVarC3);
                            }
                            Configuration configuration = (Configuration) aVar5.O(AndroidCompositionLocals_androidKt.a);
                            float f2 = configuration.screenHeightDp;
                            float f3 = configuration.screenWidthDp;
                            if (str3.equals("Even Odd")) {
                                f = 0.94f;
                            }
                            d dVarH = h.h(j.i((0.5625f > f3 / f2 || z3) ? j.g(dVarC3, f) : j.w(dVarC3, f2 * 0.5625f), 48.0f), 8.0f, 0.0f, 2);
                            List<h46> listC = uw4.c(campaign2);
                            String currency = (listC == null || (h46Var = (h46) CollectionsKt.firstOrNull(listC)) == null) ? null : h46Var.getCurrency();
                            if (currency == null) {
                                currency = "";
                            }
                            List<h46> listC2 = uw4.c(campaign2);
                            if (listC2 != null) {
                                Iterator<T> it = listC2.iterator();
                                if (it.hasNext()) {
                                    double winningAmount = ((h46) it.next()).getWinningAmount();
                                    while (it.hasNext()) {
                                        winningAmount = Math.max(winningAmount, ((h46) it.next()).getWinningAmount());
                                        aVar5 = aVar5;
                                    }
                                    aVar3 = aVar5;
                                    dValueOf = Double.valueOf(winningAmount);
                                } else {
                                    aVar3 = aVar5;
                                    dValueOf = null;
                                }
                            } else {
                                aVar3 = aVar5;
                                dValueOf = null;
                            }
                            Iterator<T> it2 = campaign2.getTiers().iterator();
                            do {
                                if (!it2.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it2.next();
                            } while (((CampaignTier) next).getTierLevel() != campaign2.getCurrentTierLevel());
                            CampaignTier campaignTier = (CampaignTier) next;
                            if (campaignTier != null && (criteria = campaignTier.getCriteria()) != null) {
                                Iterator<T> it3 = criteria.iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        intOrNull = null;
                                        break;
                                    }
                                    String str4 = ((CampaignTierCriteria) it3.next()).getValueMap().get("totalBetCount");
                                    intOrNull = str4 != null ? StringsKt.toIntOrNull(str4) : null;
                                } while (intOrNull == null);
                            } else {
                                intOrNull = null;
                                break;
                            }
                            Object objY9 = aVar3.y();
                            if (objY9 == c0042a2) {
                                objY9 = uw4.b.a;
                                aVar4 = aVar3;
                                aVar4.r(objY9);
                            } else {
                                aVar4 = aVar3;
                            }
                            tv4.a(dVarH, currency, str3, dValueOf, intOrNull, nw4Var, (Function1) ((chp) objY9), function13, function14, aVar4, 1572864);
                            aVar5 = aVar4;
                        } else {
                            aVar5.N(554397950);
                        }
                        aVar5.H();
                        aVar5.H();
                    }
                    return Unit.a;
                    aVar5.N(554397950);
                    aVar5.H();
                    return Unit.a;
                }
            }, bVarI), bVarI, 199680, 18);
            bVar = bVarI;
            bVar.X(z14);
            function5 = function7;
            z5 = z19;
            function6 = function12;
        } else {
            bVar = bVarI;
            bVar.G();
            function5 = function3;
            function6 = function4;
            z5 = z2;
        }
        eVarZ = bVar.Z();
        if (eVarZ != null) {
            final boolean z112 = z3;
            eVarZ.d = new Function2() { // from class: sw4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uw4.a(nw4Var, z112, str, campaign, function0, function1, function2, function5, function6, z5, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final String b(String str) {
        Object next;
        uag uagVar = lv4.Q;
        q3.b bVarA = ocx.a(uagVar, uagVar);
        do {
            if (!bVarA.hasNext()) {
                next = null;
                break;
            }
            next = bVarA.next();
        } while (!Intrinsics.g(((lv4) next).a, str));
        lv4 lv4Var = (lv4) next;
        String str2 = lv4Var != null ? lv4Var.b : null;
        if (str2 == null) {
            str2 = "";
        }
        return op5.c(op5.a, str.concat(":sg_campaign"), str2);
    }

    public static final List<h46> c(Campaign campaign) {
        Object next;
        Iterator<T> it = campaign.getTiers().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((CampaignTier) next).getTierLevel() != campaign.getCurrentTierLevel());
        CampaignTier campaignTier = (CampaignTier) next;
        if (campaignTier != null) {
            return campaignTier.getAvailableGames();
        }
        return null;
    }
}
