package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class hae0 implements anf0<String> {
    public final StringBuilder a;

    public hae0(String str) {
        this.a = new StringBuilder(str);
    }

    @Override // defpackage.anf0
    public final anf0<String> b(String str) {
        this.a.append(str);
        return this;
    }

    @Override // defpackage.anf0
    public final anf0<String> c(Object obj, String str) {
        String string;
        str.getClass();
        if (obj != null && (string = obj.toString()) != null) {
            this.a.append(string);
        }
        return this;
    }

    @Override // defpackage.anf0
    public final String d() {
        return this.a.toString();
    }

    @Override // defpackage.anf0
    public final String e() {
        return this.a.toString();
    }
}
