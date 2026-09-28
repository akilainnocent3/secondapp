package defpackage;

import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageActivity$observeData$1", f = "LivePageActivity.kt", l = {1341}, m = "invokeSuspend", v = 2)
public final class kqs extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ LivePageActivity b;

    @c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageActivity$observeData$1$1", f = "LivePageActivity.kt", l = {1342}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ LivePageActivity b;

        /* JADX INFO: renamed from: kqs$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageActivity$observeData$1$1$1", f = "LivePageActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0780a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ LivePageActivity b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0780a(LivePageActivity livePageActivity, v1b<? super C0780a> v1bVar) {
                super(2, v1bVar);
                this.b = livePageActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0780a c0780a = new C0780a(this.b, v1bVar);
                c0780a.a = obj;
                return c0780a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, v1b<? super Unit> v1bVar) {
                return ((C0780a) create(str, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                String str = (String) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                xss xssVar = this.b.Q;
                if (xssVar != null) {
                    xssVar.x(str);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LivePageActivity livePageActivity, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = livePageActivity;
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
                int i2 = LivePageActivity.b0;
                LivePageActivity livePageActivity = this.b;
                v340 v340Var = livePageActivity.G1().F;
                C0780a c0780a = new C0780a(livePageActivity, null);
                this.a = 1;
                if (kzh.b(v340Var, c0780a, this) == y5bVar) {
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
    public kqs(LivePageActivity livePageActivity, v1b<? super kqs> v1bVar) {
        super(2, v1bVar);
        this.b = livePageActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kqs(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kqs) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s.b bVar = s9s.b.d;
            LivePageActivity livePageActivity = this.b;
            a aVar = new a(livePageActivity, null);
            this.a = 1;
            if (m850.b(livePageActivity, bVar, aVar, this) == y5bVar) {
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
