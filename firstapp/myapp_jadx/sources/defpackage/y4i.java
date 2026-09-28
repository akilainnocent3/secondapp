package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class y4i implements v4i {
    public boolean a;
    public b5i b;
    public b5i c;
    public b5i d;
    public b5i e;
    public b5i f;
    public b5i g;
    public b5i h;
    public b5i i;
    public Function1<? super u3i, Unit> j;
    public Function1<? super u3i, Unit> k;

    @Override // defpackage.v4i
    public final void a(b4i.a aVar) {
        this.j = aVar;
    }

    @Override // defpackage.v4i
    public final void b(boolean z) {
        this.a = z;
    }

    @Override // defpackage.v4i
    public final void c(b4i.b bVar) {
        this.k = bVar;
    }

    @Override // defpackage.v4i
    public final boolean d() {
        return this.a;
    }
}
