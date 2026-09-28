package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h9i0 {
    public Interpolator c;
    public i9i0 d;
    public boolean e;
    public long b = -1;
    public final a f = new a();
    public final ArrayList<g9i0> a = new ArrayList<>();

    public class a extends j9i0 {
        public boolean a = false;
        public int b = 0;

        public a() {
        }

        @Override // defpackage.i9i0
        public final void a() {
            int i = this.b + 1;
            this.b = i;
            h9i0 h9i0Var = h9i0.this;
            if (i == h9i0Var.a.size()) {
                i9i0 i9i0Var = h9i0Var.d;
                if (i9i0Var != null) {
                    i9i0Var.a();
                }
                this.b = 0;
                this.a = false;
                h9i0Var.e = false;
            }
        }

        @Override // defpackage.j9i0, defpackage.i9i0
        public final void c() {
            if (this.a) {
                return;
            }
            this.a = true;
            i9i0 i9i0Var = h9i0.this.d;
            if (i9i0Var != null) {
                i9i0Var.c();
            }
        }
    }

    public final void a() {
        if (this.e) {
            ArrayList<g9i0> arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                g9i0 g9i0Var = arrayList.get(i);
                i++;
                g9i0Var.b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        ArrayList<g9i0> arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            g9i0 g9i0Var = arrayList.get(i);
            i++;
            g9i0 g9i0Var2 = g9i0Var;
            long j = this.b;
            if (j >= 0) {
                g9i0Var2.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = g9i0Var2.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                g9i0Var2.d(this.f);
            }
            View view2 = g9i0Var2.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
