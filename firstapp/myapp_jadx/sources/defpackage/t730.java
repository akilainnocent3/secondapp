package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.providerselect.ProviderSelectFragment$initViewModel$$inlined$collectWithLifecycle$default$2", f = "ProviderSelectFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class t730 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ f1i c;
    public final /* synthetic */ q730 d;

    @c0d(c = "com.sportybet.android.globalpay.providerselect.ProviderSelectFragment$initViewModel$$inlined$collectWithLifecycle$default$2$1", f = "ProviderSelectFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ f1i c;
        public final /* synthetic */ q730 d;

        /* JADX INFO: renamed from: t730$a$a, reason: collision with other inner class name */
        public static final class C1117a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ q730 b;

            public C1117a(v5b v5bVar, q730 q730Var) {
                this.b = q730Var;
                this.a = v5bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                int iIntValue = ((Number) t).intValue();
                ViewPager2 viewPager2 = this.b.v;
                if (viewPager2 != null) {
                    viewPager2.setCurrentItem(iIntValue);
                    return Unit.a;
                }
                Intrinsics.n("viewPager");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f1i f1iVar, v1b v1bVar, q730 q730Var) {
            super(2, v1bVar);
            this.c = f1iVar;
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
                C1117a c1117a = new C1117a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1117a, this) == y5bVar) {
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
    public t730(ibs ibsVar, f1i f1iVar, v1b v1bVar, q730 q730Var) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = ibsVar;
        this.c = f1iVar;
        this.d = q730Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new t730(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t730) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
