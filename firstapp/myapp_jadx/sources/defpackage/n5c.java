package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend")
public final class n5c extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ o5c b;

    @c0d(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, 77, 79, 81}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ c9p b;
        public final /* synthetic */ o5c c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c9p c9pVar, o5c o5cVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = c9pVar;
            this.c = o5cVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0060  */
        /* JADX WARN: Code duplicated, block: B:30:0x0061 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0019, B:33:0x0071, B:27:0x0058, B:30:0x0061, B:14:0x0026, B:15:0x002a, B:16:0x0032, B:23:0x0047, B:25:0x0052), top: B:37:0x000f }] */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        
            if (defpackage.i9p.c(r12, r11) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
        
            if (defpackage.hkd.b(500, r11) == r0) goto L32;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x006e -> B:33:0x0071). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r11.a
                r2 = 0
                r3 = 500(0x1f4, double:2.47E-321)
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 4
                r7 = 3
                r8 = 2
                r9 = 1
                o5c r10 = r11.c
                if (r1 == 0) goto L37
                if (r1 == r9) goto L33
                if (r1 == r8) goto L2a
                if (r1 == r7) goto L26
                if (r1 != r6) goto L1f
                defpackage.uj50.b(r12)     // Catch: java.lang.Throwable -> L1d
                goto L71
            L1d:
                r11 = move-exception
                goto L79
            L1f:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r11)
                r11 = 0
                return r11
            L26:
                defpackage.uj50.b(r12)     // Catch: java.lang.Throwable -> L1d
                goto L61
            L2a:
                defpackage.uj50.b(r12)     // Catch: java.lang.Throwable -> L1d
                zrp r11 = new zrp     // Catch: java.lang.Throwable -> L1d
                r11.<init>()     // Catch: java.lang.Throwable -> L1d
                throw r11     // Catch: java.lang.Throwable -> L1d
            L33:
                defpackage.uj50.b(r12)
                goto L47
            L37:
                defpackage.uj50.b(r12)
                c9p r12 = r11.b
                if (r12 == 0) goto L47
                r11.a = r9
                java.lang.Object r12 = defpackage.i9p.c(r12, r11)
                if (r12 != r0) goto L47
                goto L70
            L47:
                isw r12 = r10.c     // Catch: java.lang.Throwable -> L1d
                t5a0 r12 = (defpackage.t5a0) r12     // Catch: java.lang.Throwable -> L1d
                r12.A(r5)     // Catch: java.lang.Throwable -> L1d
                boolean r12 = r10.a     // Catch: java.lang.Throwable -> L1d
                if (r12 != 0) goto L58
                r11.a = r8     // Catch: java.lang.Throwable -> L1d
                defpackage.hkd.a(r11)     // Catch: java.lang.Throwable -> L1d
                return r0
            L58:
                r11.a = r7     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r12 = defpackage.hkd.b(r3, r11)     // Catch: java.lang.Throwable -> L1d
                if (r12 != r0) goto L61
                goto L70
            L61:
                isw r12 = r10.c     // Catch: java.lang.Throwable -> L1d
                t5a0 r12 = (defpackage.t5a0) r12     // Catch: java.lang.Throwable -> L1d
                r12.A(r2)     // Catch: java.lang.Throwable -> L1d
                r11.a = r6     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r12 = defpackage.hkd.b(r3, r11)     // Catch: java.lang.Throwable -> L1d
                if (r12 != r0) goto L71
            L70:
                return r0
            L71:
                isw r12 = r10.c     // Catch: java.lang.Throwable -> L1d
                t5a0 r12 = (defpackage.t5a0) r12     // Catch: java.lang.Throwable -> L1d
                r12.A(r5)     // Catch: java.lang.Throwable -> L1d
                goto L58
            L79:
                isw r12 = r10.c
                t5a0 r12 = (defpackage.t5a0) r12
                r12.A(r2)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: n5c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5c(o5c o5cVar, v1b<? super n5c> v1bVar) {
        super(2, v1bVar);
        this.b = o5cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        n5c n5cVar = new n5c(this.b, v1bVar);
        n5cVar.a = obj;
        return n5cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((n5c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        v5b v5bVar = (v5b) this.a;
        o5c o5cVar = this.b;
        c9p andSet = o5cVar.b.getAndSet(null);
        AtomicReference<c9p> atomicReference = o5cVar.b;
        jvd0 jvd0VarC = ej5.c(v5bVar, null, null, new a(andSet, o5cVar, null), 3);
        while (!atomicReference.compareAndSet(null, jvd0VarC)) {
            if (atomicReference.get() != null) {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }
}
