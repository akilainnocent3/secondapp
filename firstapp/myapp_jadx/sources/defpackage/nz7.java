package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$checkLiability$1", f = "CodeHubViewmodel.kt", l = {261, 262}, m = "invokeSuspend", v = 2)
public final class nz7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public mz7 a;
    public BookingCodeInfoDto b;
    public wae c;
    public v4k d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ BookingCodeInfoDto i;
    public final /* synthetic */ mz7 v;
    public final /* synthetic */ wae w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nz7(BookingCodeInfoDto bookingCodeInfoDto, mz7 mz7Var, wae waeVar, v1b<? super nz7> v1bVar) {
        super(2, v1bVar);
        this.i = bookingCodeInfoDto;
        this.v = mz7Var;
        this.w = waeVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nz7 nz7Var = new nz7(this.i, this.v, this.w, v1bVar);
        nz7Var.f = obj;
        return nz7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nz7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a8 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:7:0x001d, B:29:0x00a0, B:31:0x00a8, B:33:0x00d9, B:32:0x00bf, B:15:0x0037, B:25:0x0083, B:22:0x006a), top: B:41:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:7:0x001d, B:29:0x00a0, B:31:0x00a8, B:33:0x00d9, B:32:0x00bf, B:15:0x0037, B:25:0x0083, B:22:0x006a), top: B:41:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Throwable thA;
        BookingCodeInfoDto bookingCodeInfoDto;
        wae waeVar;
        Object objA;
        Object objA2;
        mz7 mz7Var;
        v4k v4kVar;
        wae waeVar2;
        BookingCodeInfoDto bookingCodeInfoDto2;
        e08 e08Var;
        mz7 mz7Var2 = this.v;
        vu90<jox<mg6>> vu90Var = mz7Var2.U;
        y5b y5bVar = y5b.a;
        int i = this.e;
        try {
            if (i == 0) {
                uj50.b(obj);
                bookingCodeInfoDto = this.i;
                int length = bookingCodeInfoDto.getBookingCode().length();
                waeVar = this.w;
                if (length == 0) {
                    mz7Var2.w.g("share code incorrect", waeVar.name(), new Exception("share code empty "), null);
                    return Unit.a;
                }
                vu90Var.m(jox.e.a);
                zi50.a aVar = zi50.b;
                x4k x4kVar = mz7Var2.d;
                String bookingCode = bookingCodeInfoDto.getBookingCode();
                this.f = null;
                this.a = mz7Var2;
                this.b = bookingCodeInfoDto;
                this.c = waeVar;
                this.e = 1;
                objA = x4kVar.a(bookingCode, this);
                if (objA == y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                wae waeVar3 = this.c;
                bookingCodeInfoDto = this.b;
                mz7 mz7Var3 = this.a;
                uj50.b(obj);
                waeVar = waeVar3;
                mz7Var2 = mz7Var3;
                objA = obj;
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v4k v4kVar2 = this.d;
                wae waeVar4 = this.c;
                bookingCodeInfoDto = this.b;
                mz7 mz7Var4 = this.a;
                uj50.b(obj);
                mz7Var = mz7Var4;
                v4kVar = v4kVar2;
                waeVar2 = waeVar4;
                objA2 = obj;
            }
            bookingCodeInfoDto2 = bookingCodeInfoDto;
            e08Var = (e08) objA2;
            if (e08Var.c) {
                wae waeVar5 = wae.A0;
                mz7Var.getClass();
                bookingCodeInfoDto2.getClass();
                bVar = ej5.c(o8i0.d(mz7Var), null, null, new rz7(bookingCodeInfoDto2, mz7Var, waeVar5, v4kVar, e08Var, null), 3);
            } else {
                BookingCodeFilterDto bookingCodeFilterDto = mz7.h0;
                mz7Var.getClass();
                bookingCodeInfoDto2.getClass();
                waeVar2.getClass();
                bVar = ej5.c(o8i0.d(mz7Var), null, null, new rz7(bookingCodeInfoDto2, mz7Var, waeVar2, v4kVar, null, null), 3);
            }
            zi50.a aVar2 = zi50.b;
            thA = zi50.a(bVar);
            if (thA != null) {
                vu90Var.m(new jox.c(thA));
            }
            return Unit.a;
            v4k v4kVar3 = (v4k) objA;
            li7 li7Var = mz7Var2.e;
            List<Selection> list = v4kVar3.b;
            this.f = null;
            this.a = mz7Var2;
            this.b = bookingCodeInfoDto;
            this.c = waeVar;
            this.d = v4kVar3;
            this.e = 2;
            objA2 = li7Var.a(list, this);
            if (objA2 != y5bVar) {
                mz7Var = mz7Var2;
                v4kVar = v4kVar3;
                waeVar2 = waeVar;
                bookingCodeInfoDto2 = bookingCodeInfoDto;
                e08Var = (e08) objA2;
                if (e08Var.c) {
                    wae waeVar6 = wae.A0;
                    mz7Var.getClass();
                    bookingCodeInfoDto2.getClass();
                    bVar = ej5.c(o8i0.d(mz7Var), null, null, new rz7(bookingCodeInfoDto2, mz7Var, waeVar6, v4kVar, e08Var, null), 3);
                } else {
                    BookingCodeFilterDto bookingCodeFilterDto2 = mz7.h0;
                    mz7Var.getClass();
                    bookingCodeInfoDto2.getClass();
                    waeVar2.getClass();
                    bVar = ej5.c(o8i0.d(mz7Var), null, null, new rz7(bookingCodeInfoDto2, mz7Var, waeVar2, v4kVar, null, null), 3);
                }
                zi50.a aVar3 = zi50.b;
                thA = zi50.a(bVar);
                if (thA != null) {
                    vu90Var.m(new jox.c(thA));
                }
                return Unit.a;
            }
            return y5bVar;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th);
        }
    }
}
