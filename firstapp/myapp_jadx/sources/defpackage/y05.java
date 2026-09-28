package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.data.repository.BookingCodeRepositoryImpl$getTournamentFilteredBookingCodesFlow$1", f = "BookingCodeRepositoryImpl.kt", l = {120, 120}, m = "invokeSuspend", v = 2)
public final class y05 extends tje0 implements Function2<myh<? super List<? extends BookingCodeInfoDto>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ u05 d;
    public final /* synthetic */ BookingCodeFilterDto e;
    public final /* synthetic */ List<String> f;
    public final /* synthetic */ List<String> i;
    public final /* synthetic */ String v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y05(u05 u05Var, BookingCodeFilterDto bookingCodeFilterDto, List<String> list, List<String> list2, String str, int i, v1b<? super y05> v1bVar) {
        super(2, v1bVar);
        this.d = u05Var;
        this.e = bookingCodeFilterDto;
        this.f = list;
        this.i = list2;
        this.v = str;
        this.w = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        y05 y05Var = new y05(this.d, this.e, this.f, this.i, this.v, this.w, v1bVar);
        y05Var.c = obj;
        return y05Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends BookingCodeInfoDto>> myhVar, v1b<? super Unit> v1bVar) {
        return ((y05) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        if (r1.emit(r3, r18) == r2) goto L26;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = r0.c
            myh r1 = (defpackage.myh) r1
            y5b r2 = defpackage.y5b.a
            int r3 = r0.b
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L2b
            if (r3 == r5) goto L1e
            if (r3 != r4) goto L18
            defpackage.uj50.b(r19)
            goto Lb1
        L18:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r6
        L1e:
            myh r1 = r0.a
            defpackage.uj50.b(r19)
            r3 = r19
            zi50 r3 = (defpackage.zi50) r3
            java.lang.Object r3 = r3.a
            goto La1
        L2b:
            defpackage.uj50.b(r19)
            java.util.List<java.lang.Integer> r3 = defpackage.u05.k
            com.sporty.android.core.model.bookingcode.BookingCodeFilterDto r3 = r0.e
            java.util.List r8 = r3.getFoldsFilter()
            java.util.List r9 = r3.getOddsFilter()
            java.util.List<java.lang.Integer> r10 = defpackage.u05.k
            com.sporty.android.core.model.bookingcode.BookingCodeFilterDto$SortBy r11 = r3.getSortBy()
            com.sporty.android.core.model.bookingcode.BookingCodeFilterDto$SortBy r7 = r3.getSortBy()
            java.lang.String r7 = r7.getOrder()
            boolean r12 = kotlin.text.StringsKt.U(r7)
            if (r12 == 0) goto L50
            java.lang.String r7 = "desc"
        L50:
            r14 = r7
            r15 = 3
            r16 = 0
            r12 = 0
            r13 = 0
            com.sporty.android.core.model.bookingcode.BookingCodeFilterDto$SortBy r11 = com.sporty.android.core.model.bookingcode.BookingCodeFilterDto.SortBy.copy$default(r11, r12, r13, r14, r15, r16)
            java.util.List r7 = r3.getTimeFilter()
            java.util.ArrayList r12 = defpackage.u05.n(r7)
            java.util.List r3 = r3.getTimeSegmentFilter()
            java.util.ArrayList r13 = defpackage.u05.n(r3)
            java.lang.String r3 = r0.v
            if (r3 == 0) goto L81
            java.lang.CharSequence r3 = kotlin.text.StringsKt.t0(r3)
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L81
            int r7 = r3.length()
            if (r7 <= 0) goto L81
            r16 = r3
            goto L83
        L81:
            r16 = r6
        L83:
            com.sporty.android.core.model.bookingcode.BookingCodeTournamentFilterDto r7 = new com.sporty.android.core.model.bookingcode.BookingCodeTournamentFilterDto
            java.util.List<java.lang.String> r14 = r0.i
            java.util.List<java.lang.String> r15 = r0.f
            int r3 = r0.w
            r17 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            u05 r3 = r0.d
            g3z r3 = r3.b
            r0.c = r6
            r0.a = r1
            r0.b = r5
            java.lang.Object r3 = r3.f(r7, r0)
            if (r3 != r2) goto La1
            goto Lb0
        La1:
            defpackage.uj50.b(r3)
            r0.c = r6
            r0.a = r6
            r0.b = r4
            java.lang.Object r0 = r1.emit(r3, r0)
            if (r0 != r2) goto Lb1
        Lb0:
            return r2
        Lb1:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y05.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
