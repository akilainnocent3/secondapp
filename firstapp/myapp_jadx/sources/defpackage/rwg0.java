package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", f = "InvalidationTracker.kt", l = {418, 425}, m = "invokeSuspend")
public final class rwg0 extends tje0 implements Function2<crg0, v1b<? super Set<? extends Integer>>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ twg0 c;

    @c0d(c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", f = "InvalidationTracker.kt", l = {426}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<sqg0<Set<? extends Integer>>, v1b<? super Set<? extends Integer>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ twg0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(twg0 twg0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = twg0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sqg0<Set<? extends Integer>> sqg0Var, v1b<? super Set<? extends Integer>> v1bVar) {
            return ((a) create(sqg0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            sqg0 sqg0Var = (sqg0) this.b;
            this.a = 1;
            Object objA = this.c.a(sqg0Var, this);
            return objA == y5bVar ? y5bVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwg0(twg0 twg0Var, v1b<? super rwg0> v1bVar) {
        super(2, v1bVar);
        this.c = twg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rwg0 rwg0Var = new rwg0(this.c, v1bVar);
        rwg0Var.b = obj;
        return rwg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(crg0 crg0Var, v1b<? super Set<? extends Integer>> v1bVar) {
        return ((rwg0) create(crg0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        if (r7 == r0) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r7)     // Catch: android.database.SQLException -> L54
            goto L51
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L17:
            java.lang.Object r1 = r6.b
            crg0 r1 = (defpackage.crg0) r1
            defpackage.uj50.b(r7)
            goto L32
        L1f:
            defpackage.uj50.b(r7)
            java.lang.Object r7 = r6.b
            r1 = r7
            crg0 r1 = (defpackage.crg0) r1
            r6.b = r1
            r6.a = r4
            java.lang.Boolean r7 = r1.b(r6)
            if (r7 != r0) goto L32
            goto L50
        L32:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L3d
            t3g r6 = defpackage.t3g.a
            return r6
        L3d:
            crg0$a r7 = crg0.a.b     // Catch: android.database.SQLException -> L54
            rwg0$a r4 = new rwg0$a     // Catch: android.database.SQLException -> L54
            twg0 r5 = r6.c     // Catch: android.database.SQLException -> L54
            r4.<init>(r5, r2)     // Catch: android.database.SQLException -> L54
            r6.b = r2     // Catch: android.database.SQLException -> L54
            r6.a = r3     // Catch: android.database.SQLException -> L54
            java.lang.Object r7 = r1.a(r7, r4, r6)     // Catch: android.database.SQLException -> L54
            if (r7 != r0) goto L51
        L50:
            return r0
        L51:
            java.util.Set r7 = (java.util.Set) r7     // Catch: android.database.SQLException -> L54
            return r7
        L54:
            t3g r6 = defpackage.t3g.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rwg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
