package defpackage;

import com.sporty.android.core.model.pay.security.NameUpdateStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$initNameUpdateStatusObserver$1", f = "MeViewModel.kt", l = {247}, m = "invokeSuspend", v = 2)
public final class wgv extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rhv b;

    @c0d(c = "com.sportybet.feature.profile.me.presentation.MeViewModel$initNameUpdateStatusObserver$1$1", f = "MeViewModel.kt", l = {248}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<NameUpdateStatus, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ rhv b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rhv rhvVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = rhvVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NameUpdateStatus nameUpdateStatus, v1b<? super Unit> v1bVar) {
            return ((a) create(nameUpdateStatus, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                nev nevVar = this.b.b;
                this.a = 1;
                m2l m2lVar = nevVar.e;
                if (m2lVar.a.putBoolean("key_name_update_result_dialog_has_shown", Boolean.FALSE, this) == y5bVar) {
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
    public wgv(rhv rhvVar, v1b<? super wgv> v1bVar) {
        super(2, v1bVar);
        this.b = rhvVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wgv(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wgv) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            rhv rhvVar = this.b;
            jev jevVar = new jev(new kev(rhvVar.b.h));
            a aVar = new a(rhvVar, null);
            this.a = 1;
            if (kzh.b(jevVar, aVar, this) == y5bVar) {
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
