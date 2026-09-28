package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.LoyaltyHomeScreenKt$HomeList$3$1", f = "LoyaltyHomeScreen.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hvt extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ uf00<wvt> b;
    public final /* synthetic */ zzr c;
    public final /* synthetic */ int d;

    @c0d(c = "com.sporty.android.platform.features.loyalty.home.ui.LoyaltyHomeScreenKt$HomeList$3$1$1", f = "LoyaltyHomeScreen.kt", l = {602}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ uf00<wvt> b;
        public final /* synthetic */ zzr c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(uf00<? extends wvt> uf00Var, zzr zzrVar, int i, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = uf00Var;
            this.c = zzrVar;
            this.d = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            uf00<uyt> uf00Var;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                Iterator<wvt> it = this.b.iterator();
                int i2 = 0;
                loop0: while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    wvt next = it.next();
                    if ((next instanceof vd8) && ((uf00Var = ((vd8) next).a) == null || !uf00Var.isEmpty())) {
                        Iterator<uyt> it2 = uf00Var.iterator();
                        while (it2.hasNext()) {
                            if (it2.next() instanceof uyt.g) {
                                break loop0;
                            }
                        }
                    }
                    i2++;
                }
                if (i2 >= 0) {
                    int i3 = -this.d;
                    this.a = 1;
                    if (this.c.f(i2, i3, this) == y5bVar) {
                        return y5bVar;
                    }
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
    /* JADX WARN: Multi-variable type inference failed */
    public hvt(uf00<? extends wvt> uf00Var, zzr zzrVar, int i, v1b<? super hvt> v1bVar) {
        super(2, v1bVar);
        this.b = uf00Var;
        this.c = zzrVar;
        this.d = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hvt hvtVar = new hvt(this.b, this.c, this.d, v1bVar);
        hvtVar.a = obj;
        return hvtVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hvt) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ej5.c(v5bVar, null, null, new a(this.b, this.c, this.d, null), 3);
        return Unit.a;
    }
}
