package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeInfoDto;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.bookingcode.data.dto.Ticket;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$loadBookCodeInfo$1", f = "CodeHubViewmodel.kt", l = {299}, m = "invokeSuspend", v = 2)
public final class rz7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public mz7 a;
    public BookingCodeInfoDto b;
    public wae c;
    public e08 d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ BookingCodeInfoDto i;
    public final /* synthetic */ mz7 v;
    public final /* synthetic */ wae w;
    public final /* synthetic */ v4k y;
    public final /* synthetic */ e08 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz7(BookingCodeInfoDto bookingCodeInfoDto, mz7 mz7Var, wae waeVar, v4k v4kVar, e08 e08Var, v1b<? super rz7> v1bVar) {
        super(2, v1bVar);
        this.i = bookingCodeInfoDto;
        this.v = mz7Var;
        this.w = waeVar;
        this.y = v4kVar;
        this.z = e08Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rz7 rz7Var = new rz7(this.i, this.v, this.w, this.y, this.z, v1bVar);
        rz7Var.f = obj;
        return rz7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rz7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0084 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:6:0x001c, B:23:0x007a, B:24:0x007e, B:26:0x0084, B:27:0x008d, B:29:0x00a7, B:31:0x00ae, B:33:0x00b2, B:36:0x00be, B:37:0x00c0, B:16:0x0053, B:19:0x0060), top: B:45:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:6:0x001c, B:23:0x007a, B:24:0x007e, B:26:0x0084, B:27:0x008d, B:29:0x00a7, B:31:0x00ae, B:33:0x00b2, B:36:0x00be, B:37:0x00c0, B:16:0x0053, B:19:0x0060), top: B:45:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b2 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:6:0x001c, B:23:0x007a, B:24:0x007e, B:26:0x0084, B:27:0x008d, B:29:0x00a7, B:31:0x00ae, B:33:0x00b2, B:36:0x00be, B:37:0x00c0, B:16:0x0053, B:19:0x0060), top: B:45:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00be A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:6:0x001c, B:23:0x007a, B:24:0x007e, B:26:0x0084, B:27:0x008d, B:29:0x00a7, B:31:0x00ae, B:33:0x00b2, B:36:0x00be, B:37:0x00c0, B:16:0x0053, B:19:0x0060), top: B:45:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e5  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Throwable thA;
        BookingCodeInfoDto bookingCodeInfoDto;
        wae waeVar;
        v4k v4kVar;
        e08 e08Var;
        Object objA;
        wae waeVar2;
        BookingCodeInfoDto bookingCodeInfoDto2;
        Integer source;
        int iIntValue;
        mz7 mz7Var = this.v;
        vu90<jox<mg6>> vu90Var = mz7Var.U;
        y5b y5bVar = y5b.a;
        int i = this.e;
        try {
            if (i == 0) {
                uj50.b(obj);
                bookingCodeInfoDto = this.i;
                int length = bookingCodeInfoDto.getBookingCode().length();
                waeVar = this.w;
                if (length == 0) {
                    mz7Var.w.g("share code incorrect", waeVar.name(), new Exception("share code empty "), null);
                    return Unit.a;
                }
                zi50.a aVar = zi50.b;
                vu90Var.m(jox.e.a);
                v4kVar = this.y;
                e08Var = this.z;
                if (v4kVar == null) {
                    x4k x4kVar = mz7Var.d;
                    String bookingCode = bookingCodeInfoDto.getBookingCode();
                    this.f = null;
                    this.a = mz7Var;
                    this.b = bookingCodeInfoDto;
                    this.c = waeVar;
                    this.d = e08Var;
                    this.e = 1;
                    objA = x4kVar.a(bookingCode, this);
                    if (objA == y5bVar) {
                        return y5bVar;
                    }
                    waeVar2 = waeVar;
                }
                e08 e08Var2 = e08Var;
                bookingCodeInfoDto2 = bookingCodeInfoDto;
                if (waeVar == wae.BET_SLIP) {
                    mz7Var.i.e(bookingCodeInfoDto2.getBookingCode());
                }
                BookingData bookingData = v4kVar.a;
                List<Event> list = bookingData.outcomes;
                Integer num = new Integer(10000);
                String bookingCode2 = bookingCodeInfoDto2.getBookingCode();
                String str = bookingData.shareURL;
                source = bookingCodeInfoDto2.getSource();
                if (source != null) {
                    iIntValue = source.intValue();
                } else {
                    iIntValue = 0;
                }
                Ticket ticket = bookingData.ticket;
                mz7Var.U.m(new jox.a(new mg6(waeVar, bookingCodeInfoDto2, list, num, bookingCode2, str, iIntValue, ticket != null ? new Integer(ticket.getOrderType()) : null, e08Var2 != null ? e08Var2.d : false, 128)));
                bVar = Unit.a;
                zi50.a aVar2 = zi50.b;
                thA = zi50.a(bVar);
                if (thA != null) {
                    vu90Var.m(new jox.c(thA));
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e08 e08Var3 = this.d;
            waeVar2 = this.c;
            bookingCodeInfoDto = this.b;
            mz7 mz7Var2 = this.a;
            uj50.b(obj);
            e08Var = e08Var3;
            mz7Var = mz7Var2;
            objA = obj;
            v4kVar = (v4k) objA;
            waeVar = waeVar2;
            e08 e08Var4 = e08Var;
            bookingCodeInfoDto2 = bookingCodeInfoDto;
            if (waeVar == wae.BET_SLIP) {
                mz7Var.i.e(bookingCodeInfoDto2.getBookingCode());
            }
            BookingData bookingData2 = v4kVar.a;
            List<Event> list2 = bookingData2.outcomes;
            Integer num2 = new Integer(10000);
            String bookingCode3 = bookingCodeInfoDto2.getBookingCode();
            String str2 = bookingData2.shareURL;
            source = bookingCodeInfoDto2.getSource();
            if (source != null) {
                iIntValue = source.intValue();
            } else {
                iIntValue = 0;
            }
            Ticket ticket2 = bookingData2.ticket;
            mz7Var.U.m(new jox.a(new mg6(waeVar, bookingCodeInfoDto2, list2, num2, bookingCode3, str2, iIntValue, ticket2 != null ? new Integer(ticket2.getOrderType()) : null, e08Var4 != null ? e08Var4.d : false, 128)));
            bVar = Unit.a;
            zi50.a aVar3 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th);
        }
        thA = zi50.a(bVar);
        if (thA != null) {
            vu90Var.m(new jox.c(thA));
        }
        return Unit.a;
    }
}
