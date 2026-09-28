package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1", f = "InvalidationTracker.kt", l = {HttpStatusCodesKt.HTTP_TEMP_REDIRECT, 313}, m = "invokeSuspend")
public final class xwg0 extends tje0 implements Function2<crg0, v1b<? super Boolean>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ hfy.a[] c;
    public final /* synthetic */ twg0 d;

    @c0d(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1", f = "InvalidationTracker.kt", l = {317, 318}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<sqg0<Unit>, v1b<? super Unit>, Object> {
        public hfy.a[] a;
        public twg0 b;
        public crg0 c;
        public int d;
        public int e;
        public int f;
        public int i;
        public final /* synthetic */ hfy.a[] v;
        public final /* synthetic */ twg0 w;
        public final /* synthetic */ crg0 y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hfy.a[] aVarArr, twg0 twg0Var, crg0 crg0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.v = aVarArr;
            this.w = twg0Var;
            this.y = crg0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.v, this.w, this.y, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(sqg0<Unit> sqg0Var, v1b<? super Unit> v1bVar) {
            return ((a) create(sqg0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0033  */
        /* JADX WARN: Code duplicated, block: B:25:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:26:0x0073). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r11.i
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto Ld
                if (r1 != r3) goto L1d
            Ld:
                int r1 = r11.f
                int r5 = r11.e
                int r6 = r11.d
                crg0 r7 = r11.c
                twg0 r8 = r11.b
                hfy$a[] r9 = r11.a
                defpackage.uj50.b(r12)
                goto L57
            L1d:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r11)
                return r2
            L23:
                defpackage.uj50.b(r12)
                hfy$a[] r12 = r11.v
                int r1 = r12.length
                r5 = 0
                twg0 r6 = r11.w
                crg0 r7 = r11.y
                r9 = r12
                r12 = r5
                r8 = r6
            L31:
                if (r5 >= r1) goto L75
                r6 = r9[r5]
                int r10 = r12 + 1
                int r6 = r6.ordinal()
                if (r6 == 0) goto L72
                if (r6 == r4) goto L5d
                if (r6 != r3) goto L59
                r11.a = r9
                r11.b = r8
                r11.c = r7
                r11.d = r10
                r11.e = r5
                r11.f = r1
                r11.i = r3
                java.lang.Object r12 = r8.f(r7, r12, r11)
                if (r12 != r0) goto L56
                goto L71
            L56:
                r6 = r10
            L57:
                r12 = r6
                goto L73
            L59:
                defpackage.uhc.a()
                return r2
            L5d:
                r11.a = r9
                r11.b = r8
                r11.c = r7
                r11.d = r10
                r11.e = r5
                r11.f = r1
                r11.i = r4
                java.lang.Object r12 = r8.e(r7, r12, r11)
                if (r12 != r0) goto L56
            L71:
                return r0
            L72:
                r12 = r10
            L73:
                int r5 = r5 + r4
                goto L31
            L75:
                kotlin.Unit r11 = kotlin.Unit.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: xwg0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwg0(hfy.a[] aVarArr, twg0 twg0Var, v1b<? super xwg0> v1bVar) {
        super(2, v1bVar);
        this.c = aVarArr;
        this.d = twg0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xwg0 xwg0Var = new xwg0(this.c, this.d, v1bVar);
        xwg0Var.b = obj;
        return xwg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(crg0 crg0Var, v1b<? super Boolean> v1bVar) {
        return ((xwg0) create(crg0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r1.a(r8, r4, r7) == r0) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            defpackage.uj50.b(r8)
            goto L53
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L17:
            java.lang.Object r1 = r7.b
            crg0 r1 = (defpackage.crg0) r1
            defpackage.uj50.b(r8)
            goto L32
        L1f:
            defpackage.uj50.b(r8)
            java.lang.Object r8 = r7.b
            r1 = r8
            crg0 r1 = (defpackage.crg0) r1
            r7.b = r1
            r7.a = r4
            java.lang.Boolean r8 = r1.b(r7)
            if (r8 != r0) goto L32
            goto L52
        L32:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L3d
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L3d:
            crg0$a r8 = crg0.a.b
            xwg0$a r4 = new xwg0$a
            hfy$a[] r5 = r7.c
            twg0 r6 = r7.d
            r4.<init>(r5, r6, r1, r2)
            r7.b = r2
            r7.a = r3
            java.lang.Object r7 = r1.a(r8, r4, r7)
            if (r7 != r0) goto L53
        L52:
            return r0
        L53:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
