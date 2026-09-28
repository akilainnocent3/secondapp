package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.SettingsFragment$initViewModel$$inlined$launchAndRepeatWithViewLifecycle$default$1", f = "SettingsFragment.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class nl80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ hl80 b;
    public final /* synthetic */ hl80 c;

    @c0d(c = "com.sportybet.feature.settings.SettingsFragment$initViewModel$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", f = "SettingsFragment.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ hl80 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, hl80 hl80Var) {
            super(2, v1bVar);
            this.c = hl80Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(v1bVar, this.c);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ohp<Object>[] ohpVarArr = hl80.N;
                hl80 hl80Var = this.c;
                ej5.c(v5bVar, null, null, new kl80(null, hl80Var), 3);
                ej5.c(v5bVar, null, null, new ll80(null, hl80Var), 3);
                ej5.c(v5bVar, null, null, new jl80(null, hl80Var), 3);
                ej5.c(v5bVar, null, null, new il80(null, hl80Var), 3);
                lyh<Boolean> lyhVar = hl80Var.p0().C;
                ol80 ol80Var = new ol80(hl80Var);
                this.b = null;
                this.a = 1;
                if (lyhVar.collect(ol80Var, this) == y5bVar) {
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
    public nl80(hl80 hl80Var, v1b v1bVar, hl80 hl80Var2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = hl80Var;
        this.c = hl80Var2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new nl80(this.b, v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nl80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getViewLifecycleOwner().getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(null, this.c);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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
