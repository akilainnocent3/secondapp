package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.InstantWinRepoImpl$getSettleRound$1", f = "InstantWinRepoImpl.kt", l = {156, 166}, m = "invokeSuspend", v = 2)
public final class xko extends tje0 implements Function2<myh<? super Round>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ fko c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ InstantWinBetSource f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xko(fko fkoVar, String str, String str2, InstantWinBetSource instantWinBetSource, v1b v1bVar) {
        super(2, v1bVar);
        this.c = fkoVar;
        this.d = str;
        this.e = str2;
        this.f = instantWinBetSource;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xko xkoVar = new xko(this.c, this.d, this.e, this.f, v1bVar);
        xkoVar.b = obj;
        return xkoVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Round> myhVar, v1b<? super Unit> v1bVar) {
        return ((xko) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L23;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
        /*
            r12 = this;
            java.lang.Object r0 = r12.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r12.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L20
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            defpackage.uj50.b(r13)
            goto L63
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r3
        L1b:
            defpackage.uj50.b(r13)
            r11 = r12
            goto L4a
        L20:
            defpackage.uj50.b(r13)
            fko r13 = r12.c
            s8o r6 = r13.b
            java.lang.String r7 = r12.d
            if (r7 != 0) goto L2e
            java.lang.String r13 = ""
            goto L2f
        L2e:
            r13 = r7
        L2f:
            java.lang.Integer r13 = defpackage.vcj.a(r13)
            com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking$SettleRound r10 = new com.sportybet.android.instantwin.newtork.model.tracking.InstantWinApiTracking$SettleRound
            com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource r2 = r12.f
            r10.<init>(r2, r13)
            r12.b = r0
            r12.a = r5
            java.lang.String r8 = r12.e
            r9 = 16
            r11 = r12
            java.lang.Object r13 = r6.B(r7, r8, r9, r10, r11)
            if (r13 != r1) goto L4a
            goto L62
        L4a:
            bi50 r13 = (defpackage.bi50) r13
            okhttp3.Response r12 = r13.a
            boolean r12 = r12.getIsSuccessful()
            if (r12 == 0) goto L66
            T r12 = r13.b
            if (r12 == 0) goto L66
            r11.b = r3
            r11.a = r4
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        L66:
            okhttp3.ResponseBody r12 = r13.c
            if (r12 == 0) goto L70
            java.lang.String r12 = r12.string()
            if (r12 != 0) goto L72
        L70:
            java.lang.String r12 = "Unknown error"
        L72:
            com.appsflyer.internal.y.a(r12)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xko.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
