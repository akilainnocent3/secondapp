package defpackage;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class xb0 implements oef0 {
    public final View a;
    public final Function1<fdf0, fdf0> b;
    public final Function0<urr> c;
    public final puw d = new puw();
    public final r6a0 e = new r6a0(new nb0(this, 0));
    public final ob0 f = new Function1() { // from class: ob0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ActionMode actionMode = this.a.h;
            if (actionMode != null) {
                actionMode.invalidate();
            }
            return Unit.a;
        }
    };
    public final pb0 g = new Function1() { // from class: pb0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ActionMode actionMode = this.a.h;
            if (actionMode != null) {
                actionMode.invalidateContentRect();
            }
            return Unit.a;
        }
    };
    public ActionMode h;
    public yb0 i;

    public static final class a implements fdf0 {
        public final b a;
        public final qb0 b;
        public final rb0 c;
        public final View d;

        public a(b bVar, qb0 qb0Var, rb0 rb0Var, View view) {
            this.a = bVar;
            this.b = qb0Var;
            this.c = rb0Var;
            this.d = view;
        }

        @Override // defpackage.fdf0
        public final lk40 a() {
            return (lk40) this.c.invoke();
        }

        @Override // defpackage.fdf0
        public final boolean b(Menu menu) {
            e(menu);
            return menu.size() > 0;
        }

        @Override // defpackage.fdf0
        public final void c() {
            this.a.close();
        }

        @Override // defpackage.fdf0
        public final boolean d(Menu menu) {
            return e(menu);
        }

        public final boolean e(Menu menu) {
            int i;
            aef0 aef0Var = (aef0) this.b.invoke();
            if (Intrinsics.g(aef0Var, null)) {
                return false;
            }
            menu.clear();
            List<ydf0> list = aef0Var.a;
            int size = list.size();
            int i2 = 1;
            int i3 = 1;
            for (int i4 = 0; i4 < size; i4++) {
                ydf0 ydf0Var = list.get(i4);
                if (ydf0Var instanceof ief0) {
                    i = i2 + 1;
                    final ief0 ief0Var = (ief0) ydf0Var;
                    MenuItem menuItemAdd = menu.add(i3, i2, i2, ief0Var.b);
                    menuItemAdd.setShowAsAction(2);
                    menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: wb0
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            ief0Var.d.invoke(this.a);
                            return true;
                        }
                    });
                } else {
                    if (ydf0Var instanceof uef0) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            i = i2 + 1;
                            uef0 uef0Var = (uef0) ydf0Var;
                            mmf0.a(menu, i2, this.d.getContext(), uef0Var.b, uef0Var.c);
                        }
                    } else if (ydf0Var instanceof sef0) {
                        i3++;
                    }
                }
                i2 = i;
            }
            return true;
        }
    }

    public static final class b implements tef0 {
        public final tb5 a = d77.b(0, 7, null);

        @Override // defpackage.tef0
        public final void close() {
            this.a.c(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [ob0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [pb0] */
    public xb0(View view, Function1<? super fdf0, ? extends fdf0> function1, Function0<? extends urr> function0) {
        this.a = view;
        this.b = function1;
        this.c = function0;
    }

    @Override // defpackage.oef0
    public final Object a(bef0 bef0Var, tje0 tje0Var) {
        Object objA = puw.a(this.d, new zb0(this, bef0Var, null), tje0Var);
        return objA == y5b.a ? objA : Unit.a;
    }
}
