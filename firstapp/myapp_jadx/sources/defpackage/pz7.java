package defpackage;

import com.sporty.android.core.model.bookingcode.BookingCodeFilterDto;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.android.data.LiabilitiesResponse;
import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$getLiabilitiesAndBookingCodeData$1", f = "CodeHubViewmodel.kt", l = {352, 353}, m = "invokeSuspend", v = 2)
public final class pz7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public mz7 a;
    public String b;
    public v4k c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ String f;
    public final /* synthetic */ mz7 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz7(mz7 mz7Var, v1b v1bVar, String str) {
        super(2, v1bVar);
        this.f = str;
        this.i = mz7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pz7 pz7Var = new pz7(this.i, v1bVar, this.f);
        pz7Var.e = obj;
        return pz7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pz7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Throwable thA;
        String str;
        mz7 mz7Var;
        v4k v4kVar;
        mz7 mz7Var2;
        mz7 mz7Var3 = this.i;
        ku90<jox<m9s>> ku90Var = mz7Var3.K;
        y5b y5bVar = y5b.a;
        int i = this.d;
        try {
            if (i == 0) {
                uj50.b(obj);
                String str2 = this.f;
                if (str2.length() == 0) {
                    mz7Var3.w.g("share code incorrect", "", new Exception("share code empty "), null);
                    return Unit.a;
                }
                BookingCodeFilterDto bookingCodeFilterDto = mz7.h0;
                ku90Var.a(jox.e.a);
                zi50.a aVar = zi50.b;
                x4k x4kVar = mz7Var3.d;
                this.e = null;
                this.a = mz7Var3;
                this.b = str2;
                this.d = 1;
                Object objA = x4kVar.a(str2, this);
                if (objA != y5bVar) {
                    str = str2;
                    obj = objA;
                    mz7Var = mz7Var3;
                }
                return y5bVar;
            }
            if (i == 1) {
                str = this.b;
                mz7Var = this.a;
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v4kVar = this.c;
                str = this.b;
                mz7Var2 = this.a;
                uj50.b(obj);
            }
            String str3 = str;
            e08 e08Var = (e08) obj;
            BookingData bookingData = v4kVar.a;
            boolean z = e08Var.c;
            BookingCodeFilterDto bookingCodeFilterDto2 = mz7.h0;
            mz7Var2.A1(bookingData, z);
            mz7Var2.K.a(new jox.a(new m9s(new LiabilitiesResponse(str3, e08Var.c, 0.0d, 4, null), Boolean.valueOf(e08Var.d), v4kVar.a)));
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
            thA = zi50.a(bVar);
            if (thA != null) {
                mz7Var3.U.m(new jox.c(thA));
                w950.a("CodeHubViewmodel", "getLiabilitiesAndBookingCodeData", thA, null);
                ku90Var.a(new jox.c(thA));
            }
            return Unit.a;
            v4k v4kVar2 = (v4k) obj;
            li7 li7Var = mz7Var.e;
            List<Selection> list = v4kVar2.b;
            this.e = null;
            this.a = mz7Var;
            this.b = str;
            this.c = v4kVar2;
            this.d = 2;
            Object objA2 = li7Var.a(list, this);
            if (objA2 != y5bVar) {
                v4kVar = v4kVar2;
                obj = objA2;
                mz7Var2 = mz7Var;
                String str4 = str;
                e08 e08Var2 = (e08) obj;
                BookingData bookingData2 = v4kVar.a;
                boolean z2 = e08Var2.c;
                BookingCodeFilterDto bookingCodeFilterDto3 = mz7.h0;
                mz7Var2.A1(bookingData2, z2);
                mz7Var2.K.a(new jox.a(new m9s(new LiabilitiesResponse(str4, e08Var2.c, 0.0d, 4, null), Boolean.valueOf(e08Var2.d), v4kVar.a)));
                bVar = Unit.a;
                zi50.a aVar3 = zi50.b;
                thA = zi50.a(bVar);
                if (thA != null) {
                    mz7Var3.U.m(new jox.c(thA));
                    w950.a("CodeHubViewmodel", "getLiabilitiesAndBookingCodeData", thA, null);
                    ku90Var.a(new jox.c(thA));
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
