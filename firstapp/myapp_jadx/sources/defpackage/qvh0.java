package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.sportygames.common.network.campaign.Campaign;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class qvh0 {

    @c0d(c = "com.sportygames.compose.campaign.components.vault.VaultCampaignButtonGameComponentKt$VaultCampaignButtonGameComponent$1$1$1", f = "VaultCampaignButtonGameComponent.kt", l = {51}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ float c;
        public final /* synthetic */ ytw<String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, float f, ytw<String> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = str;
            this.c = f;
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
            String str = this.b;
            if (i == 0) {
                uj50.b(obj);
                if (Intrinsics.g(str, "READY_TO_CLAIM") && this.c == 100.0f) {
                    b.a aVar = b.b;
                    long jI = c.i(2000L, rgf.MILLISECONDS);
                    this.a = 1;
                    if (hkd.c(jI, this) == y5bVar) {
                        return y5bVar;
                    }
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            this.d.setValue(str);
            return Unit.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final boolean z, final boolean z2, final String str, final float f, final Campaign campaign, final String str2, final Function0<Unit> function0, final Function0<Boolean> function1, final Function0<Unit> function2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Function0<Unit> function3;
        Function0<Boolean> function4;
        androidx.compose.runtime.b bVar;
        str.getClass();
        str2.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-869207563);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.c(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(campaign) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            function3 = function0;
            i2 |= bVarI.A(function3) ? 1048576 : 524288;
        } else {
            function3 = function0;
        }
        if ((12582912 & i) == 0) {
            function4 = function1;
            i2 |= bVarI.A(function4) ? 8388608 : 4194304;
        } else {
            function4 = function1;
        }
        if ((100663296 & i) == 0) {
            i2 |= bVarI.A(function2) ? 67108864 : 33554432;
        }
        if (!bVarI.q(i2 & 1, (38347923 & i2) != 38347922)) {
            bVar = bVarI;
            bVar.G();
        } else if (campaign == null) {
            bVarI.N(-204272269);
            bVarI.X(false);
            bVar = bVarI;
        } else {
            bVarI.N(-204272268);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(str);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Float fValueOf = Float.valueOf(f);
            boolean z3 = ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objY2 = bVarI.y();
            if (z3 || objY2 == c0042a) {
                objY2 = new a(str, f, ytwVar, null);
                bVarI.r(objY2);
            }
            xvf.g(str, fValueOf, (Function2) objY2, bVarI);
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.f, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = androidx.compose.ui.c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarC2 = j.C(aVar2, null, 3);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC3 = androidx.compose.ui.c.c(bVarI, dVarC2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            ty0.a(bVarI, j.i(aVar2, 6.0f));
            final Function0<Unit> function5 = function3;
            final Function0<Boolean> function6 = function4;
            bVar = bVarI;
            androidx.compose.animation.a.b((String) ytwVar.getValue(), null, null, null, null, null, pp8.b(1029189904, new iaj() { // from class: ovh0
                @Override // defpackage.iaj
                public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
                    String lowerCase;
                    String str3 = (String) obj2;
                    a aVar4 = (a) obj3;
                    ((Integer) obj4).getClass();
                    ((pf0) obj).getClass();
                    str3.getClass();
                    boolean zEquals = str3.equals("READY_TO_CLAIM");
                    boolean zEquals2 = str3.equals("READY_TO_CLAIM");
                    boolean z4 = z2;
                    Function0 function7 = function5;
                    Function0 function8 = function6;
                    Function0 function9 = function2;
                    if (zEquals2 || str3.equals("ACTIVE") || str3.equals("COMPLETED") || !z4) {
                        aVar4.N(-1174768749);
                        i38.a(z4, zEquals, jn5.LOTTIE_TREASURE.a(), jn5.ICON_TREASURE.a(), function7, function8, function9, aVar4, 0, 0);
                        aVar4.H();
                    } else {
                        aVar4.N(-1174183376);
                        Campaign campaign2 = campaign;
                        int remainingTime = campaign2.getCampaign().getRemainingTime();
                        Character chG = wae0.G(campaign2.getCampaign().getTimeUnit());
                        if (chG != null) {
                            String strValueOf = String.valueOf(chG.charValue());
                            strValueOf.getClass();
                            lowerCase = strValueOf.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                        } else {
                            lowerCase = "";
                        }
                        String str4 = lowerCase;
                        u76.a(z, f, remainingTime, str4, str2, jn5.LOTTIE_TREASURE.a(), jn5.ICON_TREASURE.a(), function7, function8, function9, aVar4, 196608);
                        aVar4.H();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 1572864, 62);
            bVar.X(true);
            bVar.X(true);
            Unit unit = Unit.a;
            bVar.X(false);
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pvh0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    qvh0.a(z, z2, str, f, campaign, str2, function0, function1, function2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
