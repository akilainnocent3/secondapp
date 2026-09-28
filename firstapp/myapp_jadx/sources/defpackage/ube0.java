package defpackage;

import android.content.Context;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sporty.android.sportytv.data.SportyTvDataStoreData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportytv.notification.StvNotificationManagerImpl$createNotification$1", f = "StvNotificationManagerImpl.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class ube0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vbe0 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ox0 d;
    public final /* synthetic */ CountryCodeName e;
    public final /* synthetic */ String f;

    public static final class a<T> implements myh {
        public final /* synthetic */ vbe0 a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ ox0 c;
        public final /* synthetic */ CountryCodeName d;
        public final /* synthetic */ String e;

        public a(vbe0 vbe0Var, Context context, ox0 ox0Var, CountryCodeName countryCodeName, String str) {
            this.a = vbe0Var;
            this.b = context;
            this.c = ox0Var;
            this.d = countryCodeName;
            this.e = str;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            SportyTvDataStoreData sportyTvDataStoreData = (SportyTvDataStoreData) obj;
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_SPORTY_TV);
            aVar.a(wga.a(sportyTvDataStoreData.isTrue(), "the value is : "), new Object[0]);
            if (!((Boolean) sportyTvDataStoreData.isTrue()).booleanValue()) {
                return Unit.a;
            }
            this.a.b(this.b, this.c, this.d, this.e);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ube0(vbe0 vbe0Var, Context context, ox0 ox0Var, CountryCodeName countryCodeName, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.b = vbe0Var;
        this.c = context;
        this.d = ox0Var;
        this.e = countryCodeName;
        this.f = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ube0(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ube0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            vbe0 vbe0Var = this.b;
            aed0 aed0VarB = vbe0Var.a.b();
            a aVar = new a(vbe0Var, this.c, this.d, this.e, this.f);
            this.a = 1;
            if (aed0VarB.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
