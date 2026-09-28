package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class yie0 {

    public static final class a extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ py1 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(py1 py1Var) {
            super(0);
            this.a = py1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return this.a.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public final /* synthetic */ py1 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(py1 py1Var) {
            super(0);
            this.a = py1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return this.a.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public final /* synthetic */ py1 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(py1 py1Var) {
            super(0);
            this.a = py1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return this.a.getDefaultViewModelCreationExtras();
        }
    }

    public static final class d implements rdd {
        public final /* synthetic */ mie0 a;
        public final /* synthetic */ q8i0 b;

        public d(mie0 mie0Var, q8i0 q8i0Var) {
            this.a = mie0Var;
            this.b = q8i0Var;
        }

        @Override // defpackage.rdd
        public final void onStart(ibs ibsVar) {
            aje0 aje0Var = (aje0) this.b.getValue();
            ej5.c(o8i0.d(aje0Var), null, null, new zie0(aje0Var, this.a, null), 3);
            ibsVar.getLifecycle().d(this);
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public final /* synthetic */ Fragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return this.a.requireActivity().getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public final /* synthetic */ Fragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return this.a.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class g extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ Fragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return this.a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class h implements rdd {
        public final /* synthetic */ mie0 a;
        public final /* synthetic */ q8i0 b;

        public h(mie0 mie0Var, q8i0 q8i0Var) {
            this.a = mie0Var;
            this.b = q8i0Var;
        }

        @Override // defpackage.rdd
        public final void onStart(ibs ibsVar) {
            aje0 aje0Var = (aje0) this.b.getValue();
            ej5.c(o8i0.d(aje0Var), null, null, new zie0(aje0Var, this.a, null), 3);
            ibsVar.getLifecycle().d(this);
        }
    }

    public static final void a(py1 py1Var, mie0 mie0Var) {
        py1Var.getLifecycle().a(new d(mie0Var, new q8i0(jq40.a(aje0.class), new b(py1Var), new a(py1Var), new c(py1Var))));
    }

    public static final void b(Fragment fragment, mie0 mie0Var) {
        fragment.getLifecycle().a(new h(mie0Var, new q8i0(jq40.a(aje0.class), new e(fragment), new g(fragment), new f(fragment))));
    }
}
