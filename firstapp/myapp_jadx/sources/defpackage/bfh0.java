package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bfh0<Model> implements i2w<Model, Model> {
    public static final bfh0<?> a = new bfh0<>();

    public static class a<Model> implements j2w<Model, Model> {
        public static final a<?> a = new a<>();

        @Override // defpackage.j2w
        public final i2w<Model, Model> c(wjw wjwVar) {
            return bfh0.a;
        }
    }

    @Override // defpackage.i2w
    public final i2w.a<Model> a(Model model, int i, int i2, s2z s2zVar) {
        return new i2w.a<>(new acy(model), new b(model));
    }

    @Override // defpackage.i2w
    public final boolean b(Model model) {
        return true;
    }

    public static class b<Model> implements cpc<Model> {
        public final Model a;

        public b(Model model) {
            this.a = model;
        }

        @Override // defpackage.cpc
        public final Class<Model> a() {
            return (Class<Model>) this.a.getClass();
        }

        @Override // defpackage.cpc
        public final void d(lw20 lw20Var, cpc.a<? super Model> aVar) {
            aVar.f(this.a);
        }

        @Override // defpackage.cpc
        public final cqc e() {
            return cqc.a;
        }

        @Override // defpackage.cpc
        public final void b() {
        }

        @Override // defpackage.cpc
        public final void cancel() {
        }
    }
}
