package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class tm80 implements pdd0 {
    public final String a = "sporty_pin__create_pin__click";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tm80) && this.a.equals(((tm80) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SportyPinCreatePinClickEvent(name=", this.a, ")");
    }
}
