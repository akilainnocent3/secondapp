package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.homeshortcut.sidepanel.ui.SidePanelLazyListStateKt$rememberSidePanelLazyListState$2$1", f = "SidePanelLazyListState.kt", l = {78}, m = "invokeSuspend", v = 2)
public final class hg90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ku90 c;
    public final /* synthetic */ zzr d;
    public final /* synthetic */ osw e;
    public final /* synthetic */ ytw<yp70> f;

    @c0d(c = "com.sporty.android.platform.features.homeshortcut.sidepanel.ui.SidePanelLazyListStateKt$rememberSidePanelLazyListState$2$1$1", f = "SidePanelLazyListState.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Integer, v1b<? super Unit>, Object> {
        public /* synthetic */ int a;
        public final /* synthetic */ v5b b;
        public final /* synthetic */ zzr c;
        public final /* synthetic */ osw d;
        public final /* synthetic */ ytw<yp70> e;

        /* JADX INFO: renamed from: hg90$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.homeshortcut.sidepanel.ui.SidePanelLazyListStateKt$rememberSidePanelLazyListState$2$1$1$1", f = "SidePanelLazyListState.kt", l = {72}, m = "invokeSuspend", v = 2)
        public static final class C0641a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ yp40 b;
            public final /* synthetic */ zzr c;
            public final /* synthetic */ osw d;
            public final /* synthetic */ int e;
            public final /* synthetic */ ytw<yp70> f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0641a(yp40 yp40Var, zzr zzrVar, osw oswVar, int i, ytw ytwVar, v1b v1bVar) {
                super(2, v1bVar);
                this.b = yp40Var;
                this.c = zzrVar;
                this.d = oswVar;
                this.e = i;
                this.f = ytwVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0641a(this.b, this.c, this.d, this.e, this.f, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0641a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    ytw<yp70> ytwVar = this.f;
                    yp70 value = ytwVar.getValue();
                    yp70 yp70Var = yp70.a;
                    if (value == yp70Var) {
                        this.b.a = false;
                        return Unit.a;
                    }
                    ytwVar.setValue(yp70Var);
                    osw oswVar = this.d;
                    zzr zzrVar = this.c;
                    Integer numA = ig90.a(zzrVar, oswVar);
                    int iIntValue = numA != null ? numA.intValue() : 0;
                    this.a = 1;
                    if (zzrVar.f(this.e, iIntValue * (-1), this) == y5bVar) {
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
        public a(v5b v5bVar, zzr zzrVar, osw oswVar, ytw ytwVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = v5bVar;
            this.c = zzrVar;
            this.d = oswVar;
            this.e = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, this.c, this.d, this.e, v1bVar);
            aVar.a = ((Number) obj).intValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, v1b<? super Unit> v1bVar) {
            return ((a) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int i = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            final yp40 yp40Var = new yp40();
            yp40Var.a = true;
            zzr zzrVar = this.c;
            osw oswVar = this.d;
            final ytw<yp70> ytwVar = this.e;
            ej5.c(this.b, null, null, new C0641a(yp40Var, zzrVar, oswVar, i, ytwVar, null), 3).invokeOnCompletion(new Function1() { // from class: gg90
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ytw ytwVar2 = ytwVar;
                    if (((yp70) ytwVar2.getValue()) == yp70.a && yp40Var.a) {
                        ytwVar2.setValue(yp70.b);
                    }
                    return Unit.a;
                }
            });
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg90(ku90 ku90Var, zzr zzrVar, osw oswVar, ytw ytwVar, v1b v1bVar) {
        super(2, v1bVar);
        this.c = ku90Var;
        this.d = zzrVar;
        this.e = oswVar;
        this.f = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hg90 hg90Var = new hg90(this.c, this.d, this.e, this.f, v1bVar);
        hg90Var.b = obj;
        return hg90Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hg90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        a aVar = new a(v5bVar, this.d, this.e, this.f, null);
        this.b = null;
        this.a = 1;
        this.c.collect(new g1i.a(gyx.a, aVar), this);
        return y5bVar;
    }
}
