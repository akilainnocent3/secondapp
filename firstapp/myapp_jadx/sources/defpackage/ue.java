package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class ue implements i1k<se> {
    public final rn8 a;
    public final rn8 b;
    public volatile se c;
    public final Object d = new Object();

    public interface a {
        fmc k0();
    }

    public static final class b extends j8i0 {
        public final gmc a;
        public final zu60 b;

        public b(gmc gmcVar, zu60 zu60Var) {
            this.a = gmcVar;
            this.b = zu60Var;
        }

        @Override // defpackage.j8i0
        public final void onCleared() {
            super.onCleared();
            ((nn50) ((c) jm2.a(this.a, c.class)).b()).a();
        }
    }

    public interface c {
        ve b();
    }

    public ue(rn8 rn8Var) {
        this.a = rn8Var;
        this.b = rn8Var;
    }

    @Override // defpackage.i1k
    public final se generatedComponent() {
        if (this.c == null) {
            synchronized (this.d) {
                try {
                    if (this.c == null) {
                        rn8 rn8Var = this.a;
                        te teVar = new te(this.b);
                        rn8Var.getClass();
                        v8i0 viewModelStore = rn8Var.getViewModelStore();
                        cyb defaultViewModelCreationExtras = rn8Var.getDefaultViewModelCreationExtras();
                        viewModelStore.getClass();
                        defaultViewModelCreationExtras.getClass();
                        s8i0 s8i0Var = new s8i0(viewModelStore, teVar, defaultViewModelCreationExtras);
                        dq7 dq7VarA = jq40.a(b.class);
                        String strI = dq7VarA.i();
                        if (strI == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                        }
                        this.c = ((b) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI))).a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.c;
    }
}
