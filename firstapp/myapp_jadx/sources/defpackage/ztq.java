package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.mission.data.LNMissionRepository$participateMission$1", f = "LNMissionRepository.kt", l = {35, DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class ztq extends tje0 implements Function2<myh<? super Unit>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ auq d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ztq(auq auqVar, int i, v1b<? super ztq> v1bVar) {
        super(2, v1bVar);
        this.d = auqVar;
        this.e = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ztq ztqVar = new ztq(this.d, this.e, v1bVar);
        ztqVar.c = obj;
        return ztqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super Unit> myhVar, v1b<? super Unit> v1bVar) {
        return ((ztq) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws com.sporty.android.common.network.data.SprThrowable {
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
            goto L54
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L1b:
            myh r0 = r7.a
            defpackage.uj50.b(r8)
            goto L40
        L21:
            defpackage.uj50.b(r8)
            auq r8 = r7.d
            c5u r8 = r8.a
            com.sportybet.feature.luckynumber.rewardcenter.mission.data.data.LNParticipateMissionRequestDTO r2 = new com.sportybet.feature.luckynumber.rewardcenter.mission.data.data.LNParticipateMissionRequestDTO
            int r6 = r7.e
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r2.<init>(r6)
            r7.c = r5
            r7.a = r0
            r7.b = r4
            java.lang.Object r8 = r8.k(r2, r7)
            if (r8 != r1) goto L40
            goto L53
        L40:
            com.sporty.android.common.network.data.BaseResponse r8 = (com.sporty.android.common.network.data.BaseResponse) r8
            defpackage.n52.c(r8)
            kotlin.Unit r8 = kotlin.Unit.a
            r7.c = r5
            r7.a = r5
            r7.b = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L54
        L53:
            return r1
        L54:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
