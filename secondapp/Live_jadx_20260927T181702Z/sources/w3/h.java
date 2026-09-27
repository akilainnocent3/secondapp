package w3;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f142179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f142180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<c> f142181d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends c {
        public a() {
        }

        @Override // w3.h.c
        public void c(h hVar) {
            if (hVar.h()) {
                h.this.t(this);
                h.this.q();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends i.a {
        public b() {
        }

        @Override // w3.i.a
        public void a() {
            h.this.u(null);
        }

        @Override // w3.i.a
        public void b() {
            h.this.l();
        }

        @Override // w3.i.a
        public void c() {
            h.this.m();
        }

        @Override // w3.i.a
        public void d() {
            h.this.n();
        }

        @Override // w3.i.a
        public void e() {
            h.this.o();
        }
    }

    public h(Context context) {
        this.f142179b = context;
    }

    public void c(c cVar) {
        if (this.f142181d == null) {
            this.f142181d = new ArrayList<>();
        }
        this.f142181d.add(cVar);
    }

    public Context d() {
        return this.f142179b;
    }

    public i e() {
        return this.f142180c;
    }

    @SuppressLint({"NullableCollection"})
    public List<c> f() {
        if (this.f142181d == null) {
            return null;
        }
        return new ArrayList(this.f142181d);
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return true;
    }

    @k.i
    public void j(i iVar) {
        this.f142180c = iVar;
        iVar.l(new b());
    }

    @k.i
    public void k() {
        i iVar = this.f142180c;
        if (iVar != null) {
            iVar.l(null);
            this.f142180c = null;
        }
    }

    public void r() {
        if (h()) {
            q();
        } else {
            c(new a());
        }
    }

    public void t(c cVar) {
        ArrayList<c> arrayList = this.f142181d;
        if (arrayList != null) {
            arrayList.remove(cVar);
        }
    }

    public final void u(i iVar) {
        i iVar2 = this.f142180c;
        if (iVar2 == iVar) {
            return;
        }
        if (iVar2 != null) {
            iVar2.c(null);
        }
        this.f142180c = iVar;
        if (iVar != null) {
            iVar.c(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class c {
        public void a(h hVar) {
        }

        public void b(h hVar) {
        }

        public void c(h hVar) {
        }
    }

    public void i() {
    }

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
    }

    public void q() {
    }

    public void s() {
    }
}
