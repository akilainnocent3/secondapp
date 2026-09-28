package defpackage;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubViewmodel$fetchPreviewImage$1", f = "CodeHubViewmodel.kt", l = {334}, m = "invokeSuspend", v = 2)
public final class oz7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public mz7 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ mz7 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz7(mz7 mz7Var, v1b v1bVar, String str) {
        super(2, v1bVar);
        this.d = mz7Var;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        oz7 oz7Var = new oz7(this.d, v1bVar, this.e);
        oz7Var.c = obj;
        return oz7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((oz7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        mz7 mz7Var = this.d;
        vu90<jox<BookingData>> vu90Var = mz7Var.Y;
        y5b y5bVar = y5b.a;
        int i = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                vu90Var.m(jox.e.a);
                String str = this.e;
                zi50.a aVar = zi50.b;
                x4k x4kVar = mz7Var.d;
                this.c = null;
                this.a = mz7Var;
                this.b = 1;
                obj = x4kVar.a(str, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mz7Var = this.a;
                uj50.b(obj);
            }
            mz7Var.Y.m(new jox.a(((v4k) obj).a));
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            vu90Var.m(new jox.c(thA));
        }
        return Unit.a;
    }
}
