package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {436, 438, 440, 447, 449, 452}, m = "invokeSuspend")
public final class g9f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public dq40 a;
    public dq40 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ h9f e;

    @c0d(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {443}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<Function1<? super v7f.b, ? extends Unit>, v1b<? super Unit>, Object> {
        public dq40 a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ dq40<v7f> d;
        public final /* synthetic */ h9f e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dq40<v7f> dq40Var, h9f h9fVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = dq40Var;
            this.e = h9fVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.d, this.e, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Function1<? super v7f.b, ? extends Unit> function1, v1b<? super Unit> v1bVar) {
            return ((a) create(function1, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002a  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004b -> B:24:0x004e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0051 -> B:26:0x0052). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) throws Throwable {
            Function1 function1;
            dq40<v7f> dq40Var;
            v7f v7fVar;
            T t;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                function1 = (Function1) this.c;
                dq40Var = this.d;
                v7fVar = dq40Var.a;
                if (!(v7fVar instanceof v7f.d) || (v7fVar instanceof v7f.a)) {
                    return Unit.a;
                }
                v7f.b bVar = v7fVar instanceof v7f.b ? (v7f.b) v7fVar : null;
                if (bVar != null) {
                    function1.invoke(bVar);
                }
                tb5 tb5Var = this.e.J;
                if (tb5Var != null) {
                    this.c = function1;
                    this.a = dq40Var;
                    this.b = 1;
                    obj = tb5Var.a(this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    t = 0;
                }
                dq40Var.a = t;
                dq40Var = this.d;
                v7fVar = dq40Var.a;
                if (v7fVar instanceof v7f.d) {
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq40Var = this.a;
            function1 = (Function1) this.c;
            uj50.b(obj);
            t = (v7f) obj;
            dq40Var.a = t;
            dq40Var = this.d;
            v7fVar = dq40Var.a;
            if (v7fVar instanceof v7f.d) {
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g9f(h9f h9fVar, v1b<? super g9f> v1bVar) {
        super(2, v1bVar);
        this.e = h9fVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        g9f g9fVar = new g9f(this.e, v1bVar);
        g9fVar.d = obj;
        return g9fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g9f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030 A[PHI: r1 r4
      0x0030: PHI (r1v11 dq40) = (r1v3 dq40), (r1v15 dq40) binds: [B:13:0x002d, B:36:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r4v6 v5b) = (r4v4 v5b), (r4v7 v5b) binds: [B:13:0x002d, B:36:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0054 A[PHI: r5
      0x0054: PHI (r5v7 v5b) = (r5v0 v5b), (r5v3 v5b), (r5v3 v5b), (r5v3 v5b), (r5v5 v5b), (r5v8 v5b) binds: [B:18:0x004c, B:45:0x00c3, B:47:0x00d0, B:41:0x00bc, B:30:0x0080, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1 A[Catch: CancellationException -> 0x00bf, TryCatch #0 {CancellationException -> 0x00bf, blocks: (B:38:0x00a9, B:40:0x00af, B:44:0x00c1, B:46:0x00c5), top: B:55:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5 A[Catch: CancellationException -> 0x00bf, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00bf, blocks: (B:38:0x00a9, B:40:0x00af, B:44:0x00c1, B:46:0x00c5), top: B:55:0x00a9 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0080 -> B:19:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00bc -> B:19:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c3 -> B:19:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d0 -> B:19:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00de -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g9f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
