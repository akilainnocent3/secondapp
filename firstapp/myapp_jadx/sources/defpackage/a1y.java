package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.notificationcenter.ui.NotificationCenterScreenKt$TabScreen$1$1", f = "NotificationCenterScreen.kt", l = {184}, m = "invokeSuspend", v = 2)
public final class a1y extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ n32 c;
    public final /* synthetic */ Context d;

    @c0d(c = "com.sportybet.feature.notificationcenter.ui.NotificationCenterScreenKt$TabScreen$1$1$1", f = "NotificationCenterScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ v5b b;
        public final /* synthetic */ Context c;

        /* JADX INFO: renamed from: a1y$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.notificationcenter.ui.NotificationCenterScreenKt$TabScreen$1$1$1$1", f = "NotificationCenterScreen.kt", l = {188}, m = "invokeSuspend", v = 2)
        public static final class C0003a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0003a(v1b v1bVar, Context context, String str) {
                super(2, v1bVar);
                this.c = context;
                this.d = str;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0003a c0003a = new C0003a(v1bVar, this.c, this.d);
                c0003a.b = obj;
                return c0003a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0003a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                try {
                    if (i == 0) {
                        uj50.b(obj);
                        Context context = this.c;
                        String str = this.d;
                        zi50.a aVar = zi50.b;
                        nan.a aVar2 = new nan.a(context);
                        aVar2.c = str;
                        nan nanVarA = aVar2.a();
                        m9n m9nVarA = qw90.a(context);
                        this.b = null;
                        this.a = 1;
                        obj = m9nVarA.b(nanVarA, this);
                        if (obj == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                    }
                    zi50.a aVar3 = zi50.b;
                } catch (Throwable unused) {
                    zi50.a aVar4 = zi50.b;
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v5b v5bVar, Context context, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = v5bVar;
            this.c = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, v1b<? super Unit> v1bVar) {
            return ((a) create(str, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ej5.c(this.b, zu7.f, null, new C0003a(null, this.c, str), 2);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1y(n32 n32Var, Context context, v1b<? super a1y> v1bVar) {
        super(2, v1bVar);
        this.c = n32Var;
        this.d = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        a1y a1yVar = new a1y(this.c, this.d, v1bVar);
        a1yVar.b = obj;
        return a1yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a1y) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            t340 t340Var = this.c.e;
            a aVar = new a(v5bVar, this.d, null);
            this.b = null;
            this.a = 1;
            if (kzh.b(t340Var, aVar, this) == y5bVar) {
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
