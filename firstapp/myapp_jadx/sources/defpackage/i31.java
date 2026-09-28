package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i31 {
    public final pcn<j31> a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public i31(pcn<j31> pcnVar) {
        this.a = pcnVar;
        j31.a aVar = j31.a.e;
        this.d = false;
    }

    public final void a() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        int i = 0;
        while (true) {
            pcn<j31> pcnVar = this.a;
            if (i >= pcnVar.size()) {
                break;
            }
            j31 j31Var = pcnVar.get(i);
            j31Var.flush();
            if (j31Var.isActive()) {
                arrayList.add(j31Var);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= b(); i2++) {
            this.c[i2] = ((j31) arrayList.get(i2)).c();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((j31) this.b.get(b())).b() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= b(); i++) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    j31 j31Var = (j31) arrayList.get(i);
                    if (!j31Var.b()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : j31.a;
                        long jRemaining = byteBuffer2.remaining();
                        j31Var.d(byteBuffer2);
                        this.c[i] = j31Var.c();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < b()) {
                        ((j31) arrayList.get(i + 1)).f();
                    }
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i31)) {
            return false;
        }
        pcn<j31> pcnVar = ((i31) obj).a;
        pcn<j31> pcnVar2 = this.a;
        if (pcnVar2.size() != pcnVar.size()) {
            return false;
        }
        for (int i = 0; i < pcnVar2.size(); i++) {
            if (pcnVar2.get(i) != pcnVar.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
