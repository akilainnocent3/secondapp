package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class bx0 implements m0b {
    public static final bx0 b = new bx0(new Object[0]);
    public final Object[] a;

    public bx0(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.m0b
    public final bx0 a(nbd nbdVar, Object obj) {
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 2);
                objArrCopyOf[objArrCopyOf.length - 2] = nbdVar;
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                return new bx0(objArrCopyOf);
            }
            if (objArr[i] == nbdVar) {
                int i2 = i + 1;
                if (objArr[i2] == obj) {
                    return this;
                }
                Object[] objArr2 = (Object[]) objArr.clone();
                objArr2[i2] = obj;
                return new bx0(objArr2);
            }
            i += 2;
        }
    }

    @Override // defpackage.m0b
    public final <V> V b(nbd nbdVar) {
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                return null;
            }
            if (objArr[i] == nbdVar) {
                return (V) objArr[i + 1];
            }
            i += 2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while (true) {
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                break;
            }
            sb.append(objArr[i]);
            sb.append('=');
            sb.append(objArr[i + 1]);
            sb.append(", ");
            i += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append('}');
        return sb.toString();
    }
}
