package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.mobileMoney.compose.MobileMoneySelectPhoneBottomSheetKt$MobileMoneySelectPhoneBottomSheet$1$1", f = "MobileMoneySelectPhoneBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xzv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ v5b b;
    public final /* synthetic */ ytw<Boolean> c;
    public final /* synthetic */ j590 d;

    @c0d(c = "com.sportybet.android.globalpay.mobileMoney.compose.MobileMoneySelectPhoneBottomSheetKt$MobileMoneySelectPhoneBottomSheet$1$1$1", f = "MobileMoneySelectPhoneBottomSheet.kt", l = {59}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ j590 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j590 j590Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = j590Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
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
                this.a = 1;
                if (this.b.d(this) == y5bVar) {
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
    public xzv(boolean z, v5b v5bVar, ytw<Boolean> ytwVar, j590 j590Var, v1b<? super xzv> v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = v5bVar;
        this.c = ytwVar;
        this.d = j590Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xzv(this.a, this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xzv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = this.a;
        final ytw<Boolean> ytwVar = this.c;
        if (z) {
            ytwVar.setValue(Boolean.TRUE);
        } else {
            final j590 j590Var = this.d;
            ej5.c(this.b, null, null, new a(j590Var, null), 3).invokeOnCompletion(new Function1() { // from class: wzv
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    if (!j590Var.e()) {
                        ytwVar.setValue(Boolean.FALSE);
                    }
                    return Unit.a;
                }
            });
        }
        return Unit.a;
    }
}
