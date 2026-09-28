package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.f;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pfe0 extends ActionMode {
    public final Context a;
    public final ac b;

    public static class a implements ac.a {
        public final ActionMode.Callback a;
        public final Context b;
        public final ArrayList<pfe0> c = new ArrayList<>();
        public final nj90<Menu, Menu> d = new nj90<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        @Override // ac.a
        public final boolean a(ac acVar, f fVar) {
            pfe0 pfe0VarE = e(acVar);
            nj90<Menu, Menu> nj90Var = this.d;
            Menu gnvVar = nj90Var.get(fVar);
            if (gnvVar == null) {
                gnvVar = new gnv(this.b, fVar);
                nj90Var.put(fVar, gnvVar);
            }
            return this.a.onCreateActionMode(pfe0VarE, gnvVar);
        }

        @Override // ac.a
        public final boolean b(ac acVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(acVar), new kmv(this.b, (tfe0) menuItem));
        }

        @Override // ac.a
        public final void c(ac acVar) {
            this.a.onDestroyActionMode(e(acVar));
        }

        @Override // ac.a
        public final boolean d(ac acVar, Menu menu) {
            pfe0 pfe0VarE = e(acVar);
            nj90<Menu, Menu> nj90Var = this.d;
            Menu gnvVar = nj90Var.get(menu);
            if (gnvVar == null) {
                gnvVar = new gnv(this.b, (rfe0) menu);
                nj90Var.put(menu, gnvVar);
            }
            return this.a.onPrepareActionMode(pfe0VarE, gnvVar);
        }

        public final pfe0 e(ac acVar) {
            ArrayList<pfe0> arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                pfe0 pfe0Var = arrayList.get(i);
                if (pfe0Var != null && pfe0Var.b == acVar) {
                    return pfe0Var;
                }
            }
            pfe0 pfe0Var2 = new pfe0(this.b, acVar);
            arrayList.add(pfe0Var2);
            return pfe0Var2;
        }
    }

    public pfe0(Context context, ac acVar) {
        this.a = context;
        this.b = acVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.c();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new gnv(this.a, this.b.e());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.p(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.n(i);
    }
}
