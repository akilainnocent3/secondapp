package defpackage;

import androidx.recyclerview.widget.r;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$getSessionData$2", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {569, 198, 584, 599, 614, 229, 629, r.d.DEFAULT_SWIPE_ANIMATION_DURATION, 655, 670}, m = "invokeSuspend", v = 2)
public final class ui70 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ pj70 H;
    public final /* synthetic */ String I;
    public final /* synthetic */ boolean J;
    public tuw a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Set i;
    public tuw v;
    public pj70 w;
    public long y;
    public long z;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$getSessionData$2$configDeferred$1", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {191}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super zi50<? extends x270>>, Object> {
        public int a;
        public final /* synthetic */ pj70 b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, pj70 pj70Var, String str) {
            super(2, v1bVar);
            this.b = pj70Var;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends x270>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objC;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                mg70 mg70Var = this.b.b;
                this.a = 1;
                objC = mg70Var.c(this.c, this);
                if (objC == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objC = ((zi50) obj).a;
            }
            return new zi50(objC);
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSessionDataHandlerImpl$getSessionData$2$shouldCollapseTargetMatchdayDeferred$1", f = "ScheduledFootballSessionDataHandlerImpl.kt", l = {195}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ pj70 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, pj70 pj70Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = pj70Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean zBooleanValue;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (this.b) {
                    x370 x370Var = this.c.e;
                    this.a = 1;
                    obj = x370Var.a(this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    zBooleanValue = false;
                }
                return Boolean.valueOf(zBooleanValue);
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            return Boolean.valueOf(zBooleanValue);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui70(pj70 pj70Var, String str, boolean z, v1b<? super ui70> v1bVar) {
        super(2, v1bVar);
        this.H = pj70Var;
        this.I = str;
        this.J = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ui70 ui70Var = new ui70(this.H, this.I, this.J, v1bVar);
        ui70Var.G = obj;
        return ui70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ui70) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0481 A[LOOP:1: B:93:0x03f6->B:111:0x0481, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x049d  */
    /* JADX WARN: Code duplicated, block: B:117:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:127:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:130:0x0504  */
    /* JADX WARN: Code duplicated, block: B:161:0x040b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x036c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x01e6 A[PHI: r3 r5
      0x01e6: PHI (r3v3 ojd) = (r3v2 ojd), (r3v8 ojd) binds: [B:25:0x01e3, B:14:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x01e6: PHI (r5v12 java.lang.Object) = (r5v9 java.lang.Object), (r5v19 java.lang.Object) binds: [B:25:0x01e3, B:14:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:31:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:43:0x0232  */
    /* JADX WARN: Code duplicated, block: B:45:0x0237  */
    /* JADX WARN: Code duplicated, block: B:57:0x0273  */
    /* JADX WARN: Code duplicated, block: B:60:0x028e  */
    /* JADX WARN: Code duplicated, block: B:63:0x029b  */
    /* JADX WARN: Code duplicated, block: B:65:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:69:0x0313  */
    /* JADX WARN: Code duplicated, block: B:72:0x0336 A[LOOP:2: B:70:0x0330->B:72:0x0336, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0356  */
    /* JADX WARN: Code duplicated, block: B:77:0x0369  */
    /* JADX WARN: Code duplicated, block: B:81:0x0378  */
    /* JADX WARN: Code duplicated, block: B:83:0x038a  */
    /* JADX WARN: Code duplicated, block: B:84:0x038e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0397  */
    /* JADX WARN: Code duplicated, block: B:91:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:99:0x044e  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x020a, code lost:
    
        if (r2.d(r33) == r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x024a, code lost:
    
        if (r2.d(r33) == r4) goto L18;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ui70.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
