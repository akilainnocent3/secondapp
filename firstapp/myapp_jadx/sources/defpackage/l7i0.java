package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class l7i0 {

    public static final class a implements View.OnAttachStateChangeListener {
        public final View a;
        public j1b b;
        public final ArrayList c = new ArrayList();

        /* JADX INFO: renamed from: l7i0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.commons.utils.ViewExtensions$ViewAttachedListener$onViewAttachedToWindow$1$1", f = "ViewExtensions.kt", l = {24}, m = "invokeSuspend", v = 1)
        public static final class C0805a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function1<v1b<? super Unit>, Object> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0805a(Function1<? super v1b<? super Unit>, ? extends Object> function1, v1b<? super C0805a> v1bVar) {
                super(2, v1bVar);
                this.b = function1;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0805a(this.b, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0805a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.a = 1;
                    if (this.b.invoke(this) == y5bVar) {
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

        public a(View view) {
            this.a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getClass();
            pfd pfdVar = fse.a;
            this.b = w5b.a(gku.a);
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Function1 function1 = (Function1) obj;
                j1b j1bVar = this.b;
                if (j1bVar != null) {
                    ej5.c(j1bVar, null, null, new C0805a(function1, null), 3);
                }
            }
            arrayList.clear();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            view.getClass();
            j1b j1bVar = this.b;
            if (j1bVar != null) {
                w5b.c(j1bVar, null);
            }
            this.b = null;
        }
    }

    @c0d(c = "com.sportygames.commons.utils.ViewExtensions$launchWhenAttached$1", f = "ViewExtensions.kt", l = {68}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function1<v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Function2<Object, v1b<? super Unit>, Object> b;
        public final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<Object, ? super v1b<? super Unit>, ? extends Object> function2, Object obj, v1b<? super b> v1bVar) {
            super(1, v1bVar);
            this.b = function2;
            this.c = obj;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View, java.lang.Object] */
        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return new b(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((b) create(v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (this.b.invoke(this.c, this) == y5bVar) {
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

    public static void a(ImageView imageView) {
        imageView.getClass();
        Object tag = imageView.getTag(R.id.coroutine_view_attached_listener);
        a aVar = tag instanceof a ? (a) tag : null;
        if (aVar != null) {
            aVar.c.clear();
            j1b j1bVar = aVar.b;
            if (j1bVar == null || !w5b.e(j1bVar)) {
                j1b j1bVar2 = aVar.b;
                if (j1bVar2 != null) {
                    w5b.c(j1bVar2, null);
                }
                aVar.b = null;
            } else {
                j1b j1bVar3 = aVar.b;
                if (j1bVar3 != null) {
                    w5b.c(j1bVar3, null);
                }
                pfd pfdVar = fse.a;
                aVar.b = w5b.a(gku.a);
            }
            Unit unit = Unit.a;
        }
    }

    public static void b(View view, Function2 function2) {
        Object tag = view.getTag(R.id.coroutine_view_attached_listener);
        a aVar = tag instanceof a ? (a) tag : null;
        if (aVar == null) {
            aVar = new a(view);
            view.addOnAttachStateChangeListener(aVar);
            view.setTag(R.id.coroutine_view_attached_listener, aVar);
        }
        b bVar = new b(function2, view, null);
        j1b j1bVar = aVar.b;
        if (j1bVar != null) {
            if (!aVar.a.isAttachedToWindow() || !w5b.e(j1bVar)) {
                j1bVar = null;
            }
            if (j1bVar != null) {
                ej5.c(j1bVar, null, null, new k7i0(bVar, null), 3);
                return;
            }
        }
        aVar.c.add(bVar);
    }
}
