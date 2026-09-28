package defpackage;

import android.app.Activity;
import android.view.animation.PathInterpolator;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.transition.ChangeBounds;
import androidx.transition.e;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", l = {97}, m = "invokeSuspend")
public final class z5i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ a6i b;
    public final /* synthetic */ Activity c;

    public static final class a implements myh<y5i> {
        public final /* synthetic */ a6i a;

        public a(a6i a6iVar) {
            this.a = a6iVar;
        }

        @Override // defpackage.myh
        public final Object emit(y5i y5iVar, v1b<? super Unit> v1bVar) {
            Unit unit;
            y5i y5iVar2 = y5iVar;
            SlidingPaneLayout.a aVar = this.a.d;
            if (aVar == null) {
                unit = null;
            } else {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.K = y5iVar2;
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.c = 300L;
                changeBounds.d = new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);
                e.a(slidingPaneLayout, changeBounds);
                slidingPaneLayout.requestLayout();
                unit = Unit.a;
            }
            return unit == y5b.a ? unit : Unit.a;
        }
    }

    public static final class b implements lyh<y5i> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ a6i b;

        public static final class a implements myh<b9j0> {
            public final /* synthetic */ myh a;
            public final /* synthetic */ a6i b;

            /* JADX INFO: renamed from: z5i$b$a$a, reason: collision with other inner class name */
            @c0d(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "FoldingFeatureObserver.kt", l = {138}, m = "emit")
            public static final class C1377a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1377a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, a6i a6iVar) {
                this.a = myhVar;
                this.b = a6iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(b9j0 b9j0Var, v1b v1bVar) {
                C1377a c1377a;
                Object next;
                if (v1bVar instanceof C1377a) {
                    c1377a = (C1377a) v1bVar;
                    int i = c1377a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1377a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1377a = new C1377a(v1bVar);
                    }
                } else {
                    c1377a = new C1377a(v1bVar);
                }
                Object obj = c1377a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1377a.b;
                if (i2 == 0) {
                    uj50.b(obj);
                    this.b.getClass();
                    Iterator<T> it = b9j0Var.a.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!(((kse) next) instanceof y5i));
                    y5i y5iVar = next instanceof y5i ? (y5i) next : null;
                    if (y5iVar != null) {
                        c1377a.b = 1;
                        if (this.a.emit(y5iVar, c1377a) == y5bVar) {
                            return y5bVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                return Unit.a;
            }
        }

        public b(lyh lyhVar, a6i a6iVar) {
            this.a = lyhVar;
            this.b = a6iVar;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super y5i> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5i(a6i a6iVar, Activity activity, v1b<? super z5i> v1bVar) {
        super(2, v1bVar);
        this.b = a6iVar;
        this.c = activity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new z5i(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((z5i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a6i a6iVar = this.b;
            lyh lyhVarB = uzh.b(new b(new or60(new e8j0(a6iVar.a, this.c, null)), a6iVar));
            a aVar = new a(a6iVar);
            this.a = 1;
            if (lyhVarB.collect(aVar, this) == y5bVar) {
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
