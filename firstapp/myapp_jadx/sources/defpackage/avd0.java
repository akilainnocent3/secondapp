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
@c0d(c = "com.sportygames.crash.components.bet.telemetry.StakeUiStateValidationSideEffectKt$StakeUiStateValidationSideEffect$1$1", f = "StakeUiStateValidationSideEffect.kt", l = {}, m = "invokeSuspend", v = 1)
public final class avd0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ z83 E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Set<String> G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
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
    public final /* synthetic */ long f;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avd0(long j, MultiplierResponse multiplierResponse, boolean z, boolean z2, boolean z3, long j2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str, String str2, z83 z83Var, boolean z11, Set<String> set, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, Double d, List<Double> list, Integer num, Boolean bool, l1z l1zVar, Context context, String str3, v1b<? super avd0> v1bVar) {
        super(2, v1bVar);
        this.a = j;
        this.b = multiplierResponse;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = j2;
        this.i = z4;
        this.v = z5;
        this.w = z6;
        this.y = z7;
        this.z = z8;
        this.A = z9;
        this.B = z10;
        this.C = str;
        this.D = str2;
        this.E = z83Var;
        this.F = z11;
        this.G = set;
        this.H = z12;
        this.I = z13;
        this.J = z14;
        this.K = z15;
        this.L = z16;
        this.M = z17;
        this.N = d;
        this.O = list;
        this.P = num;
        this.Q = bool;
        this.R = l1zVar;
        this.S = context;
        this.T = str3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new avd0(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((avd0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        vud0 vud0VarC = bvd0.c(multiplierResponse.getMessageType(), this.c, this.d, this.e, this.b, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F);
        if (vud0VarC == null) {
            return Unit.a;
        }
        String str = vud0VarC.a;
        Set<String> set = this.G;
        if (set.contains(str)) {
            return Unit.a;
        }
        boolean z = this.i;
        boolean z2 = this.H;
        boolean z3 = this.d;
        boolean z4 = this.c;
        String strB = od3.b(multiplierResponse.getMessageType(), od3.a(z, z2, z3, z4));
        if (strB == null) {
            return Unit.a;
        }
        long roundId = multiplierResponse.getRoundId();
        String currentMultiplier = multiplierResponse.getCurrentMultiplier();
        String messageType = multiplierResponse.getMessageType();
        boolean hasEnded = multiplierResponse.getHasEnded();
        String strName = this.E.name();
        String userId = SportyGamesManager.getInstance().getUserId();
        od3.a aVarB = bvd0.b(vud0VarC, this.I, this.J, this.K, this.L, this.M, this.c, this.d, this.v, this.i, this.z, this.A, this.C, this.D, this.y, this.w, this.B, this.F, this.E, hd3.a(null, Boolean.valueOf(z4), Boolean.valueOf(z3), Boolean.valueOf(this.e), null, Boolean.valueOf(this.v), null, null, Boolean.valueOf(z), Boolean.valueOf(z2), new Long(j), new Long(roundId), currentMultiplier, messageType, Boolean.valueOf(hasEnded), strName, this.D, null, this.N, this.O, Boolean.valueOf(this.z), Boolean.valueOf(this.A), Boolean.valueOf(this.y), Boolean.valueOf(this.w), Boolean.valueOf(this.B), Boolean.valueOf(this.F), null, null, Boolean.valueOf(userId == null || StringsKt.U(userId)), this.C, this.P, this.Q, 201457873));
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
