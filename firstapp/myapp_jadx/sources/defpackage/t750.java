package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.utils.RenderHelperKt$playReducedSound$1$1", f = "RenderHelper.kt", l = {52}, m = "invokeSuspend", v = 1)
public final class t750 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ypa0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;

    @c0d(c = "com.sportygames.fruithunt.utils.RenderHelperKt$playReducedSound$1$1$1", f = "RenderHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ypa0 a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ypa0 ypa0Var, String str, long j, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = ypa0Var;
            this.b = str;
            this.c = j;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            String str = this.b;
            this.a.A1(this.c, str);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t750(ypa0 ypa0Var, String str, long j, v1b<? super t750> v1bVar) {
        super(2, v1bVar);
        this.b = ypa0Var;
        this.c = str;
        this.d = j;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t750(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t750) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            pfd pfdVar = fse.a;
            odd oddVar = odd.b;
            a aVar = new a(this.b, this.c, this.d, null);
            this.a = 1;
            if (ej5.d(oddVar, aVar, this) == y5bVar) {
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
