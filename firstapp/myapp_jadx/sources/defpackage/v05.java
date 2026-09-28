package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.data.repository.BookingCodeRepositoryImpl$getFilteredBookingCodesFlow$1", f = "BookingCodeRepositoryImpl.kt", l = {104, 104}, m = "invokeSuspend", v = 2)
public final class v05 extends tje0 implements Function2<myh<? super List<? extends BookingCodeInfoDto>>, v1b<? super Unit>, Object> {
    public myh a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ BookingCodeFilterDto d;
    public final /* synthetic */ u05 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v05(BookingCodeFilterDto bookingCodeFilterDto, u05 u05Var, v1b<? super v05> v1bVar) {
        super(2, v1bVar);
        this.d = bookingCodeFilterDto;
        this.e = u05Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        v05 v05Var = new v05(this.d, this.e, v1bVar);
        v05Var.c = obj;
        return v05Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends BookingCodeInfoDto>> myhVar, v1b<? super Unit> v1bVar) {
        return ((v05) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        if (r1.emit(r3, r18) == r2) goto L15;
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
            if (r3 == 0) goto L29
            if (r3 == r5) goto L1d
            if (r3 != r4) goto L17
            defpackage.uj50.b(r19)
            goto L6d
        L17:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r6
        L1d:
            myh r1 = r0.a
            defpackage.uj50.b(r19)
            r3 = r19
            zi50 r3 = (defpackage.zi50) r3
            java.lang.Object r3 = r3.a
            goto L5d
        L29:
            defpackage.uj50.b(r19)
            com.sporty.android.core.model.bookingcode.BookingCodeFilterDto r7 = r0.d
            java.util.List r3 = r7.getTimeFilter()
            java.util.ArrayList r13 = defpackage.u05.n(r3)
            java.util.List r3 = r7.getTimeSegmentFilter()
            java.util.ArrayList r14 = defpackage.u05.n(r3)
            r16 = 159(0x9f, float:2.23E-43)
            r17 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            com.sporty.android.core.model.bookingcode.BookingCodeFilterDto r3 = com.sporty.android.core.model.bookingcode.BookingCodeFilterDto.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            u05 r7 = r0.e
            g3z r7 = r7.b
            r0.c = r6
            r0.a = r1
            r0.b = r5
            java.lang.Object r3 = r7.g(r3, r0)
            if (r3 != r2) goto L5d
            goto L6c
        L5d:
            defpackage.uj50.b(r3)
            r0.c = r6
            r0.a = r6
            r0.b = r4
            java.lang.Object r0 = r1.emit(r3, r0)
            if (r0 != r2) goto L6d
        L6c:
            return r2
        L6d:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v05.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
