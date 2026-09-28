package defpackage;

import android.content.Context;
import android.os.Build;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.remote.models.MultiplierResponse;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.components.bet.telemetry.BetUiStateValidationKt$BetUiStateValidationSideEffect$1$1", f = "BetUiStateValidation.kt", l = {}, m = "invokeSuspend", v = 1)
public final class md3 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ Set<String> A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ String I;
    public final /* synthetic */ double J;
    public final /* synthetic */ double K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ Double N;
    public final /* synthetic */ List<Double> O;
    public final /* synthetic */ Integer P;
    public final /* synthetic */ Boolean Q;
    public final /* synthetic */ l1z R;
    public final /* synthetic */ Context S;
    public final /* synthetic */ String T;
    public final /* synthetic */ long a;
    public final /* synthetic */ MultiplierResponse b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ z83 w;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md3(long j, MultiplierResponse multiplierResponse, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, z83 z83Var, boolean z7, boolean z8, Set<String> set, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, double d, double d2, boolean z16, boolean z17, Double d3, List<Double> list, Integer num, Boolean bool, l1z l1zVar, Context context, String str2, v1b<? super md3> v1bVar) {
        super(2, v1bVar);
        this.a = j;
        this.b = multiplierResponse;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.i = z5;
        this.v = z6;
        this.w = z83Var;
        this.y = z7;
        this.z = z8;
        this.A = set;
        this.B = z9;
        this.C = z10;
        this.D = z11;
        this.E = z12;
        this.F = z13;
        this.G = z14;
        this.H = z15;
        this.I = str;
        this.J = d;
        this.K = d2;
        this.L = z16;
        this.M = z17;
        this.N = d3;
        this.O = list;
        this.P = num;
        this.Q = bool;
        this.R = l1zVar;
        this.S = context;
        this.T = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new md3(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((md3) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        long j = this.a;
        if (j <= 0) {
            return Unit.a;
        }
        MultiplierResponse multiplierResponse = this.b;
        gd3 gd3VarE = nd3.e(multiplierResponse.getMessageType(), this.c, this.d, this.e, this.f, this.b, this.a, this.i, this.v, this.w, this.y, this.z);
        if (gd3VarE == null) {
            return Unit.a;
        }
        String str = gd3VarE.a;
        Set<String> set = this.A;
        if (set.contains(str)) {
            return Unit.a;
        }
        boolean z = this.i;
        boolean z2 = this.d;
        boolean z3 = this.c;
        String strB = od3.b(multiplierResponse.getMessageType(), od3.a(z, false, z2, z3));
        if (strB == null) {
            return Unit.a;
        }
        String messageType = multiplierResponse.getMessageType();
        Double d = new Double(this.J);
        Boolean boolValueOf = Boolean.valueOf(z3);
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        Boolean boolValueOf3 = Boolean.valueOf(this.e);
        Boolean boolValueOf4 = Boolean.valueOf(this.f);
        Boolean boolValueOf5 = Boolean.valueOf(this.v);
        Boolean boolValueOf6 = Boolean.valueOf(this.L);
        Boolean boolValueOf7 = Boolean.valueOf(this.M);
        Boolean boolValueOf8 = Boolean.valueOf(z);
        Long l = new Long(j);
        Long l2 = new Long(multiplierResponse.getRoundId());
        String currentMultiplier = multiplierResponse.getCurrentMultiplier();
        String messageType2 = multiplierResponse.getMessageType();
        Boolean boolValueOf9 = Boolean.valueOf(multiplierResponse.getHasEnded());
        String strName = this.w.name();
        Double d2 = new Double(this.K);
        Boolean boolValueOf10 = Boolean.valueOf(this.y);
        Boolean boolValueOf11 = Boolean.valueOf(this.z);
        String userId = SportyGamesManager.getInstance().getUserId();
        od3.a aVarB = nd3.b(gd3VarE, this.B, this.C, this.D, this.E, this.F, this.G, this.w, this.i, this.y, this.d, this.c, this.H, this.I, this.J, this.K, this.L, this.M, this.e, this.f, this.a, messageType, this.z, hd3.a(d, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, null, l, l2, currentMultiplier, messageType2, boolValueOf9, strName, this.I, d2, this.N, this.O, null, null, null, null, null, null, boolValueOf10, boolValueOf11, Boolean.valueOf(userId == null || StringsKt.U(userId)), null, this.P, this.Q, 602931712));
        if (aVarB == null) {
            return Unit.a;
        }
        set.add(str);
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = aVarB.b;
        String str3 = aVarB.a;
        String userId2 = sportyGamesManager.getUserId();
        String patronId = sportyGamesManager.getPatronId();
        String deviceId = sportyGamesManager.getDeviceId();
        String str4 = Build.VERSION.RELEASE;
        this.R.a(strB, str2, str3, userId2, patronId, deviceId, new Double(fie.b(this.S)), String.valueOf(sportyGamesManager.getVersionCode()), fie.a(), jCurrentTimeMillis, this.T, aVarB.c, this.P, this.Q);
        return Unit.a;
    }
}
