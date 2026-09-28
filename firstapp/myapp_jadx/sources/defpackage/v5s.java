package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v5s implements aqc.e, paj {
    public final /* synthetic */ u5s<Object, Object> a;

    public v5s(u5s<Object, Object> u5sVar) {
        this.a = u5sVar;
    }

    @Override // aqc.e
    public final void a() {
        this.a.c();
    }

    @Override // defpackage.paj
    public final haj<?> c() {
        return new saj(0, this.a, u5s.class, "invalidate", "invalidate()V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof aqc.e) && (obj instanceof paj)) {
            return c().equals(((paj) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }
}
