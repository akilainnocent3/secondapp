package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.virtuallobby.handler.VirtualLobbyGetStartedStatusHandlerImpl$init$3", f = "VirtualLobbyGetStartedStatusHandlerImpl.kt", l = {55}, m = "invokeSuspend", v = 2)
public final class pji0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ztw a;
    public rji0 b;
    public Object c;
    public int d;
    public final /* synthetic */ rji0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pji0(rji0 rji0Var, v1b<? super pji0> v1bVar) {
        super(2, v1bVar);
        this.e = rji0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pji0(this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pji0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:12:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x003e
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.d
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L17
            java.lang.Object r1 = r6.c
            rji0 r3 = r6.b
            ztw r4 = r6.a
            defpackage.uj50.b(r7)
            zi50 r7 = (defpackage.zi50) r7
            java.lang.Object r7 = r7.a
            goto L3f
        L17:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L1e:
            defpackage.uj50.b(r7)
            rji0 r7 = r6.e
            wwd0 r1 = r7.d
            r3 = r7
            r4 = r1
        L27:
            java.lang.Object r1 = r4.getValue()
            r7 = r1
            zi50 r7 = (defpackage.zi50) r7
            jji0 r7 = r3.a
            r6.a = r4
            r6.b = r3
            r6.c = r1
            r6.d = r2
            java.io.Serializable r7 = r7.a(r6)
            if (r7 != r0) goto L3f
            return r0
        L3f:
            zi50 r5 = new zi50
            r5.<init>(r7)
            boolean r7 = r4.g(r1, r5)
            if (r7 == 0) goto L27
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pji0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
