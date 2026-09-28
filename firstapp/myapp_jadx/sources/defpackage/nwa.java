package defpackage;

import androidx.compose.ui.d;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class nwa extends iwa {
    public b e;
    public int f;
    public final ArrayList<cwa> g;

    public static final class a extends t12 implements gsz {
        public final cwa c;
        public final Function1<bwa, Unit> d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(cwa cwaVar, Function1<? super bwa, Unit> function1) {
            super(gnn.a);
            this.c = cwaVar;
            this.d = function1;
        }

        public final boolean equals(Object obj) {
            a aVar = obj instanceof a ? (a) obj : null;
            return this.d == (aVar != null ? aVar.d : null);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // defpackage.gsz
        public final Object v() {
            return new mwa(this.c, this.d);
        }
    }

    public final class b {
        public b() {
        }
    }

    public nwa() {
        super(0);
        this.f = 0;
        this.g = new ArrayList<>();
    }

    public static d d(d dVar, cwa cwaVar, Function1 function1) {
        return dVar.n(new a(cwaVar, function1));
    }

    public final cwa e() {
        int i = this.f;
        this.f = i + 1;
        ArrayList<cwa> arrayList = this.g;
        cwa cwaVar = (cwa) CollectionsKt.V(i, arrayList);
        if (cwaVar != null) {
            return cwaVar;
        }
        cwa cwaVar2 = new cwa(Integer.valueOf(this.f));
        arrayList.add(cwaVar2);
        return cwaVar2;
    }

    public final b f() {
        b bVar = this.e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        this.e = bVar2;
        return bVar2;
    }

    public final void g() {
        this.a.e.clear();
        this.d = this.c;
        this.b = 0;
        this.f = 0;
    }
}
