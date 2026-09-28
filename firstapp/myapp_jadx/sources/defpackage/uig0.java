package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class uig0 implements oug, otk0 {
    public static final uig0 b = new uig0(0);
    public static final /* synthetic */ uig0 c = new uig0(1);
    public final /* synthetic */ int a;

    public /* synthetic */ uig0(int i) {
        this.a = i;
    }

    @Override // defpackage.oug
    public boolean a(m0b m0bVar) {
        return (oqa0.i(m0bVar).b().b().b & 1) != 0;
    }

    @Override // defpackage.oug
    public boolean b(m0b m0bVar) {
        return (oqa0.i(m0bVar).b().b().b & 1) != 0;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "TraceBasedExemplarFilter";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.otk0
    public Object zza() {
        List list = v2l0.a;
        return Integer.valueOf((int) bol0.b.get().i());
    }
}
