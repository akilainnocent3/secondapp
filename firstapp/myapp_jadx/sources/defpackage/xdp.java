package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xdp extends tcp {
    public final hgs<String, tcp> a;

    public xdp() {
        hgs.a aVar = hgs.w;
        this.a = new hgs<>(false);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof xdp) && ((xdp) obj).a.equals(this.a);
        }
        return true;
    }

    public final void h(String str, tcp tcpVar) {
        if (tcpVar == null) {
            tcpVar = tdp.a;
        }
        this.a.put(str, tcpVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(String str, String str2) {
        h(str, str2 == null ? tdp.a : new cep(str2));
    }

    public final tcp j(String str) {
        return this.a.get(str);
    }

    public final xdp k(String str) {
        return (xdp) this.a.get(str);
    }
}
