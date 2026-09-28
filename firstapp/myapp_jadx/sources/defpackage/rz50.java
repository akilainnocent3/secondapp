package defpackage;

import com.sportygames.spindabottle.components.RoundResult;
import com.sportygames.spindabottle.remote.models.PlaceBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spindabottle.components.RoundResult$showLost$1", f = "RoundResult.kt", l = {141, 142, 143}, m = "invokeSuspend", v = 1)
public final class rz50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ PlaceBetResponse b;
    public final /* synthetic */ RoundResult c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz50(PlaceBetResponse placeBetResponse, RoundResult roundResult, v1b<? super rz50> v1bVar) {
        super(2, v1bVar);
        this.b = placeBetResponse;
        this.c = roundResult;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rz50(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rz50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if (r8 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:
    
        if (r8 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (r8 == r0) goto L26;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            r2 = 3
            r3 = 2
            r4 = 1
            com.sportygames.spindabottle.components.RoundResult r5 = r7.c
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L16
            defpackage.uj50.b(r8)
            goto Lad
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            r7 = 0
            return r7
        L1d:
            defpackage.uj50.b(r8)
            goto L8d
        L21:
            defpackage.uj50.b(r8)
            goto L5c
        L25:
            defpackage.uj50.b(r8)
            com.sportygames.spindabottle.remote.models.PlaceBetResponse r8 = r7.b
            java.lang.String r8 = r8.getHouseDraw()
            android.content.Context r1 = r5.getContext()
            r6 = 2132024775(0x7f141dc7, float:1.9688036E38)
            java.lang.String r1 = r1.getString(r6)
            boolean r1 = kotlin.jvm.internal.Intrinsics.g(r8, r1)
            if (r1 == 0) goto L5f
            s4u<java.lang.String, android.graphics.Bitmap> r8 = defpackage.r9n.a
            android.content.Context r8 = r5.getContext()
            android.content.Context r1 = r5.getContext()
            r2 = 2132020801(0x7f140e41, float:1.9679975E38)
            java.lang.String r1 = r1.getString(r2)
            r1.getClass()
            r7.a = r4
            java.lang.Object r8 = defpackage.r9n.c(r7, r8, r1)
            if (r8 != r0) goto L5c
            goto Lac
        L5c:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            goto Laf
        L5f:
            android.content.Context r1 = r5.getContext()
            r4 = 2132020025(0x7f140b39, float:1.9678401E38)
            java.lang.String r1 = r1.getString(r4)
            boolean r8 = kotlin.jvm.internal.Intrinsics.g(r8, r1)
            if (r8 == 0) goto L90
            s4u<java.lang.String, android.graphics.Bitmap> r8 = defpackage.r9n.a
            android.content.Context r8 = r5.getContext()
            android.content.Context r1 = r5.getContext()
            r2 = 2132020798(0x7f140e3e, float:1.967997E38)
            java.lang.String r1 = r1.getString(r2)
            r1.getClass()
            r7.a = r3
            java.lang.Object r8 = defpackage.r9n.c(r7, r8, r1)
            if (r8 != r0) goto L8d
            goto Lac
        L8d:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            goto Laf
        L90:
            s4u<java.lang.String, android.graphics.Bitmap> r8 = defpackage.r9n.a
            android.content.Context r8 = r5.getContext()
            android.content.Context r1 = r5.getContext()
            r3 = 2132020809(0x7f140e49, float:1.9679992E38)
            java.lang.String r1 = r1.getString(r3)
            r1.getClass()
            r7.a = r2
            java.lang.Object r8 = defpackage.r9n.c(r7, r8, r1)
            if (r8 != r0) goto Lad
        Lac:
            return r0
        Lad:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
        Laf:
            android.graphics.drawable.BitmapDrawable r7 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r0 = r5.getResources()
            r7.<init>(r0, r8)
            bcb0 r8 = r5.getBinding()
            androidx.constraintlayout.widget.ConstraintLayout r8 = r8.c
            r8.setBackground(r7)
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
