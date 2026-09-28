package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.CreateEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl$createEvents$1", f = "InstantWinRepoImpl.kt", l = {464, 472, 481}, m = "invokeSuspend", v = 2)
public final class gko extends tje0 implements Function2<myh<? super CreateEvent>, v1b<? super Unit>, Object> {
    public boolean a;
    public boolean b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ fko e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gko(fko fkoVar, String str, Boolean bool, v1b<? super gko> v1bVar) {
        super(2, v1bVar);
        this.e = fkoVar;
        this.f = str;
        this.i = bool;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gko gkoVar = new gko(this.e, this.f, this.i, v1bVar);
        gkoVar.d = obj;
        return gkoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super CreateEvent> myhVar, v1b<? super Unit> v1bVar) {
        return ((gko) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (r0 == r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (r7.emit(r2, r13) == r8) goto L29;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Exception {
        /*
            r13 = this;
            java.lang.Object r0 = r13.d
            r7 = r0
            myh r7 = (defpackage.myh) r7
            y5b r8 = defpackage.y5b.a
            int r0 = r13.c
            r9 = 0
            r10 = 3
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 == r2) goto L2b
            if (r0 == r1) goto L20
            if (r0 != r10) goto L1a
            defpackage.uj50.b(r14)
            goto La9
        L1a:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r9
        L20:
            boolean r0 = r13.b
            boolean r1 = r13.a
            defpackage.uj50.b(r14)
            r4 = r0
            r0 = r14
            goto L8a
        L2b:
            boolean r0 = r13.b
            boolean r1 = r13.a
            defpackage.uj50.b(r14)
            r11 = r1
            r1 = r0
            r0 = r14
            goto L6a
        L36:
            defpackage.uj50.b(r14)
            fko r0 = r13.e
            uqm r3 = r0.a
            boolean r11 = r3.isLogin()
            java.lang.String r3 = "sr:sport:1"
            r4 = r1
            java.lang.String r1 = r13.f
            boolean r3 = r1.equals(r3)
            s8o r0 = r0.b
            java.lang.Boolean r5 = r13.i
            if (r11 == 0) goto L6d
            r12 = r5
            com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r5 = defpackage.fko.M(r1)
            r13.d = r7
            r13.a = r11
            r13.b = r3
            r13.c = r2
            r4 = r3
            r3 = 16
            r6 = r13
            r2 = r12
            java.lang.Object r0 = r0.g(r1, r2, r3, r4, r5, r6)
            r1 = r4
            if (r0 != r8) goto L6a
            goto La8
        L6a:
            bi50 r0 = (defpackage.bi50) r0
            goto L8e
        L6d:
            r2 = r3
            r3 = r1
            r1 = r2
            r2 = r5
            com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag r5 = defpackage.fko.M(r3)
            r13.d = r7
            r13.a = r11
            r13.b = r1
            r13.c = r4
            r4 = r1
            r1 = r3
            r3 = 16
            r6 = r13
            java.lang.Object r0 = r0.o(r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L89
            goto La8
        L89:
            r1 = r11
        L8a:
            bi50 r0 = (defpackage.bi50) r0
            r11 = r1
            r1 = r4
        L8e:
            okhttp3.Response r2 = r0.a
            boolean r2 = r2.getIsSuccessful()
            if (r2 == 0) goto Lac
            T r2 = r0.b
            if (r2 == 0) goto Lac
            r13.d = r9
            r13.a = r11
            r13.b = r1
            r13.c = r10
            java.lang.Object r0 = r7.emit(r2, r13)
            if (r0 != r8) goto La9
        La8:
            return r8
        La9:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        Lac:
            java.lang.Exception r1 = new java.lang.Exception
            okhttp3.Response r0 = r0.a
            java.lang.String r0 = r0.message()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gko.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
