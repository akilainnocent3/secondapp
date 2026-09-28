package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.custom.CustomCodeNavHostKt$CustomCodeNavHost$1$1", f = "CustomCodeNavHost.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bac extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ Context b;

    @c0d(c = "com.sportybet.android.social.presentation.custom.CustomCodeNavHostKt$CustomCodeNavHost$1$1$1", f = "CustomCodeNavHost.kt", l = {52}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    Context context = this.c;
                    zi50.a aVar = zi50.b;
                    nan.a aVar2 = new nan.a(context);
                    ctt.a aVar3 = ctt.b;
                    aVar2.c = "https://s.sporty.net/cms/Gift_Bg_a3fe47ed54.png";
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
                zi50.a aVar4 = zi50.b;
            } catch (Throwable unused) {
                zi50.a aVar5 = zi50.b;
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bac(Context context, v1b<? super bac> v1bVar) {
        super(2, v1bVar);
        this.b = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bac bacVar = new bac(this.b, v1bVar);
        bacVar.a = obj;
        return bacVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bac) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ej5.c(v5bVar, zu7.f, null, new a(this.b, null), 2);
        return Unit.a;
    }
}
