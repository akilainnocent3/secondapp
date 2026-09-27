package androidx.databinding;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends androidx.databinding.a {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends u.a {
        public a() {
        }

        @Override // androidx.databinding.u.a
        public void e(u uVar, int i10) {
            b.this.g();
        }
    }

    public b() {
    }

    public b(u... uVarArr) {
        if (uVarArr == null || uVarArr.length == 0) {
            return;
        }
        a aVar = new a();
        for (u uVar : uVarArr) {
            uVar.a(aVar);
        }
    }
}
