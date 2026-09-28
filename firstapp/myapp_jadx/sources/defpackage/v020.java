package defpackage;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class v020 implements r020 {
    public Function1<? super MotionEvent, Boolean> b;
    public ma50 c;
    public boolean d;
    public final b e = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("Unknown", 0);
            a = aVar;
            a aVar2 = new a("Dispatching", 1);
            b = aVar2;
            a aVar3 = new a("NotDispatching", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public static final class b extends t12 {
        public a c;
        public b020 d;

        public static final class a extends qlr implements Function1<MotionEvent, Unit> {
            public final /* synthetic */ v020 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v020 v020Var) {
                super(1);
                this.b = v020Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                int actionMasked = motionEvent2.getActionMasked();
                v020 v020Var = this.b;
                if (actionMasked == 0) {
                    Function1<? super MotionEvent, Boolean> function1 = v020Var.b;
                    if (function1 == null) {
                        Intrinsics.n("onTouchEvent");
                        throw null;
                    }
                    b.this.c = function1.invoke(motionEvent2).booleanValue() ? a.b : a.c;
                } else {
                    Function1<? super MotionEvent, Boolean> function2 = v020Var.b;
                    if (function2 == null) {
                        Intrinsics.n("onTouchEvent");
                        throw null;
                    }
                    function2.invoke(motionEvent2);
                }
                return Unit.a;
            }
        }

        /* JADX INFO: renamed from: v020$b$b, reason: collision with other inner class name */
        public static final class C1194b extends qlr implements Function1<MotionEvent, Unit> {
            public final /* synthetic */ v020 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1194b(v020 v020Var) {
                super(1);
                this.a = v020Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                Function1<? super MotionEvent, Boolean> function1 = this.a.b;
                if (function1 != null) {
                    function1.invoke(motionEvent2);
                    return Unit.a;
                }
                Intrinsics.n("onTouchEvent");
                throw null;
            }
        }

        public b() {
            super(2);
            this.c = a.a;
        }

        public final void h(b020 b020Var, boolean z) {
            List<m020> list = b020Var.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (list.get(i).b()) {
                    l(b020Var);
                    return;
                }
            }
            ywx ywxVar = (ywx) this.b;
            if (ywxVar == null) {
                ib5.a("layoutCoordinates not set");
                return;
            }
            long jI0 = ywxVar.i0(0L);
            v020 v020Var = v020.this;
            z020.a(b020Var, jI0, new a(v020Var), false);
            if (this.c == a.b) {
                if (z) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        list.get(i2).a();
                    }
                }
                czo czoVar = b020Var.b;
                if (czoVar != null) {
                    czoVar.c = !v020Var.d;
                }
            }
        }

        public final void l(b020 b020Var) {
            if (this.c == a.b) {
                ywx ywxVar = (ywx) this.b;
                if (ywxVar == null) {
                    ib5.a("layoutCoordinates not set");
                    return;
                }
                z020.a(b020Var, ywxVar.i0(0L), new C1194b(v020.this), true);
            }
            this.c = a.c;
        }
    }

    @Override // defpackage.r020
    public final b t() {
        return this.e;
    }
}
