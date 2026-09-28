package defpackage;

import android.content.Context;
import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.MultiplierResponse;
import com.sportygames.multilevel.common.model.UserLevelProgressDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportygames.multilevel.common.components.MultiLevelRoundBarHostKt$MultiLevelRoundBarHost$8$1", f = "MultiLevelRoundBarHost.kt", l = {}, m = "invokeSuspend", v = 1)
public final class qcw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<MultiplierResponse> A;
    public /* synthetic */ Object a;
    public final /* synthetic */ jph0 b;
    public final /* synthetic */ dnb0 c;
    public final /* synthetic */ gaj<Integer, Integer, Integer, Unit> d;
    public final /* synthetic */ dnb0 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ pbw i;
    public final /* synthetic */ Function0<Unit> v;
    public final /* synthetic */ Function2<Integer, Boolean, Unit> w;
    public final /* synthetic */ ytw y;
    public final /* synthetic */ ytw z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcw(jph0 jph0Var, dnb0 dnb0Var, gaj gajVar, dnb0 dnb0Var2, Context context, pbw pbwVar, Function0 function0, Function2 function2, ytw ytwVar, ytw ytwVar2, ytw ytwVar3, v1b v1bVar) {
        super(2, v1bVar);
        this.b = jph0Var;
        this.c = dnb0Var;
        this.d = gajVar;
        this.e = dnb0Var2;
        this.f = context;
        this.i = pbwVar;
        this.v = function0;
        this.w = function2;
        this.y = ytwVar;
        this.z = ytwVar2;
        this.A = ytwVar3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qcw qcwVar = new qcw(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, v1bVar);
        qcwVar.a = obj;
        return qcwVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qcw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x02bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:80:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:83:0x02cd  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        UserLevelProgressDto userLevelProgressDto;
        long roundId;
        UserLevelProgressDto userLevelProgressDto2;
        wbw wbwVar;
        int i;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        jph0 jph0Var = this.b;
        jph0.d dVar = jph0Var instanceof jph0.d ? (jph0.d) jph0Var : null;
        if (dVar == null || (userLevelProgressDto = dVar.a) == null) {
            return Unit.a;
        }
        ytw ytwVar = this.y;
        boolean z = ((BetContainerState) ytwVar.getValue()).getBetPlaced() && ((BetContainerState) ytwVar.getValue()).getRoundId() > 0;
        ytw ytwVar2 = this.z;
        boolean z2 = ((BetContainerState) ytwVar2.getValue()).getBetPlaced() && ((BetContainerState) ytwVar2.getValue()).getRoundId() > 0;
        if (z && z2) {
            roundId = Math.max(((BetContainerState) ytwVar.getValue()).getRoundId(), ((BetContainerState) ytwVar2.getValue()).getRoundId());
        } else if (z) {
            roundId = ((BetContainerState) ytwVar.getValue()).getRoundId();
        } else {
            roundId = z2 ? ((BetContainerState) ytwVar2.getValue()).getRoundId() : 0L;
        }
        int level = userLevelProgressDto.getLevel();
        int normalRounds = userLevelProgressDto.getNormalRounds();
        int completedNormalRounds = userLevelProgressDto.getCompletedNormalRounds();
        ytw<MultiplierResponse> ytwVar3 = this.A;
        String messageType = ytwVar3.getValue().getMessageType();
        long roundId2 = ytwVar3.getValue().getRoundId();
        messageType.getClass();
        dnb0 dnb0Var = this.c;
        dnb0Var.getClass();
        gaj<Integer, Integer, Integer, Unit> gajVar = this.d;
        gajVar.getClass();
        if (level < 1) {
            level = 1;
        }
        if (normalRounds < 0) {
            normalRounds = 0;
        }
        int iE = f.e(completedNormalRounds, 0, normalRounds);
        int iD = ((u5a0) dnb0Var.getV()).D();
        String str = xOgHBQVl.eenQcyC;
        if (iD < 0 || ((u5a0) dnb0Var.getI()).D() < 0 || ((u5a0) dnb0Var.getF()).D() < 0) {
            userLevelProgressDto2 = userLevelProgressDto;
            ((u5a0) dnb0Var.getV()).k(level);
            ((u5a0) dnb0Var.getI()).k(normalRounds);
            ((u5a0) dnb0Var.getF()).k(iE);
            ((v5a0) dnb0Var.getZ()).K(-1L);
            gajVar.invoke(Integer.valueOf(level), Integer.valueOf(normalRounds), Integer.valueOf(iE));
            wbwVar = new wbw(null, null, false, false);
        } else {
            int iD2 = ((u5a0) dnb0Var.getV()).D();
            if (iD2 < 1) {
                iD2 = 1;
            }
            int iD3 = ((u5a0) dnb0Var.getI()).D();
            if (iD3 < 0) {
                iD3 = 0;
            }
            if (level <= iD2 || roundId != 0 || ((Boolean) ((x5a0) dnb0Var.P1()).getValue()).booleanValue()) {
                userLevelProgressDto2 = userLevelProgressDto;
                if (((Boolean) ((x5a0) dnb0Var.P1()).getValue()).booleanValue()) {
                    long jU = ((v5a0) dnb0Var.getB()).u();
                    if (level > iD2 && jU > 0 && roundId2 > jU) {
                        ((x5a0) dnb0Var.P1()).setValue(Boolean.FALSE);
                        ((v5a0) dnb0Var.getB()).K(-1L);
                        ((u5a0) dnb0Var.getD()).k(0);
                        ((v5a0) dnb0Var.getE()).K(-1L);
                        ((u5a0) dnb0Var.getV()).k(level);
                        ((u5a0) dnb0Var.getI()).k(normalRounds);
                        ((u5a0) dnb0Var.getF()).k(iE);
                        ((v5a0) dnb0Var.getZ()).K(-1L);
                        gajVar.invoke(Integer.valueOf(level), Integer.valueOf(normalRounds), Integer.valueOf(iE));
                        wbwVar = new wbw(null, null, false, false);
                    } else if (!messageType.equals("ROUND_END_WAIT") || roundId2 == ((v5a0) dnb0Var.getE()).u()) {
                        if (iD3 > 0) {
                            i = iD3 - 1;
                        } else {
                            i = 0;
                        }
                        if (((u5a0) dnb0Var.getF()).D() != i) {
                            ((u5a0) dnb0Var.getF()).k(i);
                            gajVar.invoke(Integer.valueOf(iD2), Integer.valueOf(iD3), Integer.valueOf(i));
                        }
                        wbwVar = new wbw(null, null, false, false);
                    } else {
                        ((v5a0) dnb0Var.getE()).K(roundId2);
                        if (roundId2 == ((v5a0) dnb0Var.getB()).u()) {
                            ((x5a0) dnb0Var.P1()).setValue(Boolean.FALSE);
                            ((v5a0) dnb0Var.getB()).K(-1L);
                            ((u5a0) dnb0Var.getD()).k(0);
                            ((v5a0) dnb0Var.getE()).K(-1L);
                            ((u5a0) dnb0Var.getV()).k(level);
                            ((u5a0) dnb0Var.getI()).k(normalRounds);
                            ((u5a0) dnb0Var.getF()).k(iE);
                            gajVar.invoke(Integer.valueOf(level), Integer.valueOf(normalRounds), Integer.valueOf(iE));
                            boolean z3 = level > iD2;
                            Integer numValueOf = Integer.valueOf(level);
                            if (level <= iD2) {
                                numValueOf = null;
                            }
                            wbwVar = new wbw(numValueOf, null, z3, false);
                        } else {
                            if (iD3 > 0) {
                                i = iD3 - 1;
                            } else {
                                i = 0;
                            }
                            if (((u5a0) dnb0Var.getF()).D() != i) {
                                ((u5a0) dnb0Var.getF()).k(i);
                                gajVar.invoke(Integer.valueOf(iD2), Integer.valueOf(iD3), Integer.valueOf(i));
                            }
                            wbwVar = new wbw(null, null, false, false);
                        }
                    }
                } else if (messageType.equals("ROUND_END_WAIT") && roundId2 != ((v5a0) dnb0Var.getZ()).u() && level > iD2 && roundId > 0 && roundId2 == roundId) {
                    ((v5a0) dnb0Var.getZ()).K(roundId2);
                    ((x5a0) dnb0Var.P1()).setValue(Boolean.FALSE);
                    ((v5a0) dnb0Var.getB()).K(-1L);
                    ((u5a0) dnb0Var.getD()).k(0);
                    ((v5a0) dnb0Var.getE()).K(-1L);
                    ((u5a0) dnb0Var.getV()).k(level);
                    ((u5a0) dnb0Var.getI()).k(normalRounds);
                    ((u5a0) dnb0Var.getF()).k(iE);
                    gajVar.invoke(Integer.valueOf(level), Integer.valueOf(normalRounds), Integer.valueOf(iE));
                    wbwVar = new wbw(Integer.valueOf(level), null, true, false);
                } else if (messageType.equals("ROUND_END_WAIT") || level <= iD2 || roundId <= 0) {
                    if (level < ((u5a0) dnb0Var.getV()).D()) {
                        ((u5a0) dnb0Var.getV()).k(level);
                        ((u5a0) dnb0Var.getW()).k(level);
                    }
                    if (level == iD2 && (normalRounds != ((u5a0) dnb0Var.getI()).D() || iE != ((u5a0) dnb0Var.getF()).D())) {
                        ((u5a0) dnb0Var.getI()).k(normalRounds);
                        ((u5a0) dnb0Var.getF()).k(iE);
                        gajVar.invoke(Integer.valueOf(iD2), Integer.valueOf(normalRounds), Integer.valueOf(iE));
                    }
                    if (messageType.equals("ROUND_END_WAIT") && roundId2 != ((v5a0) dnb0Var.getZ()).u()) {
                        ((v5a0) dnb0Var.getZ()).K(roundId2);
                        if (level <= iD2) {
                            ((u5a0) dnb0Var.getI()).k(normalRounds);
                            ((u5a0) dnb0Var.getF()).k(iE);
                            ((u5a0) dnb0Var.getV()).k(level);
                            gajVar.invoke(Integer.valueOf(level), Integer.valueOf(normalRounds), Integer.valueOf(iE));
                        }
                    }
                    if (messageType.equals(str) && roundId2 != ((v5a0) dnb0Var.getA()).u()) {
                        ((v5a0) dnb0Var.getA()).K(roundId2);
                        if (level <= iD2 && iE > ((u5a0) dnb0Var.getF()).D()) {
                            ((u5a0) dnb0Var.getI()).k(normalRounds);
                            ((u5a0) dnb0Var.getF()).k(iE);
                            ((u5a0) dnb0Var.getV()).k(level);
                            gajVar.invoke(Integer.valueOf(level), Integer.valueOf(normalRounds), Integer.valueOf(iE));
                        }
                    }
                    int i2 = iD2 + 1;
                    boolean z4 = (normalRounds > 0 ? f.d(((float) iE) / ((float) normalRounds), 0.0f, 1.0f) : 0.0f) >= 0.7f && ((u5a0) dnb0Var.getY()).D() != i2;
                    if (z4) {
                        ((u5a0) dnb0Var.getY()).k(i2);
                    }
                    Integer numValueOf2 = Integer.valueOf(i2);
                    if (!z4) {
                        numValueOf2 = null;
                    }
                    wbwVar = new wbw(null, numValueOf2, false, z4);
                } else {
                    ((x5a0) dnb0Var.P1()).setValue(Boolean.TRUE);
                    ((v5a0) dnb0Var.getB()).K(roundId);
                    ((u5a0) dnb0Var.getD()).k(0);
                    ((v5a0) dnb0Var.getE()).K(-1L);
                    int i3 = iD3 > 0 ? iD3 - 1 : 0;
                    ((u5a0) dnb0Var.getF()).k(i3);
                    gajVar.invoke(Integer.valueOf(iD2), Integer.valueOf(iD3), Integer.valueOf(i3));
                    wbwVar = new wbw(null, null, false, false);
                }
            } else {
                ((u5a0) dnb0Var.getV()).k(level);
                ((u5a0) dnb0Var.getI()).k(normalRounds);
                ((u5a0) dnb0Var.getF()).k(iE);
                ((v5a0) dnb0Var.getZ()).K(-1L);
                ((x5a0) dnb0Var.P1()).setValue(Boolean.FALSE);
                ((v5a0) dnb0Var.getB()).K(-1L);
                ((u5a0) dnb0Var.getD()).k(0);
                ((v5a0) dnb0Var.getE()).K(-1L);
                gajVar.invoke(Integer.valueOf(level), Integer.valueOf(normalRounds), Integer.valueOf(iE));
                wbwVar = new wbw(null, null, false, false);
                userLevelProgressDto2 = userLevelProgressDto;
            }
        }
        pbw pbwVar = this.i;
        Integer num = wbwVar.b;
        if (num != null) {
            dnb0 dnb0Var2 = this.e;
            ((u5a0) dnb0Var2.getW0()).k(num.intValue());
            ytw<String> ytwVarU1 = dnb0Var2.U1();
            String string = this.f.getString(pbwVar.b(num.intValue()));
            string.getClass();
            ((x5a0) ytwVarU1).setValue(string);
            u5a0 u5a0Var = (u5a0) dnb0Var2.getV0();
            u5a0Var.k(u5a0Var.D() + 1);
            pbwVar.a();
        }
        Function2<Integer, Boolean, Unit> function2 = this.w;
        if (num != null && ((u5a0) dnb0Var.getW()).D() != num.intValue()) {
            ((u5a0) dnb0Var.getW()).k(num.intValue());
            this.v.invoke();
            function2.invoke(num, Boolean.TRUE);
            pbwVar.c(num.intValue());
        }
        int iD4 = ((u5a0) dnb0Var.getV()).D();
        if (iD4 >= 1) {
            int iD5 = ((u5a0) dnb0Var.getI()).D();
            if (iD5 < 0) {
                iD5 = 0;
            }
            boolean z5 = false;
            int iE2 = f.e(((u5a0) dnb0Var.getF()).D(), 0, iD5);
            if (iD5 > 0) {
                int i4 = iD5 - iE2;
                if (i4 < 0) {
                    i4 = 0;
                }
                if (i4 == 1) {
                    z5 = true;
                }
            }
            int level2 = userLevelProgressDto2.getLevel() > iD4 ? userLevelProgressDto2.getLevel() : iD4 + 1;
            boolean zBooleanValue = ((Boolean) ((x5a0) dnb0Var.P1()).getValue()).booleanValue();
            String messageType2 = ytwVar3.getValue().getMessageType();
            if ((Intrinsics.g(messageType2, "ROUND_PRE_START") || (Intrinsics.g(messageType2, str) && zBooleanValue)) && level2 > iD4 && (z5 || zBooleanValue || userLevelProgressDto2.getLevel() > iD4)) {
                function2.invoke(new Integer(level2), Boolean.FALSE);
            }
        }
        Integer num2 = wbwVar.d;
        if (num2 != null) {
            pbwVar.d(num2.intValue());
        }
        return Unit.a;
    }
}
