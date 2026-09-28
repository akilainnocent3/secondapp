package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.domain.manager.ack.AckManager$observeIncomingAcknowledgements$2", f = "AckManager.kt", l = {20}, m = "invokeSuspend", v = 1)
public final class eb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fb b;

    public static final class a<T> implements myh {
        public final /* synthetic */ fb a;

        public a(fb fbVar) {
            this.a = fbVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object objA;
            nye nyeVar = (nye) obj;
            boolean z = nyeVar.a;
            int i = nyeVar.c;
            fb fbVar = this.a;
            if (z && fbVar.f == i) {
                fbVar.f = -1;
                Object objA2 = fbVar.e.a(v1bVar);
                return objA2 == y5b.a ? objA2 : Unit.a;
            }
            if (i == fbVar.f && nyeVar.b == fbVar.b.f()) {
                fbVar.f = -1;
                objA = fbVar.c.a(v1bVar);
                if (objA != y5b.a) {
                    objA = Unit.a;
                }
            } else {
                objA = Unit.a;
            }
            return objA == y5b.a ? objA : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(fb fbVar, v1b<? super eb> v1bVar) {
        super(2, v1bVar);
        this.b = fbVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new eb(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((eb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to eb for r5v2 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            return r2
        L10:
            defpackage.uj50.b(r6)
            goto L2f
        L14:
            defpackage.uj50.b(r6)
            fb r6 = r5.b
            lzm r1 = r6.a
            t340 r1 = r1.k()
            eb$a r4 = new eb$a
            r4.<init>(r6)
            r5.a = r3
            a390<T> r6 = r1.a
            java.lang.Object r5 = r6.collect(r4, r5)
            if (r5 != r0) goto L2f
            return r0
        L2f:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
