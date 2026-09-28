package defpackage;

import com.sportybet.android.social.data.remote.entity.RewardData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.CreatorCreditViewModel$claimedReward$2", f = "CreatorCreditViewModel.kt", l = {WebSocketProtocol.B0_FLAG_RSV1, 68, 72}, m = "invokeSuspend", v = 2)
public final class d1c extends tje0 implements Function2<lk50<? extends RewardData>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e1c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1c(v1b v1bVar, e1c e1cVar) {
        super(2, v1bVar);
        this.c = e1cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        d1c d1cVar = new d1c(v1bVar, this.c);
        d1cVar.b = obj;
        return d1cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends RewardData> lk50Var, v1b<? super Unit> v1bVar) {
        return ((d1c) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r8.emit(r2, r7) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        if (r8.emit(r2, r7) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r8.emit(r0, r7) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            lk50 r0 = (defpackage.lk50) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 3
            r4 = 1
            r5 = 2
            r6 = 0
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1b
            if (r2 == r5) goto L1b
            if (r2 != r3) goto L15
            goto L1b
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r6
        L1b:
            defpackage.uj50.b(r8)
            goto L71
        L1f:
            defpackage.uj50.b(r8)
            boolean r8 = r0 instanceof lk50.c
            e1c r2 = r7.c
            if (r8 == 0) goto L40
            b390 r8 = r2.i
            tp7$c r2 = new tp7$c
            lk50$c r0 = (lk50.c) r0
            T r0 = r0.a
            com.sportybet.android.social.data.remote.entity.RewardData r0 = (com.sportybet.android.social.data.remote.entity.RewardData) r0
            r2.<init>(r0)
            r7.b = r6
            r7.a = r4
            java.lang.Object r7 = r8.emit(r2, r7)
            if (r7 != r1) goto L71
            goto L70
        L40:
            boolean r8 = r0 instanceof lk50.a
            if (r8 == 0) goto L5a
            b390 r8 = r2.i
            tp7$a r2 = new tp7$a
            lk50$a r0 = (lk50.a) r0
            java.lang.Throwable r0 = r0.a
            r2.<init>(r5, r0)
            r7.b = r6
            r7.a = r5
            java.lang.Object r7 = r8.emit(r2, r7)
            if (r7 != r1) goto L71
            goto L70
        L5a:
            lk50$b r8 = lk50.b.a
            boolean r8 = kotlin.jvm.internal.Intrinsics.g(r0, r8)
            if (r8 == 0) goto L74
            b390 r8 = r2.i
            tp7$b r0 = tp7.b.a
            r7.b = r6
            r7.a = r3
            java.lang.Object r7 = r8.emit(r0, r7)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L74:
            defpackage.uhc.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d1c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
