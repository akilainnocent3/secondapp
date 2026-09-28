package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListActivity$initTxViewModel$1$4", f = "TxListActivity.kt", l = {587}, m = "invokeSuspend", v = 2)
public final class f7h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ TxListActivity b;
    public final /* synthetic */ o7h0 c;

    @c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListActivity$initTxViewModel$1$4$1", f = "TxListActivity.kt", l = {588}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ o7h0 b;
        public final /* synthetic */ TxListActivity c;

        /* JADX INFO: renamed from: f7h0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListActivity$initTxViewModel$1$4$1$1", f = "TxListActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0547a extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ TxListActivity b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0547a(TxListActivity txListActivity, v1b<? super C0547a> v1bVar) {
                super(2, v1bVar);
                this.b = txListActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0547a c0547a = new C0547a(this.b, v1bVar);
                c0547a.a = obj;
                return c0547a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
                return ((C0547a) create(uiText, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                UiText uiText = (UiText) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                zyf0.c(0, uiText.e(this.b));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, o7h0 o7h0Var, TxListActivity txListActivity) {
            super(2, v1bVar);
            this.b = o7h0Var;
            this.c = txListActivity;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b, this.c);
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
                t340 t340Var = this.b.H;
                C0547a c0547a = new C0547a(this.c, null);
                this.a = 1;
                if (kzh.b(t340Var, c0547a, this) == y5bVar) {
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
    public f7h0(v1b v1bVar, o7h0 o7h0Var, TxListActivity txListActivity) {
        super(2, v1bVar);
        this.b = txListActivity;
        this.c = o7h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f7h0(v1bVar, this.c, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f7h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s.b bVar = s9s.b.d;
            o7h0 o7h0Var = this.c;
            TxListActivity txListActivity = this.b;
            a aVar = new a(null, o7h0Var, txListActivity);
            this.a = 1;
            if (m850.b(txListActivity, bVar, aVar, this) == y5bVar) {
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
