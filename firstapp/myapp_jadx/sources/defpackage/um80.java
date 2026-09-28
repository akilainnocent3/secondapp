package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class um80 implements pdd0 {
    public final String a = "sporty_pin__pin_enabled__click";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof um80) && this.a.equals(((um80) obj).a);
    }

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tug.a("SportyPinPinEnabledClickEvent(name=", this.a, ")");
    }
}
