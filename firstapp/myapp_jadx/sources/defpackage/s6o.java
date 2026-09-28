package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Ticket;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantVirtualShowOffRepoImpl$getTicketDetail$1", f = "InstantVirtualShowOffRepoImpl.kt", l = {18, 17}, m = "invokeSuspend", v = 2)
public final class s6o extends tje0 implements Function2<myh<? super Ticket>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ t6o d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6o(t6o t6oVar, String str, String str2, v1b<? super s6o> v1bVar) {
        super(2, v1bVar);
        this.d = t6oVar;
        this.e = str;
        this.f = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s6o s6oVar = new s6o(this.d, this.e, this.f, v1bVar);
        s6oVar.c = obj;
        return s6oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Ticket> myhVar, v1b<? super Unit> v1bVar) {
        return ((s6o) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            defpackage.uj50.b(r8)
            goto L53
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L1b:
            myh r0 = r7.a
            defpackage.uj50.b(r8)
            goto L46
        L21:
            defpackage.uj50.b(r8)
            t6o r8 = r7.d
            s8o r8 = r8.a
            java.lang.String r2 = r7.f
            if (r2 == 0) goto L31
            java.lang.Integer r2 = defpackage.vcj.a(r2)
            goto L32
        L31:
            r2 = r5
        L32:
            com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r6 = new com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag
            r6.<init>(r2)
            r7.c = r5
            r7.a = r0
            r7.b = r4
            java.lang.String r2 = r7.e
            java.lang.Object r8 = r8.q(r2, r6, r7)
            if (r8 != r1) goto L46
            goto L52
        L46:
            r7.c = r5
            r7.a = r5
            r7.b = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L53
        L52:
            return r1
        L53:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
