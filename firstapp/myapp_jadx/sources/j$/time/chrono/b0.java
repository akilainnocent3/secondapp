package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public b0(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objI;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.a;
                objI = a.I(objectInput.readUTF());
                break;
            case 2:
                objI = ((ChronoLocalDate) objectInput.readObject()).M((LocalTime) objectInput.readObject());
                break;
            case 3:
                objI = ((ChronoLocalDateTime) objectInput.readObject()).H((ZoneOffset) objectInput.readObject()).G((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = u.d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                s.d.getClass();
                objI = new u(LocalDate.of(i, b2, b3));
                break;
            case 5:
                v vVar = v.d;
                objI = v.s(objectInput.readByte());
                break;
            case 6:
                l lVar = (l) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                lVar.getClass();
                objI = new n(lVar, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                x.d.getClass();
                objI = new z(LocalDate.of(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                d0.d.getClass();
                objI = new f0(LocalDate.of(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = f.e;
                objI = new f(a.I(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = objI;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((a) obj).r());
                return;
            case 2:
                e eVar = (e) obj;
                objectOutput.writeObject(eVar.a);
                objectOutput.writeObject(eVar.b);
                return;
            case 3:
                i iVar = (i) obj;
                objectOutput.writeObject(iVar.a);
                objectOutput.writeObject(iVar.b);
                objectOutput.writeObject(iVar.c);
                return;
            case 4:
                u uVar = (u) obj;
                uVar.getClass();
                objectOutput.writeInt(uVar.h(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(uVar.h(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(uVar.h(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((v) obj).a);
                return;
            case 6:
                n nVar = (n) obj;
                objectOutput.writeObject(nVar.a);
                objectOutput.writeInt(nVar.h(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(nVar.h(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(nVar.h(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                z zVar = (z) obj;
                zVar.getClass();
                objectOutput.writeInt(zVar.h(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(zVar.h(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(zVar.h(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                objectOutput.writeInt(f0Var.h(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(f0Var.h(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(f0Var.h(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                f fVar = (f) obj;
                objectOutput.writeUTF(fVar.a.r());
                objectOutput.writeInt(fVar.b);
                objectOutput.writeInt(fVar.c);
                objectOutput.writeInt(fVar.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public b0() {
    }
}
