package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.worldcup.tournament.presentation.viewmodel.WorldCupTournamentViewModel$fetchTournamentData$2", f = "WorldCupTournamentViewModel.kt", l = {134, 143, 144, 148, 158}, m = "invokeSuspend", v = 2)
public final class g7k0 extends tje0 implements Function2<v5b, v1b<? super f7k0.b>, Object> {
    public ojd a;
    public ojd b;
    public List c;
    public List d;
    public w9l e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ f7k0 v;

    @c0d(c = "com.sportybet.feature.worldcup.tournament.presentation.viewmodel.WorldCupTournamentViewModel$fetchTournamentData$2$groupsDeferred$1", f = "WorldCupTournamentViewModel.kt", l = {140}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super zi50<? extends m6g0>>, Object> {
        public int a;
        public final /* synthetic */ f7k0 b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f7k0 f7k0Var, String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = f7k0Var;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends m6g0>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                tfk tfkVar = this.b.a;
                this.a = 1;
                objA = tfkVar.a(this.c, this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = ((zi50) obj).a;
            }
            return new zi50(objA);
        }
    }

    @c0d(c = "com.sportybet.feature.worldcup.tournament.presentation.viewmodel.WorldCupTournamentViewModel$fetchTournamentData$2$knockoutsDeferred$1", f = "WorldCupTournamentViewModel.kt", l = {141}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super zi50<? extends n8g0>>, Object> {
        public int a;
        public final /* synthetic */ f7k0 b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f7k0 f7k0Var, String str, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = f7k0Var;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends n8g0>> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                vfk vfkVar = this.b.b;
                this.a = 1;
                objA = vfkVar.a(this.c, this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = ((zi50) obj).a;
            }
            return new zi50(objA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7k0(f7k0 f7k0Var, v1b<? super g7k0> v1bVar) {
        super(2, v1bVar);
        this.v = f7k0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        g7k0 g7k0Var = new g7k0(this.v, v1bVar);
        g7k0Var.i = obj;
        return g7k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super f7k0.b> v1bVar) {
        return ((g7k0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:235:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3 A[PHI: r2 r3 r5 r15
      0x00b3: PHI (r2v3 java.lang.Object) = (r2v2 java.lang.Object), (r2v27 java.lang.Object) binds: [B:28:0x00af, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r3v5 ojd) = (r3v4 ojd), (r3v10 ojd) binds: [B:28:0x00af, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r5v8 java.util.List) = (r5v7 java.util.List), (r5v29 java.util.List) binds: [B:28:0x00af, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00b3: PHI (r15v3 ojd) = (r15v2 ojd), (r15v22 ojd) binds: [B:28:0x00af, B:13:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cf A[LOOP:15: B:34:0x00c9->B:36:0x00cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:43:0x0106  */
    /* JADX WARN: Code duplicated, block: B:45:0x0122  */
    /* JADX WARN: Code duplicated, block: B:49:0x0132 A[LOOP:11: B:47:0x012c->B:49:0x0132, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x014b  */
    /* JADX WARN: Code duplicated, block: B:56:0x015b A[LOOP:12: B:54:0x0155->B:56:0x015b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x017d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0187  */
    /* JADX WARN: Code duplicated, block: B:63:0x0191  */
    /* JADX WARN: Code duplicated, block: B:66:0x019c  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:71:0x0202  */
    /* JADX WARN: Code duplicated, block: B:75:0x020c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0211  */
    /* JADX WARN: Code duplicated, block: B:78:0x0218  */
    /* JADX WARN: Code duplicated, block: B:82:0x0266  */
    /* JADX WARN: Code duplicated, block: B:85:0x026f  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a1  */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02b9, code lost:
    
        if (r0 == r4) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List, ojd] */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
