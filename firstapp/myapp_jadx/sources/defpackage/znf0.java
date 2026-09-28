package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lznf0;", "Landroidx/fragment/app/Fragment;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "Lxjj;", "<init>", "()V", "Lm0f0;", "state", "Lcom/sportygames/newcms/b;", "cmsResource", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class znf0 extends Fragment implements GameMainActivity.b, xjj {
    public GameDetails a;
    public final ttr b;

    @c0d(c = "com.sportygames.goldmine.TheGoldmineFragment$TGContent$1$2$1", f = "TheGoldmineFragment.kt", l = {89}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ k4i c;

        /* JADX INFO: renamed from: znf0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.goldmine.TheGoldmineFragment$TGContent$1$2$1$1", f = "TheGoldmineFragment.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class C1406a extends tje0 implements Function2<cre0, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ k4i b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1406a(k4i k4iVar, v1b<? super C1406a> v1bVar) {
                super(2, v1bVar);
                this.b = k4iVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1406a c1406a = new C1406a(this.b, v1bVar);
                c1406a.a = obj;
                return c1406a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(cre0 cre0Var, v1b<? super Unit> v1bVar) {
                return ((C1406a) create(cre0Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                cre0 cre0Var = (cre0) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                if (Intrinsics.g(cre0Var, cre0.a.a)) {
                    this.b.t(false);
                    return Unit.a;
                }
                uhc.a();
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k4i k4iVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = k4iVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return znf0.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to znf0$a for r5v7 'this'  v1b
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r5.a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                if (r1 != r3) goto Le
                defpackage.uj50.b(r6)
                goto L42
            Le:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                return r2
            L14:
                defpackage.uj50.b(r6)
                znf0 r6 = defpackage.znf0.this
                aof0 r6 = r6.m0()
                t340 r6 = r6.X
                znf0$a$a r1 = new znf0$a$a
                k4i r4 = r5.c
                r1.<init>(r4, r2)
                r5.a = r3
                g1i$a r2 = new g1i$a
                gyx r3 = defpackage.gyx.a
                r2.<init>(r3, r1)
                a390<T> r6 = r6.a
                java.lang.Object r5 = r6.collect(r2, r5)
                if (r5 != r0) goto L38
                goto L3a
            L38:
                kotlin.Unit r5 = kotlin.Unit.a
            L3a:
                if (r5 != r0) goto L3d
                goto L3f
            L3d:
                kotlin.Unit r5 = kotlin.Unit.a
            L3f:
                if (r5 != r0) goto L42
                return r0
            L42:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: znf0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<qve0, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(qve0 qve0Var) {
            qve0 qve0Var2 = qve0Var;
            qve0Var2.getClass();
            ((aof0) this.receiver).z1(qve0Var2);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function1<Throwable, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Throwable th2 = th;
            th2.getClass();
            ((aof0) this.receiver).A1(th2);
            return Unit.a;
        }
    }

    public static final class d implements Function0<Fragment> {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return znf0.this;
        }
    }

    public static final class e implements Function0<aof0> {
        public final /* synthetic */ d b;
        public final /* synthetic */ nsb0 c;

        public e(d dVar, nsb0 nsb0Var) {
            this.b = dVar;
            this.c = nsb0Var;
        }

        /* JADX WARN: Type inference failed for: r7v1, types: [aof0, j8i0] */
        @Override // kotlin.jvm.functions.Function0
        public final aof0 invoke() {
            v8i0 viewModelStore = znf0.this.getViewModelStore();
            znf0 znf0Var = znf0.this;
            cyb defaultViewModelCreationExtras = znf0Var.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(aof0.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(znf0Var), this.c);
        }
    }

    public znf0() {
        nsb0 nsb0Var = new nsb0(this, 1);
        this.b = hwr.a(a1s.c, new e(new d(), nsb0Var));
    }

    public final void j0(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-1280285094);
        int i2 = (bVarI.A(this) ? 4 : 2) | i;
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            orp.a(sjj.a(), pp8.b(406788025, new ynf0(this, i3), bVarI), bVarI, 48);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new rmb(this, i);
        }
    }

    public final aof0 m0() {
        return (aof0) this.b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        GameDetails gameDetails = arguments != null ? (GameDetails) arguments.getParcelable("key_game_details") : null;
        gameDetails.getClass();
        this.a = gameDetails;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            zpe0 zpe0Var = zpe0.a;
            elf.a(activity, new aqe0(0, 0, 2, zpe0Var), new aqe0(0, 0, 2, zpe0Var));
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(618108260, new Function2() { // from class: xnf0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.a.j0(0, aVar);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void d0() {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
