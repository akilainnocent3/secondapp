package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.virtual.presentation.dialog.BuildAndGoRunningPageDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.dialog.BuildAndGoRunningPageDialog$observeSheetState$$inlined$collectWithLifecycle$default$1", f = "BuildAndGoRunningPageDialog.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class cg5 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ BuildAndGoRunningPageDialog d;

    @c0d(c = "com.sportybet.android.virtual.presentation.dialog.BuildAndGoRunningPageDialog$observeSheetState$$inlined$collectWithLifecycle$default$1$1", f = "BuildAndGoRunningPageDialog.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ BuildAndGoRunningPageDialog d;

        /* JADX INFO: renamed from: cg5$a$a, reason: collision with other inner class name */
        public static final class C0162a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ BuildAndGoRunningPageDialog b;

            public C0162a(v5b v5bVar, BuildAndGoRunningPageDialog buildAndGoRunningPageDialog) {
                this.b = buildAndGoRunningPageDialog;
                this.a = v5bVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                fg5 fg5Var = (fg5) t;
                eg5 eg5Var = fg5Var.a;
                BuildAndGoRunningPageDialog buildAndGoRunningPageDialog = this.b;
                FrameLayout frameLayoutM0 = buildAndGoRunningPageDialog.m0();
                if (frameLayoutM0 != null) {
                    zvi zviVar = buildAndGoRunningPageDialog.f;
                    if (zviVar != null) {
                        View view = zviVar.e;
                        eg5Var.getClass();
                        view.setVisibility(eg5Var instanceof eg5.c ? 4 : 0);
                    }
                    zvi zviVar2 = buildAndGoRunningPageDialog.f;
                    if (zviVar2 != null) {
                        ImageView imageView = zviVar2.c;
                        eg5Var.getClass();
                        imageView.setVisibility(eg5Var instanceof eg5.c ? 4 : 0);
                    }
                    BottomSheetBehavior bottomSheetBehaviorC = BottomSheetBehavior.C(frameLayoutM0);
                    eg5Var.getClass();
                    boolean z = !(eg5Var instanceof eg5.c);
                    bottomSheetBehaviorC.Z = z;
                    buildAndGoRunningPageDialog.setCancelable(z);
                    bottomSheetBehaviorC.L(3);
                    ViewGroup.LayoutParams layoutParams = frameLayoutM0.getLayoutParams();
                    layoutParams.height = eg5Var.a();
                    frameLayoutM0.setLayoutParams(layoutParams);
                }
                boolean z2 = fg5Var.b;
                zvi zviVar3 = buildAndGoRunningPageDialog.f;
                if (zviVar3 != null) {
                    zviVar3.d.setVisibility(z2 ? 0 : 8);
                }
                zvi zviVar4 = buildAndGoRunningPageDialog.f;
                if (zviVar4 != null) {
                    zviVar4.f.setVisibility(z2 ? 8 : 0);
                }
                FrameLayout frameLayoutM1 = buildAndGoRunningPageDialog.m0();
                if (frameLayoutM1 != null) {
                    frameLayoutM1.setSelected(z2);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, BuildAndGoRunningPageDialog buildAndGoRunningPageDialog) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = buildAndGoRunningPageDialog;
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
                C0162a c0162a = new C0162a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0162a, this) == y5bVar) {
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
    public cg5(ibs ibsVar, lyh lyhVar, v1b v1bVar, BuildAndGoRunningPageDialog buildAndGoRunningPageDialog) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = ibsVar;
        this.c = lyhVar;
        this.d = buildAndGoRunningPageDialog;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new cg5(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cg5) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
