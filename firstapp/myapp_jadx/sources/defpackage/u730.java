package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.providerselect.ProviderSelectFragment$initViewModel$$inlined$collectWithLifecycle$default$3", f = "ProviderSelectFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class u730 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ q730 d;

    @c0d(c = "com.sportybet.android.globalpay.providerselect.ProviderSelectFragment$initViewModel$$inlined$collectWithLifecycle$default$3$1", f = "ProviderSelectFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ q730 d;

        /* JADX INFO: renamed from: u730$a$a, reason: collision with other inner class name */
        public static final class C1166a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ q730 b;

            public C1166a(v5b v5bVar, q730 q730Var) {
                this.b = q730Var;
                this.a = v5bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                boolean zBooleanValue = ((Boolean) t).booleanValue();
                q730.a aVar = q730.D;
                q730 q730Var = this.b;
                ArrayList arrayListA = x1f0.a(q730Var.m0().b);
                int size = arrayListA.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListA.get(i);
                    i++;
                    ((TabLayout.g) obj).h.setEnabled(zBooleanValue);
                }
                q730Var.m0().c.setUserInputEnabled(zBooleanValue);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, q730 q730Var) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = q730Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar, this.d);
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
                C1166a c1166a = new C1166a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1166a, this) == y5bVar) {
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
    public u730(ibs ibsVar, lyh lyhVar, v1b v1bVar, q730 q730Var) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = ibsVar;
        this.c = lyhVar;
        this.d = q730Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new u730(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u730) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(this.c, null, this.d);
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
