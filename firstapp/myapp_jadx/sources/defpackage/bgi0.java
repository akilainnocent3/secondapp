package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity$observeViewModels$$inlined$collectWithLifecycle$default$3", f = "VirtualLobbyActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class bgi0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ VirtualLobbyActivity b;
    public final /* synthetic */ wwd0 c;
    public final /* synthetic */ VirtualLobbyActivity d;

    @c0d(c = "com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity$observeViewModels$$inlined$collectWithLifecycle$default$3$1", f = "VirtualLobbyActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ wwd0 c;
        public final /* synthetic */ VirtualLobbyActivity d;

        /* JADX INFO: renamed from: bgi0$a$a, reason: collision with other inner class name */
        public static final class C0125a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ VirtualLobbyActivity b;

            public C0125a(v5b v5bVar, VirtualLobbyActivity virtualLobbyActivity) {
                this.b = virtualLobbyActivity;
                this.a = v5bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                int i = VirtualLobbyActivity.E;
                this.b.B1().x1(new kli0.i((r7e) t));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wwd0 wwd0Var, v1b v1bVar, VirtualLobbyActivity virtualLobbyActivity) {
            super(2, v1bVar);
            this.c = wwd0Var;
            this.d = virtualLobbyActivity;
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
        public final Object invokeSuspend(Object obj) throws Throwable {
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
            C0125a c0125a = new C0125a(v5bVar, this.d);
            this.b = null;
            this.a = 1;
            this.c.collect(c0125a, this);
            return y5bVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgi0(VirtualLobbyActivity virtualLobbyActivity, wwd0 wwd0Var, v1b v1bVar, VirtualLobbyActivity virtualLobbyActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = virtualLobbyActivity;
        this.c = wwd0Var;
        this.d = virtualLobbyActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new bgi0(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bgi0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
