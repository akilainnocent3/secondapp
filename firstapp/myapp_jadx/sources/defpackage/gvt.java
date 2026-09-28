package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.LoyaltyHomeScreenKt$HomeList$2$1", f = "LoyaltyHomeScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gvt extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ zzr c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ int e;

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.LoyaltyHomeScreenKt$HomeList$2$1$1", f = "LoyaltyHomeScreen.kt", l = {588}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ zzr b;
        public final /* synthetic */ Integer c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zzr zzrVar, Integer num, int i, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = zzrVar;
            this.c = num;
            this.d = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                Integer num = this.c;
                int iIntValue = num != null ? num.intValue() : 0;
                int i2 = -this.d;
                this.a = 1;
                if (this.b.f(iIntValue, i2, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvt(boolean z, zzr zzrVar, Integer num, int i, v1b<? super gvt> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = zzrVar;
        this.d = num;
        this.e = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gvt gvtVar = new gvt(this.b, this.c, this.d, this.e, v1bVar);
        gvtVar.a = obj;
        return gvtVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gvt) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.b) {
            ej5.c(v5bVar, null, null, new a(this.c, this.d, this.e, null), 3);
        }
        return Unit.a;
    }
}
