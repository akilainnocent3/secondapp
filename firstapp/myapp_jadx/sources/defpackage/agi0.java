package defpackage;

import androidx.fragment.app.FragmentManager;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.instantwin.presentation.buildandgo.e;
import com.sportybet.android.instantwin.router.bethistory.BuildAndGoHistoryInput;
import com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity$observeViewModels$$inlined$collectWithLifecycle$default$2", f = "VirtualLobbyActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class agi0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ VirtualLobbyActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ VirtualLobbyActivity d;

    @c0d(c = "com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity$observeViewModels$$inlined$collectWithLifecycle$default$2$1", f = "VirtualLobbyActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ VirtualLobbyActivity d;

        /* JADX INFO: renamed from: agi0$a$a, reason: collision with other inner class name */
        public static final class C0023a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ VirtualLobbyActivity b;

            public C0023a(v5b v5bVar, VirtualLobbyActivity virtualLobbyActivity) {
                this.b = virtualLobbyActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                e eVar = (e) t;
                boolean zG = Intrinsics.g(eVar, mi5.a);
                VirtualLobbyActivity virtualLobbyActivity = this.b;
                if (zG) {
                    int i = VirtualLobbyActivity.E;
                    ej5.c(ebs.a(virtualLobbyActivity.getLifecycle()), null, null, new yfi0(virtualLobbyActivity, null), 3);
                } else if (eVar instanceof li5) {
                    ee<fqk> eeVar = virtualLobbyActivity.i;
                    if (eeVar == null) {
                        Intrinsics.n("buildAndGoGiftPickerLauncher");
                        throw null;
                    }
                    eeVar.b(((li5) eVar).a);
                } else if (Intrinsics.g(eVar, ki5.a)) {
                    jlo jloVar = virtualLobbyActivity.C;
                    if (jloVar == null) {
                        Intrinsics.n("instantWinRouter");
                        throw null;
                    }
                    virtualLobbyActivity.startActivity(jloVar.k(virtualLobbyActivity, new BuildAndGoHistoryInput(null)));
                } else {
                    if (!Intrinsics.g(eVar, e.a.a)) {
                        uhc.a();
                        return null;
                    }
                    int i2 = VirtualLobbyActivity.E;
                    virtualLobbyActivity.B1().x1(kli0.g.a);
                    FragmentManager supportFragmentManager = virtualLobbyActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    yc5.a(supportFragmentManager, false);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, VirtualLobbyActivity virtualLobbyActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
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
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C0023a c0023a = new C0023a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0023a, this) == y5bVar) {
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
    public agi0(VirtualLobbyActivity virtualLobbyActivity, lyh lyhVar, v1b v1bVar, VirtualLobbyActivity virtualLobbyActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = virtualLobbyActivity;
        this.c = lyhVar;
        this.d = virtualLobbyActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new agi0(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((agi0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
