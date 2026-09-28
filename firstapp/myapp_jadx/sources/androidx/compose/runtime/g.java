package androidx.compose.runtime;

import defpackage.dhp;
import defpackage.f8l;
import defpackage.h8l;
import defpackage.ib5;
import defpackage.j1a0;
import defpackage.l00;
import defpackage.lm20;
import defpackage.msw;
import defpackage.nsw;
import defpackage.oma;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g implements oma, Iterable<Object>, dhp {
    public int b;
    public int d;
    public int e;
    public boolean i;
    public int v;
    public HashMap<l00, h8l> y;
    public msw<nsw> z;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public final Object f = new Object();
    public ArrayList<l00> w = new ArrayList<>();

    public final int b(l00 l00Var) {
        if (this.i) {
            c.b("Use active SlotWriter to determine anchor location instead");
        }
        if (!l00Var.a()) {
            lm20.a("Anchor refers to a group that was removed");
        }
        return l00Var.a;
    }

    public final void c() {
        this.y = new HashMap<>();
    }

    public final f d() {
        if (this.i) {
            ib5.a("Cannot read while a writer is pending");
            return null;
        }
        this.e++;
        return new f(this);
    }

    public final h e() {
        if (this.i) {
            c.b("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            c.b("Cannot start a writer when a reader is pending");
        }
        this.i = true;
        this.v++;
        return new h(this);
    }

    public final boolean f(l00 l00Var) {
        int iB;
        return l00Var.a() && (iB = j1a0.b(this.w, l00Var.a, this.b)) >= 0 && Intrinsics.g(this.w.get(iB), l00Var);
    }

    public final h8l h(int i) {
        int i2;
        ArrayList<l00> arrayList;
        int iB;
        HashMap<l00, h8l> map = this.y;
        if (map != null) {
            if (this.i) {
                c.b("use active SlotWriter to crate an anchor for location instead");
            }
            l00 l00Var = (i < 0 || i >= (i2 = this.b) || (iB = j1a0.b((arrayList = this.w), i, i2)) < 0) ? null : arrayList.get(iB);
            if (l00Var != null) {
                return map.get(l00Var);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new f8l(this, 0, this.b);
    }
}
