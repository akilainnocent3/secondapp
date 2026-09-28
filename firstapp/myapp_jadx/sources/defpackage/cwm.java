package defpackage;

import com.sporty.android.core.model.timecontrol.SelfExclusion;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.international.login.INTLoginViewModel$updateSelfExclusion$1", f = "INTLoginViewModel.kt", l = {60, WebSocketProtocol.B0_FLAG_RSV1, 67}, m = "invokeSuspend", v = 2)
public final class cwm extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public dwm a;
    public SelfExclusion b;
    public int c;
    public final /* synthetic */ dwm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwm(dwm dwmVar, v1b<? super cwm> v1bVar) {
        super(2, v1bVar);
        this.d = dwmVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cwm(this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cwm) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r1.setSelfExclusionType(r10, r9) == r0) goto L26;
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
            y5b r0 = defpackage.y5b.a
            int r1 = r9.c
            dwm r2 = r9.d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L30
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1e
            com.sporty.android.core.model.timecontrol.SelfExclusion r0 = r9.b
            java.lang.String r0 = (java.lang.String) r0
            dwm r9 = r9.a
            lk50 r9 = (defpackage.lk50) r9
            defpackage.uj50.b(r10)
            goto L7c
        L1e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r6
        L24:
            com.sporty.android.core.model.timecontrol.SelfExclusion r1 = r9.b
            dwm r2 = r9.a
            defpackage.uj50.b(r10)
            goto L67
        L2c:
            defpackage.uj50.b(r10)
            goto L3e
        L30:
            defpackage.uj50.b(r10)
            t47 r10 = r2.b
            r9.c = r5
            java.lang.Object r10 = r10.a(r9)
            if (r10 != r0) goto L3e
            goto L7b
        L3e:
            lk50 r10 = (defpackage.lk50) r10
            boolean r1 = r10 instanceof lk50.c
            if (r1 == 0) goto L7c
            lk50$c r10 = (lk50.c) r10
            T r10 = r10.a
            com.sporty.android.core.model.timecontrol.SelfExclusionResponse r10 = (com.sporty.android.core.model.timecontrol.SelfExclusionResponse) r10
            com.sporty.android.core.model.timecontrol.SelfExclusion r1 = r10.getSelfExclusion()
            java.lang.Long r10 = r1.getEndDate()
            if (r10 == 0) goto L67
            long r7 = r10.longValue()
            mgb0 r10 = r2.e
            r9.a = r2
            r9.b = r1
            r9.c = r4
            java.lang.Object r10 = r10.setSelfExclusionUTCTimeStamp(r7, r9)
            if (r10 != r0) goto L67
            goto L7b
        L67:
            java.lang.String r10 = r1.getSelfExclusionType()
            if (r10 == 0) goto L7c
            mgb0 r1 = r2.e
            r9.a = r6
            r9.b = r6
            r9.c = r3
            java.lang.Object r9 = r1.setSelfExclusionType(r10, r9)
            if (r9 != r0) goto L7c
        L7b:
            return r0
        L7c:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwm.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
