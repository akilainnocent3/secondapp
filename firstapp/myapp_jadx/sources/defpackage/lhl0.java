package defpackage;

import defpackage.lhl0;
import defpackage.thl0;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class lhl0<MessageType extends thl0<MessageType, BuilderType>, BuilderType extends lhl0<MessageType, BuilderType>> extends zdl0<MessageType, BuilderType> {
    public final thl0 a;
    public thl0 b;

    public lhl0(MessageType messagetype) {
        this.a = messagetype;
        if (messagetype.g()) {
            hb5.a("Default instance must be immutable.");
            throw null;
        }
        this.b = (thl0) messagetype.p(4);
    }

    public final void g() {
        if (this.b.g()) {
            return;
        }
        thl0 thl0Var = (thl0) this.a.p(4);
        cll0.c.a(thl0Var.getClass()).d(thl0Var, this.b);
        this.b = thl0Var;
    }

    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final lhl0 clone() {
        lhl0 lhl0Var = (lhl0) this.a.p(5);
        boolean zG = this.b.g();
        thl0 thl0Var = this.b;
        if (zG) {
            thl0Var.i();
            thl0Var = this.b;
        }
        lhl0Var.b = thl0Var;
        return lhl0Var;
    }

    public final MessageType i() {
        boolean zG = this.b.g();
        MessageType messagetype = (MessageType) this.b;
        if (zG) {
            messagetype.i();
            messagetype = (MessageType) this.b;
        }
        messagetype.getClass();
        boolean zE = true;
        byte bByteValue = ((Byte) messagetype.p(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zE = false;
            } else {
                zE = cll0.c.a(messagetype.getClass()).e(messagetype);
                messagetype.p(2);
            }
        }
        if (zE) {
            return messagetype;
        }
        throw new fml0("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void j(thl0 thl0Var) {
        thl0 thl0Var2 = this.a;
        if (thl0Var2.equals(thl0Var)) {
            return;
        }
        if (!this.b.g()) {
            thl0 thl0Var3 = (thl0) thl0Var2.p(4);
            cll0.c.a(thl0Var3.getClass()).d(thl0Var3, this.b);
            this.b = thl0Var3;
        }
        thl0 thl0Var4 = this.b;
        cll0.c.a(thl0Var4.getClass()).d(thl0Var4, thl0Var);
    }

    public final void k(byte[] bArr, int i, dgl0 dgl0Var) throws oil0 {
        if (!this.b.g()) {
            thl0 thl0Var = (thl0) this.a.p(4);
            cll0.c.a(thl0Var.getClass()).d(thl0Var, this.b);
            this.b = thl0Var;
        }
        try {
            cll0.c.a(this.b.getClass()).g(this.b, bArr, 0, i, new iel0(dgl0Var));
        } catch (IndexOutOfBoundsException unused) {
            hrh.b("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (oil0 e) {
            throw e;
        } catch (IOException e2) {
            jk40.a("Reading from byte array should not throw IOException.", e2);
        }
    }
}
