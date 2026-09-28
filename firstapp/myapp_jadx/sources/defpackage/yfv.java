package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.providers.MeScreenRowsProvider$provideRows$$inlined$flatMapLatest$1", f = "MeScreenRowsProvider.kt", l = {192, 189}, m = "invokeSuspend", v = 2)
public final class yfv extends tje0 implements gaj<myh<? super bxg0<? extends Boolean, ? extends Boolean, ? extends List<? extends aev>>>, AccountInfo, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ qfv d;
    public myh e;
    public lyh f;
    public rfv i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfv(v1b v1bVar, qfv qfvVar) {
        super(3, v1bVar);
        this.d = qfvVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super bxg0<? extends Boolean, ? extends Boolean, ? extends List<? extends aev>>> myhVar, AccountInfo accountInfo, v1b<? super Unit> v1bVar) {
        yfv yfvVar = new yfv(v1bVar, this.d);
        yfvVar.b = myhVar;
        yfvVar.c = accountInfo;
        return yfvVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (defpackage.kzh.c(r5, r10, r9) == r0) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r9.a
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L22
            if (r1 == r3) goto L18
            if (r1 != r2) goto L12
            defpackage.uj50.b(r10)
            goto L7f
        L12:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            return r4
        L18:
            rfv r1 = r9.i
            lyh r3 = r9.f
            myh r5 = r9.e
            defpackage.uj50.b(r10)
            goto L5d
        L22:
            defpackage.uj50.b(r10)
            myh r5 = r9.b
            java.lang.Object r10 = r9.c
            com.sporty.android.core.model.account.AccountInfo r10 = (com.sporty.android.core.model.account.AccountInfo) r10
            qfv r1 = r9.d
            fhb0 r6 = r1.d
            wwd0 r6 = r6.m
            rfv r7 = new rfv
            r7.<init>(r6)
            ib90 r6 = r1.g
            h990 r8 = defpackage.h990.REVIEW
            lyh r6 = r6.a(r8)
            if (r10 != 0) goto L48
            m2g r10 = defpackage.m2g.a
            gzh r1 = new gzh
            r1.<init>(r10)
            goto L62
        L48:
            r9.b = r4
            r9.c = r4
            r9.e = r5
            r9.f = r6
            r9.i = r7
            r9.a = r3
            java.lang.Object r10 = r1.c(r9)
            if (r10 != r0) goto L5b
            goto L7e
        L5b:
            r3 = r6
            r1 = r7
        L5d:
            lyh r10 = (defpackage.lyh) r10
            r7 = r1
            r6 = r3
            r1 = r10
        L62:
            agv r10 = new agv
            r3 = 4
            r10.<init>(r3, r4)
            k1i r10 = defpackage.r1i.a(r7, r6, r1, r10)
            r9.b = r4
            r9.c = r4
            r9.e = r4
            r9.f = r4
            r9.i = r4
            r9.a = r2
            java.lang.Object r9 = defpackage.kzh.c(r5, r10, r9)
            if (r9 != r0) goto L7f
        L7e:
            return r0
        L7f:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
