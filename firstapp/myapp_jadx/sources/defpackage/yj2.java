package defpackage;

import android.content.Context;
import android.os.Build;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.remote.models.MultiplierResponse;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class yj2 {
    public long a = Long.MIN_VALUE;
    public final LinkedHashSet b = new LinkedHashSet();
    public final LinkedHashSet c = new LinkedHashSet();
    public final LinkedHashSet d = new LinkedHashSet();
    public String e;

    public static void a(Context context, l1z l1zVar, String str, od3.a aVar, String str2, Integer num, Boolean bool) {
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str3 = aVar.b;
        String str4 = aVar.a;
        String userId = sportyGamesManager.getUserId();
        String patronId = sportyGamesManager.getPatronId();
        String deviceId = sportyGamesManager.getDeviceId();
        String str5 = Build.VERSION.RELEASE;
        l1zVar.a(str, str3, str4, userId, patronId, deviceId, Double.valueOf(fie.b(context)), String.valueOf(sportyGamesManager.getVersionCode()), fie.a(), jCurrentTimeMillis, str2, aVar.c, num, bool);
    }

    public final void b(final Context context, final l1z l1zVar, final long j, final MultiplierResponse multiplierResponse, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final String str, final Integer num, final Double d, final List<Double> list, final Boolean bool) {
        l1zVar.getClass();
        if (j <= 0) {
            return;
        }
        e(j, new Function0() { // from class: vj2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean z7;
                boolean z8;
                MultiplierResponse multiplierResponse2 = multiplierResponse;
                String messageType = multiplierResponse2.getMessageType();
                boolean z9 = z;
                boolean z10 = z2;
                boolean z11 = z3;
                boolean z12 = z4;
                qa1 qa1VarC = ya1.c(messageType, z9, z10, z11, z12);
                if (qa1VarC == null) {
                    return Unit.a;
                }
                long roundId = multiplierResponse2.getRoundId();
                String currentMultiplier = multiplierResponse2.getCurrentMultiplier();
                String messageType2 = multiplierResponse2.getMessageType();
                boolean hasEnded = multiplierResponse2.getHasEnded();
                String userId = SportyGamesManager.getInstance().getUserId();
                if (userId == null || StringsKt.U(userId)) {
                    z7 = true;
                    z8 = false;
                } else {
                    z7 = false;
                    z8 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z9);
                Boolean boolValueOf2 = Boolean.valueOf(z10);
                Boolean boolValueOf3 = Boolean.valueOf(z12);
                Boolean boolValueOf4 = Boolean.valueOf(z11);
                Long lValueOf = Long.valueOf(j);
                Long lValueOf2 = Long.valueOf(roundId);
                Boolean boolValueOf5 = Boolean.valueOf(hasEnded);
                Boolean boolValueOf6 = Boolean.valueOf(z7);
                Double d2 = d;
                List list2 = list;
                Integer num2 = num;
                Boolean bool2 = bool;
                od3.a aVarB = ya1.b(qa1VarC, z5, z6, z9, z10, z11, z12, hd3.a(null, boolValueOf, boolValueOf2, null, null, boolValueOf3, null, null, boolValueOf4, null, lValueOf, lValueOf2, currentMultiplier, messageType2, boolValueOf5, null, null, null, d2, list2, null, null, null, null, null, null, null, null, boolValueOf6, null, num2, bool2, 804487897));
                if (aVarB == null) {
                    return Unit.a;
                }
                if (!this.d.add(qa1VarC.a)) {
                    return Unit.a;
                }
                String strB = od3.b(multiplierResponse2.getMessageType(), od3.a(z11, false, z10, z9));
                if (strB == null) {
                    return Unit.a;
                }
                yj2.a(context, l1zVar, strB, aVarB, str, num2, bool2);
                return Unit.a;
            }
        });
    }

    public final void c(final Context context, final l1z l1zVar, final long j, final MultiplierResponse multiplierResponse, final boolean z, final boolean z2, final boolean z3, final boolean z4, final z83 z83Var, final boolean z5, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final String str, final double d, final double d2, final String str2, final Integer num, final Double d3, final List list, final Boolean bool) {
        l1zVar.getClass();
        if (j <= 0) {
            return;
        }
        e(j, new Function0() { // from class: xj2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MultiplierResponse multiplierResponse2 = multiplierResponse;
                String messageType = multiplierResponse2.getMessageType();
                boolean z15 = z;
                boolean z16 = z2;
                boolean z17 = z3;
                boolean z18 = z4;
                long j2 = j;
                boolean z19 = z5;
                boolean z20 = z7;
                z83 z83Var2 = z83Var;
                gd3 gd3VarE = nd3.e(messageType, z15, z16, z17, z18, multiplierResponse2, j2, z19, z20, z83Var2, false, false);
                if (gd3VarE == null) {
                    return Unit.a;
                }
                String messageType2 = multiplierResponse2.getMessageType();
                double d4 = d;
                Double dValueOf = Double.valueOf(d4);
                Boolean boolValueOf = Boolean.valueOf(z15);
                Boolean boolValueOf2 = Boolean.valueOf(z16);
                Boolean boolValueOf3 = Boolean.valueOf(z17);
                Boolean boolValueOf4 = Boolean.valueOf(z18);
                Boolean boolValueOf5 = Boolean.valueOf(z20);
                boolean z21 = z8;
                Boolean boolValueOf6 = Boolean.valueOf(z21);
                boolean z22 = z9;
                Boolean boolValueOf7 = Boolean.valueOf(z22);
                Boolean boolValueOf8 = Boolean.valueOf(z19);
                boolean z23 = z6;
                Boolean boolValueOf9 = Boolean.valueOf(z23);
                Long lValueOf = Long.valueOf(j2);
                Long lValueOf2 = Long.valueOf(multiplierResponse2.getRoundId());
                String currentMultiplier = multiplierResponse2.getCurrentMultiplier();
                String messageType3 = multiplierResponse2.getMessageType();
                Boolean boolValueOf10 = Boolean.valueOf(multiplierResponse2.getHasEnded());
                String strName = z83Var2.name();
                double d5 = d2;
                Double dValueOf2 = Double.valueOf(d5);
                Boolean bool2 = Boolean.FALSE;
                String userId = SportyGamesManager.getInstance().getUserId();
                Boolean boolValueOf11 = Boolean.valueOf(userId == null || StringsKt.U(userId));
                String str3 = str;
                Double d6 = d3;
                List list2 = list;
                Integer num2 = num;
                Boolean bool3 = bool;
                od3.a aVarB = nd3.b(gd3VarE, z10, z11, z12, z13, false, false, z83Var2, z19, false, z16, z15, z14, str3, d4, d5, z21, z22, z17, z18, j2, messageType2, false, hd3.a(dValueOf, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, boolValueOf9, lValueOf, lValueOf2, currentMultiplier, messageType3, boolValueOf10, strName, str3, dValueOf2, d6, list2, null, null, null, null, null, null, bool2, bool2, boolValueOf11, null, num2, bool3, 602931200));
                if (aVarB == null) {
                    return Unit.a;
                }
                if (!this.b.add(gd3VarE.a)) {
                    return Unit.a;
                }
                String strB = od3.b(multiplierResponse2.getMessageType(), od3.a(z19, z23, z16, z15));
                if (strB == null) {
                    return Unit.a;
                }
                yj2.a(context, l1zVar, strB, aVarB, str2, num2, bool3);
                return Unit.a;
            }
        });
    }

    public final void d(final Context context, final l1z l1zVar, final long j, final MultiplierResponse multiplierResponse, final long j2, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final boolean z11, final String str, final String str2, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final boolean z16, final z83 z83Var, final boolean z17, final String str3, final Integer num, final Double d, final List<Double> list, final Boolean bool) {
        l1zVar.getClass();
        if (j <= 0) {
            return;
        }
        e(j, new Function0() { // from class: wj2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MultiplierResponse multiplierResponse2 = multiplierResponse;
                String messageType = multiplierResponse2.getMessageType();
                boolean z18 = z2;
                boolean z19 = z;
                boolean z20 = z3;
                long j3 = j2;
                boolean z21 = z4;
                boolean z22 = z5;
                boolean z23 = z7;
                boolean z24 = z8;
                boolean z25 = z9;
                boolean z26 = z10;
                boolean z27 = z11;
                String str4 = str;
                String str5 = str2;
                z83 z83Var2 = z83Var;
                boolean z28 = z17;
                vud0 vud0VarC = bvd0.c(messageType, z18, z19, z20, multiplierResponse2, j3, z21, z22, z23, z24, z25, z26, z27, str4, str5, z83Var2, z28);
                if (vud0VarC == null) {
                    return Unit.a;
                }
                long roundId = multiplierResponse2.getRoundId();
                String currentMultiplier = multiplierResponse2.getCurrentMultiplier();
                String messageType2 = multiplierResponse2.getMessageType();
                boolean hasEnded = multiplierResponse2.getHasEnded();
                String strName = z83Var2.name();
                String userId = SportyGamesManager.getInstance().getUserId();
                boolean z29 = userId == null || StringsKt.U(userId);
                Boolean boolValueOf = Boolean.valueOf(z18);
                Boolean boolValueOf2 = Boolean.valueOf(z19);
                Boolean boolValueOf3 = Boolean.valueOf(z20);
                Boolean boolValueOf4 = Boolean.valueOf(z22);
                Boolean boolValueOf5 = Boolean.valueOf(z21);
                boolean z30 = z6;
                Boolean boolValueOf6 = Boolean.valueOf(z30);
                Long lValueOf = Long.valueOf(j);
                Long lValueOf2 = Long.valueOf(roundId);
                Boolean boolValueOf7 = Boolean.valueOf(hasEnded);
                Boolean boolValueOf8 = Boolean.valueOf(z25);
                Boolean boolValueOf9 = Boolean.valueOf(z26);
                Boolean boolValueOf10 = Boolean.valueOf(z24);
                Boolean boolValueOf11 = Boolean.valueOf(z23);
                Boolean boolValueOf12 = Boolean.valueOf(z27);
                Boolean boolValueOf13 = Boolean.valueOf(z28);
                Boolean boolValueOf14 = Boolean.valueOf(z29);
                Double d2 = d;
                List list2 = list;
                Integer num2 = num;
                Boolean bool2 = bool;
                od3.a aVarB = bvd0.b(vud0VarC, z12, z13, z14, z15, z16, z18, z19, z22, z21, z25, z26, str4, str5, z24, z23, z27, z28, z83Var2, hd3.a(null, boolValueOf, boolValueOf2, boolValueOf3, null, boolValueOf4, null, null, boolValueOf5, boolValueOf6, lValueOf, lValueOf2, currentMultiplier, messageType2, boolValueOf7, strName, str5, null, d2, list2, boolValueOf8, boolValueOf9, boolValueOf10, boolValueOf11, boolValueOf12, boolValueOf13, null, null, boolValueOf14, str4, num2, bool2, 201457873));
                if (aVarB == null) {
                    return Unit.a;
                }
                if (!this.c.add(vud0VarC.a)) {
                    return Unit.a;
                }
                String strB = od3.b(multiplierResponse2.getMessageType(), od3.a(z21, z30, z19, z18));
                if (strB == null) {
                    return Unit.a;
                }
                yj2.a(context, l1zVar, strB, aVarB, str3, num2, bool2);
                return Unit.a;
            }
        });
    }

    public final void e(long j, Function0<Unit> function0) {
        if (j != this.a) {
            this.a = j;
            this.b.clear();
            this.c.clear();
            this.d.clear();
            this.e = null;
        }
        function0.invoke();
    }
}
