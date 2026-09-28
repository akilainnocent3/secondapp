package defpackage;

/* JADX INFO: loaded from: classes6.dex */
public final class s8h0 implements q8h0 {
    public final int a;

    public s8h0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8h0) && this.a == ((s8h0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return pe4.b(this.a, "TicketDetail(orderBizType=", ")");
    }
}
