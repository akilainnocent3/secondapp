package defpackage;

import android.util.Log;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class mg80 implements lg80 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final yoh a;
    public final sph b;
    public final hh80 c;
    public final dpg d;
    public final CoroutineContext e;

    @c0d(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$mayLogSession$1", f = "SessionFirelogPublisher.kt", l = {70, 71, 77}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public qnn a;
        public mg80 b;
        public gg80 c;
        public yoh d;
        public eg80 e;
        public hh80 f;
        public int i;
        public final /* synthetic */ eg80 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(eg80 eg80Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.w = eg80Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return mg80.this.new a(this.w, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007e  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b2  */
        /* JADX WARN: Code duplicated, block: B:27:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:30:0x00be  */
        /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objA;
            qnn qnnVar;
            gg80 gg80Var;
            yoh yohVar;
            hh80 hh80Var;
            eg80 eg80Var;
            Object objB2;
            yoh yohVar2;
            hh80 hh80Var2;
            ch80 ch80Var;
            woc wocVar;
            ch80 ch80Var2;
            woc wocVar2;
            y5b y5bVar = y5b.a;
            int i = this.i;
            mg80 mg80Var = mg80.this;
            if (i == 0) {
                uj50.b(obj);
                this.i = 1;
                int i2 = mg80.g;
                objB = mg80Var.b(this);
                if (objB != y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                uj50.b(obj);
                objB = obj;
            } else {
                if (i == 2) {
                    uj50.b(obj);
                    objA = obj;
                    qnnVar = (qnn) objA;
                    gg80Var = gg80.a;
                    yohVar = mg80Var.a;
                    hh80Var = mg80Var.c;
                    ssh sshVar = ssh.a;
                    this.a = qnnVar;
                    this.b = mg80Var;
                    this.c = gg80Var;
                    this.d = yohVar;
                    eg80Var = this.w;
                    this.e = eg80Var;
                    this.f = hh80Var;
                    this.i = 3;
                    objB2 = sshVar.b(this);
                    if (objB2 != y5bVar) {
                        yohVar2 = yohVar;
                        hh80Var2 = hh80Var;
                    }
                    return y5bVar;
                }
                if (i != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hh80Var2 = this.f;
                eg80 eg80Var2 = this.e;
                yohVar2 = this.d;
                gg80Var = this.c;
                mg80Var = this.b;
                qnn qnnVar2 = this.a;
                uj50.b(obj);
                eg80Var = eg80Var2;
                qnnVar = qnnVar2;
                objB2 = obj;
            }
            Map map = (Map) objB2;
            String str = qnnVar.a;
            String str2 = qnnVar.b;
            gg80Var.getClass();
            yohVar2.getClass();
            eg80Var.getClass();
            hh80Var2.getClass();
            map.getClass();
            str2.getClass();
            nrg nrgVar = nrg.SESSION_START;
            String str3 = eg80Var.a;
            String str4 = eg80Var.b;
            int i3 = eg80Var.c;
            long j = eg80Var.d;
            ch80Var = (ch80) map.get(ch80.a.b);
            if (ch80Var == null) {
                wocVar = woc.COLLECTION_SDK_NOT_INSTALLED;
            } else if (ch80Var.a()) {
                wocVar = woc.COLLECTION_ENABLED;
            } else {
                wocVar = woc.COLLECTION_DISABLED;
            }
            ch80Var2 = (ch80) map.get(ch80.a.a);
            if (ch80Var2 == null) {
                wocVar2 = woc.COLLECTION_SDK_NOT_INSTALLED;
            } else if (ch80Var2.a()) {
                wocVar2 = woc.COLLECTION_ENABLED;
            } else {
                wocVar2 = woc.COLLECTION_DISABLED;
            }
            fg80 fg80Var = new fg80(new rg80(str3, str4, i3, j, new xoc(wocVar, wocVar2, hh80Var2.a()), str, str2), gg80.a(yohVar2));
            int i4 = mg80.g;
            mg80Var.getClass();
            try {
                mg80Var.d.a(fg80Var);
                Log.d("FirebaseSessions", "Successfully logged Session Start event.");
            } catch (RuntimeException e) {
                Log.e("FirebaseSessions", "Error logging Session Start event to DataTransport: ", e);
            }
            return Unit.a;
            if (((Boolean) objB).booleanValue()) {
                sph sphVar = mg80Var.b;
                this.i = 2;
                objA = qnn.c.a(sphVar, this);
                if (objA != y5bVar) {
                    qnnVar = (qnn) objA;
                    gg80Var = gg80.a;
                    yohVar = mg80Var.a;
                    hh80Var = mg80Var.c;
                    ssh sshVar2 = ssh.a;
                    this.a = qnnVar;
                    this.b = mg80Var;
                    this.c = gg80Var;
                    this.d = yohVar;
                    eg80Var = this.w;
                    this.e = eg80Var;
                    this.f = hh80Var;
                    this.i = 3;
                    objB2 = sshVar2.b(this);
                    if (objB2 != y5bVar) {
                        yohVar2 = yohVar;
                        hh80Var2 = hh80Var;
                        Map map2 = (Map) objB2;
                        String str5 = qnnVar.a;
                        String str6 = qnnVar.b;
                        gg80Var.getClass();
                        yohVar2.getClass();
                        eg80Var.getClass();
                        hh80Var2.getClass();
                        map2.getClass();
                        str6.getClass();
                        nrg nrgVar2 = nrg.SESSION_START;
                        String str7 = eg80Var.a;
                        String str8 = eg80Var.b;
                        int i5 = eg80Var.c;
                        long j2 = eg80Var.d;
                        ch80Var = (ch80) map2.get(ch80.a.b);
                        if (ch80Var == null) {
                            wocVar = woc.COLLECTION_SDK_NOT_INSTALLED;
                        } else if (ch80Var.a()) {
                            wocVar = woc.COLLECTION_ENABLED;
                        } else {
                            wocVar = woc.COLLECTION_DISABLED;
                        }
                        ch80Var2 = (ch80) map2.get(ch80.a.a);
                        if (ch80Var2 == null) {
                            wocVar2 = woc.COLLECTION_SDK_NOT_INSTALLED;
                        } else if (ch80Var2.a()) {
                            wocVar2 = woc.COLLECTION_ENABLED;
                        } else {
                            wocVar2 = woc.COLLECTION_DISABLED;
                        }
                        fg80 fg80Var2 = new fg80(new rg80(str7, str8, i5, j2, new xoc(wocVar, wocVar2, hh80Var2.a()), str5, str6), gg80.a(yohVar2));
                        int i6 = mg80.g;
                        mg80Var.getClass();
                        mg80Var.d.a(fg80Var2);
                        Log.d("FirebaseSessions", "Successfully logged Session Start event.");
                    }
                }
                return y5bVar;
            }
            return Unit.a;
        }
    }

    public mg80(yoh yohVar, sph sphVar, hh80 hh80Var, dpg dpgVar, @is1 CoroutineContext coroutineContext) {
        yohVar.getClass();
        sphVar.getClass();
        hh80Var.getClass();
        dpgVar.getClass();
        coroutineContext.getClass();
        this.a = yohVar;
        this.b = sphVar;
        this.c = hh80Var;
        this.d = dpgVar;
        this.e = coroutineContext;
    }

    @Override // defpackage.lg80
    public final void a(eg80 eg80Var) {
        ej5.c(w5b.a(this.e), null, null, new a(eg80Var, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if (r7.b(r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.x1b r7) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg80.b(x1b):java.lang.Object");
    }
}
