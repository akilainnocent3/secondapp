package defpackage;

import android.accounts.Account;
import com.sportybet.plugin.myfavorite.activities.MyFavoriteBaseActivity;
import com.sportybet.plugin.myfavorite.util.MyFavoriteTypeEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class sz2 implements tit {
    public final /* synthetic */ qz2 a;

    @c0d(c = "com.sportybet.plugin.realsports.betslip.widget.BetSettingDialogHelper$BetSettingBottomSheetDialog$setupGo2MyStakesBtn$1$1$1$1", f = "BetSettingDialogHelper.kt", l = {227}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ qz2 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qz2 qz2Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = qz2Var;
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
                if (hkd.b(350L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            MyFavoriteBaseActivity.z1(this.b.requireActivity(), MyFavoriteTypeEnum.DEFAULT_STAKE);
            return Unit.a;
        }
    }

    public sz2(qz2 qz2Var) {
        this.a = qz2Var;
    }

    @Override // defpackage.tit
    public final void w(Account account, boolean z) {
        if (account != null) {
            qz2 qz2Var = this.a;
            ibs viewLifecycleOwner = qz2Var.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new a(qz2Var, null), 3);
        }
    }
}
