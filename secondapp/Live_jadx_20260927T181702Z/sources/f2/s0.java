package f2;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.s1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class s0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements zu.m<MenuItem> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Menu f82558a;

        public a(Menu menu) {
            this.f82558a = menu;
        }

        @Override // zu.m
        @oy.l
        public Iterator<MenuItem> iterator() {
            return s0.i(this.f82558a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @kotlin.jvm.internal.s1({"SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n+ 2 Menu.kt\nandroidx/core/view/MenuKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n83#2:91\n1#3:92\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt$iterator$1\n*L\n74#1:91\n74#1:92\n*E\n"})
    public static final class b implements Iterator<MenuItem>, es.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f82559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Menu f82560c;

        public b(Menu menu) {
            this.f82560c = menu;
        }

        @Override // java.util.Iterator
        @oy.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f82560c;
            int i10 = this.f82559b;
            this.f82559b = i10 + 1;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f82559b < this.f82560c.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            dr.w2 w2Var;
            Menu menu = this.f82560c;
            int i10 = this.f82559b - 1;
            this.f82559b = i10;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                menu.removeItem(item.getItemId());
                w2Var = dr.w2.f79517a;
            } else {
                w2Var = null;
            }
            if (w2Var == null) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public static final boolean a(@oy.l Menu menu, @oy.l MenuItem menuItem) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (kotlin.jvm.internal.m0.g(menu.getItem(i10), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void b(@oy.l Menu menu, @oy.l ds.l<? super MenuItem, dr.w2> lVar) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            lVar.invoke(menu.getItem(i10));
        }
    }

    public static final void c(@oy.l Menu menu, @oy.l ds.p<? super Integer, ? super MenuItem, dr.w2> pVar) {
        int size = menu.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.invoke(Integer.valueOf(i10), menu.getItem(i10));
        }
    }

    @oy.l
    public static final MenuItem d(@oy.l Menu menu, int i10) {
        return menu.getItem(i10);
    }

    @oy.l
    public static final zu.m<MenuItem> e(@oy.l Menu menu) {
        return new a(menu);
    }

    public static final int f(@oy.l Menu menu) {
        return menu.size();
    }

    public static final boolean g(@oy.l Menu menu) {
        return menu.size() == 0;
    }

    public static final boolean h(@oy.l Menu menu) {
        return menu.size() != 0;
    }

    @oy.l
    public static final Iterator<MenuItem> i(@oy.l Menu menu) {
        return new b(menu);
    }

    public static final void j(@oy.l Menu menu, @oy.l MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void k(@oy.l Menu menu, int i10) {
        dr.w2 w2Var;
        MenuItem item = menu.getItem(i10);
        if (item != null) {
            menu.removeItem(item.getItemId());
            w2Var = dr.w2.f79517a;
        } else {
            w2Var = null;
        }
        if (w2Var == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
