package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.quickinput.viewmodel.QuickInputViewModel$loadQuickInputFields$1", f = "QuickInputViewModel.kt", l = {55}, m = "invokeSuspend", v = 2)
public final class gh30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ jh30 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public static final class a<T> implements myh {
        public final /* synthetic */ jh30 a;
        public final /* synthetic */ boolean b;

        public a(jh30 jh30Var, boolean z) {
            this.a = jh30Var;
            this.b = z;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            jh30 jh30Var = this.a;
            ch30 ch30Var = jh30Var.f;
            fh30 fh30Var = new fh30(1, jh30Var, jh30.class, "onItemSelected", "onItemSelected(Lcom/sporty/android/compose/ui/component/quick_input/QuickInputUI;)Lkotlinx/coroutines/Job;", 8);
            ch30Var.getClass();
            dh30 dh30VarC = ch30.c((sj30) obj, fh30Var, this.b);
            jh30Var.z1(dh30VarC);
            if (dh30VarC instanceof dh30.c) {
                fg30 fg30Var = jh30Var.v;
                Object obj2 = null;
                if (fg30Var == null) {
                    Intrinsics.n("builder");
                    throw null;
                }
                ArrayList arrayList = fg30Var.a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    if (((bh30) obj3).d) {
                        obj2 = obj3;
                        break;
                    }
                }
                bh30 bh30Var = (bh30) obj2;
                if (bh30Var != null) {
                    jh30Var.i.setValue(bh30Var.b);
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh30(jh30 jh30Var, String str, boolean z, v1b<? super gh30> v1bVar) {
        super(2, v1bVar);
        this.b = jh30Var;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gh30(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gh30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            jh30 jh30Var = this.b;
            hck hckVar = jh30Var.e;
            hckVar.getClass();
            or60 or60Var = new or60(new gck(hckVar, this.c, null));
            a aVar = new a(jh30Var, this.d);
            this.a = 1;
            if (or60Var.collect(aVar, this) == y5bVar) {
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
