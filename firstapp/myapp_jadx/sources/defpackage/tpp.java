package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.event.handler.KickOffHandlerImpl$kickOff$2", f = "KickOffHandlerImpl.kt", l = {71, 74, 79}, m = "invokeSuspend", v = 2)
public final class tpp extends tje0 implements Function2<hqc, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ vpp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpp(vpp vppVar, v1b<? super tpp> v1bVar) {
        super(2, v1bVar);
        this.c = vppVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        tpp tppVar = new tpp(this.c, v1bVar);
        tppVar.b = obj;
        return tppVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(hqc hqcVar, v1b<? super Unit> v1bVar) {
        return ((tpp) create(hqcVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r1.a.emit(r0, r9) == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (r1.a.emit(r10, r9) == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r1.a.emit(r10, r9) == r3) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            vpp r0 = r9.c
            ku90<q3v> r1 = r0.e
            java.lang.Object r2 = r9.b
            hqc r2 = (defpackage.hqc) r2
            y5b r3 = defpackage.y5b.a
            int r4 = r9.a
            r5 = 2
            r6 = 1
            r7 = 3
            r8 = 0
            if (r4 == 0) goto L28
            if (r4 == r6) goto L24
            if (r4 == r5) goto L1f
            if (r4 != r7) goto L19
            goto L1f
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r8
        L1f:
            defpackage.uj50.b(r10)
            goto L8d
        L24:
            defpackage.uj50.b(r10)
            goto L5b
        L28:
            defpackage.uj50.b(r10)
            ssw<hqc> r10 = defpackage.yy50.a
            r10.m(r2)
            boolean r10 = r2 instanceof defpackage.nqc
            if (r10 == 0) goto L70
            r10 = r2
            nqc r10 = (defpackage.nqc) r10
            T r10 = r10.a
            boolean r4 = r10 instanceof com.sportybet.android.instantwin.newtork.model.response.Round
            if (r4 == 0) goto L40
            com.sportybet.android.instantwin.newtork.model.response.Round r10 = (com.sportybet.android.instantwin.newtork.model.response.Round) r10
            goto L41
        L40:
            r10 = r8
        L41:
            if (r10 == 0) goto L46
            java.lang.String r10 = r10.roundId
            goto L47
        L46:
            r10 = r8
        L47:
            if (r10 == 0) goto L5e
            q3v$b r0 = new q3v$b
            r0.<init>(r10)
            r9.b = r8
            r9.a = r6
            b390 r10 = r1.a
            java.lang.Object r9 = r10.emit(r0, r9)
            if (r9 != r3) goto L5b
            goto L8c
        L5b:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        L5e:
            q3v$a r10 = new q3v$a
            r10.<init>(r8, r8)
            r9.b = r2
            r9.a = r5
            b390 r1 = r1.a
            java.lang.Object r9 = r1.emit(r10, r9)
            if (r9 != r3) goto L8d
            goto L8c
        L70:
            boolean r10 = r2 instanceof defpackage.kqc
            if (r10 == 0) goto L8d
            q3v$a r10 = new q3v$a
            r4 = r2
            kqc r4 = (defpackage.kqc) r4
            java.lang.String r5 = r4.a
            java.lang.String r4 = r4.b
            r10.<init>(r5, r4)
            r9.b = r2
            r9.a = r7
            b390 r1 = r1.a
            java.lang.Object r9 = r1.emit(r10, r9)
            if (r9 != r3) goto L8d
        L8c:
            return r3
        L8d:
            boolean r9 = r2 instanceof defpackage.lqc
            if (r9 != 0) goto L98
            wwd0 r9 = r0.c
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r9.k(r8, r10)
        L98:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tpp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
