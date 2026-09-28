package defpackage;

import com.sportygames.evenodd.components.RoundResult;
import com.sportygames.evenodd.remote.models.PlaceBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.evenodd.components.RoundResult$showWin$1", f = "RoundResult.kt", l = {55, 61}, m = "invokeSuspend", v = 1)
public final class uz50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ RoundResult b;
    public final /* synthetic */ PlaceBetResponse c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz50(v1b v1bVar, RoundResult roundResult, PlaceBetResponse placeBetResponse) {
        super(2, v1bVar);
        this.b = roundResult;
        this.c = placeBetResponse;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new uz50(v1bVar, this.b, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((uz50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        if (r7.b(r1, r2, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a1, code lost:
    
        if (r7.b(r1, r3, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a3, code lost:
    
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L14
            if (r1 != r2) goto Ld
            goto L14
        Ld:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L14:
            defpackage.uj50.b(r7)
            goto La4
        L19:
            defpackage.uj50.b(r7)
            com.sportygames.evenodd.components.RoundResult r7 = r6.b
            khg r1 = r7.getBinding()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.v
            r4 = 0
            r1.setVisibility(r4)
            com.sportygames.evenodd.remote.models.PlaceBetResponse r1 = r6.c
            java.lang.String r1 = r1.getHouseDrawDecision()
            android.content.Context r4 = r7.getContext()
            r5 = 2132021415(0x7f1410a7, float:1.968122E38)
            java.lang.String r4 = r4.getString(r5)
            boolean r1 = kotlin.text.c.l(r1, r4, r3)
            if (r1 == 0) goto L70
            khg r1 = r7.getBinding()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.B
            android.content.Context r2 = r7.getContext()
            java.lang.String r2 = r2.getString(r5)
            r2.getClass()
            r7.a(r1, r2)
            khg r1 = r7.getBinding()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.c
            android.content.Context r2 = r7.getContext()
            r4 = 2132020815(0x7f140e4f, float:1.9680004E38)
            java.lang.String r2 = r2.getString(r4)
            r2.getClass()
            r6.a = r3
            java.lang.Object r6 = r7.b(r1, r2, r6)
            if (r6 != r0) goto La4
            goto La3
        L70:
            khg r1 = r7.getBinding()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.B
            android.content.Context r3 = r7.getContext()
            r4 = 2132020136(0x7f140ba8, float:1.9678627E38)
            java.lang.String r3 = r3.getString(r4)
            r3.getClass()
            r7.a(r1, r3)
            khg r1 = r7.getBinding()
            androidx.constraintlayout.widget.ConstraintLayout r1 = r1.c
            android.content.Context r3 = r7.getContext()
            r4 = 2132020776(0x7f140e28, float:1.9679925E38)
            java.lang.String r3 = r3.getString(r4)
            r3.getClass()
            r6.a = r2
            java.lang.Object r6 = r7.b(r1, r3, r6)
            if (r6 != r0) goto La4
        La3:
            return r0
        La4:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
