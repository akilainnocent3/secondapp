package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyTagNewsFragmentKt$HandleScrolling$1$1", f = "SportyTagNewsFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wcd0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<c9p> a;
    public final /* synthetic */ ctc0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ jce0 d;
    public final /* synthetic */ String e;

    @c0d(c = "com.sporty.android.sportynews.ui.SportyTagNewsFragmentKt$HandleScrolling$1$1$1", f = "SportyTagNewsFragment.kt", l = {207}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ jce0 c;
        public final /* synthetic */ ctc0 d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, jce0 jce0Var, ctc0 ctc0Var, String str, v1b v1bVar) {
            super(2, v1bVar);
            this.b = z;
            this.c = jce0Var;
            this.d = ctc0Var;
            this.e = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String nextCursor;
            y5b y5bVar = y5b.a;
            int i = this.a;
            jce0 jce0Var = this.c;
            if (i == 0) {
                uj50.b(obj);
                if (this.b) {
                    jce0Var.getClass();
                    if (jce0Var instanceof jce0.a ? ((jce0.a) jce0Var).a.getHasNextPage() : false) {
                        this.a = 1;
                        if (hkd.b(1000L, this) == y5bVar) {
                            return y5bVar;
                        }
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            jce0Var.getClass();
            String str = "";
            if ((jce0Var instanceof jce0.a) && (nextCursor = ((jce0.a) jce0Var).a.getNextCursor()) != null) {
                str = nextCursor;
            }
            String str2 = this.e;
            str2.getClass();
            ctc0 ctc0Var = this.d;
            ctc0Var.a.b(o8i0.d(ctc0Var), str2, str, new btc0(ctc0Var, str));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wcd0(ytw ytwVar, ctc0 ctc0Var, boolean z, jce0 jce0Var, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.a = ytwVar;
        this.b = ctc0Var;
        this.c = z;
        this.d = jce0Var;
        this.e = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new wcd0(this.a, this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wcd0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ytw<c9p> ytwVar = this.a;
        c9p value = ytwVar.getValue();
        if (value != null) {
            value.cancel((CancellationException) null);
        }
        ctc0 ctc0Var = this.b;
        ytwVar.setValue(ej5.c(o8i0.d(ctc0Var), null, null, new a(this.c, this.d, ctc0Var, this.e, null), 3));
        return Unit.a;
    }
}
