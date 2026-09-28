package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$getSelectionsCode$1", f = "BetSlipViewModel.kt", l = {1852, 1855, 1862, 1869}, m = "invokeSuspend", v = 2)
public final class h73 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ q73 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ zz80 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h73(q73 q73Var, int i, zz80 zz80Var, v1b v1bVar) {
        super(2, v1bVar);
        this.d = q73Var;
        this.e = i;
        this.f = zz80Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        h73 h73Var = new h73(this.d, this.e, this.f, v1bVar);
        h73Var.c = obj;
        return h73Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((h73) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[PHI: r2
      0x0087: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v4 java.lang.Object), (r2v12 java.lang.Object) binds: [B:29:0x0071, B:31:0x0084, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
    
        if (kotlin.Unit.a == r3) goto L38;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            q73 r0 = r10.d
            wwd0 r1 = r0.S0
            java.lang.Object r2 = r10.c
            v5b r2 = (defpackage.v5b) r2
            y5b r3 = defpackage.y5b.a
            int r4 = r10.b
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L3a
            if (r4 == r8) goto L36
            if (r4 == r7) goto L2c
            if (r4 == r6) goto L26
            if (r4 != r5) goto L20
            defpackage.uj50.b(r11)
            goto Lac
        L20:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            return r9
        L26:
            java.lang.Object r2 = r10.a
            defpackage.uj50.b(r11)
            goto L87
        L2c:
            java.lang.Object r2 = r10.a
            v5b r2 = (defpackage.v5b) r2
            defpackage.uj50.b(r11)     // Catch: java.lang.Throwable -> L34
            goto L62
        L34:
            r11 = move-exception
            goto L68
        L36:
            defpackage.uj50.b(r11)
            goto L4b
        L3a:
            defpackage.uj50.b(r11)
            tzs$b r11 = tzs.b.a
            r10.c = r2
            r10.b = r8
            r1.setValue(r11)
            kotlin.Unit r11 = kotlin.Unit.a
            if (r11 != r3) goto L4b
            goto Lab
        L4b:
            int r11 = r10.e
            zz80 r2 = r10.f
            zi50$a r4 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L34
            pdk r4 = r0.b0     // Catch: java.lang.Throwable -> L34
            r10.c = r9     // Catch: java.lang.Throwable -> L34
            r10.a = r9     // Catch: java.lang.Throwable -> L34
            r10.b = r7     // Catch: java.lang.Throwable -> L34
            s05 r4 = r4.a     // Catch: java.lang.Throwable -> L34
            java.lang.Object r11 = r4.f(r8, r11, r2, r10)     // Catch: java.lang.Throwable -> L34
            if (r11 != r3) goto L62
            goto Lab
        L62:
            com.sportybet.android.bookingcode.data.dto.BookingData r11 = (com.sportybet.android.bookingcode.data.dto.BookingData) r11     // Catch: java.lang.Throwable -> L34
            zi50$a r2 = defpackage.zi50.b     // Catch: java.lang.Throwable -> L34
            r2 = r11
            goto L6f
        L68:
            zi50$a r2 = defpackage.zi50.b
            zi50$b r2 = new zi50$b
            r2.<init>(r11)
        L6f:
            boolean r11 = r2 instanceof zi50.b
            if (r11 != 0) goto L87
            r11 = r2
            com.sportybet.android.bookingcode.data.dto.BookingData r11 = (com.sportybet.android.bookingcode.data.dto.BookingData) r11
            ku90<com.sportybet.android.bookingcode.data.dto.BookingData> r4 = r0.U0
            r10.c = r9
            r10.a = r2
            r10.b = r6
            b390 r4 = r4.a
            java.lang.Object r11 = r4.emit(r11, r10)
            if (r11 != r3) goto L87
            goto Lab
        L87:
            java.lang.Throwable r11 = defpackage.zi50.a(r2)
            if (r11 == 0) goto L9c
            ku90<com.sporty.android.common.uievent.a> r11 = r0.k1
            com.sporty.android.common_ui.uitext.StringUiText r0 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r0 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r2 = 2132018160(0x7f1403f0, float:1.9674619E38)
            r0.<init>(r2)
            com.sporty.android.common.uievent.b.j(r11, r0)
        L9c:
            tzs$a r11 = tzs.a.a
            r10.c = r9
            r10.a = r9
            r10.b = r5
            r1.setValue(r11)
            kotlin.Unit r10 = kotlin.Unit.a
            if (r10 != r3) goto Lac
        Lab:
            return r3
        Lac:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h73.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
