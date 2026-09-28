package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.compose.lobbyv2.components.LobbyV2TopWinsRowComponentKt$LobbyV2TopWinsRowComponent$1$1$observer$1$1", f = "LobbyV2TopWinsRowComponent.kt", l = {82, 83}, m = "invokeSuspend", v = 1)
public final class dbt extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zzr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbt(zzr zzrVar, v1b<? super dbt> v1bVar) {
        super(2, v1bVar);
        this.b = zzrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dbt(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dbt) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r5.b.k(0, 0, r5) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto L10
            defpackage.uj50.b(r6)
            goto L35
        L10:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L17:
            defpackage.uj50.b(r6)
            goto L29
        L1b:
            defpackage.uj50.b(r6)
            r5.a = r3
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r6 = defpackage.hkd.b(r3, r5)
            if (r6 != r0) goto L29
            goto L34
        L29:
            r5.a = r2
            zzr r6 = r5.b
            r1 = 0
            java.lang.Object r5 = r6.k(r1, r1, r5)
            if (r5 != r0) goto L35
        L34:
            return r0
        L35:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbt.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
