package defpackage;

import android.accounts.Account;
import com.google.android.gms.common.annotation.LjLk.llGRV;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$initAccountFlowObserver$1", f = "MeViewModel.kt", l = {258}, m = "invokeSuspend", v = 2)
public final class ugv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rhv b;

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$initAccountFlowObserver$1$1", f = "MeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Account, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ rhv b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rhv rhvVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = rhvVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Account account, v1b<? super Unit> v1bVar) {
            return ((a) create(account, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Account account = (Account) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            rev revVar = this.b.z;
            boolean z = account == null;
            revVar.getClass();
            if (z && iu2.c() == k53.EDIT) {
                iu2.a.j().r0(k53.REAL);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugv(rhv rhvVar, v1b<? super ugv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ugv(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ugv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            rhv rhvVar = this.b;
            lyh<Account> lyhVar = rhvVar.I;
            a aVar = new a(rhvVar, null);
            this.a = 1;
            if (kzh.b(lyhVar, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a(llGRV.PSejEvWyUUiZ);
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
