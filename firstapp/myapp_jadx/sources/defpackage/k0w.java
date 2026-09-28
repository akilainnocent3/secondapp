package defpackage;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import com.sportybet.android.gp.tz.R;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class k0w extends bo8 {
    public Function0<Unit> d;
    public w1w e;
    public long f;
    public final View i;
    public final j0w v;

    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    public static final class b extends cny {
        public final v5b d;
        public final wd0<Float, ij0> e;
        public final l04 f;

        @c0d(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackCancelled$1", f = "ModalBottomSheet.android.kt", l = {638}, m = "invokeSuspend")
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;

            public a(v1b<? super a> v1bVar) {
                super(2, v1bVar);
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return b.this.new a(v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    wd0<Float, ij0> wd0Var = b.this.e;
                    Float f = new Float(0.0f);
                    this.a = 1;
                    if (wd0.a(wd0Var, f, null, null, null, this, 14) == y5bVar) {
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

        /* JADX INFO: renamed from: k0w$b$b, reason: collision with other inner class name */
        @c0d(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackProgressed$1", f = "ModalBottomSheet.android.kt", l = {627}, m = "invokeSuspend")
        public static final class C0745b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ sr1 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0745b(sr1 sr1Var, v1b<? super C0745b> v1bVar) {
                super(2, v1bVar);
                this.c = sr1Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return b.this.new C0745b(this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0745b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    wd0<Float, ij0> wd0Var = b.this.e;
                    Float f = new Float(vr1.a.a(this.c.c));
                    this.a = 1;
                    if (wd0Var.f(this, f) == y5bVar) {
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

        @c0d(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1", f = "ModalBottomSheet.android.kt", l = {620}, m = "invokeSuspend")
        public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ sr1 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(sr1 sr1Var, v1b<? super c> v1bVar) {
                super(2, v1bVar);
                this.c = sr1Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return b.this.new c(this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    wd0<Float, ij0> wd0Var = b.this.e;
                    Float f = new Float(vr1.a.a(this.c.c));
                    this.a = 1;
                    if (wd0Var.f(this, f) == y5bVar) {
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

        public b(boolean z, v5b v5bVar, wd0 wd0Var, l04 l04Var) {
            super(z);
            this.d = v5bVar;
            this.e = wd0Var;
            this.f = l04Var;
        }

        @Override // defpackage.cny
        public final void a() {
            ej5.c(this.d, null, null, new a(null), 3);
        }

        @Override // defpackage.cny
        public final void b() {
            this.f.invoke();
        }

        @Override // defpackage.cny
        public final void c(sr1 sr1Var) {
            ej5.c(this.d, null, null, new C0745b(sr1Var, null), 3);
        }

        @Override // defpackage.cny
        public final void d(sr1 sr1Var) {
            ej5.c(this.d, null, null, new c(sr1Var, null), 3);
        }
    }

    public k0w(Function0<Unit> function0, w1w w1wVar, long j, View view, asr asrVar, mmd mmdVar, UUID uuid, wd0<Float, ij0> wd0Var, v5b v5bVar) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.d = function0;
        this.e = w1wVar;
        this.f = j;
        this.i = view;
        Window window = getWindow();
        if (window == null) {
            ib5.a("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        z7j0.a(window, false);
        j0w j0wVar = new j0w(getContext(), window);
        j0wVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        j0wVar.setClipChildren(false);
        j0wVar.setElevation(mmdVar.C1(8.0f));
        j0wVar.setOutlineProvider(new a());
        this.v = j0wVar;
        setContentView(j0wVar);
        j0wVar.setTag(R.id.view_tree_lifecycle_owner, ll5.b(view));
        j0wVar.setTag(R.id.view_tree_view_model_store_owner, tl5.b(view));
        j0wVar.setTag(R.id.view_tree_saved_state_registry_owner, ydx.a(view));
        d(this.d, this.e, this.f, asrVar);
        qoa0 qoa0Var = new qoa0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        n8j0.g fVar = i >= 35 ? new n8j0.f(window, qoa0Var) : i >= 30 ? new n8j0.d(window, qoa0Var) : i >= 26 ? new n8j0.c(window, qoa0Var) : new n8j0.b(window, qoa0Var);
        this.e.getClass();
        fVar.d(d2w.b(this.f));
        this.e.getClass();
        fVar.c(d2w.b(this.f));
        this.c.a(this, new b(this.e.b, v5bVar, wd0Var, new l04(this, 2)));
    }

    public final void d(Function0<Unit> function0, w1w w1wVar, long j, asr asrVar) {
        this.d = function0;
        this.e = w1wVar;
        this.f = j;
        l380 l380Var = w1wVar.a;
        ViewGroup.LayoutParams layoutParams = this.i.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = l380Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z = true;
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return;
                }
                z = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal2 = asrVar.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else if (iOrdinal2 != 1) {
            uhc.a();
            return;
        }
        this.v.setLayoutDirection(i);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.d.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
