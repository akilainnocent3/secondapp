package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.i;
import androidx.compose.runtime.m;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.models.BetData;
import com.sportygames.crash.models.bet.BetContainerState;
import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.b;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class inb0 {

    @c0d(c = "com.sportygames.crash.components.bet.SportyCarsLevelUnlockStakeEffectKt$SportyCarsLevelUnlockStakeEffect$2$1", f = "SportyCarsLevelUnlockStakeEffect.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ fsw A;
        public final /* synthetic */ ytw<String> B;
        public final /* synthetic */ fsw C;
        public final /* synthetic */ ytw<Boolean> D;
        public final /* synthetic */ ytw<String> E;
        public final /* synthetic */ Function2<BetData, Boolean, Unit> F;
        public final /* synthetic */ Function0<Unit> G;
        public final /* synthetic */ BetContainerState a;
        public final /* synthetic */ double b;
        public final /* synthetic */ fsw c;
        public final /* synthetic */ double d;
        public final /* synthetic */ fsw e;
        public final /* synthetic */ ytw<Boolean> f;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ ytw<Boolean> v;
        public final /* synthetic */ Double w;
        public final /* synthetic */ fsw y;
        public final /* synthetic */ double z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(BetContainerState betContainerState, double d, fsw fswVar, double d2, fsw fswVar2, ytw<Boolean> ytwVar, boolean z, ytw<Boolean> ytwVar2, Double d3, fsw fswVar3, double d4, fsw fswVar4, ytw<String> ytwVar3, fsw fswVar5, ytw<Boolean> ytwVar4, ytw<String> ytwVar5, Function2<? super BetData, ? super Boolean, Unit> function2, Function0<Unit> function0, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = betContainerState;
            this.b = d;
            this.c = fswVar;
            this.d = d2;
            this.e = fswVar2;
            this.f = ytwVar;
            this.i = z;
            this.v = ytwVar2;
            this.w = d3;
            this.y = fswVar3;
            this.z = d4;
            this.A = fswVar4;
            this.B = ytwVar3;
            this.C = fswVar5;
            this.D = ytwVar4;
            this.E = ytwVar5;
            this.F = function2;
            this.G = function0;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:100:0x0140  */
        /* JADX WARN: Code duplicated, block: B:74:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:87:0x0116  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Double d;
            double dDoubleValue;
            double doubleValue;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            BetContainerState betContainerState = this.a;
            if (betContainerState.getBetPlaced() || betContainerState.getBetInProgress()) {
                return Unit.a;
            }
            if (betContainerState.getFbgAvailable() && egb.a(betContainerState) > 0) {
                return Unit.a;
            }
            fsw fswVar = this.c;
            double doubleValue2 = fswVar.getDoubleValue();
            double d2 = this.b;
            fsw fswVar2 = this.e;
            double d3 = this.d;
            boolean z = (d2 == doubleValue2 && d3 == fswVar2.getDoubleValue()) ? false : true;
            ytw<Boolean> ytwVar = this.f;
            boolean zBooleanValue = ytwVar.getValue().booleanValue();
            boolean z2 = this.i;
            boolean z3 = zBooleanValue && !z2;
            boolean z4 = !ytwVar.getValue().booleanValue() && z2;
            ytw<Boolean> ytwVar2 = this.v;
            boolean zBooleanValue2 = ytwVar2.getValue().booleanValue();
            Double d4 = this.w;
            boolean z5 = z || z3 || (zBooleanValue2 && d4 == null) || z4 || (!ytwVar2.getValue().booleanValue() && d4 != null);
            ytwVar.setValue(Boolean.valueOf(z2));
            ytwVar2.setValue(Boolean.valueOf(d4 != null));
            if (!z5) {
                return Unit.a;
            }
            fsw fswVar3 = this.y;
            double doubleValue3 = fswVar3.getDoubleValue();
            if (!z && doubleValue3 <= 0.0d) {
                return Unit.a;
            }
            if (d4 != null) {
                double dDoubleValue2 = d4.doubleValue();
                if (dDoubleValue2 <= 0.0d || Math.abs(dDoubleValue2) > Double.MAX_VALUE) {
                    d4 = null;
                }
                if (d4 != null) {
                    double dDoubleValue3 = d4.doubleValue();
                    d = new Double(dDoubleValue3 < d2 ? d2 : dDoubleValue3);
                } else {
                    z2 = z2;
                    d = null;
                }
            } else {
                z2 = z2;
                d = null;
            }
            boolean z6 = z2 && d != null;
            double d5 = this.z;
            if (z6) {
                dDoubleValue = d.doubleValue();
                p8i p8iVar = enb0.a;
                if (doubleValue3 < d2) {
                    dDoubleValue = d2;
                } else if (doubleValue3 <= dDoubleValue) {
                    dDoubleValue = doubleValue3;
                }
            } else {
                p8i p8iVar2 = enb0.a;
                if (doubleValue3 < d2) {
                    dDoubleValue = d5;
                } else if (doubleValue3 > d3) {
                    dDoubleValue = d3;
                } else {
                    dDoubleValue = doubleValue3;
                }
            }
            boolean z7 = z6;
            double d6 = dDoubleValue;
            if (z) {
                fsw fswVar4 = this.A;
                if (fswVar4.getDoubleValue() >= 0.0d) {
                    doubleValue = fswVar4.getDoubleValue();
                } else {
                    doubleValue = doubleValue3;
                }
            } else {
                doubleValue = doubleValue3;
            }
            boolean z8 = !z7 && doubleValue < d2 && (z || betContainerState.getAutoBetFlag());
            fswVar.t(d2);
            fswVar2.t(d3);
            fsw fswVar5 = this.C;
            ytw<String> ytwVar3 = this.B;
            String str = "0.00";
            if (!z8) {
                if (d6 == doubleValue3) {
                    return Unit.a;
                }
                fswVar3.t(d6);
                try {
                    String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d6);
                    str2.getClass();
                    str = str2;
                } catch (Exception unused) {
                }
                ytwVar3.setValue(str);
                fswVar5.t(d6);
                return Unit.a;
            }
            fswVar3.t(d5);
            try {
                String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d5);
                str3.getClass();
                str = str3;
            } catch (Exception unused2) {
            }
            ytwVar3.setValue(str);
            fswVar5.t(d5);
            if (betContainerState.getAutoBetFlag()) {
                this.F.invoke(new BetData(new Double(d5), this.D.getValue().booleanValue() ? b.h(this.E.getValue()) : null), Boolean.FALSE);
                this.G.invoke();
            }
            return Unit.a;
        }
    }

    public static final void a(final double d, final double d2, final double d3, final BetContainerState betContainerState, final boolean z, final Double d4, final fsw fswVar, final ytw<String> ytwVar, final fsw fswVar2, final ytw<Boolean> ytwVar2, final ytw<String> ytwVar3, final Function2<? super BetData, ? super Boolean, Unit> function2, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        androidx.compose.runtime.b bVar;
        Object obj;
        final fsw fswVar3;
        final fsw fswVar4;
        int i5;
        final fsw fswVar5;
        fswVar.getClass();
        ytwVar.getClass();
        fswVar2.getClass();
        ytwVar2.getClass();
        ytwVar3.getClass();
        function2.getClass();
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1097631451);
        if ((i & 6) == 0) {
            i3 = (bVarI.f(d) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.f(d2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.f(d3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.A(betContainerState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= bVarI.M(d4) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= bVarI.M(fswVar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= bVarI.M(ytwVar) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bVarI.M(fswVar2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bVarI.M(ytwVar2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (bVarI.M(ytwVar3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.A(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.A(function0) ? 256 : 128;
        }
        int i6 = i4;
        if (bVarI.q(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 147) == 146) ? false : true)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = i.a(-1.0d);
                bVarI.r(objY);
            }
            fsw fswVar6 = (fsw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = i.a(-1.0d);
                bVarI.r(objY2);
            }
            fsw fswVar7 = (fsw) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = i.a(-1.0d);
                bVarI.r(objY3);
            }
            fsw fswVar8 = (fsw) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = m.b(Boolean.FALSE);
                bVarI.r(objY4);
            }
            ytw ytwVar4 = (ytw) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = m.b(Boolean.FALSE);
                bVarI.r(objY5);
            }
            ytw ytwVar5 = (ytw) objY5;
            int i7 = i3 & 14;
            int i8 = i3 & 112;
            int i9 = i3 & 3670016;
            boolean z2 = (i7 == 4) | (i8 == 32) | (i9 == 1048576);
            Object objY6 = bVarI.y();
            if (z2 || objY6 == c0042a) {
                fswVar3 = fswVar8;
                fswVar4 = fswVar7;
                i5 = 32;
                fswVar5 = fswVar6;
                obj = new Function0() { // from class: gnb0
                    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        fsw fswVar9 = fswVar5;
                        double doubleValue = fswVar9.getDoubleValue();
                        double d5 = d;
                        fsw fswVar10 = fswVar4;
                        if (d5 < doubleValue && fswVar9.getDoubleValue() >= 0.0d) {
                            fswVar9.t(-1.0d);
                            fswVar10.t(-1.0d);
                        }
                        if (d5 == fswVar9.getDoubleValue()) {
                            if (d2 != fswVar10.getDoubleValue()) {
                                fswVar3.t(fswVar.getDoubleValue());
                            }
                        } else {
                            fswVar3.t(fswVar.getDoubleValue());
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(obj);
            } else {
                obj = objY6;
                fswVar3 = fswVar8;
                fswVar5 = fswVar6;
                fswVar4 = fswVar7;
                i5 = 32;
            }
            use useVar = xvf.a;
            bVarI.t((Function0) obj);
            Object[] objArr = {Double.valueOf(d), Double.valueOf(d2), Boolean.valueOf(betContainerState.getBetPlaced()), Boolean.valueOf(betContainerState.getBetInProgress()), Boolean.valueOf(betContainerState.getAutoBetFlag()), betContainerState.getGift().getGiftId(), Boolean.valueOf(betContainerState.getFbgAvailable()), Boolean.valueOf(z), d4};
            boolean zA = (i7 == 4) | bVarI.A(betContainerState) | (i8 == i5) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | (i9 == 1048576) | ((i3 & 896) == 256) | ((29360128 & i3) == 8388608) | ((234881024 & i3) == 67108864) | ((1879048192 & i3) == 536870912) | ((i6 & 14) == 4) | ((i6 & 112) == i5) | ((i6 & 896) == 256);
            Object objY7 = bVarI.y();
            if (zA || objY7 == c0042a) {
                a aVar2 = new a(betContainerState, d, fswVar5, d2, fswVar4, ytwVar4, z, ytwVar5, d4, fswVar, d3, fswVar3, ytwVar, fswVar2, ytwVar2, ytwVar3, function2, function0, null);
                bVar = bVarI;
                bVar.r(aVar2);
                objY7 = aVar2;
            } else {
                bVar = bVarI;
            }
            xvf.h(objArr, (Function2) objY7, bVar);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hnb0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    inb0.a(d, d2, d3, betContainerState, z, d4, fswVar, ytwVar, fswVar2, ytwVar2, ytwVar3, function2, function0, (a) obj2, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }
}
