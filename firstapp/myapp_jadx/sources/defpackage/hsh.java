package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class hsh {
    public final yoh a;
    public final hh80 b;

    @c0d(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {51, 55}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ eh80 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(eh80 eh80Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = eh80Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return hsh.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
        
            if (r1.b(r7) == r2) goto L25;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                hsh r0 = defpackage.hsh.this
                hh80 r1 = r0.b
                y5b r2 = defpackage.y5b.a
                int r3 = r7.a
                java.lang.String r4 = "FirebaseSessions"
                r5 = 2
                r6 = 1
                if (r3 == 0) goto L21
                if (r3 == r6) goto L1d
                if (r3 != r5) goto L16
                defpackage.uj50.b(r8)
                goto L64
            L16:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L1d:
                defpackage.uj50.b(r8)
                goto L2f
            L21:
                defpackage.uj50.b(r8)
                ssh r8 = defpackage.ssh.a
                r7.a = r6
                java.lang.Object r8 = r8.b(r7)
                if (r8 != r2) goto L2f
                goto L63
            L2f:
                java.util.Map r8 = (java.util.Map) r8
                java.util.Collection r8 = r8.values()
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                boolean r3 = r8 instanceof java.util.Collection
                if (r3 == 0) goto L45
                r3 = r8
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L45
                goto L98
            L45:
                java.util.Iterator r8 = r8.iterator()
            L49:
                boolean r3 = r8.hasNext()
                if (r3 == 0) goto L98
                java.lang.Object r3 = r8.next()
                ch80 r3 = (defpackage.ch80) r3
                boolean r3 = r3.a()
                if (r3 == 0) goto L49
                r7.a = r5
                java.lang.Object r7 = r1.b(r7)
                if (r7 != r2) goto L64
            L63:
                return r2
            L64:
                zl80 r7 = r1.a
                java.lang.Boolean r7 = r7.b()
                if (r7 == 0) goto L71
            L6c:
                boolean r6 = r7.booleanValue()
                goto L7a
            L71:
                zl80 r7 = r1.b
                java.lang.Boolean r7 = r7.b()
                if (r7 == 0) goto L7a
                goto L6c
            L7a:
                if (r6 != 0) goto L86
                java.lang.String r7 = "Sessions SDK disabled. Not listening to lifecycle events."
                int r7 = android.util.Log.d(r4, r7)
                defpackage.s75.a(r7)
                goto La1
            L86:
                yoh r7 = r0.a
                gsh r8 = new gsh
                r8.<init>()
                r7.a()
                java.util.concurrent.CopyOnWriteArrayList r7 = r7.j
                r7.add(r8)
                kotlin.Unit r7 = kotlin.Unit.a
                goto La1
            L98:
                java.lang.String r7 = "No Sessions subscribers. Not listening to lifecycle events."
                int r7 = android.util.Log.d(r4, r7)
                defpackage.s75.a(r7)
            La1:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: hsh.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public hsh(yoh yohVar, hh80 hh80Var, @is1 CoroutineContext coroutineContext, eh80 eh80Var) {
        yohVar.getClass();
        hh80Var.getClass();
        coroutineContext.getClass();
        eh80Var.getClass();
        this.a = yohVar;
        this.b = hh80Var;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.1.");
        yohVar.a();
        Context applicationContext = yohVar.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(eh80Var);
            ej5.c(w5b.a(coroutineContext), null, null, new a(eh80Var, null), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
