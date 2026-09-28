package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class kdh0<T> implements myh<T> {
    public final CoroutineContext a;
    public final Object b;
    public final a c;

    @c0d(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<T, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ myh<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(myh<? super T> myhVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = myhVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, v1b<? super Unit> v1bVar) {
            return ((a) create(obj, v1bVar)).invokeSuspend(Unit.a);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to kdh0$a for r3v5 'this'  v1b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            /*
                r3 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r3.a
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                defpackage.uj50.b(r4)
                goto L25
            Ld:
                r3 = 0
                java.lang.String r3 = coil3.compose.internal.CBvK.lobGSRIlnSGJY.bHRMFPXMd
                defpackage.ib5.a(r3)
                r3 = 0
                return r3
            L15:
                defpackage.uj50.b(r4)
                java.lang.Object r4 = r3.b
                r3.a = r2
                myh<T> r1 = r3.c
                java.lang.Object r3 = r1.emit(r4, r3)
                if (r3 != r0) goto L25
                return r0
            L25:
                kotlin.Unit r3 = kotlin.Unit.a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kdh0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public kdh0(myh<? super T> myhVar, CoroutineContext coroutineContext) {
        this.a = coroutineContext;
        this.b = uof0.b(coroutineContext);
        this.c = new a(myhVar, null);
    }

    @Override // defpackage.myh
    public final Object emit(T t, v1b<? super Unit> v1bVar) {
        Object objA = ly60.a(this.a, t, this.b, this.c, v1bVar);
        return objA == y5b.a ? objA : Unit.a;
    }
}
