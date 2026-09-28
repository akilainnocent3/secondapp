package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class bcp extends tcp implements Iterable<tcp> {
    public final ArrayList<tcp> a = new ArrayList<>();

    @Override // defpackage.tcp
    public final boolean a() {
        return i().a();
    }

    @Override // defpackage.tcp
    public final int b() {
        return i().b();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof bcp) && ((bcp) obj).a.equals(this.a);
        }
        return true;
    }

    @Override // defpackage.tcp
    public final String f() {
        return i().f();
    }

    public final void h(tcp tcpVar) {
        if (tcpVar == null) {
            tcpVar = tdp.a;
        }
        this.a.add(tcpVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final tcp i() {
        ArrayList<tcp> arrayList = this.a;
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        ib5.a(hce0.a(size, "Array must have size 1, but has size "));
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<tcp> iterator() {
        return this.a.iterator();
    }
}
