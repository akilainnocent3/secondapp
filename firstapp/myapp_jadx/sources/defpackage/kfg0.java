package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.commons.tournament.compose.TournamentStatsUiKt$TournamentStatsUi$3$1", f = "TournamentStatsUi.kt", l = {137, 138}, m = "invokeSuspend", v = 1)
public final class kfg0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ zzr c;
    public final /* synthetic */ osw d;
    public final /* synthetic */ osw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfg0(zzr zzrVar, zzr zzrVar2, osw oswVar, osw oswVar2, v1b<? super kfg0> v1bVar) {
        super(2, v1bVar);
        this.b = zzrVar;
        this.c = zzrVar2;
        this.d = oswVar;
        this.e = oswVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kfg0(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kfg0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r6.c.k(0, 0, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r6.b.k(0, 0, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        return r0;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            osw r2 = r6.d
            r3 = 2
            osw r4 = r6.e
            r5 = 1
            if (r1 == 0) goto L1b
            if (r1 == r5) goto L10
            if (r1 != r3) goto L14
        L10:
            defpackage.uj50.b(r7)
            goto L4c
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L1b:
            defpackage.uj50.b(r7)
            int r7 = r2.D()
            int r1 = r4.D()
            if (r7 == r1) goto L53
            int r7 = r4.D()
            r1 = 0
            if (r7 == 0) goto L3f
            if (r7 == r5) goto L32
            goto L4c
        L32:
            r6.a = r3
            uv60 r7 = defpackage.zzr.x
            zzr r7 = r6.c
            java.lang.Object r6 = r7.k(r1, r1, r6)
            if (r6 != r0) goto L4c
            goto L4b
        L3f:
            r6.a = r5
            uv60 r7 = defpackage.zzr.x
            zzr r7 = r6.b
            java.lang.Object r6 = r7.k(r1, r1, r6)
            if (r6 != r0) goto L4c
        L4b:
            return r0
        L4c:
            int r6 = r4.D()
            r2.k(r6)
        L53:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfg0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
