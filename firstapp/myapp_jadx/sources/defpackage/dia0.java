package defpackage;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.SocialShareUseCase$addOrEditSocialShareCode$onCodeLiability$1", f = "SocialShareUseCase.kt", l = {152, 153}, m = "invokeSuspend", v = 2)
public final class dia0 extends tje0 implements Function2<myh<? super a8a0>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ BookingData c;
    public final /* synthetic */ oia0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dia0(BookingData bookingData, oia0 oia0Var, v1b<? super dia0> v1bVar) {
        super(2, v1bVar);
        this.c = bookingData;
        this.d = oia0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dia0 dia0Var = new dia0(this.c, this.d, v1bVar);
        dia0Var.b = obj;
        return dia0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super a8a0> myhVar, v1b<? super Unit> v1bVar) {
        return ((dia0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r0.emit(r2, r7) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            com.sportybet.android.bookingcode.data.dto.BookingData r3 = r7.c
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L21
            if (r2 == r5) goto L1d
            if (r2 != r4) goto L17
            defpackage.uj50.b(r8)
            goto L51
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r6
        L1d:
            defpackage.uj50.b(r8)
            goto L3b
        L21:
            defpackage.uj50.b(r8)
            java.util.List<com.sportybet.plugin.realsports.data.Event> r8 = r3.outcomes
            java.lang.String r2 = r3.shareCode
            java.util.List r8 = defpackage.i15.a(r2, r8)
            oia0 r2 = r7.d
            li7 r2 = r2.d
            r7.b = r0
            r7.a = r5
            java.lang.Object r8 = r2.a(r8, r7)
            if (r8 != r1) goto L3b
            goto L50
        L3b:
            e08 r8 = (defpackage.e08) r8
            a8a0 r2 = new a8a0
            boolean r5 = r8.c
            boolean r8 = r8.d
            r2.<init>(r3, r5, r8)
            r7.b = r6
            r7.a = r4
            java.lang.Object r7 = r0.emit(r2, r7)
            if (r7 != r1) goto L51
        L50:
            return r1
        L51:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dia0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
