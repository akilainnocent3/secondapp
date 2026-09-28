package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.component.vault.BonusVaultDialogViewModel$getEligibleGamesForCampaign$1", f = "BonusVaultDialogViewModel.kt", l = {29, 30}, m = "invokeSuspend", v = 1)
public final class ct4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ et4 b;
    public final /* synthetic */ List<String> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct4(et4 et4Var, List<String> list, v1b<? super ct4> v1bVar) {
        super(2, v1bVar);
        this.b = et4Var;
        this.c = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ct4(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ct4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (kotlin.Unit.a == r0) goto L15;
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
            et4 r2 = r5.b
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r3) goto L12
            defpackage.uj50.b(r6)
            goto L3b
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            r5 = 0
            return r5
        L19:
            defpackage.uj50.b(r6)
            goto L2d
        L1d:
            defpackage.uj50.b(r6)
            vrm r6 = r2.a
            r5.a = r4
            java.util.List<java.lang.String> r1 = r5.c
            java.lang.Object r6 = r6.b(r1, r5)
            if (r6 != r0) goto L2d
            goto L3a
        L2d:
            java.util.List r6 = (java.util.List) r6
            wwd0 r1 = r2.b
            r5.a = r3
            r1.setValue(r6)
            kotlin.Unit r5 = kotlin.Unit.a
            if (r5 != r0) goto L3b
        L3a:
            return r0
        L3b:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
