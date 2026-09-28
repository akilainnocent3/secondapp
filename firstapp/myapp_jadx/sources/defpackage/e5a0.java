package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class e5a0 {

    public static final class a extends e5a0 {
        public final wtw a;

        public a(wtw wtwVar) {
            this.a = wtwVar;
        }

        @Override // defpackage.e5a0
        public final void a() throws d5a0 {
            this.a.c();
            throw new d5a0();
        }
    }

    public abstract void a();

    public static final class b extends e5a0 {
        public static final b a = new b();

        @Override // defpackage.e5a0
        public final void a() {
        }
    }
}
