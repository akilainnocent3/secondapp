package defpackage;

import com.sportygames.crash.remote.models.MultiplierResponse;
import com.sportygames.multilevel.common.model.LevelConfigDetailDto;
import com.sportygames.multilevel.common.model.UserLevelProgressDto;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.common.components.MultiLevelRoundBarHostKt$MultiLevelRoundBarHost$7$1", f = "MultiLevelRoundBarHost.kt", l = {}, m = "invokeSuspend", v = 1)
public final class pcw extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ dnb0 a;
    public final /* synthetic */ dnb0 b;
    public final /* synthetic */ UserLevelProgressDto c;
    public final /* synthetic */ List<LevelConfigDetailDto> d;
    public final /* synthetic */ qaw e;
    public final /* synthetic */ qaw f;
    public final /* synthetic */ ytw<MultiplierResponse> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pcw(dnb0 dnb0Var, dnb0 dnb0Var2, UserLevelProgressDto userLevelProgressDto, List<LevelConfigDetailDto> list, qaw qawVar, qaw qawVar2, ytw<MultiplierResponse> ytwVar, v1b<? super pcw> v1bVar) {
        super(2, v1bVar);
        this.a = dnb0Var;
        this.b = dnb0Var2;
        this.c = userLevelProgressDto;
        this.d = list;
        this.e = qawVar;
        this.f = qawVar2;
        this.i = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pcw(this.a, this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pcw) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:180:0x0338  */
    /* JADX WARN: Code duplicated, block: B:189:0x0357  */
    /* JADX WARN: Code duplicated, block: B:194:0x0362  */
    /* JADX WARN: Code duplicated, block: B:200:0x0371 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:202:0x0374  */
    /* JADX WARN: Code duplicated, block: B:205:0x0379  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:61:0x0119  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        double dDoubleValue;
        boolean z;
        Integer numValueOf;
        int iIntValue;
        Object obj2;
        long jMax;
        long j;
        long j2;
        long j3;
        Object next;
        Double d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        UserLevelProgressDto userLevelProgressDto = this.c;
        Boolean boolValueOf = userLevelProgressDto != null ? Boolean.valueOf(userLevelProgressDto.isNextBonusRound()) : null;
        Boolean boolValueOf2 = userLevelProgressDto != null ? Boolean.valueOf(userLevelProgressDto.isBonusMeterVisible()) : null;
        Double d2 = userLevelProgressDto != null ? new Double(userLevelProgressDto.getBonusPercentage()) : null;
        Integer num = userLevelProgressDto != null ? new Integer(userLevelProgressDto.getLevel()) : null;
        int bonusMeterRounds = userLevelProgressDto != null ? userLevelProgressDto.getBonusMeterRounds() : 0;
        int completedBonusMeterRounds = userLevelProgressDto != null ? userLevelProgressDto.getCompletedBonusMeterRounds() : 0;
        ytw<MultiplierResponse> ytwVar = this.i;
        String messageType = ytwVar.getValue().getMessageType();
        long roundId = ytwVar.getValue().getRoundId();
        dnb0 dnb0Var = this.a;
        dnb0Var.getClass();
        dnb0 dnb0Var2 = this.b;
        dnb0Var2.getClass();
        List<LevelConfigDetailDto> list = this.d;
        list.getClass();
        qaw qawVar = this.e;
        Integer num2 = num;
        long j4 = qawVar.c;
        qaw qawVar2 = this.f;
        Double d3 = qawVar2.e;
        long j5 = qawVar2.c;
        long j6 = qawVar2.b;
        boolean z2 = qawVar2.a;
        messageType.getClass();
        Double d4 = qawVar.e;
        long j7 = qawVar.b;
        boolean z3 = qawVar.a;
        if (j4 <= 0) {
            if (j5 > 0) {
                if (d3 != null) {
                    dDoubleValue = d3.doubleValue();
                } else {
                    dDoubleValue = 0.0d;
                }
                z = dDoubleValue > 0.0d;
            }
        } else {
            if ((d4 != null ? d4.doubleValue() : 0.0d) <= 0.0d) {
                if (j5 > 0) {
                    if (d3 != null) {
                        dDoubleValue = d3.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    if (dDoubleValue > 0.0d) {
                    }
                }
            }
        }
        boolean z4 = ((v5a0) dnb0Var.getM()).u() > 0;
        if (z) {
            if (!z4) {
                ((x5a0) dnb0Var.z1()).setValue(Boolean.TRUE);
            }
            if (j4 <= 0) {
                j2 = 0;
            } else {
                if ((d4 != null ? d4.doubleValue() : 0.0d) > 0.0d) {
                    j2 = qawVar.d;
                } else {
                    j2 = 0;
                }
            }
            if (j5 <= 0) {
                j3 = 0;
            } else {
                if ((d3 != null ? d3.doubleValue() : 0.0d) > 0.0d) {
                    j3 = qawVar2.d;
                } else {
                    j3 = 0;
                }
            }
            long jMax2 = Math.max(j2, j3);
            if (jMax2 > 0 && ((v5a0) dnb0Var.getF()).u() <= 0) {
                ((v5a0) dnb0Var.getF()).K(jMax2);
            }
            Iterator it = ay0.r(new qaw[]{qawVar, qawVar2}).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                qaw qawVar3 = (qaw) next;
                if (qawVar3.c > 0) {
                    Double d5 = qawVar3.e;
                    if ((d5 != null ? d5.doubleValue() : 0.0d) > 0.0d) {
                        break;
                    }
                }
            }
            qaw qawVar4 = (qaw) next;
            double dDoubleValue2 = (qawVar4 == null || (d = qawVar4.e) == null) ? 0.0d : d.doubleValue();
            if (dDoubleValue2 > 0.0d) {
                int iD = ((u5a0) dnb0Var.getH()).D();
                osw h = dnb0Var.getH();
                int i = (int) dDoubleValue2;
                if (i < 0) {
                    i = 0;
                }
                ((u5a0) h).k(Math.max(iD, i));
            }
        } else {
            z3 = z3;
            z = z;
            dnb0Var2 = dnb0Var2;
            list = list;
        }
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.g(boolValueOf2, bool)) {
            ((x5a0) dnb0Var.C1()).setValue(bool);
        }
        boolean zG = Intrinsics.g(boolValueOf, bool);
        double dDoubleValue3 = d2 != null ? d2.doubleValue() : 0.0d;
        int iD2 = ((u5a0) dnb0Var2.getV()).D();
        Integer numValueOf2 = Integer.valueOf(iD2);
        if (iD2 <= 0) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            iIntValue = numValueOf2.intValue();
        } else {
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                if (iIntValue2 < 1) {
                    iIntValue2 = 1;
                }
                numValueOf = Integer.valueOf(iIntValue2);
            } else {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : 1;
        }
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            Object next2 = it2.next();
            if (((LevelConfigDetailDto) next2).getLevel() == iIntValue) {
                obj2 = next2;
                break;
            }
        }
        LevelConfigDetailDto levelConfigDetailDto = (LevelConfigDetailDto) obj2;
        double bonusPercentage = levelConfigDetailDto != null ? levelConfigDetailDto.getBonusPercentage() : 0.0d;
        if (dDoubleValue3 > 0.0d && (zG || ((Boolean) ((x5a0) dnb0Var.z1()).getValue()).booleanValue())) {
            osw h2 = dnb0Var.getH();
            int i2 = (int) dDoubleValue3;
            if (i2 < 0) {
                i2 = 0;
            }
            ((u5a0) h2).k(i2);
        }
        if (bonusPercentage > 0.0d && (zG || ((Boolean) ((x5a0) dnb0Var.z1()).getValue()).booleanValue())) {
            int iD3 = ((u5a0) dnb0Var.getH()).D();
            osw h3 = dnb0Var.getH();
            int i3 = (int) bonusPercentage;
            if (i3 < 0) {
                i3 = 0;
            }
            ((u5a0) h3).k(Math.max(iD3, i3));
        }
        boolean z5 = zG && !((Boolean) ((x5a0) dnb0Var.J1()).getValue()).booleanValue();
        ((x5a0) dnb0Var.J1()).setValue(Boolean.valueOf(zG));
        boolean z6 = (z3 && j7 > 0) || (z2 && j6 > 0);
        if (bonusMeterRounds > 0 && completedBonusMeterRounds >= bonusMeterRounds && z6 && !((Boolean) ((x5a0) dnb0Var.E1()).getValue()).booleanValue()) {
            ((x5a0) dnb0Var.E1()).setValue(Boolean.TRUE);
            ((u5a0) dnb0Var.getU()).k(bonusMeterRounds);
        }
        long jU = ((v5a0) dnb0Var.getM()).u();
        if (jU > 0) {
            if (messageType.equals("ROUND_END_WAIT") && roundId == jU) {
                ((x5a0) dnb0Var.S1()).setValue(Boolean.TRUE);
            }
            if (((Boolean) ((x5a0) dnb0Var.S1()).getValue()).booleanValue() && messageType.equals("ROUND_WAITING") && roundId != jU) {
                ((v5a0) dnb0Var.getM()).K(0L);
                ((x5a0) dnb0Var.S1()).setValue(Boolean.FALSE);
                if (z) {
                    ((x5a0) dnb0Var.z1()).setValue(Boolean.TRUE);
                }
            } else if (zG) {
                if (z3) {
                    jMax = 0;
                } else {
                    jMax = 0;
                }
                if (z2) {
                    j = 0;
                } else {
                    j = 0;
                }
                if (jMax <= 0) {
                    if (jMax <= 0) {
                        jMax = j;
                    }
                } else if (jMax <= 0) {
                    jMax = j;
                }
                if (jMax > 0) {
                    ((v5a0) dnb0Var.getM()).K(jMax);
                    ((x5a0) dnb0Var.S1()).setValue(Boolean.FALSE);
                }
            }
        } else if (zG && !z && z6 && ((v5a0) dnb0Var.getM()).u() == 0) {
            if (z3 || j7 <= 0) {
                jMax = 0;
            } else {
                jMax = j7;
            }
            if (z2 || j6 <= 0) {
                j = 0;
            } else {
                j = j6;
            }
            if (jMax <= 0 && j > 0) {
                jMax = Math.max(jMax, j);
            } else if (jMax <= 0) {
                jMax = j;
            }
            if (jMax > 0) {
                ((v5a0) dnb0Var.getM()).K(jMax);
                ((x5a0) dnb0Var.S1()).setValue(Boolean.FALSE);
            }
        }
        if (!zG && !z && ((v5a0) dnb0Var.getF()).u() <= 0 && !z6 && ((u5a0) dnb0Var.getJ()).D() <= 0) {
            ytw<Boolean> ytwVarZ1 = dnb0Var.z1();
            Boolean bool2 = Boolean.FALSE;
            ((x5a0) ytwVarZ1).setValue(bool2);
            ((x5a0) dnb0Var.C1()).setValue(bool2);
            ((x5a0) dnb0Var.E1()).setValue(bool2);
            ((u5a0) dnb0Var.getU()).k(0);
            ((v5a0) dnb0Var.getM()).K(0L);
            ((x5a0) dnb0Var.S1()).setValue(bool2);
            ((v5a0) dnb0Var.getK()).K(-1L);
            ((v5a0) dnb0Var.getL()).K(-1L);
        }
        if (z5) {
            ((v5a0) dnb0Var.getL()).K(roundId);
            ((u5a0) dnb0Var.getJ()).k(messageType.equals("ROUND_WAITING") ? 1 : 2);
            ((v5a0) dnb0Var.getK()).K(-1L);
        }
        if (((v5a0) dnb0Var.getF()).u() <= 0 && ((u5a0) dnb0Var.getJ()).D() > 0 && messageType.equals("ROUND_WAITING") && roundId != ((v5a0) dnb0Var.getK()).u() && roundId != ((v5a0) dnb0Var.getL()).u()) {
            ((v5a0) dnb0Var.getK()).K(roundId);
            ((u5a0) dnb0Var.getJ()).k(((u5a0) dnb0Var.getJ()).D() - 1);
            if (((u5a0) dnb0Var.getJ()).D() == 0) {
                ((x5a0) dnb0Var.z1()).setValue(Boolean.TRUE);
            }
        }
        if (((Boolean) ((x5a0) dnb0Var.z1()).getValue()).booleanValue() && ((v5a0) dnb0Var.getF()).u() <= 0 && z6) {
            long jMax3 = (!z3 || j7 <= 0) ? 0L : j7;
            long j8 = (!z2 || j6 <= 0) ? 0L : j6;
            if (jMax3 > 0 && j8 > 0) {
                jMax3 = Math.max(jMax3, j8);
            } else if (jMax3 <= 0) {
                jMax3 = j8;
            }
            if (jMax3 > 0) {
                ((v5a0) dnb0Var.getF()).K(jMax3);
            }
        }
        if (((v5a0) dnb0Var.getF()).u() > 0 && messageType.equals("ROUND_END_WAIT") && roundId == ((v5a0) dnb0Var.getF()).u()) {
            ((v5a0) dnb0Var.getF()).K(0L);
            ytw<Boolean> ytwVarZ2 = dnb0Var.z1();
            Boolean bool3 = Boolean.FALSE;
            ((x5a0) ytwVarZ2).setValue(bool3);
            ((u5a0) dnb0Var.getH()).k(0);
            ((x5a0) dnb0Var.C1()).setValue(bool3);
            ((x5a0) dnb0Var.E1()).setValue(bool3);
            ((u5a0) dnb0Var.getU()).k(0);
            ((u5a0) dnb0Var.getJ()).k(0);
            ((v5a0) dnb0Var.getK()).K(-1L);
            ((v5a0) dnb0Var.getL()).K(-1L);
        }
        return Unit.a;
    }
}
