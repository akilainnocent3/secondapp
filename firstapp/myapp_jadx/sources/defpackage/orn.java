package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.ticketdetail.handler.InstantFootballTicketDetailHandlerImpl$init$1", f = "InstantFootballTicketDetailHandlerImpl.kt", l = {69}, m = "invokeSuspend", v = 2)
public final class orn extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ztw a;
    public mrn b;
    public Object c;
    public int d;
    public final /* synthetic */ mrn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public orn(mrn mrnVar, v1b<? super orn> v1bVar) {
        super(2, v1bVar);
        this.e = mrnVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new orn(this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((orn) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0038 -> B:12:0x003b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x003a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.d
            r2 = 1
            if (r1 == 0) goto L1a
            if (r1 != r2) goto L13
            java.lang.Object r1 = r5.c
            mrn r3 = r5.b
            ztw r4 = r5.a
            defpackage.uj50.b(r6)
            goto L3b
        L13:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L1a:
            defpackage.uj50.b(r6)
            mrn r6 = r5.e
            wwd0 r1 = r6.i
            r3 = r6
            r4 = r1
        L23:
            java.lang.Object r1 = r4.getValue()
            r6 = r1
            hug0 r6 = (defpackage.hug0) r6
            iug0 r6 = r3.f
            r5.a = r4
            r5.b = r3
            r5.c = r1
            r5.d = r2
            hug0 r6 = r6.a()
            if (r6 != r0) goto L3b
            return r0
        L3b:
            hug0 r6 = (defpackage.hug0) r6
            boolean r6 = r4.g(r1, r6)
            if (r6 == 0) goto L23
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.orn.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
